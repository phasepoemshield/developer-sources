package ru.metaculture.protection;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;

public final class O0000O00O00O0 implements MinecraftAccessor {
   public static boolean O00000000() {
      return a_.player == null || a_.world == null;
   }

   public static boolean O00000000(double d, double e, double f) {
      BlockPos var6 = BlockPos.ofFloored(d, e, f);
      return a_.world.getBlockState(var6).isFullCube(a_.world, var6);
   }

   public static Block O00000000(BlockPos blockPos) {
      return a_.world.getBlockState(blockPos).getBlock();
   }

   public static float O00000000(float f) {
      double var1 = a_.player.getX() - a_.player.lastRenderX;
      double var3 = a_.player.getZ() - a_.player.lastRenderZ;
      float var5 = (float)(var1 * var1 + var3 * var3);
      float var6 = a_.player.lastBodyYaw;
      float var7 = var6;
      if (var5 > 0.0025000002F) {
         var7 = (float)MathHelper.atan2(var3, var1) * 180.0F / (float) Math.PI - 90.0F;
      }

      if (a_.player != null && a_.player.handSwingProgress > 0.0F) {
      }

      float var8 = MathHelper.wrapDegrees(f - (var6 + MathHelper.wrapDegrees(var7 - var6) * 0.3F));
      var8 = MathHelper.clamp(var8, -50.0F, 50.0F);
      var6 = f - var8;
      if (var8 * var8 > 2500.0F) {
         var6 += var8 * 0.2F;
      }

      return var6;
   }

   public static boolean O000000000() {
      Box var0 = a_.player.getBoundingBox();
      BlockPos var1 = a_.player.getBlockPos();
      return O000000000(var1).stream().anyMatch(blockPos -> O00000000(var0, blockPos));
   }

   private static boolean O00000000(Box box, BlockPos blockPos) {
      if (!a_.world.getBlockState(blockPos).isOf(Blocks.COBWEB)) {
         return false;
      } else {
         Box var2 = new Box(blockPos);
         return box.intersects(var2);
      }
   }

   private static List<BlockPos> O000000000(BlockPos blockPos) {
      ArrayList var1 = new ArrayList();

      for (int var2 = blockPos.getX() - 2; var2 <= blockPos.getX() + 2; var2++) {
         for (int var3 = blockPos.getY() - 1; var3 <= blockPos.getY() + 4; var3++) {
            for (int var4 = blockPos.getZ() - 2; var4 <= blockPos.getZ() + 2; var4++) {
               var1.add(new BlockPos(var2, var3, var4));
            }
         }
      }

      return var1;
   }

   public static List<BlockPos> O00000000(BlockPos blockPos, float f, float g) {
      ArrayList var3 = new ArrayList();
      int var4 = blockPos.getX();
      int var5 = blockPos.getY();
      int var6 = blockPos.getZ();

      for (int var7 = var4 - (int)f; var7 <= var4 + (int)f; var7++) {
         for (int var8 = var6 - (int)f; var8 <= var6 + (int)f; var8++) {
            for (int var9 = var5; var9 <= var5 + (int)g; var9++) {
               var3.add(new BlockPos(var7, var9, var8));
            }
         }
      }

      return var3;
   }

   public static boolean O00000000(Block block, BlockPos blockPos, float f, float g) {
      return O00000000(blockPos, f, g).stream().map(blockPosx -> a_.world.getBlockState(blockPosx).getBlock()).anyMatch(block2 -> block2.equals(block));
   }

   public static boolean O00000000(String string) {
      if (string == null || string.isEmpty()) {
         return false;
      } else if (!O00000000() && a_.getNetworkHandler() != null) {
         String var1 = null;
         if (a_.getCurrentServerEntry() != null) {
            var1 = a_.getCurrentServerEntry().address;
         }

         if ((var1 == null || var1.isEmpty()) && a_.getNetworkHandler().getConnection() != null) {
            SocketAddress var2 = a_.getNetworkHandler().getConnection().getAddress();
            if (var2 != null) {
               var1 = var2.toString();
               if (var1.startsWith("/")) {
                  var1 = var1.substring(1);
               }
            }
         }

         if (a_.isConnectedToLocalServer()) {
            var1 = "localhost";
         }

         return var1 != null && !var1.isEmpty() ? var1.toLowerCase().contains(string.toLowerCase()) : false;
      } else {
         return false;
      }
   }

   @Generated
   private O0000O00O00O0() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
