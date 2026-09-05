/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.api.opus;

public interface OpusEncoder {
    public byte[] encode(short[] var1);

    public void close();

    public void resetState();

    public boolean isClosed();
}

