package redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.io.IOException;

public class RedisSubscribeConfig {

    /*Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ThreadPoolTaskExecutor asyncServiceExecutor;
    @Override
    public void run(String... args) throws Exception {
        asyncServiceExecutor.execute(new Runnable() {
            @Override
            public void run() {
                logger.info("开始监听redis pub");
                redisCacheService.subscribe(new JedisPubSub() {
                    @Override
                    public void onMessage(String channel, String message) {
                        logger.info("配置修改：{},从新初始化定时任务！", message);
                        serviceConfigParamInit.initJob();
                    }
                }, EnumConstants.RedisKeyEnum.DMM_RELOAD_JOB_PUB_SUB.getValue());
            }
        });

//全国告警态势的订阅者配置信息
  asyncServiceExecutor.execute(new Runnable() {
        @Override
        public void run() {
            logger.info("开始监听全国告警态势");
            redisCacheService.subscribe(new JedisPubSub() {
                @Override
                public void onMessage(String channel, String message) {
                    logger.info("全国告警态势信息：{}", message);
                    Map<String,Session> sessionMap = MapAlarmInfosEndpoint.getConnetionMap();
                    if(!sessionMap.isEmpty()){
                        Collection<Session> sessions = sessionMap.values();

                        for(Session session : sessions){
                            try{
                                session.getBasicRemote().sendText(message);
                            }catch(IOException e){
                                logger.info("session:"+session+",发送失败",e);
                            }
                        }
                    }
                }
            }, EnumConstants.MapAlarmInfo.QUERY_CHANNEL.getValue());
        }
    });*/
}
