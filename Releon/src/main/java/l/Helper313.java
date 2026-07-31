package l;

public enum Helper313 implements Helper205<Double> {
   INSTANCE;

   private Helper313() {
   }

   @Override
   public Class<Double> method1766() {
      return Double.class;
   }

   public Double method1763(Helper204 var1) {
      String var2 = var1.method393();
      if (!var2.matches("^([+-]?(?:\\d+(?:\\.\\d*)?|\\.\\d+)|)$")) {
         throw new IllegalArgumentException("failed double format check");
      } else {
         return Double.parseDouble(var2);
      }
   }
}
