import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Created by HUANGZHIJIANG416 on 2016/6/29.
 */
public class HelloWorld2 {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("HelloWorld2");
        Logger logger1 = LoggerFactory.getLogger("HelloWorld2");

        //Calling the LoggerFactory.getLogger method with the same name
        // will always return a reference to the exact same logger object.
        System.out.println(logger==logger1);

        String[] strings = {"AA","BB","CC"};
        logger.debug("values:{},{},{}",strings);

        logger.debug("hello world");

        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        StatusPrinter.print(lc);
    }
}
