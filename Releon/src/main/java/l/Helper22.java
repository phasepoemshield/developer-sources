package l;

import java.util.stream.Stream;

class Helper22 implements Helper204 {
   private final int index;
   private final String value;
   private final String rawRest;

   Helper22(int var1, String var2, String var3) {
      this.index = var1;
      this.value = var2;
      this.rawRest = var3;
   }

   @Override
   public int method392() {
      return this.index;
   }

   @Override
   public String method393() {
      return this.value;
   }

   @Override
   public String method394() {
      return this.rawRest;
   }

   @Override
   public <E extends Enum<?>> E method395(Class<E> var1) {
      return (E)Stream.of((Enum[])var1.getEnumConstants())
         .filter(var1x -> var1x.name().equalsIgnoreCase(this.value))
         .findFirst()
         .orElseThrow(() -> new Helper93(this, var1.getSimpleName()));
   }

   @Override
   public <T> T method396(Class<T> var1) {
      return Helper33.INSTANCE.method490(var1, this);
   }

   @Override
   public <T> boolean method397(Class<T> var1) {
      try {
         this.method396(var1);
         return true;
      } catch (Throwable var3) {
         return false;
      }
   }

   @Override
   public <T, S> T method398(Class<T> var1, Class<S> var2, S var3) {
      return Helper33.INSTANCE.method491(var1, var2, this, var3);
   }

   @Override
   public <T, S> boolean method399(Class<T> var1, Class<S> var2, S var3) {
      try {
         this.method398(var1, var2, var3);
         return true;
      } catch (Throwable var5) {
         return false;
      }
   }
}
