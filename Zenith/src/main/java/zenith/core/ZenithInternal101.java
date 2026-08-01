package zenith;

class ZenithInternal101 {
   public static void StringHolder_8(ByteBufferHolder_2 liiili1iii1, ByteBufferHolder_2 liiili1iii1) throws ZenithException_2 {
      StringHolder_8(liiili1iii1, 0, liiili1iii1x);
   }

   private static void StringHolder_8(ByteBufferHolder_2 liiili1iii1, int i, ByteBufferHolder_2 liiili1iii1) throws ZenithException_2 {
      int[] aint = new int[]{i * 8};

      while (StringHolder_8(liiili1iii1, aint, liiili1iii1x)) {
      }
   }

   private static boolean StringHolder_8(ByteBufferHolder_2 liiili1iii1, int[] aint, ByteBufferHolder_2 liiili1iii1) throws ZenithException_2 {
      boolean flag = liiili1iii1.StringHolder_8(aint);
      int i = liiili1iii1.StringHolder_8(aint, 2);
      switch (i) {
         case 0:
            EventBus(liiili1iii1, aint, liiili1iii1x);
            break;
         case 1:
            EventTarget(liiili1iii1, aint, liiili1iii1x);
            break;
         case 2:
            ZenithInternal095(liiili1iii1, aint, liiili1iii1x);
            break;
         default:
            String s = String.format("[%s] Bad compression type '11' at the bit index '%d'.", ZenithInternal101.class.getSimpleName(), aint[0]);
            throw new ZenithException_2(s);
      }

      if (liiili1iii1.EventImpl_13() <= aint[0] / 8) {
         flag = true;
      }

      return !flag;
   }

   private static void EventBus(ByteBufferHolder_2 liiili1iii1, int[] aint, ByteBufferHolder_2 liiili1iii1) {
      int i = aint[0] + 7 & -8;
      int j = i / 8;
      int k = (liiili1iii1.StringHolder_8(j) & 255) + (liiili1iii1.StringHolder_8(j + 1) & 255) * 256;
      j += 4;
      liiili1iii1x.StringHolder_8(liiili1iii1, j, k);
      aint[0] = (j + k) * 8;
   }

   private static void EventTarget(ByteBufferHolder_2 liiili1iii1, int[] aint, ByteBufferHolder_2 liiili1iii1) throws ZenithException_2 {
      StringHolder_8(liiili1iii1, aint, liiili1iii1x, ZenithInternal021.ZenithInternal064(), ZenithInternal064.FinishThread());
   }

   private static void ZenithInternal095(ByteBufferHolder_2 liiili1iii1, int[] aint, ByteBufferHolder_2 liiili1iii1) throws ZenithException_2 {
      ZenithInternal070[] al111llliilll1iii1ii = new ZenithInternal070[2];
      ZenithInternal084.StringHolder_8(liiili1iii1, aint, al111llliilll1iii1ii);
      StringHolder_8(liiili1iii1, aint, liiili1iii1x, al111llliilll1iii1ii[0], al111llliilll1iii1ii[1]);
   }

   private static void StringHolder_8(
      ByteBufferHolder_2 liiili1iii1, int[] aint, ByteBufferHolder_2 liiili1iii1, ZenithInternal070 l111llliilll1iii1ii, ZenithInternal070 l111llliilll1iii1ii
   ) throws ZenithException_2 {
      while (true) {
         int i = l111llliilll1iii1iix.StringHolder_8(liiili1iii1, aint);
         if (i == 256) {
            return;
         }

         if (0 <= i && i <= 255) {
            liiili1iii1x.EventTarget(i);
         } else {
            int j = ZenithInternal084.StringHolder_8(liiili1iii1, aint, i);
            int k = ZenithInternal084.StringHolder_8(liiili1iii1, aint, l111llliilll1iii1ii);
            StringHolder_8(j, k, liiili1iii1x);
         }
      }
   }

   private static void StringHolder_8(int i, int j, ByteBufferHolder_2 liiili1iii1) {
      int k = liiili1iii1.EventImpl_13();
      byte[] abyte = new byte[i];
      int l = k - j;
      int i1 = l;

      for (int j1 = 0; j1 < i; i1++) {
         if (k <= i1) {
            i1 = l;
         }

         abyte[j1] = liiili1iii1.StringHolder_8(i1);
         j1++;
      }

      liiili1iii1.EventBus(abyte);
   }
}
