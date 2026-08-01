package l;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;

public class AncientXray extends Helper242 {
   private static final int ANCIENT_DEBRIS_COLOR = -3956104;
   private final Set<BlockPos> ores = ConcurrentHashMap.newKeySet();

   public AncientXray() {
      super("AncientXray", "AncientXray", Helper269.PLAYER);
   }

   @Override
   public void deactivate() {
      this.ores.clear();
   }

   @Helper104
   public void method2090(Event23 var1) {
      if (mc.player != null && mc.world != null) {
         BlockPos var2 = var1.method4133().toImmutable();
         if (var1.method4132().isOf(Blocks.ANCIENT_DEBRIS)) {
            this.ores.add(var2);
         } else {
            this.ores.remove(var2);
         }
      }
   }

   @Helper104
   public void onWorldRender(Event10 var1) {
      if (mc.player != null && mc.world != null) {
         this.ores.removeIf(var0 -> !mc.world.getBlockState(var0).isOf(Blocks.ANCIENT_DEBRIS));

         for (BlockPos var3 : this.ores) {
            if (this.method2091(var3) > 3) {
               Helper183.method1545(new Box(var3), -3956104, 2.0F);
            }
         }
      }
   }

   private int method2091(BlockPos var1) {
      int var2 = 0;

      for (int var3 = -1; var3 <= 1; var3++) {
         for (int var4 = -1; var4 <= 1; var4++) {
            for (int var5 = -1; var5 <= 1; var5++) {
               if (mc.world.getBlockState(var1.add(var3, var4, var5)).isAir()) {
                  var2++;
               }
            }
         }
      }

      return var2;
   }
}
