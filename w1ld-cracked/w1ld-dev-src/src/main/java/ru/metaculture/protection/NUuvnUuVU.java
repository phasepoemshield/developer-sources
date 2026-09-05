package ru.metaculture.protection;

public record NUuvnUuVU(String id, String label, nnNVVnNnnV type, unnunUNUUnu direction, String defaultExpression) {
   public static NUuvnUuVU input(String var0, String var1, nnNVVnNnnV var2, String var3) {
      return new NUuvnUuVU(var0, var1, var2, unnunUNUUnu.INPUT, var3);
   }

   public static NUuvnUuVU output(String var0, String var1, nnNVVnNnnV var2) {
      return new NUuvnUuVU(var0, var1, var2, unnunUNUUnu.OUTPUT, "");
   }
}
