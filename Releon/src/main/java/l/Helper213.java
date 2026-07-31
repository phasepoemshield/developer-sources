package l;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;

class Helper213 {
   private final BlockPos centerPos;
   private final long startTime;
   private final long duration = 2000L;
   private final int maxRadius = 15;

   public Helper213(HitEffect var1, BlockPos var2, long var3) {
      this.centerPos = var2;
      this.startTime = var3;
   }

   public boolean method1819() {
      return System.currentTimeMillis() - this.startTime > 2000L;
   }

   public void method1820() {
      if (Helper160.mc.world != null) {
         long var1 = System.currentTimeMillis() - this.startTime;
         float var3 = (float)var1 / 2000.0F;
         float var4 = var3 * 15.0F;
         float var5 = 3.0F;
         float var6 = 1.0F - var3;
         var6 = (float)Math.pow(var6, 0.5);
         int var7 = 0;
         short var8 = 350;

         for (int var9 = -15; var9 <= 15; var9++) {
            for (int var10 = -15; var10 <= 15; var10++) {
               if (var7 >= var8) {
                  return;
               }

               double var11 = Math.sqrt(var9 * var9 + var10 * var10);
               if (!(var11 < var4 - var5) && !(var11 > var4 + 0.5)) {
                  BlockPos var13 = this.centerPos.add(var9, 0, var10);
                  BlockPos var14 = this.method1821(var13);
                  if (var14 != null) {
                     BlockState var15 = Helper160.mc.world.getBlockState(var14);
                     if (!var15.isAir()) {
                        VoxelShape var16 = var15.getOutlineShape(Helper160.mc.world, var14);
                        if (!var16.isEmpty()) {
                           var7++;
                           float var17 = 1.0F - (float)Math.abs(var11 - var4) / var5;
                           var17 = Math.max(0.0F, Math.min(1.0F, var17));
                           var17 *= var6;
                           if (var17 > 0.02F) {
                              int var18 = Helper133.method1162();
                              int var19 = Helper133.method1120(var18, (int)(var17 * 255.0F));
                              float var20 = (float)(Math.sin(var11 * 0.35 - var3 * Math.PI * 2.8) * 0.7 + 0.7);
                              var20 *= var6;
                              int var21 = Math.max(0, (int)(var20 * 3.0F));
                              float var22 = 2.2F + (1.0F - var17) * 2.5F;

                              try {
                                 Helper183.method1544(var14.up(var21), var16, var19, var22, true, true);
                              } catch (Exception var24) {
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private BlockPos method1821(BlockPos var1) {
      if (!Helper160.mc.world.isInBuildLimit(var1)) {
         return null;
      } else {
         BlockState var2 = Helper160.mc.world.getBlockState(var1);
         if (!var2.isAir()) {
            return var1;
         } else {
            for (int var3 = 1; var3 <= 10; var3++) {
               BlockPos var4 = var1.down(var3);
               if (Helper160.mc.world.isInBuildLimit(var4)) {
                  BlockState var5 = Helper160.mc.world.getBlockState(var4);
                  if (!var5.isAir()) {
                     return var4;
                  }
               }

               BlockPos var7 = var1.up(var3);
               if (Helper160.mc.world.isInBuildLimit(var7)) {
                  BlockState var6 = Helper160.mc.world.getBlockState(var7);
                  if (!var6.isAir()) {
                     return var7;
                  }
               }
            }

            return null;
         }
      }
   }
}
