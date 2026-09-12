package Nursultan;

public class class09217 {
   public static Object N_0 = class09991.N()
      .M()
      .N(class09962.N())
      .y(class09962.N())
      .N(12.0F)
      .B(8.0F)
      .j(4.0F)
      .v(10.0F)
      .L(class09662.N(-16777216, 0.25F))
      .N(class09975.COLUMN)
      .y((Integer)class09181.y_0)
      .u((Integer)class09181.L_2)
      .z(1.0F)
      .Z(12.0F)
      .N(class09983.BORDER_BOX)
      .l(1.0F)
      .W(16.0F)
      .N(var0 -> var0.l(0.0F).W(0.0F))
      .y(var0 -> var0.l(0.0F).W(0.0F))
      .N(class09994.s((class09743)class11644.N_0), class09994.Z((class09743)class11644.N_0));
   public static Object N_1 = class09991.N(class09221.N(20, class09079.REGULAR), class09991.N().i((Integer)class09181.N_0));
   public static Object N_2 = class09991.N(class09221.N(14, class09079.REGULAR), class09991.N().i(class11300.L(6579300, 64.0F)).N(class09964.NOWRAP));
   public static Object y_0 = new class09217()::N;
   public static Object y_1;
   public static Object y_2;
   public static Object y_3;
   public static Object y_4;
   public static Object y_5;

   private class09217() {
   }

   static {
      N();
      y();
   }

   private static int y(String[] var0, int var1) {
      int var2 = 1;
      int var3 = 0;

      for (String var7 : var0) {
         if (var3 == 0) {
            var3 = var7.length();
         } else if (var3 + 1 + var7.length() > var1) {
            var2++;
            var3 = var7.length();
         } else {
            var3 += 1 + var7.length();
         }
      }

      return var2;
   }

   private static void y() {
      y_0 = null;
      y_1 = 12;
      y_2 = 12;
      y_3 = 8;
      y_4 = 16;
      y_5 = 36;
      N_0 = null;
      N_1 = null;
      N_2 = null;
   }

   private static String y(String var0) {
      String var1 = var0.trim().replaceAll("\\s+", " ");
      if (var1.isEmpty()) {
         return var1;
      } else {
         String[] var2 = var1.split(" ");
         if (var2.length == 1) {
            return var1;
         } else {
            int var3 = y(var2, 36);
            int var4 = 1;
            int var5 = 36;
            int var6 = 36;

            while (var4 <= var5) {
               int var7 = (var4 + var5) / 2;
               if (y(var2, var7) <= var3) {
                  var6 = var7;
                  var5 = var7 - 1;
               } else {
                  var4 = var7 + 1;
               }
            }

            return N(var2, var6);
         }
      }
   }

   private static String N(String[] var0, int var1) {
      StringBuilder var2 = new StringBuilder();
      int var3 = 0;

      for (String var7 : var0) {
         if (var3 == 0) {
            var2.append(var7);
            var3 = var7.length();
         } else if (var3 + 1 + var7.length() > var1) {
            var2.append('\n').append(var7);
            var3 = var7.length();
         } else {
            var2.append(' ').append(var7);
            var3 += 1 + var7.length();
         }
      }

      return var2.toString();
   }

   private class09798 N(class11846 var1, class09809 var2) {
      class11067 var3 = var1.L();
      return class09778.N(class09991.N((class09991)N_0, class11629.N(var1.N(), 0.0F, 500)), var2x -> {
         var2x.N(var3.L(), (class09991)N_1);
         var2x.N(y(var1.y()), (class09991)N_2);
      });
   }

   private static void N() {
   }
}
