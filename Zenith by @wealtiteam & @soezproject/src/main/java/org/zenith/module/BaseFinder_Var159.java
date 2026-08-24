package org.zenith.module;

import org.zenith.core.BotFeatureRegistry;

import java.util.HashSet;
import java.util.Set;
import net.minecraft.util.math.BlockPos;

class BaseFinder_Var159 {
   protected final BaseFinder_Var7 baseFinderVar7;
   protected final Set<BlockPos> set9 = new HashSet<>();
   protected int x;
   protected int y;
   protected int z;
   protected boolean finished;

   public BaseFinder_Var159(BaseFinder_Var7 var1) {
      this.baseFinderVar7 = var1;
      this.x = var1.int192;
      this.y = var1.int194;
      this.z = var1.int196;
   }

   protected void advance() {
      if (!this.finished) {
         if (++this.z > this.baseFinderVar7.int197) {
            this.z = this.baseFinderVar7.int196;
            if (++this.y > this.baseFinderVar7.int195) {
               this.y = this.baseFinderVar7.int194;
               if (++this.x > this.baseFinderVar7.int193) {
                  this.finished = true;
               }
            }
         }
      }
   }
}
