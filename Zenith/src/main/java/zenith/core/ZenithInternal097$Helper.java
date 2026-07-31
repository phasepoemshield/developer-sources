package zenith;

public enum ZenithInternal097$Helper {
   lI1llIIl1llIIl,
   III11IIl1l1l1lI,
   IIIll1l11I,
   l1IlIII1IlI1I1ll1lII11llIlll,
   lI1111lI1IlI1lIllIl1Illl;

   public boolean EventBus(char c0) {
      return switch (this) {
         case lI1llIIl1llIIl -> true;
         case III11IIl1l1l1lI -> Character.isLetter(c0) && c0 <= 127 && Character.isAlphabetic(c0);
         case IIIll1l11I -> Character.isLetterOrDigit(c0) && c0 <= 127;
         case l1IlIII1IlI1I1ll1lII11llIlll -> String.valueOf(c0).matches("[А-Яа-яЁё]");
         case lI1111lI1IlI1lIllIl1Illl -> Character.isDigit(c0);
      };
   }
}
