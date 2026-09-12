package Nursultan;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.concurrent.CompletableFuture;
import minecraft.class07689;

public class class10843 implements ArgumentType<String> {
   static {
      N();
   }

   private static void N() {
   }

   public String parse(StringReader var1) throws CommandSyntaxException {
      String var2 = var1.getRemaining();
      var1.setCursor(var1.getTotalLength());
      return var2;
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      String var3 = var2.getRemaining();
      int var4 = var3.lastIndexOf("@");
      if (var4 == -1) {
         return var2.buildFuture();
      } else {
         if (var3.charAt(var3.length() - 1) == '@') {
            class11938.z().N(new class11953());
         }

         String var5 = var3.substring(var4 + 1);
         return class11938.z().E().stream().anyMatch(var1x -> var1x.startsWith(var5))
            ? class07689.y(class11938.z().E(), var2.createOffset(var2.getStart() + var4 + 1))
            : var2.buildFuture();
      }
   }
}
