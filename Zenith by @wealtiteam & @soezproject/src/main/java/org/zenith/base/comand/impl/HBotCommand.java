package org.zenith.base.comand.impl;

import org.zenith.event.RefreshCacheEvent;
import org.zenith.module.Bot;
import org.zenith.module.Module;
import org.zenith.rotation.RotationMLStrategy2;

import org.zenith.base.bot.client.BotClient;
import org.zenith.base.bot.client.BotClientConfig;
import org.zenith.base.bot.client.HeadlessBots;
import org.zenith.base.bot.modules.api.BotModule;
import org.zenith.base.comand.api.CommandAbstract;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.StyledTextBuilder;














import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ServerAddress;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.command.CommandSource;

public class HBotCommand extends CommandAbstract {
   public HBotCommand() {
      super("hbot");
   }

   @Override
   public void execute(LiteralArgumentBuilder<CommandSource> var1) {
      var1.then(
         literal("connect")
            .then(
               arg("name", StringArgumentType.word())
                  .executes(var0 -> connect(StringArgumentType.getString(var0, "name"), null, null))
                  .then(
                     arg("address", StringArgumentType.word())
                        .executes(var0 -> connect(StringArgumentType.getString(var0, "name"), StringArgumentType.getString(var0, "address"), null))
                        .then(
                           arg("proxy", StringArgumentType.greedyString())
                              .executes(
                                 var0 -> connect(
                                       StringArgumentType.getString(var0, "name"),
                                       StringArgumentType.getString(var0, "address"),
                                       StringArgumentType.getString(var0, "proxy")
                                    )
                              )
                        )
                  )
            )
      );
      var1.then(literal("disconnect").then(arg("name", StringArgumentType.word()).executes(var0 -> {
         String s = StringArgumentType.getString(var0, "name");
         if (s.equalsIgnoreCase("all")) {
            HeadlessBots.disconnectAll();
            StyledTextBuilder.RefreshCacheEvent("\u0412\u0441\u0435 headless-\u0431\u043e\u0442\u044b \u043e\u0442\u043a\u043b\u044e\u0447\u0435\u043d\u044b");
         } else if (HeadlessBots.disconnect(s)) {
            StyledTextBuilder.RefreshCacheEvent("\u0411\u043e\u0442 " + s + " \u043e\u0442\u043a\u043b\u044e\u0447\u0451\u043d");
         } else {
            StyledTextBuilder.RotationMLStrategy2("\u0411\u043e\u0442 " + s + " \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d");
         }

         return 1;
      })));
      var1.then(literal("list").executes(var0 -> {
         if (HeadlessBots.all().isEmpty()) {
            StyledTextBuilder.RefreshCacheEvent("\u041d\u0435\u0442 \u0430\u043a\u0442\u0438\u0432\u043d\u044b\u0445 headless-\u0431\u043e\u0442\u043e\u0432");
            return 1;
         } else {
            for (BotClient botclient : HeadlessBots.all()) {
               StyledTextBuilder.RefreshCacheEvent(botclient.getName() + " \u2014 " + botclient.getPhase());
            }

            return 1;
         }
      }));
      var1.then(
         literal("say")
            .then(
               arg("name", StringArgumentType.word())
                  .then(
                     arg("message", StringArgumentType.greedyString())
                        .executes(
                           var0 -> {
                              BotClient botclient = requireBot(StringArgumentType.getString(var0, "name"));
                              if (botclient == null) {
                                 return 1;
                              } else {
                                 String s = StringArgumentType.getString(var0, "message");
                                 if (botclient.sendChat(s)) {
                                    StyledTextBuilder.RefreshCacheEvent(
                                       "\u0411\u043e\u0442 " + botclient.getName() + " \u043e\u0442\u043f\u0440\u0430\u0432\u0438\u043b: " + s
                                    );
                                 } else {
                                    StyledTextBuilder.RotationMLStrategy2(
                                       "\u0411\u043e\u0442 " + botclient.getName() + " \u0435\u0449\u0451 \u043d\u0435 \u0432 \u0438\u0433\u0440\u0435"
                                    );
                                 }

                                 return 1;
                              }
                           }
                        )
                  )
            )
      );
      var1.then(
         literal("module")
            .then(
               arg("name", StringArgumentType.word())
                  .then(
                     arg("module", StringArgumentType.word())
                        .then(
                           arg("state", StringArgumentType.word())
                              .executes(
                                 var0 -> {
                                    BotClient botclient = requireBot(StringArgumentType.getString(var0, "name"));
                                    if (botclient == null) {
                                       return 1;
                                    } else {
                                       String s = StringArgumentType.getString(var0, "module");
                                       boolean flag = StringArgumentType.getString(var0, "state").equalsIgnoreCase("on");
                                       botclient.execute(
                                          () -> {
                                             boolean flag1 = botclient.getModules().setEnabled(s, flag);
                                             report(
                                                flag1
                                                   ? "\u0411\u043e\u0442 "
                                                      + botclient.getName()
                                                      + ": \u043c\u043e\u0434\u0443\u043b\u044c "
                                                      + s
                                                      + (
                                                         flag
                                                            ? " \u0432\u043a\u043b\u044e\u0447\u0435\u043d"
                                                            : " \u0432\u044b\u043a\u043b\u044e\u0447\u0435\u043d"
                                                      )
                                                   : "\u041c\u043e\u0434\u0443\u043b\u044c " + s + " \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d",
                                                flag1
                                             );
                                          }
                                       );
                                       return 1;
                                    }
                                 }
                              )
                        )
                  )
            )
      );
      var1.then(
         literal("modules")
            .then(
               arg("name", StringArgumentType.word())
                  .executes(
                     var0 -> {
                        BotClient botclient = requireBot(StringArgumentType.getString(var0, "name"));
                        if (botclient == null) {
                           return 1;
                        } else {
                           for (BotModule botmodule : botclient.getModules().getModules()) {
                              StyledTextBuilder.RefreshCacheEvent(
                                 botmodule.getName() + " \u2014 " + (botmodule.isEnabled() ? "\u0432\u043a\u043b" : "\u0432\u044b\u043a\u043b")
                              );
                           }

                           return 1;
                        }
                     }
                  )
            )
      );
   }

   public static int connect(String var0, String var1, String var2) {
      String s = var1;
      if (var1 == null) {
         ServerInfo serverinfo = MinecraftClient.getInstance().getCurrentServerEntry();
         if (serverinfo == null) {
            StyledTextBuilder.RotationMLStrategy2(
               "\u041d\u0435 \u043f\u043e\u0434\u043a\u043b\u044e\u0447\u0451\u043d \u043a \u0441\u0435\u0440\u0432\u0435\u0440\u0443 \u2014 \u0443\u043a\u0430\u0436\u0438 \u0430\u0434\u0440\u0435\u0441: .hbot connect <\u043d\u0438\u043a> <host:port>"
            );
            return 1;
         }

         s = serverinfo.address;
      }

      ServerAddress serveraddress = ServerAddress.parse(s);
      BotClient botclient = HeadlessBots.connect(
         BotClientConfig.offline(var0, serveraddress.getAddress(), serveraddress.getPort(), var2, HeadlessBots.getProtocolVersion(var0))
      );
      StyledTextBuilder.RefreshCacheEvent(
         "\u0411\u043e\u0442 " + botclient.getName() + " \u043f\u043e\u0434\u043a\u043b\u044e\u0447\u0430\u0435\u0442\u0441\u044f \u043a " + s
      );
      return 1;
   }

   public static BotClient requireBot(String var0) {
      BotClient botclient = HeadlessBots.get(var0);
      if (botclient == null) {
         StyledTextBuilder.RotationMLStrategy2("\u0411\u043e\u0442 " + var0 + " \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d");
      }

      return botclient;
   }

   public static void report(String var0, boolean var1) {
      MinecraftClient.getInstance().execute(() -> {
         if (var1) {
            StyledTextBuilder.RefreshCacheEvent(var0);
         } else {
            StyledTextBuilder.RotationMLStrategy2(var0);
         }
      });
   }
}
