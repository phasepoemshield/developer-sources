package zenith.zov.base.comand.impl;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.command.CommandSource;
import zenith.ZenithClient;
import zenith.TextHolder;
import zenith.StringHolder$Helper_3;
import zenith.zov.base.comand.api.CommandAbstract;
import zenith.zov.base.comand.impl.args.FriendArgumentType;
import zenith.zov.base.comand.impl.args.PlayerArgumentType;

public class FriendCommand extends CommandAbstract {
   public FriendCommand() {
      super("friend");
   }

   @Override
   public void execute(LiteralArgumentBuilder<CommandSource> literalargumentbuilder) {
      literalargumentbuilder.then(literal("add").then(arg("player", PlayerArgumentType.create()).executes(commandcontext -> {
         String s = (String)commandcontext.getArgument("player", String.class);
         if (ZenithClient.getInstance().StringHolder_26().getItems().contains(s)) {
            TextHolder.StringHolder_8(StringHolder$Helper_3.II11I1I1II1Ill1ll1l11lI1, "Уже добавлен " + s);
            return 1;
         } else {
            ZenithClient.getInstance().StringHolder_26().add(s);
            TextHolder.StringHolder_8(StringHolder$Helper_3.IIlIllllI1lIlll11l, "Добавили " + s);
            return 1;
         }
      })));
      literalargumentbuilder.then(literal("remove").then(arg("player", FriendArgumentType.create()).executes(commandcontext -> {
         String s = (String)commandcontext.getArgument("player", String.class);
         ZenithClient.getInstance().StringHolder_26().ZenithInternal033(s);
         TextHolder.StringHolder_8(StringHolder$Helper_3.IIlIllllI1lIlll11l, s + " удален из друзей");
         return 1;
      })));
      literalargumentbuilder.then(
         literal("list")
            .executes(
               commandcontext -> {
                  TextHolder.StringHolder_8(
                     StringHolder$Helper_3.IIlIllllI1lIlll11l,
                     ZenithClient.getInstance().StringHolder_26().getItems().toString()
                  );
                  return 1;
               }
            )
      );
   }
}
