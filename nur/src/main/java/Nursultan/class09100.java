package Nursultan;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.EnumMap;
import java.util.Map;

public class class09100 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public static Object y_0 = new class09092[]{
      class09092.N(48, 57),
      class09092.N(97, 122),
      class09092.N(65, 90),
      class09092.N(1072, 1103),
      class09092.N(1040, 1071),
      class09092.N(1105),
      class09092.N(1025),
      class09092.N(33, 47),
      class09092.N(9889),
      class09092.N(9733),
      class09092.N(9679),
      class09092.N(58, 64),
      class09092.N(91, 96),
      class09092.N(167),
      class09092.N(123, 126),
      class09092.N(8470),
      class09092.N(32),
      class09092.N(183),
      class09092.N(169),
      class09092.N(187),
      class09092.N(171),
      class09092.N(8211),
      class09092.N(8212)
   };
   public static Object y_1 = i();

   public class09100(class09082 var1, String var2, byte[] var3) {
      this.y();
      this.N_0 = new EnumMap<>(class09079.class);
      this.N_1 = var1;
      this.N_2 = var2;
      this.N_3 = var3;
   }

   static {
      R();
   }

   private static int[] i() {
      IntArrayList var0 = new IntArrayList();
      class09092[] var1 = (class09092[])y_0;
      int var2 = var1.length;

      for (int var3 = 0; var3 < var2; var3++) {
         var1[var3].N(var0);
      }

      return var0.toIntArray();
   }

   private void y() {
   }

   public class09071 N(class09079 var1) {
      class09071 var2 = (class09071)((Map)this.N_0).get(var1);
      if (var2 != null) {
         return var2;
      } else {
         class09071 var3 = ((class09082)this.N_1).N((String)this.N_2, (byte[])this.N_3, var1);

         for (int var7 : (int[])y_1) {
            var3.N(var7);
         }

         ((Map)this.N_0).put(var1, var3);
         return var3;
      }
   }

   private static void R() {
      y_0 = null;
      y_1 = null;
   }
}
