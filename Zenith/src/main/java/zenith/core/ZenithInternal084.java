package zenith;

class ZenithInternal084 {
   private static int[] ListHolder_6 = new int[]{16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};

   public static void StringHolder_8(ByteBufferHolder_2 liiili1iii1, int[] aint, ZenithInternal070[] al111llliilll1iii1ii) throws ZenithException_2 {
      int i = liiili1iii1.StringHolder_8(aint, 5) + 257;
      int j = liiili1iii1.StringHolder_8(aint, 5) + 1;
      int k = liiili1iii1.StringHolder_8(aint, 4) + 4;
      int[] aint1 = new int[19];

      for (int l = 0; l < k; l++) {
         byte b0 = (byte)liiili1iii1.StringHolder_8(aint, 3);
         int i1 = EventImpl_21(l);
         aint1[i1] = b0;
      }

      ZenithInternal070 l111llliilll1iii1iix = new ZenithInternal070(aint1);
      int[] aint3 = new int[i];
      StringHolder_8(liiili1iii1, aint, aint3, l111llliilll1iii1iix);
      ZenithInternal070 l111llliilll1iii1iix = new ZenithInternal070(aint3);
      int[] aint2 = new int[j];
      StringHolder_8(liiili1iii1, aint, aint2, l111llliilll1iii1iix);
      ZenithInternal070 l111llliilll1iii1iixx = new ZenithInternal070(aint2);
      al111llliilll1iii1ii[0] = l111llliilll1iii1iix;
      al111llliilll1iii1ii[1] = l111llliilll1iii1iixx;
   }

   private static void StringHolder_8(ByteBufferHolder_2 liiili1iii1, int[] aint, int[] aint1, ZenithInternal070 l111llliilll1iii1ii) throws ZenithException_2 {
      for (int i = 0; i < aint1.length; i++) {
         int j = l111llliilll1iii1ii.StringHolder_8(liiili1iii1, aint);
         if (0 <= j && j <= 15) {
            aint1[i] = j;
         } else {
            int k;
            switch (j) {
               case 16:
                  j = aint1[i - 1];
                  k = liiili1iii1.StringHolder_8(aint, 2) + 3;
                  break;
               case 17:
                  j = 0;
                  k = liiili1iii1.StringHolder_8(aint, 3) + 3;
                  break;
               case 18:
                  j = 0;
                  k = liiili1iii1.StringHolder_8(aint, 7) + 11;
                  break;
               default:
                  String s = String.format("[%s] Bad code length '%d' at the bit index '%d'.", ZenithInternal084.class.getSimpleName(), j, aint);
                  throw new ZenithException_2(s);
            }

            for (int l = 0; l < k; l++) {
               aint1[i + l] = j;
            }

            i += k - 1;
         }
      }
   }

   private static int EventImpl_21(int i) {
      return ListHolder_6[i];
   }

   public static int StringHolder_8(ByteBufferHolder_2 liiili1iii1, int[] aint, int i) throws ZenithException_2 {
      short short1;
      byte b0;
      switch (i) {
         case 257:
         case 258:
         case 259:
         case 260:
         case 261:
         case 262:
         case 263:
         case 264:
            return i - 254;
         case 265:
            short1 = 11;
            b0 = 1;
            break;
         case 266:
            short1 = 13;
            b0 = 1;
            break;
         case 267:
            short1 = 15;
            b0 = 1;
            break;
         case 268:
            short1 = 17;
            b0 = 1;
            break;
         case 269:
            short1 = 19;
            b0 = 2;
            break;
         case 270:
            short1 = 23;
            b0 = 2;
            break;
         case 271:
            short1 = 27;
            b0 = 2;
            break;
         case 272:
            short1 = 31;
            b0 = 2;
            break;
         case 273:
            short1 = 35;
            b0 = 3;
            break;
         case 274:
            short1 = 43;
            b0 = 3;
            break;
         case 275:
            short1 = 51;
            b0 = 3;
            break;
         case 276:
            short1 = 59;
            b0 = 3;
            break;
         case 277:
            short1 = 67;
            b0 = 4;
            break;
         case 278:
            short1 = 83;
            b0 = 4;
            break;
         case 279:
            short1 = 99;
            b0 = 4;
            break;
         case 280:
            short1 = 115;
            b0 = 4;
            break;
         case 281:
            short1 = 131;
            b0 = 5;
            break;
         case 282:
            short1 = 163;
            b0 = 5;
            break;
         case 283:
            short1 = 195;
            b0 = 5;
            break;
         case 284:
            short1 = 227;
            b0 = 5;
            break;
         case 285:
            return 258;
         default:
            String s = String.format("[%s] Bad literal/length code '%d' at the bit index '%d'.", ZenithInternal084.class.getSimpleName(), i, aint[0]);
            throw new ZenithException_2(s);
      }

      int j = liiili1iii1.StringHolder_8(aint, b0);
      return short1 + j;
   }

   public static int StringHolder_8(ByteBufferHolder_2 liiili1iii1, int[] aint, ZenithInternal070 l111llliilll1iii1ii) throws ZenithException_2 {
      int i = l111llliilll1iii1ii.StringHolder_8(liiili1iii1, aint);
      short short1;
      byte b0;
      switch (i) {
         case 0:
         case 1:
         case 2:
         case 3:
            return i + 1;
         case 4:
            short1 = 5;
            b0 = 1;
            break;
         case 5:
            short1 = 7;
            b0 = 1;
            break;
         case 6:
            short1 = 9;
            b0 = 2;
            break;
         case 7:
            short1 = 13;
            b0 = 2;
            break;
         case 8:
            short1 = 17;
            b0 = 3;
            break;
         case 9:
            short1 = 25;
            b0 = 3;
            break;
         case 10:
            short1 = 33;
            b0 = 4;
            break;
         case 11:
            short1 = 49;
            b0 = 4;
            break;
         case 12:
            short1 = 65;
            b0 = 5;
            break;
         case 13:
            short1 = 97;
            b0 = 5;
            break;
         case 14:
            short1 = 129;
            b0 = 6;
            break;
         case 15:
            short1 = 193;
            b0 = 6;
            break;
         case 16:
            short1 = 257;
            b0 = 7;
            break;
         case 17:
            short1 = 385;
            b0 = 7;
            break;
         case 18:
            short1 = 513;
            b0 = 8;
            break;
         case 19:
            short1 = 769;
            b0 = 8;
            break;
         case 20:
            short1 = 1025;
            b0 = 9;
            break;
         case 21:
            short1 = 1537;
            b0 = 9;
            break;
         case 22:
            short1 = 2049;
            b0 = 10;
            break;
         case 23:
            short1 = 3073;
            b0 = 10;
            break;
         case 24:
            short1 = 4097;
            b0 = 11;
            break;
         case 25:
            short1 = 6145;
            b0 = 11;
            break;
         case 26:
            short1 = 8193;
            b0 = 12;
            break;
         case 27:
            short1 = 12289;
            b0 = 12;
            break;
         case 28:
            short1 = 16385;
            b0 = 13;
            break;
         case 29:
            short1 = 24577;
            b0 = 13;
            break;
         default:
            String s = String.format("[%s] Bad distance code '%d' at the bit index '%d'.", ZenithInternal084.class.getSimpleName(), i, aint[0]);
            throw new ZenithException_2(s);
      }

      int j = liiili1iii1.StringHolder_8(aint, b0);
      return short1 + j;
   }
}
