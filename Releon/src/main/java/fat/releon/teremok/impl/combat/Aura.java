package fat.releon.teremok.impl.combat;

import antidaunleak.api.annotation.Native;
import fat.releon.Releon;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import l.Helper80;
import l.Helper104;
import l.Helper128;
import l.Helper133;
import l.Helper147;
import l.Helper153;
import l.Helper160;
import l.Helper183;
import l.Notifications;
import l.Hud;
import l.Helper222;
import l.Setting2;
import l.TargetStrafe;
import l.Setting3;
import l.Helper242;
import l.TargetEsp;
import l.Setting5;
import l.Setting8;
import l.Helper264;
import l.Helper269;
import l.CakeWorld;
import l.HolyWorld;
import l.Legit;
import l.HvH;
import l.AI;
import l.Helper326;
import l.Helper328;
import l.Helper329;
import l.Helper331;
import l.Helper334;
import l.Helper335;
import l.Helper336;
import l.Helper339;
import l.FakeAngleToLonyGrief;
import l.Helper341;
import l.Helper346;
import l.Helper349;
import l.AiNew;
import l.Linear;
import l.Helper351;
import l.FunTimeSnap2;
import l.Helper353;
import l.Snap;
import l.SpookyTime;
import l.ReallyWorld;
import l.Matrix2;
import l.Event8;
import l.Event10;
import l.Helper379;
import l.Helper383;
import l.Helper386;
import l.Event20;
import l.Helper38;
import l.Event28;
import l.Neuro2;
import l.Helper426;
import l.AutoSprint;
import l.ElytraTarget;
import l.Helper433;
import l.TargetHud;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket.Mode;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.network.packet.s2c.play.GameJoinS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket;
import net.minecraft.text.Text;
import net.minecraft.util.Pair;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Aura extends Helper242 {
   private static final double FT_GRIM_MIN_RADIUS = 0.1;
   private Helper329 targetSelector = new Helper329();
   private Helper346 pointFinder = new Helper346();
   private LivingEntity target;
   private LivingEntity lastTarget;
   private int reducedHitboxAttackCounter = 0;
   private long activationTimeMs = 0L;
   public static boolean fakeRotate;
   public static float legitSprintNeed;
   private Helper326 cachedConfig;
   private Box cachedHitbox;
   private Vec3d cachedPoint;
   private Aura.FovCircleRenderer fovCircleRenderer;
   private Setting5 aimMode = new Setting5("Наводка", "Выберите тип наводки")
      .method2381("FunTimeTest", "Legit Snap", "ReallyWorld", "HolyWorld", "SpookyTime", "Matrix", "Snap")
      .method2383("FunTimeTest");
   private Setting8 targetType = new Setting8("Тип таргета", "Фильтрует весь список целей по типу")
      .method2585("Players", "Naked Players", "Mobs", "Animals", "Friends", "Armor Stand")
      .method2586("Players", "Mobs", "Animals");
   private Setting2 attackRange = new Setting2("Дистанция удара", "Дальность атаки до цели").method2086(3.0F).method2078(1.0F, 6.0F);
   private Setting2 lookRange = new Setting2("Дополнительная дистанция поиска", "Диапазон поиска до цели").method2086(1.5F).method2078(0.0F, 2.0F);
   private Setting2 snapHold = new Setting2("Snap Hold", "Задержка возврата после удара")
      .method2086(50.0F)
      .method2078(1.0F, 300.0F)
      .method2081(() -> this.aimMode.method2385("Snap"));
   private Setting2 snapSpeed = new Setting2("Snap Speed", "Скорость наведения и возврата")
      .method2086(50.0F)
      .method2078(15.0F, 180.0F)
      .method2081(() -> this.aimMode.method2385("Snap"));
   private Setting2 cakeSmoothing = new Setting2("Smoothing", "Smoothing")
      .method2086(1.0F)
      .method2078(0.01F, 5.0F)
      .method2081(() -> this.aimMode.method2385("Legit"));
   private Setting2 cakeMaxYawStep = new Setting2("Yaw Step", "Maximum yaw")
      .method2086(180.0F)
      .method2078(1.0F, 1000.0F)
      .method2081(() -> this.aimMode.method2385("Legit"));
   private Setting2 cakeMaxPitchStep = new Setting2("Pitch Step", "Maximum pitch")
      .method2086(90.0F)
      .method2078(1.0F, 1000.0F)
      .method2081(() -> this.aimMode.method2385("Legit"));
   private Setting8 attackSetting = new Setting8("Настройки", "Позволяет настроить работу функции")
      .method2585("Only Critical", "Break Shield", "UnPress Shield", "No Attack When Eat", "Ignore The Walls", "Fake Lag", "Hit Chance")
      .method2586("Only Critical");
   private Setting2 hitChance = new Setting2("Шанс удара в %", "Шанс удара по цели")
      .method2086(100.0F)
      .method2078(1.0F, 100.0F)
      .method2081(() -> this.attackSetting.method2588("Hit Chance"));
   private Setting3 onlySword = new Setting3("Только с мечом", "Атаковать только если в главной руке меч").method2201(true);
   private Setting5 correctionType = new Setting5("Коррекции движения", "Выбор коррекции движения игрока")
      .method2381("Free", "Focused", "Target", "Not visible")
      .method2383("Free");
   private Setting5 sprintReset = new Setting5("Режим спринта°", "").method2381("Legit", "SpookyTime").method2383("Legit");
   private Setting3 smartCrits = new Setting3("Удары на земле", "Криты только при нажатии пробела")
      .method2201(false)
      .method2199(() -> this.attackSetting.method2588("Only Critical"));
   private Setting3 tpsSync = new Setting3("Синхронизация с TPS", "Подгоняет тайминги под текущий TPS сервера").method2201(true);
   private Setting3 noAttack = new Setting3("Не атаковать", "Полностью отключает удары").method2201(false);
   private final List<Packet<?>> packets = new CopyOnWriteArrayList<>();
   private Box box;
   public static int tickStop = -1;
   private final Helper339 spookyCritPauseTimer = new Helper339();
   private int lastSpookyPauseCount = -1;
   public static boolean shouldRotate;
   public boolean elytraStateForward = false;

   public static Aura getInstance() {
      return Helper222.method1979(Aura.class);
   }

   public Aura() {
      super("KillAura", Helper269.COMBAT);
      this.setup(
         new Helper264[]{
            this.aimMode,
            this.correctionType,
            this.targetType,
            this.attackRange,
            this.lookRange,
            this.snapHold,
            this.snapSpeed,
            this.sprintReset,
            this.cakeSmoothing,
            this.cakeMaxYawStep,
            this.cakeMaxPitchStep,
            this.hitChance,
            this.attackSetting,
            this.smartCrits,
            this.tpsSync,
            this.onlySword,
            this.noAttack
         }
      );
      this.fovCircleRenderer = new Aura.FovCircleRenderer();
      Releon.method71().method15().method1016(this.fovCircleRenderer);
   }

   public boolean neuroEnabled() {
      return false;
   }

   public boolean neuroExec() {
      return false;
   }

   public boolean neuroShakeEnabled() {
      return false;
   }

   public float neuroSmoothValue() {
      return 0.76F;
   }

   @Override
   public void activate() {
      this.activationTimeMs = System.currentTimeMillis();
      Helper331 var1 = Releon.method71().method33().method3250();
      var1.method3287(0);
      Helper341 var2 = Helper341.method3373();
      var2.method3374(83L);
      var2.method3377();
      this.lastSpookyPauseCount = -1;
      this.spookyCritPauseTimer.method3358();
      this.reducedHitboxAttackCounter = 0;
   }

   @Override
   public void deactivate() {
      this.activationTimeMs = 0L;
      Helper351 var1 = Helper351.INSTANCE;
      this.targetSelector.method3258();
      this.target = null;
      this.lastTarget = null;
      Helper341.method3373().method3377();
      var1.method3493(null);
      this.finishRotationAfterTargetLoss(var1);
      this.restoreSprintAfterCombat();
      this.clearCombatVisualsIfNeeded();
      this.packets.forEach(Helper38::method525);
      this.packets.clear();
      super.deactivate();
   }

   private void restoreSprintAfterCombat() {
      if (mc.player != null) {
         AutoSprint.tickStop = -1;
      }
   }

   private void clearCombatVisualsIfNeeded() {
      if (!TriggerBot.getInstance().isState()) {
         TargetHud var1 = Releon.method71().method26().method790(TargetHud.class);
         if (var1 != null) {
            var1.method4915();
         }

         TargetEsp var2 = TargetEsp.method2330();
         if (var2 != null) {
            var2.method2333();
         }
      }
   }

   private float tpsFactor() {
      if (!this.getTpsSync().method2200()) {
         return 1.0F;
      } else {
         float var1 = MathHelper.clamp(Helper128.TPS, 1.0F, 20.0F);
         return (int)Math.floor(var1) > 19 ? 1.0F : 20.0F / var1;
      }
   }

   private int syncTicks(int var1) {
      return Math.max(1, Math.round(var1 * this.tpsFactor()));
   }

   private long syncMs(long var1) {
      return Math.max(1L, (long)Math.round((float)var1 * this.tpsFactor()));
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      if (var1.method3895() instanceof EntityStatusS2CPacket var2 && var2.getStatus() == 30) {
         Entity var8 = var2.getEntity(mc.world);
         if (var8 != null && var8.equals(this.target) && Hud.method1824().notificationSettings.method2588("Break Shield")) {
            Notifications.method1666().method1669(Text.literal("Сломали щит игроку - ").append(var8.getDisplayName()), 5000L);
         }
      }

      if (this.attackSetting.method2588("Fake Lag") && this.target != null) {
         if (Helper38.method549()) {
            return;
         }

         Packet var10000 = var1.method3895();
         Objects.requireNonNull(var10000);
         Object var7 = var10000;
         switch (var7) {
            case PlayerRespawnS2CPacket var4:
               this.setState(false);
               break;
            case GameJoinS2CPacket var5:
               this.setState(false);
               break;
            case ClientStatusC2SPacket var6 when var6.getMode().equals(Mode.PERFORM_RESPAWN):
               this.setState(false);
               break;
            default:
               if (var1.method3894() && tickStop < 0) {
                  this.packets.add(var1.method3895());
                  var1.method582();
               }
         }
      }
   }

   @Helper104
   public void onWorldRender(Event10 var1) {
      if (this.box != null && this.attackSetting.method2588("Fake Lag") && this.target != null) {
         Helper183.method1545(this.box, Helper133.method1162(), 1.0F);
      }
   }

   @Helper104
   public void tick(Event8 var1) {
      if (!Helper38.method549()) {
         Helper426.method4381();
         if (this.target != null) {
            tickStop--;
            if (tickStop >= 0 && !this.packets.isEmpty() && this.attackSetting.method2588("Fake Lag")) {
               this.box = mc.player.getBoundingBox();
               this.packets.forEach(Helper38::method525);
               this.packets.clear();
            }

            if (mc.player.distanceTo(this.target) > this.attackRange.method2082() && this.attackSetting.method2588("Fake Lag")) {
               this.packets.forEach(Helper38::method525);
               this.packets.clear();
            }
         }
      }
   }

   @Helper104
   public void onRotationUpdate(Event28 var1) {
      if (Helper383.method3884()) {
         this.target = null;
      } else {
         try {
            if (this.aimMode.method2385("FunTimeTest") && Releon.method71().method35() != null) {
               Releon.method71().method35().method931();
            }
         } catch (Exception var3) {
         }

         switch (var1.method4225()) {
            case 0:
               LivingEntity var2 = this.target;
               this.target = this.updateTarget();
               if (this.target != null) {
                  this.rotateToTarget(this.getConfig());
                  this.lastTarget = this.target;
               } else if (var2 != null) {
                  this.finishRotationAfterTargetLoss(Helper351.INSTANCE);
               }
               break;
            case 2:
               if (this.aimMode.method2385("SpookyTime")) {
                  this.syncRealCameraInWater();
               }

               if (this.target != null && !this.noAttack.method2200()) {
                  if (this.shouldPauseSpookyAttack()) {
                     return;
                  }

                  this.performAuraAttack(this.getConfig());
               }
         }
      }
   }

   private void finishRotationAfterTargetLoss(Helper351 var1) {
      if (this.aimMode.method2385("SpookyTime")) {
         var1.method3511();
      } else {
         var1.method3510();
      }
   }

   private void syncRealCameraInWater() {
      if (this.target == null || mc.player == null || !mc.player.isTouchingWater()) {
         ;
      }
   }

   private boolean shouldPauseSpookyAttack() {
      if (!this.aimMode.method2385("SpookyTime")) {
         return false;
      } else {
         Helper331 var1 = Releon.method71().method33().method3250();
         int var2 = var1.method3291();
         if (var2 > 0 && var2 % 1000 == 0) {
            if (this.lastSpookyPauseCount != var2) {
               this.lastSpookyPauseCount = var2;
               this.spookyCritPauseTimer.method3358();
            }

            return !this.spookyCritPauseTimer.method3356(700.0);
         } else {
            return false;
         }
      }
   }

   private LivingEntity updateTarget() {
      Helper328 var1 = new Helper328(this.targetType.method2590());
      float var2 = this.getTargetSearchRange();
      boolean var3 = this.effectiveIgnoreWalls();
      float var4 = this.aimMode.method2385("Legit Snap") ? 30.0F : 360.0F;
      this.targetSelector.method3260(mc.world.getEntities(), var2, var4, var3);
      this.targetSelector.method3259(var1::method3251);
      return this.targetSelector.method3264();
   }

   private float getTargetSearchRange() {
      return mc.player.isGliding() && ElytraTarget.method4451().isState()
         ? ElytraTarget.method4451().elytraFindRange.method2082()
         : this.attackRange.method2082() + this.lookRange.method2082();
   }

   @Native(
      type = Native.Type.VMProtectBeginMutation
   )
   private void rotateToTarget(Helper326 var1) {
      if (var1 != null && this.target != null) {
         Helper331 var2 = Releon.method71().method33().method3250();
         Helper351 var3 = Helper351.INSTANCE;
         Helper335 var4 = new Helper335(var1.method3236(), var1.method3236().method3329());
         Helper334 var5 = this.getRotationConfig();
         boolean var6 = mc.player.isGliding() && this.attackSetting.method2588("Elytra possibilities");
         if (fakeRotate) {
            FakeAngleToLonyGrief var7 = new FakeAngleToLonyGrief();
            Helper336 var8 = var7.method3146(var3.method3483(), var4.method3323(), var4.method3324(), this.target);
            var3.method3493(var8);
         }

         fakeRotate = false;
         String var9 = this.aimMode.method2386();
         switch (var9) {
            case "FunTimeTest":
               var3.method3500(var4, this.target, 1, var5, Helper153.HIGH_IMPORTANCE_1, this);
               break;
            case "HolyWorld":
               if (var2.method3283(var1, this.syncTicks(10)) || !var2.method3288().method3356(this.syncMs(150L))) {
                  var3.method3500(var4, this.target, this.fastReset(10), var5, Helper153.HIGH_IMPORTANCE_1, this);
               }
               break;
            case "Legit Snap":
               if (var2.method3283(var1, this.syncTicks(1)) || !var2.method3288().method3356(this.syncMs(40L))) {
                  var3.method3500(var4, this.target, this.fastReset(1), var5, Helper153.HIGH_IMPORTANCE_1, this);
               }
               break;
            case "ReallyWorld":
            case "SpookyTime":
            case "Legit":
            case "CakeWorld":
            case "NeuroAngle":
            case "Ai":
            case "Snap":
            case "Matrix":
            case "AiNew":
               var3.method3500(var4, this.target, 0, var5, Helper153.HIGH_IMPORTANCE_1, this);
         }

         if (shouldRotate && !this.aimMode.method2385("TriggerBot")) {
            var3.method3500(var4, this.target, this.fastReset(1), var5, Helper153.HIGH_IMPORTANCE_1, this);
         }

         if (var6 && !this.aimMode.method2385("TriggerBot")) {
            var3.method3500(var4, this.target, this.fastReset(1), var5, Helper153.HIGH_IMPORTANCE_1, this);
         }
      }
   }

   private int fastReset(int var1) {
      return var1 <= 1 ? 0 : Math.max(1, var1 / 3);
   }

   public Helper326 getConfig() {
      if (this.target != null && mc.player != null) {
         double var1 = mc.player.distanceTo(this.target);
         double var3;
         if (this.aimMode.method2385("SpookyTime")) {
            double var5 = 5.0;
            double var7 = 0.4;
            var3 = Math.max(var7, var1 / var5);
         } else {
            var3 = Math.max(1.0, Math.min(2.0, var1 / 4.0));
         }

         float var16 = this.attackRange.method2082();
         Vec3d var6 = this.aimMode.method2385("FunTimeTest") ? this.getSmoothMode().method3149() : this.getSmoothMode().method3149().multiply(var3);
         boolean var17 = this.effectiveIgnoreWalls();
         Pair var8 = this.pointFinder.method3385(this.target, var16, Helper351.INSTANCE.method3483(), var6, var17);
         Vec3d var9 = (Vec3d)var8.getLeft();
         Box var10 = this.adjustAttackBox((Box)var8.getRight());
         if (mc.player.isGliding() && this.target.isGliding()) {
            Vec3d var11 = this.target.getVelocity();
            double var12 = var11.horizontalLength();
            float var14 = 0.0F;
            if (ElytraTarget.shouldElytraTarget) {
               var14 = ElytraTarget.method4451().elytraForward.method2082();
            }

            if (var12 > 0.35) {
               Vec3d var15 = this.target.getPos().add(var11.multiply(var14));
               var9 = var15.add(0.0, this.target.getHeight() / 2.0F, 0.0);
               var10 = new Box(
                  var15.x - this.target.getWidth() / 2.0F,
                  var15.y,
                  var15.z - this.target.getWidth() / 2.0F,
                  var15.x + this.target.getWidth() / 2.0F,
                  var15.y + this.target.getHeight(),
                  var15.z + this.target.getWidth() / 2.0F
               );
               var10 = this.adjustAttackBox(var10);
            }
         }

         Helper336 var19 = Helper349.method3469(var9.subtract(Objects.requireNonNull(mc.player).getEyePos()));
         return new Helper326(this.target, var19, var16, this.attackSetting.method2590(), this.aimMode, var10);
      } else {
         return null;
      }
   }

   private Box adjustAttackBox(Box var1) {
      if (var1 != null && this.shouldUseReducedHitbox()) {
         Vec3d var2 = var1.getCenter();
         double var3 = Math.max(var1.getLengthX() * 0.4, 0.01);
         double var5 = Math.max(var1.getLengthZ() * 0.4, 0.01);
         return new Box(var2.x - var3, var1.minY, var2.z - var5, var2.x + var3, var1.maxY, var2.z + var5);
      } else {
         return var1;
      }
   }

   private boolean shouldUseReducedHitbox() {
      return false;
   }

   private void performAuraAttack(Helper326 var1) {
      if (var1 != null && this.target != null && !(mc.player.distanceTo(this.target) > this.attackRange.method2082())) {
         Helper331 var2 = Releon.method71().method33().method3250();
         int var3 = var2.method3291();
         Releon.method71().method33().method3247(var1);
         int var4 = var2.method3291() - var3;
         if (var4 > 0) {
            this.reducedHitboxAttackCounter += var4;
         }
      }
   }

   public boolean effectiveIgnoreWalls() {
      return this.attackSetting.method2588("Ignore The Walls");
   }

   @Native(
      type = Native.Type.VMProtectBeginMutation
   )
   public Helper334 getRotationConfig() {
      boolean var1 = !this.correctionType.method2385("Not visible");
      boolean var2 = !this.aimMode.method2385("Legit") && this.correctionType.method2385("Free");
      if (TargetStrafe.method2175().isState() && TargetStrafe.method2175().mode.method2385("Grim") && this.target != null) {
         var2 = false;
      }

      boolean var3 = false;
      return new Helper334(this.getSmoothMode(), var1, var2, var3);
   }

   @Helper104
   public void onmotion(Helper433 var1) {
   }

   @Helper104
   public void onInput(Helper379 var1) {
      if (!Helper38.method549() && this.isState() && mc.currentScreen == null) {
         Helper326 var2 = this.getConfig();
         Helper331 var3 = Releon.method71().method33().method3250();
         boolean var4 = mc.player.isTouchingWater() || mc.player.isSubmergedInWater();
         boolean var5 = this.target != null
            && var2 != null
            && var3.method3283(var2, 1)
            && mc.player.distanceTo(this.target) <= this.attackRange.method2082()
            && !var4;
         if (var5 && this.correctionType.method2385("Focused")) {
            var1.method3763(false, false, false, false);
         }

         if (var5 && !this.correctionType.method2385("Focused")) {
            var1.method3765(false);
            mc.player.setSprinting(false);
         }

         if (this.target != null
            && var2 != null
            && var3.method3283(var2, 1)
            && mc.player.distanceTo(this.target) <= this.attackRange.method2082()
            && !mc.player.isSwimming()) {
            var1.method3763(false, false, false, false);
         }

         if (!this.correctionType.method2385("Free")) {
            TargetStrafe var6 = TargetStrafe.method2175();
            if (this.correctionType.method2385("Target") && !var6.isState()) {
               var6.method2180(var1, this.target);
            }

            if (!var6.isState()) {
               ;
            }
         }
      }
   }

   public Helper353 getSmoothMode() {
      if (mc.player.isGliding() && this.attackSetting.method2588("Elytra possibilities") && !this.aimMode.method2385("Trigger Bot")) {
         return new Linear();
      } else {
         String var1 = this.aimMode.method2386();

         return (Helper353)(switch (var1) {
            case "FunTimeTest" -> FunTimeSnap2.INSTANCE;
            case "HolyWorld" -> new HolyWorld();
            case "HvH" -> new HvH();
            case "Legit" -> new Legit();
            case "SpookyTime" -> new SpookyTime();
            case "ReallyWorld" -> new ReallyWorld();
            case "NeuroAngle", "AI1" -> new Neuro2();
            case "CakeWorld" -> new CakeWorld();
            case "Legit Snap" -> new Snap();
            case "Matrix" -> new Matrix2();
            case "Snap" -> new Snap();
            case "Ai" -> new AI();
            case "AiNew" -> new AiNew();
            default -> new Linear();
         });
      }
   }

   public boolean usesFovCircle() {
      return this.aimMode.method2385("Legit Snap");
   }

   public void setTargetSelector(Helper329 var1) {
      this.targetSelector = var1;
   }

   public void setPointFinder(Helper346 var1) {
      this.pointFinder = var1;
   }

   public void setTarget(LivingEntity var1) {
      this.target = var1;
   }

   public void setLastTarget(LivingEntity var1) {
      this.lastTarget = var1;
   }

   public void setReducedHitboxAttackCounter(int var1) {
      this.reducedHitboxAttackCounter = var1;
   }

   public void setActivationTimeMs(long var1) {
      this.activationTimeMs = var1;
   }

   public void setCachedConfig(Helper326 var1) {
      this.cachedConfig = var1;
   }

   public void setCachedHitbox(Box var1) {
      this.cachedHitbox = var1;
   }

   public void setCachedPoint(Vec3d var1) {
      this.cachedPoint = var1;
   }

   public void setFovCircleRenderer(Aura.FovCircleRenderer var1) {
      this.fovCircleRenderer = var1;
   }

   public void setAimMode(Setting5 var1) {
      this.aimMode = var1;
   }

   public void setTargetType(Setting8 var1) {
      this.targetType = var1;
   }

   public void setAttackRange(Setting2 var1) {
      this.attackRange = var1;
   }

   public void setLookRange(Setting2 var1) {
      this.lookRange = var1;
   }

   public void setSnapHold(Setting2 var1) {
      this.snapHold = var1;
   }

   public void setSnapSpeed(Setting2 var1) {
      this.snapSpeed = var1;
   }

   public void setCakeSmoothing(Setting2 var1) {
      this.cakeSmoothing = var1;
   }

   public void setCakeMaxYawStep(Setting2 var1) {
      this.cakeMaxYawStep = var1;
   }

   public void setCakeMaxPitchStep(Setting2 var1) {
      this.cakeMaxPitchStep = var1;
   }

   public void setAttackSetting(Setting8 var1) {
      this.attackSetting = var1;
   }

   public void setHitChance(Setting2 var1) {
      this.hitChance = var1;
   }

   public void setOnlySword(Setting3 var1) {
      this.onlySword = var1;
   }

   public void setCorrectionType(Setting5 var1) {
      this.correctionType = var1;
   }

   public void setSprintReset(Setting5 var1) {
      this.sprintReset = var1;
   }

   public void setSmartCrits(Setting3 var1) {
      this.smartCrits = var1;
   }

   public void setTpsSync(Setting3 var1) {
      this.tpsSync = var1;
   }

   public void setNoAttack(Setting3 var1) {
      this.noAttack = var1;
   }

   public void setBox(Box var1) {
      this.box = var1;
   }

   public void setLastSpookyPauseCount(int var1) {
      this.lastSpookyPauseCount = var1;
   }

   public void setElytraStateForward(boolean var1) {
      this.elytraStateForward = var1;
   }

   public Helper329 getTargetSelector() {
      return this.targetSelector;
   }

   public Helper346 getPointFinder() {
      return this.pointFinder;
   }

   public LivingEntity getTarget() {
      return this.target;
   }

   public LivingEntity getLastTarget() {
      return this.lastTarget;
   }

   public int getReducedHitboxAttackCounter() {
      return this.reducedHitboxAttackCounter;
   }

   public long getActivationTimeMs() {
      return this.activationTimeMs;
   }

   public Helper326 getCachedConfig() {
      return this.cachedConfig;
   }

   public Box getCachedHitbox() {
      return this.cachedHitbox;
   }

   public Vec3d getCachedPoint() {
      return this.cachedPoint;
   }

   public Aura.FovCircleRenderer getFovCircleRenderer() {
      return this.fovCircleRenderer;
   }

   public Setting5 getAimMode() {
      return this.aimMode;
   }

   public Setting8 getTargetType() {
      return this.targetType;
   }

   public Setting2 getAttackRange() {
      return this.attackRange;
   }

   public Setting2 getLookRange() {
      return this.lookRange;
   }

   public Setting2 getSnapHold() {
      return this.snapHold;
   }

   public Setting2 getSnapSpeed() {
      return this.snapSpeed;
   }

   public Setting2 getCakeSmoothing() {
      return this.cakeSmoothing;
   }

   public Setting2 getCakeMaxYawStep() {
      return this.cakeMaxYawStep;
   }

   public Setting2 getCakeMaxPitchStep() {
      return this.cakeMaxPitchStep;
   }

   public Setting8 getAttackSetting() {
      return this.attackSetting;
   }

   public Setting2 getHitChance() {
      return this.hitChance;
   }

   public Setting3 getOnlySword() {
      return this.onlySword;
   }

   public Setting5 getCorrectionType() {
      return this.correctionType;
   }

   public Setting5 getSprintReset() {
      return this.sprintReset;
   }

   public Setting3 getSmartCrits() {
      return this.smartCrits;
   }

   public Setting3 getTpsSync() {
      return this.tpsSync;
   }

   public Setting3 getNoAttack() {
      return this.noAttack;
   }

   public List<Packet<?>> getPackets() {
      return this.packets;
   }

   public Box getBox() {
      return this.box;
   }

   public Helper339 getSpookyCritPauseTimer() {
      return this.spookyCritPauseTimer;
   }

   public int getLastSpookyPauseCount() {
      return this.lastSpookyPauseCount;
   }

   public boolean isElytraStateForward() {
      return this.elytraStateForward;
   }

   public static float getLegitSprintNeed() {
      return legitSprintNeed;
   }

   public class FovCircleRenderer implements Helper160 {
      private float currentScale = 1.0F;
      private float targetScale = 1.0F;
      private float cachedDynamicFov = 33.0F;
      private float lastFinalRadius = 0.0F;

      public FovCircleRenderer() {
      }

      @Helper104
      public void drawEvent(Event20 var1) {
         if (mc.player != null && Aura.this.usesFovCircle() && Aura.this.isState()) {
            if (mc.options.getPerspective().isFirstPerson()) {
               MatrixStack var2 = var1.method4058().getMatrices();
               float var3 = mc.getWindow().getScaledWidth() / 2.0F;
               float var4 = mc.getWindow().getScaledHeight() / 2.0F;
               double var5 = mc.options.getFov().getValue().intValue();
               var5 = MathHelper.clamp(var5, 30.0, 110.0);
               float var7 = (float)MathHelper.lerp((var5 - 30.0) / 80.0, 106.5, 65.0);
               float var8 = (float)(450.0 / var5);
               float var9 = var7 * var8;
               this.targetScale = mc.player.isSprinting() ? 0.9F : 1.0F;
               this.currentScale = Helper147.method1250(2.5, this.currentScale, this.targetScale);
               float var10 = var9 * this.currentScale;
               this.lastFinalRadius = var10;
               float var11 = (float)MathHelper.lerp((var5 - 30.0) / 80.0, 0.003, 0.015);
               arc.method677(
                  Helper80.method841(var2, var3 - var10 / 2.0F, var4 - var10 / 2.0F, var10, var10)
                     .method826(0.3F)
                     .method835(var11)
                     .method837(360.0F)
                     .method823(Helper133.method1148(255, 255, 255, 255))
                     .method840()
               );
               this.cachedDynamicFov = this.calculateDynamicFov();
            }
         }
      }

      private float calculateDynamicFov() {
         if (mc.player != null && mc.getWindow() != null) {
            double var1 = mc.options.getFov().getValue().intValue();
            var1 = MathHelper.clamp(var1, 30.0, 110.0);
            float var3 = mc.getWindow().getScaledWidth();
            float var4 = this.lastFinalRadius / 2.0F;
            double var5 = Math.toRadians(var1);
            double var7 = var3 / var5;
            double var9 = var4 / var7;
            float var11 = (float)Math.toDegrees(var9);
            var11 *= 2.0F;
            return MathHelper.clamp(var11, 36.0F, 360.0F);
         } else {
            return 33.0F;
         }
      }

      public float getCachedDynamicFov() {
         return this.cachedDynamicFov;
      }
   }
}
