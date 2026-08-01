package zenith;

class ZenithInternal021 extends ZenithInternal070 {
   private static final ZenithInternal021 booleanHolder_2 = new ZenithInternal021();

   private ZenithInternal021() {
      super(ZenithInternal061());
   }

   private static int[] ZenithInternal061() {
      int[] aint = new int[288];

      int i;
      for (i = 0; i < 144; i++) {
         aint[i] = 8;
      }

      while (i < 256) {
         aint[i] = 9;
         i++;
      }

      while (i < 280) {
         aint[i] = 7;
         i++;
      }

      while (i < 288) {
         aint[i] = 8;
         i++;
      }

      return aint;
   }

   public static ZenithInternal021 ZenithInternal064() {
      return booleanHolder_2;
   }
}
