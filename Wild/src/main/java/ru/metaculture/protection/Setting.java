package ru.metaculture.protection;

import java.util.function.Supplier;

public class Setting extends O0000000OOO000 {
   public String O00000000;
   private String O00000000000;
   public Supplier<Boolean> O000000000 = () -> false;
   public boolean O0000000000 = false;

   public String O00000000() {
      return this.O00000000000 != null && !this.O00000000000.isBlank() ? this.O00000000000 : this.O00000000;
   }

   public Setting O00000000(String string) {
      this.O00000000000 = string;
      return this;
   }

   public Setting O00000000(boolean bl) {
      this.O0000000000 = bl;
      return this;
   }

   public void O000000000() {
   }
}
