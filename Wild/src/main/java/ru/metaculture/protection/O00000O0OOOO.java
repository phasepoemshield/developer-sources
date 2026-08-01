package ru.metaculture.protection;

public enum O00000O0OOOO {
   MODELS("models", "Модели"),
   ITEMS("items", "Предметы"),
   PETS("pets", "Питомцы");

   private final String O00000000;
   private final String O000000000;

   private O00000O0OOOO(String string2, String string3) {
      this.O00000000 = string2;
      this.O000000000 = string3;
   }

   public String O00000000() {
      return this.O00000000;
   }

   public String O000000000() {
      return this.O000000000;
   }

   public static O00000O0OOOO O00000000(String string) {
      if (string != null) {
         for (O00000O0OOOO var4 : values()) {
            if (var4.O00000000.equalsIgnoreCase(string)) {
               return var4;
            }
         }
      }

      return MODELS;
   }
}
