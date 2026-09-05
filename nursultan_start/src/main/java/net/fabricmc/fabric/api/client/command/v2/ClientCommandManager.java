/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  minecraft.class01683
 *  minecraft.class06202
 *  minecraft.class07233
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.command.client.ClientCommandInternals
 *  net.fabricmc.fabric.impl.command.client.ClientCommandInternals$LastReceivedCommandsPacketAccessor
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.client.command.v2;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import minecraft.class01683;
import minecraft.class06202;
import minecraft.class07233;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.fabricmc.fabric.impl.command.client.ClientCommandInternals;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public final class ClientCommandManager {
    public static <T> RequiredArgumentBuilder<FabricClientCommandSource, T> argument(String string, ArgumentType<T> argumentType) {
        return RequiredArgumentBuilder.argument((String)string, argumentType);
    }

    private ClientCommandManager() {
    }

    public static LiteralArgumentBuilder<FabricClientCommandSource> literal(String string) {
        return LiteralArgumentBuilder.literal((String)string);
    }

    public static @Nullable CommandDispatcher<FabricClientCommandSource> getActiveDispatcher() {
        return ClientCommandInternals.getActiveDispatcher();
    }

    public static void refreshCommandCompletions() {
        class01683 class016832 = class06202.Nq().NE();
        if (class016832 == null) {
            throw new IllegalStateException("Not connected to a server (dedicated or integrated)!");
        }
        class07233 class072332 = ((ClientCommandInternals.LastReceivedCommandsPacketAccessor)class016832).fabric_api$getLastReceivedCommandsPacket();
        if (class072332 == null) {
            throw new IllegalStateException("Not yet received a 'minecraft:commands' packet!");
        }
        class016832.N(class072332);
    }
}

