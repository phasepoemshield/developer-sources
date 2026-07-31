package ru.metaculture.protection;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import net.minecraft.client.MinecraftClient;
import org.wild.module.api.Module;

public final class O00000OO0O0 {
   static final O0000O00O0O0O0 O00000000 = O0000O00O0O0O0.O00000000(2.2F, 0.72F);
   private static final O0000O00O0O0O0 O000000000 = O0000O00O0O0O0.O00000000(1.9F, 0.68F);
   private static final float O0000000000 = 16.0F;
   private static final float O00000000000 = 8.0F;
   private static final float O000000000000 = 8.0F;
   private static final float O0000000000000 = 0.001F;
   private static final long O000000000000O = 1200000000L;
   private final O0000O00O0O0OO O00000000000O;
   private final O0000O00O0O0OO O00000000000O0;
   private final O0000O00O0O0OO O00000000000OO;
   private final O0000O00O0O0OO O0000000000O;
   private final O0000O00O0O0OO O0000000000O0;
   private final O0000O00O0O0OO O0000000000O00;
   private final O0000O00O0O0OO O0000000000O0O;
   private final O00000OO0O0O0 O0000000000OO;
   private O00000OO0O00 O0000000000OO0;
   private O00000OO0O000.W230 O0000000000OOO;
   private O00000OO0O000.W231 O000000000O = new O00000OO0O000.W231(0.0F, 0.0F, 0.0F, 0.0F);
   private O00000OO0O00O0 O000000000O0;
   private float O000000000O00;
   private float O000000000O000;
   private float O000000000O00O = Float.NaN;
   private float O000000000O0O = Float.NaN;
   private float O000000000O0O0 = 1.0F;
   private boolean O000000000O0OO;
   private boolean O000000000OO;
   private boolean O000000000OO0;
   private long O000000000OO00;
   private double O000000000OO0O = -1.0;
   private double O000000000OOO = -1.0;

   private static O0000O00O0O0OO O00000000000O() {
      O0000O00O0O0OO var0 = new O0000O00O0O0OO(O0000O00O0O000.O00000000(), O000000000, 0.0F, 0.0F, 1.0F, 5.0E-4F, 5.0E-4F);
      var0.O00000000(O0000O00O0O0O.O0000000000);
      return var0;
   }

   O00000OO0O0(O0000O00O0O0OO o0000O00O0O0OO) {
      this.O00000000000O = Objects.requireNonNull(o0000O00O0O0OO, "visibilityAnimator");
      this.O00000000000O0 = O00000000000O();
      this.O00000000000OO = O00000000000O();
      this.O0000000000O = O00000000000O();
      this.O0000000000O0 = O00000000000O();
      this.O0000000000O00 = O00000000000O();
      this.O0000000000O0O = O00000000000O();
      this.O0000000000OO = new O00000OO0O0O0(16.0F, 8.0F, 8.0F);
   }

   private void O00000000000O0() {
      this.O000000000O0 = null;
      if (this.O0000000000OO0 != null && this.O0000000000OO0.O0000000000O0()) {
         Setting var1 = this.O0000000000OO0.O0000000000();
         if (var1 instanceof BooleanSetting var2) {
            this.O000000000O0 = new O00000OO0O0O(this.O0000000000OO0, var2);
         } else if (var1 instanceof NumberSetting var3) {
            this.O000000000O0 = new O00000OO0O00OO(this.O0000000000OO0, var3);
         } else if (var1 instanceof ModeSetting var4) {
            this.O000000000O0 = new O00000OO0O000O(this.O0000000000OO0, var4);
         } else if (var1 instanceof MultiSelectSetting var5) {
            this.O000000000O0 = new O00000OO0O00O(this.O0000000000OO0, var5);
         }
      }
   }

   private float O00000000000OO() {
      return this.O000000000O0 == null ? 0.0F : Math.max(0.0F, this.O000000000O0.O000000000000());
   }

   private void O0000000000O() {
      if (this.O000000000O0 != null && this.O0000000000OOO != null) {
         O00000OO0O000.W231 var1 = this.O0000000000OOO.valueContent();
         if (!(var1.O00000000000() <= 0.0F)) {
            this.O000000000O0.O00000000(var1);
         }
      }
   }

   private boolean O000000000(double d, double e, int i) {
      if (this.O000000000O0 == null) {
         return false;
      } else if (this.O000000000O0.O000000000000O()) {
         return this.O000000000O0.O00000000(d, e, i) ? true : true;
      } else {
         return this.O0000000000OOO != null && this.O0000000000OOO.valueContent().O00000000(d, e) ? this.O000000000O0.O00000000(d, e, i) : false;
      }
   }

   private boolean O000000000(double d, double e, double f, double g) {
      if (this.O000000000O0 == null) {
         return false;
      } else if (this.O000000000O0.O000000000000O()) {
         return this.O000000000O0.O00000000(d, e, f, g) ? true : true;
      } else {
         return this.O0000000000OOO != null && this.O0000000000OOO.valueContent().O00000000(d, e) ? this.O000000000O0.O00000000(d, e, f, g) : false;
      }
   }

   public static O00000OO0O0 O00000000() {
      return O00000OO0O0.W228.O00000000;
   }

   public synchronized void O00000000(Module module, double d, double e, int i, int j) {
      Objects.requireNonNull(module, "module");
      O00000OO0O00 var8 = O00000OO0O00.O00000000(module);
      this.O00000000(var8, d, e, i, j);
   }

   public synchronized void O00000000(Module module, Setting o0000000OOO00O, double d, double e, Object object) {
      MinecraftClient var8 = MinecraftClient.getInstance();
      int var9 = 1;
      int var10 = 1;
      if (var8 != null && var8.getWindow() != null) {
         var9 = Math.max(1, var8.getWindow().getFramebufferWidth());
         var10 = Math.max(1, var8.getWindow().getFramebufferHeight());
      }

      this.O00000000(module, o0000000OOO00O, d, e, var9, var10, object);
   }

   public synchronized void O00000000(Module module, Setting o0000000OOO00O, double d, double e, int i, int j, Object object) {
      Objects.requireNonNull(module, "module");
      Objects.requireNonNull(o0000000OOO00O, "setting");
      Object var10 = object != null ? object : O00000000(o0000000OOO00O);
      Object var11 = O000000000(o0000000OOO00O);
      byte var12 = -1;
      int var13 = Math.max(1, i);
      int var14 = Math.max(1, j);
      O00000OO0O00 var15 = O00000OO0O00.O00000000(module, o0000000OOO00O, var10, var11, var12, O000000O0000O.TOGGLE);
      this.O00000000(var15, d, e, var13, var14);
   }

   private void O00000000(O00000OO0O00 o00000OO0O00, double d, double e, int i, int j) {
      this.O0000000000OO0 = Objects.requireNonNull(o00000OO0O00, "newModel");
      this.O000000000O0OO = false;
      this.O000000000OO0 = false;
      this.O000000000OO00 = 0L;
      this.O000000000OO = false;
      O000000O00000O.O00000000().O00000000(false);
      this.O00000000000O0();
      O00000OO0O000.W230 var8 = O00000OO0O000.O00000000(this.O0000000000OO0, 0.0F, 0.0F, this.O00000000000OO());
      float var9 = var8.bounds().O0000000000();
      float var10 = var8.bounds().O00000000000();
      this.O000000000O00O = O00000000(d);
      this.O000000000O0O = O00000000(e);
      this.O000000000O0O0 = this.O000000000O0();
      this.O00000000(var9, var10, i, j);
      this.O0000000000OOO = O00000OO0O000.O00000000(this.O0000000000OO0, this.O000000000O00, this.O000000000O000, this.O00000000000OO());
      this.O000000000O = this.O0000000000OOO.field();
      this.O0000000000O();
      this.O0000000000O0O();
      this.O0000000000OOO();
      this.O0000000000O0O.O0000000000(1.0F);
      this.O00000000000O.O0000000000(1.0F);
   }

   private static Object O00000000(Setting o0000000OOO00O) {
      if (o0000000OOO00O instanceof BooleanSetting) {
         return ((BooleanSetting)o0000000OOO00O).O0000000000();
      } else if (o0000000OOO00O instanceof ModeSetting) {
         return ((ModeSetting)o0000000OOO00O).O000000000000;
      } else if (o0000000OOO00O instanceof NumberSetting) {
         return (double)((NumberSetting)o0000000OOO00O).O00000000000;
      } else if (o0000000OOO00O instanceof MultiSelectSetting) {
         return new LinkedHashSet<>(((MultiSelectSetting)o0000000OOO00O).O000000000000O);
      } else {
         return o0000000OOO00O instanceof ColorSetting var1
            ? O00000OO0O0OO0.O00000000(var1.O000000000000(), var1.O0000000000O00, var1.O0000000000O0O, var1.O0000000000OO)
            : null;
      }
   }

   private static Object O000000000(Setting o0000000OOO00O) {
      if (o0000000OOO00O instanceof BooleanSetting) {
         return Boolean.FALSE;
      } else if (o0000000OOO00O instanceof ModeSetting) {
         return ((ModeSetting)o0000000OOO00O).O000000000000 != null ? ((ModeSetting)o0000000OOO00O).O000000000000 : "";
      } else if (o0000000OOO00O instanceof NumberSetting) {
         return (double)((NumberSetting)o0000000OOO00O).O00000000000;
      } else if (o0000000OOO00O instanceof MultiSelectSetting) {
         return new LinkedHashSet<>(((MultiSelectSetting)o0000000OOO00O).O000000000000O);
      } else {
         return o0000000OOO00O instanceof ColorSetting var1
            ? O00000OO0O0OO0.O00000000(var1.O000000000000(), var1.O0000000000O00, var1.O0000000000O0O, var1.O0000000000OO)
            : null;
      }
   }

   private static JsonElement O00000000(Setting o0000000OOO00O, Object object) {
      if (o0000000OOO00O instanceof BooleanSetting) {
         return new JsonPrimitive(O000000000(o0000000OOO00O, object));
      } else if (o0000000OOO00O instanceof NumberSetting) {
         return new JsonPrimitive(O00000000((NumberSetting)o0000000OOO00O, object));
      } else if (o0000000OOO00O instanceof ModeSetting) {
         return new JsonPrimitive(O00000000((ModeSetting)o0000000OOO00O, object));
      } else if (o0000000OOO00O instanceof MultiSelectSetting) {
         return O00000000((MultiSelectSetting)o0000000OOO00O, object);
      } else {
         return (JsonElement)(o0000000OOO00O instanceof ColorSetting
            ? O0000000000(o0000000OOO00O, object)
            : new JsonPrimitive(object != null ? object.toString() : ""));
      }
   }

   private static boolean O000000000(Setting o0000000OOO00O, Object object) {
      if (object instanceof Boolean var3) {
         return var3;
      } else if (object instanceof Number var2) {
         return var2.doubleValue() != 0.0;
      } else {
         return o0000000OOO00O instanceof BooleanSetting ? ((BooleanSetting)o0000000OOO00O).O0000000000() : false;
      }
   }

   private static JsonElement O0000000000(Setting o0000000OOO00O, Object object) {
      if (o0000000OOO00O instanceof ColorSetting var2) {
         O00000OO0O0OO0 var3;
         if (object instanceof O00000OO0O0OO0 var4) {
            var3 = var4;
         } else if (object instanceof Number var5) {
            var3 = O00000OO0O0OO0.O00000000(var5.intValue());
         } else if (object instanceof String var6) {
            try {
               String var7 = var6.startsWith("#") ? var6.substring(1) : var6;
               int var8 = (int)Long.parseUnsignedLong(var7, 16);
               int var9 = var7.length() > 6 ? var8 : 0xFF000000 | var8;
               var3 = O00000OO0O0OO0.O00000000(var9);
            } catch (NumberFormatException var10) {
               var3 = O00000OO0O0OO0.O00000000(var2.O000000000000(), var2.O0000000000O00, var2.O0000000000O0O, var2.O0000000000OO);
            }
         } else {
            var3 = O00000OO0O0OO0.O00000000(var2.O000000000000(), var2.O0000000000O00, var2.O0000000000O0O, var2.O0000000000OO);
         }

         return new JsonPrimitive(var3.O0000000000000());
      } else {
         throw new IllegalStateException("Expected HueSetting for colour type");
      }
   }

   private static double O00000000(NumberSetting o000000O000, Object object) {
      double var2;
      if (object instanceof Number var4) {
         var2 = var4.doubleValue();
      } else {
         var2 = o000000O000.O00000000000;
      }

      if (!Double.isFinite(var2)) {
         var2 = o000000O000.O00000000000;
      }

      double var16 = o000000O000.O000000000000;
      double var6 = o000000O000.O0000000000000;
      double var8 = o000000O000.O000000000000O;
      if (!Double.isFinite(var8) || var8 <= 0.0) {
         var8 = 1.0;
      }

      double var10 = Math.min(Math.max(var2, var16), var6);
      double var12 = Math.round((var10 - var16) / var8);
      double var14 = var16 + var12 * var8;
      if (var14 < var16) {
         var14 = var16;
      } else if (var14 > var6) {
         var14 = var6;
      }

      return var14;
   }

   private static String O00000000(ModeSetting o0000000OOOOO0, Object object) {
      String var2 = object != null ? object.toString() : null;
      if (var2 == null || var2.isBlank() || o0000000OOOOO0.O00000000000 != null && !o0000000OOOOO0.O00000000000.contains(var2)) {
         var2 = o0000000OOOOO0.O000000000000 != null ? o0000000OOOOO0.O000000000000 : "";
      }

      return var2;
   }

   private static String O00000000000(Setting o0000000OOO00O, Object object) {
      Object var2 = object != null ? object : "";
      return var2 == null ? "" : var2.toString();
   }

   private static JsonElement O00000000(MultiSelectSetting o0000000OOOOO, Object object) {
      o0000000OOOOO.O0000000000();
      Object var2;
      if (object instanceof Collection var3) {
         var2 = var3;
      } else {
         var2 = o0000000OOOOO.O000000000000O != null ? o0000000OOOOO.O000000000000O : List.of();
      }

      LinkedHashSet var7 = new LinkedHashSet();
      if (var2 != null) {
         for (Object var5 : (Iterable<Object>)var2) {
            if (var5 != null) {
               String var6 = var5.toString();
               if (o0000000OOOOO.O00000000000 != null && o0000000OOOOO.O00000000000.contains(var6)) {
                  var7.add(var6);
               }
            }
         }
      }

      if (var7.isEmpty() && o0000000OOOOO.O000000000000O != null) {
         var7.addAll(o0000000OOOOO.O000000000000O);
      }

      JsonArray var8 = new JsonArray();

      for (String var10 : (Iterable<String>)var7) {
         var8.add(var10);
      }

      return var8;
   }

   private void O00000000(float f, float g, int i, int j) {
      O00000OO0O0O0.W234 var5 = this.O0000000000OO.O00000000(this.O000000000O00O, this.O000000000O0O, f, g, i, j, this.O000000000O0O0);
      this.O000000000O00 = var5.x();
      this.O000000000O000 = var5.y();
   }

   public synchronized boolean O00000000(double d, double e, int i) {
      if (!this.O0000000000O00()) {
         return false;
      } else if (this.O0000000000OOO == null) {
         return false;
      } else if (this.O000000000(d, e, i)) {
         return true;
      } else {
         boolean var6 = this.O0000000000OOO.bounds().O00000000(d, e);
         if (!var6) {
            this.O000000000();
            return true;
         } else if (i == 0) {
            if (this.O000000000O.O00000000(d, e)) {
               if (this.O000000000O0OO) {
                  this.O0000000000OO0();
               } else {
                  this.O0000000000OO();
               }

               return true;
            } else if (this.O0000000000OOO.toggleButton().O00000000(d, e)) {
               this.O00000000(O000000O0000O.TOGGLE);
               return true;
            } else if (this.O0000000000OOO.holdButton().O00000000(d, e)) {
               this.O00000000(O000000O0000O.HOLD);
               return true;
            } else {
               this.O000000000();
               return true;
            }
         } else if (i == 1) {
            this.O000000000();
            return true;
         } else {
            return var6;
         }
      }
   }

   public synchronized boolean O00000000(double d, double e, double f, double g) {
      if (!this.O0000000000O00()) {
         return false;
      } else {
         return this.O000000000(d, e, f, g) ? true : true;
      }
   }

   public synchronized boolean O00000000(O0000000O0O00O o0000000O0O00O) {
      Objects.requireNonNull(o0000000O0O00O, "event");
      return this.O00000000000();
   }

   public synchronized boolean O00000000(int i, int j, int k, int l) {
      if (!this.O0000000000O00()) {
         return false;
      } else if (!this.O000000000O0OO) {
         int var5 = O0000000000O0();
         return var5 != -1 && i == var5 ? false : this.O0000000000OO0 != null;
      } else if (k != 1) {
         return true;
      } else if (i == 261 || i == 259 || i == 256) {
         this.O0000000000OO0.O000000000O000();
         this.O000000000OO0 = false;
         this.O000000000OO00 = 0L;
         this.O0000000000OO0();
         this.O000000000000O();
         return true;
      } else if (i == -1) {
         return true;
      } else if (this.O00000000(i)) {
         this.O000000000OO0 = true;
         this.O000000000OO00 = System.nanoTime();
         return true;
      } else {
         this.O0000000000OO0.O00000000(i);
         this.O000000000OO0 = false;
         this.O000000000OO00 = 0L;
         this.O0000000000OO0();
         this.O000000000000O();
         return true;
      }
   }

   private static int O0000000000O0() {
      MenuModule var0 = MenuModule.O0000000000OO();
      if (var0 == null) {
         return 344;
      } else {
         return var0.O000000000000 > 0 ? var0.O000000000000 : 344;
      }
   }

   public synchronized void O00000000(RenderManager o0000O00OO0O0, FontObject o0000O0O00O00O, int i, int j, float f) {
      Objects.requireNonNull(o0000O00OO0O0, "renderer");
      Objects.requireNonNull(o0000O0O00O00O, "defaultFont");
      if (this.O0000000000OO0 == null) {
         if (this.O000000000OO && this.O00000000000O.O00000000() <= 0.001F) {
            this.O000000000O();
         }
      } else {
         this.O00000000(i, j);
         float var6 = O000000000(this.O00000000000O.O00000000());
         if (var6 <= 0.001F && this.O00000000000O.O0000000000() <= 0.0F) {
            if (this.O000000000OO) {
               this.O000000000O();
            }
         } else {
            float var7 = this.O00000000000OO();
            if (this.O0000000000OOO == null || Math.abs(this.O0000000000OOO.valueBlock().O00000000000() - var7) > 0.001F) {
               this.O0000000000OOO = O00000OO0O000.O00000000(this.O0000000000OO0, this.O000000000O00, this.O000000000O000, var7);
               this.O0000000000O();
            }

            if (this.O000000000O0 != null) {
               this.O000000000O0.O0000000000000();
            }

            String var8;
            if (this.O000000000O0OO) {
               var8 = "Press a key";
            } else {
               int var9 = this.O0000000000OO0.O00000000000O0();
               if (var9 == -1) {
                  var8 = "None";
               } else {
                  var8 = O000000000(var9);
               }
            }

            this.O000000000O = O00000OO0O000.O00000000(this.O0000000000OOO, o0000O00OO0O0, var8);
            boolean var21 = this.O000000000O.O00000000(this.O000000000OO0O, this.O000000000OOO);
            boolean var10 = this.O0000000000OOO.toggleButton().O00000000(this.O000000000OO0O, this.O000000000OOO);
            boolean var11 = this.O0000000000OOO.holdButton().O00000000(this.O000000000OO0O, this.O000000000OOO);
            this.O00000000(var21, var10, var11);
            float var12 = this.O00000000000O0.O00000000();
            float var13 = this.O00000000000OO.O00000000();
            float var14 = this.O0000000000O.O00000000();
            boolean var15 = this.O000000000OO0 && System.nanoTime() - this.O000000000OO00 <= 1200000000L;
            String var16 = "";
            if (var15) {
               var16 = "";
            }

            float var17 = this.O0000000000O0.O00000000();
            float var18 = this.O0000000000O00.O00000000();
            float var19 = this.O0000000000O0O.O00000000() * f;
            O00000OO0O000.W232 var20 = new O00000OO0O000.W232(
               var6,
               var19,
               this.O000000000O0OO,
               var21,
               var10,
               var11,
               var12,
               var13,
               var14,
               var17,
               var18,
               this.O0000000000OO0.O00000000000OO(),
               var8,
               var16,
               this.O0000000000OOO.valueBlock().O00000000000(),
               this.O0000000000OOO.valueLabelBaseline(),
               this.O000000000O
            );
            O00000OO0O000.O00000000(o0000O00OO0O0, o0000O0O00O00O, this.O0000000000OO0, this.O0000000000OOO, var20);
            if (this.O000000000O0 != null) {
               this.O000000000O0.O00000000(o0000O00OO0O0, var6, 1.0F);
               this.O000000000O0.O000000000(o0000O00OO0O0, var6, 1.0F);
            }

            if (!var15) {
               this.O000000000OO0 = false;
            }
         }
      }
   }

   public synchronized void O00000000(double d, double e) {
      this.O000000000OO0O = d;
      this.O000000000OOO = e;
      if (this.O000000000O0 != null) {
         this.O000000000O0.O00000000(d, e);
      }
   }

   public synchronized void O000000000() {
      if (this.O0000000000OO0 != null || !(this.O00000000000O.O00000000() <= 0.001F)) {
         if (this.O0000000000OO0 != null) {
            this.O000000000000O();
         }

         this.O0000000000OO0();
         this.O00000000(false, false, false);
         this.O0000000000O0O.O0000000000(0.0F);
         this.O00000000000O.O0000000000(0.0F);
         this.O000000000OO = true;
      }
   }

   public synchronized void O0000000000() {
      if (this.O0000000000OO0 != null || !(this.O00000000000O.O00000000() <= 0.001F)) {
         if (this.O0000000000OO0 != null) {
            this.O000000000000O();
         }

         this.O0000000000OO0();
         this.O00000000(false, false, false);
         this.O0000000000O0O.O000000000(0.0F);
         this.O00000000000O.O000000000(0.0F);
         this.O000000000O();
      }
   }

   public synchronized boolean O00000000000() {
      return this.O0000000000OO0 != null ? true : this.O00000000000O.O00000000() > 0.001F;
   }

   public synchronized boolean O000000000000() {
      return this.O0000000000OO0 != null;
   }

   public synchronized O00000OO0O000.W230 O0000000000000() {
      return this.O0000000000OOO;
   }

   public synchronized O00000OO0O000.W232 O00000000(float f) {
      if (this.O0000000000OO0 != null && this.O0000000000OOO != null) {
         float var2 = O000000000(this.O00000000000O.O00000000());
         boolean var3 = this.O000000000O.O00000000(this.O000000000OO0O, this.O000000000OOO);
         boolean var4 = this.O0000000000OOO.toggleButton().O00000000(this.O000000000OO0O, this.O000000000OOO);
         boolean var5 = this.O0000000000OOO.holdButton().O00000000(this.O000000000OO0O, this.O000000000OOO);
         float var6 = this.O00000000000O0.O00000000();
         float var7 = this.O00000000000OO.O00000000();
         float var8 = this.O0000000000O.O00000000();
         String var9;
         if (this.O000000000O0OO) {
            var9 = "Press a key";
         } else {
            int var10 = this.O0000000000OO0.O00000000000O0();
            if (var10 == -1) {
               var9 = "None";
            } else {
               var9 = O000000000(var10);
            }
         }

         boolean var15 = this.O000000000OO0 && System.nanoTime() - this.O000000000OO00 <= 1200000000L;
         String var11 = "";
         if (var15) {
            var11 = "";
         }

         float var12 = this.O0000000000O0.O00000000();
         float var13 = this.O0000000000O00.O00000000();
         float var14 = this.O0000000000O0O.O00000000() * f;
         return new O00000OO0O000.W232(
            var2,
            var14,
            this.O000000000O0OO,
            var3,
            var4,
            var5,
            var6,
            var7,
            var8,
            var12,
            var13,
            this.O0000000000OO0.O00000000000OO(),
            var9,
            var11,
            this.O0000000000OOO.valueBlock().O00000000000(),
            this.O0000000000OOO.valueLabelBaseline(),
            this.O000000000O
         );
      } else {
         return null;
      }
   }

   public synchronized void O000000000000O() {
      if (this.O0000000000OO0 != null) {
         if (this.O0000000000OO0.O0000000000OO()) {
            O000000O00000O var1 = O000000O00000O.O00000000();
            if (this.O0000000000OO0.O0000000000O()) {
               Module var2 = this.O0000000000OO0.O000000000();
               if (var2 != null) {
                  var1.O00000000(var2, this.O0000000000OO0.O00000000000O0(), this.O0000000000OO0.O00000000000OO());
               }
            } else if (this.O0000000000OO0.O0000000000O0()) {
               Module var5 = this.O0000000000OO0.O000000000();
               Setting var3 = this.O0000000000OO0.O0000000000();
               if (var5 != null && var3 != null) {
                  if (this.O0000000000OO0.O000000000O00O()) {
                     var1.O00000000(var5.O00000000000, var3.O00000000);
                  } else {
                     Object var4 = this.O0000000000OO0.O00000000000O();
                     if (var4 != null) {
                        O000000000000(var3, var4);
                        var1.O00000000(var5, var3, this.O0000000000OO0.O00000000000OO(), this.O0000000000OO0.O00000000000O0(), var4);
                     }
                  }
               }
            }

            this.O0000000000OO0.O000000000O0();
         }
      }
   }

   private boolean O0000000000O00() {
      return this.O0000000000OO0 != null ? true : this.O00000000000O.O00000000() > 0.001F && this.O0000000000OOO != null;
   }

   private void O00000000(int i, int j) {
      if (this.O0000000000OO0 != null && this.O0000000000OOO != null) {
         float var3 = this.O000000000O00;
         float var4 = this.O000000000O000;
         this.O000000000O0O0 = this.O000000000O0();
         this.O00000000(this.O0000000000OOO.bounds().O0000000000(), this.O0000000000OOO.bounds().O00000000000(), i, j);
         if (this.O000000000O00 != var3 || this.O000000000O000 != var4) {
            this.O0000000000OOO = O00000OO0O000.O00000000(this.O0000000000OO0, this.O000000000O00, this.O000000000O000, this.O00000000000OO());
            this.O000000000O = this.O0000000000OOO.field();
            this.O0000000000O();
         }
      }
   }

   private void O0000000000O0O() {
      this.O00000000000O0.O0000000000(0.0F);
      this.O00000000000OO.O0000000000(0.0F);
      this.O0000000000O.O0000000000(0.0F);
      this.O0000000000O0O.O0000000000(0.0F);
      this.O00000000000O0.O000000000(0.0F);
      this.O00000000000OO.O000000000(0.0F);
      this.O0000000000O.O000000000(0.0F);
      this.O0000000000O0O.O000000000(0.0F);
   }

   private void O00000000(boolean bl, boolean bl2, boolean bl3) {
      this.O00000000000O0.O0000000000(bl ? 1.0F : 0.0F);
      this.O00000000000OO.O0000000000(bl2 ? 1.0F : 0.0F);
      this.O0000000000O.O0000000000(bl3 ? 1.0F : 0.0F);
   }

   private void O0000000000OO() {
      this.O000000000O0OO = true;
      this.O000000000OO0 = false;
      this.O000000000OO00 = 0L;
      O000000O00000O.O00000000().O00000000(true);
   }

   private void O0000000000OO0() {
      if (this.O000000000O0OO) {
         this.O000000000O0OO = false;
         O000000O00000O.O00000000().O00000000(false);
      }
   }

   private void O00000000(O000000O0000O o000000O0000O) {
      if (this.O0000000000OO0 != null && o000000O0000O != null) {
         this.O0000000000OO0.O00000000(o000000O0000O);
         this.O0000000000OOO();
         this.O000000000000O();
      }
   }

   private void O0000000000OOO() {
      if (this.O0000000000OO0 != null) {
         this.O0000000000O0.O0000000000(this.O0000000000OO0.O00000000000OO() == O000000O0000O.TOGGLE ? 1.0F : 0.0F);
         this.O0000000000O00.O0000000000(this.O0000000000OO0.O00000000000OO() == O000000O0000O.HOLD ? 1.0F : 0.0F);
      }
   }

   private boolean O00000000(int i) {
      return false;
   }

   private void O000000000O() {
      this.O0000000000OO0 = null;
      this.O0000000000OOO = null;
      this.O000000000O = new O00000OO0O000.W231(0.0F, 0.0F, 0.0F, 0.0F);
      this.O000000000O0 = null;
      this.O000000000OO = false;
      this.O000000000OO0 = false;
      this.O000000000OO00 = 0L;
      this.O000000000O00O = Float.NaN;
      this.O000000000O0O = Float.NaN;
      this.O000000000O0O0 = 1.0F;
      this.O0000000000O0O();
   }

   private float O000000000O0() {
      float var1 = 1.0F;
      if (!Float.isFinite(var1)) {
         return 1.0F;
      } else {
         return var1 <= 0.001F ? 1.0F : var1;
      }
   }

   private static float O00000000(double d) {
      if (!Double.isFinite(d)) {
         return Float.NaN;
      } else if (d > Float.MAX_VALUE) {
         return Float.MAX_VALUE;
      } else {
         return d < -Float.MAX_VALUE ? -Float.MAX_VALUE : (float)d;
      }
   }

   private static float O00000000(float f, float g, float h) {
      if (f < g) {
         return g;
      } else {
         return f > h ? h : f;
      }
   }

   private static float O000000000(float f) {
      if (f <= 0.0F) {
         return 0.0F;
      } else {
         return f >= 1.0F ? 1.0F : f;
      }
   }

   private static String O000000000(int i) {
      if (i == -1) {
         return "None";
      } else if (i >= 65 && i <= 90) {
         return String.valueOf((char)(65 + (i - 65)));
      } else {
         return i >= 48 && i <= 57 ? String.valueOf((char)(48 + (i - 48))) : "Key " + i;
      }
   }

   private static void O000000000000(Setting o0000000OOO00O, Object object) {
      if (o0000000OOO00O instanceof BooleanSetting && object instanceof Boolean) {
         ((BooleanSetting)o0000000OOO00O).O000000000((Boolean)object);
      } else if (o0000000OOO00O instanceof ModeSetting && object instanceof String) {
         ((ModeSetting)o0000000OOO00O).O000000000000 = (String)object;
         if (((ModeSetting)o0000000OOO00O).O00000000000 != null && ((ModeSetting)o0000000OOO00O).O00000000000.contains((String)object)) {
            ((ModeSetting)o0000000OOO00O).O00000000000O = ((ModeSetting)o0000000OOO00O).O00000000000.indexOf((String)object);
         }
      } else if (o0000000OOO00O instanceof NumberSetting && object instanceof Number) {
         double var4 = ((Number)object).doubleValue();
         ((NumberSetting)o0000000OOO00O).O00000000000 = (float)Math.max(
            (double)((NumberSetting)o0000000OOO00O).O000000000000, Math.min((double)((NumberSetting)o0000000OOO00O).O0000000000000, var4)
         );
      } else if (o0000000OOO00O instanceof MultiSelectSetting && object instanceof Collection) {
         ((MultiSelectSetting)o0000000OOO00O).O000000000000O = new ArrayList<>((Collection<? extends String>)object);
      } else if (o0000000OOO00O instanceof ColorSetting && object instanceof O00000OO0O0OO0 var2) {
         ColorSetting var3 = (ColorSetting)o0000000OOO00O;
         var3.O00000000(var2.O00000000());
         var3.O0000000000O00 = var2.O000000000();
         var3.O0000000000O0O = var2.O0000000000();
         var3.O0000000000OO = var2.O00000000000();
      }
   }

   static final class W228 {
      static final O00000OO0O0 O00000000 = new O00000OO0O0(O00000000());

      private W228() {
      }

      private static O0000O00O0O0OO O00000000() {
         O0000O00O0O0OO var0 = new O0000O00O0O0OO(O0000O00O0O000.O00000000(), O00000OO0O0.O00000000, 0.0F, 0.0F, 1.0F, 5.0E-4F, 5.0E-4F);
         var0.O00000000(O0000O00O0O0O.O0000000000);
         return var0;
      }
   }
}
