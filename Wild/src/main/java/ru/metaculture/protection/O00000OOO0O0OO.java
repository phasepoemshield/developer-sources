package ru.metaculture.protection;

public record O00000OOO0O0OO(String id, String label, O00000OOO0OO type, O00000OOO0O0O0 direction, String defaultExpression) {
   public static O00000OOO0O0OO input(String string, String string2, O00000OOO0OO o00000OOO0OO, String string3) {
      return new O00000OOO0O0OO(string, string2, o00000OOO0OO, O00000OOO0O0O0.INPUT, string3);
   }

   public static O00000OOO0O0OO output(String string, String string2, O00000OOO0OO o00000OOO0OO) {
      return new O00000OOO0O0OO(string, string2, o00000OOO0OO, O00000OOO0O0O0.OUTPUT, "");
   }
}
