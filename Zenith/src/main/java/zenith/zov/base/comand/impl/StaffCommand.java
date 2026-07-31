package zenith.zov.base.comand.impl;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.command.CommandSource;
import zenith.ZenithClient;
import zenith.TextHolder;
import zenith.StringHolder$Helper_3;
import zenith.zov.base.comand.api.CommandAbstract;
import zenith.zov.base.comand.impl.args.PlayerArgumentType;
import zenith.zov.base.comand.impl.args.StaffArgumentType;

public class StaffCommand extends CommandAbstract {
   public StaffCommand() {
      super("staff");
   }

   @Override
   public void execute(LiteralArgumentBuilder<CommandSource> literalargumentbuilder) {
      literalargumentbuilder.then(literal("add").then(arg("player", PlayerArgumentType.create()).executes(commandcontext -> {
         String s = (String)commandcontext.getArgument("player", String.class);
         if (ZenithClient.getInstance().floatHolder_11().getItems().contains(s)) {
            TextHolder.StringHolder_8(StringHolder$Helper_3.II11I1I1II1Ill1ll1l11lI1, "Уже добавлен " + s);
            return 1;
         } else {
            ZenithClient.getInstance().floatHolder_11().add(s);
            TextHolder.StringHolder_8(StringHolder$Helper_3.IIlIllllI1lIlll11l, "Добавили " + s);
            return 1;
         }
      })));
      literalargumentbuilder.then(literal("remove").then(arg("player", StaffArgumentType.create()).executes(commandcontext -> {
         String s = (String)commandcontext.getArgument("player", String.class);
         ZenithClient.getInstance().floatHolder_11().remove(s);
         TextHolder.StringHolder_8(StringHolder$Helper_3.IIlIllllI1lIlll11l, s + " удален из стаффа");
         return 1;
      })));
      literalargumentbuilder.then(
         literal("list")
            .executes(
               commandcontext -> {
                  TextHolder.StringHolder_8(
                     StringHolder$Helper_3.IIlIllllI1lIlll11l,
                     ZenithClient.getInstance().floatHolder_11().getItems().toString()
                  );
                  return 1;
               }
            )
      );
   }
}
