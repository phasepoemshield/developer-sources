/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelFutureListener
 *  minecraft.class00667
 *  minecraft.class03464
 *  minecraft.class06202
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.client.networking.v1;

import io.netty.channel.ChannelFutureListener;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import minecraft.class00667;
import minecraft.class03464;
import minecraft.class06202;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.jspecify.annotations.Nullable;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface ClientLoginNetworking$LoginQueryRequestHandler {
    public CompletableFuture<@Nullable class00667> receive(class06202 var1, class03464 var2, class00667 var3, Consumer<ChannelFutureListener> var4);
}

