package org.zenith.base.comand.impl;

import org.zenith.ZenithClient;

import org.zenith.base.comand.api.CommandAbstract;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.StyledTextBuilder;
import org.zenith.core.TextAccent;














import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.math.BigDecimal;
import java.math.RoundingMode;
import net.minecraft.command.CommandSource;

public class CalcCommand extends CommandAbstract {
   public CalcCommand() {
      super("calc");
   }

   @Override
   public void execute(LiteralArgumentBuilder<CommandSource> var1) {
      var1.executes(
         var0 -> {
            StyledTextBuilder.on23(
               TextAccent.call002,
               "\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435: .calc <\u0432\u044b\u0440\u0430\u0436\u0435\u043d\u0438\u0435>"
            );
            StyledTextBuilder.on23(
               TextAccent.call002,
               "\u041f\u0440\u0438\u043c\u0435\u0440: .calc (2 + 2) * 2 \u0438\u043b\u0438 .calc 64 * 3.5\u043a\u043a, \u043f\u043e\u0434\u0440\u043e\u0431\u043d\u0435\u0435: .calc help"
            );
            return 1;
         }
      );
      var1.then(
         literal("help")
            .executes(
               var0 -> {
                  StyledTextBuilder.on23(
                     TextAccent.call002,
                     "\u041e\u043f\u0435\u0440\u0430\u0442\u043e\u0440\u044b: + - * / ^ \u0438 \u0441\u043a\u043e\u0431\u043a\u0438, \u0443\u043c\u043d\u043e\u0436\u0435\u043d\u0438\u0435 \u043c\u043e\u0436\u043d\u043e \u043f\u0438\u0441\u0430\u0442\u044c \u043a\u0430\u043a x \u0438\u043b\u0438 \u0445"
                  );
                  StyledTextBuilder.on23(
                     TextAccent.call002,
                     "\u0427\u0438\u0441\u043b\u0430: 1.5 \u0438\u043b\u0438 1,5; \u0441\u0443\u0444\u0444\u0438\u043a\u0441\u044b \u043a/\u043a\u043a/\u043a\u043a\u043a: 1\u043a\u043a = 1 000 000"
                  );
                  StyledTextBuilder.on23(
                     TextAccent.call002,
                     "\u041f\u0440\u043e\u0446\u0435\u043d\u0442 \u043e\u0442 \u0447\u0438\u0441\u043b\u0430: .calc 250 + 10% = 275, .calc 1\u043a\u043a - 15% = 850 000"
                  );
                  StyledTextBuilder.on23(
                     TextAccent.call002,
                     "\u0424\u0443\u043d\u043a\u0446\u0438\u0438: sqrt, cbrt, abs, round, floor, ceil, sin, cos, tan, ln, log; \u043a\u043e\u043d\u0441\u0442\u0430\u043d\u0442\u044b pi, e"
                  );
                  StyledTextBuilder.on23(
                     TextAccent.call002,
                     "\u041f\u0440\u0438\u043c\u0435\u0440: .calc sqrt(16) + 2 ^ 10 \u0438\u043b\u0438 .calc (27 * 1.8\u043a\u043a) - 10%"
                  );
                  return 1;
               }
            )
      );
      var1.then(arg("expression", StringArgumentType.greedyString()).executes(var1x -> {
         String s = var1x.getArgument("expression", String.class).trim();

         try {
            double d0 = new CalcCommand_ExpressionParser(s).parse();
            StyledTextBuilder.on23(TextAccent.call002, s + " = " + this.format(d0));
         } catch (CalcCommand_CalcException calccommand_calcexception) {
            StyledTextBuilder.on23(TextAccent.call417, calccommand_calcexception.getMessage());
         }

         return 1;
      }));
   }

   public String format(double var1) {
      BigDecimal bigdecimal = BigDecimal.valueOf(var1).setScale(10, RoundingMode.HALF_UP).stripTrailingZeros();
      if (bigdecimal.compareTo(BigDecimal.ZERO) == 0) {
         bigdecimal = BigDecimal.ZERO;
      }

      String s = bigdecimal.toPlainString();
      boolean flag = s.startsWith("-");
      if (flag) {
         s = s.substring(1);
      }

      int i = s.indexOf(46);
      String s1 = i == -1 ? s : s.substring(0, i);
      String s2 = i == -1 ? "" : s.substring(i);
      StringBuilder stringbuilder = new StringBuilder();

      for (int j = 0; j < s1.length(); j++) {
         if (j > 0 && (s1.length() - j) % 3 == 0) {
            stringbuilder.append(' ');
         }

         stringbuilder.append(s1.charAt(j));
      }

      return (flag ? "-" : "") + stringbuilder + s2;
   }
}
