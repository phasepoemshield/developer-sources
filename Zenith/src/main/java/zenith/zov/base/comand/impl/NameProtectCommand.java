package zenith.zov.base.comand.impl;

import com.google.gson.JsonElement;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.serialization.JsonOps;
import java.util.List;
import net.minecraft.command.CommandSource;
import net.minecraft.text.Text;
import net.minecraft.text.MutableText;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.text.TextCodecs;
import zenith.Nameprotect;
import zenith.TextHolder;
import zenith.StringHolder_21;
import zenith.zov.base.comand.api.CommandAbstract;
import zenith.zov.base.comand.impl.args.PlayerArgumentType;

public class NameProtectCommand extends CommandAbstract {
   public NameProtectCommand() {
      super("nameprotect");
   }

   @Override
   public void execute(LiteralArgumentBuilder<CommandSource> literalargumentbuilder) {
      ((LiteralArgumentBuilder)literalargumentbuilder.then(literal("parse").then(arg("player", PlayerArgumentType.create()).executes(commandcontext -> {
         List list = l11I1I1ll1Illll1I1l1111l1II.inGameHud.getPlayerListHud().collectPlayerEntries();
         String s = (String)commandcontext.getArgument("player", String.class);

         for (int i = 0; i < list.size(); i++) {
            PlayerListEntry PlayerListEntry = (PlayerListEntry)list.get(i);
            if (PlayerListEntry.getProfile().getName().equals(s)) {
               Text Text = l11I1I1ll1Illll1I1l1111l1II.inGameHud.getPlayerListHud().getPlayerName(PlayerListEntry);
               MutableText MutableText = StringHolder_21.EventBus(Text, PlayerListEntry.getProfile().getName());
               if (MutableText.getString().isEmpty()) {
                  TextHolder.EventImpl_27("У данного игрока видимо нету доната");
                  return 1;
               }

               JsonElement jsonelement = (JsonElement)TextCodecs.CODEC.encodeStart(JsonOps.INSTANCE, MutableText).result().get();
               Nameprotect.l1I1I1l1lI11l111I1lI111llll1l.EventBus(jsonelement, i);
            }
         }

         return 1;
      })))).executes(commandcontext -> {
         TextHolder.EventImpl_27("Использование .nameprotect parse nick и .nameprotect clear ");
         return 1;
      });
      literalargumentbuilder.then(literal("clear").executes(commandcontext -> {
         Nameprotect.l1I1I1l1lI11l111I1lI111llll1l.IIl11Il1II();
         return 1;
      }));
   }
}
