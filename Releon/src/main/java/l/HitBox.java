package l;

import java.util.Comparator;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class HitBox extends Helper242 {
   static final ThreadLocal<Integer> HITBOX_QUERY_DEPTH = ThreadLocal.withInitial(() -> 0);
   private static final float ATTACK_RANGE = 3.1F;
   private static final long ATTACK_DELAY_MS = 50L;
   private static final float AIM_TOLERANCE = 14.0F;
   private static final long POINT_SWITCH_MS = 120L;
   private static final boolean VISIBLE_ONLY = true;
   private static final boolean USE_CAMERA_HIT_POINT = true;
   private final Setting2 xzExpandSetting = new Setting2("Расширение где не работать XZ ", "Расширение хитбокса по XZ")
      .method2086(0.2F)
      .method2078(0.0F, 3.0F);
   private final Setting2 yExpandSetting = new Setting2("Расширение  где не работать Y", "Расширение хитбокса по Y")
      .method2086(0.0F)
      .method2078(0.0F, 3.0F);
   private final Setting3 rotateSetting = new Setting3("Аим", "Наведение на цель").method2201(true);
   private final Setting3 renderHitBoxSetting = new Setting3("Рендер хитбокса", "Показывать расширенный хитбокс").method2201(true);
   private long lastAttackMs = 0L;
   private int lastAimEntityId = Integer.MIN_VALUE;
   private long nextPointSwitchMs = 0L;
   private Vec3d cachedAimPoint = null;

   public HitBox() {
      super("HitBox", "Hit Box", Helper269.COMBAT);
      this.setup(new Helper264[]{this.xzExpandSetting, this.yExpandSetting, this.rotateSetting, this.renderHitBoxSetting});
   }

   public static void method4495() {
      HITBOX_QUERY_DEPTH.set(HITBOX_QUERY_DEPTH.get() + 1);
   }

   public static void method4496() {
      int var0 = HITBOX_QUERY_DEPTH.get();
      if (var0 <= 1) {
         HITBOX_QUERY_DEPTH.set(0);
      } else {
         HITBOX_QUERY_DEPTH.set(var0 - 1);
      }
   }

   public static boolean method4497() {
      return HITBOX_QUERY_DEPTH.get() > 0;
   }

   @Helper104
   public void method4498(Helper392 var1) {
      if (method4497()) {
         if (var1.method3963() instanceof LivingEntity var2) {
            if (var2 != mc.player && !Helper309.method3075(var2)) {
               Box var7 = var1.getBox();
               float var4 = this.xzExpandSetting.method2082();
               float var5 = this.yExpandSetting.method2082();
               Box var6 = new Box(
                  var7.minX - var4 / 2.0F,
                  var7.minY - var5 / 2.0F,
                  var7.minZ - var4 / 2.0F,
                  var7.maxX + var4 / 2.0F,
                  var7.maxY + var5 / 2.0F,
                  var7.maxZ + var4 / 2.0F
               );
               var1.setBox(var6);
            }
         }
      }
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (mc.player != null && mc.world != null && mc.interactionManager != null) {
         Optional var2 = mc.world
            .getEntitiesByClass(LivingEntity.class, mc.player.getBoundingBox().expand(4.1F), this::method4499)
            .stream()
            .min(Comparator.comparingDouble(var0 -> mc.player.squaredDistanceTo(var0)));
         if (!var2.isEmpty()) {
            LivingEntity var3 = (LivingEntity)var2.get();
            if (this.method4500(var3)) {
               if (mc.player.canSee(var3)) {
                  if (this.rotateSetting.method2200()) {
                     this.method4501(var3);
                     if (!this.method4502(var3)) {
                        return;
                     }
                  }

                  boolean var4 = mc.options.attackKey.isPressed();
                  if (var4) {
                     if (System.currentTimeMillis() - this.lastAttackMs >= 50L) {
                        if (mc.player.getAttackCooldownProgress(0.5F) >= 0.92F) {
                           mc.interactionManager.attackEntity(mc.player, var3);
                           mc.player.swingHand(Hand.MAIN_HAND);
                           this.lastAttackMs = System.currentTimeMillis();
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @Helper104
   public void onWorldRender(Event10 var1) {
      if (this.renderHitBoxSetting.method2200() && mc.player != null && mc.world != null) {
         double var2 = this.xzExpandSetting.method2082() / 2.0;
         double var4 = this.yExpandSetting.method2082() / 2.0;
         double var6 = Math.pow(4.1F, 2.0);
         mc.world.getEntitiesByClass(LivingEntity.class, mc.player.getBoundingBox().expand(4.1F), this::method4499).forEach(var6x -> {
            if (!(mc.player.squaredDistanceTo(var6x) > var6)) {
               Box var7 = var6x.getBoundingBox().expand(var2, var4, var2);
               Helper183.method1545(var7, Helper133.method1162(), 1.0F);
            }
         });
      }
   }

   private boolean method4499(LivingEntity var1) {
      if (mc.player != null && var1 != null && var1 != mc.player && var1.isAlive()) {
         if (var1 instanceof PlayerEntity var2 && Helper309.method3075(var2)) {
            return false;
         } else {
            double var4 = 4.1F;
            return mc.player.squaredDistanceTo(var1) <= var4 * var4;
         }
      } else {
         return false;
      }
   }

   private boolean method4500(LivingEntity var1) {
      if (mc.player == null) {
         return false;
      } else {
         double var2 = this.xzExpandSetting.method2082() / 2.0;
         double var4 = this.yExpandSetting.method2082() / 2.0;
         Box var6 = var1.getBoundingBox().expand(var2, var4, var2);
         Vec3d var7 = mc.player.getEyePos();
         Vec3d var8 = var1.getPos().add(0.0, var1.getHeight() * 0.5, 0.0);
         Vec3d var9 = var8.subtract(var7);
         if (var9.lengthSquared() < 1.0E-6) {
            return true;
         } else {
            Vec3d var10 = var7.add(var9.normalize().multiply(3.4499999046325684));
            return var6.raycast(var7, var10).isPresent() || var6.contains(var7);
         }
      }
   }

   private void method4501(LivingEntity var1) {
      if (mc.player != null) {
         Vec3d var2 = mc.player.getEyePos();
         Vec3d var3 = this.method4503(var1);
         Helper336 var4 = Helper349.method3469(var3.subtract(var2));
         Helper351.INSTANCE.method3502(var4, Helper334.DEFAULT, Helper153.HIGH_IMPORTANCE_1, this);
      }
   }

   private boolean method4502(LivingEntity var1) {
      if (mc.player == null) {
         return false;
      } else {
         Helper336 var2 = Helper351.INSTANCE.method3483();
         float var3 = var2 != null ? var2.method3333() : mc.player.getYaw();
         float var4 = var2 != null ? var2.method3334() : mc.player.getPitch();
         Vec3d var5 = mc.player.getEyePos();
         Vec3d var6 = this.method4503(var1);
         Helper336 var7 = Helper349.method3469(var6.subtract(var5));
         float var8 = Math.abs(MathHelper.wrapDegrees(var7.method3333() - var3));
         float var9 = Math.abs(var7.method3334() - var4);
         float var10 = MathHelper.clamp(14.0F, 2.0F, 40.0F);
         return var8 <= var10 && var9 <= var10;
      }
   }

   private Vec3d method4503(LivingEntity var1) {
      Vec3d var2 = this.method4504(var1);
      if (var2 != null) {
         this.cachedAimPoint = var2;
         this.lastAimEntityId = var1.getId();
         this.nextPointSwitchMs = System.currentTimeMillis() + 120L;
         return var2;
      } else {
         long var3 = System.currentTimeMillis();
         if (this.cachedAimPoint != null && var1.getId() == this.lastAimEntityId && var3 < this.nextPointSwitchMs) {
            return this.cachedAimPoint;
         } else {
            Box var5 = var1.getBoundingBox();
            ThreadLocalRandom var6 = ThreadLocalRandom.current();
            double var7 = MathHelper.lerp(var6.nextDouble(0.15, 0.85), var5.minX, var5.maxX);
            double var9 = MathHelper.lerp(var6.nextDouble(0.45, 0.92), var5.minY, var5.maxY);
            double var11 = MathHelper.lerp(var6.nextDouble(0.15, 0.85), var5.minZ, var5.maxZ);
            this.cachedAimPoint = new Vec3d(var7, var9, var11);
            this.lastAimEntityId = var1.getId();
            this.nextPointSwitchMs = var3 + 120L;
            return this.cachedAimPoint;
         }
      }
   }

   private Vec3d method4504(LivingEntity var1) {
      if (mc.player == null) {
         return null;
      } else {
         double var2 = this.xzExpandSetting.method2082() / 2.0;
         double var4 = this.yExpandSetting.method2082() / 2.0;
         Box var6 = var1.getBoundingBox().expand(var2, var4, var2);
         Vec3d var7 = mc.player.getEyePos();
         Vec3d var8 = mc.player.getRotationVec(1.0F);
         Vec3d var9 = var7.add(var8.multiply(3.4499999046325684));
         return var6.raycast(var7, var9).orElse(null);
      }
   }

   @Override
   public void deactivate() {
      this.cachedAimPoint = null;
      this.lastAimEntityId = Integer.MIN_VALUE;
      this.nextPointSwitchMs = 0L;
      Helper351.INSTANCE.method3509();
      super.deactivate();
   }
}
