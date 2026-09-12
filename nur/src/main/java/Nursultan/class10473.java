package Nursultan;

import it.unimi.dsi.fastutil.ints.Int2LongOpenHashMap;
import java.util.EnumSet;
import minecraft.class00143;
import minecraft.class00717;
import minecraft.class00751;
import minecraft.class02055;
import minecraft.class04227;
import minecraft.class04877;
import minecraft.class04882;
import minecraft.class05298;
import minecraft.class06584;
import minecraft.class07085;
import minecraft.class07430;
import minecraft.class07473;
import net.caffeinemc.mods.lithium.common.world.LithiumData;
import org.jspecify.annotations.Nullable;

public class class10473<T extends class04882> extends class07473 {
   private final T y;
   private Int2LongOpenHashMap L;
   @Nullable
   private class00143 u;
   @Nullable
   private class00717 i;

   public void L() {
      this.y.f().N(this.u, 1.15F);
   }

   private boolean M() {
      if (!this.y.NQ()) {
         return true;
      } else if (this.y.K().N()) {
         return true;
      } else if (!this.y.v()) {
         return true;
      } else {
         class06584 var10000 = this.y.method_6118(class07085.field_6169);
         class00751 var2 = this.y.method_56673().L(class04227.NF);
         if (class06584.N(var10000, this.N(var2))) {
            return true;
         } else {
            class04882 var1 = this.N.i.y(this.y.NO());
            return var1 != null && var1.method_5805();
         }
      }
   }

   public class10473(T var1, class04882 var2) {
      this.N = var1;
      this.L = new Int2LongOpenHashMap();
      this.y = (T)var2;
      this.N_71(EnumSet.of(class07430.field_18405));
   }

   public void i() {
      if (this.i != null && this.i.method_24516(this.y, 1.414)) {
         this.y.N(N_18(this.N.method_73183()), this.i);
      }
   }

   public void u() {
      this.u = null;
      this.i = null;
   }

   public boolean y() {
      if (this.i == null || this.u == null) {
         return false;
      } else if (this.i.method_31481()) {
         return false;
      } else {
         return this.u.L() ? false : !this.M();
      }
   }

   public boolean N() {
      if (this.M()) {
         return false;
      } else {
         Int2LongOpenHashMap var1 = new Int2LongOpenHashMap();
         double var2 = this.N.method_45325(class05298.P);

         for (class00717 var6 : this.y.method_73183().N(class00717.class, this.y.method_5829().L(var2, 8.0, var2), class04882.u)) {
            long var7 = this.L.getOrDefault(var6.method_5628(), Long.MIN_VALUE);
            if (this.N.method_73183().N() < var7) {
               var1.put(var6.method_5628(), var7);
            } else {
               class00143 var9 = this.y.f().N(var6, 1);
               if (var9 != null && var9.z()) {
                  this.u = var9;
                  this.i = var6;
                  return true;
               }

               var1.put(var6.method_5628(), this.N.method_73183().N() + 600L);
            }
         }

         this.L = var1;
         return false;
      }
   }

   private class06584 N(class02055 var1) {
      class06584 var2 = ((LithiumData)this.y.method_73183()).lithium$getData().ominousBanner();
      if (var2 == null) {
         var2 = class04877.N(var1);
      }

      return var2;
   }
}
