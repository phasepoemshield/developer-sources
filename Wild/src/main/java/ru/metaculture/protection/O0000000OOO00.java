package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class O0000000OOO00 {
   private static final String O00000000 = "Сброс настроек";
   private static final String O000000000 = "До заводских";
   private final List<Setting> O0000000000 = new ArrayList<>();
   private final O0000000OOOO00 O00000000000 = new O0000000OOOO00("Сброс настроек", 0, () -> "До заводских").O000000000((Runnable)this::O000000000);

   public void O00000000(Setting o0000000OOO00O) {
      this.O0000000000.add(o0000000OOO00O);
   }

   public void O00000000(Setting... o0000000OOO00Os) {
      if (o0000000OOO00Os != null) {
         for (Setting var5 : o0000000OOO00Os) {
            this.O00000000(var5);
         }
      }
   }

   public void O00000000(Collection<Setting> collection) {
      if (collection != null && !collection.isEmpty()) {
         this.O0000000000.removeAll(collection);
      }
   }

   public List<Setting> O00000000() {
      if (!this.O0000000000()) {
         return this.O0000000000;
      } else {
         ArrayList var1 = new ArrayList<>(this.O0000000000);
         var1.add(this.O00000000000);
         return var1;
      }
   }

   private void O000000000() {
      for (Setting var2 : this.O0000000000) {
         if (this.O000000000(var2)) {
            var2.O000000000();
         }
      }

      O000000000O0O0.O00000000000();
   }

   private boolean O0000000000() {
      for (Setting var2 : this.O0000000000) {
         if (this.O000000000(var2)) {
            return true;
         }
      }

      return false;
   }

   private boolean O000000000(Setting o0000000OOO00O) {
      return o0000000OOO00O != null && !o0000000OOO00O.O0000000000 && !(o0000000OOO00O instanceof ButtonSetting) && !(o0000000OOO00O instanceof O000000O0);
   }
}
