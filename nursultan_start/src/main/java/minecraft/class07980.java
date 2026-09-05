/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 */
package minecraft;

import org.slf4j.Logger;

public class class07980
implements Thread.UncaughtExceptionHandler {
    private final Logger N;

    public class07980(Logger logger) {
        this.N = logger;
    }

    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {
        this.N.error("Caught previously unhandled exception :", throwable);
    }
}

