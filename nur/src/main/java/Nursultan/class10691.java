package Nursultan;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.context.ParsedCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import java.util.List;
import java.util.Map;
import minecraft.class00392;
import minecraft.class06541;
import minecraft.class07689;

public class class10691 extends class10742 {
   static {
      y();
   }

   private int y(CommandContext<class07689> var1) {
      CommandDispatcher var2 = (CommandDispatcher)class10626.N_0;

      for (String var5 : var2.getSmartUsage(var2.getRoot(), (class07689)var1.getSource()).values()) {
         this.N("", var5);
      }

      return 1;
   }

   private static void y() {
   }

   private int y(CommandContext<class07689> var1, String var2) {
      ParseResults var3 = ((CommandDispatcher)class10626.N_0).parse((String)var2, (class07689)var1.getSource());
      List var4 = var3.getContext().getNodes();
      if (var4.isEmpty()) {
         class11303.y(class11921.N("help.not-found", class06541.field_1068 + var2 + class06541.field_1061).N(class06541.field_1061));
         return 0;
      } else {
         CommandNode var5 = ((ParsedCommandNode)var4.get(var4.size() - 1)).getNode();
         Map var6 = ((CommandDispatcher)class10626.N_0).getSmartUsage(var5, (class07689)var1.getSource());
         String var7 = var3.getReader().getString() + " ";
         if (var6.isEmpty()) {
            this.N("", var3.getReader().getString());
            return 1;
         } else {
            for (String var9 : var6.values()) {
               this.N(var7, var9);
            }

            return var6.size();
         }
      }
   }

   private void N(String var1, String var2) {
      String var3 = (var1 + var2).replace("|", " | ");
      int var4 = var3.indexOf(" ");
      String var5 = var3;
      String var6 = "";
      if (var4 != -1) {
         var5 = var3.substring(0, var4);
         var6 = var3.substring(var4);
      }

      class11303.y(class00392.y((Character)class10626.N_1 + var5).N(class06541.field_1068).y(class00392.y(var6).N(class06541.field_1080)));
   }

   @Override
   public void N(CommandDispatcher<class07689> var1) {
      var1.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)this.N("help").executes(this::y)).then(this.R()));
   }

   private RequiredArgumentBuilder<class07689, String> R() {
      return (RequiredArgumentBuilder<class07689, String>)this.N("command", StringArgumentType.greedyString())
         .executes(var1 -> this.y(var1, StringArgumentType.getString(var1, "command")));
   }
}
