package ru.metaculture.protection;

public enum UvnnvunNNuVV {
   MODELS("models", "Модели"),
   ITEMS("items", "Предметы"),
   PETS("pets", "Питомцы");

   private final String UuUVuuUu;
   private final String C00OOC00oO;

   private UvnnvunNNuVV(String var3, String var4) {
      this.UuUVuuUu = var3;
      this.C00OOC00oO = var4;
   }

   public String UuUVuuUu() {
      return this.UuUVuuUu;
   }

   public String C00OOC00oO() {
      return this.C00OOC00oO;
   }

   public static UvnnvunNNuVV UuUVuuUu(String var0) {
      if (var0 != null) {
         for (UvnnvunNNuVV var4 : values()) {
            if (var4.UuUVuuUu.equalsIgnoreCase(var0)) {
               return var4;
            }
         }
      }

      return MODELS;
   }
}
