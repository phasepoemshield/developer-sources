package ru.metaculture.protection;

import java.util.function.Supplier;

public class BooleanSetting extends Setting {
   private boolean O00000000000O0;
   private final boolean O00000000000OO;
   public String O00000000000;
   public O0000O00O0OO O000000000000 = new O0000O00O0OO();
   public int O0000000000000 = -1;
   public boolean O000000000000O = false;
   public boolean O00000000000O = false;

   public BooleanSetting(String string, boolean bl) {
      this.O00000000 = string;
      this.O00000000000O0 = bl;
      this.O00000000000OO = bl;
      this.O00000000000 = this.O00000000000;
   }

   public boolean O0000000000() {
      return this.O0000000000000 != -1 && this.O000000000000O ? this.O00000000000O0 || KeybindSetting.O000000000(this.O0000000000000) : this.O00000000000O0;
   }

   public boolean O00000000000() {
      return this.O00000000000O0;
   }

   public void O000000000(boolean bl) {
      this.O00000000000O0 = bl;
   }

   public BooleanSetting O00000000(Supplier<Boolean> supplier) {
      this.O000000000 = supplier;
      return this;
   }

   @Override
   public void O000000000() {
      this.O000000000(this.O00000000000OO);
      this.O0000000000000 = -1;
      this.O000000000000O = false;
      this.O00000000000O = false;
   }
}
