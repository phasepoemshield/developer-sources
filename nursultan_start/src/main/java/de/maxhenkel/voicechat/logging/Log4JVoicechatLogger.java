/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  org.apache.logging.log4j.Level
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.apache.logging.log4j.core.Appender
 *  org.apache.logging.log4j.core.Logger
 *  org.apache.logging.log4j.core.config.Configurator
 *  org.apache.logging.log4j.util.StackLocatorUtil
 */
package de.maxhenkel.voicechat.logging;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.logging.LogLevel;
import de.maxhenkel.voicechat.logging.VoicechatLogger;
import java.util.Map;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.Appender;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.util.StackLocatorUtil;

public class Log4JVoicechatLogger
implements VoicechatLogger {
    private final boolean debugMode;
    private final Logger logger;

    public Log4JVoicechatLogger(Logger logger) {
        this.logger = logger;
        this.debugMode = Voicechat.debugMode();
        try {
            if (this.debugMode) {
                this.initDebugLogLevel();
            }
        }
        catch (Throwable throwable) {
            logger.error("Failed to set log level", throwable);
        }
    }

    public Log4JVoicechatLogger(String string) {
        this(LogManager.getLogger((String)string));
    }

    @Override
    public void log(LogLevel logLevel, String string, Object ... objectArray) {
        if (!this.isEnabled(logLevel)) {
            return;
        }
        this.logger.log(this.fromLogLevel(logLevel), this.modifyMessage(string), objectArray);
    }

    @Override
    public boolean isEnabled(LogLevel logLevel) {
        return this.logger.isEnabled(this.fromLogLevel(logLevel));
    }

    public Logger getLogger() {
        return this.logger;
    }

    private void initDebugLogLevel() throws Exception {
        if (!(this.logger instanceof org.apache.logging.log4j.core.Logger)) {
            throw new IllegalStateException("Logger is not an instance of org.apache.logging.log4j.core.Logger");
        }
        org.apache.logging.log4j.core.Logger logger = (org.apache.logging.log4j.core.Logger)this.logger;
        Map map = logger.getAppenders();
        logger.setAdditive(false);
        Configurator.setLevel((Logger)this.logger, (Level)Level.DEBUG);
        for (Appender appender : map.values()) {
            logger.addAppender(appender);
        }
    }

    private Level fromLogLevel(LogLevel logLevel) {
        switch (logLevel) {
            case TRACE: {
                return Level.TRACE;
            }
            case DEBUG: {
                return Level.DEBUG;
            }
            case WARN: {
                return Level.WARN;
            }
            case ERROR: {
                return Level.ERROR;
            }
            case FATAL: {
                return Level.FATAL;
            }
        }
        return Level.INFO;
    }

    private String modifyMessage(String string) {
        if (this.debugMode) {
            return String.format("[%s/%s] %s", this.logger.getName(), StackLocatorUtil.getCallerClass((int)4).getSimpleName(), string);
        }
        return String.format("[%s] %s", this.logger.getName(), string);
    }
}

