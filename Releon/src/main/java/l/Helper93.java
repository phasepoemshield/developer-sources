package l;

public class Helper93 extends Helper89 {
   public Helper93(Helper204 var1, String var2) {
      super(var1, String.format("Expected %s", var2));
   }

   public Helper93(Helper204 var1, String var2, Throwable var3) {
      super(var1, String.format("Expected %s", var2), var3);
   }

   public Helper93(Helper204 var1, String var2, String var3) {
      super(var1, String.format("Expected %s, but got %s instead", var2, var3));
   }

   public Helper93(Helper204 var1, String var2, String var3, Throwable var4) {
      super(var1, String.format("Expected %s, but got %s instead", var2, var3), var4);
   }
}
