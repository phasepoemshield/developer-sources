package ru.metaculture.protection;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class ModeSetting extends Setting {
   public final List<String> O00000000000;
   public String O000000000000;
   public String O0000000000000;
   public O0000O00OOO00 O000000000000O = new O0000O0O0000O(300, 1.0);
   public int O00000000000O;
   public boolean O00000000000O0;
   private final String O00000000000OO;

   public ModeSetting(String string, String string2, String... strings) {
      this.O00000000 = string;
      this.O00000000000 = Arrays.asList(strings);
      this.O00000000000O = this.O00000000000.indexOf(string2);
      if (this.O00000000000O < 0) {
         this.O00000000000O = 0;
      }

      this.O000000000000 = this.O00000000000.get(this.O00000000000O);
      this.O00000000000OO = this.O000000000000;
   }

   public String O0000000000() {
      return this.O000000000000;
   }

   public boolean O000000000(String string) {
      return this.O000000000000.equalsIgnoreCase(string);
   }

   public ModeSetting O00000000(Supplier<Boolean> supplier) {
      this.O000000000 = supplier;
      return this;
   }

   @Override
   public void O000000000() {
      int var1 = this.O00000000000.indexOf(this.O00000000000OO);
      if (var1 < 0) {
         var1 = 0;
      }

      this.O00000000000O = var1;
      this.O000000000000 = this.O00000000000.get(var1);
      this.O00000000000O0 = false;
   }
}
