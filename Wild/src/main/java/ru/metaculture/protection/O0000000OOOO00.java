package ru.metaculture.protection;

import java.util.function.Supplier;

public class O0000000OOOO00 extends ButtonSetting {
   private final Supplier<String> O0000000000000;
   private Runnable O000000000000O;

   public O0000000OOOO00(String string, int i, Supplier<String> supplier) {
      super(string, i);
      this.O0000000000000 = supplier;
   }

   @Override
   public String O000000000000() {
      String var1 = this.O0000000000000 == null ? null : this.O0000000000000.get();
      return var1 != null && !var1.isBlank() ? var1 : super.O000000000000();
   }

   @Override
   public void O00000000000() {
      if (this.O000000000000O != null) {
         this.O000000000000O.run();
      }
   }

   public O0000000OOOO00 O000000000(Runnable runnable) {
      this.O000000000000O = runnable;
      return this;
   }

   public O0000000OOOO00 O000000000(Supplier<Boolean> supplier) {
      this.O000000000 = supplier;
      return this;
   }
}
