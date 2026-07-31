package ru.metaculture.protection;

public enum Category {
   Combat("Combat", "f"),
   Movement("Movement", "b"),
   Visuals("Visuals", "n"),
   Player("Player", "m"),
   Misc("Misc", "v");

   private final String O00000000;
   private final String O000000000;

   private Category(String string2, String string3) {
      this.O00000000 = string2;
      this.O000000000 = string3;
   }

   public String O00000000() {
      return this.O000000000;
   }

   public String O000000000() {
      return this.O00000000;
   }
}
