package zenith.zov.base.comand.api;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import net.minecraft.command.CommandSource;
import zenith.ZenithInternal140;

public abstract class CommandAbstract implements ZenithInternal140 {
   private final String command;

   protected CommandAbstract(String s) {
      this.command = s;
   }

   public void register(CommandDispatcher<CommandSource> commanddispatcher) {
      LiteralArgumentBuilder literalargumentbuilder = LiteralArgumentBuilder.literal(this.command);
      this.execute(literalargumentbuilder);
      commanddispatcher.register(literalargumentbuilder);
   }

   public abstract void execute(LiteralArgumentBuilder<CommandSource> literalargumentbuilder);

   // $VF: renamed from: arg (java.lang.String, com.mojang.brigadier.arguments.ArgumentType) com.mojang.brigadier.builder.RequiredArgumentBuilder
   protected static <T> RequiredArgumentBuilder<CommandSource, T> method_96(String s, ArgumentType<T> argumenttype) {
      return RequiredArgumentBuilder.argument(s, argumenttype);
   }

   protected static LiteralArgumentBuilder<CommandSource> literal(String s) {
      return LiteralArgumentBuilder.literal(s);
   }

   public String getCommand() {
      return this.command;
   }
}
