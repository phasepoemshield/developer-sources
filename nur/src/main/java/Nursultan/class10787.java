package Nursultan;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import minecraft.class00392;

public class class10787 implements ArgumentType<Character> {
   public static Object N_0 = new DynamicCommandExceptionType(var0 -> class00392.y(class12020.N("prefix.error")));

   static {
      N();
      u();
   }

   private static void u() {
      N_0 = null;
   }

   public Character parse(StringReader var1) throws CommandSyntaxException {
      String var2 = var1.getRemaining();
      if (!var2.isBlank() && !var2.equals("/") && !var2.equals("#")) {
         var1.setCursor(var1.getCursor() + 1);
         return var2.charAt(0);
      } else {
         throw ((DynamicCommandExceptionType)N_0).create(var2);
      }
   }

   private static void N() {
   }

   public static Character N(CommandContext<?> var0, String var1) {
      return (Character)var0.getArgument(var1, Character.class);
   }
}
