package l;

import net.minecraft.block.BarrelBlock;
import net.minecraft.block.BlastFurnaceBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.DropperBlock;
import net.minecraft.block.EnderChestBlock;
import net.minecraft.block.FurnaceBlock;
import net.minecraft.block.HopperBlock;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.block.SmokerBlock;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.glfw.GLFW;

public class OpenWalls extends Helper242 {
   private final Setting2 traceRange = new Setting2("Trace Range", "Distance for searching blocks in look direction").method2086(10.0F).method2079(1, 20);
   private final Setting2 nearestRange = new Setting2("Nearest Range", "Fallback radius for nearest interact block").method2086(5.0F).method2079(1, 12);
   private final Setting3 keepGuiOpen = new Setting3("Keep GUI Open", "Keep previous GUI open when opening containers").method2201(true);
   private final Setting8 blocksSetting = new Setting8("Blocks", "Blocks allowed for wall interaction")
      .method2585("Chest", "Trapped Chest", "Barrel", "Ender Chest", "Shulker", "Hopper", "Furnace", "Blast Furnace", "Smoker", "Dispenser", "Dropper")
      .method2586("Chest", "Trapped Chest", "Barrel", "Ender Chest", "Shulker", "Hopper", "Furnace", "Blast Furnace", "Smoker", "Dispenser", "Dropper");
   private boolean wasRightClickPressed;

   public OpenWalls() {
      super("OpenWalls", "Open Walls", Helper269.MISC);
      this.setup(new Helper264[]{this.traceRange, this.nearestRange, this.keepGuiOpen, this.blocksSetting});
   }

   @Override
   public void activate() {
      this.wasRightClickPressed = false;
   }

   @Override
   public void deactivate() {
      this.wasRightClickPressed = false;
      Helper284.method2781().method2787();
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (mc.player != null && mc.world != null && mc.interactionManager != null) {
         if (!this.keepGuiOpen.method2200() && mc.currentScreen != null) {
            this.wasRightClickPressed = false;
         } else {
            boolean var2 = GLFW.glfwGetMouseButton(mc.getWindow().getHandle(), 1) == 1;
            if (var2 && !this.wasRightClickPressed) {
               this.method3633();
            }

            this.wasRightClickPressed = var2;
         }
      }
   }

   private void method3633() {
      BlockPos var1 = this.method3634();
      if (var1 != null) {
         this.method3637(var1);
      }
   }

   private BlockPos method3634() {
      Vec3d var1 = mc.player.getEyePos();
      Vec3d var2 = mc.player.getRotationVec(1.0F).normalize();

      for (double var3 = 1.0; var3 <= this.traceRange.method2082(); var3 += 0.5) {
         BlockPos var5 = BlockPos.ofFloored(var1.add(var2.multiply(var3)));
         if (this.method3636(var5)) {
            return var5;
         }
      }

      return this.method3635();
   }

   private BlockPos method3635() {
      BlockPos var1 = mc.player.getBlockPos();
      BlockPos var2 = null;
      double var3 = Double.MAX_VALUE;
      int var5 = this.nearestRange.method2080();
      int var6 = Math.min(3, var5);

      for (int var7 = -var5; var7 <= var5; var7++) {
         for (int var8 = -var6; var8 <= var6; var8++) {
            for (int var9 = -var5; var9 <= var5; var9++) {
               BlockPos var10 = var1.add(var7, var8, var9);
               if (this.method3636(var10)) {
                  double var11 = mc.player.getEyePos().squaredDistanceTo(var10.toCenterPos());
                  if (var11 < var3) {
                     var3 = var11;
                     var2 = var10;
                  }
               }
            }
         }
      }

      return var2;
   }

   private boolean method3636(BlockPos var1) {
      BlockState var2 = mc.world.getBlockState(var1);
      Block var3 = var2.getBlock();
      return this.blocksSetting.method2588("Trapped Chest") && var3 == Blocks.TRAPPED_CHEST
         ? true
         : this.blocksSetting.method2588("Chest") && var3 instanceof ChestBlock && var3 != Blocks.TRAPPED_CHEST
            || this.blocksSetting.method2588("Barrel") && var3 instanceof BarrelBlock
            || this.blocksSetting.method2588("Ender Chest") && var3 instanceof EnderChestBlock
            || this.blocksSetting.method2588("Shulker") && var3 instanceof ShulkerBoxBlock
            || this.blocksSetting.method2588("Hopper") && var3 instanceof HopperBlock
            || this.blocksSetting.method2588("Furnace") && var3 instanceof FurnaceBlock
            || this.blocksSetting.method2588("Blast Furnace") && var3 instanceof BlastFurnaceBlock
            || this.blocksSetting.method2588("Smoker") && var3 instanceof SmokerBlock
            || this.blocksSetting.method2588("Dispenser") && var3 instanceof DispenserBlock
            || this.blocksSetting.method2588("Dropper") && var3 instanceof DropperBlock;
   }

   private void method3637(BlockPos var1) {
      Vec3d var2 = mc.player.getEyePos();
      Vec3d var3 = var1.toCenterPos();
      Direction var4 = Direction.getFacing(var2.x - var3.x, var2.y - var3.y, var2.z - var3.z);
      Vec3d var5 = var3.add(var4.getOffsetX() * 0.5, var4.getOffsetY() * 0.5, var4.getOffsetZ() * 0.5);
      BlockHitResult var6 = new BlockHitResult(var5, var4, var1, false);
      if (this.keepGuiOpen.method2200() && mc.currentScreen != null && !Helper284.method2781().method2788()) {
         Helper284.method2781().method2782(mc.currentScreen);
      }

      ActionResult var7 = mc.interactionManager.interactBlock(mc.player, Hand.MAIN_HAND, var6);
      if (!var7.isAccepted()) {
         Helper38.method520(var1x -> new PlayerInteractBlockC2SPacket(Hand.MAIN_HAND, var6, var1x));
      }
   }
}
