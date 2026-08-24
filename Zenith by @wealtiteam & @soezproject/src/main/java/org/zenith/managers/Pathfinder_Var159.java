package org.zenith.managers;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.ClickFxController;

import net.minecraft.util.math.BlockPos;

final class Pathfinder_Var159 {
   public final BlockPos blockPos26;
   public final double double48;
   public Pathfinder_Var159 zClass073Var159;
   public double double49;
   public double double50;
   public boolean closed;

   public Pathfinder_Var159(BlockPos var1, Pathfinder_Var159 var2, double var3, double var5) {
      this.blockPos26 = var1;
      this.zClass073Var159 = var2;
      this.double49 = var3;
      this.double48 = var5;
      this.double50 = var3 + var5;
   }
}
