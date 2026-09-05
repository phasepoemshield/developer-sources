/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  minecraft.class04348
 *  minecraft.class07671
 *  minecraft.class07701
 */
package net.fabricmc.fabric.api.command.v2;

import com.mojang.brigadier.CommandDispatcher;
import minecraft.class04348;
import minecraft.class07671;
import minecraft.class07701;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

public interface CommandRegistrationCallback {
    public static final Event<CommandRegistrationCallback> EVENT = EventFactory.createArrayBacked(CommandRegistrationCallback.class, commandRegistrationCallbackArray -> (commandDispatcher, class043482, class076712) -> {
        for (CommandRegistrationCallback commandRegistrationCallback : commandRegistrationCallbackArray) {
            commandRegistrationCallback.register((CommandDispatcher<class07701>)commandDispatcher, class043482, class076712);
        }
    });

    public void register(CommandDispatcher<class07701> var1, class04348 var2, class07671 var3);
}

