package Nursultan;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.Map.Entry;
import minecraft.class00427;
import minecraft.class00437;
import minecraft.class00442;
import minecraft.class00449;
import minecraft.class00455;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class06968;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07321;

public class class10701<T> extends class06968<T> {
   private final Map<class07321, class10692<T>> y = new HashMap<>();
   private final Map<class07209, class10692<T>> L = new HashMap<>();
   private final Map<UUID, class10692<T>> u = new HashMap<>();

   public class10701(class00455<T> var1) {
      super(var1);
   }

   protected void y(class04770 var1, class07321 var2) {
      class10692 var3 = this.y.get(var2);
      if (var3 != null && var3.N != null) {
         var1.field_13987.method_14364(new class00427(var2, this.N.N(var3.N)));
      }

      for (Entry var5 : this.L.entrySet()) {
         Object var6 = ((class10692)var5.getValue()).N;
         if (var6 != null) {
            class07209 var7 = (class07209)var5.getKey();
            if (var2.y(var7)) {
               var1.field_13987.method_14364(new class00437(var7, this.N.N(var6)));
            }
         }
      }
   }

   protected void y(class04770 var1, class07049 var2) {
      class10692 var3 = this.u.get(var2.method_5667());
      if (var3 != null && var3.N != null) {
         var1.field_13987.method_14364(new class00449(var2.method_5628(), this.N.N(var3.N)));
      }
   }

   protected void y(class04782 var1) {
      for (Entry var3 : this.y.entrySet()) {
         class00442 var4 = ((class10692)var3.getValue()).N(this.N);
         if (var4 != null) {
            class07321 var5 = (class07321)var3.getKey();
            this.N(var1, var5, new class00427(var5, var4));
         }
      }

      for (Entry var9 : this.L.entrySet()) {
         class00442 var11 = ((class10692)var9.getValue()).N(this.N);
         if (var11 != null) {
            class07209 var13 = (class07209)var9.getKey();
            class07321 var6 = new class07321(var13);
            this.N(var1, var6, new class00437(var13, var11));
         }
      }

      for (Entry var10 : this.u.entrySet()) {
         class00442 var12 = ((class10692)var10.getValue()).N(this.N);
         if (var12 != null) {
            class07049 var14 = Objects.requireNonNull(var1.method_66347((UUID)var10.getKey()));
            this.N(var1, var14, new class00449(var14.method_5628(), var12));
         }
      }
   }

   public void N(class04782 var1, class07209 var2) {
      if ((class10692)this.L.remove(var2) != null) {
         class07321 var4 = new class07321(var2);
         this.N(var1, var4, new class00437(var2, this.N.N()));
      }
   }

   public void N(class07049 var1) {
      this.u.remove(var1.method_5667());
   }

   public void N(UUID var1, class10696<T> var2) {
      this.u.put(var1, new class10692<>(var2));
   }

   protected void N() {
      this.y.clear();
      this.L.clear();
      this.u.clear();
   }

   public void N(class07321 var1) {
      this.y.remove(var1);
      this.L.keySet().removeIf(var1::y);
   }

   public void N(class07209 var1, class10696<T> var2) {
      this.L.put(var1, new class10692<>(var2));
   }

   public void N(class07321 var1, class10696<T> var2) {
      this.y.put(var1, new class10692<>(var2));
   }
}
