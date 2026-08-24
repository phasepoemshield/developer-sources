package org.zenith.base.comand.impl;

import org.zenith.core.ModuleSnapshotDto;
import org.zenith.event.RefreshCacheEvent;
import org.zenith.rotation.RotationLegitStrategy;

import org.zenith.base.comand.api.CommandAbstract;
import org.zenith.base.comand.impl.args.WayArgumentType;
import org.zenith.base.filemanager.impl.way.Way;
import org.zenith.ZenithClient;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.StyledTextBuilder;
import org.zenith.core.TextAccent;














import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.command.CommandSource;
import net.minecraft.util.math.BlockPos;

public class WayCommand extends CommandAbstract {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public final SuggestionProvider<CommandSource> SUGGEST_X = (var0, var1) -> {
      ClientPlayerEntity clientplayerentity = MinecraftClient.getInstance().player;
      if (clientplayerentity != null) {
         BlockPos blockpos = clientplayerentity.getBlockPos();
         var1.suggest(blockpos.getX());
      }

      return var1.buildFuture();
   };
   public final SuggestionProvider<CommandSource> SUGGEST_Y = (var0, var1) -> {
      ClientPlayerEntity clientplayerentity = MinecraftClient.getInstance().player;
      if (clientplayerentity != null) {
         BlockPos blockpos = clientplayerentity.getBlockPos();
         var1.suggest(blockpos.getY());
      }

      return var1.buildFuture();
   };
   public final SuggestionProvider<CommandSource> SUGGEST_Z = (var0, var1) -> {
      ClientPlayerEntity clientplayerentity = MinecraftClient.getInstance().player;
      if (clientplayerentity != null) {
         BlockPos blockpos = clientplayerentity.getBlockPos();
         var1.suggest(blockpos.getZ());
      }

      return var1.buildFuture();
   };

   public WayCommand() {
      super("way");
   }

   @Override
   public void execute(LiteralArgumentBuilder<CommandSource> var1) {
      var1.then(
         literal("add")
            .then(
               arg("name", StringArgumentType.word())
                  .then(
                     arg("x", IntegerArgumentType.integer())
                        .suggests(this.SUGGEST_X)
                        .then(
                           arg("y", IntegerArgumentType.integer())
                              .suggests(this.SUGGEST_Y)
                              .then(arg("z", IntegerArgumentType.integer()).suggests(this.SUGGEST_Z).executes(var1x -> {
                                 String s = var1x.getArgument("name", String.class);
                                 int i = IntegerArgumentType.getInteger(var1x, "x");
                                 int j = IntegerArgumentType.getInteger(var1x, "y");
                                 int k = IntegerArgumentType.getInteger(var1x, "z");
                                 this.handleAddWay(s, i, j, k);
                                 return 1;
                              }))
                        )
                  )
            )
      );
      var1.then(
         literal("event")
            .executes(
               var0 -> {
                  ZenithClient.on23().ModuleSnapshotDto().startEventCapture();
                  StyledTextBuilder.RefreshCacheEvent(
                     "\u041e\u0436\u0438\u0434\u0430\u043d\u0438\u0435 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442 \u0438\u0437 \u0441\u043b\u0435\u0434\u0443\u044e\u0449\u0438\u0445 2 \u0441\u043e\u043e\u0431\u0449\u0435\u043d\u0438\u0439 \u0447\u0430\u0442\u0430"
                  );
                  minecraftClient3.getNetworkHandler().sendCommand("event");
                  return 1;
               }
            )
      );
      var1.then(literal("clear").executes(var0 -> {
         ZenithClient.on23().ModuleSnapshotDto().clearList();
         return 1;
      }));
      var1.then(literal("remove").then(arg("name", WayArgumentType.create()).executes(var0 -> {
         String s = var0.getArgument("name", String.class);
         ZenithClient.on23().ModuleSnapshotDto().deleteWay(s);
         StyledTextBuilder.on23(TextAccent.call002, s + " \u0443\u0434\u0430\u043b\u0435\u043d ");
         return 1;
      })));
      var1.then(literal("list").executes(var0 -> {
         if (!ZenithClient.on23().ModuleSnapshotDto().getItems().isEmpty()) {
            for (Way way : ZenithClient.on23().ModuleSnapshotDto().getItems()) {
               minecraftClient3.player.sendMessage(way.toText(), false);
            }
         } else {
            StyledTextBuilder.RefreshCacheEvent("\u0421\u043f\u0438\u0441\u043e\u043a \u043f\u0443\u0441\u0442!");
         }

         return 1;
      }));
   }

   public void handleAddWay(String var1, int var2, int var3, int var4) {
      Way way = ZenithClient.on23().ModuleSnapshotDto().getWay(var1);
      if (way != null) {
         StyledTextBuilder.RotationLegitStrategy(
            "\u041c\u0435\u0442\u043a\u0430 \u0441 \u0442\u0430\u043a\u0438\u043c \u0438\u043c\u0435\u043d\u0435\u043c \u0443\u0436\u0435 \u0435\u0441\u0442\u044c \u0432 \u0441\u043f\u0438\u0441\u043a\u0435!"
         );
         StyledTextBuilder.RefreshCacheEvent(
            "\u041d\u0430\u0432\u0435\u0434\u0438 \u043c\u044b\u0448\u043a\u0443 \u043d\u0430 \u0441\u043e\u043e\u0431\u0449\u0435\u043d\u0438\u0435 \u043d\u0438\u0436\u0435 \u0447\u0442\u043e\u0431\u044b \u0443\u0434\u0430\u043b\u0438\u0442\u044c \u0435\u0435"
         );
         minecraftClient3.player.sendMessage(way.toText(), false);
      } else {
         String s = minecraftClient3.getNetworkHandler().getServerInfo() != null
            ? minecraftClient3.getNetworkHandler().getServerInfo().address
            : "VANILLA";
         Way way1 = new Way(var1, new BlockPos(var2, var3, var4), s);
         minecraftClient3.player.sendMessage(way1.toText(), false);
         ZenithClient.on23().ModuleSnapshotDto().addWay(way1);
      }
   }
}
