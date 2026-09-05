/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.debug.CooldownTimer
 */
package de.maxhenkel.voicechat.plugins.impl;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.debug.CooldownTimer;
import de.maxhenkel.voicechat.plugins.impl.RawUdpPacketImpl;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class VoicechatSocketBase {
    private final byte[] BUFFER = new byte[4096];

    public RawUdpPacketImpl read(DatagramSocket datagramSocket) throws IOException {
        DatagramPacket datagramPacket = new DatagramPacket(this.BUFFER, this.BUFFER.length);
        datagramSocket.receive(datagramPacket);
        if (datagramPacket.getLength() >= this.BUFFER.length) {
            CooldownTimer.run((String)"udp_packet_too_large", () -> Voicechat.LOGGER.warn("Packet from {} is too large", datagramPacket.getSocketAddress()));
            throw new IOException(String.format("Packet from %s is too large", datagramPacket.getSocketAddress()));
        }
        long l = System.currentTimeMillis();
        byte[] byArray = new byte[datagramPacket.getLength()];
        System.arraycopy(datagramPacket.getData(), datagramPacket.getOffset(), byArray, 0, datagramPacket.getLength());
        return new RawUdpPacketImpl(byArray, datagramPacket.getSocketAddress(), l);
    }
}

