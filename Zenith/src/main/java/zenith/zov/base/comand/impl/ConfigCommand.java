package zenith.zov.base.comand.impl;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.io.IOException;
import java.util.List;
import net.minecraft.command.CommandSource;
import zenith.ZenithClient;
import zenith.TextHolder;
import zenith.StringHolder$Helper_3;
import zenith.FileHolder_2;
import zenith.zov.base.comand.api.CommandAbstract;
import zenith.zov.base.comand.impl.args.CfgArgumentType;

public class ConfigCommand extends CommandAbstract {
   public ConfigCommand() {
      super("cfg");
   }

   @Override
   public void execute(LiteralArgumentBuilder<CommandSource> literalargumentbuilder) {
      literalargumentbuilder.then(
         ((LiteralArgumentBuilder)literal("save")
               .executes(
                  commandcontext -> {
                     boolean flag = ZenithClient.getInstance().ZenithInternal115().StringHolder_24("current_config");
                     if (flag) {
                        TextHolder.StringHolder_8(
                           StringHolder$Helper_3.IIlIllllI1lIlll11l, "Конфигурация сохранена"
                        );
                     } else {
                        TextHolder.StringHolder_8(
                           StringHolder$Helper_3.II11I1I1II1Ill1ll1l11lI1, "Ошибка при сохранении конфигурации"
                        );
                     }

                     return 1;
                  }
               ))
            .then(
               arg("name", CfgArgumentType.create())
                  .executes(
                     commandcontext -> {
                        boolean flag = ZenithClient.getInstance()
                           .ZenithInternal115()
                           .StringHolder_24((String)commandcontext.getArgument("name", String.class));
                        if (flag) {
                           TextHolder.StringHolder_8(
                              StringHolder$Helper_3.IIlIllllI1lIlll11l, "Конфигурация сохранена"
                           );
                        } else {
                           TextHolder.StringHolder_8(
                              StringHolder$Helper_3.II11I1I1II1Ill1ll1l11lI1, "Ошибка при сохранении конфигурации"
                           );
                        }

                        return 1;
                     }
                  )
            )
      );
      literalargumentbuilder.then(literal("list").executes(commandcontext -> {
         List list = ZenithClient.getInstance().ZenithInternal115().StringHolder_29();
         if (list.isEmpty()) {
            TextHolder.EventImpl_27("Список конфигов пуст!");
         } else {
            list.forEach(TextHolder::EventImpl_27);
         }

         return 1;
      }));
      literalargumentbuilder.then(
         ((LiteralArgumentBuilder)literal("load")
               .executes(
                  commandcontext -> {
                     boolean flag = ZenithClient.getInstance()
                        .ZenithInternal115()
                        .SecretKeySpecHolder("current_config");
                     if (flag) {
                        TextHolder.StringHolder_8(
                           StringHolder$Helper_3.IIlIllllI1lIlll11l, "Конфигурация загружена"
                        );
                     } else {
                        TextHolder.StringHolder_8(
                           StringHolder$Helper_3.II11I1I1II1Ill1ll1l11lI1, "Ошибка при загрузке конфигурации"
                        );
                     }

                     return 1;
                  }
               ))
            .then(
               arg("name", CfgArgumentType.create())
                  .executes(
                     commandcontext -> {
                        boolean flag = ZenithClient.getInstance()
                           .ZenithInternal115()
                           .SecretKeySpecHolder((String)commandcontext.getArgument("name", String.class));
                        if (flag) {
                           TextHolder.StringHolder_8(
                              StringHolder$Helper_3.IIlIllllI1lIlll11l, "Конфигурация загружена"
                           );
                        } else {
                           TextHolder.StringHolder_8(
                              StringHolder$Helper_3.II11I1I1II1Ill1ll1l11lI1, "Ошибка при загрузке конфигурации"
                           );
                        }

                        return 1;
                     }
                  )
            )
      );
      literalargumentbuilder.then(
         literal("help")
            .executes(
               commandcontext -> {
                  TextHolder.StringHolder_8(
                     StringHolder$Helper_3.IIlIllllI1lIlll11l, "Использование: §r.config <list/save/load/help>"
                  );
                  TextHolder.StringHolder_8(StringHolder$Helper_3.IIlIllllI1lIlll11l, "Команды:§r");
                  TextHolder.StringHolder_8(
                     StringHolder$Helper_3.IIlIllllI1lIlll11l, ".config save §7- сохранить конфигурацию"
                  );
                  TextHolder.StringHolder_8(
                     StringHolder$Helper_3.IIlIllllI1lIlll11l, ".config load §7- загрузить конфигурацию"
                  );
                  return 1;
               }
            )
      );
      literalargumentbuilder.then(literal("dir").executes(commandcontext -> {
         try {
            Runtime.getRuntime().exec("explorer " + FileHolder_2.l1I11IIIl11lIIllI1II1lI1I1.getAbsolutePath());
         } catch (IOException ioexception) {
         }

         return 1;
      }));
   }
}
