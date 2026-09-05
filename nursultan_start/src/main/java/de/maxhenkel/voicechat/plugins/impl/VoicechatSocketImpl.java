/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.api.RawUdpPacket
 *  de.maxhenkel.voicechat.api.VoicechatSocket
 *  de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.plugins.impl;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.api.RawUdpPacket;
import de.maxhenkel.voicechat.api.VoicechatSocket;
import de.maxhenkel.voicechat.intercompatibility.CommonCompatibilityManager;
import de.maxhenkel.voicechat.plugins.impl.VoicechatSocketBase;
import java.net.BindException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import javax.annotation.Nullable;

public class VoicechatSocketImpl
extends VoicechatSocketBase
implements VoicechatSocket {
    @Nullable
    private DatagramSocket socket;

    public int getLocalPort() {
        if (this.socket == null) {
            return -1;
        }
        return this.socket.getLocalPort();
    }

    public RawUdpPacket read() throws Exception {
        if (this.socket == null) {
            throw new IllegalStateException("Socket not opened yet");
        }
        return this.read(this.socket);
    }

    public void close() {
        if (this.socket != null) {
            this.socket.close();
        }
    }

    public void open(int n, String string) throws Exception {
        if (this.socket != null) {
            throw new IllegalStateException("Socket already opened");
        }
        this.checkCorrectHost();
        InetAddress inetAddress = null;
        try {
            if (!string.isEmpty()) {
                inetAddress = InetAddress.getByName(string);
            }
        }
        catch (Exception exception) {
            string = "";
            Voicechat.LOGGER.error("Failed to parse bind IP address '{}'", string, exception);
        }
        try {
            try {
                this.socket = new DatagramSocket(n, inetAddress);
            }
            catch (BindException bindException) {
                if (inetAddress == null || string.equals("0.0.0.0")) {
                    throw bindException;
                }
                Voicechat.LOGGER.error("Failed to bind to address '{}', binding to wildcard IP instead", string);
                this.socket = new DatagramSocket(n);
            }
        }
        catch (BindException bindException) {
            Voicechat.LOGGER.error("Failed to run voice chat at UDP port {}, make sure no other application is running at that port", n);
            Voicechat.LOGGER.error("Voice chat server error", bindException);
            if (CommonCompatibilityManager.INSTANCE.isDedicatedServer()) {
                Voicechat.LOGGER.error("Shutting down server", new Object[0]);
                System.exit(1);
            }
            throw bindException;
        }
    }

    public void send(byte[] byArray, SocketAddress socketAddress) throws Exception {
        if (this.socket == null || this.socket.isClosed()) {
            return;
        }
        this.socket.send(new DatagramPacket(byArray, byArray.length, socketAddress));
    }

    public boolean isClosed() {
        if (this.socket == null) {
            return true;
        }
        return this.socket.isClosed();
    }

    private void checkCorrectHost() throws Exception {
        String string = (String)Voicechat.SERVER_CONFIG.voiceHost.get();
        if (string.isEmpty()) {
            return;
        }
        try {
            int n = Integer.parseInt(string);
            if (n <= 0 || n > 65535) {
                Voicechat.LOGGER.warn("Invalid voice host port: {}", n);
            } else {
                Voicechat.LOGGER.info("Voice host port is {}", n);
            }
        }
        catch (NumberFormatException numberFormatException) {
            try {
                new URI("voicechat://" + string);
                Voicechat.LOGGER.info("Voice host is '{}'", string);
            }
            catch (URISyntaxException uRISyntaxException) {
                Voicechat.LOGGER.warn("Failed to parse voice host", uRISyntaxException);
                System.exit(1);
                throw uRISyntaxException;
            }
        }
    }
}

