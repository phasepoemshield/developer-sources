/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.debug;

import de.maxhenkel.voicechat.debug.DebugOverlay;
import de.maxhenkel.voicechat.debug.VoicechatUncaughtExceptionHandler;

class DebugOverlay$TimerThread
extends Thread {
    private boolean stopped;
    final /* synthetic */ DebugOverlay this$0;

    DebugOverlay$TimerThread(DebugOverlay debugOverlay) {
        this.this$0 = debugOverlay;
        this.setName("Voicechat Debug Overlay Thread");
        this.setDaemon(true);
        this.setUncaughtExceptionHandler(new VoicechatUncaughtExceptionHandler());
        this.start();
    }

    @Override
    public void run() {
        while (!this.stopped) {
            this.this$0.updateCache();
            try {
                Thread.sleep(20L);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    public void close() {
        this.stopped = true;
        this.interrupt();
    }
}

