package org.zenith.module;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;

import net.minecraft.util.math.BlockPos;

final class BaseFinder_Var7 {
   public final int int192;
   public final int int193;
   public final int int194;
   public final int int195;
   public final int int196;
   public final int int197;

   public BaseFinder_Var7(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.int192 = var1;
      this.int193 = var2;
      this.int194 = var3;
      this.int195 = var4;
      this.int196 = var5;
      this.int197 = var6;
   }

   public boolean EmotePlayback(BlockPos var1) {
      return var1.getX() >= this.int192
         && var1.getX() <= this.int193
         && var1.getY() >= this.int194
         && var1.getY() <= this.int195
         && var1.getZ() >= this.int196
         && var1.getZ() <= this.int197;
   }

   public int float365() {
      return (this.int193 - this.int192 + 1)
         * (this.int195 - this.int194 + 1)
         * (this.int197 - this.int196 + 1);
   }
}
