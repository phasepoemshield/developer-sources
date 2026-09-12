package Nursultan;

import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import minecraft.class00381;
import minecraft.class01296;
import minecraft.class01595;
import minecraft.class01599;
import minecraft.class04770;
import minecraft.class04813;
import minecraft.class06265;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07280;
import net.fabricmc.fabric.mixin.networking.accessor.EntityTrackerAccessor;

public class class10572 implements class01595, EntityTrackerAccessor {
   public final class01599 N;
   public final class07049 y;
   private final int R;
   public class01296 L;
   public final Set<class04813> u;

   private Set<class04813> L() {
      return new ReferenceOpenHashSet();
   }

   public class10572(class06265 var1, class07049 var2, int var3, int var4, boolean var5) {
      this.i = var1;
      this.u = this.L();
      this.N = new class01599(var1.u, var2, var4, var5, this);
      this.y = var2;
      this.R = var3;
      this.L = class01296.N(var2);
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof class10572 ? ((class10572)var1).y.method_5628() == this.y.method_5628() : false;
   }

   @Override
   public int hashCode() {
      return this.y.method_5628();
   }

   private int y() {
      int var1 = this.R;
      Iterator var2 = this.y.method_5736().iterator();

      while (var2.hasNext()) {
         int var4 = ((class07049)var2.next()).method_5864().W() * 16;
         if (var4 > var1) {
            var1 = var4;
         }
      }

      return this.N(var1);
   }

   public void y(class04770 var1) {
      if (var1 != this.y) {
         class06889 var2 = var1.method_73189().u(this.y.method_73189());
         int var3 = this.i.N(var1);
         double var4 = (double)Math.min(this.y(), var3 * 16);
         double var6 = var2.M * var2.M + var2.Z * var2.Z;
         double var8 = var4 * var4;
         if (var6 <= var8 && this.y.method_5680(var1) && this.i.N(var1, this.y.method_31476().B, this.y.method_31476().Z)) {
            if (this.u.add(var1.field_13987)) {
               this.N.y(var1);
               if (this.u.size() == 1) {
                  this.i.u.method_74535().N(this.y);
               }

               this.i.u.method_74535().N(var1, this.y);
            }
         } else {
            this.N(var1);
         }
      }
   }

   public void y(class00381<? super class07280> var1) {
      this.N(var1);
      class07049 var3 = this.y;
      if (var3 instanceof class04770) {
         ((class04770)var3).field_13987.method_14364(var1);
      }
   }

   private int N(int var1) {
      return this.i.u.method_8503().N(var1);
   }

   public void N(List<class04770> var1) {
      for (class04770 var3 : var1) {
         this.y(var3);
      }
   }

   public void N(class00381<? super class07280> var1) {
      Iterator<class04813> var2 = this.u.iterator();

      while (var2.hasNext()) {
         var2.next().method_14364(var1);
      }
   }

   public void N(class00381<? super class07280> var1, Predicate<class04770> var2) {
      for (class04813 var4 : this.u) {
         if (var2.test(var4.method_32311())) {
            var4.method_14364(var1);
         }
      }
   }

   public void N() {
      for (class04813 var2 : this.u) {
         this.N.N(var2.method_32311());
      }
   }

   public void N(class04770 var1) {
      if (this.u.remove(var1.field_13987)) {
         this.N.N(var1);
         if (this.u.isEmpty()) {
            this.i.u.method_74535().y(this.y);
         }
      }
   }
}
