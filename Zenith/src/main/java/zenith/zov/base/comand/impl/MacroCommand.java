package zenith.zov.base.comand.impl;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import net.minecraft.command.CommandSource;
import zenith.StringHolder_3;
import zenith.ZenithClient;
import zenith.TextHolder;
import zenith.macros;
import zenith.StringHolder$Helper_13;
import zenith.zov.base.comand.api.CommandAbstract;

public class MacroCommand extends CommandAbstract {
   private final SuggestionProvider<CommandSource> SUGGEST_KEYS = (commandcontext, suggestionsbuilder) -> {
      for (StringHolder_3 i11liiii1i11l11l11il : StringHolder_3.values()) {
         if (!i11liiii1i11l11l11il.lI1lIll1ll111lI.isEmpty()) {
            suggestionsbuilder.suggest(i11liiii1i11l11l11il.lI1lIll1ll111lI);
         }
      }

      return suggestionsbuilder.buildFuture();
   };

   public MacroCommand() {
      super("macro");
   }

   @Override
   public void execute(LiteralArgumentBuilder<CommandSource> literalargumentbuilder) {
      literalargumentbuilder.then(
         literal("add")
            .then(
               arg("name", StringArgumentType.word())
                  .then(
                     arg("key", StringArgumentType.word())
                        .suggests(this.SUGGEST_KEYS)
                        .then(arg("command", StringArgumentType.greedyString()).executes(commandcontext -> {
                           String s = (String)commandcontext.getArgument("name", String.class);
                           String s1 = (String)commandcontext.getArgument("key", String.class);
                           String s2 = (String)commandcontext.getArgument("command", String.class);
                           this.handleAddMacro(s, s1, s2);
                           return 1;
                        }))
                  )
            )
      );
      literalargumentbuilder.then(
         literal("remove")
            .then(
               arg("name", StringArgumentType.word())
                  .executes(
                     commandcontext -> {
                        String s = (String)commandcontext.getArgument("name", String.class);
                        StringHolder$Helper_13 lll111l1$ii1il11l111ii11iil = ZenithClient.getInstance()
                           .ZenithInternal137()
                           .IsPriorityHandler(s);
                        if (lll111l1$ii1il11l111ii11iil == null) {
                           TextHolder.StringHolder_26("Макрос не найден!");
                           return 1;
                        } else {
                           ZenithClient.getInstance().ZenithInternal137().ZenithInternal024(s);
                           TextHolder.EventImpl_27(s + " удален");
                           return 1;
                        }
                     }
                  )
            )
      );
      literalargumentbuilder.then(literal("clear").executes(commandcontext -> {
         ZenithClient.getInstance().ZenithInternal137().clear();
         TextHolder.EventImpl_27("Все макросы удалены");
         return 1;
      }));
      literalargumentbuilder.then(
         literal("list")
            .executes(
               commandcontext -> {
                  if (!ZenithClient.getInstance().ZenithInternal137().getItems().isEmpty()) {
                     for (StringHolder$Helper_13 lll111l1$ii1il11l111ii11iil : ZenithClient.getInstance()
                        .ZenithInternal137()
                        .getItems()) {
                        l11I1I1ll1Illll1I1l1111l1II.player.sendMessage(lll111l1$ii1il11l111ii11iil.toText(), false);
                     }
                  } else {
                     TextHolder.EventImpl_27("Список макросов пуст!");
                  }

                  return 1;
               }
            )
      );
   }

   private void handleAddMacro(String s, String s1, String s2) {
      macros macros = ZenithClient.getInstance().ZenithInternal137();
      int i = StringHolder_3.ZenithInternal115(s1);
      if (i == StringHolder_3.I1llll1lIlI1Ill1l11l1l1l.lIIl11lIl11l1l1lI11I1111I11) {
         TextHolder.StringHolder_26("Неизвестная клавиша: " + s1);
      } else {
         StringHolder$Helper_13 lll111l1$ii1il11l111ii11iilx = macros.IsPriorityHandler(s);
         if (lll111l1$ii1il11l111ii11iilx != null) {
            TextHolder.StringHolder_26("Макрос с таким именем уже существует!");
            TextHolder.EventImpl_27("Наведи мышку на сообщение ниже чтобы удалить его");
            l11I1I1ll1Illll1I1l1111l1II.player.sendMessage(lll111l1$ii1il11l111ii11iilx.toText(), false);
         } else {
            StringHolder$Helper_13 lll111l1$ii1il11l111ii11iilx = new StringHolder$Helper_13(s, i, s2);
            macros.StringHolder_8(lll111l1$ii1il11l111ii11iilx);
            l11I1I1ll1Illll1I1l1111l1II.player.sendMessage(lll111l1$ii1il11l111ii11iilx.toText(), false);
            TextHolder.EventImpl_27("Макрос добавлен");
         }
      }
   }
}
