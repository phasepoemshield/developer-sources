package org.zenith.base.comand.impl;

import org.zenith.core.ItemSpec;
import org.zenith.event.Event01;
import org.zenith.ZenithClient;

import org.zenith.base.comand.api.CommandAbstract;
import org.zenith.managers.EmoteRegistry;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.StyledTextBuilder;
import org.zenith.core.TextAccent;














import net.minecraft.client.MinecraftClient;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.command.CommandSource;

public final class EmoteCommand extends CommandAbstract {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public EmoteCommand() {
      super("emote");
   }

   @Override
   public void execute(LiteralArgumentBuilder<CommandSource> var1) {
      var1.executes(
         var0 -> {
            StyledTextBuilder.on23(
               TextAccent.call002,
               "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435: .emote <id>, .emote stop \u0438\u043b\u0438 .emote list"
            );
            return 1;
         }
      );
      var1.then(
         literal("list")
            .executes(
               var0 -> {
                  StyledTextBuilder.on23(
                     TextAccent.call002,
                     "\u0414\u043e\u0441\u0442\u0443\u043f\u043d\u044b\u0435 \u0430\u043d\u0438\u043c\u0430\u0446\u0438\u0438: "
                        + String.join(", ", EmoteRegistry.map56())
                  );
                  return 1;
               }
            )
      );
      var1.then(literal("stop").executes(var0 -> {
         if (minecraftClient3.player != null) {
            EmoteRegistry.ItemSpec(minecraftClient3.player.getUuid());
         }

         return 1;
      }));
      var1.then(
         arg("id", StringArgumentType.word())
            .executes(
               var0 -> {
                  String s = StringArgumentType.getString(var0, "id");
                  if (!EmoteRegistry.Event01(s)) {
                     StyledTextBuilder.on23(
                        TextAccent.call417,
                        "\u041d\u0435\u0438\u0437\u0432\u0435\u0441\u0442\u043d\u0430\u044f \u0430\u043d\u0438\u043c\u0430\u0446\u0438\u044f: "
                           + s
                           + ". \u0418\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0439\u0442\u0435 .emote list"
                     );
                  }

                  return 1;
               }
            )
      );
   }
}
