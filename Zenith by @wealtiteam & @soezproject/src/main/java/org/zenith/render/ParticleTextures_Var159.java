package org.zenith.render;

import org.zenith.module.Particles;

import org.zenith.ZenithClient;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;


import java.util.function.Supplier;
import net.minecraft.util.Identifier;

public enum ParticleTextures_Var159 {
   call460("particle.texture.snowflake", "particles/snowflake.png"),
   call461("particle.texture.star", "particles/star.png"),
   call462("particle.texture.heart", "particles/heart.png"),
   call410("particle.texture.firefly", "particles/firefly.png"),
   call437("particle.texture.spaceGlow", "particles/space_glow.png"),
   call438("particle.texture.spaceStar", "particles/space_star.png");

   public final String string21;
   public final Supplier<Identifier> supplier;

   private ParticleTextures_Var159(String var3, String var4) {
      this.string21 = var3;
      this.supplier = () -> ZenithClient.on23(var4);
   }

   public String var11916() {
      return this.string21;
   }

   public Supplier<Identifier> boolean83() {
      return this.supplier;
   }
}
