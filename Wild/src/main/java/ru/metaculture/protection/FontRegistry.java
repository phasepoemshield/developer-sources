package ru.metaculture.protection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;

public final class FontRegistry {
   private static final Map<String, MsdfFontAtlas> O00000000000O0 = new HashMap<>();
   private static final Map<String, FontObject> O00000000000OO = new HashMap<>();
   private static final Map<String, FontRegistry.W406> O0000000000O = new LinkedHashMap<>();
   private static RenderEngine O0000000000O0;
   private static boolean O0000000000O00 = false;
   private static boolean O0000000000O0O = false;
   private static long O0000000000OO;
   public static FontObject O00000000;
   public static FontObject O000000000;
   public static FontObject O0000000000;
   public static FontObject O00000000000;
   public static FontObject O000000000000;
   public static FontObject O0000000000000;
   public static FontObject O000000000000O;
   public static FontObject O00000000000O;

   private FontRegistry() {
   }

   public static synchronized void O00000000(RenderEngine o0000O00O0OOO, RenderManager o0000O00OO0O0) {
      O00000000(o0000O00O0OOO);
      Objects.requireNonNull(o0000O00OO0O0, "renderer");
      if (!O0000000000O0O) {
         o0000O00OO0O0.O00000000(O00000000, O00000000(O00000000));
         o0000O00OO0O0.O00000000(O000000000, O00000000(O000000000));
         o0000O00OO0O0.O00000000(O0000000000, O00000000(O0000000000));
         o0000O00OO0O0.O00000000(O00000000000, O00000000(O00000000000));
         o0000O00OO0O0.O00000000(O000000000000, O00000000(O000000000000));
         o0000O00OO0O0.O00000000(O0000000000000, O00000000(O0000000000000));
         o0000O00OO0O0.O00000000(O000000000000O, O00000000(O000000000000O));
         o0000O00OO0O0.O00000000(O00000000000O, O00000000(O00000000000O));
         O0000000000O0O = true;
      }
   }

   public static synchronized FontObject O00000000(String string, String string2, String string3) {
      O000000000000();
      Objects.requireNonNull(string, "id");
      Objects.requireNonNull(string2, "jsonResourcePath");
      Objects.requireNonNull(string3, "textureResourcePath");
      if (O00000000000O0.containsKey(string)) {
         throw new IllegalStateException("Font already registered: " + string);
      } else {
         MsdfFontAtlas var3 = MsdfFontAtlas.O00000000(O0000000000O0, string2, string3);
         O00000000000O0.put(string, var3);
         O0000000000O.put(string, new FontRegistry.W406(string2, string3));
         FontObject var4 = new FontObject(string);
         O00000000000OO.put(string, var4);
         return var4;
      }
   }

   public static synchronized void O00000000() {
      if (O0000000000O00 && O0000000000O0 != null) {
         for (Entry var1 : O0000000000O.entrySet()) {
            String var2 = (String)var1.getKey();
            MsdfFontAtlas var3 = O00000000000O0.get(var2);
            if (var3 != null) {
               var3.O00000000(O0000000000O0);
            } else {
               try {
                  FontRegistry.W406 var4 = (FontRegistry.W406)var1.getValue();
                  MsdfFontAtlas var5 = MsdfFontAtlas.O00000000(O0000000000O0, var4.json, var4.texture);
                  O00000000000O0.put(var2, var5);
               } catch (Throwable var6) {
               }
            }
         }
      }
   }

   public static synchronized void O000000000() {
      if (O0000000000O00 && O0000000000O0 != null) {
         long var0 = System.currentTimeMillis();
         if (var0 - O0000000000OO >= 1000L) {
            O0000000000OO = var0;

            for (MsdfFontAtlas var3 : O00000000000O0.values()) {
               if (var3 != null && !var3.O000000000()) {
                  var3.O00000000(O0000000000O0);
               }
            }
         }
      }
   }

   public static synchronized FontRenderer O00000000(FontObject o0000O0O00O00O) {
      O000000000000();
      MsdfFontAtlas var1 = O000000000(o0000O0O00O00O);
      return new FontRenderer(O0000000000O0, var1);
   }

   public static synchronized float O00000000(FontObject o0000O0O00O00O, int i, float f) {
      O000000000000();
      if (o0000O0O00O00O != null && !(f <= 0.0F)) {
         MsdfFontAtlas var3 = O000000000(o0000O0O00O00O);
         MsdfFontAtlas.W407 var4 = var3.O00000000(i);
         if (var4 != null && var4.O000000000) {
            float var5 = Math.max(1.0E-6F, var3.O0000000000000());
            float var6 = f / var5;
            return (var4.O0000000000000 + var4.O00000000000) * 0.5F * var6;
         } else {
            return 0.0F;
         }
      } else {
         return 0.0F;
      }
   }

   public static synchronized FontObject O00000000(String string) {
      O000000000000();
      FontObject var1 = O00000000000OO.get(string);
      if (var1 == null) {
         throw new IllegalArgumentException("Font not registered: " + string);
      } else {
         return var1;
      }
   }

   public static synchronized FontObject O0000000000() {
      O000000000000();
      return O00000000000O;
   }

   static synchronized MsdfFontAtlas O000000000(FontObject o0000O0O00O00O) {
      O000000000000();
      MsdfFontAtlas var1 = O00000000000O0.get(o0000O0O00O00O.O00000000);
      if (var1 == null) {
         throw new IllegalStateException("Font not registered: " + o0000O0O00O00O.O00000000);
      } else {
         return var1;
      }
   }

   private static void O00000000(RenderEngine o0000O00O0OOO) {
      Objects.requireNonNull(o0000O00O0OOO, "backend");
      if (O0000000000O00) {
         if (O0000000000O0 != o0000O00O0OOO) {
            throw new IllegalStateException("FontRegistry already initialized with a different backend instance");
         }
      } else {
         O0000000000O0 = o0000O00O0OOO;
         O0000000000O00 = true;
         O00000000000();
      }
   }

   private static void O00000000000() {
      O00000000 = O00000000("inter_medium", "assets/wild/fonts/medium.json", "assets/wild/fonts/medium.png");
      O000000000 = O00000000("inter_medium_ext", "assets/wild/fonts/Inter_Medium.json", "assets/wild/fonts/Inter_Medium.png");
      O0000000000 = O00000000("icons", "assets/wild/fonts/icons.json", "assets/wild/fonts/icons.png");
      O00000000000 = O00000000("inter_semibold", "assets/wild/fonts/semibold.json", "assets/wild/fonts/semibold.png");
      O000000000000 = O00000000("new_ico", "assets/wild/fonts/new_ico.json", "assets/wild/fonts/new_ico.png");
      O0000000000000 = O00000000("notifff", "assets/wild/fonts/notifff.json", "assets/wild/fonts/notifff.png");
      O000000000000O = O00000000("waypoints", "assets/wild/fonts/waypoint_icons.json", "assets/wild/fonts/waypoint_icons.png");
      O00000000000O = O00000000("wild", "assets/wild/fonts/wild.json", "assets/wild/fonts/wildICO.png");
   }

   private static void O000000000000() {
      if (!O0000000000O00 || O0000000000O0 == null) {
         throw new IllegalStateException("FontRegistry.initialize(backend, renderer) must be called before use");
      }
   }

   record W406(String json, String texture) {
   }
}
