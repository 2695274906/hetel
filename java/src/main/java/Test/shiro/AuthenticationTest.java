package Test.shiro;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.mgt.DefaultSecurityManager;
import org.apache.shiro.realm.SimpleAccountRealm;
import org.apache.shiro.subject.Subject;
import org.junit.Before;
import org.junit.Test;


/**
 * @auther xiehuaxin
 * @create 2018-07-02 14:06
 * @todo 创建一个测试类，测试认证
 */
public class AuthenticationTest {

    //除了SimpleAccountRealm还有JdbcRealm等
    SimpleAccountRealm simpleAccountRealm = new SimpleAccountRealm();

    //在认证之前先在Realm中添加一个用户，创建Security Manager的时候要用到Realm
    @Before
    public void addUser() {
        simpleAccountRealm.addAccount("xiehuaxin","123456");
    }


    @Test
    public void testAutentication() {
        //1.构建Security Manager环境（Security Manager是用来提供安全服务的，所以在做shiro认证的时候要先创建此对象,创建Security Manager对象之后要设置Realm）
        DefaultSecurityManager defaultSecurityManager = new DefaultSecurityManager();
        defaultSecurityManager.setRealm(simpleAccountRealm); //相当于与realm进行绑定

        //2.获取向Security Manager提交请求的subject，而主体subject可以通过shiro提供的一个工具类SecurityUtils来获取
        SecurityUtils.setSecurityManager(defaultSecurityManager);//使用SecurityUtils之前要设置Security Manager环境
        Subject subject = SecurityUtils.getSubject();

        //3.主体Subject提交请求给Security Manager -->  subject.login(token);
        UsernamePasswordToken token = new UsernamePasswordToken("xiehuaxin","123456");//提交请求时需要一个token，所以要先创建token
        subject.login(token);

        //4. shiro提供了一个检查主体subject是否认证的方法isAuthenticated(),此方法的返回结果是一个boolean值
        System.out.println(subject.isAuthenticated());

        subject.logout();
        System.out.println(subject.isAuthenticated());

    }
}
