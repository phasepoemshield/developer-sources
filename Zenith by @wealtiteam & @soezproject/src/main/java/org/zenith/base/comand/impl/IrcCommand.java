package org.zenith.base.comand.impl;

import org.zenith.base.comand.api.CommandAbstract;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;













import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.command.CommandSource;

public class IrcCommand extends CommandAbstract {
   public IrcCommand() {
      super("irc");
   }

   @Override
   public void execute(LiteralArgumentBuilder<CommandSource> var1) {
      var1.then(literal("message").then(arg("msg", StringArgumentType.word()).executes(var0 -> 1)));
   }
}
