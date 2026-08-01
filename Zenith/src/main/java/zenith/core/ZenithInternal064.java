package zenith;

class ZenithInternal064 extends ZenithInternal070 {
   private static final ZenithInternal064 StringHolder_12 = new ZenithInternal064();

   private ZenithInternal064() {
      super(ZenithInternal061());
   }

   private static int[] ZenithInternal061() {
      int[] aint = new int[32];

      for (int i = 0; i < 32; i++) {
         aint[i] = 5;
      }

      return aint;
   }

   public static ZenithInternal064 FinishThread() {
      return StringHolder_12;
   }
}
