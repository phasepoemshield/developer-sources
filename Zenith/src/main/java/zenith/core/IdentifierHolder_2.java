package zenith;

import net.minecraft.util.Identifier;

public class IdentifierHolder_2 {
   private final Identifier ll1II11lII11IIlII1l1I1II11;

   public IdentifierHolder_2(String s) {
      if (s.contains(":")) {
         this.ll1II11lII11IIlII1l1I1II11 = Identifier.of(s);
      } else if (s.contains("/")) {
         this.ll1II11lII11IIlII1l1I1II11 = ZenithClient.StringHolder_10(s);
      } else {
         this.ll1II11lII11IIlII1l1I1II11 = ZenithClient.StringHolder_10("icons/category/" + s);
      }
   }

   public Identifier II11IIlIl1ll11IIIIl1I1lIlI() {
      return this.ll1II11lII11IIlII1l1I1II11;
   }
}
