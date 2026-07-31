package ru.metaculture.protection;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

public final class O000000OO00 {
   public static final String[] O00000000 = new String[]{"Multipoint", "Center", "Eyes", "Closest"};
   public static final String[] O000000000 = new String[]{"Cycle", "Closest", "Random"};
   public static final String[] O0000000000 = new String[]{"Smooth", "Static", "Locked"};
   public static final String[] O00000000000 = new String[]{"FunTime", "Spooky", "Holy", "Matrix", "Smooth", "Snap"};
   public static final String O000000000000 = "Custom";
   public static final int O0000000000000 = 12;
   private static final Gson O00000000O00OO = new GsonBuilder().setPrettyPrinting().create();
   private static O000000OO00 O00000000O0O;
   @SerializedName("name")
   public String O000000000000O = "FunTime";
   @SerializedName("engine")
   public String O00000000000O = "FunTime";
   @SerializedName("preset")
   public String O00000000000O0 = "FunTime";
   @SerializedName("pointMode")
   public String O00000000000OO = "Multipoint";
   @SerializedName("yawSpeedMin")
   public float O0000000000O = 35.0F;
   @SerializedName("yawSpeedMax")
   public float O0000000000O0 = 55.0F;
   @SerializedName("pitchSpeedMin")
   public float O0000000000O00 = 6.0F;
   @SerializedName("pitchSpeedMax")
   public float O0000000000O0O = 12.0F;
   @SerializedName("attackYawSpeed")
   public float O0000000000OO = 65.0F;
   @SerializedName("attackPitchSpeed")
   public float O0000000000OO0 = 22.0F;
   @SerializedName("yawRandom")
   public float O0000000000OOO = 4.0F;
   @SerializedName("pitchRandom")
   public float O000000000O = 3.0F;
   @SerializedName("oscillateX")
   public float O000000000O0 = 0.2F;
   @SerializedName("oscillateY")
   public float O000000000O00 = 0.12F;
   @SerializedName("oscillateSpeed")
   public float O000000000O000 = 1.0F;
   @SerializedName("sidePointOffset")
   public float O000000000O00O = 0.0F;
   @SerializedName("returnSpeed")
   public float O000000000O0O = 30.0F;
   @SerializedName("moveHead")
   public boolean O000000000O0O0 = false;
   @SerializedName("multipointMode")
   public String O000000000O0OO = "Cycle";
   @SerializedName("pointDwell")
   public float O000000000OO = 0.9F;
   @SerializedName("pitchFollow")
   public String O000000000OO0 = "Smooth";
   @SerializedName("yawOffset")
   public float O000000000OO00 = 0.0F;
   @SerializedName("pitchOffset")
   public float O000000000OO0O = 0.0F;
   @SerializedName("pitchMin")
   public float O000000000OOO = -90.0F;
   @SerializedName("pitchMax")
   public float O000000000OOO0 = 90.0F;
   @SerializedName("headLead")
   public float O000000000OOOO = 0.0F;
   @SerializedName("overlayLerp")
   public float O00000000O = 0.35F;
   @SerializedName("overlayAimSpeed")
   public float O00000000O0 = 1.0F;
   @SerializedName("pointSwitchSpeed")
   public float O00000000O00 = 1.0F;
   @SerializedName("lookAway")
   public boolean O00000000O000 = false;
   @SerializedName("lookAwayAngle")
   public float O00000000O0000 = 80.0F;
   @SerializedName("lookAwayInterval")
   public float O00000000O000O = 5.0F;
   @SerializedName("points")
   public List<O000000OO00.W44> O00000000O00O = new ArrayList<>();
   public static final String O00000000O00O0 = "WILD-ROT:";

   private O000000OO00() {
   }

   public static synchronized O000000OO00 O00000000() {
      if (O00000000O0O == null) {
         O00000000O0O = O00000000000OO();
      }

      O00000000O0O.O000000000();
      return O00000000O0O;
   }

   public synchronized void O000000000() {
      this.O000000000000O();
      if (this.O00000000000OO == null || !O00000000(O00000000, this.O00000000000OO)) {
         this.O00000000000OO = "Multipoint";
      }

      if (this.O000000000O0OO == null || !O00000000(O000000000, this.O000000000O0OO)) {
         this.O000000000O0OO = "Cycle";
      }

      if (this.O000000000OO0 == null || !O00000000(O0000000000, this.O000000000OO0)) {
         this.O000000000OO0 = "Smooth";
      }

      if (this.O00000000O00O == null) {
         this.O00000000O00O = new ArrayList<>();
      }

      while (this.O00000000O00O.size() > 12) {
         this.O00000000O00O.remove(this.O00000000O00O.size() - 1);
      }

      for (O000000OO00.W44 var2 : this.O00000000O00O) {
         var2.O00000000 = O00000000(var2.O00000000, -0.5F, 0.5F);
         var2.O000000000 = O00000000(var2.O000000000, 0.0F, 1.0F);
      }

      this.O0000000000O = O00000000(this.O0000000000O, 0.0F, 200.0F);
      this.O0000000000O0 = O00000000(this.O0000000000O0, 0.0F, 200.0F);
      if (this.O0000000000O0 < this.O0000000000O) {
         this.O0000000000O0 = this.O0000000000O;
      }

      this.O0000000000O00 = O00000000(this.O0000000000O00, 0.0F, 200.0F);
      this.O0000000000O0O = O00000000(this.O0000000000O0O, 0.0F, 200.0F);
      if (this.O0000000000O0O < this.O0000000000O00) {
         this.O0000000000O0O = this.O0000000000O00;
      }

      this.O0000000000OO = O00000000(this.O0000000000OO, 0.0F, 240.0F);
      this.O0000000000OO0 = O00000000(this.O0000000000OO0, 0.0F, 240.0F);
      this.O0000000000OOO = O00000000(this.O0000000000OOO, 0.0F, 20.0F);
      this.O000000000O = O00000000(this.O000000000O, 0.0F, 20.0F);
      this.O000000000O0 = O00000000(this.O000000000O0, 0.0F, 1.0F);
      this.O000000000O00 = O00000000(this.O000000000O00, 0.0F, 1.0F);
      this.O000000000O000 = O00000000(this.O000000000O000, 0.2F, 3.0F);
      this.O000000000O00O = O00000000(this.O000000000O00O, 0.0F, 0.6F);
      this.O000000000O0O = O00000000(this.O000000000O0O, 5.0F, 120.0F);
      this.O000000000OO = O00000000(this.O000000000OO, 0.1F, 3.0F);
      this.O000000000OO00 = O00000000(this.O000000000OO00, -30.0F, 30.0F);
      this.O000000000OO0O = O00000000(this.O000000000OO0O, -30.0F, 30.0F);
      this.O000000000OOO = O00000000(this.O000000000OOO, -90.0F, 0.0F);
      this.O000000000OOO0 = O00000000(this.O000000000OOO0, 0.0F, 90.0F);
      this.O000000000OOOO = O00000000(this.O000000000OOOO, 0.0F, 0.6F);
      this.O00000000O = O00000000(this.O00000000O, 0.05F, 1.0F);
      this.O00000000O0 = O00000000(this.O00000000O0, 0.2F, 3.0F);
      this.O00000000O00 = O00000000(this.O00000000O00, 0.1F, 3.0F);
      this.O00000000O0000 = O00000000(this.O00000000O0000, 0.0F, 90.0F);
      this.O00000000O000O = O00000000(this.O00000000O000O, 1.5F, 15.0F);
   }

   public synchronized void O00000000(float f, float g) {
      if (this.O00000000O00O.size() < 12) {
         this.O00000000O00O.add(new O000000OO00.W44(O00000000(f, -0.5F, 0.5F), O00000000(g, 0.0F, 1.0F)));
         O0000000000000();
      }
   }

   public synchronized void O0000000000() {
      this.O00000000O00O.clear();
      O0000000000000();
   }

   public synchronized void O00000000(O000000OO00.W44 o00000000) {
      this.O00000000O00O.remove(o00000000);
      O0000000000000();
   }

   private static boolean O00000000(String[] strings, String string) {
      for (String var5 : strings) {
         if (var5.equals(string)) {
            return true;
         }
      }

      return false;
   }

   public synchronized void O00000000(String string) {
      switch (string) {
         case "FunTime":
            this.O00000000000OO = "Multipoint";
            this.O0000000000O = 35.0F;
            this.O0000000000O0 = 55.0F;
            this.O0000000000O00 = 5.0F;
            this.O0000000000O0O = 10.0F;
            this.O0000000000OO = 65.0F;
            this.O0000000000OO0 = 22.0F;
            this.O0000000000OOO = 4.3F;
            this.O000000000O = 3.6F;
            this.O000000000O0 = 0.2F;
            this.O000000000O00 = 0.13F;
            this.O000000000O000 = 1.0F;
            this.O000000000O00O = 0.0F;
            this.O000000000O0O = 30.0F;
            break;
         case "Spooky":
            this.O00000000000OO = "Multipoint";
            this.O0000000000O = 40.0F;
            this.O0000000000O0 = 60.0F;
            this.O0000000000O00 = 10.0F;
            this.O0000000000O0O = 21.0F;
            this.O0000000000OO = 60.0F;
            this.O0000000000OO0 = 25.0F;
            this.O0000000000OOO = 3.0F;
            this.O000000000O = 6.0F;
            this.O000000000O0 = 0.12F;
            this.O000000000O00 = 0.05F;
            this.O000000000O000 = 1.2F;
            this.O000000000O00O = 0.0F;
            this.O000000000O0O = 30.0F;
            break;
         case "Holy":
            this.O00000000000OO = "Center";
            this.O0000000000O = 50.0F;
            this.O0000000000O0 = 70.0F;
            this.O0000000000O00 = 10.0F;
            this.O0000000000O0O = 20.0F;
            this.O0000000000OO = 70.0F;
            this.O0000000000OO0 = 24.0F;
            this.O0000000000OOO = 2.0F;
            this.O000000000O = 2.0F;
            this.O000000000O0 = 0.2F;
            this.O000000000O00 = 0.3F;
            this.O000000000O000 = 0.7F;
            this.O000000000O00O = 0.0F;
            this.O000000000O0O = 30.0F;
            break;
         case "Matrix":
            this.O00000000000OO = "Eyes";
            this.O0000000000O = 38.0F;
            this.O0000000000O0 = 43.0F;
            this.O0000000000O00 = 3.0F;
            this.O0000000000O0O = 5.0F;
            this.O0000000000OO = 43.0F;
            this.O0000000000OO0 = 6.0F;
            this.O0000000000OOO = 3.0F;
            this.O000000000O = 4.0F;
            this.O000000000O0 = 0.4F;
            this.O000000000O00 = 0.02F;
            this.O000000000O000 = 1.4F;
            this.O000000000O00O = 0.0F;
            this.O000000000O0O = 30.0F;
            break;
         case "Smooth":
            this.O00000000000OO = "Center";
            this.O0000000000O = 18.0F;
            this.O0000000000O0 = 26.0F;
            this.O0000000000O00 = 4.0F;
            this.O0000000000O0O = 8.0F;
            this.O0000000000OO = 30.0F;
            this.O0000000000OO0 = 12.0F;
            this.O0000000000OOO = 0.5F;
            this.O000000000O = 0.5F;
            this.O000000000O0 = 0.0F;
            this.O000000000O00 = 0.0F;
            this.O000000000O000 = 1.0F;
            this.O000000000O00O = 0.0F;
            this.O000000000O0O = 20.0F;
            break;
         case "Snap":
            this.O00000000000OO = "Closest";
            this.O0000000000O = 120.0F;
            this.O0000000000O0 = 180.0F;
            this.O0000000000O00 = 80.0F;
            this.O0000000000O0O = 120.0F;
            this.O0000000000OO = 200.0F;
            this.O0000000000OO0 = 160.0F;
            this.O0000000000OOO = 1.0F;
            this.O000000000O = 1.0F;
            this.O000000000O0 = 0.0F;
            this.O000000000O00 = 0.0F;
            this.O000000000O000 = 1.0F;
            this.O000000000O00O = 0.0F;
            this.O000000000O0O = 40.0F;
         case "Custom":
      }

      this.O000000000000O = string;
      if ("Custom".equals(string)) {
         this.O00000000000O = "Custom";
         this.O00000000000O0 = "Custom";
      } else if (O00000000(O00000000000, string)) {
         this.O00000000000O = string;
         this.O00000000000O0 = string;
      } else {
         this.O00000000000O = "Custom";
         this.O00000000000O0 = "Custom";
      }

      this.O000000000();
      O0000000000000();
   }

   private synchronized void O000000000000O() {
      String var1 = O00000000000(this.O00000000000O0);
      if (var1 == null) {
         var1 = O00000000000(this.O000000000000O);
      }

      if (var1 == null) {
         var1 = O00000000000(this.O00000000000O);
      }

      if (var1 != null) {
         this.O00000000000O0 = var1;
         this.O000000000000O = var1;
         this.O00000000000O = var1;
      } else if (this.O00000000000O()) {
         this.O000000000000O = "Custom";
         this.O00000000000O = "Custom";
         this.O00000000000O0 = "Custom";
      } else {
         if (this.O00000000000O == null || this.O00000000000O.isBlank()) {
            this.O00000000000O = "Custom";
         }

         if (!"Custom".equals(this.O00000000000O) && !O00000000(O00000000000, this.O00000000000O)) {
            this.O00000000000O = "Custom";
         }

         if (this.O000000000000O == null || this.O000000000000O.isBlank()) {
            this.O000000000000O = this.O00000000000O;
         }

         if (this.O00000000000O0 == null || this.O00000000000O0.isBlank()) {
            this.O00000000000O0 = "Custom".equals(this.O00000000000O) ? "Custom" : this.O00000000000O;
         }
      }
   }

   private boolean O00000000000O() {
      return "Custom".equalsIgnoreCase(O0000000000(this.O00000000000O0))
         || "Custom".equalsIgnoreCase(O0000000000(this.O000000000000O))
         || "custom".equalsIgnoreCase(O0000000000(this.O000000000000O));
   }

   private static String O0000000000(String string) {
      return string == null ? "" : string.trim();
   }

   private static String O00000000000(String string) {
      if (string != null && !string.isBlank()) {
         String var1 = string.trim();
         if (!"Custom".equalsIgnoreCase(var1) && !"custom".equalsIgnoreCase(var1)) {
            for (String var5 : O00000000000) {
               if (var5.equalsIgnoreCase(var1)) {
                  return var5;
               }
            }

            return null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public synchronized void O00000000000() {
      this.O00000000("FunTime");
      this.O00000000O00O.clear();
      this.O000000000O0OO = "Cycle";
      this.O000000000OO = 0.9F;
      this.O00000000O00 = 1.0F;
      this.O000000000O0O0 = false;
      this.O00000000000O0();
      this.O000000000();
      O0000000000000();
   }

   private synchronized void O00000000000O0() {
      this.O000000000OO0 = "Smooth";
      this.O000000000OO00 = 0.0F;
      this.O000000000OO0O = 0.0F;
      this.O000000000OOO = -90.0F;
      this.O000000000OOO0 = 90.0F;
      this.O000000000OOOO = 0.0F;
      this.O00000000O = 0.35F;
      this.O00000000O0 = 1.0F;
      this.O00000000O000 = false;
      this.O00000000O0000 = 80.0F;
      this.O00000000O000O = 5.0F;
   }

   public synchronized String O000000000000() {
      this.O000000000();
      String var1 = O00000000O00OO.toJson(this);
      String var2 = Base64.getUrlEncoder().withoutPadding().encodeToString(var1.getBytes(StandardCharsets.UTF_8));
      return "WILD-ROT:" + var2;
   }

   public static synchronized boolean O000000000(String string) {
      if (string == null) {
         return false;
      } else {
         String var1 = string.trim();
         if (var1.startsWith("WILD-ROT:")) {
            var1 = var1.substring("WILD-ROT:".length());
         }

         var1 = var1.trim();
         if (var1.isEmpty()) {
            return false;
         } else {
            try {
               byte[] var2 = Base64.getUrlDecoder().decode(var1);
               String var3 = new String(var2, StandardCharsets.UTF_8);
               O000000OO00 var4 = (O000000OO00)O00000000O00OO.fromJson(var3, O000000OO00.class);
               if (var4 == null) {
                  return false;
               } else {
                  O000000OO00 var5 = O00000000();
                  var5.O00000000(var4);
                  var5.O000000000();
                  O0000000000000();
                  return true;
               }
            } catch (Throwable var6) {
               return false;
            }
         }
      }
   }

   private synchronized void O00000000(O000000OO00 o000000OO00) {
      this.O000000000000O = o000000OO00.O000000000000O;
      this.O00000000000O = o000000OO00.O00000000000O;
      this.O00000000000O0 = o000000OO00.O00000000000O0;
      this.O00000000000OO = o000000OO00.O00000000000OO;
      this.O0000000000O = o000000OO00.O0000000000O;
      this.O0000000000O0 = o000000OO00.O0000000000O0;
      this.O0000000000O00 = o000000OO00.O0000000000O00;
      this.O0000000000O0O = o000000OO00.O0000000000O0O;
      this.O0000000000OO = o000000OO00.O0000000000OO;
      this.O0000000000OO0 = o000000OO00.O0000000000OO0;
      this.O0000000000OOO = o000000OO00.O0000000000OOO;
      this.O000000000O = o000000OO00.O000000000O;
      this.O000000000O0 = o000000OO00.O000000000O0;
      this.O000000000O00 = o000000OO00.O000000000O00;
      this.O000000000O000 = o000000OO00.O000000000O000;
      this.O000000000O00O = o000000OO00.O000000000O00O;
      this.O000000000O0O = o000000OO00.O000000000O0O;
      this.O000000000O0O0 = o000000OO00.O000000000O0O0;
      this.O000000000O0OO = o000000OO00.O000000000O0OO;
      this.O000000000OO = o000000OO00.O000000000OO;
      this.O000000000OO0 = o000000OO00.O000000000OO0;
      this.O000000000OO00 = o000000OO00.O000000000OO00;
      this.O000000000OO0O = o000000OO00.O000000000OO0O;
      this.O000000000OOO = o000000OO00.O000000000OOO;
      this.O000000000OOO0 = o000000OO00.O000000000OOO0;
      this.O000000000OOOO = o000000OO00.O000000000OOOO;
      this.O00000000O = o000000OO00.O00000000O;
      this.O00000000O0 = o000000OO00.O00000000O0;
      this.O00000000O00 = o000000OO00.O00000000O00;
      this.O00000000O000 = o000000OO00.O00000000O000;
      this.O00000000O0000 = o000000OO00.O00000000O0000;
      this.O00000000O000O = o000000OO00.O00000000O000O;
      this.O00000000O00O = new ArrayList<>();
      if (o000000OO00.O00000000O00O != null) {
         for (O000000OO00.W44 var3 : o000000OO00.O00000000O00O) {
            if (var3 != null) {
               this.O00000000O00O.add(new O000000OO00.W44(var3.O00000000, var3.O000000000));
            }
         }
      }
   }

   public static synchronized void O0000000000000() {
      if (O00000000O0O != null) {
         File var0 = O0000000000O();
         if (var0 != null) {
            try {
               File var1 = var0.getParentFile();
               if (var1 != null && !var1.exists()) {
                  var1.mkdirs();
               }

               try (FileWriter var2 = new FileWriter(var0)) {
                  O00000000O00OO.toJson(O00000000O0O, var2);
               }
            } catch (Throwable var7) {
            }
         }
      }
   }

   private static O000000OO00 O00000000000OO() {
      File var0 = O0000000000O();
      if (var0 != null && var0.exists()) {
         try {
            O000000OO00 var3;
            try (FileReader var7 = new FileReader(var0)) {
               O000000OO00 var2 = (O000000OO00)O00000000O00OO.fromJson(var7, O000000OO00.class);
               if (var2 == null) {
                  return new O000000OO00();
               }

               var3 = var2;
            }

            return var3;
         } catch (Throwable var6) {
            return new O000000OO00();
         }
      } else {
         O000000OO00 var1 = new O000000OO00();
         var1.O000000000();
         return var1;
      }
   }

   private static File O0000000000O() {
      return WildClient.O00000000 != null && WildClient.O00000000.O0000000000000 != null
         ? new File(WildClient.O00000000.O0000000000000, "custom-rotation.json")
         : null;
   }

   private static float O00000000(float f, float g, float h) {
      return !Float.isFinite(f) ? g : Math.max(g, Math.min(h, f));
   }

   public static final class W44 {
      @SerializedName("x")
      public float O00000000;
      @SerializedName("y")
      public float O000000000;

      public W44() {
      }

      public W44(float f, float g) {
         this.O00000000 = f;
         this.O000000000 = g;
      }
   }
}
