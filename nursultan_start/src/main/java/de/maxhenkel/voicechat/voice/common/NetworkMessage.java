/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.api.RawUdpPacket
 *  de.maxhenkel.voicechat.debug.PingHandler
 *  io.netty.buffer.Unpooled
 *  io.netty.handler.codec.DecoderException
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 *  minecraft.class00667
 */
package de.maxhenkel.voicechat.voice.common;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.api.RawUdpPacket;
import de.maxhenkel.voicechat.debug.PingHandler;
import de.maxhenkel.voicechat.voice.common.AuthenticateAckPacket;
import de.maxhenkel.voicechat.voice.common.AuthenticatePacket;
import de.maxhenkel.voicechat.voice.common.ConnectionCheckAckPacket;
import de.maxhenkel.voicechat.voice.common.ConnectionCheckPacket;
import de.maxhenkel.voicechat.voice.common.GroupSoundPacket;
import de.maxhenkel.voicechat.voice.common.KeepAlivePacket;
import de.maxhenkel.voicechat.voice.common.LocationSoundPacket;
import de.maxhenkel.voicechat.voice.common.MicPacket;
import de.maxhenkel.voicechat.voice.common.Packet;
import de.maxhenkel.voicechat.voice.common.PingPacket;
import de.maxhenkel.voicechat.voice.common.PlayerSoundPacket;
import de.maxhenkel.voicechat.voice.common.Secret;
import de.maxhenkel.voicechat.voice.server.ClientConnection;
import de.maxhenkel.voicechat.voice.server.Server;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.DecoderException;
import java.lang.reflect.InvocationTargetException;
import java.net.SocketAddress;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import minecraft.class00667;

public class NetworkMessage {
    public static final byte MAGIC_BYTE = -1;
    private final long timestamp;
    private Packet<? extends Packet> packet;
    private SocketAddress address;
    private static final Map<Byte, Class<? extends Packet>> packetRegistry = new HashMap<Byte, Class<? extends Packet>>();

    private NetworkMessage(long l) {
        this.timestamp = l;
    }

    public NetworkMessage(Packet<?> packet) {
        this(System.currentTimeMillis());
        this.packet = packet;
    }

    public NetworkMessage(long l, Packet<?> packet) {
        this(l);
        this.packet = packet;
    }

    static {
        packetRegistry.put((byte)1, MicPacket.class);
        packetRegistry.put((byte)2, PlayerSoundPacket.class);
        packetRegistry.put((byte)3, GroupSoundPacket.class);
        packetRegistry.put((byte)4, LocationSoundPacket.class);
        packetRegistry.put((byte)5, AuthenticatePacket.class);
        packetRegistry.put((byte)6, AuthenticateAckPacket.class);
        packetRegistry.put((byte)7, PingPacket.class);
        packetRegistry.put((byte)8, KeepAlivePacket.class);
        packetRegistry.put((byte)9, ConnectionCheckPacket.class);
        packetRegistry.put((byte)10, ConnectionCheckAckPacket.class);
    }

    public byte[] write(Secret secret) throws InvalidAlgorithmParameterException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException {
        class00667 class006672 = new class00667(Unpooled.buffer());
        byte by = NetworkMessage.getPacketType(this.packet);
        if (by < 0) {
            throw new IllegalArgumentException("Packet type not found");
        }
        class006672.writeByte((int)by);
        this.packet.toBytes(class006672);
        byte[] byArray = new byte[class006672.readableBytes()];
        class006672.readBytes(byArray);
        return secret.encrypt(byArray);
    }

    public SocketAddress getAddress() {
        return this.address;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    private static byte getPacketType(Packet<? extends Packet> packet) {
        for (Map.Entry<Byte, Class<? extends Packet>> entry : packetRegistry.entrySet()) {
            if (!packet.getClass().equals(entry.getValue())) continue;
            return entry.getKey();
        }
        return -1;
    }

    public byte[] writeServer(Server server, ClientConnection clientConnection) throws InvalidAlgorithmParameterException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException {
        byte[] byArray = this.write(server.getSecret(clientConnection.getPlayerUUID()));
        class00667 class006672 = new class00667(Unpooled.buffer((int)(1 + byArray.length)));
        class006672.writeByte(-1);
        class006672.N(byArray);
        byte[] byArray2 = new byte[class006672.readableBytes()];
        class006672.readBytes(byArray2);
        return byArray2;
    }

    @Nullable
    public static NetworkMessage readPacketServer(RawUdpPacket rawUdpPacket, Server server) throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        try {
            byte[] byArray = rawUdpPacket.getData();
            class00667 class006672 = new class00667(Unpooled.wrappedBuffer((byte[])byArray));
            if (class006672.readByte() != -1) {
                Voicechat.LOGGER.debug("Received invalid packet from {}", new Object[]{rawUdpPacket.getSocketAddress()});
                return null;
            }
            UUID uUID = class006672.m();
            if (!server.hasSecret(uUID)) {
                if (PingHandler.onPacket((Server)server, (SocketAddress)rawUdpPacket.getSocketAddress(), (UUID)uUID, (class00667)class006672)) {
                    return null;
                }
                Voicechat.LOGGER.debug("Player {} does not have a secret", new Object[]{uUID});
                return null;
            }
            return NetworkMessage.readFromBytes(rawUdpPacket.getSocketAddress(), server.getSecret(uUID), class006672.y(), rawUdpPacket.getTimestamp());
        }
        catch (DecoderException | IndexOutOfBoundsException throwable) {
            Voicechat.LOGGER.debug("Received invalid packet from {}", new Object[]{rawUdpPacket.getSocketAddress()});
            return null;
        }
    }

    @Nullable
    public static NetworkMessage readFromBytes(SocketAddress socketAddress, Secret secret, byte[] byArray, long l) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        byte[] byArray2;
        try {
            byArray2 = secret.decrypt(byArray);
        }
        catch (Exception exception) {
            Voicechat.LOGGER.debug("Failed to decrypt packet from {}", new Object[]{socketAddress});
            return null;
        }
        class00667 class006672 = new class00667(Unpooled.wrappedBuffer((byte[])byArray2));
        byte by = class006672.readByte();
        Class<? extends Packet> clazz = packetRegistry.get(by);
        if (clazz == null) {
            Voicechat.LOGGER.debug("Got invalid packet ID {}", new Object[]{by});
            return null;
        }
        Packet packet = clazz.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        NetworkMessage networkMessage = new NetworkMessage(l);
        networkMessage.address = socketAddress;
        networkMessage.packet = packet.fromBytes(class006672);
        return networkMessage;
    }

    public long getTTL() {
        return this.packet.getTTL();
    }

    @Nonnull
    public Packet<? extends Packet> getPacket() {
        return this.packet;
    }
}

