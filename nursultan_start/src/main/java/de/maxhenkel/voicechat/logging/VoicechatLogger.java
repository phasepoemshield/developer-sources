/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.logging;

import de.maxhenkel.voicechat.logging.LogLevel;

public interface VoicechatLogger {
    default public void fatal(String string, Object ... objectArray) {
        this.log(LogLevel.FATAL, string, objectArray);
    }

    public void log(LogLevel var1, String var2, Object ... var3);

    public boolean isEnabled(LogLevel var1);

    default public void info(String string, Object ... objectArray) {
        this.log(LogLevel.INFO, string, objectArray);
    }

    default public void trace(String string, Object ... objectArray) {
        this.log(LogLevel.TRACE, string, objectArray);
    }

    default public void debug(String string, Object ... objectArray) {
        this.log(LogLevel.DEBUG, string, objectArray);
    }

    default public void error(String string, Object ... objectArray) {
        this.log(LogLevel.ERROR, string, objectArray);
    }

    default public void warn(String string, Object ... objectArray) {
        this.log(LogLevel.WARN, string, objectArray);
    }
}

