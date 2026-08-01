package ru.metaculture.protection;

import java.util.function.Supplier;

public class ButtonSetting extends Setting {
   public int O00000000000;
   public String O000000000000;
   private String O0000000000000 = "Run";
   private Runnable O000000000000O;
   private final int O00000000000O;

   public ButtonSetting(String string, int i) {
      this.O00000000 = string;
      this.O00000000000 = i;
      this.O00000000000O = i;
   }

   public int O0000000000() {
      return this.O00000000000;
   }

   public void O00000000(int i) {
      this.O00000000000 = i;
   }

   public void O00000000000() {
      this.O00000000000++;
      if (this.O000000000000O != null) {
         this.O000000000000O.run();
      }
   }

   public String O000000000000() {
      return this.O0000000000000;
   }

   public ButtonSetting O000000000(String string) {
      this.O0000000000000 = string;
      return this;
   }

   public ButtonSetting O00000000(Runnable runnable) {
      this.O000000000000O = runnable;
      return this;
   }

   public ButtonSetting O00000000(Supplier<Boolean> supplier) {
      this.O000000000 = supplier;
      return this;
   }

   @Override
   public void O000000000() {
      this.O00000000000 = this.O00000000000O;
   }
}
