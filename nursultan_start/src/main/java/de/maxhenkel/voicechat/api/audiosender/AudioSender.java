/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.api.audiosender;

public interface AudioSender {
    public AudioSender sequenceNumber(long var1);

    public boolean reset();

    public boolean isWhispering();

    public boolean send(byte[] var1);

    public boolean canSend();

    public AudioSender whispering(boolean var1);
}

