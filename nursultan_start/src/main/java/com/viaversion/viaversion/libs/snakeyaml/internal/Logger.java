/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.snakeyaml.internal.Logger$Level
 */
package com.viaversion.viaversion.libs.snakeyaml.internal;

import com.viaversion.viaversion.libs.snakeyaml.internal.Logger;

/*
 * Exception performing whole class analysis ignored.
 */
public class Logger {
    private final java.util.logging.Logger logger;

    public boolean isLoggable(Level level) {
        return this.logger.isLoggable(Level.access$000((Level)level));
    }

    private Logger(String name) {
        this.logger = java.util.logging.Logger.getLogger(name);
    }

    public static Logger getLogger(String name) {
        return new Logger(name);
    }

    public void debug(String msg) {
        this.logger.log(Level.access$000((Level)Level.DEBUG), msg);
    }

    public void warn(String msg) {
        this.logger.log(Level.access$000((Level)Level.WARNING), msg);
    }
}

