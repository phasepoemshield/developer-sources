package ru.metaculture.protection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public final class O00000OO0OO0O {
   public static final String O00000000 = "HUD_HotKeys";
   public static final String O000000000 = "HUD_Inventory";
   public static final String O0000000000 = "HUD_Potions";
   public static final String O00000000000 = "HUD_CoolDowns";
   public static final String O000000000000 = "HUD_Info";
   public static final String O0000000000000 = "HUD_WaterMark";
   public static final String O000000000000O = "HUD_ArrayList";
   public static final String O00000000000O = "HUD_TargetHUD";
   public static final String O00000000000O0 = "hud_armor";
   public static final String O00000000000OO = "HUD_HotBar";
   public static final String O0000000000O = "HUD_Notifications";
   public static final String O0000000000O0 = "HUD_AutoBuyInfo";
   public static final String O0000000000O00 = "HUD_AIStatus";
   public static final String O0000000000O0O = "HUD_MusicPlayer";
   public static final String O0000000000OO = "HUD_ServerHelper";
   static final String[] O0000000000OO0 = new String[]{
      "HUD_HotKeys",
      "HUD_Inventory",
      "HUD_Potions",
      "HUD_CoolDowns",
      "HUD_Info",
      "HUD_WaterMark",
      "HUD_ArrayList",
      "HUD_TargetHUD",
      "hud_armor",
      "HUD_HotBar",
      "HUD_Notifications",
      "HUD_AutoBuyInfo",
      "HUD_AIStatus",
      "HUD_MusicPlayer",
      "HUD_ServerHelper"
   };
   private static final Gson O0000000000OOO = new GsonBuilder().setPrettyPrinting().create();
   private static O00000OO0OO0O.W240 O000000000O;
   private static boolean O000000000O0;

   private O00000OO0OO0O() {
   }

   public static synchronized O00000OO0OO0O.W239 O00000000() {
      return O00000000("HUD_HotKeys");
   }

   public static synchronized O00000OO0OO0O.W239 O000000000() {
      return O00000000("HUD_Inventory");
   }

   public static synchronized O00000OO0OO0O.W239 O0000000000() {
      return O00000000("HUD_Potions");
   }

   public static synchronized O00000OO0OO0O.W239 O00000000(String string) {
      O0000000000000();
      String var1 = O0000000000(string);
      O00000OO0OO0O.W239 var2 = O000000000O.O0000000000.get(var1);
      if (var2 == null) {
         var2 = O00000OO0OO0O.W239.O00000000(var1);
         O000000000O.O0000000000.put(var1, var2);
      }

      var2.O000000000();
      return var2;
   }

   public static synchronized void O00000000000() {
      O000000000("HUD_HotKeys");
   }

   public static synchronized void O000000000(String string) {
      O0000000000000();
      String var1 = O0000000000(string);
      O000000000O.O0000000000.put(var1, O00000OO0OO0O.W239.O00000000(var1));
      O00000OO000O.O00000000().O000000000(var1);
      O000000000000();
      if (WildClient.O00000000 != null && WildClient.O00000000.O0000000000O00 != null) {
         WildClient.O00000000.O0000000000O00.O0000000000();
      }
   }

   public static synchronized void O000000000000() {
      O0000000000000();
      File var0 = O000000000000O();
      if (var0 != null) {
         try {
            File var1 = var0.getParentFile();
            if (var1 != null && !var1.exists()) {
               var1.mkdirs();
            }

            try (FileWriter var2 = new FileWriter(var0)) {
               O0000000000OOO.toJson(O000000000O, var2);
            }
         } catch (Throwable var7) {
         }
      }
   }

   private static void O0000000000000() {
      if (!O000000000O0) {
         O000000000O0 = true;
         O000000000O = new O00000OO0OO0O.W240();
         File var0 = O000000000000O();
         if (var0 != null && var0.exists()) {
            try (FileReader var1 = new FileReader(var0)) {
               O00000OO0OO0O.W240 var2 = (O00000OO0OO0O.W240)O0000000000OOO.fromJson(var1, O00000OO0OO0O.W240.class);
               if (var2 != null) {
                  O000000000O = var2;
               }
            } catch (Throwable var6) {
               O000000000O = new O00000OO0OO0O.W240();
            }

            O000000000O.O00000000();
         } else {
            O000000000O.O00000000();
         }
      }
   }

   private static File O000000000000O() {
      return WildClient.O00000000 != null && WildClient.O00000000.O0000000000000 != null
         ? new File(WildClient.O00000000.O0000000000000, "hud-layouts.json")
         : null;
   }

   static float O00000000(float f, float g, float h) {
      return !Float.isFinite(f) ? g : Math.max(g, Math.min(h, f));
   }

   private static String O0000000000(String string) {
      for (String var4 : O0000000000OO0) {
         if (var4.equals(string)) {
            return var4;
         }
      }

      return "HUD_HotKeys";
   }

   public static final class W239 {
      public float O00000000 = 14.0F;
      public float O000000000 = 11.0F;
      public float O0000000000 = 7.0F;
      public float O00000000000 = 7.0F;
      public float O000000000000 = 7.0F;
      public float O0000000000000 = 6.0F;
      public float O000000000000O = 4.0F;
      public float O00000000000O = 7.0F;
      public float O00000000000O0 = 5.0F;
      public float O00000000000OO = 32.0F;
      public float O0000000000O = 22.0F;
      public float O0000000000O0 = 28.0F;
      public float O0000000000O00 = 22.0F;
      public float O0000000000O0O = 0.0F;
      public float O0000000000OO = 2.0F;
      public O00000OO0OO0O.W241 O0000000000OO0 = new O00000OO0OO0O.W241(17.0F, 29.0F, false);
      public O00000OO0OO0O.W241 O0000000000OOO = new O00000OO0OO0O.W241(-34.0F, 29.5F, true);
      public O00000OO0OO0O.W241 O000000000O = new O00000OO0OO0O.W241(0.0F, 0.0F, false);
      public O00000OO0OO0O.W241 O000000000O0 = new O00000OO0OO0O.W241(0.0F, 0.0F, false);

      public static O00000OO0OO0O.W239 O00000000() {
         return O00000000("HUD_HotKeys");
      }

      public static O00000OO0OO0O.W239 O00000000(String string) {
         O00000OO0OO0O.W239 var1 = new O00000OO0OO0O.W239();
         if ("HUD_Inventory".equals(string)) {
            var1.O0000000000OO0 = new O00000OO0OO0O.W241(17.0F, 29.0F, false);
            var1.O0000000000OOO = new O00000OO0OO0O.W241(-34.0F, 30.0F, true);
            var1.O0000000000 = 9.0F;
            var1.O00000000000 = 9.0F;
            var1.O0000000000O0 = 26.0F;
            var1.O0000000000O00 = 28.0F;
         } else if ("HUD_Potions".equals(string)) {
            var1.O0000000000OO0 = new O00000OO0OO0O.W241(17.0F, 29.0F, false);
            var1.O0000000000OOO = new O00000OO0OO0O.W241(-34.0F, 28.5F, true);
            var1.O0000000000O00 = 24.0F;
         } else if ("HUD_WaterMark".equals(string)) {
            var1.O00000000000OO = 32.0F;
            var1.O0000000000O = 32.0F;
            var1.O0000000000O0 = 24.0F;
            var1.O0000000000O00 = 26.0F;
            var1.O00000000 = 14.0F;
            var1.O00000000000O = 7.0F;
            var1.O00000000000O0 = 5.0F;
         } else if ("HUD_ArrayList".equals(string)) {
            var1.O00000000 = 15.0F;
            var1.O000000000 = 15.0F;
            var1.O0000000000 = 15.0F;
            var1.O00000000000 = 15.0F;
            var1.O0000000000000 = 15.0F;
            var1.O00000000000O = 4.0F;
            var1.O00000000000O0 = 0.0F;
            var1.O00000000000OO = 0.0F;
            var1.O0000000000O = 32.0F;
         } else if ("HUD_TargetHUD".equals(string)) {
            var1.O00000000 = 15.0F;
            var1.O000000000 = 12.0F;
            var1.O0000000000 = 10.0F;
            var1.O00000000000 = 10.0F;
            var1.O000000000000 = 10.0F;
            var1.O0000000000O = 24.0F;
            var1.O0000000000O00 = 28.0F;
         } else if ("HUD_HotBar".equals(string) || "hud_armor".equals(string)) {
            var1.O00000000 = 10.0F;
            var1.O0000000000 = 5.0F;
            var1.O000000000000O = 4.0F;
            var1.O00000000000O = 5.0F;
            var1.O00000000000O0 = 3.0F;
         }

         return var1;
      }

      public void O000000000() {
         this.O00000000 = O00000OO0OO0O.O00000000(this.O00000000, 0.0F, 32.0F);
         this.O000000000 = O00000OO0OO0O.O00000000(this.O000000000, 0.0F, 28.0F);
         this.O0000000000 = O00000OO0OO0O.O00000000(this.O0000000000, 0.0F, 24.0F);
         this.O00000000000 = O00000OO0OO0O.O00000000(this.O00000000000, 0.0F, 24.0F);
         this.O000000000000 = O00000OO0OO0O.O00000000(this.O000000000000, 0.0F, 24.0F);
         this.O0000000000000 = O00000OO0OO0O.O00000000(this.O0000000000000, 0.0F, 22.0F);
         this.O000000000000O = O00000OO0OO0O.O00000000(this.O000000000000O, 0.0F, 14.0F);
         this.O00000000000O = O00000OO0OO0O.O00000000(this.O00000000000O, 2.0F, 18.0F);
         this.O00000000000O0 = O00000OO0OO0O.O00000000(this.O00000000000O0, 0.0F, 18.0F);
         this.O00000000000OO = O00000OO0OO0O.O00000000(this.O00000000000OO, 0.0F, 48.0F);
         this.O0000000000O = O00000OO0OO0O.O00000000(this.O0000000000O, 14.0F, 42.0F);
         this.O0000000000O0 = O00000OO0OO0O.O00000000(this.O0000000000O0, 14.0F, 38.0F);
         this.O0000000000O00 = O00000OO0OO0O.O00000000(this.O0000000000O00, 12.0F, 38.0F);
         this.O0000000000O0O = O00000OO0OO0O.O00000000(this.O0000000000O0O, -24.0F, 90.0F);
         this.O0000000000OO = O00000OO0OO0O.O00000000(this.O0000000000OO, 0.0F, 7.0F);
         if (this.O0000000000OO0 == null) {
            this.O0000000000OO0 = new O00000OO0OO0O.W241(17.0F, 29.0F, false);
         }

         if (this.O0000000000OOO == null) {
            this.O0000000000OOO = new O00000OO0OO0O.W241(-34.0F, 29.5F, true);
         }

         if (this.O000000000O == null) {
            this.O000000000O = new O00000OO0OO0O.W241(0.0F, 0.0F, false);
         }

         if (this.O000000000O0 == null) {
            this.O000000000O0 = new O00000OO0OO0O.W241(0.0F, 0.0F, false);
         }

         this.O0000000000OO0.O00000000 = O00000OO0OO0O.O00000000(this.O0000000000OO0.O00000000, -80.0F, 260.0F);
         this.O0000000000OO0.O000000000 = O00000OO0OO0O.O00000000(this.O0000000000OO0.O000000000, -40.0F, 180.0F);
         this.O0000000000OOO.O00000000 = O00000OO0OO0O.O00000000(this.O0000000000OOO.O00000000, -220.0F, 80.0F);
         this.O0000000000OOO.O000000000 = O00000OO0OO0O.O00000000(this.O0000000000OOO.O000000000, -40.0F, 180.0F);
         this.O000000000O.O00000000 = O00000OO0OO0O.O00000000(this.O000000000O.O00000000, -100.0F, 140.0F);
         this.O000000000O.O000000000 = O00000OO0OO0O.O00000000(this.O000000000O.O000000000, -60.0F, 140.0F);
         this.O000000000O0.O00000000 = O00000OO0OO0O.O00000000(this.O000000000O0.O00000000, -100.0F, 140.0F);
         this.O000000000O0.O000000000 = O00000OO0OO0O.O00000000(this.O000000000O0.O000000000, -60.0F, 140.0F);
      }
   }

   static final class W240 {
      public int O00000000 = 1;
      public O00000OO0OO0O.W239 O000000000;
      public Map<String, O00000OO0OO0O.W239> O0000000000 = new HashMap<>();

      void O00000000() {
         if (this.O0000000000 == null) {
            this.O0000000000 = new HashMap<>();
         }

         if (this.O000000000 != null) {
            this.O0000000000.putIfAbsent("HUD_HotKeys", this.O000000000);
            this.O000000000 = null;
         }

         for (String var4 : O00000OO0OO0O.O0000000000OO0) {
            this.O0000000000.putIfAbsent(var4, O00000OO0OO0O.W239.O00000000(var4));
         }

         for (O00000OO0OO0O.W239 var6 : this.O0000000000.values()) {
            if (var6 != null) {
               var6.O000000000();
            }
         }
      }
   }

   public static final class W241 {
      public float O00000000;
      public float O000000000;
      public boolean O0000000000;

      public W241() {
      }

      public W241(float f, float g, boolean bl) {
         this.O00000000 = f;
         this.O000000000 = g;
         this.O0000000000 = bl;
      }
   }
}
