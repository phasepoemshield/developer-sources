package ru.metaculture.protection;

import com.google.gson.JsonElement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import org.wild.module.api.Module;

public final class O00000OO0O00 {
   private static final double O00000000 = 1.0E-6;
   private final O00000OO0O00.W229 O000000000;
   private final Module O0000000000;
   private final Setting O00000000000;
   private final String O000000000000;
   private final String O0000000000000;
   private final Object O000000000000O;
   private final String O00000000000O;
   private Object O00000000000O0;
   private Object O00000000000OO;
   private int O0000000000O;
   private O000000O0000O O0000000000O0;
   private int O0000000000O00;
   private O000000O0000O O0000000000O0O;
   private boolean O0000000000OO;
   private boolean O0000000000OO0;

   private O00000OO0O00(
      O00000OO0O00.W229 o00000000,
      Module module,
      Setting o0000000OOO00O,
      String string,
      String string2,
      Object object,
      String string3,
      Object object2,
      Object object3,
      int i,
      O000000O0000O o000000O0000O
   ) {
      this.O000000000 = Objects.requireNonNull(o00000000, "targetType");
      this.O0000000000 = module;
      this.O00000000000 = o0000000OOO00O;
      this.O000000000000 = string == null ? "" : string;
      this.O0000000000000 = string2 == null ? "" : string2;
      this.O000000000000O = object;
      this.O00000000000O = string3 == null ? "" : string3;
      this.O00000000000O0 = object2;
      this.O00000000000OO = object3;
      this.O0000000000O = i;
      this.O0000000000O0 = Objects.requireNonNull(o000000O0000O, "mode");
      this.O0000000000O00 = i;
      this.O0000000000O0O = o000000O0000O;
      this.O0000000000OO = i == -1;
      this.O0000000000OO0 = this.O0000000000OO;
   }

   public static O00000OO0O00 O00000000(Module module) {
      Objects.requireNonNull(module, "module");
      int var1 = module.O000000000000 > 0 ? module.O000000000000 : -1;
      return new O00000OO0O00(
         O00000OO0O00.W229.MODULE,
         module,
         null,
         module.O00000000000,
         module.O00000000000OO,
         module.O0000000000000,
         "Modules toggle state is controlled by the mode.",
         null,
         null,
         var1,
         O000000O0000O.TOGGLE
      );
   }

   public static O00000OO0O00 O00000000(Module module, Setting o0000000OOO00O, Object object, Object object2, int i, O000000O0000O o000000O0000O) {
      Objects.requireNonNull(module, "module");
      Objects.requireNonNull(o0000000OOO00O, "setting");
      return new O00000OO0O00(
         O00000OO0O00.W229.SETTING, module, o0000000OOO00O, o0000000OOO00O.O00000000, module.O00000000000, object, "", object2, object2, i, o000000O0000O
      );
   }

   public O00000OO0O00.W229 O00000000() {
      return this.O000000000;
   }

   public Module O000000000() {
      return this.O0000000000;
   }

   public Setting O0000000000() {
      return this.O00000000000;
   }

   public String O00000000000() {
      return this.O000000000000;
   }

   public String O000000000000() {
      return this.O0000000000000;
   }

   public Object O0000000000000() {
      return this.O000000000000O;
   }

   public String O000000000000O() {
      return this.O00000000000O;
   }

   public Object O00000000000O() {
      return !this.O0000000000O0() ? null : this.O00000000000O0;
   }

   public void O00000000(Object object) {
      this.O000000000OO();
      this.O00000000000O0 = this.O0000000000(object);
      this.O0000000000OO = false;
   }

   public int O00000000000O0() {
      return this.O0000000000O;
   }

   public void O00000000(int i) {
      if (i == -1 || i >= 32 && i <= 348) {
         this.O0000000000O = i;
         if (i != -1) {
            this.O0000000000OO = false;
         }
      } else {
         throw new IllegalArgumentException("keyCode must be GLFW.GLFW_KEY_UNKNOWN or a valid GLFW key constant");
      }
   }

   public O000000O0000O O00000000000OO() {
      return this.O0000000000O0;
   }

   public void O00000000(O000000O0000O o000000O0000O) {
      this.O0000000000O0 = Objects.requireNonNull(o000000O0000O, "mode");
   }

   public boolean O0000000000O() {
      return this.O000000000 == O00000OO0O00.W229.MODULE;
   }

   public boolean O0000000000O0() {
      return this.O000000000 == O00000OO0O00.W229.SETTING;
   }

   public boolean O0000000000O00() {
      return this.O000000000 == O00000OO0O00.W229.SETTING && this.O00000000000 != null
         ? this.O00000000000 instanceof NumberSetting || this.O00000000000 instanceof ModeSetting || this.O00000000000 instanceof MultiSelectSetting
         : false;
   }

   public boolean O0000000000O0O() {
      return !this.O00000000000O.isBlank();
   }

   public boolean O0000000000OO() {
      return this.O0000000000O != this.O0000000000O00
         || this.O0000000000O0 != this.O0000000000O0O
         || this.O0000000000OO != this.O0000000000OO0
         || this.O0000000000OO0();
   }

   public boolean O0000000000OO0() {
      return this.O0000000000O0() && this.O00000000000 != null ? !O00000000(this.O00000000000, this.O00000000000O0, this.O00000000000OO) : false;
   }

   public void O0000000000OOO() {
      this.O000000000OO();
      this.O0000000000OO = this.O0000000000OO0;
   }

   public void O000000000O() {
      this.O000000000O0();
   }

   public void O000000000O0() {
      this.O0000000000O00 = this.O0000000000O;
      this.O0000000000O0O = this.O0000000000O0;
      this.O0000000000OO0 = this.O0000000000OO;
      if (this.O0000000000O0() && this.O00000000000 != null) {
         this.O00000000000OO = O000000000(this.O00000000000, this.O00000000000O0);
      }
   }

   public void O000000000O00() {
      this.O0000000000O = this.O0000000000O00;
      this.O0000000000O0 = this.O0000000000O0O;
      this.O0000000000OO = this.O0000000000OO0;
      if (this.O0000000000O0()) {
      }
   }

   public void O000000000O000() {
      this.O0000000000O = -1;
      this.O0000000000OO = true;
      if (this.O0000000000O0()) {
      }
   }

   public boolean O000000000O00O() {
      return this.O0000000000OO;
   }

   public Object O000000000O0O() {
      this.O000000000OO();
      return O000000000(this.O00000000000, this.O00000000000O0);
   }

   public void O000000000(Object object) {
      this.O000000000OO();
      this.O00000000000O0 = this.O0000000000(Objects.requireNonNull(object, "value"));
      this.O0000000000OO = false;
   }

   public String O000000000O0O0() {
      return this.O0000000000 != null ? this.O0000000000.O00000000000 : "";
   }

   public String O000000000O0OO() {
      return this.O00000000000 != null ? this.O00000000000.O00000000 : "";
   }

   private void O000000000OO() {
      if (!this.O0000000000O0()) {
         throw new IllegalStateException("Operation only supported for setting targets");
      } else if (this.O00000000000 == null) {
         throw new IllegalStateException("Setting context is not available");
      }
   }

   private Object O0000000000(Object object) {
      Objects.requireNonNull(object, "value");
      if (this.O00000000000 instanceof BooleanSetting) {
         if (object instanceof Boolean var3) {
            return var3;
         } else if (object instanceof Number var2) {
            return var2.doubleValue() != 0.0;
         } else {
            throw new IllegalArgumentException("Target value must be boolean-compatible");
         }
      } else if (this.O00000000000 instanceof NumberSetting) {
         return this.O00000000000(object);
      } else if (this.O00000000000 instanceof ModeSetting) {
         return this.O000000000000(object);
      } else if (this.O00000000000 instanceof MultiSelectSetting) {
         return this.O0000000000000(object);
      } else if (this.O00000000000 instanceof ColorSetting) {
         return this.O000000000000O(object);
      } else {
         return object instanceof String ? object : object.toString();
      }
   }

   private Object O00000000000(Object object) {
      if (this.O00000000000 instanceof NumberSetting var2) {
         if (object instanceof Number var12) {
            double var4 = var12.doubleValue();
            if (!Double.isNaN(var4) && !Double.isInfinite(var4)) {
               double var6 = Math.min(Math.max(var4, (double)var2.O000000000000), (double)var2.O0000000000000);
               double var8 = Math.round((var6 - var2.O000000000000) / var2.O000000000000O);
               double var10 = var2.O000000000000 + var8 * var2.O000000000000O;
               if (var10 < var2.O000000000000) {
                  var10 = var2.O000000000000;
               } else if (var10 > var2.O0000000000000) {
                  var10 = var2.O0000000000000;
               }

               return var10;
            } else {
               throw new IllegalArgumentException("Target value must be a finite number");
            }
         } else {
            throw new IllegalArgumentException("Target value must be numeric");
         }
      } else {
         throw new IllegalStateException("Setting is not a SliderSetting");
      }
   }

   private Object O000000000000(Object object) {
      if (this.O00000000000 instanceof ModeSetting var2) {
         String var4 = object.toString();
         if (var2.O00000000000 != null && var2.O00000000000.contains(var4)) {
            return var4;
         } else {
            throw new IllegalArgumentException("Unsupported option '" + var4 + "'");
         }
      } else {
         throw new IllegalStateException("Setting is not a ModeSetting");
      }
   }

   private Object O0000000000000(Object object) {
      if (!(this.O00000000000 instanceof MultiSelectSetting var2)) {
         throw new IllegalStateException("Setting is not a ListSetting");
      } else {
         var2.O0000000000();
         if (!(object instanceof Collection var8)) {
            throw new IllegalArgumentException("Target value must be a collection");
         } else {
            LinkedHashSet var4 = new LinkedHashSet();

            for (Object var6 : var8) {
               if (var6 != null) {
                  String var7 = var6.toString();
                  if (var2.O00000000000 == null || !var2.O00000000000.contains(var7)) {
                     throw new IllegalArgumentException("Unsupported option '" + var7 + "'");
                  }

                  var4.add(var7);
               }
            }

            return var4;
         }
      }
   }

   private Object O000000000000O(Object object) {
      if (this.O00000000000 instanceof ColorSetting var2) {
         if (object instanceof O00000OO0O0OO0 var10) {
            return var10;
         } else if (object instanceof Number var9) {
            return O00000OO0O0OO0.O00000000(var9.intValue());
         } else if (object instanceof String var8) {
            try {
               String var4 = var8.startsWith("#") ? var8.substring(1) : var8;
               int var5 = (int)Long.parseUnsignedLong(var4, 16);
               int var6 = var4.length() > 6 ? var5 : 0xFF000000 | var5;
               return O00000OO0O0OO0.O00000000(var6);
            } catch (NumberFormatException var7) {
               throw new IllegalArgumentException("Invalid colour string: " + var8, var7);
            }
         } else {
            return O00000OO0O0OO0.O00000000(var2.O000000000000(), var2.O0000000000O00, var2.O0000000000O0O, var2.O0000000000OO);
         }
      } else {
         throw new IllegalStateException("Setting is not a HueSetting");
      }
   }

   private static Object O00000000(Setting o0000000OOO00O, Object object) {
      if (o0000000OOO00O instanceof BooleanSetting) {
         return O00000000((JsonElement)null, object, o0000000OOO00O);
      } else if (o0000000OOO00O instanceof NumberSetting) {
         return O00000000((JsonElement)null, o0000000OOO00O, object);
      } else if (o0000000OOO00O instanceof ModeSetting) {
         return O000000000(null, o0000000OOO00O, object);
      } else if (o0000000OOO00O instanceof MultiSelectSetting) {
         return O00000000000(null, o0000000OOO00O, object);
      } else {
         return o0000000OOO00O instanceof ColorSetting ? O000000000000(null, o0000000OOO00O, object) : object;
      }
   }

   private static Object O00000000(JsonElement jsonElement, Object object, Setting o0000000OOO00O) {
      boolean var3 = object instanceof Boolean var4 ? var4 : Boolean.FALSE;
      if (jsonElement != null && jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isBoolean()) {
         var3 = jsonElement.getAsBoolean();
      }

      return var3;
   }

   private static Object O00000000(JsonElement jsonElement, Setting o0000000OOO00O, Object object) {
      if (o0000000OOO00O instanceof NumberSetting var3) {
         double var4 = object instanceof Number var6 ? var6.doubleValue() : var3.O00000000000;
         if (jsonElement != null && jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            var4 = jsonElement.getAsDouble();
         }

         double var12 = Math.min(Math.max(var4, (double)var3.O000000000000), (double)var3.O0000000000000);
         double var8 = Math.round((var12 - var3.O000000000000) / var3.O000000000000O);
         double var10 = var3.O000000000000 + var8 * var3.O000000000000O;
         if (var10 < var3.O000000000000) {
            var10 = var3.O000000000000;
         } else if (var10 > var3.O0000000000000) {
            var10 = var3.O0000000000000;
         }

         return var10;
      } else {
         throw new IllegalStateException("Setting is not a SliderSetting");
      }
   }

   private static Object O000000000(JsonElement jsonElement, Setting o0000000OOO00O, Object object) {
      if (o0000000OOO00O instanceof ModeSetting var3) {
         String var4 = object instanceof String var5 ? var5 : (var3.O000000000000 != null ? var3.O000000000000 : "");
         if (jsonElement != null && jsonElement.isJsonPrimitive()) {
            var4 = jsonElement.getAsString();
         }

         if (var3.O00000000000 == null || !var3.O00000000000.contains(var4)) {
            var4 = var3.O000000000000 != null ? var3.O000000000000 : "";
         }

         return var4;
      } else {
         throw new IllegalStateException("Setting is not a ModeSetting");
      }
   }

   private static Object O0000000000(JsonElement jsonElement, Setting o0000000OOO00O, Object object) {
      String var3 = object instanceof String var4 ? var4 : "";
      if (jsonElement != null && jsonElement.isJsonPrimitive()) {
         var3 = jsonElement.getAsString();
      }

      return var3;
   }

   private static Object O00000000000(JsonElement jsonElement, Setting o0000000OOO00O, Object object) {
      if (!(o0000000OOO00O instanceof MultiSelectSetting var3)) {
         throw new IllegalStateException("Setting is not a ListSetting");
      } else {
         var3.O0000000000();
         LinkedHashSet var4 = new LinkedHashSet();
         if (jsonElement != null && jsonElement.isJsonArray()) {
            for (JsonElement var7 : jsonElement.getAsJsonArray()) {
               if (var7.isJsonPrimitive()) {
                  String var8 = var7.getAsString();
                  if (var3.O00000000000 != null && var3.O00000000000.contains(var8)) {
                     var4.add(var8);
                  }
               }
            }
         }

         return var4;
      }
   }

   private static Object O000000000000(JsonElement jsonElement, Setting o0000000OOO00O, Object object) {
      if (o0000000OOO00O instanceof ColorSetting var3) {
         O00000OO0O0OO0 var4;
         if (object instanceof O00000OO0O0OO0 var5) {
            var4 = var5;
         } else if (object instanceof Number var6) {
            var4 = O00000OO0O0OO0.O00000000(var6.intValue());
         } else if (object instanceof String var7) {
            try {
               String var8 = var7.startsWith("#") ? var7.substring(1) : var7;
               int var9 = (int)Long.parseUnsignedLong(var8, 16);
               int var10 = var8.length() > 6 ? var9 : 0xFF000000 | var9;
               var4 = O00000OO0O0OO0.O00000000(var10);
            } catch (NumberFormatException var11) {
               var4 = O00000OO0O0OO0.O00000000(var3.O000000000000(), var3.O0000000000O00, var3.O0000000000O0O, var3.O0000000000OO);
            }
         } else {
            var4 = O00000OO0O0OO0.O00000000(var3.O000000000000(), var3.O0000000000O00, var3.O0000000000O0O, var3.O0000000000OO);
         }

         return var4;
      } else {
         throw new IllegalStateException("Setting is not a HueSetting");
      }
   }

   private static Collection<?> O00000000000O(Object object) {
      return (Collection<?>)(object instanceof Collection var1 ? var1 : List.of());
   }

   private static Object O000000000(Setting o0000000OOO00O, Object object) {
      if (o0000000OOO00O == null || object == null) {
         return object;
      } else if (o0000000OOO00O instanceof BooleanSetting) {
         return Boolean.TRUE.equals(object);
      } else if (o0000000OOO00O instanceof NumberSetting) {
         return ((Number)object).doubleValue();
      } else if (o0000000OOO00O instanceof ModeSetting || o0000000OOO00O instanceof TextSetting) {
         return object.toString();
      } else if (o0000000OOO00O instanceof MultiSelectSetting) {
         LinkedHashSet var2 = new LinkedHashSet();
         if (object instanceof Collection) {
            for (Object var5 : (Collection)object) {
               if (var5 != null) {
                  var2.add(var5.toString());
               }
            }
         }

         return var2;
      } else {
         return o0000000OOO00O instanceof ColorSetting ? O00000000000O0(object) : object;
      }
   }

   private static boolean O00000000(Setting o0000000OOO00O, Object object, Object object2) {
      if (object == object2) {
         return true;
      } else if (object == null || object2 == null) {
         return false;
      } else if (o0000000OOO00O instanceof BooleanSetting || o0000000OOO00O instanceof ModeSetting || o0000000OOO00O instanceof TextSetting) {
         return Objects.equals(object, object2);
      } else if (o0000000OOO00O instanceof NumberSetting) {
         return Math.abs(((Number)object).doubleValue() - ((Number)object2).doubleValue()) <= 1.0E-6;
      } else if (o0000000OOO00O instanceof MultiSelectSetting) {
         if (!(object instanceof Collection var7 && object2 instanceof Collection var10)) {
            return false;
         } else {
            return var7.size() != var10.size() ? false : new LinkedHashSet<>(O00000000(var7)).equals(new LinkedHashSet<>(O00000000(var10)));
         }
      } else if (o0000000OOO00O instanceof ColorSetting) {
         if (object instanceof O00000OO0O0OO0 var3 && object2 instanceof O00000OO0O0OO0 var9) {
            return var3.equals(var9);
         } else if (object instanceof Number var5 && object2 instanceof Number var8) {
            return var5.intValue() == var8.intValue();
         } else {
            return object instanceof String var6 && object2 instanceof String var4 ? var6.equalsIgnoreCase(var4) : false;
         }
      } else {
         return Objects.equals(object, object2);
      }
   }

   private static List<String> O00000000(Collection<?> collection) {
      ArrayList var1 = new ArrayList(collection.size());

      for (Object var3 : collection) {
         if (var3 != null) {
            var1.add(var3.toString());
         }
      }

      return var1;
   }

   private static O00000OO0O0OO0 O00000000000O0(Object object) {
      if (object instanceof O00000OO0O0OO0 var7) {
         return O00000OO0O0OO0.O00000000(var7.O00000000(), var7.O000000000(), var7.O0000000000(), var7.O00000000000());
      } else if (object instanceof Number var6) {
         return O00000OO0O0OO0.O00000000(var6.intValue());
      } else if (object instanceof String var1) {
         try {
            String var2 = var1.startsWith("#") ? var1.substring(1) : var1;
            int var3 = (int)Long.parseUnsignedLong(var2, 16);
            int var4 = var2.length() > 6 ? var3 : 0xFF000000 | var3;
            return O00000OO0O0OO0.O00000000(var4);
         } catch (NumberFormatException var5) {
            throw new IllegalArgumentException("Invalid colour string: " + var1, var5);
         }
      } else {
         throw new IllegalArgumentException("Unsupported colour value type: " + object.getClass().getName());
      }
   }

   public static enum W229 {
      MODULE,
      SETTING;
   }
}
