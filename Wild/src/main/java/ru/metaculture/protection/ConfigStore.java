package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.List;
import ru.metaculture.sdk.Compile;
import ru.metaculture.sdk.Loader;

public abstract class ConfigStore<T> {
   private List<T> O00000000 = new ArrayList<>();

   public List<T> O0000000000000() {
      return this.O00000000;
   }

   @Compile
   public void O00000000(ArrayList<T> arrayList) {
      this.O00000000.clear();
      if (arrayList != null) {
         this.O00000000.addAll(arrayList);
      }
   }

   static {
      Loader.initialize();
   }
}
