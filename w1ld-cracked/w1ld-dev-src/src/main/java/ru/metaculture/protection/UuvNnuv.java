package ru.metaculture.protection;

public enum UuvNnuv {
   TRUE,
   FALSE,
   UNKNOWN;

   public static UuvNnuv UuUVuuUu(boolean var0, boolean var1, Boolean var2) {
      if (!var0) {
         return FALSE;
      } else if (var1 && var2 != null) {
         return var2 ? TRUE : FALSE;
      } else {
         return UNKNOWN;
      }
   }

   public boolean UuUVuuUu() {
      return this == FALSE;
   }
}
