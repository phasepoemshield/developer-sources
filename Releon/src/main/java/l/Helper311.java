package l;

public enum Helper311 implements Helper205<Float> {
   INSTANCE;

   private Helper311() {
   }

   @Override
   public Class<Float> method1766() {
      return Float.class;
   }

   public Float method1763(Helper204 var1) {
      String var2 = var1.method393();
      if (!var2.matches("^([+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+)|)$")) {
         throw new IllegalArgumentException("failed float format check");
      } else {
         return Float.parseFloat(var2);
      }
   }
}
