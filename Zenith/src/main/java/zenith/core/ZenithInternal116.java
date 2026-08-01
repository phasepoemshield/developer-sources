package zenith;

import net.minecraft.util.Identifier;

public class ZenithInternal116 {
   final Identifier l1lll1ll1II11IIIIIl1IIlII;

   public ZenithInternal116(String s) {
      this.l1lll1ll1II11IIIIIl1IIlII = ZenithClient.StringHolder_10(this.SetColorHandler_3(s));
   }

   public ZenithInternal116(Identifier Identifier) {
      this.l1lll1ll1II11IIIIIl1IIlII = Identifier.of(Identifier.getNamespace(), Identifier.getPath());
   }

   String SetColorHandler_3(String s) {
      if (Identifier.isPathValid(s)) {
         return s;
      } else {
         StringBuilder stringbuilder = new StringBuilder();

         for (char c0 : s.toLowerCase().toCharArray()) {
            if (Identifier.isPathCharacterValid(c0)) {
               stringbuilder.append(c0);
            }
         }

         return stringbuilder.toString();
      }
   }

   public Identifier ll1llII11IIlIl1I1l1I1l1l() {
      return this.l1lll1ll1II11IIIIIl1IIlII;
   }
}
