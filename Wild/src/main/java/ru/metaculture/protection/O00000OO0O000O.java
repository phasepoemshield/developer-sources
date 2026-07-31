package ru.metaculture.protection;

import java.util.Objects;

public final class O00000OO0O000O extends O00000OO0O0000<String> {
   public O00000OO0O000O(O00000OO0O00 o00000OO0O00, ModeSetting o0000000OOOOO0) {
      super(Objects.requireNonNull(o00000OO0O00, "model"), O00000000(o00000OO0O00, Objects.requireNonNull(o0000000OOOOO0, "setting")));
   }

   private static O00000OO0O0OO O00000000(O00000OO0O00 o00000OO0O00, ModeSetting o0000000OOOOO0) {
      final String var2 = o0000000OOOOO0.O000000000000 != null ? o0000000OOOOO0.O000000000000 : "";
      O00000OO0OO0 var3 = O00000000(o00000OO0O00, var2, new O00000OO0O0000.W233<String>() {
         public String O00000000(O00000OO0O00 o00000OO0O00) {
            Object var2x = o00000OO0O00.O000000000O0O();
            return var2x != null ? var2x.toString() : var2;
         }

         public void O00000000(O00000OO0O00 o00000OO0O00, String string) {
            String var3x = string != null ? string : var2;
            o00000OO0O00.O000000000(var3x);
         }
      });
      return new O00000OO0O0OO(O00000000(o00000OO0O00), O00000000000(), o0000000OOOOO0, var3, "New Value");
   }
}
