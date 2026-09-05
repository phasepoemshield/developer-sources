/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.irisshaders.iris;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IrisLogging {
    public static final boolean ENABLE_SPAM = false;
    private final Logger logger;

    public void fatal(String string, Throwable throwable) {
        this.logger.error(LogUtils.FATAL_MARKER, string, throwable);
    }

    public void fatal(String string) {
        this.logger.error(LogUtils.FATAL_MARKER, string);
    }

    public IrisLogging(String string) {
        this.logger = LoggerFactory.getLogger((String)string);
    }

    public void info(String string, Object ... objectArray) {
        this.logger.info(string, objectArray);
    }

    public void info(String string) {
        this.logger.info(string);
    }

    public void debug(String string, Throwable throwable) {
        this.logger.debug(string, throwable);
    }

    public void debug(String string) {
        this.logger.debug(string);
    }

    public void error(String string, Object ... objectArray) {
        this.logger.error(string, objectArray);
    }

    public void error(String string) {
        this.logger.error(string);
    }

    public void error(String string, Throwable throwable) {
        this.logger.error(string, throwable);
    }

    public void warn(String string, Object ... objectArray) {
        this.logger.warn(string, objectArray);
    }

    public void warn(String string) {
        this.logger.warn(string);
    }

    public void warn(Throwable throwable) {
        this.logger.warn("", throwable);
    }

    public void warn(String string, Throwable throwable) {
        this.logger.warn(string, throwable);
    }
}

