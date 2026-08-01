package ru.metaculture.protection;

import java.util.Objects;

public final class O00000OO0O00OO extends O00000OO0O0000<Double> {
   public O00000OO0O00OO(O00000OO0O00 o00000OO0O00, NumberSetting o000000O000) {
      super(Objects.requireNonNull(o00000OO0O00, "model"), O00000000(o00000OO0O00, Objects.requireNonNull(o000000O000, "setting")));
   }

   private static O00000OO0OO000 O00000000(O00000OO0O00 o00000OO0O00, NumberSetting o000000O000) {
      final double var2 = o000000O000.O00000000000;
      O00000OO0OO0 var4 = O00000000(o00000OO0O00, var2, new O00000OO0O0000.W233<Double>() {
         public Double O00000000(O00000OO0O00 o00000OO0O00) {
            return o00000OO0O00.O000000000O0O() instanceof Number var3 ? var3.doubleValue() : var2;
         }

         public void O00000000(O00000OO0O00 o00000OO0O00, Double double_) {
            double var3 = double_ != null ? double_ : var2;
            o00000OO0O00.O000000000(var3);
         }
      });
      return new O00000OO0OO000(O00000000(o00000OO0O00), O00000000000(), o000000O000, var4, "New Value");
   }
}
