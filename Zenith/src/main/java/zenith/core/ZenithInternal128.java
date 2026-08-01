package zenith;

class ZenithInternal128 {
   private static final byte[] ZenithException_2 = new byte[]{
      65,
      66,
      67,
      68,
      69,
      70,
      71,
      72,
      73,
      74,
      75,
      76,
      77,
      78,
      79,
      80,
      81,
      82,
      83,
      84,
      85,
      86,
      87,
      88,
      89,
      90,
      97,
      98,
      99,
      100,
      101,
      102,
      103,
      104,
      105,
      106,
      107,
      108,
      109,
      110,
      111,
      112,
      113,
      114,
      115,
      116,
      117,
      118,
      119,
      120,
      121,
      122,
      48,
      49,
      50,
      51,
      52,
      53,
      54,
      55,
      56,
      57,
      43,
      47
   };

   public static String StringHolder_8(String s) {
      return s == null ? null : StringHolder_8(SecureRandomHolder_2.ByteBufferHolder_2(s));
   }

   public static String StringHolder_8(byte[] abyte) {
      if (abyte == null) {
         return null;
      } else {
         int i = ((abyte.length * 8 + 5) / 6 + 3) / 4 * 4;
         StringBuilder stringbuilder = new StringBuilder(i);
         byte b0 = 0;

         while (true) {
            int j = StringHolder_8(abyte, b0);
            if (j < 0) {
               for (int k = stringbuilder.length(); k < i; k++) {
                  stringbuilder.append('=');
               }

               return stringbuilder.toString();
            }

            stringbuilder.append((char)ZenithException_2[j]);
            b0 += 6;
         }
      }
   }

   private static int StringHolder_8(byte[] abyte, int i) {
      int j = i / 8;
      if (abyte.length <= j) {
         return -1;
      } else {
         byte b0;
         if (abyte.length - 1 == j) {
            b0 = 0;
         } else {
            b0 = abyte[j + 1];
         }

         switch (i % 24 / 6) {
            case 0:
               return abyte[j] >> 2 & 63;
            case 1:
               return abyte[j] << 4 & 48 | b0 >> 4 & 15;
            case 2:
               return abyte[j] << 2 & 60 | b0 >> 6 & 3;
            case 3:
               return abyte[j] & 63;
            default:
               return 0;
         }
      }
   }
}
