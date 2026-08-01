package ru.metaculture.protection;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.LanternBlock;
import net.minecraft.block.LightningRodBlock;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "Spider",
   O0000000000 = Category.Movement,
   O000000000 = "Позволяет лазить по стенам",
   O00000000000 = {O0000000OO0OOO.RISKY, O0000000OO0OOO.MATRIX}
)
public class Spider extends Module {
   public final ModeSetting O000000000O = new ModeSetting("Режим", "FunTime", "FunTime");
   private final O0000O00O0000 O000000000O0 = new O0000O00O0000();
   private final O0000O00O0000 O000000000O00 = new O0000O00O0000();
   private final O0000O00O0000 O000000000O000 = new O0000O00O0000();
   private final O0000O00O0000 O000000000O00O = new O0000O00O0000();
   private final O0000O00O0000 O000000000O0O = new O0000O00O0000();
   private boolean O000000000O0O0 = true;

   public Spider() {
      this.O00000000(new Setting[]{this.O000000000O});
   }

   @Override
   public void O000000000() {
      O000000O0O0O0.O00000000 = O000000O0O0O0.W36.IDLE;
      O000000O0O0O0.O0000000000000 = 0;
      O000000O0O0O0.O00000000000O0 = null;
      O000000O0O00O.O00000000 = false;
      if (this.O000000000O.O000000000("SpookyTime") && O0000000000.options != null) {
         O0000000000.options.sneakKey.setPressed(false);
      }

      super.O000000000();
   }

   @EventHandler
   public void O00000000(O0000000OO o0000000OO) {
      if (!O0000O00O0000O.O00000000()) {
         boolean var2 = O0000000000.player.horizontalCollision;
         boolean var3 = var2 && O0000000000.options.jumpKey.isPressed();
         if (this.O000000000O.O000000000("FunTime") || this.O000000000O.O000000000("FunTimeNew")) {
            this.O00000000(o0000000OO, var3);
         }

         if (this.O000000000O.O000000000("FunTimeNew") && var2) {
            this.O0000000000O00();
         }

         if (this.O000000000O.O000000000("FunTime v2") && var3) {
            this.O0000000000(o0000000OO);
         }

         if (this.O000000000O.O000000000("FunTime v3") && var2) {
            this.O000000000(o0000000OO);
         }
      }
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (this.O000000000O.O000000000("SpookyTime")) {
         this.O0000000000O0();
      }
   }

   private void O000000000(O0000000OO o0000000OO) {
      int var2 = this.O00000000(Items.SPRUCE_BUTTON);
      if (var2 != -1) {
         if (O0000000000.player.isOnGround()) {
            if (this.O000000000O00O.O000000000000(100L)) {
               O0000000000.player.jump();
               this.O000000000O00O.O00000000();
            }
         } else {
            if (O0000000000.player.fallDistance > 0.0 && O0000000000.player.fallDistance < 1.5) {
               o0000000OO.O00000000(true);
               O0000000000.player.setOnGround(true);
               O0000000000.player.verticalCollision = true;
               this.O00000000(var2);
               O0000000000.player.jump();
               O0000000000.player.fallDistance = 0.0;
            }
         }
      }
   }

   private void O00000000(int i) {
      float var2 = Direction.getHorizontalDegreesOrThrow(O0000000000.player.getHorizontalFacing());
      float var3 = 79.0F;
      O000000O0O00OO var4 = new O000000O0O00OO(var2, var3);
      O000000O0O0O0.O00000000(var4, 360.0F, 360.0F, 10, 1);
      Vec3d var5 = O0000000000.player.getCameraPosVec(1.0F);
      Vec3d var6 = this.O00000000(var3, var2);
      Vec3d var7 = var5.add(var6.x * 4.0, var6.y * 4.0, var6.z * 4.0);
      BlockHitResult var8 = O0000000000.world.raycast(new RaycastContext(var5, var7, ShapeType.OUTLINE, FluidHandling.NONE, O0000000000.player));
      if (var8 != null && var8.getType() == Type.BLOCK) {
         this.O00000000(var8, i);
      }
   }

   private void O0000000000O0() {
      if (O0000000000.player != null && O0000000000.world != null) {
         if (!O0000000000.player.horizontalCollision) {
            if (O0000000000.options.sneakKey.isPressed()) {
               O0000000000.options.sneakKey.setPressed(false);
            }
         } else {
            int var1 = this.O00000000(Items.WATER_BUCKET);
            int var2 = this.O00000000(Items.BUCKET);
            if (var1 != -1 || var2 != -1) {
               if (O0000000000.player.isOnGround()) {
                  O0000000000.player.jump();
               } else {
                  O000000O0O00OO var3 = new O000000O0O00OO(O0000000000.player.getYaw(), 78.0F);
                  O000000O0O0O0.O00000000(var3, 20.0F, 100.0F, 4, 1);
                  if (this.O000000000O0O0) {
                     this.O000000000(var1);
                     double var4 = 2.0 + Math.random() * 2.0;
                     Vec3d var6 = O0000000000.player.getVelocity();
                     O0000000000.player.setVelocity(var6.x, var4, var6.z);
                     this.O000000000O0O0 = false;
                     this.O000000000O0O.O00000000();
                  }

                  if (this.O000000000O0O.O000000000000(200L)) {
                     if (O0000000000.player.isTouchingWater()) {
                        O0000000000.player.jump();
                        if (var2 != -1) {
                           this.O000000000(var2);
                        }
                     } else if (var1 != -1) {
                        this.O000000000(var1);
                     }

                     this.O000000000O0O.O00000000();
                  }

                  O0000000000.options.sneakKey.setPressed(true);
               }
            }
         }
      }
   }

   private void O000000000(int i) {
      int var2 = O0000000000.player.getInventory().getSelectedSlot();
      if (i != var2) {
         O0000000000.player.getInventory().setSelectedSlot(i);
         O0000000000.getNetworkHandler().sendPacket(new UpdateSelectedSlotC2SPacket(i));
      }

      O0000000000.interactionManager.interactItem(O0000000000.player, Hand.MAIN_HAND);
      O0000000000.player.swingHand(Hand.MAIN_HAND);
      if (i != var2) {
         O0000000000.player.getInventory().setSelectedSlot(var2);
         O0000000000.getNetworkHandler().sendPacket(new UpdateSelectedSlotC2SPacket(var2));
      }
   }

   private void O00000000(O0000000OO o0000000OO, boolean bl) {
      BlockPos var3 = BlockPos.ofFloored(O0000000000.player.getPos());
      BlockPos var4 = var3.offset(O0000000000.player.getHorizontalFacing());
      if (bl && (this.O00000000(var4) || this.O00000000(var3))) {
         o0000000OO.O00000000(true);
         O0000000000.player.setOnGround(true);
         O0000000000.player.jump();
         O0000000000.player.fallDistance = 0.0;
         this.O000000000O0.O00000000();
      }
   }

   private boolean O00000000(BlockPos blockPos) {
      BlockState var2 = O0000000000.world.getBlockState(blockPos);
      Block var3 = var2.getBlock();
      boolean var4 = var3 instanceof TrapdoorBlock && Boolean.TRUE.equals(var2.get(Properties.OPEN)) && var2.contains(Properties.HORIZONTAL_FACING);
      return var3 instanceof FenceBlock
         || var2.isIn(BlockTags.WALLS)
         || var3 instanceof FenceGateBlock
         || var3 instanceof LanternBlock
         || var3 instanceof LightningRodBlock
         || var4;
   }

   private void O0000000000O00() {
      int var1 = this.O00000000(Items.LIGHTNING_ROD);
      if (var1 != -1) {
         O000000O0O00OO var2 = new O000000O0O00OO(O0000000000.player.getYaw(), 58.1F);
         O000000O0O0O0.O00000000(var2, 80.0F, 80.0F, 10, 1);
         if (Math.abs(O0000000000.player.getPitch() - 57.1F) < 2.0F && O0000000000.crosshairTarget instanceof BlockHitResult var3) {
            BlockPos var5 = var3.getBlockPos();
            if (var3.getSide() == Direction.UP
               && !O0000000000.world.getBlockState(var5).isReplaceable()
               && O0000000000.world.getBlockState(var5.up()).isReplaceable()
               && this.O000000000O00.O000000000000(50L)) {
               this.O00000000(var3, var1);
               this.O000000000O00.O00000000();
            }
         }
      }
   }

   private void O0000000000(O0000000OO o0000000OO) {
      if (this.O000000000O000.O000000000000(400L)) {
         o0000000OO.O00000000(true);
         O0000000000.player.setOnGround(true);
         O0000000000.player.verticalCollision = true;
         O0000000000.player.horizontalCollision = true;
         O0000000000.player.jump();
         this.O000000000O000.O00000000();
         int var2 = this.O00000000(Items.COOKIE);
         if (var2 != -1 && O0000000000.player.fallDistance > 0.0 && O0000000000.player.fallDistance < 1.5) {
            this.O0000000000(var2);
         }
      }
   }

   private void O0000000000(int i) {
      float var2 = Direction.getHorizontalDegreesOrThrow(O0000000000.player.getHorizontalFacing());
      float var3 = 80.0F;
      O000000O0O00OO var4 = new O000000O0O00OO(var2, var3);
      O000000O0O0O0.O00000000(var4, 100.0F, 100.0F, 10, 1);
      Vec3d var5 = O0000000000.player.getCameraPosVec(1.0F);
      Vec3d var6 = this.O00000000(var3, var2);
      Vec3d var7 = var5.add(var6.x * 4.0, var6.y * 4.0, var6.z * 4.0);
      BlockHitResult var8 = O0000000000.world.raycast(new RaycastContext(var5, var7, ShapeType.OUTLINE, FluidHandling.NONE, O0000000000.player));
      if (var8 != null && var8.getType() == Type.BLOCK) {
         this.O00000000(var8, i);
         O0000000000.player.fallDistance = 0.0;
      }
   }

   private void O00000000(BlockHitResult blockHitResult, int i) {
      int var3 = O0000000000.player.getInventory().getSelectedSlot();
      O0000000000.player.getInventory().setSelectedSlot(i);
      O0000000000.interactionManager.interactBlock(O0000000000.player, Hand.MAIN_HAND, blockHitResult);
      O0000000000.player.swingHand(Hand.MAIN_HAND);
      O0000000000.player.getInventory().setSelectedSlot(var3);
   }

   private int O00000000(Item item) {
      for (int var2 = 0; var2 < 9; var2++) {
         ItemStack var3 = O0000000000.player.getInventory().getStack(var2);
         if (!var3.isEmpty() && var3.getItem() == item) {
            return var2;
         }
      }

      return -1;
   }

   private Vec3d O00000000(float f, float g) {
      float var3 = f * (float) (Math.PI / 180.0);
      float var4 = -g * (float) (Math.PI / 180.0);
      float var5 = MathHelper.cos(var4);
      float var6 = MathHelper.sin(var4);
      float var7 = MathHelper.cos(var3);
      float var8 = MathHelper.sin(var3);
      return new Vec3d(var6 * var7, -var8, var5 * var7);
   }
}
