/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.api;

import de.maxhenkel.voicechat.api.RawUdpPacket;
import java.net.SocketAddress;

public interface ClientVoicechatSocket {
    public RawUdpPacket read() throws Exception;

    public void close();

    public void open() throws Exception;

    public void send(byte[] var1, SocketAddress var2) throws Exception;

    public boolean isClosed();
}

