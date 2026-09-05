/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  minecraft.class00381
 *  minecraft.class00657
 *  net.fabricmc.fabric.impl.networking.PayloadTypeRegistryImpl
 */
package net.fabricmc.fabric.impl.networking.splitter;

import io.netty.channel.ChannelHandlerContext;
import java.util.function.Consumer;
import minecraft.class00381;
import minecraft.class00657;
import net.fabricmc.fabric.impl.networking.PayloadTypeRegistryImpl;

public interface SplittablePacket {
    public void fabric_split(PayloadTypeRegistryImpl<?> var1, ChannelHandlerContext var2, class00657<?> var3, class00381<?> var4, Consumer<class00381<?>> var5) throws Exception;
}

