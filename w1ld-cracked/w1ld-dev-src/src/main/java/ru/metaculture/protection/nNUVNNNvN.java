package ru.metaculture.protection;

import java.util.Objects;
import org.wild.module.api.Module;

abstract class nNUVNNNvN<T> implements VNVnNUnuUU {
   private static final uvNNUnnUvU C00OOC00oO = (var0, var1, var2, var4, var6) -> {};
   protected static final String UuUVuuUu = "New Value";
   private final unNVnvNVNvVV uUnuvNvvNU;
   private final VvnNUnUu vVvUvVVuuNvV;
   private CCO0oCC0Oo.nvnNNunvv uNNnnnuuuN = new CCO0oCC0Oo.nvnNNunvv(0.0F, 0.0F, 0.0F, 0.0F);

   nNUVNNNvN(unNVnvNVNvVV var1, VvnNUnUu var2) {
      this.uUnuvNvvNU = Objects.requireNonNull(var1, "model");
      this.vVvUvVVuuNvV = Objects.requireNonNull(var2, "widget");
   }

   protected final unNVnvNVNvVV UuUVuuUu() {
      return this.uUnuvNvvNU;
   }

   protected final VvnNUnUu C00OOC00oO() {
      return this.vVvUvVVuuNvV;
   }

   protected final uvNNUnnUvU uUnuvNvvNU() {
      return C00OOC00oO;
   }

   protected static uvNNUnnUvU vVvUvVVuuNvV() {
      return C00OOC00oO;
   }

   protected static Module UuUVuuUu(unNVnvNVNvVV var0) {
      Module var1 = var0.C00OOC00oO();
      if (var1 == null) {
         throw new IllegalStateException("Bind popup model is missing module context");
      } else {
         return var1;
      }
   }

   @Override
   public void UuUVuuUu(CCO0oCC0Oo.nvnNNunvv var1) {
      Objects.requireNonNull(var1, "area");
      this.uNNnnnuuuN = var1;
      this.vVvUvVVuuNvV.UuUVuuUu(var1.UuUVuuUu(), var1.C00OOC00oO(), var1.uUnuvNvvNU());
   }

   @Override
   public float uNNnnnuuuN() {
      return this.vVvUvVVuuNvV.C00OOC00oO();
   }

   @Override
   public void nuUnNvnuUu() {
      this.vVvUvVVuuNvV.UuUVuuUu();
   }

   @Override
   public void UuUVuuUu(double var1, double var3) {
      this.vVvUvVVuuNvV.UuUVuuUu(var1, var3);
   }

   @Override
   public boolean UuUVuuUu(double var1, double var3, int var5) {
      if (this.vVvUvVVuuNvV.uNNnnnuuuN()) {
         return this.vVvUvVVuuNvV.C00OOC00oO(var1, var3, var5) ? true : true;
      } else {
         return !this.uNNnnnuuuN.UuUVuuUu(var1, var3) ? false : this.vVvUvVVuuNvV.UuUVuuUu(var1, var3, var5);
      }
   }

   @Override
   public boolean UuUVuuUu(double var1, double var3, double var5, double var7) {
      if (this.vVvUvVVuuNvV.uNNnnnuuuN()) {
         return this.vVvUvVVuuNvV.UuUVuuUu(var1, var3, var5, var7) ? true : true;
      } else {
         return !this.uNNnnnuuuN.UuUVuuUu(var1, var3) ? false : this.vVvUvVVuuNvV.C00OOC00oO(var1, var3, var5, var7);
      }
   }

   @Override
   public void UuUVuuUu(UnVNvNnU var1, float var2, float var3) {
      this.vVvUvVVuuNvV.UuUVuuUu(var1, var2, var3, 0.0F);
   }

   @Override
   public void C00OOC00oO(UnVNvNnU var1, float var2, float var3) {
      this.vVvUvVVuuNvV.UuUVuuUu(var1, var2, var3);
   }

   @Override
   public boolean VVuuUN() {
      return this.vVvUvVVuuNvV.uNNnnnuuuN();
   }

   protected static <V> nNVnuNVvvv<V> UuUVuuUu(final unNVnvNVNvVV var0, final V var1, final nNUVNNNvN.NVnVnNnN<V> var2) {
      Objects.requireNonNull(var0, "model");
      Objects.requireNonNull(var2, "adapter");
      return new nNVnuNVvvv<V>() {
         @Override
         public V UuUVuuUu() {
            return (V)var2.UuUVuuUu(var0);
         }

         @Override
         public void UuUVuuUu(V var1x) {
            var2.UuUVuuUu(var0, var1x);
         }

         @Override
         public V C00OOC00oO() {
            return (V)var1;
         }

         @Override
         public void uUnuvNvvNU() {
         }
      };
   }

   @FunctionalInterface
   protected interface NVnVnNnN<V> {
      V UuUVuuUu(unNVnvNVNvVV var1);

      default void UuUVuuUu(unNVnvNVNvVV var1, V var2) {
         var1.C00OOC00oO(var2);
      }
   }
}
