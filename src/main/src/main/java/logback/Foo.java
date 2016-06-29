package logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by HUANGZHIJIANG416 on 2016/6/29.
 */
public class Foo {
    static final Logger LOGGER = LoggerFactory.getLogger(Foo.class);

    public void doIt(){
        LOGGER.debug("Did it again!");
    }
}
