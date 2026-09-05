/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelFutureListener
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class01659
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.networking.v1;

import io.netty.channel.ChannelFutureListener;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class01659;
import org.jspecify.annotations.Nullable;

public interface PacketSender {
    public void disconnect(class00392 var1);

    public class00381<?> createPacket(class01659 var1);

    public void sendPacket(class00381<?> var1, @Nullable ChannelFutureListener var2);

    default public void sendPacket(class01659 class016592, @Nullable ChannelFutureListener channelFutureListener) {
        this.sendPacket(this.createPacket(class016592), channelFutureListener);
    }

    default public void sendPacket(class00381<?> class003812) {
        this.sendPacket(class003812, null);
    }

    default public void sendPacket(class01659 class016592) {
        this.sendPacket(this.createPacket(class016592));
    }
}

