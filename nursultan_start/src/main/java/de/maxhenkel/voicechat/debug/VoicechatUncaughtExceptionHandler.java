/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 */
package de.maxhenkel.voicechat.debug;

import de.maxhenkel.voicechat.Voicechat;

public class VoicechatUncaughtExceptionHandler
implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {
        Voicechat.LOGGER.error("Uncaught exception in thread {}", new Object[]{thread.getName(), throwable});
    }
}

