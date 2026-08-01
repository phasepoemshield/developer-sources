package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Helper11 {
   private static final Helper11 INSTANCE = new Helper11();
   private final List<String> targets = new ArrayList<>();

   public Helper11() {
   }

   public static Helper11 method355() {
      return INSTANCE;
   }

   public void method356(String var1) {
      if (!this.method360(var1)) {
         this.targets.add(var1.toLowerCase(Locale.US));
      }
   }

   public void method357(String var1) {
      this.targets.remove(var1.toLowerCase(Locale.US));
   }

   public void method358() {
      this.targets.clear();
   }

   public List<String> method359() {
      return Collections.unmodifiableList(this.targets);
   }

   public boolean method360(String var1) {
      return this.targets.contains(var1.toLowerCase(Locale.US));
   }
}
