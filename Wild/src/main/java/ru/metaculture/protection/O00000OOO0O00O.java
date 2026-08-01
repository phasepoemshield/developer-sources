package ru.metaculture.protection;

import java.util.List;
import java.util.Objects;

public final class O00000OOO0O00O {
   private final String O00000000;
   private final String O000000000;
   private final String O0000000000;
   private final float O00000000000;
   private final List<O00000OOO0O0OO> O000000000000;
   private final List<O00000OOO0O0OO> O0000000000000;
   private final O00000OOO0O0O O000000000000O;
   private final boolean O00000000000O;

   public O00000OOO0O00O(
      String string, String string2, String string3, float f, List<O00000OOO0O0OO> list, List<O00000OOO0O0OO> list2, O00000OOO0O0O o00000OOO0O0O
   ) {
      this(string, string2, string3, f, list, list2, o00000OOO0O0O, O00000000(string3, list2));
   }

   public O00000OOO0O00O(
      String string, String string2, String string3, float f, List<O00000OOO0O0OO> list, List<O00000OOO0O0OO> list2, O00000OOO0O0O o00000OOO0O0O, boolean bl
   ) {
      this.O00000000 = Objects.requireNonNull(string, "id");
      this.O000000000 = Objects.requireNonNull(string2, "title");
      this.O0000000000 = Objects.requireNonNull(string3, "category");
      this.O00000000000 = Math.max(132.0F, f);
      this.O000000000000 = List.copyOf(list);
      this.O0000000000000 = List.copyOf(list2);
      this.O000000000000O = Objects.requireNonNull(o00000OOO0O0O, "emitter");
      this.O00000000000O = bl;
   }

   public String O00000000() {
      return this.O00000000;
   }

   public String O000000000() {
      return this.O000000000;
   }

   public String O0000000000() {
      return this.O0000000000;
   }

   public float O00000000000() {
      return this.O00000000000;
   }

   public List<O00000OOO0O0OO> O000000000000() {
      return this.O000000000000;
   }

   public List<O00000OOO0O0OO> O0000000000000() {
      return this.O0000000000000;
   }

   public O00000OOO0O0O O000000000000O() {
      return this.O000000000000O;
   }

   public boolean O00000000000O() {
      return this.O00000000000O;
   }

   public O00000OOO0O0OO O00000000(String string) {
      for (O00000OOO0O0OO var3 : this.O000000000000) {
         if (var3.id().equals(string)) {
            return var3;
         }
      }

      return null;
   }

   public O00000OOO0O0OO O000000000(String string) {
      for (O00000OOO0O0OO var3 : this.O0000000000000) {
         if (var3.id().equals(string)) {
            return var3;
         }
      }

      return null;
   }

   private static boolean O00000000(String string, List<O00000OOO0O0OO> list) {
      return list != null && !list.isEmpty();
   }
}
