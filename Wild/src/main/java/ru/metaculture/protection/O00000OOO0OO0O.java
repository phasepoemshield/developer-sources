package ru.metaculture.protection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public final class O00000OOO0OO0O {
   private final String O00000000;
   private final String O000000000;
   private float O0000000000;
   private float O00000000000;
   private float O000000000000;
   private final Map<String, Float> O0000000000000 = new LinkedHashMap<>();
   private final Map<String, String> O000000000000O = new LinkedHashMap<>();

   public O00000OOO0OO0O(String string, String string2, float f, float g) {
      this.O00000000 = Objects.requireNonNull(string, "id");
      this.O000000000 = Objects.requireNonNull(string2, "kind");
      this.O0000000000 = f;
      this.O00000000000 = g;
      this.O000000000000 = 188.0F;
   }

   public String O00000000() {
      return this.O00000000;
   }

   public String O000000000() {
      return this.O000000000;
   }

   public float O0000000000() {
      return this.O0000000000;
   }

   public float O00000000000() {
      return this.O00000000000;
   }

   public void O00000000(float f, float g) {
      this.O0000000000 = f;
      this.O00000000000 = g;
   }

   public float O000000000000() {
      return this.O000000000000;
   }

   public void O00000000(float f) {
      this.O000000000000 = Math.max(132.0F, f);
   }

   public Map<String, Float> O0000000000000() {
      return this.O0000000000000;
   }

   public Map<String, String> O000000000000O() {
      return this.O000000000000O;
   }

   public float O00000000(String string, float f) {
      Float var3 = this.O0000000000000.get(string);
      return var3 != null && Float.isFinite(var3) ? var3 : f;
   }

   public void O000000000(String string, float f) {
      if (string != null && Float.isFinite(f)) {
         this.O0000000000000.put(string, f);
      }
   }

   public String O00000000(String string, String string2) {
      String var3 = this.O000000000000O.get(string);
      return var3 != null && !var3.isBlank() ? var3 : string2;
   }

   public void O000000000(String string, String string2) {
      if (string != null) {
         this.O000000000000O.put(string, string2 == null ? "" : string2);
      }
   }
}
