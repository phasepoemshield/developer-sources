package Nursultan;

import com.google.common.collect.Lists;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.ArrayList;
import minecraft.class00392;
import minecraft.class06790;
import minecraft.class06794;
import minecraft.class07689;

public class class10684 implements ArgumentType<class10620> {
   public class10620 parse(StringReader var1) throws CommandSyntaxException {
      String var2 = var1.getString().substring(var1.getCursor(), var1.getTotalLength());
      ArrayList var3 = Lists.newArrayList();
      int var4 = var1.getCursor();

      while (true) {
         int var5;
         class06794 var6;
         while (true) {
            if (!var1.canRead()) {
               return new class10620(var2, var3.toArray(new class10580[0]));
            }

            if (var1.peek() == '@') {
               var5 = var1.getCursor();

               try {
                  var6 = new class06790(var1, true).v();
                  break;
               } catch (CommandSyntaxException var8) {
                  if (var8.getType() != class06790.B && var8.getType() != class06790.R) {
                     throw var8;
                  }

                  var1.setCursor(var5 + 1);
               }
            } else {
               var1.skip();
            }
         }

         var3.add(new class10580(var5 - var4, var1.getCursor() - var4, var6));
      }
   }

   public static class00392 N(CommandContext<class07689> var0, String var1) {
      return ((class10620)var0.getArgument(var1, class10620.class)).N((class07689)var0.getSource(), true);
   }
}
