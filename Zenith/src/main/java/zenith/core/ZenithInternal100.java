package zenith;

import java.util.Arrays;
import java.util.Optional;

public enum ZenithInternal100 {
   lIIlII1IlII1IIl,
   I1III1llIIlII11,
   ll1I1l1ll111111lllI1lI,
   I1IIl1l1I,
   I11IlIIlI11l111lIIlIl1lIl,
   lIlIlI1l11lI1ll1lIll1I,
   Il11l1Il11,
   lllI1l1111l1IlIIl1I1lI,
   lIllIl11I1l1IlIllI1l1l11Il,
   l11I1lIll1III;

   public static Optional<ZenithInternal100> ZenithInternal039(String s) {
      if (s != null && !s.isBlank()) {
         String s1 = s.trim().toUpperCase();
         return Arrays.stream(values()).filter(li1ii1ll1iili1l1lil1 -> li1ii1ll1iili1l1lil1.name().equals(s1)).findFirst();
      } else {
         return Optional.empty();
      }
   }
}
