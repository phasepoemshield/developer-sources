package Nursultan;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Pattern;
import minecraft.class00392;
import minecraft.class06541;
import minecraft.class07689;

public class class10860 implements ArgumentType<Integer> {
   public static Object N_0 = Pattern.compile("[0-9a-fA-F]{6}");
   public static Object N_1 = new DynamicCommandExceptionType(var0 -> class00392.y(class12020.N("blockesp.color-invalid").formatted(var0)));

   private static void L() {
      N_0 = null;
      N_1 = null;
   }

   static {
      N();
      L();
   }

   public Integer parse(StringReader var1) throws CommandSyntaxException {
      String var2 = var1.readString();
      if (((Pattern)N_0).matcher(var2).matches()) {
         return 0xFF000000 | Integer.parseInt(var2, 16);
      } else {
         class06541 var3 = class06541.y(var2);
         if (var3 != null && var3.u()) {
            return 0xFF000000 | var3.i();
         } else {
            throw ((DynamicCommandExceptionType)N_1).create(var2);
         }
      }
   }

   private static void N() {
   }

   public static int N(CommandContext<?> var0, String var1) {
      return (Integer)var0.getArgument(var1, Integer.class);
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return class07689.y(Arrays.stream(class06541.values()).filter(class06541::u).map(class06541::R), var2);
   }
}
