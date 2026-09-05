package ru.metaculture.protection;

public final class nvUnvV extends RuntimeException {
   public nvUnvV() {
      super((String)null);
   }

   public nvUnvV(String var1) {
      super(var1 != null && !var1.isBlank() ? var1 : null);
   }
}
