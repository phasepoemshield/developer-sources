/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.Voicechat
 *  de.maxhenkel.voicechat.api.RawUdpPacket
 *  io.netty.buffer.Unpooled
 *  javax.annotation.Nullable
 *  minecraft.class00667
 */
package de.maxhenkel.voicechat.voice.client;

import de.maxhenkel.voicechat.Voicechat;
import de.maxhenkel.voicechat.api.RawUdpPacket;
import de.maxhenkel.voicechat.voice.client.ClientVoicechatConnection;
import de.maxhenkel.voicechat.voice.common.NetworkMessage;
import io.netty.buffer.Unpooled;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.annotation.Nullable;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import minecraft.class00667;

public class ClientNetworkMessage {
    public static byte[] writeClient(ClientVoicechatConnection clientVoicechatConnection, NetworkMessage networkMessage) throws InvalidAlgorithmParameterException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException {
        byte[] byArray = networkMessage.write(clientVoicechatConnection.getData().getSecret());
        class00667 class006672 = new class00667(Unpooled.buffer((int)(17 + byArray.length)));
        class006672.writeByte(-1);
        class006672.N(clientVoicechatConnection.getData().getPlayerUUID());
        class006672.N(byArray);
        byte[] byArray2 = new byte[class006672.readableBytes()];
        class006672.readBytes(byArray2);
        return byArray2;
    }

    @Nullable
    public static NetworkMessage readPacketClient(RawUdpPacket rawUdpPacket, ClientVoicechatConnection clientVoicechatConnection) throws IllegalAccessException, InstantiationException, IOException, InvalidAlgorithmParameterException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException, InvocationTargetException, NoSuchMethodException {
        byte[] byArray = rawUdpPacket.getData();
        class00667 class006672 = new class00667(Unpooled.wrappedBuffer((byte[])byArray));
        if (class006672.readByte() != -1) {
            Voicechat.LOGGER.debug("Received invalid packet from {}", new Object[]{clientVoicechatConnection.getAddress()});
            return null;
        }
        return NetworkMessage.readFromBytes(rawUdpPacket.getSocketAddress(), clientVoicechatConnection.getData().getSecret(), class006672.y(), System.currentTimeMillis());
    }
}

