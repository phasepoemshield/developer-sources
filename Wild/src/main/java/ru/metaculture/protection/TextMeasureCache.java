package ru.metaculture.protection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class TextMeasureCache {
   private static final int O00000000 = 4096;
   private static final Map<TextMeasureCache.W145, TextMeasureCache.W146> O000000000 = new LinkedHashMap<TextMeasureCache.W145, TextMeasureCache.W146>(
      1024, 0.75F, true
   ) {
      @Override
      protected boolean removeEldestEntry(Entry<TextMeasureCache.W145, TextMeasureCache.W146> entry) {
         return this.size() > 4096;
      }
   };

   private TextMeasureCache() {
   }

   public static TextMeasureCache.W146 O00000000(FontObject o0000O0O00O00O, String string, float f) {
      if (string == null) {
         string = "";
      }

      TextMeasureCache.W145 var3 = new TextMeasureCache.W145(o0000O0O00O00O, string, Float.floatToIntBits(f));
      TextMeasureCache.W146 var4 = O000000000.get(var3);
      if (var4 != null) {
         return var4;
      } else {
         FontRenderer.W409 var5 = RenderManager.O00000000(o0000O0O00O00O, string, f);
         var4 = new TextMeasureCache.W146(var5.O00000000, var5.O000000000);
         O000000000.put(var3, var4);
         return var4;
      }
   }

   public static float O000000000(FontObject o0000O0O00O00O, String string, float f) {
      return O00000000(o0000O0O00O00O, string, f).O00000000;
   }

   public static float O0000000000(FontObject o0000O0O00O00O, String string, float f) {
      return O00000000(o0000O0O00O00O, string, f).O000000000;
   }

   public static void O00000000() {
      O000000000.clear();
   }

   record W145(FontObject font, String text, int sizeBits) {
   }

   public static final class W146 {
      public final float O00000000;
      public final float O000000000;

      W146(float f, float g) {
         this.O00000000 = f;
         this.O000000000 = g;
      }
   }
}
