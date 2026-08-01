package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;

public final class O00000OOOO0O00 {
   private static final O00000OOOO0O00 O00000000 = new O00000OOOO0O00();
   private final Map<O00000OOOO00O, O00000OOO0OO00> O000000000 = new EnumMap<>(O00000OOOO00O.class);
   private final Map<O00000OOOO00O, O00000OOO00OO0> O0000000000 = new EnumMap<>(O00000OOOO00O.class);
   private final Map<O00000OOOO00O, String> O00000000000 = new EnumMap<>(O00000OOOO00O.class);
   private final Map<String, O00000OOO0OO00> O000000000000 = new LinkedHashMap<>();
   private final Map<String, O00000OOO00OO0> O0000000000000 = new LinkedHashMap<>();
   private final Map<String, String> O000000000000O = new LinkedHashMap<>();
   private final Map<String, O00000OOOO0O00.W313> O00000000000O = new LinkedHashMap<>();
   private final Map<String, O00000OOOO0O00.W312> O00000000000O0 = new LinkedHashMap<>();
   private final Map<O00000OOOO00O, O00000OOOO0O00.W312> O00000000000OO = new EnumMap<>(O00000OOOO00O.class);
   private final Map<O00000OOOO00O, Map<String, float[]>> O0000000000O = new EnumMap<>(O00000OOOO00O.class);
   private final Map<String, Map<String, float[]>> O0000000000O0 = new LinkedHashMap<>();
   private final List<Consumer<O00000OOOO00O>> O0000000000O00 = new CopyOnWriteArrayList<>();
   private final List<Consumer<String>> O0000000000O0O = new CopyOnWriteArrayList<>();
   private ShaderSourceBuilder O0000000000OO;

   private O00000OOOO0O00() {
   }

   public static O00000OOOO0O00 O00000000() {
      return O00000000;
   }

   public synchronized void O00000000(ShaderSourceBuilder o00000OOO00OOO) {
      this.O0000000000OO = o00000OOO00OOO;
   }

   public synchronized void O00000000(O00000OOOO00O o00000OOOO00O, O00000OOO0OO00 o00000OOO0OO00, O00000OOO00OO0 o00000OOO00OO0) {
      if (o00000OOOO00O != null && o00000OOO0OO00 != null && o00000OOO00OO0 != null) {
         this.O000000000.put(o00000OOOO00O, o00000OOO0OO00);
         this.O0000000000.put(o00000OOOO00O, o00000OOO00OO0);
         this.O00000000000OO.put(o00000OOOO00O, o00000OOO00OO0.ok() ? O00000OOOO0O00.W312.SAVED : O00000OOOO0O00.W312.FAILED);
         O00000000(this.O0000000000O.computeIfAbsent(o00000OOOO00O, o00000OOOO00Ox -> new LinkedHashMap<>()), o00000OOO00OO0);

         try {
            this.O00000000000.put(o00000OOOO00O, O00000OOOO0OO0.O00000000(o00000OOO0OO00));
         } catch (Throwable var5) {
         }

         this.O0000000000O(o00000OOOO00O);
      }
   }

   public synchronized void O00000000(String string, O00000OOO0OO00 o00000OOO0OO00, O00000OOO00OO0 o00000OOO00OO0) {
      this.O00000000(string, o00000OOO0OO00, o00000OOO00OO0, O00000000(o00000OOO0OO00));
   }

   public synchronized void O00000000(String string, O00000OOO0OO00 o00000OOO0OO00, O00000OOO00OO0 o00000OOO00OO0, O00000OOOO0O00.W313 o000000000) {
      String var5 = O00000000000OO(string);
      if (!var5.isBlank() && o00000OOO0OO00 != null && o00000OOO00OO0 != null) {
         this.O000000000000.put(var5, o00000OOO0OO00);
         this.O0000000000000.put(var5, o00000OOO00OO0);
         this.O00000000000O.put(var5, o000000000 == null ? O00000OOOO0O00.W313.USER : o000000000);
         this.O00000000000O0.put(var5, o00000OOO00OO0.ok() ? O00000OOOO0O00.W312.SAVED : O00000OOOO0O00.W312.FAILED);
         O00000000(this.O0000000000O0.computeIfAbsent(var5, stringx -> new LinkedHashMap<>()), o00000OOO00OO0);

         try {
            this.O000000000000O.put(var5, O00000OOOO0OO0.O00000000(o00000OOO0OO00));
         } catch (Throwable var7) {
         }

         this.O0000000000O(var5);
      }
   }

   public void O00000000(Consumer<O00000OOOO00O> consumer) {
      if (consumer != null) {
         this.O0000000000O00.add(consumer);
      }
   }

   public void O000000000(Consumer<String> consumer) {
      if (consumer != null) {
         this.O0000000000O0O.add(consumer);
      }
   }

   private void O0000000000O(O00000OOOO00O o00000OOOO00O) {
      for (Consumer var3 : this.O0000000000O00) {
         try {
            var3.accept(o00000OOOO00O);
         } catch (Throwable var5) {
         }
      }
   }

   private void O0000000000O(String string) {
      for (Consumer var3 : this.O0000000000O0O) {
         try {
            var3.accept(string);
         } catch (Throwable var5) {
         }
      }
   }

   public synchronized void O00000000(O00000OOOO00O o00000OOOO00O) {
      this.O000000000.remove(o00000OOOO00O);
      this.O0000000000.remove(o00000OOOO00O);
      this.O00000000000.remove(o00000OOOO00O);
      this.O0000000000O.remove(o00000OOOO00O);
      this.O00000000000OO.remove(o00000OOOO00O);
      this.O0000000000O(o00000OOOO00O);
   }

   public synchronized void O00000000(String string) {
      String var2 = O00000000000OO(string);
      this.O000000000000.remove(var2);
      this.O0000000000000.remove(var2);
      this.O000000000000O.remove(var2);
      this.O00000000000O.remove(var2);
      this.O00000000000O0.remove(var2);
      this.O0000000000O0.remove(var2);
      O00000OOOO0O0.O00000000().O0000000000(var2);
      this.O0000000000O(var2);
   }

   public synchronized O00000OOO00OO0 O000000000(O00000OOOO00O o00000OOOO00O) {
      return this.O0000000000.get(o00000OOOO00O);
   }

   public synchronized O00000OOO00OO0 O000000000(String string) {
      return this.O0000000000000.get(O00000000000OO(string));
   }

   public synchronized O00000OOO0OO00 O0000000000(O00000OOOO00O o00000OOOO00O) {
      return this.O000000000.get(o00000OOOO00O);
   }

   public synchronized O00000OOO0OO00 O0000000000(String string) {
      return this.O000000000000.get(O00000000000OO(string));
   }

   public synchronized String O00000000000(O00000OOOO00O o00000OOOO00O) {
      return this.O00000000000.get(o00000OOOO00O);
   }

   public synchronized String O00000000000(String string) {
      return this.O000000000000O.get(O00000000000OO(string));
   }

   public synchronized boolean O000000000000(O00000OOOO00O o00000OOOO00O) {
      return o00000OOOO00O != null && this.O0000000000.containsKey(o00000OOOO00O);
   }

   public synchronized boolean O000000000000(String string) {
      return this.O0000000000000.containsKey(O00000000000OO(string));
   }

   public synchronized O00000OOOO0O00.W313 O0000000000000(String string) {
      return this.O00000000000O.getOrDefault(O00000000000OO(string), O00000OOOO0O00.W313.USER);
   }

   public synchronized O00000OOOO0O00.W312 O000000000000O(String string) {
      return this.O00000000000O0.getOrDefault(O00000000000OO(string), O00000OOOO0O00.W312.FAILED);
   }

   public synchronized O00000OOOO0O00.W312 O0000000000000(O00000OOOO00O o00000OOOO00O) {
      return this.O00000000000OO.getOrDefault(o00000OOOO00O, O00000OOOO0O00.W312.FAILED);
   }

   public synchronized List<O00000OOO00OO> O000000000000O(O00000OOOO00O o00000OOOO00O) {
      O00000OOO00OO0 var2 = o00000OOOO00O == null ? null : this.O0000000000.get(o00000OOOO00O);
      return var2 == null ? List.of() : var2.exposedUniforms();
   }

   public synchronized List<O00000OOO00OO> O00000000000O(String string) {
      O00000OOO00OO0 var2 = this.O0000000000000.get(O00000000000OO(string));
      return var2 == null ? List.of() : var2.exposedUniforms();
   }

   public synchronized Map<String, float[]> O00000000000O(O00000OOOO00O o00000OOOO00O) {
      return O00000000(this.O0000000000O.get(o00000OOOO00O));
   }

   public synchronized Map<String, float[]> O00000000000O0(String string) {
      return O00000000(this.O0000000000O0.get(O00000000000OO(string)));
   }

   public synchronized void O00000000(O00000OOOO00O o00000OOOO00O, String string, float f) {
      if (o00000OOOO00O != null && Float.isFinite(f)) {
         O00000OOO00OO var4 = O00000000(this.O000000000000O(o00000OOOO00O), string, O00000OOO00OO.W302.FLOAT);
         if (var4 != null) {
            this.O0000000000O.computeIfAbsent(o00000OOOO00O, o00000OOOO00Ox -> new LinkedHashMap<>()).put(var4.uniformName(), new float[]{f, 0.0F, 0.0F, 1.0F});
         }
      }
   }

   public synchronized void O00000000(String string, String string2, float f) {
      String var4 = O00000000000OO(string);
      if (!var4.isBlank() && Float.isFinite(f)) {
         O00000OOO00OO var5 = O00000000(this.O00000000000O(var4), string2, O00000OOO00OO.W302.FLOAT);
         if (var5 != null) {
            this.O0000000000O0.computeIfAbsent(var4, stringx -> new LinkedHashMap<>()).put(var5.uniformName(), new float[]{f, 0.0F, 0.0F, 1.0F});
         }
      }
   }

   public synchronized void O00000000(O00000OOOO00O o00000OOOO00O, String string, int i) {
      if (o00000OOOO00O != null) {
         O00000OOO00OO var4 = O00000000(this.O000000000000O(o00000OOOO00O), string, O00000OOO00OO.W302.COLOR);
         if (var4 != null) {
            this.O0000000000O.computeIfAbsent(o00000OOOO00O, o00000OOOO00Ox -> new LinkedHashMap<>()).put(var4.uniformName(), O00000000(i));
         }
      }
   }

   public synchronized void O00000000(String string, String string2, int i) {
      String var4 = O00000000000OO(string);
      if (!var4.isBlank()) {
         O00000OOO00OO var5 = O00000000(this.O00000000000O(var4), string2, O00000OOO00OO.W302.COLOR);
         if (var5 != null) {
            this.O0000000000O0.computeIfAbsent(var4, stringx -> new LinkedHashMap<>()).put(var5.uniformName(), O00000000(i));
         }
      }
   }

   public synchronized List<String> O000000000() {
      ArrayList var1 = new ArrayList();

      for (String var3 : this.O0000000000000.keySet()) {
         if (!O0000000000O0(var3)) {
            var1.add(var3);
         }
      }

      Collections.sort(var1);
      return var1;
   }

   public synchronized List<String> O00000000000O0(O00000OOOO00O o00000OOOO00O) {
      O00000OOOO00O var2 = o00000OOOO00O == null ? O00000OOOO00O.PREVIEW_ONLY : o00000OOOO00O;
      ArrayList var3 = new ArrayList();

      for (String var5 : this.O0000000000000.keySet()) {
         if (!O0000000000O0(var5)) {
            O00000OOO0OO00 var6 = this.O000000000000.get(var5);
            O00000OOOO00O var7 = O00000OOOO00O.O00000000(var6 == null ? null : var6.O000000000());
            if (var7 == var2) {
               var3.add(var5);
            }
         }
      }

      Collections.sort(var3);
      return var3;
   }

   public synchronized List<String> O0000000000() {
      ArrayList var1 = new ArrayList();
      var1.add("None");
      var1.addAll(this.O000000000());
      return var1;
   }

   public synchronized List<String> O00000000000OO(O00000OOOO00O o00000OOOO00O) {
      ArrayList var2 = new ArrayList();
      var2.add("None");
      var2.addAll(this.O00000000000O0(o00000OOOO00O));
      return var2;
   }

   private static void O00000000(Map<String, float[]> map, O00000OOO00OO0 o00000OOO00OO0) {
      if (map != null && o00000OOO00OO0 != null) {
         for (O00000OOO00OO var3 : o00000OOO00OO0.exposedUniforms()) {
            map.putIfAbsent(var3.uniformName(), Arrays.copyOf(var3.defaults(), var3.defaults().length));
         }
      }
   }

   private static Map<String, float[]> O00000000(Map<String, float[]> map) {
      if (map != null && !map.isEmpty()) {
         HashMap var1 = new HashMap();

         for (Entry var3 : map.entrySet()) {
            var1.put(
               (String)var3.getKey(),
               var3.getValue() == null ? new float[]{0.0F, 0.0F, 0.0F, 1.0F} : Arrays.copyOf((float[])var3.getValue(), ((float[])var3.getValue()).length)
            );
         }

         return var1;
      } else {
         return Map.of();
      }
   }

   private static O00000OOO00OO O00000000(List<O00000OOO00OO> list, String string, O00000OOO00OO.W302 o00000000) {
      if (list != null && !list.isEmpty() && string != null && !string.isBlank()) {
         String var3 = O00000000000OO(string);

         for (O00000OOO00OO var5 : list) {
            if (var5.kind() == o00000000 && (O00000000000OO(var5.name()).equals(var3) || O00000000000OO(var5.uniformName()).equals(var3))) {
               return var5;
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private static float[] O00000000(int i) {
      return new float[]{(i >> 16 & 0xFF) / 255.0F, (i >> 8 & 0xFF) / 255.0F, (i & 0xFF) / 255.0F, (i >>> 24 & 0xFF) / 255.0F};
   }

   public static String O00000000000OO(String string) {
      if (string == null) {
         return "";
      } else {
         String var1 = string.trim().replaceAll("\\s+", " ");
         return var1.length() > 48 ? var1.substring(0, 48) : var1;
      }
   }

   private static boolean O0000000000O0(String string) {
      return string != null && string.startsWith("__");
   }

   private static O00000OOOO0O00.W313 O00000000(O00000OOO0OO00 o00000OOO0OO00) {
      if (o00000OOO0OO00 != null && o00000OOO0OO00.O00000000() != null) {
         String var1 = o00000OOO0OO00.O00000000().O0000000000000();
         if ("preset".equalsIgnoreCase(var1)) {
            return O00000OOOO0O00.W313.PRESET;
         } else if ("imported".equalsIgnoreCase(var1) || "shared".equalsIgnoreCase(var1)) {
            return O00000OOOO0O00.W313.IMPORTED;
         } else {
            return "runtime".equalsIgnoreCase(var1) ? O00000OOOO0O00.W313.RUNTIME : O00000OOOO0O00.W313.USER;
         }
      } else {
         return O00000OOOO0O00.W313.USER;
      }
   }

   public static enum W312 {
      SAVED,
      DIRTY,
      FAILED,
      COMPILING;
   }

   public static enum W313 {
      PRESET,
      USER,
      IMPORTED,
      RUNTIME;
   }
}
