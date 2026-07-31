package zenith;

import zenith.hud.*;

import it.unimi.dsi.fastutil.objects.Object2DoubleArrayMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleMap;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.block.LadderBlock;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.block.BlockState;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.math.MathHelper;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluid;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.block.PowderSnowBlock;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.util.math.BlockPos.TimerCallbackSerializer9;

public class PlayerEntityHolder implements ZenithInternal140 {
   public final PlayerEntity Il1lllIII1l111lIIll;
   public final InputImpl$Helper lI1lIl11Il111I;
   public net.minecraft.util.math.Vec3d l1l111I11I1I;
   public net.minecraft.util.math.Vec3d lI1lllIl1IIIl1l1IlIlIl;
   public net.minecraft.util.math.Box IlIIll1l1lllll1I;
   public float llII1lIlI1l11lIIlI11IllIlIII;
   public float l1lllII11IIIlll1I1IIII1I11;
   public boolean I1I11ll1ll1l1lIlIllIl;
   public float lllIlI1II;
   public int llII1lllIll1l11;
   public boolean IIIIllII11l1111IIllI1Ill;
   public boolean ll11I111111l111I11lIIl;
   public boolean I11II1ll1I1lll1l;
   public boolean Il1II11lI11I11IIllI1llI;
   public boolean l1l111ll1I1111l1l1;
   public boolean I11IIl1l11IIlI1111;
   public boolean I111lllIII;
   public boolean llIllIlI1III1ll11lI11IlI1;
   public EntityPose lI1l1I1Il11Ill1lI;
   public boolean l1lIlII1l1I11ll11III1I11lI;
   public boolean I1IIIl1lllIIIl1l111lIIl1;
   private final Object2DoubleMap<TagKey<Fluid>> lII1I1ll1IIl;
   private final HashSet<TagKey<Fluid>> lllI1Il1l11llIllIIllIIlI1;
   private int llIIIIIlII1l1II1lll1llllIl = 0;
   private boolean IlIlI1ll1IIII = false;

   public PlayerEntityHolder(
      PlayerEntity PlayerEntity,
      InputImpl$Helper lll111ll1i1l11l1$ii1il11l111ii11iil,
      net.minecraft.util.math.Vec3d Vec3d,
      net.minecraft.util.math.Vec3d Vec3d,
      net.minecraft.util.math.Box Box,
      float f,
      float f1,
      boolean flag,
      float f2,
      int i,
      boolean flag1,
      boolean flag2,
      boolean flag3,
      boolean flag4,
      boolean flag5,
      boolean flag6,
      boolean flag7,
      boolean flag8,
      EntityPose EntityPose,
      boolean flag9,
      boolean flag10,
      Object2DoubleMap<TagKey<Fluid>> object2doublemap,
      HashSet<TagKey<Fluid>> hashset
   ) {
      this.Il1lllIII1l111lIIll = PlayerEntity;
      this.lI1lIl11Il111I = lll111ll1i1l11l1$ii1il11l111ii11iil;
      this.l1l111I11I1I = Vec3dx;
      this.lI1lllIl1IIIl1l1IlIlIl = Vec3d;
      this.IlIIll1l1lllll1I = Box;
      this.llII1lIlI1l11lIIlI11IllIlIII = f;
      this.l1lllII11IIIlll1I1IIII1I11 = f1;
      this.I1I11ll1ll1l1lIlIllIl = flag;
      this.lllIlI1II = f2;
      this.llII1lllIll1l11 = i;
      this.IIIIllII11l1111IIllI1Ill = flag1;
      this.ll11I111111l111I11lIIl = flag2;
      this.I11II1ll1I1lll1l = flag3;
      this.Il1II11lI11I11IIllI1llI = flag4;
      this.l1l111ll1I1111l1l1 = flag5;
      this.I11IIl1l11IIlI1111 = flag6;
      this.I111lllIII = flag7;
      this.llIllIlI1III1ll11lI11IlI1 = flag8;
      this.lI1l1I1Il11Ill1lI = EntityPose;
      this.l1lIlII1l1I11ll11III1I11lI = flag9;
      this.I1IIIl1lllIIIl1l111lIIl1 = flag10;
      this.lII1I1ll1IIl = object2doublemap;
      this.lllI1Il1l11llIllIIllIIlI1 = hashset;
   }

   public static PlayerEntityHolder FileHolder_2(int i) {
      PlayerEntityHolder lll111ll1i1l11l1 = StringHolder_8(
         InputImpl$Helper.EventBus(l11I1I1ll1Illll1I1l1111l1II.player.input.playerInput)
      );

      for (int j = 0; j < i; j++) {
         lll111ll1i1l11l1.tick();
      }

      return lll111ll1i1l11l1;
   }

   public static PlayerEntityHolder ZenithInternal095(PlayerEntity PlayerEntity, int i) {
      PlayerEntityHolder lll111ll1i1l11l1 = StringHolder_8(PlayerEntity, InputImpl$Helper.EventImpl_21(PlayerEntity));

      for (int j = 0; j < i; j++) {
         lll111ll1i1l11l1.tick();
      }

      return lll111ll1i1l11l1;
   }

   public static PlayerEntityHolder StringHolder_8(InputImpl$Helper lll111ll1i1l11l1$ii1il11l111ii11iil) {
      ClientPlayerEntity ClientPlayerEntity = l11I1I1ll1Illll1I1l1111l1II.player;
      return new PlayerEntityHolder(
         ClientPlayerEntity,
         lll111ll1i1l11l1$ii1il11l111ii11iil,
         ClientPlayerEntity.getPos(),
         ClientPlayerEntity.getVelocity(),
         ClientPlayerEntity.getBoundingBox(),
         ZenithClient.getInstance().ZenithInternal057().ll1ll1l11l1lllIIIIl1().AutoBrewing(),
         ZenithClient.getInstance().ZenithInternal057().ll1ll1l11l1lllIIIIl1().Basefinder(),
         ClientPlayerEntity.isSprinting(),
         ClientPlayerEntity.fallDistance,
         ClientPlayerEntity.jumpingCooldown,
         ClientPlayerEntity.jumping,
         ClientPlayerEntity.isGliding(),
         ClientPlayerEntity.isOnGround(),
         ClientPlayerEntity.horizontalCollision,
         ClientPlayerEntity.verticalCollision,
         ClientPlayerEntity.isTouchingWater(),
         ClientPlayerEntity.isSwimming(),
         ClientPlayerEntity.isSubmergedInWater(),
         ClientPlayerEntity.getPose(),
         ClientPlayerEntity.isInSneakingPose(),
         ClientPlayerEntity.isCrawling(),
         new Object2DoubleArrayMap(ClientPlayerEntity.fluidHeight),
         new HashSet<>(ClientPlayerEntity.submergedFluidTag)
      );
   }

   public static PlayerEntityHolder StringHolder_8(PlayerEntity PlayerEntity, InputImpl$Helper lll111ll1i1l11l1$ii1il11l111ii11iil) {
      return new PlayerEntityHolder(
         PlayerEntity,
         lll111ll1i1l11l1$ii1il11l111ii11iil,
         PlayerEntity.getPos(),
         PlayerEntity.getPos().subtract(new net.minecraft.util.math.Vec3d(PlayerEntity.prevX, PlayerEntity.prevY, PlayerEntity.prevZ)),
         PlayerEntity.getBoundingBox(),
         PlayerEntity.getYaw(),
         PlayerEntity.getPitch(),
         PlayerEntity.isSprinting(),
         PlayerEntity.fallDistance,
         PlayerEntity.jumpingCooldown,
         PlayerEntity.jumping,
         PlayerEntity.isGliding(),
         PlayerEntity.isOnGround(),
         PlayerEntity.horizontalCollision,
         PlayerEntity.verticalCollision,
         PlayerEntity.isTouchingWater(),
         PlayerEntity.isSwimming(),
         PlayerEntity.isSubmergedInWater(),
         PlayerEntity.getPose(),
         PlayerEntity.isInSneakingPose(),
         PlayerEntity.isCrawling(),
         new Object2DoubleArrayMap(PlayerEntity.fluidHeight),
         new HashSet<>(PlayerEntity.submergedFluidTag)
      );
   }

   public net.minecraft.util.math.Vec3d Debug() {
      return this.l1l111I11I1I;
   }

   public void tick() {
      this.llIIIIIlII1l1II1lll1llllIl++;
      this.IlIlI1ll1IIII = false;
      if (!(this.l1l111I11I1I.y <= -70.0)) {
         this.I111Il1Il1I1Il11111();
         this.II1I1IlI1I1I1();
         this.l1IIlIIl1III11I();
         this.ll11lllIIl11II11();
         this.l1llI11ll11IlIlI1l1l1llI();
         this.lI1lIl11Il111I.Coordinates();
         this.I1II1I1I1111l1lI11();
         this.l1111I1l1l11l1l1l1II111l();
         if (this.llII1lllIll1l11 > 0) {
            this.llII1lllIll1l11--;
         }

         this.IIIIllII11l1111IIllI1Ill = this.lI1lIl11Il111I.lIllllllIIl1IIIIIll1lIl1l.jump();
         double d0 = this.lI1lllIl1IIIl1l1IlIlIl.x;
         double d1 = this.lI1lllIl1IIIl1l1IlIlIl.y;
         double d2 = this.lI1lllIl1IIIl1l1IlIlIl.z;
         if (Math.abs(this.lI1lllIl1IIIl1l1IlIlIl.x) < 0.003) {
            d0 = 0.0;
         }

         if (Math.abs(this.lI1lllIl1IIIl1l1IlIlIl.y) < 0.003) {
            d1 = 0.0;
         }

         if (Math.abs(this.lI1lllIl1IIIl1l1IlIlIl.z) < 0.003) {
            d2 = 0.0;
         }

         if (this.I11II1ll1I1lll1l) {
            this.ll11I111111l111I11lIIl = false;
         }

         this.lI1lllIl1IIIl1l1IlIlIl = new net.minecraft.util.math.Vec3d(d0, d1, d2);
         if (this.IIIIllII11l1111IIllI1Ill && this.Il1lllIII1l111lIIll.shouldSwimInFluids()) {
            double d3 = this.Il1lIll11l1Il() ? this.EventBus(FluidTags.LAVA) : this.EventBus(FluidTags.WATER);
            boolean flag = this.lIlI11l1II1I1I11llIlIl111l1I() && d3 > 0.0;
            double d4 = this.lI1II1111I();
            if (!flag || this.I11II1ll1I1lll1l && !(d3 > d4)) {
               if (!this.Il1lIll11l1Il() || this.I11II1ll1I1lll1l && !(d3 > d4)) {
                  if ((this.I11II1ll1I1lll1l || flag && d3 <= d4) && this.llII1lllIll1l11 == 0) {
                     this.ZenithInternal004();
                     this.llII1lllIll1l11 = 10;
                  }
               } else {
                  this.StringHolder_8(FluidTags.LAVA);
               }
            } else {
               this.StringHolder_8(FluidTags.WATER);
            }
         } else {
            this.llII1lllIll1l11 = 0;
         }

         float f1 = this.lI1lIl11Il111I.ll1lI1IIllIlIl * 0.98F;
         float f = this.lI1lIl11Il111I.I1IIllIIIll111III1IllIIl1I1Ill * 0.98F;
         float f2 = 0.0F;
         if (this.EventTarget(StatusEffects.SLOW_FALLING) || this.EventTarget(StatusEffects.LEVITATION)) {
            this.lllI11l11l11lIl111lII111();
         }

         this.ZenithInternal061(new net.minecraft.util.math.Vec3d((double)f1, (double)f2, (double)f));
      }
   }

   private void ZenithInternal061(net.minecraft.util.math.Vec3d Vec3d) {
      if (this.I111lllIII && !this.Il1lllIII1l111lIIll.hasVehicle()) {
         double d0 = this.IlIlIII1IIl111l().y;
         double d1 = d0 < -0.2 ? 0.085 : 0.06;
         BlockPos BlockPosx = new BlockPos(
            MathHelper.floor(this.l1l111I11I1I.x),
            MathHelper.floor(this.l1l111I11I1I.y + 1.0 - 0.1),
            MathHelper.floor(this.l1l111I11I1I.z)
         );
         if (d0 <= 0.0
            || this.lI1lIl11Il111I.lIllllllIIl1IIIIIll1lIl1l.jump()
            || !this.Il1lllIII1l111lIIll.getWorld().getBlockState(BlockPosx).getFluidState().isEmpty()) {
            this.lI1lllIl1IIIl1l1IlIlIl = this.lI1lllIl1IIIl1l1IlIlIl.add(0.0, (d0 - this.lI1lllIl1IIIl1l1IlIlIl.y) * d1, 0.0);
         }
      }

      double d6 = this.lI1lllIl1IIIl1l1IlIlIl.y;
      double d7 = this.lII1I1llIlIlllII1lIlll1IlII();
      boolean flag = this.lI1lllIl1IIIl1l1IlIlIl.y <= 0.0;
      if (this.lIlI11l1II1I1I11llIlIl111l1I() && this.Il1lllIII1l111lIIll.shouldSwimInFluids()) {
         double d10 = this.l1l111I11I1I.y;
         float f4 = this.I1lIIlllIlI11ll() ? 0.9F : 0.8F;
         float f5 = 0.02F;
         float f6 = (float)this.Event(EntityAttributes.WATER_MOVEMENT_EFFICIENCY);
         if (!this.I11II1ll1I1lll1l) {
            f6 *= 0.5F;
         }

         if (f6 > 0.0F) {
            f4 += (0.54600006F - f4) * f6;
            f5 += (this.lIIlllll1l1I11l1l11I1lII() - f5) * f6;
         }

         if (this.EventTarget(StatusEffects.DOLPHINS_GRACE)) {
            f4 = 0.96F;
         }

         this.StringHolder_8(f5, Vec3dxxx);
         this.FinishThread(this.lI1lllIl1IIIl1l1IlIlIl);
         net.minecraft.util.math.Vec3d Vec3dx = this.lI1lllIl1IIIl1l1IlIlIl;
         if (this.Il1II11lI11I11IIllI1llI && this.l1l1IIllI1IlIIlIII1l()) {
            Vec3dx = new net.minecraft.util.math.Vec3d(Vec3dx.x, 0.2, Vec3dx.z);
         }

         this.lI1lllIl1IIIl1l1IlIlIl = Vec3dx.multiply((double)f4, 0.8, (double)f4);
         net.minecraft.util.math.Vec3d Vec3dxx = this.Il1lllIII1l111lIIll.applyFluidMovingSpeed(d7, flag, this.lI1lllIl1IIIl1l1IlIlIl);
         this.lI1lllIl1IIIl1l1IlIlIl = Vec3dxx;
         if (this.Il1II11lI11I11IIllI1llI
            && this.ZenithInternal028(Vec3dxx.x, Vec3dxx.y + 0.6 - this.l1l111I11I1I.y + d10, Vec3dxx.z)) {
            this.lI1lllIl1IIIl1l1IlIlIl = new net.minecraft.util.math.Vec3d(Vec3dxx.x, 0.3, Vec3dxx.z);
         }
      } else if (this.Il1lIll11l1Il() && this.Il1lllIII1l111lIIll.shouldSwimInFluids()) {
         double d9 = this.l1l111I11I1I.y;
         this.StringHolder_8(0.02F, Vec3dxxx);
         this.FinishThread(this.lI1lllIl1IIIl1l1IlIlIl);
         if (this.EventBus(FluidTags.LAVA) <= this.lI1II1111I()) {
            this.lI1lllIl1IIIl1l1IlIlIl = this.lI1lllIl1IIIl1l1IlIlIl.multiply(0.5, 0.8, 0.5);
            this.lI1lllIl1IIIl1l1IlIlIl = this.Il1lllIII1l111lIIll.applyFluidMovingSpeed(d7, flag, this.lI1lllIl1IIIl1l1IlIlIl);
         } else {
            this.lI1lllIl1IIIl1l1IlIlIl = this.lI1lllIl1IIIl1l1IlIlIl.multiply(0.5);
         }

         if (!this.Il1lllIII1l111lIIll.hasNoGravity()) {
            this.lI1lllIl1IIIl1l1IlIlIl = this.lI1lllIl1IIIl1l1IlIlIl.add(0.0, -d7 / 4.0, 0.0);
         }

         if (this.Il1II11lI11I11IIllI1llI
            && this.ZenithInternal028(
               this.lI1lllIl1IIIl1l1IlIlIl.x,
               this.lI1lllIl1IIIl1l1IlIlIl.y + 0.6 - this.l1l111I11I1I.y + d9,
               this.lI1lllIl1IIIl1l1IlIlIl.z
            )) {
            this.lI1lllIl1IIIl1l1IlIlIl = new net.minecraft.util.math.Vec3d(this.lI1lllIl1IIIl1l1IlIlIl.x, 0.3, this.lI1lllIl1IIIl1l1IlIlIl.z);
         }
      } else if (this.ll11I111111l111I11lIIl) {
         net.minecraft.util.math.Vec3d Vec3dxx = this.lI1lllIl1IIIl1l1IlIlIl;
         if (Vec3dxx.y > -0.5) {
            this.lllIlI1II = 1.0F;
         }

         net.minecraft.util.math.Vec3d Vec3dxxx = this.IlIlIII1IIl111l();
         float f1 = this.l1lllII11IIIlll1I1IIII1I11 * (float) (Math.PI / 180.0);
         double d3 = Math.sqrt(Vec3dxxx.x * Vec3dxxx.x + Vec3dxxx.z * Vec3dxxx.z);
         double d4 = this.lI1lllIl1IIIl1l1IlIlIl.horizontalLength();
         double d5 = Vec3dxxx.length();
         float f2 = MathHelper.cos(f1);
         f2 = (float)((double)f2 * (double)f2 * Math.min(1.0, d5 / 0.4));
         Vec3dxx = this.lI1lllIl1IIIl1l1IlIlIl.add(0.0, d7 * (-1.0 + (double)f2 * 0.75), 0.0);
         if (Vec3dxx.y < 0.0 && d3 > 0.0) {
            double d2 = Vec3dxx.y * -0.1 * (double)f2;
            Vec3dxx = Vec3dxx.add(Vec3dxxx.x * d2 / d3, d2, Vec3dxxx.z * d2 / d3);
         }

         if (f1 < 0.0F && d3 > 0.0) {
            double d8 = d4 * (double)(-MathHelper.sin(f1)) * 0.04;
            Vec3dxx = Vec3dxx.add(-Vec3dxxx.x * d8 / d3, d8 * 3.2, -Vec3dxxx.z * d8 / d3);
         }

         if (d3 > 0.0) {
            Vec3dxx = Vec3dxx.add(
               (Vec3dxxx.x / d3 * d4 - Vec3dxx.x) * 0.1, 0.0, (Vec3dxxx.z / d3 * d4 - Vec3dxx.z) * 0.1
            );
         }

         this.lI1lllIl1IIIl1l1IlIlIl = Vec3dxx.multiply(0.99, 0.98, 0.99);
         this.FinishThread(this.lI1lllIl1IIIl1l1IlIlIl);
      } else {
         BlockPos BlockPos = this.ll11llllll11lI11l1II1l1();
         float f = this.Il1lllIII1l111lIIll.getWorld().getBlockState(BlockPos).getBlock().getSlipperiness();
         float f3 = this.I11II1ll1I1lll1l ? f * 0.91F : 0.91F;
         net.minecraft.util.math.Vec3d Vec3dxxxx = this.EventBus(Vec3dxxx, f);
         double d11 = Vec3dxxxx.y;
         if (this.EventTarget(StatusEffects.LEVITATION)) {
            StatusEffectInstance StatusEffectInstance = this.ZenithInternal095(StatusEffects.LEVITATION);
            if (StatusEffectInstance != null) {
               d11 += (0.05 * (double)(StatusEffectInstance.getAmplifier() + 1) - Vec3dxxxx.y) * 0.2;
            }
         } else if (this.Il1lllIII1l111lIIll.getWorld().isClient() && !this.Il1lllIII1l111lIIll.getWorld().isChunkLoaded(BlockPos)) {
            d11 = this.l1l111I11I1I.y > (double)this.Il1lllIII1l111lIIll.getWorld().getBottomY() ? -0.1 : 0.0;
         } else if (d7 != 0.0) {
            d11 -= d7;
         }

         if (this.Il1lllIII1l111lIIll.hasNoDrag()) {
            this.lI1lllIl1IIIl1l1IlIlIl = new net.minecraft.util.math.Vec3d(Vec3dxxxx.x, d11, Vec3dxxxx.z);
         } else {
            this.lI1lllIl1IIIl1l1IlIlIl = new net.minecraft.util.math.Vec3d(Vec3dxxxx.x * (double)f3, d11 * 0.98F, Vec3dxxxx.z * (double)f3);
         }
      }

      if (this.Il1lllIII1l111lIIll.getAbilities().flying && !this.Il1lllIII1l111lIIll.hasVehicle()) {
         this.lI1lllIl1IIIl1l1IlIlIl = new net.minecraft.util.math.Vec3d(this.lI1lllIl1IIIl1l1IlIlIl.x, d6 * 0.6, this.lI1lllIl1IIIl1l1IlIlIl.z);
         this.lllI11l11l11lIl111lII111();
      }
   }

   private net.minecraft.util.math.Vec3d EventBus(net.minecraft.util.math.Vec3d Vec3d, float f) {
      this.StringHolder_8(this.ZenithInternal142(f), Vec3dx);
      this.lI1lllIl1IIIl1l1IlIlIl = this.ZenithInternal021(this.lI1lllIl1IIIl1l1IlIlIl);
      this.FinishThread(this.lI1lllIl1IIIl1l1IlIlIl);
      net.minecraft.util.math.Vec3d Vec3dx = this.lI1lllIl1IIIl1l1IlIlIl;
      BlockPos BlockPos = this.ClearHeadersHandler(this.l1l111I11I1I);
      BlockState BlockState = this.GetSocketHandler(BlockPos);
      if ((this.Il1II11lI11I11IIllI1llI || this.IIIIllII11l1111IIllI1Ill)
         && (
            this.l1l1IIllI1IlIIlIII1l()
               || BlockState != null && BlockState.isOf(Blocks.POWDER_SNOW) && PowderSnowBlock.canWalkOnPowderSnow(this.Il1lllIII1l111lIIll)
         )) {
         Vec3dx = new net.minecraft.util.math.Vec3d(Vec3dx.x, 0.2, Vec3dx.z);
      }

      return Vec3dx;
   }

   private void StringHolder_8(float f, net.minecraft.util.math.Vec3d Vec3d) {
      net.minecraft.util.math.Vec3d Vec3dx = Entity.movementInputToVelocity(Vec3dx, f, this.llII1lIlI1l11lIIlI11IllIlIII);
      this.lI1lllIl1IIIl1l1IlIlIl = this.lI1lllIl1IIIl1l1IlIlIl.add(Vec3dx);
   }

   private float ZenithInternal142(float f) {
      return this.I11II1ll1I1lll1l ? this.lIIlllll1l1I11l1l11I1lII() * (0.21600002F / (f * f * f)) : this.I1IlI1l1I111Ill();
   }

   private float I1IlI1l1I111Ill() {
      return 0.02F;
   }

   private float lIIlllll1l1I11l1l11I1lII() {
      return (float)this.Event(EntityAttributes.MOVEMENT_SPEED);
   }

   private void FinishThread(net.minecraft.util.math.Vec3d Vec3d) {
      net.minecraft.util.math.Vec3d Vec3dx = this.ZenithException_2(Vec3dxxx);
      net.minecraft.util.math.Vec3d Vec3dxx = this.ZenithInternal064(Vec3dx);
      if (Vec3dxx.lengthSquared() > 1.0E-7) {
         this.l1l111I11I1I = this.l1l111I11I1I.add(Vec3dxx);
         this.IlIIll1l1lllll1I = this.IlIIll1l1lllll1I.offset(Vec3dxx);
      }

      boolean flag = !MathHelper.approximatelyEquals(Vec3dx.x, Vec3dxx.x);
      boolean flag1 = !MathHelper.approximatelyEquals(Vec3dx.z, Vec3dxx.z);
      this.Il1II11lI11I11IIllI1llI = flag || flag1;
      this.l1l111ll1I1111l1l1 = Vec3dx.y != Vec3dxx.y;
      this.I11II1ll1I1lll1l = this.l1l111ll1I1111l1l1 && Vec3dx.y < 0.0;
      if (!this.lIlI11l1II1I1I11llIlIl111l1I()) {
         this.I111Il1Il1I1Il11111();
      }

      if (this.I11II1ll1I1lll1l) {
         this.lllI11l11l11lIl111lII111();
      } else if (Vec3dx.y < 0.0) {
         this.lllIlI1II = this.lllIlI1II - (float)Vec3dx.y;
      }

      net.minecraft.util.math.Vec3d Vec3dxxx = this.lI1lllIl1IIIl1l1IlIlIl;
      if (this.Il1II11lI11I11IIllI1llI || this.l1l111ll1I1111l1l1) {
         this.lI1lllIl1IIIl1l1IlIlIl = new net.minecraft.util.math.Vec3d(
            flag ? 0.0 : Vec3dxxx.x, this.I11II1ll1I1lll1l ? 0.0 : Vec3dxxx.y, flag1 ? 0.0 : Vec3dxxx.z
         );
      }

      float f = this.Illll1lIIllI1l11llI1Il11();
      this.lI1lllIl1IIIl1l1IlIlIl = this.lI1lllIl1IIIl1l1IlIlIl.multiply((double)f, 1.0, (double)f);
   }

   private net.minecraft.util.math.Vec3d ZenithInternal064(net.minecraft.util.math.Vec3d Vec3d) {
      net.minecraft.util.math.Box Box = this.IlIIll1l1lllll1I;
      List list = Collections.emptyList();
      net.minecraft.util.math.Vec3d Vec3dx;
      if (Vec3dxxxx.lengthSquared() == 0.0) {
         Vec3dx = Vec3dxxxx;
      } else {
         Vec3dx = Entity.adjustMovementForCollisions(this.Il1lllIII1l111lIIll, Vec3dxxxx, Box, this.Il1lllIII1l111lIIll.getWorld(), list);
      }

      boolean flag = Vec3dxxxx.x != Vec3dx.x;
      boolean flag1 = Vec3dxxxx.y != Vec3dx.y;
      boolean flag2 = Vec3dxxxx.z != Vec3dx.z;
      boolean flag3 = this.I11II1ll1I1lll1l || flag1 && Vec3dxxxx.y < 0.0;
      if (this.Il1lllIII1l111lIIll.getStepHeight() > 0.0F && flag3 && (flag || flag2)) {
         net.minecraft.util.math.Vec3d Vec3dxx = Entity.adjustMovementForCollisions(
            this.Il1lllIII1l111lIIll,
            new net.minecraft.util.math.Vec3d(Vec3dxxxx.x, (double)this.Il1lllIII1l111lIIll.getStepHeight(), Vec3dxxxx.z),
            Box,
            this.Il1lllIII1l111lIIll.getWorld(),
            list
         );
         net.minecraft.util.math.Vec3d Vec3dxxx = Entity.adjustMovementForCollisions(
            this.Il1lllIII1l111lIIll,
            new net.minecraft.util.math.Vec3d(0.0, (double)this.Il1lllIII1l111lIIll.getStepHeight(), 0.0),
            Box.stretch(Vec3dxxxx.x, 0.0, Vec3dxxxx.z),
            this.Il1lllIII1l111lIIll.getWorld(),
            list
         );
         net.minecraft.util.math.Vec3d Vec3dxxxx = Entity.adjustMovementForCollisions(
               this.Il1lllIII1l111lIIll,
               new net.minecraft.util.math.Vec3d(Vec3dxxxx.x, 0.0, Vec3dxxxx.z),
               Box.offset(Vec3dxxx),
               this.Il1lllIII1l111lIIll.getWorld(),
               list
            )
            .add(Vec3dxxx);
         if (Vec3dxxx.y < (double)this.Il1lllIII1l111lIIll.getStepHeight() && Vec3dxxxx.horizontalLengthSquared() > Vec3dxx.horizontalLengthSquared()) {
            Vec3dxx = Vec3dxxxx;
         }

         if (Vec3dxx.horizontalLengthSquared() > Vec3dx.horizontalLengthSquared()) {
            return Vec3dxx.add(
               Entity.adjustMovementForCollisions(
                  this.Il1lllIII1l111lIIll,
                  new net.minecraft.util.math.Vec3d(0.0, -Vec3dxx.y + Vec3dxxxx.y, 0.0),
                  Box.offset(Vec3dxx),
                  this.Il1lllIII1l111lIIll.getWorld(),
                  list
               )
            );
         }
      }

      return Vec3dx;
   }

   private void lllI11l11l11lIl111lII111() {
      this.lllIlI1II = 0.0F;
   }

   public void ZenithInternal004() {
      float f = this.I1II1llllIl1l1I1();
      if (!(f <= 1.0E-5F)) {
         this.lI1lllIl1IIIl1l1IlIlIl = new net.minecraft.util.math.Vec3d(
            this.lI1lllIl1IIIl1l1IlIlIl.x, Math.max((double)f, this.lI1lllIl1IIIl1l1IlIlIl.y), this.lI1lllIl1IIIl1l1IlIlIl.z
         );
         if (this.I1lIIlllIlI11ll()) {
            float f1 = (float)Math.toRadians((double)this.llII1lIlI1l11lIIlI11IllIlIII);
            this.lI1lllIl1IIIl1l1IlIlIl = this.lI1lllIl1IIIl1l1IlIlIl
               .add((double)(-MathHelper.sin(f1)) * 0.2, 0.0, (double)MathHelper.cos(f1) * 0.2);
         }
      }
   }

   private net.minecraft.util.math.Vec3d ZenithInternal021(net.minecraft.util.math.Vec3d Vec3d) {
      if (!this.l1l1IIllI1IlIIlIII1l()) {
         return Vec3d;
      } else {
         this.lllI11l11l11lIl111lII111();
         double d0 = MathHelper.clamp(Vec3d.x, -0.15F, 0.15F);
         double d1 = MathHelper.clamp(Vec3d.z, -0.15F, 0.15F);
         double d2 = Math.max(Vec3d.y, -0.15F);
         if (d2 < 0.0
            && !this.GetSocketHandler(this.ClearHeadersHandler(this.l1l111I11I1I)).isOf(Blocks.SCAFFOLDING)
            && this.Il1lllIII1l111lIIll.isHoldingOntoLadder()) {
            d2 = 0.0;
         }

         return new net.minecraft.util.math.Vec3d(d0, d2, d1);
      }
   }

   public boolean l1l1IIllI1IlIIlIII1l() {
      BlockPos BlockPos = this.ClearHeadersHandler(this.l1l111I11I1I);
      BlockState BlockState = this.GetSocketHandler(BlockPos);
      return BlockState.isIn(BlockTags.CLIMBABLE)
         ? true
         : BlockState.getBlock() instanceof TrapdoorBlock && this.Event(BlockPos, BlockState);
   }

   private boolean Event(BlockPos BlockPos, BlockState BlockState) {
      if (!(Boolean)BlockStatex.get(TrapdoorBlock.OPEN)) {
         return false;
      } else {
         BlockState BlockStatex = this.Il1lllIII1l111lIIll.getWorld().getBlockState(BlockPos.down());
         return BlockStatex.isOf(Blocks.LADDER)
            && ((Direction)BlockStatex.get(LadderBlock.FACING)).equals(BlockStatex.get(TrapdoorBlock.FACING));
      }
   }

   private net.minecraft.util.math.Vec3d ZenithException_2(net.minecraft.util.math.Vec3d Vec3d) {
      double d0 = (double)this.Il1lllIII1l111lIIll.getStepHeight();
      if (Vec3d.y <= 0.0 && !this.Il1lllIII1l111lIIll.getAbilities().flying && this.l111IllllI1ll1llI1ll() && this.ByteBufferHolder_2(d0)) {
         double d1 = Vec3d.x;
         double d2 = Vec3d.z;
         double d3 = 0.05;
         double d4 = Math.signum(d1) * d3;

         double d5;
         for (d5 = Math.signum(d2) * d3; d1 != 0.0 && this.EventImpl_24(d1, 0.0, d0); d1 -= d4) {
            if (Math.abs(d1) <= d3) {
               d1 = 0.0;
               break;
            }
         }

         while (d2 != 0.0 && this.EventImpl_24(0.0, d2, d0)) {
            if (Math.abs(d2) <= d3) {
               d2 = 0.0;
               break;
            }

            d2 -= d5;
         }

         while (d1 != 0.0 && d2 != 0.0 && this.EventImpl_24(d1, d2, d0)) {
            if (Math.abs(d1) <= d3) {
               d1 = 0.0;
            } else {
               d1 -= d4;
            }

            if (Math.abs(d2) <= d3) {
               d2 = 0.0;
               break;
            }

            d2 -= d5;
         }

         if (Vec3d.x != d1 || Vec3d.z != d2) {
            this.IlIlI1ll1IIII = true;
         }

         Vec3d = new net.minecraft.util.math.Vec3d(d1, Vec3d.y, d2);
      }

      return Vec3d;
   }

   protected boolean l111IllllI1ll1llI1ll() {
      return this.lI1lIl11Il111I.lIllllllIIl1IIIIIll1lIl1l.sneak() || this.lI1lIl11Il111I.llIl1Illlll1IIll;
   }

   private boolean ByteBufferHolder_2(double d0) {
      return this.I11II1ll1I1lll1l || (double)this.lllIlI1II < d0 && !this.EventImpl_24(0.0, 0.0, d0 - (double)this.lllIlI1II);
   }

   private boolean EventImpl_24(double d0, double d1, double d2) {
      net.minecraft.util.math.Box Box = this.IlIIll1l1lllll1I;
      return this.Il1lllIII1l111lIIll
         .getWorld()
         .isSpaceEmpty(
            this.Il1lllIII1l111lIIll,
            new net.minecraft.util.math.Box(
               Box.minX + d0,
               Box.minY - d2 - 1.0E-5,
               Box.minZ + d1,
               Box.maxX + d0,
               Box.minY,
               Box.maxZ + d1
            )
         );
   }

   private boolean I1lIIlllIlI11ll() {
      return this.I1I11ll1ll1l1lIlIllIl;
   }

   private float I1II1llllIl1l1I1() {
      return (float)this.Event(EntityAttributes.JUMP_STRENGTH) * this.l1Il1l11l1lII11l1l1I111I() + this.III1Il1llIlIl11l1IlllI1Il();
   }

   private float III1Il1llIlIl11l1IlllI1Il() {
      if (this.EventTarget(StatusEffects.JUMP_BOOST)) {
         StatusEffectInstance StatusEffectInstance = this.ZenithInternal095(StatusEffects.JUMP_BOOST);
         return 0.1F * (float)(StatusEffectInstance.getAmplifier() + 1);
      } else {
         return 0.0F;
      }
   }

   private float l1Il1l11l1lII11l1l1I111I() {
      float f = 0.0F;
      Block Blockx = this.GetSocketHandler(this.ClearHeadersHandler(this.l1l111I11I1I)).getBlock();
      if (Blockx != null) {
         f = Blockx.getJumpVelocityMultiplier();
      }

      float f1 = 0.0F;
      Block Blockx = this.GetSocketHandler(this.ll11llllll11lI11l1II1l1()).getBlock();
      if (Blockx != null) {
         f1 = Blockx.getJumpVelocityMultiplier();
      }

      return f == 1.0F ? f1 : f;
   }

   private boolean ZenithInternal028(double d0, double d1, double d2) {
      return this.Event(this.IlIIll1l1lllll1I.offset(d0, d1, d2));
   }

   private boolean Event(net.minecraft.util.math.Box Box) {
      return this.Il1lllIII1l111lIIll.getWorld().isSpaceEmpty(this.Il1lllIII1l111lIIll, Box)
         && !this.Il1lllIII1l111lIIll.getWorld().containsFluid(Box);
   }

   private double lII1I1llIlIlllII1lIlll1IlII() {
      double d0 = this.Il1lllIII1l111lIIll.hasNoGravity() ? 0.0 : this.Event(EntityAttributes.GRAVITY);
      return this.lI1lllIl1IIIl1l1IlIlIl.y <= 0.0 && this.EventTarget(StatusEffects.SLOW_FALLING) ? Math.min(d0, 0.01) : d0;
   }

   private float Illll1lIIllI1l11llI1Il11() {
      BlockState BlockState = this.GetSocketHandler(this.ClearHeadersHandler(this.l1l111I11I1I));
      float f = BlockState.getBlock().getVelocityMultiplier();
      if (!BlockState.isOf(Blocks.WATER) && !BlockState.isOf(Blocks.BUBBLE_COLUMN)) {
         return f == 1.0F ? this.GetSocketHandler(this.ll11llllll11lI11l1II1l1()).getBlock().getVelocityMultiplier() : f;
      } else {
         return f;
      }
   }

   private void StringHolder_8(TagKey<Fluid> TagKey) {
      this.lI1lllIl1IIIl1l1IlIlIl = this.lI1lllIl1IIIl1l1IlIlIl.add(0.0, 0.04F, 0.0);
   }

   private BlockPos ll11llllll11lI11l1II1l1() {
      return BlockPos.ofFloored(this.l1l111I11I1I.x, this.IlIIll1l1lllll1I.minY - 0.5000001, this.l1l111I11I1I.z);
   }

   private double lI1II1111I() {
      return (double)this.l11II1l111lII1lI1I11l1III() < 0.4 ? 0.0 : 0.4;
   }

   private boolean lIlI11l1II1I1I11llIlIl111l1I() {
      return this.I11IIl1l11IIlI1111;
   }

   public boolean Il1lIll11l1Il() {
      return this.lII1I1ll1IIl.getDouble(FluidTags.LAVA) > 0.0;
   }

   private void I111Il1Il1I1Il11111() {
      if (this.Il1lllIII1l111lIIll.getVehicle() instanceof BoatEntity) {
         BoatEntity BoatEntity = (BoatEntity)this.Il1lllIII1l111lIIll.getVehicle();
         if (!BoatEntity.isSubmergedInWater()) {
            this.I11IIl1l11IIlI1111 = false;
            return;
         }
      }

      if (this.StringHolder_8(FluidTags.WATER, 0.014)) {
         this.lllI11l11l11lIl111lII111();
         this.I11IIl1l11IIlI1111 = true;
      } else {
         this.I11IIl1l11IIlI1111 = false;
      }
   }

   private void l1IIlIIl1III11I() {
      if (this.I111lllIII) {
         this.I111lllIII = this.I1lIIlllIlI11ll() && this.lIlI11l1II1I1I11llIlIl111l1I() && !this.Il1lllIII1l111lIIll.hasVehicle();
      } else {
         this.I111lllIII = this.I1lIIlllIlI11ll()
            && this.l1111IIIllI1l1()
            && !this.Il1lllIII1l111lIIll.hasVehicle()
            && this.Il1lllIII1l111lIIll.getWorld().getFluidState(this.ClearHeadersHandler(this.l1l111I11I1I)).isIn(FluidTags.WATER);
      }
   }

   private void ll11lllIIl11II11() {
      if (!this.StringHolder_8(EntityPose.SWIMMING)) {
         this.I1IIIl1lllIIIl1l111lIIl1 = this.lI1l1I1Il11Ill1lI == EntityPose.SWIMMING && !this.lIlI11l1II1I1I11llIlIl111l1I();
      } else {
         EntityPose EntityPosex;
         if (this.ll11I111111l111I11lIIl) {
            EntityPosex = EntityPose.GLIDING;
         } else if (this.Il1lllIII1l111lIIll.isSleeping()) {
            EntityPosex = EntityPose.SLEEPING;
         } else if (this.I111lllIII) {
            EntityPosex = EntityPose.SWIMMING;
         } else if (this.Il1lllIII1l111lIIll.isUsingRiptide()) {
            EntityPosex = EntityPose.SPIN_ATTACK;
         } else if (this.IIIl1IIIIIlIl() && !this.Il1lllIII1l111lIIll.getAbilities().flying) {
            EntityPosex = EntityPose.CROUCHING;
         } else {
            EntityPosex = EntityPose.STANDING;
         }

         EntityPose EntityPosex;
         if (this.Il1lllIII1l111lIIll.isSpectator() || this.Il1lllIII1l111lIIll.hasVehicle() || this.StringHolder_8(EntityPosex)) {
            EntityPosex = EntityPosex;
         } else if (this.StringHolder_8(EntityPose.CROUCHING)) {
            EntityPosex = EntityPose.CROUCHING;
         } else {
            EntityPosex = EntityPose.SWIMMING;
         }

         this.EventBus(EntityPosex);
         this.I1IIIl1lllIIIl1l111lIIl1 = this.lI1l1I1Il11Ill1lI == EntityPose.SWIMMING && !this.lIlI11l1II1I1I11llIlIl111l1I();
      }
   }

   private void l1llI11ll11IlIlI1l1l1llI() {
      this.l1lIlII1l1I11ll11III1I11lI = !this.Il1lllIII1l111lIIll.getAbilities().flying
         && !this.I111lllIII
         && !this.Il1lllIII1l111lIIll.hasVehicle()
         && this.StringHolder_8(EntityPose.CROUCHING)
         && (this.IIIl1IIIIIlIl() || !this.Il1lllIII1l111lIIll.isSleeping() && !this.StringHolder_8(EntityPose.STANDING));
   }

   private void l1111I1l1l11l1l1l1II111l() {
      if (this.Il1lllIII1l111lIIll.isUsingItem() && !this.Il1lllIII1l111lIIll.hasVehicle()) {
         this.lI1lIl11Il111I.ll1lI1IIllIlIl *= 0.2F;
         this.lI1lIl11Il111I.I1IIllIIIll111III1IllIIl1I1Ill *= 0.2F;
      }

      if (this.IIllIIll11II1llI1II1l1lIlI1()) {
         float f = (float)this.Event(EntityAttributes.SNEAKING_SPEED);
         this.lI1lIl11Il111I.ll1lI1IIllIlIl *= f;
         this.lI1lIl11Il111I.I1IIllIIIll111III1IllIIl1I1Ill *= f;
      }
   }

   private void I1II1I1I1111l1lI11() {
      if (this.IIIll1l1Illl11111Il1lI1lIII()) {
         this.I1I11ll1ll1l1lIlIllIl = false;
      }

      if (this.I1I11ll1ll1l1lIlIllIl) {
         boolean flag = !this.lI1l1I1l1l1Il() || !this.l11lIllllIIll111III11IIl();
         boolean flag1 = flag
            || this.Il1II11lI11I11IIllI1llI && !this.Il1lllIII1l111lIIll.collidedSoftly
            || this.lIlI11l1II1I1I11llIlIl111l1I() && !this.l1111IIIllI1l1();
         if (this.I111lllIII) {
            if (!this.I11II1ll1I1lll1l && !this.lI1lIl11Il111I.lIllllllIIl1IIIIIll1lIl1l.sneak() && flag || !this.lIlI11l1II1I1I11llIlIl111l1I()) {
               this.I1I11ll1ll1l1lIlIllIl = false;
            }
         } else if (flag1) {
            this.I1I11ll1ll1l1lIlIllIl = false;
         }
      }
   }

   private boolean IIIll1l1Illl11111Il1lI1lIII() {
      return this.ll11I111111l111I11lIIl
         || this.EventTarget(StatusEffects.BLINDNESS)
         || this.IIllIIll11II1llI1II1l1lIlI1()
         || this.Il1lllIII1l111lIIll.hasVehicle() && !this.Il1lIIl11111IlI1IlII1()
         || this.Il1lllIII1l111lIIll.isUsingItem() && !this.Il1lllIII1l111lIIll.hasVehicle() && !this.l1111IIIllI1l1();
   }

   private boolean Il1lIIl11111IlI1IlII1() {
      Entity Entity = this.Il1lllIII1l111lIIll.getVehicle();
      return Entity != null && Entity.getType() == EntityType.CAMEL;
   }

   private boolean lI1l1I1l1l1Il() {
      return this.lI1lIl11Il111I.I1IIllIIIll111III1IllIIl1I1Ill > 1.0E-5F;
   }

   private boolean l11lIllllIIll111III11IIl() {
      return this.Il1lllIII1l111lIIll.hasVehicle()
         || (float)this.Il1lllIII1l111lIIll.getHungerManager().getFoodLevel() > 6.0F
         || this.Il1lllIII1l111lIIll.getAbilities().allowFlying;
   }

   private boolean IIllIIll11II1llI1II1l1lIlI1() {
      return this.l1lIlII1l1I11ll11III1I11lI || this.I1IIIl1lllIIIl1l111lIIl1;
   }

   private boolean IIIl1IIIIIlIl() {
      return this.lI1lIl11Il111I.lIllllllIIl1IIIIIll1lIl1l.sneak();
   }

   private boolean StringHolder_8(EntityPose EntityPose) {
      return this.Il1lllIII1l111lIIll
         .getWorld()
         .isSpaceEmpty(this.Il1lllIII1l111lIIll, this.Il1lllIII1l111lIIll.getDimensions(EntityPose).getBoxAt(this.l1l111I11I1I).contract(1.0E-7));
   }

   private void EventBus(EntityPose EntityPose) {
      if (this.lI1l1I1Il11Ill1lI != EntityPose
         || !this.IlIIll1l1lllll1I.equals(this.Il1lllIII1l111lIIll.getDimensions(EntityPose).getBoxAt(this.l1l111I11I1I))) {
         this.lI1l1I1Il11Ill1lI = EntityPose;
         this.IlIIll1l1lllll1I = this.Il1lllIII1l111lIIll.getDimensions(EntityPose).getBoxAt(this.l1l111I11I1I);
      }
   }

   private void II1I1IlI1I1I1() {
      this.llIllIlI1III1ll11lI11IlI1 = this.lllI1Il1l11llIllIIllIIlI1.contains(FluidTags.WATER);
      this.lllI1Il1l11llIllIIllIIlI1.clear();
      double d0 = this.IIllllIIlll() - 0.11111111F;
      if (this.Il1lllIII1l111lIIll.getVehicle() instanceof BoatEntity BoatEntity
         && !BoatEntity.isSubmergedInWater()
         && BoatEntity.getBoundingBox().maxY >= d0
         && BoatEntity.getBoundingBox().minY <= d0) {
         return;
      }

      BlockPos BlockPos = BlockPos.ofFloored(this.l1l111I11I1I.x, d0, this.l1l111I11I1I.z);
      FluidState FluidState = this.Il1lllIII1l111lIIll.getWorld().getFluidState(BlockPos);
      double d1 = (double)((float)BlockPos.getY() + FluidState.getHeight(this.Il1lllIII1l111lIIll.getWorld(), BlockPos));
      if (d1 > d0) {
         this.lllI1Il1l11llIllIIllIIlI1.addAll(FluidState.streamTags().toList());
      }
   }

   private double IIllllIIlll() {
      return this.l1l111I11I1I.y + (double)this.l11II1l111lII1lI1I11l1III();
   }

   private float l11II1l111lII1lI1I11l1III() {
      return this.Il1lllIII1l111lIIll.getDimensions(this.lI1l1I1Il11Ill1lI).eyeHeight();
   }

   public boolean l1111IIIllI1l1() {
      return this.llIllIlI1III1ll11lI11IlI1 && this.lIlI11l1II1I1I11llIlIl111l1I();
   }

   private double EventBus(TagKey<Fluid> TagKey) {
      return this.lII1I1ll1IIl.getDouble(TagKey);
   }

   private boolean StringHolder_8(TagKey<Fluid> TagKey, double d0) {
      if (this.IllIl1IIllIIIIl1I1I1l1I111()) {
         return false;
      } else {
         net.minecraft.util.math.Box Box = this.IlIIll1l1lllll1I.contract(0.001);
         int i = MathHelper.floor(Box.minX);
         int j = MathHelper.ceil(Box.maxX);
         int k = MathHelper.floor(Box.minY);
         int l = MathHelper.ceil(Box.maxY);
         int i1 = MathHelper.floor(Box.minZ);
         int j1 = MathHelper.ceil(Box.maxZ);
         double d1 = 0.0;
         boolean flag = true;
         boolean flag1 = false;
         net.minecraft.util.math.Vec3d Vec3dx = net.minecraft.util.math.Vec3d.ZERO;
         int k1 = 0;
         TimerCallbackSerializer9 TimerCallbackSerializer9 = new TimerCallbackSerializer9();

         for (int l1 = i; l1 < j; l1++) {
            for (int i2 = k; i2 < l; i2++) {
               for (int j2 = i1; j2 < j1; j2++) {
                  TimerCallbackSerializer9.set(l1, i2, j2);
                  FluidState FluidState = this.Il1lllIII1l111lIIll.getWorld().getFluidState(TimerCallbackSerializer9);
                  if (FluidState.isIn(TagKey)) {
                     double d2 = (double)((float)i2 + FluidState.getHeight(this.Il1lllIII1l111lIIll.getWorld(), TimerCallbackSerializer9));
                     if (d2 >= Box.minY) {
                        flag1 = true;
                        d1 = Math.max(d2 - Box.minY, d1);
                        if (flag) {
                           net.minecraft.util.math.Vec3d Vec3dx = FluidState.getVelocity(this.Il1lllIII1l111lIIll.getWorld(), TimerCallbackSerializer9);
                           if (d1 < 0.4) {
                              Vec3dx = Vec3dx.multiply(d1);
                           }

                           Vec3dx = Vec3dx.add(Vec3dx);
                           k1++;
                        }
                     }
                  }
               }
            }
         }

         if (Vec3dx.length() > 0.0) {
            if (k1 > 0) {
               Vec3dx = Vec3dx.multiply(1.0 / (double)k1);
            }

            Vec3dx = Vec3dx.multiply(d0);
            if (Math.abs(this.lI1lllIl1IIIl1l1IlIlIl.x) < 0.003
               && Math.abs(this.lI1lllIl1IIIl1l1IlIlIl.z) < 0.003
               && Vec3dx.length() < 0.0045) {
               Vec3dx = Vec3dx.normalize().multiply(0.0045);
            }

            this.lI1lllIl1IIIl1l1IlIlIl = this.lI1lllIl1IIIl1l1IlIlIl.add(Vec3dx);
         }

         this.lII1I1ll1IIl.put(TagKey, d1);
         return flag1;
      }
   }

   private boolean IllIl1IIllIIIIl1I1I1l1I111() {
      net.minecraft.util.math.Box Box = this.IlIIll1l1lllll1I.expand(1.0);
      int i = MathHelper.floor(Box.minX);
      int j = MathHelper.ceil(Box.maxX);
      int k = MathHelper.floor(Box.minZ);
      int l = MathHelper.ceil(Box.maxZ);
      return !this.Il1lllIII1l111lIIll.getWorld().isRegionLoaded(i, k, j, l);
   }

   private net.minecraft.util.math.Vec3d IlIlIII1IIl111l() {
      return this.ByteBufferHolder_2(this.l1lllII11IIIlll1I1IIII1I11, this.llII1lIlI1l11lIIlI11IllIlIII);
   }

   private net.minecraft.util.math.Vec3d ByteBufferHolder_2(float f, float f1) {
      float f2 = (float)((double)f * Math.PI / 180.0);
      float f3 = (float)((double)(-f1) * Math.PI / 180.0);
      float f4 = MathHelper.cos(f3);
      float f5 = MathHelper.sin(f3);
      float f6 = MathHelper.cos(f2);
      float f7 = MathHelper.sin(f2);
      return new net.minecraft.util.math.Vec3d((double)(f5 * f6), (double)(-f7), (double)(f4 * f6));
   }

   public boolean EventTarget(RegistryEntry<StatusEffect> RegistryEntry) {
      StatusEffectInstance StatusEffectInstance = this.Il1lllIII1l111lIIll.getStatusEffect(RegistryEntry);
      return StatusEffectInstance != null && StatusEffectInstance.getDuration() >= this.llIIIIIlII1l1II1lll1llllIl;
   }

   private StatusEffectInstance ZenithInternal095(RegistryEntry<StatusEffect> RegistryEntry) {
      StatusEffectInstance StatusEffectInstance = this.Il1lllIII1l111lIIll.getStatusEffect(RegistryEntry);
      return StatusEffectInstance != null && StatusEffectInstance.getDuration() >= this.llIIIIIlII1l1II1lll1llllIl ? StatusEffectInstance : null;
   }

   public double Event(RegistryEntry<EntityAttribute> RegistryEntry) {
      return this.Il1lllIII1l111lIIll.getAttributes().getValue(RegistryEntry);
   }

   public PlayerEntityHolder I1I1l1111IIIIlIII() {
      return new PlayerEntityHolder(
         this.Il1lllIII1l111lIIll,
         this.lI1lIl11Il111I,
         this.l1l111I11I1I,
         this.lI1lllIl1IIIl1l1IlIlIl,
         this.IlIIll1l1lllll1I,
         this.llII1lIlI1l11lIIlI11IllIlIII,
         this.l1lllII11IIIlll1I1IIII1I11,
         this.I1I11ll1ll1l1lIlIllIl,
         this.lllIlI1II,
         this.llII1lllIll1l11,
         this.IIIIllII11l1111IIllI1Ill,
         this.ll11I111111l111I11lIIl,
         this.I11II1ll1I1lll1l,
         this.Il1II11lI11I11IIllI1llI,
         this.l1l111ll1I1111l1l1,
         this.I11IIl1l11IIlI1111,
         this.I111lllIII,
         this.llIllIlI1III1ll11lI11IlI1,
         this.lI1l1I1Il11Ill1lI,
         this.l1lIlII1l1I11ll11III1I11lI,
         this.I1IIIl1lllIIIl1l111lIIl1,
         new Object2DoubleArrayMap(this.lII1I1ll1IIl),
         new HashSet<>(this.lllI1Il1l11llIllIIllIIlI1)
      );
   }

   public BlockPos l1ll1llI1ll1Il11l111ll111l1111() {
      return new BlockPos(
         MathHelper.floor(this.l1l111I11I1I.x),
         MathHelper.floor(this.l1l111I11I1I.y),
         MathHelper.floor(this.l1l111I11I1I.z)
      );
   }

   public BlockPos ClearHeadersHandler(net.minecraft.util.math.Vec3d Vec3d) {
      return new BlockPos(
         MathHelper.floor(Vec3d.x), MathHelper.floor(Vec3d.y), MathHelper.floor(Vec3d.z)
      );
   }

   public BlockState GetSocketHandler(BlockPos BlockPos) {
      return this.Il1lllIII1l111lIIll.getWorld().getBlockState(BlockPos);
   }
}
