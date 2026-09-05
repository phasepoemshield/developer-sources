/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  io.netty.channel.ChannelFutureListener
 *  minecraft.class00381
 *  minecraft.class00642
 *  minecraft.class01615
 *  minecraft.class03713
 *  minecraft.class04770
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.event.interaction;

import com.mojang.authlib.GameProfile;
import io.netty.channel.ChannelFutureListener;
import minecraft.class00381;
import minecraft.class00642;
import minecraft.class01615;
import minecraft.class03713;
import minecraft.class04770;
import net.fabricmc.fabric.impl.event.interaction.FakePlayerNetworkHandler$FakeClientConnection;
import net.fabricmc.fabric.impl.networking.UntrackedNetworkHandler;
import org.jspecify.annotations.Nullable;

public final class FakePlayerNetworkHandler
extends class01615
implements UntrackedNetworkHandler {
    private static final class00642 FAKE_CONNECTION = new FakePlayerNetworkHandler$FakeClientConnection();

    public FakePlayerNetworkHandler(class04770 class047702) {
        super(class047702.method_51469().method_8503(), FAKE_CONNECTION, class047702, class03713.N((GameProfile)class047702.method_7334(), (boolean)false));
    }

    public void method_52391(class00381<?> class003812, @Nullable ChannelFutureListener channelFutureListener) {
    }
}

