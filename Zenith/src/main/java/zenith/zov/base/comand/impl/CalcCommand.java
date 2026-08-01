package zenith.zov.base.comand.impl;

import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.math.BigDecimal;
import net.minecraft.command.CommandSource;
import zenith.TextHolder;
import zenith.StringHolder$Helper_3;
import zenith.zov.base.comand.api.CommandAbstract;

public class CalcCommand extends CommandAbstract {
   public CalcCommand() {
      super("calc");
   }

   @Override
   public void execute(LiteralArgumentBuilder<CommandSource> literalargumentbuilder) {
      literalargumentbuilder.executes(
         commandcontext -> {
            TextHolder.StringHolder_8(
               StringHolder$Helper_3.IIlIllllI1lIlll11l, "Испольнование: .calc <1 число> <+, -, x, /> <2 число>"
            );
            TextHolder.StringHolder_8(StringHolder$Helper_3.IIlIllllI1lIlll11l, "Пример: .calc 2 + 2");
            return 1;
         }
      );
      literalargumentbuilder.then(
         literal("help")
            .executes(
               commandcontext -> {
                  TextHolder.StringHolder_8(
                     StringHolder$Helper_3.IIlIllllI1lIlll11l, "Использование: .calc <1 число> <+, -, x, /> <2 число>"
                  );
                  TextHolder.StringHolder_8(StringHolder$Helper_3.IIlIllllI1lIlll11l, "Пример: .calc 10 * 2");
                  return 1;
               }
            )
      );
      literalargumentbuilder.then(
         arg("number1", DoubleArgumentType.doubleArg())
            .then(
               arg("operator", StringArgumentType.word())
                  .then(
                     arg("number2", DoubleArgumentType.doubleArg())
                        .executes(
                           commandcontext -> {
                              double d0 = (Double)commandcontext.getArgument("number1", Double.class);
                              String s = (String)commandcontext.getArgument("operator", String.class);
                              double d1 = (Double)commandcontext.getArgument("number2", Double.class);
                              double d2;
                              switch (s) {
                                 case "+":
                                    d2 = d0 + d1;
                                    break;
                                 case "-":
                                    d2 = d0 - d1;
                                    break;
                                 case "x":
                                 case "X":
                                    d2 = d0 * d1;
                                    break;
                                 case "/":
                                    if (d1 == 0.0) {
                                       TextHolder.StringHolder_8(
                                          StringHolder$Helper_3.llIIII1I1I11IIlI1l1ll1lIII11ll, "Делить на 0 нельзя!"
                                       );
                                       return 1;
                                    }

                                    d2 = d0 / d1;
                                    break;
                                 default:
                                    TextHolder.StringHolder_8(
                                       StringHolder$Helper_3.llIIII1I1I11IIlI1l1ll1lIII11ll, "Неизвестный оператор: " + s
                                    );
                                    return 1;
                              }

                              TextHolder.StringHolder_8(
                                 StringHolder$Helper_3.IIlIllllI1lIlll11l,
                                 this.format(d0) + " " + s + " " + this.format(d1) + " = " + this.format(d2)
                              );
                              return 1;
                           }
                        )
                  )
            )
      );
   }

   private String format(double d0) {
      return !Double.isNaN(d0) && !Double.isInfinite(d0) ? BigDecimal.valueOf(d0).stripTrailingZeros().toPlainString() : String.valueOf(d0);
   }
}
