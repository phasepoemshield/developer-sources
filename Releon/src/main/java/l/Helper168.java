package l;

import it.unimi.dsi.fastutil.objects.Object2DoubleArrayMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleMap;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.LadderBlock;
import net.minecraft.block.PowderSnowBlock;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.BlockPos.Mutable;

public class Helper168 implements Helper160, Helper164 {
   public final PlayerEntity player;
   public final Helper167 input;
   public Vec3d pos;
   public Vec3d velocity;
   public Box boundingBox;
   public float yaw;
   public float pitch;
   public boolean sprinting;
   public float fallDistance;
   public int jumpingCooldown;
   public boolean isJumping;
   public boolean isFallFlying;
   public boolean onGround;
   public boolean horizontalCollision;
   public boolean verticalCollision;
   public boolean touchingWater;
   public boolean isSwimming;
   public boolean submergedInWater;
   private final Object2DoubleMap<TagKey<Fluid>> fluidHeight;
   private final HashSet<TagKey<Fluid>> submergedFluidTag;
   private int simulatedTicks = 0;
   private boolean clipLedged = false;
   private static final double STEP_HEIGHT = 0.5;

   public Helper168(
      PlayerEntity var1,
      Helper167 var2,
      Vec3d var3,
      Vec3d var4,
      Box var5,
      float var6,
      float var7,
      boolean var8,
      float var9,
      int var10,
      boolean var11,
      boolean var12,
      boolean var13,
      boolean var14,
      boolean var15,
      boolean var16,
      boolean var17,
      boolean var18,
      Object2DoubleMap<TagKey<Fluid>> var19,
      HashSet<TagKey<Fluid>> var20
   ) {
      this.player = var1;
      this.input = var2;
      this.pos = var3;
      this.velocity = var4;
      this.boundingBox = var5;
      this.yaw = var6;
      this.pitch = var7;
      this.sprinting = var8;
      this.fallDistance = var9;
      this.jumpingCooldown = var10;
      this.isJumping = var11;
      this.isFallFlying = var12;
      this.onGround = var13;
      this.horizontalCollision = var14;
      this.verticalCollision = var15;
      this.touchingWater = var16;
      this.isSwimming = var17;
      this.submergedInWater = var18;
      this.fluidHeight = var19;
      this.submergedFluidTag = var20;
   }

   public static Helper168 method1385(int var0) {
      Helper168 var1 = method1387(Helper167.method1383(mc.player.input.playerInput));

      for (int var2 = 0; var2 < var0; var2++) {
         var1.method1350();
      }

      return var1;
   }

   public static Helper168 method1386(PlayerEntity var0, int var1) {
      Helper168 var2 = method1388(var0, Helper167.method1384(var0));

      for (int var3 = 0; var3 < var1; var3++) {
         var2.method1350();
      }

      return var2;
   }

   public static Helper168 method1387(Helper167 var0) {
      ClientPlayerEntity var1 = mc.player;
      return new Helper168(
         var1,
         var0,
         var1.getPos(),
         var1.getVelocity(),
         var1.getBoundingBox(),
         var1.getYaw(),
         var1.getPitch(),
         var1.isSprinting(),
         var1.fallDistance,
         var1.jumpingCooldown,
         var1.jumping,
         var1.isGliding(),
         var1.isOnGround(),
         var1.horizontalCollision,
         var1.verticalCollision,
         var1.isTouchingWater(),
         var1.isSwimming(),
         var1.isSubmergedInWater(),
         new Object2DoubleArrayMap(var1.fluidHeight),
         new HashSet<>(var1.submergedFluidTag)
      );
   }

   public static Helper168 method1388(PlayerEntity var0, Helper167 var1) {
      return new Helper168(
         var0,
         var1,
         var0.getPos(),
         var0.getPos().subtract(new Vec3d(var0.prevX, var0.prevY, var0.prevZ)),
         var0.getBoundingBox(),
         var0.getYaw(),
         var0.getPitch(),
         var0.isSprinting(),
         var0.fallDistance,
         var0.jumpingCooldown,
         var0.jumping,
         var0.isGliding(),
         var0.isOnGround(),
         var0.horizontalCollision,
         var0.verticalCollision,
         var0.isTouchingWater(),
         var0.isSwimming(),
         var0.isSubmergedInWater(),
         new Object2DoubleArrayMap(var0.fluidHeight),
         new HashSet<>(var0.submergedFluidTag)
      );
   }

   @Override
   public Vec3d method1349() {
      return this.player.getPos();
   }

   @Override
   public void method1350() {
      this.simulatedTicks++;
      this.clipLedged = false;
      if (!(this.pos.y <= -70.0)) {
         this.input.method1382();
         this.method1416();
         this.method1418();
         this.method1417();
         if (this.jumpingCooldown > 0) {
            this.jumpingCooldown--;
         }

         this.isJumping = this.input.playerInput.jump();
         double var1 = this.velocity.x;
         double var3 = this.velocity.y;
         double var5 = this.velocity.z;
         if (Math.abs(this.velocity.x) < 0.003) {
            var1 = 0.0;
         }

         if (Math.abs(this.velocity.y) < 0.003) {
            var3 = 0.0;
         }

         if (Math.abs(this.velocity.z) < 0.003) {
            var5 = 0.0;
         }

         if (this.onGround) {
            this.isFallFlying = false;
         }

         this.velocity = new Vec3d(var1, var3, var5);
         if (this.isJumping) {
            double var7 = this.method1415() ? this.method1421(FluidTags.LAVA) : this.method1421(FluidTags.WATER);
            boolean var9 = this.method1414() && var7 > 0.0;
            double var10 = this.method1413();
            if (!var9 || this.onGround && !(var7 > var10)) {
               if (!this.method1415() || this.onGround && !(var7 > var10)) {
                  if ((this.onGround || var9 && var7 <= var10) && this.jumpingCooldown == 0) {
                     this.method1398();
                     if (this.player.equals(mc.player) && (!NoDelay.method2451().isState() || !NoDelay.method2451().ignoreSetting.method2588("Jump"))) {
                        this.jumpingCooldown = 10;
                     }
                  }
               } else {
                  this.method1411(FluidTags.LAVA);
               }
            } else {
               this.method1411(FluidTags.WATER);
            }
         }

         float var12 = this.input.movementSideways * 0.98F;
         float var8 = this.input.movementForward * 0.98F;
         float var13 = 0.0F;
         if (this.method1426(StatusEffects.SLOW_FALLING) || this.method1426(StatusEffects.LEVITATION)) {
            this.method1397();
         }

         this.method1389(new Vec3d(var12, var13, var8));
      }
   }

   private void method1389(Vec3d var1) {
      if (this.isSwimming && !this.player.hasVehicle()) {
         double var2 = this.method1424().y;
         double var4 = var2 < -0.2 ? 0.085 : 0.06;
         BlockPos var6 = new BlockPos(MathHelper.floor(this.pos.x), MathHelper.floor(this.pos.y + 1.0 - 0.1), MathHelper.floor(this.pos.z));
         if (var2 <= 0.0 || this.input.playerInput.jump() || !this.player.getWorld().getBlockState(var6).getFluidState().isEmpty()) {
            this.velocity = this.velocity.add(0.0, (var2 - this.velocity.y) * var4, 0.0);
         }
      }

      double var19 = this.velocity.y;
      double var20 = 0.08;
      boolean var21 = this.velocity.y <= 0.0;
      if (this.velocity.y <= 0.0 && this.method1426(StatusEffects.SLOW_FALLING)) {
         var20 = 0.01;
         this.method1397();
      }

      if (this.method1414() && this.player.shouldSwimInFluids()) {
         double var25 = this.pos.y;
         float var28 = this.method1405() ? 0.9F : 0.8F;
         float var30 = 0.02F;
         float var32 = (float)this.method1428(EntityAttributes.WATER_MOVEMENT_EFFICIENCY);
         if (!this.onGround) {
            var32 *= 0.5F;
         }

         if (var32 > 0.0F) {
            var28 += (0.54600006F - var28) * var32 / 3.0F;
            var30 += (this.method1394() - var30) * var32 / 3.0F;
         }

         if (this.method1426(StatusEffects.DOLPHINS_GRACE)) {
            var28 = 0.96F;
         }

         this.method1391(var30, var1);
         this.method1395(this.velocity);
         Vec3d var33 = this.velocity;
         if (this.horizontalCollision && this.method1400()) {
            var33 = new Vec3d(var33.x, 0.2, var33.z);
         }

         this.velocity = var33.multiply(var28, 0.8, var28);
         Vec3d var34 = this.player.applyFluidMovingSpeed(var20, var21, this.velocity);
         this.velocity = var34;
         if (this.horizontalCollision && this.method1409(var34.x, var34.y + 0.6 - this.pos.y + var25, var34.z)) {
            this.velocity = new Vec3d(var34.x, 0.3, var34.z);
         }
      } else if (this.method1415() && this.player.shouldSwimInFluids()) {
         double var24 = this.pos.y;
         this.method1391(0.02F, var1);
         this.method1395(this.velocity);
         if (this.method1421(FluidTags.LAVA) <= this.method1413()) {
            this.velocity = this.velocity.multiply(0.5, 0.8, 0.5);
            this.velocity = this.player.applyFluidMovingSpeed(var20, var21, this.velocity);
         } else {
            this.velocity = this.velocity.multiply(0.5);
         }

         if (!this.player.hasNoGravity()) {
            this.velocity = this.velocity.add(0.0, -var20 / 4.0, 0.0);
         }

         if (this.horizontalCollision && this.method1409(this.velocity.x, this.velocity.y + 0.6 - this.pos.y + var24, this.velocity.z)) {
            this.velocity = new Vec3d(this.velocity.x, 0.3, this.velocity.z);
         }
      } else if (this.isFallFlying) {
         Vec3d var9 = this.velocity;
         if (var9.y > -0.5) {
            this.fallDistance = 1.0F;
         }

         Vec3d var10 = this.method1424();
         float var11 = this.pitch * (float) (Math.PI / 180.0);
         double var12 = Math.sqrt(var10.x * var10.x + var10.z * var10.z);
         double var14 = this.velocity.horizontalLength();
         double var16 = var10.length();
         float var18 = MathHelper.cos(var11);
         var18 = (float)(var18 * (var18 * Math.min(1.0, var16 / 0.4)));
         var9 = this.velocity.add(0.0, var20 * (-1.0 + var18 * 0.75), 0.0);
         if (var9.y < 0.0 && var12 > 0.0) {
            double var7 = var9.y * -0.1 * var18;
            var9 = var9.add(var10.x * var7 / var12, var7, var10.z * var7 / var12);
         }

         if (var11 < 0.0F && var12 > 0.0) {
            double var22 = var14 * -MathHelper.sin(var11) * 0.04;
            var9 = var9.add(-var10.x * var22 / var12, var22 * 3.2, -var10.z * var22 / var12);
         }

         if (var12 > 0.0) {
            var9 = var9.add((var10.x / var12 * var14 - var9.x) * 0.1, 0.0, (var10.z / var12 * var14 - var9.z) * 0.1);
         }

         this.velocity = var9.multiply(0.99, 0.98, 0.99);
         this.method1395(this.velocity);
      } else {
         BlockPos var23 = this.method1412();
         float var8 = this.player.getWorld().getBlockState(var23).getBlock().getSlipperiness();
         float var27 = this.onGround ? var8 * 0.91F : 0.91F;
         Vec3d var29 = this.method1390(var1, var8);
         double var31 = var29.y;
         if (this.method1426(StatusEffects.LEVITATION)) {
            StatusEffectInstance var13 = this.method1427(StatusEffects.LEVITATION);
            if (var13 != null) {
               var31 += (0.05 * (var13.getAmplifier() + 1) - var29.y) * 0.2;
            }
         } else if (this.player.getWorld().isClient() && !this.player.getWorld().isChunkLoaded(var23)) {
            var31 = this.pos.y > this.player.getWorld().getBottomY() ? -0.1 : 0.0;
         } else if (!this.player.hasNoGravity()) {
            var31 -= var20;
         }

         if (this.player.hasNoDrag()) {
            this.velocity = new Vec3d(var29.x, var31, var29.z);
         } else {
            this.velocity = new Vec3d(var29.x * var27, var31 * 0.98F, var29.z * var27);
         }
      }

      if (this.player.getAbilities().flying && !this.player.hasVehicle()) {
         this.velocity = new Vec3d(this.velocity.x, var19 * 0.6, this.velocity.z);
         this.method1397();
      }
   }

   private Vec3d method1390(Vec3d var1, float var2) {
      this.method1391(this.method1392(var2), var1);
      this.velocity = this.method1399(this.velocity);
      this.method1395(this.velocity);
      Vec3d var3 = this.velocity;
      BlockPos var4 = this.method1430(this.pos);
      BlockState var5 = this.method1431(var4);
      if ((this.horizontalCollision || this.isJumping)
         && (this.method1400() || var5 != null && var5.isOf(Blocks.POWDER_SNOW) && PowderSnowBlock.canWalkOnPowderSnow(this.player))) {
         var3 = new Vec3d(var3.x, 0.2, var3.z);
      }

      return var3;
   }

   private void method1391(float var1, Vec3d var2) {
      Vec3d var3 = Entity.movementInputToVelocity(var2, var1, this.yaw);
      this.velocity = this.velocity.add(var3);
   }

   private float method1392(float var1) {
      return this.onGround ? this.method1394() * (0.21600002F / (var1 * var1 * var1)) : this.method1393();
   }

   private float method1393() {
      float var1 = 0.02F;
      return this.input.playerInput.sprint() ? var1 + 0.006F : var1;
   }

   private float method1394() {
      return 0.1F;
   }

   private void method1395(Vec3d var1) {
      Vec3d var2 = this.method1402(var1);
      Vec3d var3 = this.method1396(var2);
      if (var3.lengthSquared() > 1.0E-7) {
         this.pos = this.pos.add(var3);
         this.boundingBox = this.player.dimensions.getBoxAt(this.pos);
      }

      boolean var4 = !MathHelper.approximatelyEquals(var1.x, var3.x);
      boolean var5 = !MathHelper.approximatelyEquals(var1.z, var3.z);
      this.horizontalCollision = var4 || var5;
      this.verticalCollision = var1.y != var3.y;
      this.onGround = this.verticalCollision && var1.y < 0.0;
      if (!this.method1414()) {
         this.method1416();
      }

      if (this.onGround) {
         this.method1397();
      } else if (var1.y < 0.0) {
         this.fallDistance = this.fallDistance - (float)var1.y;
      }

      Vec3d var6 = this.velocity;
      if (this.horizontalCollision || this.verticalCollision) {
         this.velocity = new Vec3d(var4 ? 0.0 : var6.x, this.onGround ? 0.0 : var6.y, var5 ? 0.0 : var6.z);
      }
   }

   private Vec3d method1396(Vec3d var1) {
      Box var2 = new Box(-0.3, 0.0, -0.3, 0.3, 1.8, 0.3).offset(this.pos);
      List var3 = Collections.emptyList();
      Vec3d var4;
      if (var1.lengthSquared() == 0.0) {
         var4 = var1;
      } else {
         var4 = Entity.adjustMovementForCollisions(this.player, var1, var2, this.player.getWorld(), var3);
      }

      boolean var5 = var1.x != var4.x;
      boolean var6 = var1.y != var4.y;
      boolean var7 = var1.z != var4.z;
      boolean var8 = this.onGround || var6 && var1.y < 0.0;
      if (this.player.getStepHeight() > 0.0F && var8 && (var5 || var7)) {
         Vec3d var9 = Entity.adjustMovementForCollisions(
            this.player, new Vec3d(var1.x, this.player.getStepHeight(), var1.z), var2, this.player.getWorld(), var3
         );
         Vec3d var10 = Entity.adjustMovementForCollisions(
            this.player, new Vec3d(0.0, this.player.getStepHeight(), 0.0), var2.stretch(var1.x, 0.0, var1.z), this.player.getWorld(), var3
         );
         Vec3d var11 = Entity.adjustMovementForCollisions(this.player, new Vec3d(var1.x, 0.0, var1.z), var2.offset(var10), this.player.getWorld(), var3)
            .add(var10);
         if (var10.y < this.player.getStepHeight() && var11.horizontalLengthSquared() > var9.horizontalLengthSquared()) {
            var9 = var11;
         }

         if (var9.horizontalLengthSquared() > var4.horizontalLengthSquared()) {
            return var9.add(
               Entity.adjustMovementForCollisions(this.player, new Vec3d(0.0, -var9.y + var1.y, 0.0), var2.offset(var9), this.player.getWorld(), var3)
            );
         }
      }

      return var4;
   }

   private void method1397() {
      this.fallDistance = 0.0F;
   }

   public void method1398() {
      this.velocity = this.velocity.add(0.0, this.method1406() - this.velocity.y, 0.0);
      if (this.method1405()) {
         float var1 = (float)Math.toRadians(this.yaw);
         this.velocity = this.velocity.add(-MathHelper.sin(var1) * 0.2, 0.0, MathHelper.cos(var1) * 0.2);
      }
   }

   private Vec3d method1399(Vec3d var1) {
      if (!this.method1400()) {
         return var1;
      } else {
         this.method1397();
         double var2 = MathHelper.clamp(var1.x, -0.15F, 0.15F);
         double var4 = MathHelper.clamp(var1.z, -0.15F, 0.15F);
         double var6 = Math.max(var1.y, -0.15F);
         if (var6 < 0.0 && !this.method1431(this.method1430(this.pos)).isOf(Blocks.SCAFFOLDING) && this.player.isHoldingOntoLadder()) {
            var6 = 0.0;
         }

         return new Vec3d(var2, var6, var4);
      }
   }

   public boolean method1400() {
      BlockPos var1 = this.method1430(this.pos);
      BlockState var2 = this.method1431(var1);
      return var2.isIn(BlockTags.CLIMBABLE) ? true : var2.getBlock() instanceof TrapdoorBlock && this.method1401(var1, var2);
   }

   private boolean method1401(BlockPos var1, BlockState var2) {
      if (!var2.get(TrapdoorBlock.OPEN)) {
         return false;
      } else {
         BlockState var3 = this.player.getWorld().getBlockState(var1.down());
         return var3.isOf(Blocks.LADDER) && var3.get(LadderBlock.FACING).equals(var2.get(TrapdoorBlock.FACING));
      }
   }

   private Vec3d method1402(Vec3d var1) {
      if (var1.y <= 0.0 && this.method1404()) {
         double var2 = var1.x;
         double var4 = var1.z;

         double var6;
         for (var6 = 0.05;
            var2 != 0.0 && this.player.getWorld().isSpaceEmpty(this.player, this.boundingBox.offset(var2, -0.5, 0.0));
            var2 += var2 > 0.0 ? -var6 : var6
         ) {
            if (var2 < var6 && var2 >= -var6) {
               var2 = 0.0;
               break;
            }
         }

         while (var4 != 0.0 && this.player.getWorld().isSpaceEmpty(this.player, this.boundingBox.offset(0.0, -0.5, var4))) {
            if (var4 < var6 && var4 >= -var6) {
               var4 = 0.0;
               break;
            }

            var4 += var4 > 0.0 ? -var6 : var6;
         }

         while (var2 != 0.0 && var4 != 0.0 && this.player.getWorld().isSpaceEmpty(this.player, this.boundingBox.offset(var2, -0.5, var4))) {
            var2 = var2 < var6 && var2 >= -var6 ? 0.0 : (var2 > 0.0 ? var2 - var6 : var2 + var6);
            if (var4 < var6 && var4 >= -var6) {
               var4 = 0.0;
               break;
            }

            var4 += var4 > 0.0 ? -var6 : var6;
         }

         if (var1.x != var2 || var1.z != var4) {
            this.clipLedged = true;
         }

         if (this.method1403()) {
            var1 = new Vec3d(var2, var1.y, var4);
         }
      }

      return var1;
   }

   protected boolean method1403() {
      return this.input.playerInput.sneak() || this.input.forceSafeWalk;
   }

   private boolean method1404() {
      return this.onGround
         || this.fallDistance < 0.5 && !this.player.getWorld().isSpaceEmpty(this.player, this.boundingBox.offset(0.0, this.fallDistance - 0.5, 0.0));
   }

   private boolean method1405() {
      return this.sprinting;
   }

   private float method1406() {
      return 0.42F * this.method1408() + this.method1407();
   }

   private float method1407() {
      if (this.method1426(StatusEffects.JUMP_BOOST)) {
         StatusEffectInstance var1 = this.method1427(StatusEffects.JUMP_BOOST);
         return 0.1F * (var1.getAmplifier() + 1);
      } else {
         return 0.0F;
      }
   }

   private float method1408() {
      float var1 = 0.0F;
      Block var2 = this.method1431(this.method1430(this.pos)).getBlock();
      if (var2 != null) {
         var1 = var2.getJumpVelocityMultiplier();
      }

      float var3 = 0.0F;
      Block var4 = this.method1431(this.method1412()).getBlock();
      if (var4 != null) {
         var3 = var4.getJumpVelocityMultiplier();
      }

      return var1 == 1.0F ? var3 : var1;
   }

   private boolean method1409(double var1, double var3, double var5) {
      return this.method1410(this.boundingBox.offset(var1, var3, var5));
   }

   private boolean method1410(Box var1) {
      return this.player.getWorld().isSpaceEmpty(this.player, var1) && !this.player.getWorld().containsFluid(var1);
   }

   private void method1411(TagKey<Fluid> var1) {
      this.velocity = this.velocity.add(0.0, 0.04F, 0.0);
   }

   private BlockPos method1412() {
      return BlockPos.ofFloored(this.pos.x, this.boundingBox.minY - 0.5000001, this.pos.z);
   }

   private double method1413() {
      return this.player.getStandingEyeHeight() < 0.4 ? 0.0 : 0.4;
   }

   private boolean method1414() {
      return this.touchingWater;
   }

   public boolean method1415() {
      return this.fluidHeight.getDouble(FluidTags.LAVA) > 0.0;
   }

   private void method1416() {
      if (this.player.getVehicle() instanceof BoatEntity) {
         BoatEntity var1 = (BoatEntity)this.player.getVehicle();
         if (!var1.isSubmergedInWater()) {
            this.touchingWater = false;
            return;
         }
      }

      if (this.method1422(FluidTags.WATER, 0.014)) {
         this.method1397();
         this.touchingWater = true;
      } else {
         this.touchingWater = false;
      }
   }

   private void method1417() {
      if (this.isSwimming) {
         this.isSwimming = this.method1405() && this.method1414() && !this.player.hasVehicle();
      } else {
         this.isSwimming = this.method1405()
            && this.method1420()
            && !this.player.hasVehicle()
            && this.player.getWorld().getFluidState(this.method1430(this.pos)).isIn(FluidTags.WATER);
      }
   }

   private void method1418() {
      this.submergedInWater = this.submergedFluidTag.contains(FluidTags.WATER);
      this.submergedFluidTag.clear();
      double var1 = this.method1419() - 0.11111111F;
      if (!(
         this.player.getVehicle() instanceof BoatEntity var4
            && !var4.isSubmergedInWater()
            && var4.getBoundingBox().maxY >= var1
            && var4.getBoundingBox().minY <= var1
      )) {
         BlockPos var8 = BlockPos.ofFloored(this.pos.x, var1, this.pos.z);
         FluidState var5 = this.player.getWorld().getFluidState(var8);
         double var6 = var8.getY() + var5.getHeight(this.player.getWorld(), var8);
         if (var6 > var1) {
            this.submergedFluidTag.addAll(var5.streamTags().toList());
         }
      }
   }

   private double method1419() {
      return this.pos.y + this.player.getStandingEyeHeight();
   }

   public boolean method1420() {
      return this.submergedInWater && this.method1414();
   }

   private double method1421(TagKey<Fluid> var1) {
      return this.fluidHeight.getDouble(var1);
   }

   private boolean method1422(TagKey<Fluid> var1, double var2) {
      if (this.method1423()) {
         return false;
      } else {
         Box var4 = this.boundingBox.contract(0.001);
         int var5 = MathHelper.floor(var4.minX);
         int var6 = MathHelper.ceil(var4.maxX);
         int var7 = MathHelper.floor(var4.minY);
         int var8 = MathHelper.ceil(var4.maxY);
         int var9 = MathHelper.floor(var4.minZ);
         int var10 = MathHelper.ceil(var4.maxZ);
         double var11 = 0.0;
         boolean var13 = true;
         boolean var14 = false;
         Vec3d var15 = Vec3d.ZERO;
         int var16 = 0;
         Mutable var17 = new Mutable();

         for (int var18 = var5; var18 < var6; var18++) {
            for (int var19 = var7; var19 < var8; var19++) {
               for (int var20 = var9; var20 < var10; var20++) {
                  var17.set(var18, var19, var20);
                  FluidState var21 = this.player.getWorld().getFluidState(var17);
                  if (var21.isIn(var1)) {
                     double var22 = var19 + var21.getHeight(this.player.getWorld(), var17);
                     if (var22 >= var4.minY) {
                        var14 = true;
                        var11 = Math.max(var22 - var4.minY, var11);
                        if (var13) {
                           Vec3d var24 = var21.getVelocity(this.player.getWorld(), var17);
                           if (var11 < 0.4) {
                              var24 = var24.multiply(var11);
                           }

                           var15 = var15.add(var24);
                           var16++;
                        }
                     }
                  }
               }
            }
         }

         if (var15.length() > 0.0) {
            if (var16 > 0) {
               var15 = var15.multiply(1.0 / var16);
            }

            var15 = var15.multiply(var2);
            if (Math.abs(this.velocity.x) < 0.003 && Math.abs(this.velocity.z) < 0.003 && var15.length() < 0.0045) {
               var15 = var15.normalize().multiply(0.0045);
            }

            this.velocity = this.velocity.add(var15);
         }

         this.fluidHeight.put(var1, var11);
         return var14;
      }
   }

   private boolean method1423() {
      Box var1 = this.boundingBox.expand(1.0);
      int var2 = MathHelper.floor(var1.minX);
      int var3 = MathHelper.ceil(var1.maxX);
      int var4 = MathHelper.floor(var1.minZ);
      int var5 = MathHelper.ceil(var1.maxZ);
      return !this.player.getWorld().isRegionLoaded(var2, var4, var3, var5);
   }

   private Vec3d method1424() {
      return this.method1425(this.pitch, this.yaw);
   }

   private Vec3d method1425(float var1, float var2) {
      float var3 = (float)(var1 * Math.PI / 180.0);
      float var4 = (float)(-var2 * Math.PI / 180.0);
      float var5 = MathHelper.cos(var4);
      float var6 = MathHelper.sin(var4);
      float var7 = MathHelper.cos(var3);
      float var8 = MathHelper.sin(var3);
      return new Vec3d(var6 * var7, -var8, var5 * var7);
   }

   public boolean method1426(RegistryEntry<StatusEffect> var1) {
      StatusEffectInstance var2 = this.player.getStatusEffect(var1);
      return var2 != null && var2.getDuration() >= this.simulatedTicks;
   }

   private StatusEffectInstance method1427(RegistryEntry<StatusEffect> var1) {
      StatusEffectInstance var2 = this.player.getStatusEffect(var1);
      return var2 != null && var2.getDuration() >= this.simulatedTicks ? var2 : null;
   }

   public double method1428(RegistryEntry<EntityAttribute> var1) {
      return this.player.getAttributes().getValue(var1);
   }

   public Helper168 method1429() {
      return new Helper168(
         this.player,
         this.input,
         this.pos,
         this.velocity,
         this.boundingBox,
         this.yaw,
         this.pitch,
         this.sprinting,
         this.fallDistance,
         this.jumpingCooldown,
         this.isJumping,
         this.isFallFlying,
         this.onGround,
         this.horizontalCollision,
         this.verticalCollision,
         this.touchingWater,
         this.isSwimming,
         this.submergedInWater,
         new Object2DoubleArrayMap(this.fluidHeight),
         new HashSet<>(this.submergedFluidTag)
      );
   }

   public BlockPos method1430(Vec3d var1) {
      return new BlockPos(MathHelper.floor(var1.x), MathHelper.floor(var1.y), MathHelper.floor(var1.z));
   }

   public BlockState method1431(BlockPos var1) {
      return this.player.getWorld().getBlockState(var1);
   }
}
