package l;

import com.mojang.blaze3d.platform.GlStateManager.DstFactor;
import com.mojang.blaze3d.platform.GlStateManager.SrcFactor;
import com.mojang.blaze3d.systems.RenderSystem;
import java.lang.reflect.Method;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.mob.SlimeEntity;
import net.minecraft.entity.mob.VexEntity;
import net.minecraft.entity.passive.AllayEntity;
import net.minecraft.entity.passive.BatEntity;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.entity.passive.FrogEntity;
import net.minecraft.entity.passive.ParrotEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.passive.PufferfishEntity;
import net.minecraft.entity.passive.ParrotEntity.Variant;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.minecraft.util.math.Vec3d;

final class Helper260 {
   private final Cosmetic owner;
   private BatEntity bat;
   private ParrotEntity parrot;
   private ParrotEntity raven;
   private AllayEntity fairy;
   private BeeEntity bee;
   private VexEntity vex;
   private FoxEntity fox;
   private PigEntity pig;
   private FrogEntity frog;
   private PufferfishEntity pufferfish;
   private SlimeEntity slime;
   private float orbitAngle;
   private long lastUpdateMs;
   private Vec3d smoothPos = Vec3d.ZERO;
   private Vec3d prevSmoothPos = Vec3d.ZERO;
   private float smoothYaw;
   private float prevSmoothYaw;
   private boolean followInitialized;

   Helper260(Cosmetic var1) {
      this.owner = var1;
   }

   void deactivate() {
      this.bat = null;
      this.parrot = null;
      this.raven = null;
      this.fairy = null;
      this.bee = null;
      this.vex = null;
      this.fox = null;
      this.pig = null;
      this.frog = null;
      this.pufferfish = null;
      this.slime = null;
      this.orbitAngle = 0.0F;
      this.lastUpdateMs = 0L;
      this.smoothPos = Vec3d.ZERO;
      this.prevSmoothPos = Vec3d.ZERO;
      this.smoothYaw = 0.0F;
      this.prevSmoothYaw = 0.0F;
      this.followInitialized = false;
   }

   void onWorldRender(Event10 var1) {
      ClientPlayerEntity var2 = Cosmetic.mc.player;
      if (var2 != null && Cosmetic.mc.world != null) {
         long var3 = System.currentTimeMillis();
         if (this.lastUpdateMs == 0L) {
            this.lastUpdateMs = var3;
         }

         float var5 = MathHelper.clamp((float)(var3 - this.lastUpdateMs) / 1000.0F, 0.0F, 0.05F);
         this.lastUpdateMs = var3;
         float var6 = MathHelper.clamp(this.owner.method1929().method2082(), 0.05F, 5.0F);
         this.orbitAngle += var5 * (0.85F + var6 * 1.25F);
         if (this.method2671(var2) instanceof LivingEntity var8) {
            float var9 = var1.method3709();
            Vec3d var10 = var2.getLerpedPos(var9);
            float var11 = MathHelper.lerpAngleDegrees(var9, var2.prevBodyYaw, var2.bodyYaw);
            float var12 = MathHelper.clamp(this.owner.method1927().method2082(), 0.15F, 2.5F);
            float var13 = MathHelper.clamp(this.owner.method1928().method2082(), -0.5F, 3.0F);
            float var14 = MathHelper.clamp(this.owner.method1930().method2082(), 0.15F, 2.0F);
            boolean var15 = this.method2673(var8);
            float var16 = var15 ? 0.0F : (float)Math.sin(this.orbitAngle * (1.75F + var6 * 1.1F)) * 0.1F;
            double var17 = Math.toRadians(var11);
            Vec3d var19 = new Vec3d(-Math.sin(var17), 0.0, Math.cos(var17));
            Vec3d var20 = new Vec3d(var19.z, 0.0, -var19.x);
            boolean var21 = var2.getVelocity().horizontalLength() > 0.045;
            double var22 = var12 * 0.85 + 0.35;
            double var24 = var12 * 0.3 + 0.18;
            double var26 = var12 + 0.55;
            Vec3d var28 = var21 ? var20.multiply(var22).add(var19.multiply(var24)) : var19.multiply(var26);
            double var29 = var10.x + var28.x;
            double var31 = var10.z + var28.z;
            double var33 = var10.y + var13 + var16;
            if (var15) {
               var33 = var10.y + Math.max(-0.25F, var13 * 0.55F);
            }

            float var35 = var21 ? var11 : MathHelper.wrapDegrees(var11 + 180.0F);
            this.method2675(new Vec3d(var29, var33, var31), var35, var5, var6, var15);
            Vec3d var36 = this.smoothPos;
            Vec3d var37 = var36.subtract(this.prevSmoothPos);
            float var38 = (float)Math.hypot(var37.x, var37.z);
            if (var15) {
               float var39 = MathHelper.clamp(var38 * 18.0F, 0.0F, 1.0F);
               var36 = var36.add(0.0, Math.sin(this.orbitAngle * (6.0F + var6 * 1.4F)) * 0.035F * var39, 0.0);
            }

            this.method2674(var8, var36, this.prevSmoothPos, this.smoothYaw, this.prevSmoothYaw, var2.age, var15);
            this.method2676(var8, var36.x, var36.y, var36.z, this.smoothYaw, var9, var1.method3708(), var14);
         }
      }
   }

   private Entity method2671(PlayerEntity var1) {
      if (this.owner.method1907()) {
         this.bat = this.method2672(this.bat, var1, EntityType.BAT);
         return this.bat;
      } else if (this.owner.method1908()) {
         this.parrot = this.method2672(this.parrot, var1, EntityType.PARROT);
         this.method2677(this.parrot, 0);
         return this.parrot;
      } else if (this.owner.method1909()) {
         this.raven = this.method2672(this.raven, var1, EntityType.PARROT);
         this.method2677(this.raven, 0);
         return this.raven;
      } else if (this.owner.method1910()) {
         this.fairy = this.method2672(this.fairy, var1, EntityType.ALLAY);
         return this.fairy;
      } else if (this.owner.method1911()) {
         this.bee = this.method2672(this.bee, var1, EntityType.BEE);
         return this.bee;
      } else if (this.owner.method1912()) {
         this.vex = this.method2672(this.vex, var1, EntityType.VEX);
         return this.vex;
      } else if (this.owner.method1913()) {
         this.fox = this.method2672(this.fox, var1, EntityType.FOX);
         return this.fox;
      } else if (this.owner.method1914()) {
         this.pig = this.method2672(this.pig, var1, EntityType.PIG);
         return this.pig;
      } else if (this.owner.method1915()) {
         this.frog = this.method2672(this.frog, var1, EntityType.FROG);
         return this.frog;
      } else if (this.owner.method1916()) {
         this.pufferfish = this.method2672(this.pufferfish, var1, EntityType.PUFFERFISH);
         return this.pufferfish;
      } else {
         this.slime = this.method2672(this.slime, var1, EntityType.SLIME);
         this.method2678(this.slime, 1);
         return this.slime;
      }
   }

   private <T extends LivingEntity> T method2672(T var1, PlayerEntity var2, EntityType<T> var3) {
      if (var1 == null || var1.getWorld() != Cosmetic.mc.world) {
         var1 = (T)var3.create(Cosmetic.mc.world, SpawnReason.COMMAND);
      }

      if (var1 == null) {
         return null;
      } else {
         var1.setNoGravity(true);
         var1.setSilent(true);
         var1.setInvisible(false);
         var1.setPose(EntityPose.STANDING);
         var1.setCustomNameVisible(false);
         var1.setCustomName(null);
         this.method2679(var1, "setAiDisabled", true);

         try {
            var1.setInvulnerable(true);
         } catch (Throwable var5) {
         }

         var1.age = var2.age;
         return (T)var1;
      }
   }

   private boolean method2673(LivingEntity var1) {
      return var1 instanceof FoxEntity || var1 instanceof PigEntity || var1 instanceof FrogEntity || var1 instanceof SlimeEntity;
   }

   private void method2674(LivingEntity var1, Vec3d var2, Vec3d var3, float var4, float var5, int var6, boolean var7) {
      var1.setPos(var2.x, var2.y, var2.z);
      var1.prevX = var3.x;
      var1.prevY = var3.y;
      var1.prevZ = var3.z;
      var1.lastRenderX = var2.x;
      var1.lastRenderY = var2.y;
      var1.lastRenderZ = var2.z;
      var1.age = var6;
      var1.setYaw(var4);
      var1.prevYaw = var5;
      var1.bodyYaw = var4;
      var1.prevBodyYaw = var5;
      var1.setHeadYaw(var4);
      var1.prevHeadYaw = var5;
      var1.setPitch(0.0F);
      var1.prevPitch = 0.0F;
      var1.setOnGround(var7);
      var1.setPose(EntityPose.STANDING);
   }

   private void method2675(Vec3d var1, float var2, float var3, float var4, boolean var5) {
      if (!this.followInitialized) {
         this.smoothPos = var1;
         this.prevSmoothPos = var1;
         this.smoothYaw = var2;
         this.prevSmoothYaw = var2;
         this.followInitialized = true;
      } else {
         this.prevSmoothPos = this.smoothPos;
         this.prevSmoothYaw = this.smoothYaw;
         Vec3d var6 = var1.subtract(this.smoothPos);
         double var7 = var6.length();
         float var9 = MathHelper.clamp(var3 * (var5 ? 6.5F + var4 * 2.2F : 4.8F + var4 * 1.8F), 0.08F, 0.55F);
         if (var7 > 1.6) {
            var9 = 1.0F;
         }

         this.smoothPos = this.smoothPos.add(var6.multiply(var9));
         Vec3d var10 = this.smoothPos.subtract(this.prevSmoothPos);
         double var11 = Math.hypot(var10.x, var10.z);
         float var13 = var11 > 0.0025 ? (float)Math.toDegrees(Math.atan2(var10.z, var10.x)) - 90.0F : var2;
         this.smoothYaw = MathHelper.lerpAngleDegrees(MathHelper.clamp(var3 * 14.0F, 0.18F, 0.65F), this.smoothYaw, var13);
      }
   }

   private void method2676(LivingEntity var1, double var2, double var4, double var6, float var8, float var9, MatrixStack var10, float var11) {
      var10.push();
      var10.translate(var2, var4, var6);
      var10.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(var8));
      var10.scale(var11, var11, var11);
      RenderSystem.enableBlend();
      RenderSystem.blendFunc(SrcFactor.SRC_ALPHA, DstFactor.ONE_MINUS_SRC_ALPHA);
      RenderSystem.enableDepthTest();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      EntityRenderer var12 = Cosmetic.mc.getEntityRenderDispatcher().getRenderer(var1);
      if (var12 != null) {
         int var13 = var12.getLight(var1, var9);
         Immediate var14 = Cosmetic.mc.getBufferBuilders().getEntityVertexConsumers();
         EntityRenderState var15 = var12.getAndUpdateRenderState(var1, var9);
         if (var15 != null) {
            var12.render(var15, var10, var14, var13);
         }

         var14.draw();
      }

      RenderSystem.disableBlend();
      var10.pop();
   }

   private void method2677(ParrotEntity var1, int var2) {
      if (var1 != null) {
         try {
            var1.setVariant(Variant.byIndex(var2));
         } catch (Throwable var10) {
            try {
               for (Method var6 : var1.getClass().getMethods()) {
                  if (var6.getName().toLowerCase().contains("setvariant") && var6.getParameterCount() == 1) {
                     Class var7 = var6.getParameterTypes()[0];
                     if (var7.isEnum()) {
                        Object[] var8 = var7.getEnumConstants();
                        if (var8 != null && var8.length > 0) {
                           var6.invoke(var1, var8[MathHelper.clamp(var2, 0, var8.length - 1)]);
                           return;
                        }
                     }
                  }
               }
            } catch (Throwable var9) {
            }
         }
      }
   }

   private void method2678(SlimeEntity var1, int var2) {
      if (var1 != null) {
         try {
            var1.setSize(var2, false);
         } catch (Throwable var8) {
            try {
               for (Method var6 : var1.getClass().getMethods()) {
                  if (var6.getName().toLowerCase().contains("setsize")) {
                     if (var6.getParameterCount() == 2) {
                        var6.invoke(var1, var2, false);
                        return;
                     }

                     if (var6.getParameterCount() == 1) {
                        var6.invoke(var1, var2);
                        return;
                     }
                  }
               }
            } catch (Throwable var7) {
            }
         }
      }
   }

   private void method2679(Object var1, String var2, boolean var3) {
      try {
         Method var4 = var1.getClass().getMethod(var2, boolean.class);
         var4.invoke(var1, var3);
      } catch (Throwable var5) {
      }
   }
}
