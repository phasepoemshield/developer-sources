/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.platform.providers.Provider
 *  com.viaversion.viaversion.protocols.v1_8to1_9.provider.CompressionProvider$CompressionHandler
 *  com.viaversion.viaversion.protocols.v1_8to1_9.provider.CompressionProvider$Compressor
 *  com.viaversion.viaversion.protocols.v1_8to1_9.provider.CompressionProvider$Decompressor
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelPipeline
 */
package com.viaversion.viaversion.protocols.v1_8to1_9.provider;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.platform.providers.Provider;
import com.viaversion.viaversion.protocols.v1_8to1_9.provider.CompressionProvider;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelPipeline;

public class CompressionProvider
implements Provider {
    protected CompressionHandler getDecoder(int threshold) {
        return new Decompressor(threshold);
    }

    public void handlePlayCompression(UserConnection user, int threshold) {
        if (!user.isClientSide()) {
            throw new IllegalStateException("PLAY state Compression packet is unsupported");
        }
        ChannelPipeline pipe = user.getChannel().pipeline();
        if (threshold < 0) {
            this.removeHandlers(pipe);
            return;
        }
        ChannelHandler channelHandler = pipe.get(this.getCompressName());
        if (channelHandler instanceof CompressionHandler) {
            CompressionHandler compressionHandler = (CompressionHandler)channelHandler;
            compressionHandler.setCompressionThreshold(threshold);
            ((CompressionHandler)pipe.get(this.getDecompressName())).setCompressionThreshold(threshold);
            return;
        }
        this.removeHandlers(pipe);
        pipe.addBefore(Via.getManager().getInjector().getEncoderName(), this.getCompressName(), (ChannelHandler)this.getEncoder(threshold));
        pipe.addBefore(Via.getManager().getInjector().getDecoderName(), this.getDecompressName(), (ChannelHandler)this.getDecoder(threshold));
    }

    protected CompressionHandler getEncoder(int threshold) {
        return new Compressor(threshold);
    }

    protected String getDecompressName() {
        return "decompress";
    }

    protected String getCompressName() {
        return "compress";
    }

    private void removeHandlers(ChannelPipeline pipeline) {
        if (pipeline.get(this.getCompressName()) != null) {
            pipeline.remove(this.getCompressName());
            pipeline.remove(this.getDecompressName());
        }
    }
}

