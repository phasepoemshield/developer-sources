package l;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MaceItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.TridentItem;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;

public class AimAssist extends Helper242 {
   private static AimAssist instance;
   Setting8 targetType = new Setting8("Тип таргета", "Фильтрует весь список целей по типу")
      .method2585("Players", "Naked Players", "Mobs", "Animals", "Friends", "Armor Stand")
      .method2586("Players", "Mobs", "Animals");
   private final Setting2 distanceSetting = new Setting2("Дистанция", "Максимальная дистанция до цели").method2086(6.0F).method2078(1.0F, 6.0F);
   private final Setting2 fovSetting = new Setting2("FOV", "Угол обзора для захвата цели").method2086(360.0F).method2078(20.0F, 360.0F);
   private final Setting3 drawFovRadiusSetting = new Setting3("Рисовать FOV", "Показывает круг радиуса FOV").method2201(false);
   private final Setting2 speedSetting = new Setting2("Скорость", "Базовая скорость наведения").method2086(4.0F).method2078(0.5F, 10.0F);
   private final Setting2 smoothnessSetting = new Setting2("Плавность", "Плавность движения прицела").method2086(5.0F).method2078(1.0F, 10.0F);
   private final Setting2 aimHeightSetting = new Setting2("Высота прицела", "Точка прицеливания по высоте цели").method2086(0.85F).method2078(0.0F, 1.0F);
   private final Setting5 prioritySetting = new Setting5("Приоритет", "По какому параметру выбирать цель")
      .method2381("Дистанция", "Здоровье")
      .method2383("Дистанция");
   private final Setting3 onlyWithWeaponSetting = new Setting3("Только с оружием", "Работать только с оружием в руке").method2201(false);
   private final Setting3 onlyPlayersSetting = new Setting3("Только игроки", "Наводиться только на игроков").method2201(false);
   private final Setting3 noAimInInventorySetting = new Setting3("Не целиться в инвентаре", "Не наводиться при открытом контейнере").method2201(true);
   private final Setting3 hitInvisibleSetting = new Setting3("Бить невидимых", "Наводиться на невидимых игроков").method2201(false);
   private final Setting3 onlyArmoredSetting = new Setting3("Только Одетых", "Целиться только в игроков в броне").method2201(false);
   private final Setting3 ignoreNakedSetting = new Setting3("Не бить голых", "Игнорировать игроков без брони")
      .method2201(false)
      .method2199(() -> !this.onlyArmoredSetting.method2200());
   private final Setting3 onlyYawSetting = new Setting3("Только по X", "Менять только горизонтальный поворот").method2201(false);
   private final Setting3 multipointSetting = new Setting3("Мультипоинт", "Случайные точки прицеливания на хитбоксе").method2201(true);
   private final Setting3 wallCheckSetting = new Setting3("Проверка стен", "Не наводиться на цели за блоками").method2201(false);
   private final Setting3 disableOnWorldChangeSetting = new Setting3("Выкл. при смене мира", "Выключить модуль при смене мира").method2201(false);
   private final Setting3 microMovementsSetting = new Setting3("Микродвижения", "Добавляет небольшой шум и вариации").method2201(true);
   private Entity target;
   private long targetAcquiredAtMs;
   private long lastFrameNs;
   private long lastRenderAimNs;
   private double previousYawStep;
   private double previousPitchStep;
   private double aimYawVelocity;
   private double aimPitchVelocity;
   private double yawWavePhase;
   private double pitchWavePhase;
   private double yawWaveSpeed;
   private double pitchWaveSpeed;
   private double speedMultiplier;
   private double heightNoise;
   private long heightNoiseUpdatedAtMs;
   private double currentPointX;
   private double currentPointY;
   private double currentPointZ;
   private double nextPointX;
   private double nextPointY;
   private double nextPointZ;
   private long nextPointChangeAtMs;
   private double pointLerpSpeed;
   private RegistryKey<World> worldKey;

   public AimAssist() {
      super("Aim Assist", "Aim Assist.", Helper269.COMBAT);
      this.setup(
         new Helper264[]{
            this.targetType,
            this.distanceSetting,
            this.fovSetting,
            this.drawFovRadiusSetting,
            this.speedSetting,
            this.smoothnessSetting,
            this.aimHeightSetting,
            this.prioritySetting,
            this.onlyWithWeaponSetting,
            this.onlyPlayersSetting,
            this.noAimInInventorySetting,
            this.hitInvisibleSetting,
            this.onlyArmoredSetting,
            this.ignoreNakedSetting,
            this.wallCheckSetting
         }
      );
      instance = this;
   }

   public static AimAssist method4025() {
      return instance;
   }

   @Override
   public void activate() {
      this.method4036();
   }

   @Override
   public void deactivate() {
      this.method4036();
   }

   @Helper104
   public void onTick(Event8 var1) {
      long var2 = System.nanoTime();
      if (this.lastRenderAimNs == 0L || var2 - this.lastRenderAimNs > 75000000L) {
         this.method4026(mc);
      }
   }

   @Helper104
   public void onDraw(Event20 var1) {
      this.lastRenderAimNs = System.nanoTime();
      this.method4026(mc);
      this.method4034(var1);
   }

   private void method4026(MinecraftClient var1) {
      if (var1 != null && var1.player != null && var1.world != null) {
         RegistryKey var2 = var1.world.getRegistryKey();
         if (this.worldKey == null) {
            this.worldKey = var2;
         } else if (!this.worldKey.equals(var2)) {
            if (this.disableOnWorldChangeSetting.method2200()) {
               this.setState(false);
               return;
            }

            this.method4037();
            this.worldKey = var2;
            return;
         }

         if ((!this.onlyWithWeaponSetting.method2200() || this.method4040(var1))
            && (!this.noAimInInventorySetting.method2200() || !(var1.currentScreen instanceof HandledScreen))) {
            long var3 = System.nanoTime();
            double var5 = this.lastFrameNs > 0L ? (var3 - this.lastFrameNs) / 1.66666667E7 : 1.0;
            var5 = MathHelper.clamp(var5, 0.05, 3.0);
            this.lastFrameNs = var3;
            Entity var7 = this.method4028(var1);
            if (var7 == null) {
               if (this.target != null) {
                  this.method4037();
               }
            } else {
               if (var7 != this.target) {
                  this.target = var7;
                  this.targetAcquiredAtMs = System.currentTimeMillis();
                  this.method4038();
               }

               this.method4027(var1, var7, var5);
            }
         } else {
            this.method4037();
         }
      } else {
         this.method4036();
      }
   }

   private void method4027(MinecraftClient var1, Entity var2, double var3) {
      ThreadLocalRandom var5 = ThreadLocalRandom.current();
      boolean var6 = this.microMovementsSetting.method2200();
      long var7 = System.currentTimeMillis();
      if (var6 && var7 - this.heightNoiseUpdatedAtMs > var5.nextLong(180L, 450L)) {
         this.heightNoise = MathHelper.clamp(this.heightNoise + var5.nextDouble(-0.006, 0.006), -0.025, 0.025);
         this.heightNoiseUpdatedAtMs = var7;
      }

      if (this.multipointSetting.method2200() && var7 >= this.nextPointChangeAtMs) {
         this.method4039(var5);
      }

      if (this.multipointSetting.method2200()) {
         double var9 = this.pointLerpSpeed + (var6 ? var5.nextDouble(-0.002, 0.002) : 0.0);
         this.currentPointX = this.currentPointX + (this.nextPointX - this.currentPointX) * var9;
         this.currentPointY = this.currentPointY + (this.nextPointY - this.currentPointY) * var9;
         this.currentPointZ = this.currentPointZ + (this.nextPointZ - this.currentPointZ) * var9;
      }

      double[] var53 = this.method4033(var1, var2);
      float var10 = var1.player.getYaw();
      float var11 = var1.player.getPitch();
      boolean var12 = this.onlyYawSetting.method2200();
      double var13 = MathHelper.wrapDegrees(var53[0] - var10);
      double var15 = var53[1] - var11;
      double var17;
      if (var12) {
         double var19 = var6 ? 8.0 + var5.nextDouble(4.0) : 10.0;
         double var21 = Math.abs(var15);
         if (var21 > var19) {
            double var23 = var6 ? 0.06 + var5.nextDouble(0.06) : 0.08;
            var17 = (var15 - Math.signum(var15) * var19) * var23;
         } else {
            var17 = 0.0;
         }
      } else {
         var17 = var15;
      }

      double var54 = var12 ? Math.abs(var13) : Math.sqrt(var13 * var13 + var17 * var17);
      if (var54 < 0.05) {
         this.aimYawVelocity *= 0.35;
         this.aimPitchVelocity *= 0.35;
      } else {
         double var55 = this.speedSetting.method2082() * (var6 ? this.speedMultiplier : 1.0);
         double var56 = MathHelper.clamp((this.smoothnessSetting.method2082() - 1.0) / 9.0, 0.0, 1.0);
         double var25 = MathHelper.clamp(var54 / 35.0, 0.0, 1.0);
         double var27 = 1.0 - var56 * 0.18 + var25 * 0.18;
         double var29 = 1.0 - var56 * 0.85;
         double var31 = MathHelper.clamp((var7 - this.targetAcquiredAtMs) / 180.0, 0.0, 1.0);
         double var33 = (0.012 + var55 * 0.0026) * (0.45 + var31 * 0.55) * var27;
         double var35 = (var6 ? 0.74 : 0.78) - var56 * 0.035;
         double var37 = (0.55 + var55 * 0.5) * (1.0 + var25 * 0.55 - var56 * 0.04);
         double var39 = (0.36 + var55 * 0.36) * (1.0 + var25 * 0.42 - var56 * 0.04);
         if (var54 > 25.0) {
            double var41 = MathHelper.clamp((var54 - 25.0) / 55.0, 0.0, 1.0);
            var33 *= 1.0 + var41 * 0.55;
            var37 *= 1.0 + var41 * 0.35;
            var39 *= 1.0 + var41 * 0.25;
         }

         this.aimYawVelocity += var13 * var33 * var3;
         this.aimPitchVelocity += var17 * var33 * var3;
         this.aimYawVelocity *= var35;
         this.aimPitchVelocity *= var35;
         this.aimYawVelocity = MathHelper.clamp(this.aimYawVelocity, -var37, var37);
         this.aimPitchVelocity = MathHelper.clamp(this.aimPitchVelocity, -var39, var39);
         if (Math.abs(var13) < 1.2) {
            this.aimYawVelocity *= 0.55;
         }

         if (Math.abs(var17) < 1.2) {
            this.aimPitchVelocity *= 0.55;
         }

         double var57 = this.aimYawVelocity;
         double var43 = this.aimPitchVelocity;
         if (var6) {
            this.yawWavePhase = this.yawWavePhase + this.yawWaveSpeed * 0.45;
            this.pitchWavePhase = this.pitchWavePhase + this.pitchWaveSpeed * 0.45;
            var57 += Math.sin(this.yawWavePhase) * 0.012 * var29;
            var43 += Math.cos(this.pitchWavePhase) * 0.008 * var29;
         }

         double var45 = 0.62 - var56 * 0.22 + var25 * 0.22;
         var57 = this.method4044(this.previousYawStep, var57, var45);
         var43 = this.method4044(this.previousPitchStep, var43, var45);
         double var47 = 1.0 - var56 * 0.1 + var25 * 0.3;
         double var49 = (var6 ? 0.2 + var55 * 0.22 : 0.2 + var55 * 0.26) * var47;
         double var51 = (var6 ? 0.1 + var55 * 0.16 : 0.1 + var55 * 0.2) * var47;
         var57 = this.method4043(var57, this.previousYawStep, var49);
         var43 = this.method4043(var43, this.previousPitchStep, var51);
         var57 = this.method4045(var57, var13);
         var43 = this.method4045(var43, var17);
         this.previousYawStep = var57;
         this.previousPitchStep = var43;
         if (!(Math.abs(var57) < 0.003) || !(Math.abs(var43) < 0.003)) {
            var1.player.setYaw(var10 + (float)var57);
            var1.player.setPitch(MathHelper.clamp(var11 + (float)var43, -90.0F, 90.0F));
         }
      }
   }

   private Entity method4028(MinecraftClient var1) {
      if (this.target instanceof LivingEntity var2 && this.method4029(var1, this.target, var2)) {
         return this.target;
      } else {
         double var19 = this.distanceSetting.method2082();
         double var4 = this.fovSetting.method2082() / 2.0;
         boolean var6 = this.prioritySetting.method2385("Здоровье");
         Entity var7 = null;
         double var8 = Double.MAX_VALUE;
         Vec3d var10 = var1.player.getEyePos();
         Vec3d var11 = var1.player.getRotationVec(1.0F);

         for (Entity var13 : var1.world.getEntities()) {
            if (var13 instanceof LivingEntity var14 && this.method4030(var13, var14)) {
               double var15 = var1.player.distanceTo(var13);
               if (!(var15 > var19)
                  && !(var15 < 0.5)
                  && (!this.wallCheckSetting.method2200() || !this.method4042(var1, var10, this.method4031(var13)))
                  && !(this.method4032(var10, var11, var13) > var4)) {
                  double var17 = var6 ? var14.getHealth() : var15;
                  if (var17 < var8) {
                     var8 = var17;
                     var7 = var13;
                  }
               }
            }
         }

         return var7;
      }
   }

   private boolean method4029(MinecraftClient var1, Entity var2, LivingEntity var3) {
      if (var2.isAlive() && this.method4030(var2, var3)) {
         double var4 = var1.player.distanceTo(var2);
         if (!(var4 > this.distanceSetting.method2082()) && !(var4 < 0.5)) {
            Vec3d var6 = var1.player.getEyePos();
            Vec3d var7 = var1.player.getRotationVec(1.0F);
            return this.method4032(var6, var7, var2) > this.fovSetting.method2082() / 2.0
               ? false
               : !this.wallCheckSetting.method2200() || !this.method4042(var1, var6, this.method4031(var2));
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean method4030(Entity var1, LivingEntity var2) {
      MinecraftClient var3 = MinecraftClient.getInstance();
      if (var3.player == null || var1 == var3.player || !var1.isAlive() || var2.getHealth() <= 0.0F) {
         return false;
      } else if (this.onlyPlayersSetting.method2200() && !(var1 instanceof PlayerEntity)) {
         return false;
      } else if (!this.hitInvisibleSetting.method2200() && var2.isInvisible()) {
         return false;
      } else if (var1 instanceof PlayerEntity var4) {
         if (AntiBot.method4604().method4615(var4)) {
            return false;
         } else {
            boolean var5 = this.method4041(var2);
            if (this.onlyArmoredSetting.method2200() && !var5) {
               return false;
            } else if (this.ignoreNakedSetting.method2200() && !var5) {
               return false;
            } else {
               return Helper309.method3075(var4)
                  ? this.targetType.method2588("Friends")
                  : this.targetType.method2588("Players") || !var5 && this.targetType.method2588("Naked Players");
            }
         }
      } else if (var1 instanceof AnimalEntity) {
         return this.targetType.method2588("Animals");
      } else if (var1 instanceof MobEntity) {
         return this.targetType.method2588("Mobs");
      } else {
         return var1 instanceof ArmorStandEntity ? this.targetType.method2588("Armor Stand") : false;
      }
   }

   private Vec3d method4031(Entity var1) {
      return var1.getPos().add(0.0, var1.getHeight() * this.aimHeightSetting.method2082(), 0.0);
   }

   private double method4032(Vec3d var1, Vec3d var2, Entity var3) {
      Vec3d var4 = this.method4031(var3).subtract(var1);
      double var5 = var4.length();
      if (var5 < 0.001) {
         return 0.0;
      } else {
         var4 = var4.multiply(1.0 / var5);
         double var7 = var2.x * var4.x + var2.y * var4.y + var2.z * var4.z;
         return Math.toDegrees(Math.acos(MathHelper.clamp(var7, -1.0, 1.0)));
      }
   }

   private double[] method4033(MinecraftClient var1, Entity var2) {
      Vec3d var3 = var1.player.getEyePos();
      boolean var4 = this.microMovementsSetting.method2200();
      double var5 = this.aimHeightSetting.method2082();
      double var7 = var4 ? var5 + this.heightNoise : var5;
      double var9 = 0.0;
      double var11 = 0.0;
      double var13 = 0.0;
      if (this.multipointSetting.method2200()) {
         double var15 = var2.getWidth() * 0.5;
         var9 = this.currentPointX * var15;
         var11 = this.currentPointY;
         var13 = this.currentPointZ * var15;
      }

      double var32 = MathHelper.clamp(var7 + var11, 0.05, 0.95);
      Vec3d var17 = var2.getPos().add(var9, var2.getHeight() * var32, var13);
      double var18 = var17.x - var3.x;
      double var20 = var17.y - var3.y;
      double var22 = var17.z - var3.z;
      double var24 = Math.sqrt(var18 * var18 + var22 * var22);
      double var26 = var24 < 0.001 ? var1.player.getYaw() : Math.toDegrees(Math.atan2(-var18, var22));
      double var28 = Math.sqrt(var18 * var18 + var20 * var20 + var22 * var22);
      double var30 = var28 < 0.001 ? var1.player.getPitch() : -Math.toDegrees(Math.asin(MathHelper.clamp(var20 / var28, -1.0, 1.0)));
      return new double[]{var26, var30};
   }

   private void method4034(Event20 var1) {
      if (this.drawFovRadiusSetting.method2200() && mc.player != null && mc.world != null && mc.currentScreen == null && mc.getWindow() != null) {
         int var2 = mc.getWindow().getScaledWidth();
         int var3 = mc.getWindow().getScaledHeight();
         float var4 = this.method4035(var2, var3);
         if (!(var4 < 1.0F)) {
            float var5 = var4 * 2.0F;
            int var6 = this.target != null ? Helper133.method1148(127, 242, 255, 165) : Helper133.method1148(255, 255, 255, 95);
            arc.method677(
               Helper80.method841(var1.method4058().getMatrices(), var2 * 0.5F - var4, var3 * 0.5F - var4, var5, var5)
                  .method826(0.5F)
                  .method835(0.01F)
                  .method837(360.0F)
                  .method823(var6)
                  .method840()
            );
         }
      }
   }

   private float method4035(int var1, int var2) {
      float var3 = Math.max(0.0F, Math.min(var1, var2) * 0.5F - 2.0F);
      if (var3 <= 0.0F) {
         return 0.0F;
      } else {
         double var4 = this.fovSetting.method2082();
         double var6 = MathHelper.clamp((double)mc.options.getFov().getValue().intValue(), 30.0, 170.0);
         if (var4 >= var6) {
            return var3;
         } else {
            double var8 = MathHelper.clamp(var4 * 0.5, 0.1, 89.9);
            double var10 = MathHelper.clamp(var6 * 0.5, 1.0, 89.9);
            double var12 = Math.tan(Math.toRadians(var8)) / Math.tan(Math.toRadians(var10)) * (Math.min(var1, var2) * 0.5);
            return (float)MathHelper.clamp(var12, 0.0, (double)var3);
         }
      }
   }

   private void method4036() {
      this.worldKey = null;
      this.method4037();
   }

   private void method4037() {
      this.target = null;
      this.targetAcquiredAtMs = 0L;
      this.lastFrameNs = 0L;
      this.lastRenderAimNs = 0L;
      this.previousYawStep = 0.0;
      this.previousPitchStep = 0.0;
      this.aimYawVelocity = 0.0;
      this.aimPitchVelocity = 0.0;
      this.currentPointX = 0.0;
      this.currentPointY = 0.0;
      this.currentPointZ = 0.0;
      this.nextPointX = 0.0;
      this.nextPointY = 0.0;
      this.nextPointZ = 0.0;
      this.nextPointChangeAtMs = 0L;
      this.method4038();
   }

   private void method4038() {
      ThreadLocalRandom var1 = ThreadLocalRandom.current();
      this.yawWavePhase = var1.nextDouble(Math.PI * 2);
      this.pitchWavePhase = var1.nextDouble(Math.PI * 2);
      this.yawWaveSpeed = var1.nextDouble(0.08, 0.25);
      this.pitchWaveSpeed = var1.nextDouble(0.06, 0.2);
      this.speedMultiplier = var1.nextDouble(0.75, 1.25);
      this.heightNoise = var1.nextDouble(-0.02, 0.02);
      this.heightNoiseUpdatedAtMs = System.currentTimeMillis();
      this.pointLerpSpeed = var1.nextDouble(0.025, 0.065);
      this.method4039(var1);
   }

   private void method4039(ThreadLocalRandom var1) {
      this.nextPointX = var1.nextDouble(-0.35, 0.35);
      this.nextPointY = var1.nextDouble(-0.12, 0.12);
      this.nextPointZ = var1.nextDouble(-0.35, 0.35);
      this.nextPointChangeAtMs = System.currentTimeMillis() + var1.nextLong(600L, 1900L);
      this.pointLerpSpeed = var1.nextDouble(0.008, 0.025);
   }

   private boolean method4040(MinecraftClient var1) {
      if (var1.player == null) {
         return false;
      } else {
         Item var2 = var1.player.getMainHandStack().getItem();
         return var2 instanceof SwordItem || var2 instanceof AxeItem || var2 instanceof TridentItem || var2 instanceof MaceItem;
      }
   }

   private boolean method4041(LivingEntity var1) {
      for (EquipmentSlot var5 : new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET}) {
         ItemStack var6 = var1.getEquippedStack(var5);
         if (!var6.isEmpty()) {
            return true;
         }
      }

      return false;
   }

   private boolean method4042(MinecraftClient var1, Vec3d var2, Vec3d var3) {
      if (var1.world != null && var1.player != null) {
         BlockHitResult var4 = var1.world.raycast(new RaycastContext(var2, var3, ShapeType.COLLIDER, FluidHandling.NONE, var1.player));
         if (var4.getType() == Type.MISS) {
            return false;
         } else {
            BlockState var5 = var1.world.getBlockState(var4.getBlockPos());
            return !var5.getCollisionShape(var1.world, var4.getBlockPos()).isEmpty();
         }
      } else {
         return false;
      }
   }

   private double method4043(double var1, double var3, double var5) {
      double var7 = var1 - var3;
      return Math.abs(var7) > var5 ? var3 + Math.signum(var7) * var5 : var1;
   }

   private double method4044(double var1, double var3, double var5) {
      double var7 = MathHelper.clamp(var5, 0.05, 1.0);
      return var1 + (var3 - var1) * var7;
   }

   private double method4045(double var1, double var3) {
      return Math.abs(var1) > Math.abs(var3) ? var3 : var1;
   }
}
