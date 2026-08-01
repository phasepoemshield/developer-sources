package ru.metaculture.protection;

import java.util.Objects;

public final class O00000OO0O0O extends O00000OO0O0000<Boolean> {
   public O00000OO0O0O(O00000OO0O00 o00000OO0O00, BooleanSetting o0000000OOO0O0) {
      super(Objects.requireNonNull(o00000OO0O00, "model"), O00000000(o00000OO0O00, Objects.requireNonNull(o0000000OOO0O0, "setting")));
   }

   private static O00000OO0O0O00 O00000000(O00000OO0O00 o00000OO0O00, BooleanSetting o0000000OOO0O0) {
      Boolean var2 = Boolean.FALSE;
      O00000OO0OO0 var3 = O00000000(o00000OO0O00, var2, new O00000OO0O0000.W233<Boolean>() {
         public Boolean O00000000(O00000OO0O00 o00000OO0O00) {
            Object var2x = o00000OO0O00.O000000000O0O();
            return Boolean.TRUE.equals(var2x);
         }

         public void O00000000(O00000OO0O00 o00000OO0O00, Boolean boolean_) {
            o00000OO0O00.O000000000(Boolean.TRUE.equals(boolean_));
         }
      });
      return new O00000OO0O0O00(O00000000(o00000OO0O00), O00000000000(), o0000000OOO0O0, var3, "New Value");
   }
}
