package ru.metaculture.protection;

import java.util.function.Supplier;

public class TextSetting extends Setting {
   public static final int O00000000000 = 256;
   public String O000000000000;
   public String O0000000000000;
   public int O000000000000O = 256;
   private final String O00000000000O0;
   public boolean O00000000000O;

   public TextSetting(String string, String string2) {
      this.O00000000 = string;
      this.O000000000000 = O00000000(string2, 256);
      this.O00000000000O0 = this.O000000000000;
   }

   public String O0000000000() {
      return this.O000000000000;
   }

   public void O000000000(String string) {
      this.O000000000000 = O00000000(string, this.O000000000000O);
   }

   public TextSetting O00000000(Supplier<Boolean> supplier) {
      this.O000000000 = supplier;
      return this;
   }

   @Override
   public void O000000000() {
      this.O000000000000 = O00000000(this.O00000000000O0, this.O000000000000O);
      this.O00000000000O = false;
   }

   public TextSetting O00000000(int i) {
      this.O000000000000O = Math.max(1, i);
      if (this.O000000000000 != null && this.O000000000000.length() > this.O000000000000O) {
         this.O000000000000 = this.O000000000000.substring(0, this.O000000000000O);
      }

      return this;
   }

   private static String O00000000(String string, int i) {
      if (string == null) {
         return "";
      } else {
         return string.length() > i ? string.substring(0, i) : string;
      }
   }
}
