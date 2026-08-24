package org.zenith.base.comand.impl;

import org.zenith.core.ColorAnimator;
import org.zenith.core.UiAnimation;
import org.zenith.core.LocaleEntry;
import org.zenith.event.RefreshCacheEvent;
import org.zenith.module.Module;

import org.zenith.module.NameProtect;
import org.zenith.module.StreamerMode;

import org.zenith.base.comand.api.CommandAbstract;
import org.zenith.base.comand.impl.args.PlayerArgumentType;
import org.zenith.module.NameProtect;
import org.zenith.module.StreamerMode;
import org.zenith.util.TextReplaceUtils;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.StyledTextBuilder;















import net.minecraft.client.MinecraftClient;
import com.google.gson.JsonElement;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.JsonOps;
import java.util.List;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.command.CommandSource;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.TextCodecs;

public class NameProtectCommand extends CommandAbstract {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public NameProtectCommand() {
      super("nameprotect");
   }

   @Override
   public void execute(LiteralArgumentBuilder<CommandSource> var1) {
      var1.then(
            literal("parse")
               .then(
                  arg("player", PlayerArgumentType.createDisplayed())
                     .executes(
                        var0 -> {
                           var list = minecraftClient3.inGameHud.getPlayerListHud().collectPlayerEntries();
                           String s = var0.getArgument("player", String.class);

                           for (int i = 0; i < list.size(); i++) {
                              PlayerListEntry playerlistentry = (PlayerListEntry)list.get(i);
                              String s1 = playerlistentry.getProfile().getName();
                              String s2 = StreamerMode.streamerMode.LocaleEntry(s1);
                              if (s1.equals(s) || s2.equals(s)) {
                                 Text text = minecraftClient3.inGameHud.getPlayerListHud().getPlayerName(playerlistentry);
                                 MutableText mutabletext = TextReplaceUtils.ColorAnimator(text, s2);
                                 if (mutabletext.getString().isEmpty()) {
                                    StyledTextBuilder.RefreshCacheEvent(
                                       "\u0423 \u0434\u0430\u043d\u043d\u043e\u0433\u043e \u0438\u0433\u0440\u043e\u043a\u0430 \u0432\u0438\u0434\u0438\u043c\u043e \u043d\u0435\u0442\u0443 \u0434\u043e\u043d\u0430\u0442\u0430"
                                    );
                                    return 1;
                                 }

                                 JsonElement jsonelement = TextCodecs.CODEC.encodeStart(JsonOps.INSTANCE, mutabletext).result().get();
                                 NameProtect.nameProtect.UiAnimation(jsonelement, i);
                              }
                           }

                           return 1;
                        }
                     )
               )
         )
         .executes(
            var0 -> {
               StyledTextBuilder.RefreshCacheEvent(
                  "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435 .nameprotect parse nick \u0438 .nameprotect clear "
               );
               return 1;
            }
         );
      var1.then(literal("clear").executes(var0 -> {
         NameProtect.nameProtect.call105();
         return 1;
      }));
   }
}
