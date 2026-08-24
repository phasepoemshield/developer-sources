package org.zenith.render;

import org.zenith.core.NpcCloneManager;
import org.zenith.core.ChatTagParser;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.util.Identifier;

public class ParticleTextures {
   public static final Map<String, ParticleTextures_Var159> map51;

   public ParticleTextures() {
   }

   public static String[] getZClass019() {
      ParticleTextures_Var159[] ai1liiil1l11ii1l1l11liiiil11ll_ii1il11l111ii11iil = ParticleTextures_Var159.values();
      String[] astring = new String[ai1liiil1l11ii1l1l11liiiil11ll_ii1il11l111ii11iil.length];

      for (int i = 0; i < ai1liiil1l11ii1l1l11liiiil11ll_ii1il11l111ii11iil.length; i++) {
         astring[i] = ai1liiil1l11ii1l1l11liiiil11ll_ii1il11l111ii11iil[i].var11916();
      }

      return astring;
   }

   public static Identifier ChatTagParser(String var0) {
      ParticleTextures_Var159 i1liiil1l11ii1l1l11liiiil11ll_ii1il11l111ii11iil = map51.get(var0);
      if (i1liiil1l11ii1l1l11liiiil11ll_ii1il11l111ii11iil == null) {
         try {
            i1liiil1l11ii1l1l11liiiil11ll_ii1il11l111ii11iil = ParticleTextures_Var159.valueOf(var0.toUpperCase());
         } catch (IllegalArgumentException illegalargumentexception) {
         }
      }

      return i1liiil1l11ii1l1l11liiiil11ll_ii1il11l111ii11iil != null ? i1liiil1l11ii1l1l11liiiil11ll_ii1il11l111ii11iil.boolean83().get() : null;
   }

   static {
      var hashmap = new HashMap();
      hashmap.put("particle.texture.spaceGlow", ParticleTextures_Var159.call437);
      hashmap.put("particle.texture.spaceStar", ParticleTextures_Var159.call438);
      hashmap.put("particle.texture.star", ParticleTextures_Var159.call461);
      hashmap.put("particle.texture.firefly", ParticleTextures_Var159.call410);
      hashmap.put("particle.texture.snowflake", ParticleTextures_Var159.call460);
      hashmap.put("particle.texture.heart", ParticleTextures_Var159.call462);
      map51 = hashmap;
   }
}
