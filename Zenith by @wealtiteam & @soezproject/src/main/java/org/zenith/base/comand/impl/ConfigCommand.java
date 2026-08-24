package org.zenith.base.comand.impl;

import org.zenith.core.BotFeaturesDto;
import org.zenith.core.ModuleStateStore;
import org.zenith.core.TradeGuardService;
import org.zenith.module.AutoAuth;

import org.zenith.event.RefreshCacheEvent;

import org.zenith.base.comand.api.CommandAbstract;
import org.zenith.base.comand.impl.args.CfgArgumentType;
import org.zenith.ZenithClient;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.event.RefreshCacheEvent;
import org.zenith.core.StyledTextBuilder;
import org.zenith.core.TextAccent;
import org.zenith.core.CloudPoller;















import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.io.IOException;
import java.util.List;
import net.minecraft.command.CommandSource;

public class ConfigCommand extends CommandAbstract {
   public ConfigCommand() {
      super("cfg");
   }

   @Override
   public void execute(LiteralArgumentBuilder<CommandSource> var1) {
      var1.then(
         literal("save")
            .executes(
               var0 -> {
                  boolean flag = ZenithClient.on23().TradeGuardService().ModuleStateStore("current_config");
                  if (flag) {
                     StyledTextBuilder.on23(
                        TextAccent.call002,
                        "\u041a\u043e\u043d\u0444\u0438\u0433\u0443\u0440\u0430\u0446\u0438\u044f \u0441\u043e\u0445\u0440\u0430\u043d\u0435\u043d\u0430"
                     );
                  } else {
                     StyledTextBuilder.on23(
                        TextAccent.call013,
                        "\u041e\u0448\u0438\u0431\u043a\u0430 \u043f\u0440\u0438 \u0441\u043e\u0445\u0440\u0430\u043d\u0435\u043d\u0438\u0438 \u043a\u043e\u043d\u0444\u0438\u0433\u0443\u0440\u0430\u0446\u0438\u0438"
                     );
                  }

                  return 1;
               }
            )
            .then(
               arg("name", CfgArgumentType.create())
                  .executes(
                     var0 -> {
                        boolean flag = ZenithClient.on23()
                           .TradeGuardService()
                           .ModuleStateStore(var0.getArgument("name", String.class));
                        if (flag) {
                           StyledTextBuilder.on23(
                              TextAccent.call002,
                              "\u041a\u043e\u043d\u0444\u0438\u0433\u0443\u0440\u0430\u0446\u0438\u044f \u0441\u043e\u0445\u0440\u0430\u043d\u0435\u043d\u0430"
                           );
                        } else {
                           StyledTextBuilder.on23(
                              TextAccent.call013,
                              "\u041e\u0448\u0438\u0431\u043a\u0430 \u043f\u0440\u0438 \u0441\u043e\u0445\u0440\u0430\u043d\u0435\u043d\u0438\u0438 \u043a\u043e\u043d\u0444\u0438\u0433\u0443\u0440\u0430\u0446\u0438\u0438"
                           );
                        }

                        return 1;
                     }
                  )
            )
      );
      var1.then(
         literal("list")
            .executes(
               var0 -> {
                  var list = ZenithClient.on23().TradeGuardService().AutoAuth();
                  if (list.isEmpty()) {
                     StyledTextBuilder.RefreshCacheEvent(
                        "\u0421\u043f\u0438\u0441\u043e\u043a \u043a\u043e\u043d\u0444\u0438\u0433\u043e\u0432 \u043f\u0443\u0441\u0442!"
                     );
                  } else {
                     list.forEach(StyledTextBuilder::RefreshCacheEvent);
                  }

                  return 1;
               }
            )
      );
      var1.then(
         literal("load")
            .executes(
               var0 -> {
                  boolean flag = ZenithClient.on23().TradeGuardService().BotFeaturesDto("current_config");
                  if (flag) {
                     StyledTextBuilder.on23(
                        TextAccent.call002,
                        "\u041a\u043e\u043d\u0444\u0438\u0433\u0443\u0440\u0430\u0446\u0438\u044f \u0437\u0430\u0433\u0440\u0443\u0436\u0435\u043d\u0430"
                     );
                  } else {
                     StyledTextBuilder.on23(
                        TextAccent.call013,
                        "\u041e\u0448\u0438\u0431\u043a\u0430 \u043f\u0440\u0438 \u0437\u0430\u0433\u0440\u0443\u0437\u043a\u0435 \u043a\u043e\u043d\u0444\u0438\u0433\u0443\u0440\u0430\u0446\u0438\u0438"
                     );
                  }

                  return 1;
               }
            )
            .then(
               arg("name", CfgArgumentType.create())
                  .executes(
                     var0 -> {
                        boolean flag = ZenithClient.on23()
                           .TradeGuardService()
                           .BotFeaturesDto(var0.getArgument("name", String.class));
                        if (flag) {
                           StyledTextBuilder.on23(
                              TextAccent.call002,
                              "\u041a\u043e\u043d\u0444\u0438\u0433\u0443\u0440\u0430\u0446\u0438\u044f \u0437\u0430\u0433\u0440\u0443\u0436\u0435\u043d\u0430"
                           );
                        } else {
                           StyledTextBuilder.on23(
                              TextAccent.call013,
                              "\u041e\u0448\u0438\u0431\u043a\u0430 \u043f\u0440\u0438 \u0437\u0430\u0433\u0440\u0443\u0437\u043a\u0435 \u043a\u043e\u043d\u0444\u0438\u0433\u0443\u0440\u0430\u0446\u0438\u0438"
                           );
                        }

                        return 1;
                     }
                  )
            )
      );
      var1.then(
         literal("help")
            .executes(
               var0 -> {
                  StyledTextBuilder.on23(
                     TextAccent.call002,
                     "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435: .config <list/save/load/help>"
                  );
                  StyledTextBuilder.on23(TextAccent.call002, "\u041a\u043e\u043c\u0430\u043d\u0434\u044b:");
                  StyledTextBuilder.on23(
                     TextAccent.call002,
                     ".config save - \u0441\u043e\u0445\u0440\u0430\u043d\u0438\u0442\u044c \u043a\u043e\u043d\u0444\u0438\u0433\u0443\u0440\u0430\u0446\u0438\u044e"
                  );
                  StyledTextBuilder.on23(
                     TextAccent.call002,
                     ".config load - \u0437\u0430\u0433\u0440\u0443\u0437\u0438\u0442\u044c \u043a\u043e\u043d\u0444\u0438\u0433\u0443\u0440\u0430\u0446\u0438\u044e"
                  );
                  return 1;
               }
            )
      );
      var1.then(literal("dir").executes(var0 -> {
         try {
            Runtime.getRuntime().exec("explorer " + CloudPoller.file7.getAbsolutePath());
         } catch (IOException ioexception) {
         }

         return 1;
      }));
   }
}
