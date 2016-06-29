package logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by HUANGZHIJIANG416 on 2016/6/29.
 */
public class HelloWorld1 {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("HelloWorld!");
        logger.debug("Hello World");
    }
}
