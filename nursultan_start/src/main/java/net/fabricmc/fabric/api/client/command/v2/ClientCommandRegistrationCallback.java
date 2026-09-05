/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  minecraft.class04348
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.api.client.command.v2;

import com.mojang.brigadier.CommandDispatcher;
import minecraft.class04348;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

@Environment(value=EnvType.CLIENT)
public interface ClientCommandRegistrationCallback {
    public static final Event<ClientCommandRegistrationCallback> EVENT = EventFactory.createArrayBacked(ClientCommandRegistrationCallback.class, clientCommandRegistrationCallbackArray -> (commandDispatcher, class043482) -> {
        for (ClientCommandRegistrationCallback clientCommandRegistrationCallback : clientCommandRegistrationCallbackArray) {
            clientCommandRegistrationCallback.register((CommandDispatcher<FabricClientCommandSource>)commandDispatcher, class043482);
        }
    });

    public void register(CommandDispatcher<FabricClientCommandSource> var1, class04348 var2);
}

