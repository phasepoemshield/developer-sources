package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public final class O00000OOOOO00O {
   public static final List<O00000OOOOO00O.W314> O00000000 = new ArrayList<>();

   private static boolean O00000000(O00000OOOO00O o00000OOOO00O) {
      for (O00000OOOO00O var4 : O00000OOOO00O.O0000000000O0O()) {
         if (var4 == o00000OOOO00O) {
            return true;
         }
      }

      return false;
   }

   private O00000OOOOO00O() {
   }

   public static O00000OOO0OO00 O00000000(O00000OOOOO00O.W314 o00000000, O00000OOO0OOO o00000OOO0OOO) {
      return o00000000.O0000000000000.apply(o00000OOO0OOO);
   }

   static {
      for (O00000OOO0O00.W304 var1 : O00000OOO0O00.O00000000) {
         if (O00000000(var1.target())) {
            O00000000.add(new O00000OOOOO00O.W314(var1.title(), var1.description(), var1.target(), var1.complexity(), var1.nodes(), var1.builder()));
         }
      }
   }

   public static final class W314 {
      public final String O00000000;
      public final String O000000000;
      public final O00000OOOO00O O0000000000;
      public final String O00000000000;
      public final List<String> O000000000000;
      final Function<O00000OOO0OOO, O00000OOO0OO00> O0000000000000;

      public W314(
         String string, String string2, O00000OOOO00O o00000OOOO00O, String string3, List<String> list, Function<O00000OOO0OOO, O00000OOO0OO00> function
      ) {
         this.O00000000 = string;
         this.O000000000 = string2;
         this.O0000000000 = o00000OOOO00O;
         this.O00000000000 = string3 != null && !string3.isBlank() ? string3 : "Custom";
         this.O000000000000 = list == null ? List.of() : List.copyOf(list);
         this.O0000000000000 = function;
      }
   }
}
