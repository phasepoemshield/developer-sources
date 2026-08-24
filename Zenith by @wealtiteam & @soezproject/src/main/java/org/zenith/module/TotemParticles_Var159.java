package org.zenith.module;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;


import net.minecraft.entity.Entity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;

class TotemParticles_Var159 {
   final Entity val188;
   final int val413;
   final int int170;
   int val310;

   TotemParticles_Var159(Entity var1, int var2, int var3) {
      this.val188 = var1;
      this.val413 = var2;
      this.int170 = var3;
      this.val310 = 0;
   }

   Vec3d WallBypass() {
      if (this.val188 != null && !this.val188.isRemoved()) {
         Box box = this.val188.getBoundingBox();
         return new Vec3d((box.minX + box.maxX) / 2.0, (box.minY + box.maxY) / 2.0, (box.minZ + box.maxZ) / 2.0);
      } else {
         return null;
      }
   }
}
