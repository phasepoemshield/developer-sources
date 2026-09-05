/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelFutureListener
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class01894
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.networking.v1;

import io.netty.channel.ChannelFutureListener;
import java.util.Objects;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class01894;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import org.jspecify.annotations.Nullable;

public interface LoginPacketSender
extends PacketSender {
    public class00381<?> createPacket(class01894 var1, class00667 var2);

    default public void sendPacket(class01894 class018942, class00667 class006672) {
        Objects.requireNonNull(class018942, "Channel cannot be null");
        Objects.requireNonNull(class006672, "Payload cannot be null");
        this.sendPacket(this.createPacket(class018942, class006672));
    }

    default public void sendPacket(class01894 class018942, class00667 class006672, @Nullable ChannelFutureListener channelFutureListener) {
        Objects.requireNonNull(class018942, "Channel cannot be null");
        Objects.requireNonNull(class006672, "Payload cannot be null");
        this.sendPacket(this.createPacket(class018942, class006672), channelFutureListener);
    }
}

