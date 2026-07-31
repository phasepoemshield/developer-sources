package ru.metaculture.protection;

import java.util.Comparator;
import java.util.stream.StreamSupport;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AutoCristal",
   O0000000000 = Category.Combat,
   O000000000 = "Автоматическая установка и взрыв кристаллов",
   O00000000000 = {O0000000OO0OOO.RISKY, O0000000OO0OOO.VIP}
)
public class AutoCristal extends Module {
   public final ModeSetting O000000000O = new ModeSetting("Режим", "Авто", "Авто", "Недоразвитый");
   public final NumberSetting O000000000O0 = new NumberSetting("Скорость", 50.0F, 0.0F, 1000.0F, 10.0F, false);
   public final NumberSetting O000000000O00 = new NumberSetting("Радиус поиска", 4.0F, 1.0F, 6.0F, 1.0F, false);
   public final O0000O00O0 O000000000O000 = new O0000O00O0();

   public AutoCristal() {
      this.O00000000(new Setting[]{this.O000000000O, this.O000000000O0, this.O000000000O00});
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (!O0000O00O0000O.O00000000()) {
         if (this.O000000000O000.O00000000((double)((int)this.O000000000O0.O0000000000()))) {
            int var2 = this.O00000000(Items.END_CRYSTAL);
            int var3 = this.O00000000(Items.OBSIDIAN);
            EndCrystalEntity var4 = this.O0000000000O0();
            if (var4 != null) {
               this.O00000000(var4.getPos());
               O0000000000.interactionManager.attackEntity(O0000000000.player, var4);
               O0000000000.player.swingHand(Hand.MAIN_HAND);
               this.O000000000O000.O00000000();
            } else if (var2 != -1) {
               BlockPos var5 = this.O0000000000O00();
               if (var5 != null) {
                  this.O00000000(var5.toCenterPos().add(0.0, 0.5, 0.0));
                  this.O00000000(var5, var2, Direction.UP);
                  this.O000000000O000.O00000000();
               } else {
                  if (this.O000000000O.O000000000("Авто") && var3 != -1) {
                     BlockPos var6 = this.O0000000000O0O();
                     if (var6 != null) {
                        this.O00000000(var6.toCenterPos());
                        this.O00000000(var6.down(), var3, Direction.UP);
                        this.O000000000O000.O00000000();
                     }
                  }
               }
            }
         }
      }
   }

   private void O00000000(BlockPos blockPos, int i, Direction direction) {
      this.O00000000(i);
      Vec3d var4 = blockPos.toCenterPos().add(direction.getOffsetX() * 0.5, direction.getOffsetY() * 0.5, direction.getOffsetZ() * 0.5);
      BlockHitResult var5 = new BlockHitResult(var4, direction, blockPos, false);
      O0000000000.interactionManager.interactBlock(O0000000000.player, Hand.MAIN_HAND, var5);
      O0000000000.player.swingHand(Hand.MAIN_HAND);
   }

   private EndCrystalEntity O0000000000O0() {
      double var1 = this.O000000000O00.O0000000000();
      return StreamSupport.<Entity>stream(O0000000000.world.getEntities().spliterator(), false)
         .filter(entity -> entity instanceof EndCrystalEntity)
         .map(entity -> (EndCrystalEntity)entity)
         .filter(endCrystalEntity -> O0000000000.player.distanceTo(endCrystalEntity) <= var1)
         .min(Comparator.comparingDouble(endCrystalEntity -> O0000000000.player.distanceTo(endCrystalEntity)))
         .orElse(null);
   }

   private BlockPos O0000000000O00() {
      double var1 = this.O000000000O00.O0000000000();
      BlockPos var3 = O0000000000.player.getBlockPos();
      int var4 = (int)var1;

      for (int var5 = -var4; var5 <= var4; var5++) {
         for (int var6 = -var4; var6 <= var4; var6++) {
            for (int var7 = -var4; var7 <= var4; var7++) {
               BlockPos var8 = var3.add(var5, var6, var7);
               if (!(O0000000000.player.squaredDistanceTo(var8.toCenterPos()) > var1 * var1)
                  && (O0000000000.world.getBlockState(var8).isOf(Blocks.OBSIDIAN) || O0000000000.world.getBlockState(var8).isOf(Blocks.BEDROCK))
                  && O0000000000.world.isAir(var8.up())
                  && O0000000000.world.getOtherEntities(null, new Box(var8.up())).isEmpty()) {
                  return var8;
               }
            }
         }
      }

      return null;
   }

   private BlockPos O0000000000O0O() {
      double var1 = this.O000000000O00.O0000000000();
      BlockPos var3 = O0000000000.player.getBlockPos();
      int var4 = (int)var1;

      for (int var5 = -var4; var5 <= var4; var5++) {
         for (int var6 = -var4; var6 <= var4; var6++) {
            for (int var7 = -var4; var7 <= var4; var7++) {
               BlockPos var8 = var3.add(var5, var6, var7);
               if (!(O0000000000.player.squaredDistanceTo(var8.toCenterPos()) > var1 * var1)
                  && O0000000000.world.isAir(var8)
                  && O0000000000.world.getBlockState(var8.down()).isSolidBlock(O0000000000.world, var8.down())
                  && O0000000000.world.isAir(var8.up())
                  && O0000000000.world.getOtherEntities(null, new Box(var8)).isEmpty()
                  && O0000000000.world.getOtherEntities(null, new Box(var8.up())).isEmpty()) {
                  return var8;
               }
            }
         }
      }

      return null;
   }

   private int O00000000(Item item) {
      for (int var2 = 0; var2 < 9; var2++) {
         if (O0000000000.player.getInventory().getStack(var2).isOf(item)) {
            return var2;
         }
      }

      return -1;
   }

   private void O00000000(int i) {
      if (i != O0000000000.player.getInventory().getSelectedSlot() && i >= 0 && i < 9) {
         O0000000000.player.getInventory().setSelectedSlot(i);
         O0000000000.getNetworkHandler().sendPacket(new UpdateSelectedSlotC2SPacket(i));
      }
   }

   private void O00000000(Vec3d vec3d) {
      Vec3d var2 = vec3d.subtract(O0000000000.player.getEyePos());
      float var3 = (float)Math.toDegrees(Math.atan2(-var2.x, var2.z));
      float var4 = (float)(-Math.toDegrees(Math.atan2(var2.y, Math.hypot(var2.x, var2.z))));
      O000000O0O0O0.O00000000(new O000000O0O00OO(var3, var4), 180.0F, 180.0F, 180.0F, 180.0F, 1, 10, false);
   }

   @Override
   public void O000000000() {
      O000000O0O0O0.O00000000 = O000000O0O0O0.W36.IDLE;
      O000000O0O0O0.O0000000000000 = 0;
      O000000O0O0O0.O00000000000O0 = null;
      O000000O0O00O.O00000000 = false;
      super.O000000000();
   }
}
