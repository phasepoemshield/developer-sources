package Nursultan;

import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import minecraft.class00487;
import minecraft.class04348;
import minecraft.class07263;

public class class09369<S> {
   private final class04348 N;
   private final class07263<S> y;
   private final List<class00487> L;
   private final List<CommandNode<S>> u;

   public class09369(class04348 var1, class07263<S> var2, List<class00487> var3) {
      this.N = var1;
      this.y = var2;
      this.L = var3;
      ObjectArrayList var4 = new ObjectArrayList();
      var4.size(var3.size());
      this.u = var4;
   }

   public CommandNode<S> N(int var1) {
      CommandNode var2 = this.u.get(var1);
      if (var2 != null) {
         return var2;
      } else {
         class00487 var3 = this.L.get(var1);
         Object var4;
         if (var3.N() == null) {
            var4 = new RootCommandNode();
         } else {
            ArgumentBuilder var5 = var3.N().N(this.N, this.y);
            if ((var3.y() & 8) != 0) {
               var5.redirect(this.N(var3.L()));
            }

            boolean var6 = (var3.y() & 4) != 0;
            boolean var7 = (var3.y() & 32) != 0;
            var4 = this.y.N(var5, var6, var7).build();
         }

         this.u.set(var1, (CommandNode<S>)var4);

         for (int var8 : var3.u()) {
            CommandNode var9 = this.N(var8);
            if (!(var9 instanceof RootCommandNode)) {
               var4.addChild(var9);
            }
         }

         return (CommandNode<S>)var4;
      }
   }
}
