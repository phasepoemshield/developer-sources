/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  net.raphimc.viabedrock.netty.CompressionCodec
 *  net.raphimc.viabedrock.netty.raknet.AesEncryptionCodec
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PacketCompressionAlgorithm
 *  net.raphimc.viabedrock.protocol.provider.NettyPipelineProvider
 */
package com.viaversion.viafabricplus.protocoltranslator.impl.provider.viabedrock;

import com.viaversion.viaversion.api.connection.UserConnection;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import javax.crypto.SecretKey;
import net.raphimc.viabedrock.netty.CompressionCodec;
import net.raphimc.viabedrock.netty.raknet.AesEncryptionCodec;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PacketCompressionAlgorithm;
import net.raphimc.viabedrock.protocol.provider.NettyPipelineProvider;

public final class ViaFabricPlusNettyPipelineProvider
extends NettyPipelineProvider {
    public void enableEncryption(UserConnection userConnection, SecretKey secretKey) {
        Channel channel = userConnection.getChannel();
        if (channel.pipeline().names().contains("encrypt")) {
            throw new IllegalStateException("Encryption already enabled");
        }
        if (channel.pipeline().get("viabedrock-raknet-message-codec") != null) {
            try {
                channel.pipeline().addAfter("viabedrock-raknet-message-codec", "encrypt", (ChannelHandler)new AesEncryptionCodec(secretKey));
            }
            catch (Throwable throwable) {
                throw new RuntimeException(throwable);
            }
        }
    }

    public void enableCompression(UserConnection userConnection, PacketCompressionAlgorithm packetCompressionAlgorithm, int n) {
        Channel channel = userConnection.getChannel();
        if (!channel.pipeline().names().contains("compress")) {
            channel.pipeline().addBefore("splitter", "compress", (ChannelHandler)new CompressionCodec(packetCompressionAlgorithm, n));
        } else {
            channel.pipeline().replace("compress", "compress", (ChannelHandler)new CompressionCodec(packetCompressionAlgorithm, n));
        }
    }
}

