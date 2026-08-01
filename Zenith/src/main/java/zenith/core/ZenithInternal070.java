package zenith;

class ZenithInternal070 {
   private final int ZenithInternal121;
   private final int BufferedOutputStreamImpl;
   private final int[] ZenithInternal033;
   private final int[] ThreadImpl;

   public ZenithInternal070(int[] aint) {
      this.ZenithInternal121 = Math.max(SecureRandomHolder_2.EventBus(aint), 1);
      this.BufferedOutputStreamImpl = SecureRandomHolder_2.EventTarget(aint);
      int[] aint1 = EventBus(aint, this.BufferedOutputStreamImpl);
      Object[] aobject = new Object[2];
      this.ZenithInternal033 = StringHolder_8(aint1, this.BufferedOutputStreamImpl, aobject);
      int[] aint2 = (int[])aobject[0];
      int i = (Integer)aobject[1];
      this.ThreadImpl = StringHolder_8(aint, aint2, i);
   }

   private static int[] ZenithInternal095(int i, int j) {
      int[] aint = new int[i];

      for (int k = 0; k < i; k++) {
         aint[k] = j;
      }

      return aint;
   }

   private static int[] EventBus(int[] aint, int i) {
      int[] aint1 = new int[i + 1];

      for (int j = 0; j < aint.length; j++) {
         int k = aint[j];
         aint1[k]++;
      }

      return aint1;
   }

   private static int[] StringHolder_8(int[] aint, int i, Object[] aobject) {
      int[] aint1 = ZenithInternal095(i + 1, -1);
      int j = 0;
      int k = 0;
      aint[0] = 0;
      int[] aint2 = new int[i + 1];

      for (int l = 1; l < aint.length; l++) {
         int i1 = aint[l - 1];
         j = j + i1 << 1;
         aint2[l] = j;
         k = j + aint[l] - 1;
         aint1[l] = k;
      }

      aobject[0] = aint2;
      aobject[1] = k;
      return aint1;
   }

   private static int[] StringHolder_8(int[] aint, int[] aint1, int i) {
      int[] aint2 = new int[i + 1];

      for (int j = 0; j < aint.length; j++) {
         int k = aint[j];
         if (k != 0) {
            Object object = aint1[k]++;
            aint2[object] = j;
         }
      }

      return aint2;
   }

   public int StringHolder_8(ByteBufferHolder_2 liiili1iii1, int[] aint) throws ZenithException_2 {
      for (int i = this.ZenithInternal121; i <= this.BufferedOutputStreamImpl; i++) {
         int j = this.ZenithInternal033[i];
         if (j >= 0) {
            int k = liiili1iii1.EventTarget(aint[0], i);
            if (j >= k) {
               int l = this.ThreadImpl[k];
               aint[0] += i;
               return l;
            }
         }
      }

      String s = String.format("[%s] Bad code at the bit index '%d'.", this.getClass().getSimpleName(), aint[0]);
      throw new ZenithException_2(s);
   }
}
