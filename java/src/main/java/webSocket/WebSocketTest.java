package webSocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@ServerEndpoint(value= "/v2/ws/machineInspectionEndpoint")
//@ServerEndpoint(value= "v2"+"/ws/machineInspectionEndpoint",encoders={})
@Component
public class WebSocketTest {

    Logger logger = LoggerFactory.getLogger(WebSocketTest.class);
    /**
     * SESSIONMAP
     * key:logId
     * value:
     * key:sessionId
     * <p>
     * CACHEMAP
     * key: sessionId
     * value: logId
     */
    final static Map<String, Map<String, Session>> SESSIONMAP = new ConcurrentHashMap<>();
    private final Map<String, String> CACHEMAP = new ConcurrentHashMap();

    @OnClose
    public void onClose(Session session) {
        logger.info("巡检查询websokcet链接关闭");
        String sessionId = session.getId();
        String logId = CACHEMAP.get(sessionId);
        Map<String, Session> mapSession = SESSIONMAP.get(logId);
        mapSession.remove(sessionId);
    }

    /**
     * 收到客户端消息后调用的方法
     *
     * @param session
     * @param logId   客户端传送过来的日志id
     */
    @OnMessage
    public void onMsg(Session session, String logId) {
        CACHEMAP.put(session.getId(), logId);
        Map<String, Session> mapSession = SESSIONMAP.get(logId);
        if (mapSession == null) {
            mapSession = new ConcurrentHashMap<>();
            SESSIONMAP.put(session.getId(), mapSession);
        }
        mapSession.put(session.getId(), session);
    }

    /**
     * 获取已经链接的websocket的列表
     *
     * @return
     */
    public static Map<String, Map<String, Session>> getConnetionMap() {
        return SESSIONMAP;
    }
}
