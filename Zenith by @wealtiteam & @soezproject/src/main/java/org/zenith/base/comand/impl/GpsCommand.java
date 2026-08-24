package org.zenith.base.comand.impl;

import org.zenith.base.filemanager.impl.way.Way;
import org.zenith.event.RefreshCacheEvent;

import org.zenith.base.comand.api.CommandAbstract;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.StyledTextBuilder;













import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.command.CommandSource;

public class GpsCommand extends CommandAbstract {
   public GpsCommand() {
      super("gps");
   }

   @Override
   public void execute(LiteralArgumentBuilder<CommandSource> var1) {
      var1.executes(var0 -> {
         StyledTextBuilder.RefreshCacheEvent("\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0439 .way");
         return 1;
      });
      var1.then(literal("help").executes(var0 -> {
         StyledTextBuilder.RefreshCacheEvent("\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0439 .way");
         return 1;
      }));
   }
}
