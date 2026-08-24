package org.zenith.module;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;

import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;

public class BaseFinder_Var160 {
   public final BlockPos blockPos28;
   public final Block block3;

   public BaseFinder_Var160(BlockPos var1, Block var2) {
      this.blockPos28 = var1;
      this.block3 = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof BaseFinder_Var160 lii1lli1ill1lllilll11ll11i1l_Var160)
            ? false
            : this.blockPos28.equals(lii1lli1ill1lllilll11ll11i1l_Var160.blockPos28)
               && this.block3.equals(lii1lli1ill1lllilll11ll11i1l_Var160.block3);
      }
   }

   @Override
   public int hashCode() {
      return this.blockPos28.hashCode() * 31 + this.block3.hashCode();
   }
}
