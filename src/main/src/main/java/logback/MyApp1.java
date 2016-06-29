package logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by HUANGZHIJIANG416 on 2016/6/29.
 */
public class MyApp1 {
    final static Logger LOGGER = LoggerFactory.getLogger(MyApp1.class);

    public static void main(String[] args) {
        LOGGER.info("Entering application!");

        Foo foo = new Foo();
        foo.doIt();
        LOGGER.info("Exiting application.");
    }
}
