package zenith.zov.base.comand.impl;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.command.CommandSource;
import zenith.zov.base.comand.api.CommandAbstract;

public class IrcCommand extends CommandAbstract {
   public IrcCommand() {
      super("irc");
   }

   @Override
   public void execute(LiteralArgumentBuilder<CommandSource> literalargumentbuilder) {
      literalargumentbuilder.then(literal("message").then(arg("msg", StringArgumentType.word()).executes(commandcontext -> 1)));
   }
}
