package Nursultan;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class07689;
import org.joml.Vector2d;

public class class10726 implements ArgumentType<Vector2d> {
   public static Vector2d N(CommandContext<class07689> var0, String var1) {
      return (Vector2d)var0.getArgument(var1, Vector2d.class);
   }

   public Vector2d parse(StringReader var1) throws CommandSyntaxException {
      class06202 var2 = class06202.Nq();
      double var3;
      if (var1.peek() == '~') {
         var3 = ((class04453)var2.T_4).method_23317();
         var1.skip();
      } else {
         var3 = var1.readDouble();
      }

      if (var1.peek() == ' ') {
         var1.skip();
      }

      double var5;
      if (var1.peek() == '~') {
         var5 = ((class04453)var2.T_4).method_23321();
         var1.skip();
      } else {
         var5 = var1.readDouble();
      }

      return new Vector2d(var3, var5);
   }
}
