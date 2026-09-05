/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 */
package minecraft;

import org.slf4j.Logger;

public class class05103
implements Thread.UncaughtExceptionHandler {
    private final Logger N;

    public class05103(Logger logger) {
        this.N = logger;
    }

    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {
        this.N.error("Caught previously unhandled exception", throwable);
    }
}

