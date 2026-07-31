package zenith.zov.base.comand.impl;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.command.CommandSource;
import zenith.TextHolder;
import zenith.zov.base.comand.api.CommandAbstract;

public class GpsCommand extends CommandAbstract {
   public GpsCommand() {
      super("gps");
   }

   @Override
   public void execute(LiteralArgumentBuilder<CommandSource> literalargumentbuilder) {
      literalargumentbuilder.executes(commandcontext -> {
         TextHolder.EventImpl_27("Используй .way");
         return 1;
      });
      literalargumentbuilder.then(literal("help").executes(commandcontext -> {
         TextHolder.EventImpl_27("Используй .way");
         return 1;
      }));
   }
}
