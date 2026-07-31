package l;

import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;

public class AutoCrystal extends Helper242 {
   private final Helper159 script = new Helper159();
   private BlockPos obsPosition;
   private final Setting8 protections = new Setting8("Защита", "Что не взрывать")
      .method2585("Себя", "Друзей", "Ресурсы")
      .method2586("Себя", "Друзей", "Ресурсы");
   private final Setting2 itemRange = new Setting2("Дистанция до ресурсов", "Минимальное расстояние до ресурсов")
      .method2078(1.0F, 12.0F)
      .method2086(6.0F);

   public AutoCrystal() {
      super("AutoCrystal", "Auto Crystal", Helper269.COMBAT);
      this.setup(new Helper264[]{this.protections, this.itemRange});
   }

   @Override
   public void activate() {
      this.obsPosition = null;
      super.activate();
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      if (var1.method3895() instanceof PlayerInteractBlockC2SPacket var2
         && var2.getSequence() != 0
         && this.script.method1317()
         && Helper59.script.method1317()) {
         this.script
            .method1307(
               0,
               () -> {
                  BlockPos var2x = var2.getBlockHitResult().getBlockPos();
                  BlockPos var3 = var2x.offset(var2.getBlockHitResult().getSide());
                  BlockPos var4 = mc.world.getBlockState(var3).getBlock().equals(Blocks.OBSIDIAN)
                     ? var3
                     : (mc.world.getBlockState(var2x).getBlock().equals(Blocks.OBSIDIAN) ? var2x : null);
                  Slot var5 = Helper66.method705(Items.END_CRYSTAL);
                  if (var4 != null && var5 != null && this.method4406(var4)) {
                     Helper59.method657(
                        () -> {
                           this.obsPosition = var4;
                           Helper66.method690(var5, Hand.MAIN_HAND, false);
                           Helper38.method520(
                              var1xxx -> new PlayerInteractBlockC2SPacket(
                                 Hand.MAIN_HAND, new BlockHitResult(var4.toCenterPos(), Direction.UP, var4, false), var1xxx
                              )
                           );
                           Helper66.method691(var5, Hand.MAIN_HAND, false, true);
                           this.script.method1314().method1307(6, () -> this.obsPosition = null);
                        }
                     );
                  }
               }
            );
      }
   }

   @Helper104
   public void method4405(Helper389 var1) {
      if (var1.method3918() instanceof EndCrystalEntity var2 && this.obsPosition != null && this.obsPosition.equals(var2.getBlockPos().down())) {
         if (this.method4407(var2)) {
            mc.interactionManager.attackEntity(mc.player, var2);
         }

         this.obsPosition = null;
         this.script.method1314();
      }
   }

   @Helper104
   public void onTick(Event8 var1) {
      this.script.method1315();
   }

   private boolean method4406(BlockPos var1) {
      if (this.protections.method2588("Себя") && mc.player.getY() > var1.getY()) {
         return false;
      } else {
         if (this.protections.method2588("Друзей")) {
            for (PlayerEntity var3 : mc.world.getPlayers()) {
               if (var3 != mc.player && Helper309.method3075(var3) && var3.getY() > var1.getY()) {
                  return false;
               }
            }
         }

         if (this.protections.method2588("Ресурсы")) {
            Vec3d var9 = var1.up().toCenterPos();
            double var10 = this.itemRange.method2082();
            Box var5 = new Box(var9.x - var10, var9.y - var10, var9.z - var10, var9.x + var10, var9.y + var10, var9.z + var10);

            for (Entity var8 : mc.world.getOtherEntities(mc.player, var5)) {
               if (var8 instanceof ItemEntity) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   private boolean method4407(EndCrystalEntity var1) {
      BlockPos var2 = var1.getBlockPos().down();
      if (this.protections.method2588("Себя") && mc.player.getY() > var2.getY()) {
         return false;
      } else {
         if (this.protections.method2588("Друзей")) {
            for (PlayerEntity var4 : mc.world.getPlayers()) {
               if (var4 != mc.player && Helper309.method3075(var4) && var4.getY() > var2.getY()) {
                  return false;
               }
            }
         }

         if (this.protections.method2588("Ресурсы")) {
            Vec3d var10 = var1.getPos();
            double var11 = this.itemRange.method2082();
            Box var6 = new Box(var10.x - var11, var10.y - var11, var10.z - var11, var10.x + var11, var10.y + var11, var10.z + var11);

            for (Entity var9 : mc.world.getOtherEntities(mc.player, var6)) {
               if (var9 instanceof ItemEntity) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public Helper159 method4408() {
      return this.script;
   }

   public BlockPos method4409() {
      return this.obsPosition;
   }

   public Setting8 method4410() {
      return this.protections;
   }

   public Setting2 method4411() {
      return this.itemRange;
   }
}
