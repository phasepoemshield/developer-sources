/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.voice.server;

public interface PingManager$PingListener {
    public void onPong(int var1, long var2);

    public void onTimeout(int var1);

    public void onFailedAttempt(int var1);
}

