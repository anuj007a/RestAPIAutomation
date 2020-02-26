package com.anuj.base;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MasterLogger {
    private static Logger log = null;

    private MasterLogger() {

    }

    public static Logger getInstance() {
        if (log == null) {
            log = LogManager.getLogger(MasterLogger.class);
        }
        return log;
    }

}