package Nursultan;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class07689;
import org.joml.Vector3d;

public class class09387 implements ArgumentType<Vector3d> {
   public Vector3d parse(StringReader var1) throws CommandSyntaxException {
      class06202 var2 = class06202.Nq();
      int var3;
      if (var1.peek() == '~') {
         var3 = (int)((class04453)var2.T_4).method_23317();
         var1.skip();
      } else {
         var3 = var1.readInt();
      }

      if (var1.peek() == ' ') {
         var1.skip();
      }

      int var4;
      if (var1.peek() == '~') {
         var4 = (int)((class04453)var2.T_4).method_23318();
         var1.skip();
      } else {
         var4 = var1.readInt();
      }

      if (var1.peek() == ' ') {
         var1.skip();
      }

      int var5;
      if (var1.peek() == '~') {
         var5 = (int)((class04453)var2.T_4).method_23321();
         var1.skip();
      } else {
         var5 = var1.readInt();
      }

      return new Vector3d((double)var3, (double)var4, (double)var5);
   }

   public static Vector3d N(CommandContext<class07689> var0, String var1) {
      return (Vector3d)var0.getArgument(var1, Vector3d.class);
   }
}
