/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.debug.VoicechatUncaughtExceptionHandler
 */
package de.maxhenkel.voicechat.voice.common;

import de.maxhenkel.voicechat.debug.VoicechatUncaughtExceptionHandler;
import java.util.concurrent.ThreadFactory;

public class NamedThreadPoolFactory
implements ThreadFactory {
    private final String name;

    public static NamedThreadPoolFactory create(String string) {
        return new NamedThreadPoolFactory(string);
    }

    public NamedThreadPoolFactory(String string) {
        this.name = string;
    }

    @Override
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.name);
        thread.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new VoicechatUncaughtExceptionHandler());
        thread.setDaemon(true);
        return thread;
    }
}

