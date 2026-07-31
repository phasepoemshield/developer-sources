package l;

public abstract class Helper89 extends Helper143 {
   public final Helper204 arg;

   protected Helper89(Helper204 var1, String var2) {
      super(method890(var1, var2));
      this.arg = var1;
   }

   protected Helper89(Helper204 var1, String var2, Throwable var3) {
      super(method890(var1, var2), var3);
      this.arg = var1;
   }

   private static String method890(Helper204 var0, String var1) {
      return String.format("Error at argument #%s: %s", var0.method392() == -1 ? "<unknown>" : Integer.toString(var0.method392() + 1), var1);
   }
}
