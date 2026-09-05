package ru.metaculture.protection;

public final class NNNVvVnnVn {
   private boolean UuUVuuUu;

   public boolean UuUVuuUu() {
      return !this.UuUVuuUu;
   }

   public void C00OOC00oO() {
      this.UuUVuuUu = true;
   }

   public <T> T UuUVuuUu(NNNVvVnnVn.NVnVnNnN<T> var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("attempt must not be null");
      } else if (this.UuUVuuUu) {
         return null;
      } else {
         try {
            return (T)var1.UuUVuuUu();
         } catch (RuntimeException var3) {
            this.UuUVuuUu = true;
            return null;
         }
      }
   }

   public boolean UuUVuuUu(NNNVvVnnVn.nvnNNunvv var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("attempt must not be null");
      } else if (this.UuUVuuUu) {
         return false;
      } else {
         try {
            var1.UuUVuuUu();
            return true;
         } catch (RuntimeException var3) {
            this.UuUVuuUu = true;
            return false;
         }
      }
   }

   public boolean uUnuvNvvNU() {
      return this.UuUVuuUu;
   }

   @FunctionalInterface
   public interface NVnVnNnN<T> {
      T UuUVuuUu();
   }

   @FunctionalInterface
   public interface nvnNNunvv {
      void UuUVuuUu();
   }
}
