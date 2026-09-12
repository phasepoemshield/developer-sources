package Nursultan;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.concurrent.CompletableFuture;
import minecraft.class00392;
import minecraft.class07689;

public class class10674 implements ArgumentType<Integer> {
   private static String[] R;
   public static Object N_0 = new SimpleCommandExceptionType(class00392.L(R[1]));
   public static Object N_1 = new DynamicCommandExceptionType(var0 -> class00392.N(R[0], new Object[]{var0}));
   public static Object N_2 = new Object2IntOpenHashMap();

   static {
      N();
      R();
      i();
      ((Object2IntMap)N_2).put(R[2], 86400);
      ((Object2IntMap)N_2).put(R[3], 3600);
      ((Object2IntMap)N_2).put(R[4], 60);
   }

   private static void i() {
   }

   private static void N() {
   }

   public Integer parse(StringReader var1) throws CommandSyntaxException {
      float var2 = var1.readFloat();
      String var3 = var1.readUnquotedString();
      int var4 = ((Object2IntMap)N_2).getOrDefault(var3, 0);
      if (var4 == 0) {
         throw ((SimpleCommandExceptionType)N_0).create();
      } else {
         int var5 = Math.round(var2 * (float)var4);
         if (var5 < 0) {
            throw ((DynamicCommandExceptionType)N_1).create(var5);
         } else {
            return var5;
         }
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      StringReader var3 = new StringReader(var2.getRemaining());

      try {
         var3.readFloat();
      } catch (CommandSyntaxException var5) {
         return var2.buildFuture();
      }

      return class07689.y(((Object2IntMap)N_2).keySet(), var2.createOffset(var2.getStart() + var3.getCursor()));
   }

   private static void R() {
      R = new String[5];
      R[0] = "argument.time.invalid_tick_count";
      R[1] = "argument.time.invalid_unit";
      R[2] = "d";
      R[3] = "h";
      R[4] = "m";
   }
}
