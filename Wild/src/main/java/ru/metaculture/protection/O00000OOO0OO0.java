package ru.metaculture.protection;

import java.util.Objects;

public final class O00000OOO0OO0 {
   private final String O00000000;
   private final String O000000000;
   private final String O0000000000;
   private final String O00000000000;

   public O00000OOO0OO0(String string, String string2, String string3, String string4) {
      this.O00000000 = Objects.requireNonNull(string, "fromNodeId");
      this.O000000000 = Objects.requireNonNull(string2, "fromPinId");
      this.O0000000000 = Objects.requireNonNull(string3, "toNodeId");
      this.O00000000000 = Objects.requireNonNull(string4, "toPinId");
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

   public String O00000000000() {
      return this.O00000000000;
   }

   public String O000000000000() {
      return this.O00000000 + "." + this.O000000000;
   }

   public String O0000000000000() {
      return this.O0000000000 + "." + this.O00000000000;
   }
}
