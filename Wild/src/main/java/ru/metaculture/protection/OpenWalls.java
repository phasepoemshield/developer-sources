package ru.metaculture.protection;

import java.util.Optional;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.block.entity.BarrelBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.entity.DispenserBlockEntity;
import net.minecraft.block.entity.DropperBlockEntity;
import net.minecraft.block.entity.EnderChestBlockEntity;
import net.minecraft.block.entity.HopperBlockEntity;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.chunk.WorldChunk;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "OpenWalls",
   O0000000000 = Category.Player,
   O000000000 = "Открывает контейнеры через стены"
)
public class OpenWalls extends Module {
   private final NumberSetting O000000000O = new NumberSetting("Дистанция", 4.6F, 2.0F, 6.0F, 0.1F, false);
   private long O000000000O0;

   public OpenWalls() {
      this.O00000000(new Setting[]{this.O000000000O});
   }

   @EventHandler
   public void O00000000(O0000000O0O00 o0000000O0O00) {
      if (o0000000O0O00.O00000000000O0() && o0000000O0O00.O00000000000() == 1) {
         if (O0000000000.player != null && O0000000000.world != null && O0000000000.interactionManager != null && O0000000000.currentScreen == null) {
            if (System.currentTimeMillis() - this.O000000000O0 >= 120L) {
               BlockPos var2 = this.O0000000000O0();
               if (var2 != null) {
                  ActionResult var3 = this.O00000000(var2);
                  if (var3 != ActionResult.FAIL) {
                     this.O000000000O0 = System.currentTimeMillis();
                     o0000000O0O00.O000000000();
                  }
               }
            }
         }
      }
   }

   private BlockPos O0000000000O0() {
      Vec3d var1 = O0000000000.player.getEyePos();
      Vec3d var2 = O0000000000.player.getRotationVec(1.0F).normalize();
      Vec3d var3 = var1.add(var2.multiply(this.O000000000O.O0000000000()));
      ChunkPos var4 = O0000000000.player.getChunkPos();
      int var5 = Math.max(1, (int)Math.ceil(this.O000000000O.O0000000000() / 16.0F) + 1);
      BlockPos var6 = null;
      double var7 = Double.MAX_VALUE;

      for (int var9 = var4.x - var5; var9 <= var4.x + var5; var9++) {
         for (int var10 = var4.z - var5; var10 <= var4.z + var5; var10++) {
            WorldChunk var11 = O0000000000.world.getChunk(var9, var10);
            if (var11 != null) {
               for (BlockEntity var13 : var11.getBlockEntities().values()) {
                  if (this.O00000000(var13)) {
                     BlockPos var14 = var13.getPos();
                     if (!(O0000000000.player.squaredDistanceTo(Vec3d.ofCenter(var14)) > this.O000000000O.O0000000000() * this.O000000000O.O0000000000())) {
                        Optional var15 = new Box(var14).expand(0.01).raycast(var1, var3);
                        if (!var15.isEmpty()) {
                           double var16 = var1.squaredDistanceTo((Vec3d)var15.get());
                           if (var16 < var7) {
                              var7 = var16;
                              var6 = var14.toImmutable();
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return var6;
   }

   private ActionResult O00000000(BlockPos blockPos) {
      Direction var2 = this.O000000000(blockPos);
      Vec3d var3 = new Vec3d(
         blockPos.getX() + 0.5 + var2.getOffsetX() * 0.5, blockPos.getY() + 0.5 + var2.getOffsetY() * 0.5, blockPos.getZ() + 0.5 + var2.getOffsetZ() * 0.5
      );
      BlockHitResult var4 = new BlockHitResult(var3, var2, blockPos, false);
      ActionResult var5 = O0000000000.interactionManager.interactBlock(O0000000000.player, Hand.MAIN_HAND, var4);
      if (var5 != ActionResult.FAIL) {
         O0000000000.player.swingHand(Hand.MAIN_HAND);
      }

      return var5;
   }

   private Direction O000000000(BlockPos blockPos) {
      Vec3d var2 = Vec3d.ofCenter(blockPos);
      Vec3d var3 = O0000000000.player.getEyePos().subtract(var2);
      return Direction.getFacing(var3.x, var3.y, var3.z);
   }

   private boolean O00000000(BlockEntity blockEntity) {
      return blockEntity instanceof ChestBlockEntity
         || blockEntity instanceof BarrelBlockEntity
         || blockEntity instanceof EnderChestBlockEntity
         || blockEntity instanceof ShulkerBoxBlockEntity
         || blockEntity instanceof HopperBlockEntity
         || blockEntity instanceof DispenserBlockEntity
         || blockEntity instanceof DropperBlockEntity
         || blockEntity instanceof AbstractFurnaceBlockEntity;
   }
}
