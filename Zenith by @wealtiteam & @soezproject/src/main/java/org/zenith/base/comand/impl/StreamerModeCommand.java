package org.zenith.base.comand.impl;

import org.zenith.event.RefreshCacheEvent;
import org.zenith.event.VelocityChangeEvent;
import org.zenith.module.Module;

import org.zenith.module.StreamerMode;

import org.zenith.base.comand.api.CommandAbstract;
import org.zenith.module.StreamerMode;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.StyledTextBuilder;














import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.command.CommandSource;

public class StreamerModeCommand extends CommandAbstract {
   public StreamerModeCommand() {
      super("streamermode");
   }

   @Override
   public void execute(LiteralArgumentBuilder<CommandSource> var1) {
      for (String s : new String[]{"parseAnarchy", "parseanarchy"}) {
         var1.then(literal(s).then(arg("anarchy", IntegerArgumentType.integer(1, 999)).executes(var0 -> {
            StreamerMode.streamerMode.VelocityChangeEvent(IntegerArgumentType.getInteger(var0, "anarchy"));
            return 1;
         })));
      }

      var1.then(literal("clear").executes(var0 -> {
         StreamerMode.streamerMode.call180();
         return 1;
      }));
      var1.executes(
         var0 -> {
            StyledTextBuilder.RefreshCacheEvent(
               "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435: .streamermode parseAnarchy <\u043d\u043e\u043c\u0435\u0440 \u0430\u043d\u043a\u0438> \u0438 .streamermode clear"
            );
            return 1;
         }
      );
   }
}
