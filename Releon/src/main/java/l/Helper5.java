package l;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Pair;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.shape.VoxelShape;

public class Helper5 implements Helper94, Helper160 {
   private final Map<BlockPos, Pair<VoxelShape, Integer>> boxes = new HashMap<>();
   public final Map<EntityType<?>, Integer> entities = new HashMap<>();
   public final Map<Block, Integer> blocks = new HashMap<>();
   public boolean drawFill = true;

   public Helper5(Helper124 var1) {
      var1.method1016(this);
   }

   @Helper104
   public void onWorldRender(Event10 var1) {
      this.boxes.forEach((var1x, var2) -> {
         if (this.drawFill) {
            Helper183.method1542(var1x, var2.getLeft(), var2.getRight(), 1.0F);
         } else {
            Helper183.method1544(var1x, var2.getLeft(), var2.getRight(), 1.0F, false, false);
         }
      });
      Helper38.method536().filter(var1x -> this.entities.containsKey(var1x.getType()) && var1x != mc.player).forEach(var1x -> {
         int var2 = this.entities.get(var1x.getType());
         int var3 = var2 == 0 ? Helper133.method1162() : var2;
         Box var4 = var1x.getBoundingBox().offset(Helper147.method1247(var1x).subtract(var1x.getPos()));
         if (Helper148.method1256(var4)) {
            Helper183.method1545(var4, var3, 1.0F);
         }
      });
   }

   @Helper104
   public void method295(Event21 var1) {
      this.boxes.clear();
   }

   @Helper104
   public void method296(Event23 var1) {
      BlockPos var2 = var1.method4133();
      BlockState var3 = var1.method4132();
      Block var4 = var3.getBlock();
      switch (var1.method4134()) {
         case LOAD:
            if (this.blocks.containsKey(var4)) {
               this.method297(var2, var3, var4);
            }
            break;
         case UPDATE:
            if (this.blocks.containsKey(var4) && !this.boxes.containsKey(var2)) {
               this.method297(var2, var3, var4);
            }

            if (this.boxes.containsKey(var2) && (var3.isAir() || !this.boxes.get(var2).getLeft().equals(var3.getOutlineShape(mc.world, var2)))) {
               this.boxes.remove(var2);
            }
            break;
         case UNLOAD:
            this.boxes.remove(var2);
      }
   }

   private void method297(BlockPos var1, BlockState var2, Block var3) {
      VoxelShape var4 = var2.getOutlineShape(mc.world, var1);
      int var5 = this.blocks.get(var3);
      int var6 = var5 == 0 ? Helper133.method1107(var2.getMapColor(mc.world, var1).color, 1.0F) : var5;
      this.boxes.put(var1, new Pair<>(var4, var6));
   }
}
