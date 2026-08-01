package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class O0000000OOO000 {
   private final ArrayList<Setting> O00000000 = new ArrayList<>();

   public final void O00000000(Setting... o0000000OOO00Os) {
      this.O00000000.addAll(Arrays.asList(o0000000OOO00Os));
   }

   public final void O00000000(Collection<Setting> collection) {
      if (collection != null && !collection.isEmpty()) {
         this.O00000000.removeAll(collection);
      }
   }

   public List<Setting> O0000000000000() {
      return this.O00000000.stream().filter(o0000000OOO00O -> {
         try {
            return !o0000000OOO00O.O000000000.get();
         } catch (Throwable var2) {
            return false;
         }
      }).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
   }

   public final List<Setting> O0000000000O() {
      return this.O00000000;
   }
}
