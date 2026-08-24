package org.zenith.base.comand.impl;

import org.zenith.core.InventoryUtils;
import org.zenith.core.ServerTheme;
import org.zenith.event.Event09;
import org.zenith.event.Event13;
import org.zenith.event.RefreshCacheEvent;
import org.zenith.rotation.RotationLegitStrategy;

import org.zenith.base.comand.api.CommandAbstract;
import org.zenith.util.ItemExt2;
import org.zenith.util.ItemExt2_Var159;
import org.zenith.ZenithClient;
import org.zenith.util.ScoreboardUtils;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.StyledTextBuilder;














import net.minecraft.client.MinecraftClient;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import net.minecraft.command.CommandSource;

public class MacroCommand extends CommandAbstract {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public final SuggestionProvider<CommandSource> SUGGEST_KEYS = (var0, var1) -> {
      for (ScoreboardUtils i1lil1l1lllilll1lili1l1lil1i1 : ScoreboardUtils.values()) {
         if (!i1lil1l1lllilll1lili1l1lil1i1.string113.isEmpty()) {
            var1.suggest(i1lil1l1lllilll1lili1l1lil1i1.string113);
         }
      }

      return var1.buildFuture();
   };

   public MacroCommand() {
      super("macro");
   }

   @Override
   public void execute(LiteralArgumentBuilder<CommandSource> var1) {
      var1.then(
         literal("add")
            .then(
               arg("name", StringArgumentType.word())
                  .then(
                     arg("key", StringArgumentType.word())
                        .suggests(this.SUGGEST_KEYS)
                        .then(arg("command", StringArgumentType.greedyString()).executes(var1x -> {
                           String s = var1x.getArgument("name", String.class);
                           String s1 = var1x.getArgument("key", String.class);
                           String s2 = var1x.getArgument("command", String.class);
                           this.handleAddMacro(s, s1, s2);
                           return 1;
                        }))
                  )
            )
      );
      var1.then(
         literal("remove")
            .then(
               arg("name", StringArgumentType.word())
                  .executes(
                     var0 -> {
                        String s = var0.getArgument("name", String.class);
                        ItemExt2_Var159 ilii1111lllilllilllii_ii1il11l111ii11iil = ZenithClient.on23()
                           .InventoryUtils()
                           .Event13(s);
                        if (ilii1111lllilllilllii_ii1il11l111ii11iil == null) {
                           StyledTextBuilder.RotationLegitStrategy("\u041c\u0430\u043a\u0440\u043e\u0441 \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d!");
                           return 1;
                        } else {
                           ZenithClient.on23().InventoryUtils().Event09(s);
                           StyledTextBuilder.RefreshCacheEvent(s + " \u0443\u0434\u0430\u043b\u0435\u043d");
                           return 1;
                        }
                     }
                  )
            )
      );
      var1.then(literal("clear").executes(var0 -> {
         ZenithClient.on23().InventoryUtils().clear();
         StyledTextBuilder.RefreshCacheEvent("\u0412\u0441\u0435 \u043c\u0430\u043a\u0440\u043e\u0441\u044b \u0443\u0434\u0430\u043b\u0435\u043d\u044b");
         return 1;
      }));
      var1.then(
         literal("list")
            .executes(
               var0 -> {
                  if (!ZenithClient.on23().InventoryUtils().getItems().isEmpty()) {
                     for (ItemExt2_Var159 ilii1111lllilllilllii_ii1il11l111ii11iil : ZenithClient.on23()
                        .InventoryUtils()
                        .getItems()) {
                        minecraftClient3.player.sendMessage(ilii1111lllilllilllii_ii1il11l111ii11iil.toText(), false);
                     }
                  } else {
                     StyledTextBuilder.RefreshCacheEvent(
                        "\u0421\u043f\u0438\u0441\u043e\u043a \u043c\u0430\u043a\u0440\u043e\u0441\u043e\u0432 \u043f\u0443\u0441\u0442!"
                     );
                  }

                  return 1;
               }
            )
      );
   }

   public void handleAddMacro(String var1, String var2, String var3) {
      ItemExt2 ilii1111lllilllilllii = ZenithClient.on23().InventoryUtils();
      int i = ScoreboardUtils.ServerTheme(var2);
      if (i == ScoreboardUtils.call065.int396) {
         StyledTextBuilder.RotationLegitStrategy("\u041d\u0435\u0438\u0437\u0432\u0435\u0441\u0442\u043d\u0430\u044f \u043a\u043b\u0430\u0432\u0438\u0448\u0430: " + var2);
      } else {
         ItemExt2_Var159 ilii1111lllilllilllii_ii1il11l111ii11iil = ilii1111lllilllilllii.Event13(var1);
         if (ilii1111lllilllilllii_ii1il11l111ii11iil != null) {
            StyledTextBuilder.RotationLegitStrategy(
               "\u041c\u0430\u043a\u0440\u043e\u0441 \u0441 \u0442\u0430\u043a\u0438\u043c \u0438\u043c\u0435\u043d\u0435\u043c \u0443\u0436\u0435 \u0441\u0443\u0449\u0435\u0441\u0442\u0432\u0443\u0435\u0442!"
            );
            StyledTextBuilder.RefreshCacheEvent(
               "\u041d\u0430\u0432\u0435\u0434\u0438 \u043c\u044b\u0448\u043a\u0443 \u043d\u0430 \u0441\u043e\u043e\u0431\u0449\u0435\u043d\u0438\u0435 \u043d\u0438\u0436\u0435 \u0447\u0442\u043e\u0431\u044b \u0443\u0434\u0430\u043b\u0438\u0442\u044c \u0435\u0433\u043e"
            );
            minecraftClient3.player.sendMessage(ilii1111lllilllilllii_ii1il11l111ii11iil.toText(), false);
         } else {
            ItemExt2_Var159 ilii1111lllilllilllii_ii1il11l111ii11iil1 = new ItemExt2_Var159(var1, i, var3);
            ilii1111lllilllilllii.on23(ilii1111lllilllilllii_ii1il11l111ii11iil1);
            minecraftClient3.player.sendMessage(ilii1111lllilllilllii_ii1il11l111ii11iil1.toText(), false);
            StyledTextBuilder.RefreshCacheEvent("\u041c\u0430\u043a\u0440\u043e\u0441 \u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d");
         }
      }
   }
}
