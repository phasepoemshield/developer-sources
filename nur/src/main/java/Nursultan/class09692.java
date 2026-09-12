package Nursultan;

import java.util.EnumMap;

public final class class09692 {
   private static void L(EnumMap<class09736, class09743> var0, class09743 var1) {
      var0.put(class09736.VISUAL_TRANSLATE_X, var1);
      var0.put(class09736.VISUAL_TRANSLATE_Y, var1);
   }

   private class09692() {
   }

   private static void y(EnumMap<class09736, class09743> var0, class09743 var1) {
      var0.put(class09736.POSITION_OFFSET_X, var1);
      var0.put(class09736.POSITION_OFFSET_Y, var1);
   }

   private static void N(EnumMap<class09736, class09743> var0, class09743 var1) {
      var0.put(class09736.PADDING_LEFT, var1);
      var0.put(class09736.PADDING_RIGHT, var1);
      var0.put(class09736.PADDING_TOP, var1);
      var0.put(class09736.PADDING_BOTTOM, var1);
   }

   public static class09713 N(float var0, class09759 var1) {
      EnumMap var2 = new EnumMap<>(class09736.class);
      class09728 var3 = new class09728(Math.max(0.0F, var0) / 1000.0F, var1);
      if (!var3.u()) {
         return class09713.N;
      } else {
         for (class09736 var7 : class09736.values()) {
            var2.put(var7, var3);
         }

         return new class09713(var2);
      }
   }

   public static class09713 N(class09994... var0) {
      if (var0 != null && var0.length != 0) {
         EnumMap var1 = new EnumMap<>(class09736.class);

         for (class09994 var5 : var0) {
            if (var5 != null && var5.y() != null && var5.y().u()) {
               class09736 var6 = var5.N();
               if (var6 == null && var5.L() == class09668.PADDING) {
                  N(var1, var5.y());
               } else if (var6 == null && var5.L() == class09668.POSITION_OFFSET) {
                  y(var1, var5.y());
               } else if (var6 == null && var5.L() == class09668.VISUAL_TRANSLATE) {
                  L(var1, var5.y());
               } else if (var6 != null) {
                  var1.put(var6, var5.y());
               }
            }
         }

         return new class09713(var1);
      } else {
         return class09713.N;
      }
   }
}
