package l;

public enum Helper33 implements Helper217 {
   INSTANCE;

   public final Helper117<Helper207> registry = new Helper117<>();

   private Helper33() {
      Helper316.ALL.forEach(this.registry::method957);
   }

   @Override
   public <T> Helper205<T> method488(Class<T> var1) {
      return this.registry
         .method962()
         .filter(Helper205.class::isInstance)
         .map(Helper205.class::cast)
         .filter(var1x -> var1x.method1766().isAssignableFrom(var1))
         .findFirst()
         .orElse(null);
   }

   @Override
   public <T, S> Helper206<T, S> method489(Class<T> var1, Class<S> var2) {
      return this.registry
         .method962()
         .filter(Helper206.class::isInstance)
         .map(Helper206.class::cast)
         .filter(var1x -> var1x.method1766().isAssignableFrom(var1))
         .filter(var1x -> var1x.method1764().isAssignableFrom(var2))
         .map(Helper206.class::cast)
         .findFirst()
         .orElse(null);
   }

   @Override
   public <T> T method490(Class<T> var1, Helper204 var2) {
      Helper205 var3 = this.method488(var1);
      if (var3 == null) {
         throw new Helper71(var1);
      } else {
         try {
            return (T)var3.method1763(var2);
         } catch (Exception var5) {
            throw new Helper93(var2, var1.getSimpleName());
         }
      }
   }

   @Override
   public <T, S> T method491(Class<T> var1, Class<S> var2, Helper204 var3, S var4) {
      Helper206 var5 = this.method489(var1, var2);
      if (var5 == null) {
         throw new Helper71(var1);
      } else {
         try {
            return (T)var5.method1765(var3, var4);
         } catch (Exception var7) {
            throw new Helper93(var3, var1.getSimpleName());
         }
      }
   }

   @Override
   public Helper117<Helper207> method492() {
      return this.registry;
   }
}
