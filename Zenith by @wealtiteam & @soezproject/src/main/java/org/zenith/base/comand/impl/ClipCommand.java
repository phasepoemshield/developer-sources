package org.zenith.base.comand.impl;

import org.zenith.ZenithClient;

import org.zenith.base.comand.api.CommandAbstract;
import org.zenith.base.comand.impl.args.CoordinateArgumentType;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.StyledTextBuilder;
import org.zenith.core.TextAccent;














import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.command.CommandSource;

public class ClipCommand extends CommandAbstract {
   @Override
   public void execute(LiteralArgumentBuilder<CommandSource> var1) {
      var1.then(
         literal("vclip")
            .then(
               arg("distance", CoordinateArgumentType.create())
                  .executes(
                     var0 -> {
                        double d0 = var0.getArgument("distance", Double.class);
                        ClientPlayerEntity clientplayerentity = MinecraftClient.getInstance().player;
                        if (clientplayerentity != null) {
                           clientplayerentity.setPosition(clientplayerentity.getX(), clientplayerentity.getY() + d0 + 0.1, clientplayerentity.getZ());
                           StyledTextBuilder.on23(
                              TextAccent.call002,
                              "\u0412\u0435\u0440\u0442\u0438\u043a\u0430\u043b\u044c\u043d\u044b\u0439 \u0432\u043a\u043b\u0438\u043f \u043d\u0430 "
                                 + d0
                                 + " \u0431\u043b\u043e\u043a\u043e\u0432"
                           );
                        }

                        return 1;
                     }
                  )
            )
      );
      var1.then(
         literal("hclip")
            .then(
               arg("distance", CoordinateArgumentType.create())
                  .executes(
                     var0 -> {
                        double d0 = var0.getArgument("distance", Double.class);
                        ClientPlayerEntity clientplayerentity = MinecraftClient.getInstance().player;
                        if (clientplayerentity != null) {
                           double d1 = Math.toRadians((double)clientplayerentity.getYaw());
                           clientplayerentity.setPosition(
                              clientplayerentity.getX() - Math.sin(d1) * d0, clientplayerentity.getY() + 0.1, clientplayerentity.getZ() + Math.cos(d1) * d0
                           );
                           StyledTextBuilder.on23(
                              TextAccent.call002,
                              "\u0413\u043e\u0440\u0438\u0437\u043e\u043d\u0442\u0430\u043b\u044c\u043d\u044b\u0439 \u0432\u043a\u043b\u0438\u043f \u043d\u0430 "
                                 + d0
                                 + " \u0431\u043b\u043e\u043a\u043e\u0432"
                           );
                        }

                        return 1;
                     }
                  )
            )
      );
      var1.then(
         literal("up")
            .then(
               arg("distance", CoordinateArgumentType.create())
                  .executes(
                     var0 -> {
                        double d0 = var0.getArgument("distance", Double.class);
                        ClientPlayerEntity clientplayerentity = MinecraftClient.getInstance().player;
                        if (clientplayerentity != null) {
                           clientplayerentity.setPosition(clientplayerentity.getX(), clientplayerentity.getY() + d0 + 0.1, clientplayerentity.getZ());
                           StyledTextBuilder.on23(
                              TextAccent.call002,
                              "\u0412\u043a\u043b\u0438\u043f \u0432\u0432\u0435\u0440\u0445 \u043d\u0430 " + d0 + " \u0431\u043b\u043e\u043a\u043e\u0432"
                           );
                        }

                        return 1;
                     }
                  )
            )
      );
      var1.then(
         literal("down")
            .then(
               arg("distance", CoordinateArgumentType.create())
                  .executes(
                     var0 -> {
                        double d0 = var0.getArgument("distance", Double.class);
                        ClientPlayerEntity clientplayerentity = MinecraftClient.getInstance().player;
                        if (clientplayerentity != null) {
                           clientplayerentity.setPosition(clientplayerentity.getX(), clientplayerentity.getY() - d0 + 0.1, clientplayerentity.getZ());
                           StyledTextBuilder.on23(
                              TextAccent.call002,
                              "\u0412\u043a\u043b\u0438\u043f \u0432\u043d\u0438\u0437 \u043d\u0430 " + d0 + " \u0431\u043b\u043e\u043a\u043e\u0432"
                           );
                        }

                        return 1;
                     }
                  )
            )
      );
      var1.then(
         literal("forward")
            .then(
               arg("distance", CoordinateArgumentType.create())
                  .executes(
                     var0 -> {
                        double d0 = var0.getArgument("distance", Double.class);
                        ClientPlayerEntity clientplayerentity = MinecraftClient.getInstance().player;
                        if (clientplayerentity != null) {
                           double d1 = Math.toRadians((double)clientplayerentity.getYaw());
                           clientplayerentity.setPosition(
                              clientplayerentity.getX() - Math.sin(d1) * d0, clientplayerentity.getY() + 0.1, clientplayerentity.getZ() + Math.cos(d1) * d0
                           );
                           StyledTextBuilder.on23(
                              TextAccent.call002,
                              "\u0412\u043a\u043b\u0438\u043f \u0432\u043f\u0435\u0440\u0435\u0434 \u043d\u0430 "
                                 + d0
                                 + " \u0431\u043b\u043e\u043a\u043e\u0432"
                           );
                        }

                        return 1;
                     }
                  )
            )
      );
      var1.then(
         literal("back")
            .then(
               arg("distance", CoordinateArgumentType.create())
                  .executes(
                     var0 -> {
                        double d0 = var0.getArgument("distance", Double.class);
                        ClientPlayerEntity clientplayerentity = MinecraftClient.getInstance().player;
                        if (clientplayerentity != null) {
                           double d1 = Math.toRadians((double)clientplayerentity.getYaw());
                           clientplayerentity.setPosition(
                              clientplayerentity.getX() + Math.sin(d1) * d0, clientplayerentity.getY() + 0.1, clientplayerentity.getZ() - Math.cos(d1) * d0
                           );
                           StyledTextBuilder.on23(
                              TextAccent.call002,
                              "\u0412\u043a\u043b\u0438\u043f \u043d\u0430\u0437\u0430\u0434 \u043d\u0430 " + d0 + " \u0431\u043b\u043e\u043a\u043e\u0432"
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
                     "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435: .clip <vclip/hclip/up/down/forward/back/help> [\u0440\u0430\u0441\u0441\u0442\u043e\u044f\u043d\u0438\u0435]"
                  );
                  StyledTextBuilder.on23(TextAccent.call002, "\u041f\u0440\u0438\u043c\u0435\u0440\u044b:");
                  StyledTextBuilder.on23(
                     TextAccent.call002,
                     ".clip vclip 10 - \u0432\u043a\u043b\u0438\u043f \u0432\u0432\u0435\u0440\u0445 \u043d\u0430 10 \u0431\u043b\u043e\u043a\u043e\u0432"
                  );
                  StyledTextBuilder.on23(
                     TextAccent.call002,
                     ".clip hclip 5 - \u0433\u043e\u0440\u0438\u0437\u043e\u043d\u0442\u0430\u043b\u044c\u043d\u044b\u0439 \u0432\u043a\u043b\u0438\u043f \u043d\u0430 5 \u0431\u043b\u043e\u043a\u043e\u0432"
                  );
                  StyledTextBuilder.on23(
                     TextAccent.call002,
                     ".clip up 3 - \u0432\u043a\u043b\u0438\u043f \u0432\u0432\u0435\u0440\u0445 \u043d\u0430 3 \u0431\u043b\u043e\u043a\u0430"
                  );
                  return 1;
               }
            )
      );
   }

   public ClipCommand() {
      super("clip");
   }
}
