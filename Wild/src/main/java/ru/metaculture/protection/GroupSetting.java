package ru.metaculture.protection;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class GroupSetting extends Setting {
   public List<BooleanSetting> O00000000000;
   public boolean O000000000000;
   public O0000O00O0OO O0000000000000 = new O0000O00O0OO();

   public GroupSetting(String string, BooleanSetting... o0000000OOO0O0s) {
      this.O00000000 = string;
      this.O00000000000 = Arrays.asList(o0000000OOO0O0s);
   }

   public boolean O000000000(String string) {
      for (BooleanSetting var3 : this.O00000000000) {
         if (var3.O00000000.equals(string)) {
            return var3.O0000000000();
         }
      }

      return false;
   }

   public boolean O00000000(int i) {
      return i >= 0 && i < this.O00000000000.size() ? this.O00000000000.get(i).O0000000000() : false;
   }

   public GroupSetting O00000000(Supplier<Boolean> supplier) {
      this.O000000000 = supplier;
      return this;
   }

   @Override
   public void O000000000() {
      this.O000000000000 = false;

      for (BooleanSetting var2 : this.O00000000000) {
         if (var2 != null) {
            var2.O000000000();
         }
      }
   }
}
