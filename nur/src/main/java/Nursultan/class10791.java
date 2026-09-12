package Nursultan;

import java.util.Collection;
import minecraft.class00381;
import minecraft.class00480;
import minecraft.class00768;
import minecraft.class02265;
import minecraft.class07769;
import minecraft.class07790;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class10791 {
   public final class08036 N;
   private boolean u;
   private int i;
   private int R;
   private int M;
   private int B;
   private boolean Z;
   private int z;
   public int y;

   public class10791(class07769 var1, class08036 var2) {
      this.L = var1;
      this.u = true;
      this.M = 127;
      this.B = 127;
      this.Z = true;
      this.N = var2;
   }

   public void y() {
      this.Z = true;
   }

   private class07790 N() {
      int var1 = this.i;
      int var2 = this.R;
      int var3 = this.M + 1 - this.i;
      int var4 = this.B + 1 - this.R;
      byte[] var5 = new byte[var3 * var4];

      for (int var6 = 0; var6 < var3; var6++) {
         for (int var7 = 0; var7 < var4; var7++) {
            var5[var6 + var7 * var3] = this.L.B[var1 + var6 + (var2 + var7) * 128];
         }
      }

      return new class07790(var1, var2, var3, var4, var5);
   }

   public void N(int var1, int var2) {
      if (this.u) {
         this.i = Math.min(this.i, var1);
         this.R = Math.min(this.R, var2);
         this.M = Math.max(this.M, var1);
         this.B = Math.max(this.B, var2);
      } else {
         this.u = true;
         this.i = var1;
         this.R = var2;
         this.M = var1;
         this.B = var2;
      }
   }

   @Nullable
   public class00381<?> N(class02265 var1) {
      class07790 var2;
      if (this.u) {
         this.u = false;
         var2 = this.N();
      } else {
         var2 = null;
      }

      Collection<class00768> var3;
      if (this.Z && this.z++ % 5 == 0) {
         this.Z = false;
         var3 = this.L.z.values();
      } else {
         var3 = null;
      }

      return var3 == null && var2 == null ? null : new class00480(var1, this.L.M, this.L.Z, var3, var2);
   }
}
