package ru.metaculture.protection;

import lombok.Generated;

public enum O0000O00O0OO0 {
   LINEAR(O0000O00O0OO0O.O0000000000000),
   QUAD_OUT(O0000O00O0OO0O.O00000000000O),
   CUBIC_OUT(O0000O00O0OO0O.O0000000000O),
   QUART_OUT(O0000O00O0OO0O.O0000000000O0O),
   QUINT_OUT(O0000O00O0OO0O.O0000000000OOO),
   SINE_OUT(O0000O00O0OO0O.O000000000O00),
   CIRC_OUT(O0000O00O0OO0O.O000000000O0O),
   ELASTIC_OUT(O0000O00O0OO0O.O000000000OO),
   EXPO_OUT(O0000O00O0OO0O.O000000000OO0O),
   BACK_OUT(O0000O00O0OO0O.O000000000OOOO),
   BOUNCE_OUT(O0000O00O0OO0O.O00000000O0);

   private final O0000O00O0OO00 O00000000;

   @Override
   public String toString() {
      String var1 = this.name().toLowerCase();
      String[] var2 = var1.split("_");
      StringBuilder var3 = new StringBuilder();

      for (String var7 : var2) {
         var3.append(Character.toUpperCase(var7.charAt(0))).append(var7.substring(1)).append(" ");
      }

      return var3.toString().trim();
   }

   @Generated
   public O0000O00O0OO00 O00000000() {
      return this.O00000000;
   }

   @Generated
   private O0000O00O0OO0(O0000O00O0OO00 o0000O00O0OO00) {
      this.O00000000 = o0000O00O0OO00;
   }
}
