/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  minecraft.class04348
 *  net.fabricmc.fabric.api.client.command.v2.ClientCommandManager
 *  net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource
 */
package page.langeweile.ok_zoomer.events;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import minecraft.class04348;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import page.langeweile.ok_zoomer.utils.FabricZoomUtils;

public class RegisterCommands {
    public static void registerCommands(CommandDispatcher<FabricClientCommandSource> commandDispatcher, class04348 class043482) {
        commandDispatcher.register((LiteralArgumentBuilder)ClientCommandManager.literal((String)"ok_zoomer").executes(commandContext -> {
            FabricZoomUtils.setOpenCommandScreen(true);
            return 0;
        }));
    }
}

