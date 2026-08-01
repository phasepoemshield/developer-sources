package zenith;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.util.Identifier;

public class ZenithInternal063 {
   private static final Map<String, StringHolder$Helper_4> llI111IIIIlI1;

   public static String[] l111I111IlII1() {
      StringHolder$Helper_4[] ailiil1l1ill1$ii1il11l111ii11iil = StringHolder$Helper_4.values();
      String[] astring = new String[ailiil1l1ill1$ii1il11l111ii11iil.length];

      for (int i = 0; i < ailiil1l1ill1$ii1il11l111ii11iil.length; i++) {
         astring[i] = ailiil1l1ill1$ii1il11l111ii11iil[i].I11ll1llII11Il11I1I();
      }

      return astring;
   }

   public static Identifier ZenithInternal124(String s) {
      StringHolder$Helper_4 iliil1l1ill1$ii1il11l111ii11iil = llI111IIIIlI1.get(s);
      if (iliil1l1ill1$ii1il11l111ii11iil == null) {
         try {
            iliil1l1ill1$ii1il11l111ii11iil = StringHolder$Helper_4.valueOf(s.toUpperCase());
         } catch (IllegalArgumentException illegalargumentexception) {
         }
      }

      return iliil1l1ill1$ii1il11l111ii11iil != null ? iliil1l1ill1$ii1il11l111ii11iil.ll1IllI1lI1l().get() : null;
   }

   static {
      HashMap hashmap = new HashMap();
      hashmap.put("particle.texture.spaceGlow", StringHolder$Helper_4.lll1IllI1Il1lI1IIIIl1);
      hashmap.put("particle.texture.spaceStar", StringHolder$Helper_4.l1ll111lIlII);
      hashmap.put("particle.texture.star", StringHolder$Helper_4.l1IlIll1lllIIl1IllII);
      hashmap.put("particle.texture.firefly", StringHolder$Helper_4.III11II1I1II11lIlI1lIl111I1IIl);
      hashmap.put("particle.texture.snowflake", StringHolder$Helper_4.III1ll1llI);
      hashmap.put("particle.texture.heart", StringHolder$Helper_4.Il1llI1lIl11l1III);
      llI111IIIIlI1 = hashmap;
   }
}
