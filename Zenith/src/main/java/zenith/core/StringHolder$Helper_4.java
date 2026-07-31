package zenith;

import java.util.function.Supplier;
import net.minecraft.util.Identifier;

public enum StringHolder$Helper_4 {
   III1ll1llI("particle.texture.snowflake", "particles/snowflake.png"),
   l1IlIll1lllIIl1IllII("particle.texture.star", "particles/star.png"),
   Il1llI1lIl11l1III("particle.texture.heart", "particles/heart.png"),
   III11II1I1II11lIlI1lIl111I1IIl("particle.texture.firefly", "particles/firefly.png"),
   lll1IllI1Il1lI1IIIIl1("particle.texture.spaceGlow", "particles/space_glow.png"),
   l1ll111lIlII("particle.texture.spaceStar", "particles/space_star.png");

   private final String lll1IlI1lllIl1I111l1l1IIII;
   private final Supplier<Identifier> llII1IlI1lIII111lIl11ll;

   private StringHolder$Helper_4(String s1, String s2) {
      this.lll1IlI1lllIl1I111l1l1IIII = s1;
      this.llII1IlI1lIII111lIl11ll = () -> ZenithClient.StringHolder_10(s2);
   }

   public String I11ll1llII11Il11I1I() {
      return this.lll1IlI1lllIl1I111l1l1IIII;
   }

   public Supplier<Identifier> ll1IllI1lI1l() {
      return this.llII1IlI1lIII111lIl11ll;
   }
}
