package zenith.zov.base.comand.impl;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.command.CommandSource;
import net.minecraft.text.Text;
import zenith.NotificationsHolder;
import zenith.ZenithClient;
import zenith.TimerUtilHolder_2;
import zenith.StringHolder_25;
import zenith.zov.base.comand.api.CommandAbstract;

public class RCTCommand extends CommandAbstract {
   private final TimerUtilHolder_2 repository = ZenithClient.getInstance().FileHolder();

   public RCTCommand() {
      super("rct");
   }

   @Override
   public void execute(LiteralArgumentBuilder<CommandSource> literalargumentbuilder) {
      literalargumentbuilder.executes(
         commandcontext -> {
            StringHolder_25 li1l11l1iiil1l1liilliiii = ZenithClient.getInstance().SupplierHolder();
            if (!li1l11l1iiil1l1liilliiii.III11I1lI1I()) {
               NotificationsHolder.ZenithInternal076()
                  .StringHolder_8("0", Text.literal(" Не работает на этом " + net.minecraft.util.Formatting.RED + "сервере"));
               return 1;
            } else if (li1l11l1iiil1l1liilliiii.I1l1Illl1l11()) {
               NotificationsHolder.ZenithInternal076()
                  .StringHolder_8("️0", Text.literal(" Вы находитесь в режиме " + net.minecraft.util.Formatting.RED + "пвп"));
               return 1;
            } else {
               this.repository.longHolder_7(li1l11l1iiil1l1liilliiii.lIl1l1l11ll1lI1I1I());
               return 1;
            }
         }
      );
      literalargumentbuilder.then(
         CommandAbstract.method_96("anarchy", IntegerArgumentType.integer(1, 69))
            .executes(
               commandcontext -> {
                  StringHolder_25 li1l11l1iiil1l1liilliiii = ZenithClient.getInstance().SupplierHolder();
                  if (!li1l11l1iiil1l1liilliiii.III11I1lI1I()) {
                     NotificationsHolder.ZenithInternal076()
                        .StringHolder_8("0", Text.literal(" Не работает на этом " + net.minecraft.util.Formatting.RED + "сервере"));
                     return 1;
                  } else if (li1l11l1iiil1l1liilliiii.I1l1Illl1l11()) {
                     NotificationsHolder.ZenithInternal076()
                        .StringHolder_8("0", Text.literal(" Вы находитесь в режиме " + net.minecraft.util.Formatting.RED + "пвп"));
                     return 1;
                  } else {
                     int i = (Integer)commandcontext.getArgument("anarchy", Integer.class);
                     this.repository.longHolder_7(i);
                     return 1;
                  }
               }
            )
      );
   }
}
