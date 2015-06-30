package com.jim.demo;

import org.apache.log4j.Logger;

/**
 * Created by qiao on 15/6/30.
 */
public class Goodbaby {
    public static final Logger logger = Logger.getLogger(Goodbaby.class);

    public void init() {
        logger.info("Run method init in goodbaby class");
    }
}
