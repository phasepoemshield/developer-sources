package ru.metaculture.protection;

public final class vnuUnvNvnNnv {
   private vnuUnvNvnNnv() {
   }

   public static <T> vnuUnvNvnNnv.VvunVVUvUNnv UuUVuuUu(T var0, vnuUnvNvnNnv.NVnVnNnN<T> var1, vnuUnvNvnNnv.nvnNNunvv<T> var2) {
      if (var0 == null) {
         return new vnuUnvNvnNnv.VvunVVUvUNnv(true, null);
      } else {
         try {
            var1.close(var0);
            return new vnuUnvNvnNnv.VvunVVUvUNnv(true, null);
         } catch (RuntimeException var6) {
            RuntimeException var3 = var6;

            try {
               return new vnuUnvNvnNnv.VvunVVUvUNnv(var2.isClosed(var0), var3);
            } catch (RuntimeException var5) {
               if (var5 != var6) {
                  var6.addSuppressed(var5);
               }

               return new vnuUnvNvnNnv.VvunVVUvUNnv(false, var6);
            }
         }
      }
   }

   @FunctionalInterface
   public interface NVnVnNnN<T> {
      void close(T var1);
   }

   public record VvunVVUvUNnv(boolean released, RuntimeException failure) {
   }

   @FunctionalInterface
   public interface nvnNNunvv<T> {
      boolean isClosed(T var1);
   }
}
