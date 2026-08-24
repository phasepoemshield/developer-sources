package moscow.rockstar.module.combat;

import lombok.Generated;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import moscow.rockstar.Rockstar;
import moscow.rockstar.systems.event.EventListener;
import moscow.rockstar.systems.event.impl.game.EntityJumpEvent;
import moscow.rockstar.systems.event.impl.player.ClientPlayerTickEvent;
import moscow.rockstar.systems.localization.Localizator;
import moscow.rockstar.module.api.ModuleCategory;
import moscow.rockstar.module.api.ModuleInfo;
import moscow.rockstar.module.impl.BaseModule;
import moscow.rockstar.config.settings.BooleanSetting;
import moscow.rockstar.config.settings.ModeSetting;
import moscow.rockstar.config.settings.SelectSetting;
import moscow.rockstar.config.settings.SliderSetting;
import moscow.rockstar.systems.target.TargetComparators;
import moscow.rockstar.systems.target.TargetSettings;
import moscow.rockstar.util.animation.base.Animation;
import moscow.rockstar.util.animation.base.Easing;
import moscow.rockstar.util.game.CombatUtility;
import moscow.rockstar.util.game.EntityUtility;
import moscow.rockstar.util.game.TextUtility;
import moscow.rockstar.util.game.prediction.ElytraPredictionSystem;
import moscow.rockstar.util.game.prediction.FallingPlayer;
import moscow.rockstar.util.game.server.ServerUtility;
import moscow.rockstar.util.math.MathUtility;
import moscow.rockstar.util.math.PerlinNoise;
import moscow.rockstar.util.rotations.MoveCorrection;
import moscow.rockstar.util.rotations.Rotation;
import moscow.rockstar.util.rotations.RotationHandler;
import moscow.rockstar.util.rotations.RotationMath;
import moscow.rockstar.util.rotations.RotationPointUtil;
import moscow.rockstar.util.rotations.RotationPriority;
import moscow.rockstar.util.rotations.modes.FunTimeRotationMode;
import moscow.rockstar.util.rotations.modes.HolyWorldRotationMode;
import moscow.rockstar.util.rotations.modes.OneTickRotationMode;
import moscow.rockstar.util.rotations.modes.ReallyWorldRotationMode;
import moscow.rockstar.util.rotations.modes.SlimeWorldRotationMode;
import moscow.rockstar.util.rotations.modes.SpookyTimeRotationMode;
import moscow.rockstar.util.rotations.modes.SlothRotationMode;
import moscow.rockstar.util.mixins.BacktrackableEntity;
import moscow.rockstar.util.time.Timer;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.item.consume.UseAction;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket.Action;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.hit.HitResult.Type;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.RaycastContext.FluidHandling;
import net.minecraft.world.RaycastContext.ShapeType;
@ModuleInfo(name = "Aura", category = ModuleCategory.COMBAT, desc = "Автоматическая атака по ближайшим целям")
public class Aura extends BaseModule {
   private static final float AUTO_MACE_MIN_FALL_DISTANCE = 5.0F;
   private static final double AUTO_MACE_MIN_DOWNWARD_SPEED = -0.35D;

   private SliderSetting attackDistance;
   private SliderSetting aimDistance;
   private SliderSetting minCps;
   private SliderSetting maxCps;
   private SelectSetting targets;
   private SelectSetting.Value players;
   private SelectSetting.Value animals;
   private SelectSetting.Value mobs;
   private SelectSetting.Value invisibles;
   private SelectSetting.Value nakedPlayers;
   private SelectSetting.Value friends;
   private SelectSetting.Value rockUsers;
   private ModeSetting sortingMode;
   private ModeSetting.Value distanceSorting;
   private ModeSetting.Value healthSorting;
   private ModeSetting.Value fovSorting;
   private ModeSetting rotationMode;
   private ModeSetting.Value noRotation;
   private ModeSetting.Value simpleRotation;
   private ModeSetting.Value funTimeRotation;
   private ModeSetting.Value spookyTimeRotation;
   private ModeSetting.Value holyWorldRotation;
   private ModeSetting.Value vonTamRotation;
   private ModeSetting.Value intaveRotation;
   private ModeSetting.Value oneTickRotation;
   private ModeSetting.Value reallyWorldRotation;
   private ModeSetting.Value slimeWorldRotation;
   private ModeSetting.Value slothRotation;
   private ModeSetting.Value aiRotation;
   private ModeSetting sprintResetMode;
   private ModeSetting.Value sprintResetNone;
   private ModeSetting.Value sprintResetSmart;
   private ModeSetting.Value sprintResetNormal;
   private ModeSetting.Value sprintResetPacket;
   private ModeSetting moveCorrectionMode;
   private ModeSetting.Value noMoveCorrection;
   private ModeSetting.Value directMoveCorrection;
   private ModeSetting.Value silentMoveCorrection;
   private ModeSetting styleAttack;
   private ModeSetting.Value fastPvp;
   private ModeSetting.Value slowPvp;
   private ModeSetting criticalMode;
   private ModeSetting.Value newCriticals;
   private ModeSetting.Value oldCriticals;
   private SelectSetting targetingOptions;
   private SelectSetting.Value hitVectorMode;
   private SelectSetting.Value offhandHit;
   private SelectSetting.Value protectedPlayerCheck;
   private SelectSetting.Value strictTargeting;
   private SelectSetting.Value useHit;
   private SelectSetting.Value elytraTarget;
   private BooleanSetting onlyCriticals;
   private BooleanSetting walls;
   private BooleanSetting rayTrace;
   private BooleanSetting smartCriticals;
   private BooleanSetting noHitInv;
   private BooleanSetting onlyWeapon;
   private BooleanSetting autoMace;
   private BooleanSetting lavaCrits;
   private BooleanSetting syncTps;
   private BooleanSetting rwWallBypass;
   private BooleanSetting targeting;
   private SliderSetting autoMaceFallDistance;

   private final Animation nononoYaw = new Animation(300L, Easing.LINEAR);
   private final Animation nononoPitch = new Animation(1000L, Easing.LINEAR);
   private Timer attackTimer;
   boolean shield;
   private PerlinNoise noise = new PerlinNoise();
   private long rotationStartTime = 0L;
   private float noiseFactor = 0.0F;
   private int attacks;
   private Rotation additional;
   private float lastAttackCooldown;
   private boolean wasCriticalReady;
   private boolean wallBypassArmed;
   private boolean queuedUseHit;
   private boolean nearbyProtectedPlayers;
   private boolean pendingLavaCritAttack;
   private boolean sprintResetPending;
   private boolean skipAttack;
   private LivingEntity pendingAttackTarget;
   private long lavaCritJumpTime;
   private final HolyWorldRotationMode holyWorldRotationMode = new HolyWorldRotationMode();
   private final FunTimeRotationMode funTimeRotationModeImpl = new FunTimeRotationMode();
   private final SpookyTimeRotationMode spookyTimeRotationMode = new SpookyTimeRotationMode();
   private final OneTickRotationMode oneTickRotationMode = new OneTickRotationMode();
   private final ReallyWorldRotationMode reallyWorldRotationMode = new ReallyWorldRotationMode();
   private final SlimeWorldRotationMode slimeWorldRotationMode = new SlimeWorldRotationMode();
   private final SlothRotationMode slothRotationMode = new SlothRotationMode();
   private final EventListener<ClientPlayerTickEvent> onPlayerTick = event -> {
      if (mc.player == null) {
         return;
      }

      this.aimDistance.min(this.attackDistance.getCurrentValue());

      float aimRange = Rockstar.getInstance().getModuleManager().getModule(ElytraTarget.class).isEnabled()
         ? 50.0F
         : this.attackDistance.getCurrentValue();
      TargetSettings settings = this.buildTargetSettings(aimRange);
      LivingEntity target = this.resolveTarget(settings, aimRange);

      if (this.sprintResetPending && this.pendingAttackTarget != null) {
         if (!mc.player.isSprinting()) {
            this.sprintResetPending = false;
            LivingEntity pending = this.pendingAttackTarget;
            this.pendingAttackTarget = null;
            if (this.shouldAttackEntity(pending)) {
               this.attack(pending);
            }
         }

         return;
      }

      if (target != null) {
         this.nearbyProtectedPlayers = this.hasNearbyFriends();

         if (this.pendingLavaCritAttack) {
            this.attack(target);
            this.pendingLavaCritAttack = false;
         }

         this.rotateHead(target);
         if (this.shouldStopForUseHit()) {
            return;
         }

         if (this.shouldAttackEntity(target)) {
            if (this.handleSprintResetGate(target)) {
               return;
            }

            this.attack(target);
         }
      } else {
         this.rotationStartTime = System.currentTimeMillis();
         this.noise = new PerlinNoise();
         this.noiseFactor = 1.0F;
         this.resetRotationModes();
         this.nearbyProtectedPlayers = false;
      }
   };
   private final EventListener<EntityJumpEvent> onEntityJump = event -> {
      if (!this.isEnabled() || mc.player == null || event.getEntity() != mc.player) {
         return;
      }

      if (this.lavaCrits.isEnabled() && mc.player.isInLava() && this.requiresCriticalState()) {
         this.prepareLavaCritJump();
      }
   };

   public Aura() {
      this.initialize();
   }

   private void initialize() {
      this.rotationMode = new ModeSetting(this, "Режим поворота");
      this.simpleRotation = new ModeSetting.Value(this.rotationMode, "Простой").select();
      this.holyWorldRotation = new ModeSetting.Value(this.rotationMode, "HolyWorld");
      this.vonTamRotation = new ModeSetting.Value(this.rotationMode, "VonTam");
      this.funTimeRotation = new ModeSetting.Value(this.rotationMode, "FunTime");
      this.spookyTimeRotation = new ModeSetting.Value(this.rotationMode, "SpookyTime");
      this.oneTickRotation = new ModeSetting.Value(this.rotationMode, "OneTick");
      this.reallyWorldRotation = new ModeSetting.Value(this.rotationMode, "ReallyWorld");
      this.slimeWorldRotation = new ModeSetting.Value(this.rotationMode, "SlimeWorld");
      this.slothRotation = new ModeSetting.Value(this.rotationMode, "Sloth");
      this.noRotation = new ModeSetting.Value(this.rotationMode, "Без поворота");
      this.aiRotation = this.noRotation;
      this.intaveRotation = this.noRotation;
      this.sprintResetMode = new ModeSetting(this, "Сброс спринта");
      this.sprintResetNone = new ModeSetting.Value(this.sprintResetMode, "Выключено").select();
      this.sprintResetSmart = new ModeSetting.Value(this.sprintResetMode, "Умный");
      this.sprintResetNormal = new ModeSetting.Value(this.sprintResetMode, "Обычный");
      this.sprintResetPacket = new ModeSetting.Value(this.sprintResetMode, "Пакетный");
      this.attackDistance = new SliderSetting(this, "Дистанция атаки")
         .min(0.1F)
         .max(6.0F)
         .step(0.1F)
         .currentValue(3.0F)
         .suffix(number -> " %s".formatted(Localizator.translate("block")) + TextUtility.makeCountTranslated(number));
      this.aimDistance = new SliderSetting(this, "Дистанция прицеливания")
         .min(0.1F)
         .max(50.0F)
         .step(0.1F)
         .currentValue(3.0F)
         .suffix(number -> " %s".formatted(Localizator.translate("block")) + TextUtility.makeCountTranslated(number));
      this.minCps = new SliderSetting(this, "Мин. CPS")
         .min(1.0F)
         .max(20.0F)
         .step(1.0F)
         .currentValue(8.0F);
      this.maxCps = new SliderSetting(this, "Макс. CPS")
         .min(1.0F)
         .max(20.0F)
         .step(1.0F)
         .currentValue(12.0F);
      this.onlyCriticals = new BooleanSetting(this, "Только криты");
      this.walls = new BooleanSetting(this, "Сквозь стены").enable();
      this.rayTrace = new BooleanSetting(this, "Луч-трейс").enable();
      this.smartCriticals = new BooleanSetting(this, "Умные криты").enable();
      this.noHitInv = new BooleanSetting(this, "Не бить в инвиз").enable();
      this.targeting = new BooleanSetting(this, "Прицеливание").enable();
      this.onlyWeapon = new BooleanSetting(this, "Только с оружием");
      this.lavaCrits = new BooleanSetting(this, "Лавовые криты");
      this.syncTps = new BooleanSetting(this, "Синхронизация TPS");
      this.rwWallBypass = new BooleanSetting(this, "Обход стен RW");
      this.autoMace = new BooleanSetting(this, "Авто-булава").enabled(true);
      this.autoMaceFallDistance = new SliderSetting(this, "Дистанция падения для булавы", () -> !this.autoMace.isEnabled())
         .min(AUTO_MACE_MIN_FALL_DISTANCE)
         .max(30.0F)
         .step(0.1F)
         .currentValue(AUTO_MACE_MIN_FALL_DISTANCE);

      this.targets = new SelectSetting(this, "Цели");
      this.players = new SelectSetting.Value(this.targets, "Игроки").select();
      this.animals = new SelectSetting.Value(this.targets, "Животные").select();
      this.mobs = new SelectSetting.Value(this.targets, "Мобы").select();
      this.invisibles = new SelectSetting.Value(this.targets, "Невидимки").select();
      this.nakedPlayers = new SelectSetting.Value(this.targets, "Голые игроки").select();
      this.friends = new SelectSetting.Value(this.targets, "Друзья");
      this.rockUsers = new SelectSetting.Value(this.targets, "Игроки со щитом").select();
      this.sortingMode = new ModeSetting(this, "Сортировка целей");
      this.distanceSorting = new ModeSetting.Value(this.sortingMode, "По дистанции").select();
      this.healthSorting = new ModeSetting.Value(this.sortingMode, "По здоровью");
      this.fovSorting = new ModeSetting.Value(this.sortingMode, "По углу обзора");
      this.moveCorrectionMode = new ModeSetting(this, "Коррекция движения");
      this.noMoveCorrection = new ModeSetting.Value(this.moveCorrectionMode, "Выключено");
      this.directMoveCorrection = new ModeSetting.Value(this.moveCorrectionMode, "Прямая");
      this.silentMoveCorrection = new ModeSetting.Value(this.moveCorrectionMode, "Скрытая").select();
      this.styleAttack = new ModeSetting(this, "Стиль атаки");
      this.fastPvp = new ModeSetting.Value(this.styleAttack, "1.8");
      this.slowPvp = new ModeSetting.Value(this.styleAttack, "1.9").select();
      this.criticalMode = new ModeSetting(this, "Расчет критов");
      this.newCriticals = new ModeSetting.Value(this.criticalMode, "Новый").select();
      this.oldCriticals = new ModeSetting.Value(this.criticalMode, "Старый");
      this.targetingOptions = new SelectSetting(this, "Утилиты");
      this.hitVectorMode = new SelectSetting.Value(this.targetingOptions, "Hit Vector").select();
      this.offhandHit = new SelectSetting.Value(this.targetingOptions, "Удар с левой руки").select();
      this.useHit = new SelectSetting.Value(this.targetingOptions, "Use Hit").select();
      this.protectedPlayerCheck = new SelectSetting.Value(this.targetingOptions, "Защита от тиммейтов 1.8").select();
      this.strictTargeting = new SelectSetting.Value(this.targetingOptions, "Строгое прицеливание").select();
      this.elytraTarget = new SelectSetting.Value(this.targetingOptions, "Цель по элитре").select();

      this.attackTimer = new Timer();
      this.lastAttackCooldown = 0.0F;
      this.wasCriticalReady = false;
      this.wallBypassArmed = false;
      this.queuedUseHit = false;
      this.nearbyProtectedPlayers = false;
      this.pendingLavaCritAttack = false;
      this.sprintResetPending = false;
      this.skipAttack = false;
      this.pendingAttackTarget = null;
      this.lavaCritJumpTime = 0L;
   }

   private TargetSettings buildTargetSettings(float aimRange) {
      TargetSettings.Builder builder = new TargetSettings.Builder()
         .targetPlayers(this.players.isSelected())
         .targetAnimals(this.animals.isSelected())
         .targetMobs(this.mobs.isSelected())
         .targetInvisibles(this.invisibles.isSelected())
         .targetNakedPlayers(this.nakedPlayers.isSelected())
         .targetFriends(this.friends.isSelected())
         .requiredRange(aimRange);
      if (this.sortingMode.is(this.distanceSorting)) {
         builder.sortBy(TargetComparators.DISTANCE);
      } else if (this.sortingMode.is(this.healthSorting)) {
         builder.sortBy(TargetComparators.HEALTH);
      } else if (this.sortingMode.is(this.fovSorting)) {
         builder.sortBy(TargetComparators.FOV);
      }

      return builder.build();
   }

   private LivingEntity resolveTarget(TargetSettings settings, float aimRange) {
      LivingEntity target = Rockstar.getInstance().getTargetManager().getCurrentTarget() instanceof LivingEntity living ? living : null;
      boolean keepForcedTarget = this.targeting.isEnabled()
         && target != null
         && settings.isEntityValid(target)
         && MathHelper.sqrt((float)mc.player.squaredDistanceTo(RotationMath.getNearestPoint(target))) <= aimRange
         && mc.world.hasEntity(target)
         && target.isAlive()
         && !(target instanceof PlayerEntity player && Rockstar.getInstance().getModuleManager().getModule(AntiBot.class).isRWBot(player));
      if (!keepForcedTarget) {
         Rockstar.getInstance().getTargetManager().update(settings);
         target = Rockstar.getInstance().getTargetManager().getCurrentTarget() instanceof LivingEntity living ? living : null;
      }

      return target;
   }

   private boolean hasNearbyFriends() {
      for (PlayerEntity player : mc.world.getPlayers()) {
         if (player != mc.player
            && mc.player.distanceTo(player) < 4.0F
            && Rockstar.getInstance().getFriendManager().isFriend(player.getName().getString())) {
            return true;
         }
      }

      return false;
   }

   private boolean shouldAttackEntity(LivingEntity targetedEntity) {
      if (!this.isCooledDown()) {
         return false;
      }

      if (targetedEntity instanceof PlayerEntity player && Rockstar.getInstance().getModuleManager().getModule(AntiBot.class).isRWBot(player)) {
         return false;
      }

      if (this.strictTargeting.isSelected()
         && this.rayTrace.isEnabled()
         && targetedEntity instanceof PlayerEntity player
         && this.isTeammate(player)) {
         return false;
      }

      if (this.onlyWeapon.isEnabled() && !EntityUtility.isHoldingWeapon()) {
         return false;
      }

      if (this.shouldBlockWhileUsingItem() || this.shouldSwapHandForHit()) {
         return false;
      }

      if (mc.currentScreen instanceof InventoryScreen && this.noHitInv.isEnabled()) {
         return false;
      }

      if (this.protectedPlayerCheck.isSelected() && mc.player.hurtTime > 0 && this.nearbyProtectedPlayers) {
         return false;
      }

      if (!this.isWithinAttackRange(targetedEntity)) {
         return false;
      }

      if (!this.canSeeTarget(targetedEntity) && this.rayTrace.isEnabled() && !this.wallBypassArmed && !this.walls.isEnabled()) {
         return false;
      }

      ElytraTarget elytraTargetModule = Rockstar.getInstance().getModuleManager().getModule(ElytraTarget.class);
      if (elytraTargetModule.isEnabled() && mc.player.isGliding() && mc.player.getVelocity().length() < 6.0) {
         return true;
      }

      if (!this.isRotationAimedAt(targetedEntity)) {
         return false;
      }

      if (this.isLavaCritPending(targetedEntity)) {
         this.prepareLavaCritJump();
         return this.isLavaCritReady();
      }

      if (this.requiresCriticalState() && !this.isSmartCriticalSatisfied(targetedEntity)) {
         return false;
      }

      return this.canAttackWithCriticalSettings(targetedEntity);
   }

   private boolean isTeammate(PlayerEntity player) {
      return Rockstar.getInstance().getFriendManager().isFriend(player.getName().getString());
   }

   private boolean shouldStopForUseHit() {
      if (mc.player == null) {
         return false;
      }

      if (this.queuedUseHit) {
         this.queuedUseHit = false;
         return true;
      }

      if (!this.useHit.isSelected()) {
         return false;
      }

      if (!mc.player.isUsingItem()) {
         return false;
      }

      UseAction useAction = mc.player.getActiveItem().getItem().getUseAction(mc.player.getActiveItem());
      if (useAction == UseAction.EAT || useAction == UseAction.DRINK) {
         return true;
      }

      return mc.player.getActiveHand() == Hand.OFF_HAND && useAction != UseAction.BLOCK;
   }

   private boolean shouldBlockWhileUsingItem() {
      if (mc.player == null || !mc.player.isUsingItem() || !this.useHit.isSelected()) {
         return false;
      }

      UseAction useAction = mc.player.getActiveItem().getItem().getUseAction(mc.player.getActiveItem());
      if (useAction == UseAction.EAT || useAction == UseAction.DRINK) {
         return true;
      }

      return mc.player.getActiveHand() == Hand.OFF_HAND && useAction != UseAction.BLOCK;
   }

   private boolean handleSprintResetGate(LivingEntity target) {
      if (!this.sprintResetMode.is(this.sprintResetNormal) && !this.sprintResetMode.is(this.sprintResetPacket)) {
         return false;
      }

      if (Rockstar.getInstance().getModuleManager().getModule(KnockbackTweaks.class).isEnabled() || mc.player == null) {
         return false;
      }

      if (this.sprintResetPending) {
         return true;
      }

      if (!mc.player.isSprinting()) {
         return false;
      }

      mc.player.networkHandler.sendPacket(new ClientCommandC2SPacket(mc.player, ClientCommandC2SPacket.Mode.STOP_SPRINTING));
      if (this.sprintResetMode.is(this.sprintResetPacket)) {
         this.sprintResetPending = true;
         this.pendingAttackTarget = target;
         return true;
      }

      return false;
   }

   private boolean isWithinAttackRange(LivingEntity target) {
      if (this.getBacktrackPositionCount(target) > 1 && this.strictTargeting.isSelected()) {
         BackTrack.Position backtrack = this.getLatestBacktrackPosition(target);
         return backtrack != null && backtrack.pos().distanceTo(target.getPos()) < 6.0;
      }

      Vec3d aimPoint = this.hitVectorMode.isSelected()
         ? RotationPointUtil.nearestPoint(target.getBoundingBox(), mc.player.getEyePos())
         : RotationMath.getNearestPoint(target);
      return mc.player.getEyePos().distanceTo(aimPoint) <= this.aimDistance.getCurrentValue();
   }

   private int getBacktrackPositionCount(LivingEntity target) {
      if (!(target instanceof BacktrackableEntity backtrackable)) {
         return 0;
      }

      return backtrackable.rockstar2_0$getBackTracks().size();
   }

   private BackTrack.Position getLatestBacktrackPosition(LivingEntity target) {
      if (!(target instanceof BacktrackableEntity backtrackable)) {
         return null;
      }

      List<BackTrack.Position> positions = backtrackable.rockstar2_0$getBackTracks();
      return positions.isEmpty() ? null : positions.getLast();
   }

   private boolean isRotationAimedAt(LivingEntity target) {
      if (this.rotationMode.is(this.noRotation) || this.rotationMode.is(this.oneTickRotation)) {
         return true;
      }

      if (this.rotationMode.is(this.reallyWorldRotation)) {
         return true;
      }

      if (this.walls.isEnabled()) {
         return true;
      }

      if (this.getBacktrackPositionCount(target) > 1) {
         return true;
      }

      if (this.skipAttack) {
         return false;
      }

      Rotation rotation = Rockstar.getInstance().getRotationHandler().getCurrentRotation();
      return MathUtility.canTraceWithBlock(
         this.attackDistance.getCurrentValue(),
         rotation.getYaw(),
         rotation.getPitch(),
         mc.player,
         target,
         !this.hitVectorMode.isSelected()
      );
   }

   private boolean requiresCriticalState() {
      if (this.onlyCriticals.isEnabled()) {
         return true;
      }

      if (this.smartCriticals.isEnabled()) {
         return mc.options != null && mc.options.jumpKey.isPressed() || !mc.player.isOnGround();
      }

      return false;
   }

   private boolean isSmartCriticalSatisfied(LivingEntity target) {
      if (!this.requiresCriticalState()) {
         return true;
      }

      float damage = this.computeFloat7(target);
      return damage <= target.getHealth() || CombatUtility.canPerformCriticalHit(target, true);
   }

   private boolean isLavaCritPending(LivingEntity target) {
      return mc.player != null
         && this.lavaCrits.isEnabled()
         && mc.player.isInLava()
         && this.requiresCriticalState()
         && this.damageWouldKill(target);
   }

   private boolean damageWouldKill(LivingEntity target) {
      return this.computeFloat7(target) <= this.getComparableHealth(target);
   }

   private boolean isLavaCritReady() {
      if (mc.player == null) {
         return false;
      }

      if (mc.player.getVelocity().y < -0.003) {
         return true;
      }

      return this.lavaCritJumpTime > 0L && System.currentTimeMillis() - this.lavaCritJumpTime >= 280L;
   }

   private void prepareLavaCritJump() {
      if (this.lavaCritJumpTime == 0L) {
         this.lavaCritJumpTime = System.currentTimeMillis();
      }

      if (mc.options != null) {
         mc.options.jumpKey.setPressed(false);
      }
   }

   public float computeFloat7(LivingEntity targetedEntity) {
      return this.calculateDamage(targetedEntity, false);
   }

   private boolean canAttackWithCriticalSettings(LivingEntity targetedEntity) {
      return !this.shouldWaitForCritical(targetedEntity) || CombatUtility.canPerformCriticalHit(targetedEntity, true);
   }

   private boolean shouldWaitForCritical(LivingEntity targetedEntity) {
      if (!this.onlyCriticals.isEnabled() && !this.smartCriticals.isEnabled()) {
         return false;
      }

      if (this.onlyCriticals.isEnabled() && !this.smartCriticals.isEnabled()) {
         return true;
      }

      return this.shouldHoldForSmartCritical(targetedEntity);
   }

   private boolean shouldHoldForSmartCritical(LivingEntity targetedEntity) {
      return this.canPrepareSmartCritical() && this.isCriticalRequired(targetedEntity);
   }

   private boolean canPrepareSmartCritical() {
      return mc.player != null
         && mc.world != null
         && !mc.player.isOnGround()
         && !mc.player.isGliding()
         && !mc.player.isClimbing()
         && !mc.player.isTouchingWater()
         && !mc.player.isSwimming()
         && !mc.player.isInLava()
         && !mc.player.hasVehicle()
         && !mc.player.hasStatusEffect(StatusEffects.BLINDNESS)
         && !mc.player.hasStatusEffect(StatusEffects.LEVITATION)
         && !mc.player.hasStatusEffect(StatusEffects.SLOW_FALLING)
         && !mc.world.getBlockState(mc.player.getBlockPos()).isOf(Blocks.COBWEB);
   }

   private boolean isCriticalRequired(LivingEntity targetedEntity) {
      float damage = this.calculateDamage(targetedEntity, false);
      return damage + 0.25F < this.getComparableHealth(targetedEntity);
   }

   private float getComparableHealth(LivingEntity targetedEntity) {
      return targetedEntity instanceof PlayerEntity player ? EntityUtility.getHealth(player) : targetedEntity.getHealth() + targetedEntity.getAbsorptionAmount();
   }

   public boolean isCooledDown() {
      if (mc.player == null) {
         return false;
      }

      float tpsMultiplier = this.getTpsAttackMultiplier();
      long attackDelay = this.getAttackDelayMs();
      if (this.fastPvp.isSelected()) {
         return this.attackTimer.finished(attackDelay);
      }

      float cooldownThreshold = this.syncTps.isEnabled() ? Math.min(1.0F, 0.8F * tpsMultiplier) : (this.newCriticals.isSelected() ? 0.8F : 0.93F);
      long timerDelay = this.syncTps.isEnabled() ? Math.round(500.0F * tpsMultiplier) : 500L;
      return mc.player.getAttackCooldownProgress(1.5F) > cooldownThreshold && this.attackTimer.finished(timerDelay);
   }

   private float getTpsAttackMultiplier() {
      if (!this.syncTps.isEnabled()) {
         return 1.0F;
      }

      float tps = Rockstar.getInstance().getTpsHandler().getTPS();
      if (tps <= 0.0F || Float.isNaN(tps)) {
         return 1.0F;
      }

      if (tps >= 19.0F) {
         return 1.0F;
      }

      return Math.max(25.0F / tps, 1.0F);
   }

   public float calculateDamage(LivingEntity targetedEntity) {
      return this.calculateDamage(targetedEntity, CombatUtility.canDealCriticalDamage(targetedEntity, true));
   }

   private float calculateDamage(LivingEntity targetedEntity, boolean includeCritical) {
      if (mc.player == null || targetedEntity == null) {
         return 0.0F;
      }

      float baseDamage = (float)mc.player.getAttributeValue(EntityAttributes.ATTACK_DAMAGE);
      float cooldown = mc.player.getAttackCooldownProgress(0.0F);
      float damage = baseDamage * (0.2F + cooldown * cooldown * 0.8F);
      if (includeCritical) {
         damage *= 1.5F;
      }

      float armor = targetedEntity.getArmor();
      float toughness = (float)targetedEntity.getAttributeValue(EntityAttributes.ARMOR_TOUGHNESS);
      float armorPart = MathHelper.clamp(armor - damage / (2.0F + toughness / 4.0F), armor * 0.2F, 20.0F);
      damage *= 1.0F - armorPart / 25.0F;
      return Math.max(0.0F, damage);
   }

   private void attack(LivingEntity targetedEntity) {
      this.attackTargetWithAutoMace(targetedEntity);
   }

   private void attackTargetWithAutoMace(LivingEntity targetedEntity) {
      if (!this.shouldUseAutoMace(targetedEntity)) {
         this.attackTarget(targetedEntity);
         return;
      }

      if (mc.player.getMainHandStack().isOf(Items.MACE)) {
         this.attackTarget(targetedEntity);
         return;
      }

      int previousSlot = mc.player.getInventory().selectedSlot;
      int maceHotbarSlot = this.findMaceHotbarSlot();
      if (maceHotbarSlot != -1) {
         this.attackWithMaceSlot(targetedEntity, maceHotbarSlot, previousSlot);
         return;
      }

      int maceInventorySlot = this.findMaceInventorySlot();
      if (maceInventorySlot == -1) {
         this.attackTarget(targetedEntity);
         return;
      }

      int swapHotbarSlot = this.findTemporaryHotbarSlot(previousSlot);
      this.swapInventorySlotWithHotbar(maceInventorySlot, swapHotbarSlot);
      this.attackWithMaceSlot(targetedEntity, swapHotbarSlot, previousSlot);
      this.swapInventorySlotWithHotbar(maceInventorySlot, swapHotbarSlot);
   }

   private void attackWithMaceSlot(LivingEntity targetedEntity, int maceSlot, int previousSlot) {
      if (maceSlot == previousSlot) {
         this.attackTarget(targetedEntity);
         return;
      }

      mc.player.networkHandler.sendPacket(new UpdateSelectedSlotC2SPacket(maceSlot));
      this.attackTarget(targetedEntity);
      mc.player.networkHandler.sendPacket(new UpdateSelectedSlotC2SPacket(previousSlot));
   }

   private boolean shouldUseAutoMace(LivingEntity targetedEntity) {
      float requiredFallDistance = Math.max(AUTO_MACE_MIN_FALL_DISTANCE, this.autoMaceFallDistance.getCurrentValue());
      return mc.player != null
         && targetedEntity != null
         && this.autoMace.isEnabled()
         && !mc.player.isOnGround()
         && !mc.player.isGliding()
         && !mc.player.isTouchingWater()
         && !mc.player.isInLava()
         && mc.player.getVelocity().y <= AUTO_MACE_MIN_DOWNWARD_SPEED
         && mc.player.fallDistance >= requiredFallDistance;
   }

   private int findMaceHotbarSlot() {
      for (int slot = 0; slot < 9; slot++) {
         if (mc.player.getInventory().getStack(slot).isOf(Items.MACE)) {
            return slot;
         }
      }

      return -1;
   }

   private int findMaceInventorySlot() {
      for (int slot = 9; slot < 36; slot++) {
         if (mc.player.getInventory().getStack(slot).isOf(Items.MACE)) {
            return slot;
         }
      }

      return -1;
   }

   private int findTemporaryHotbarSlot(int previousSlot) {
      for (int slot = 0; slot < 9; slot++) {
         if (slot != previousSlot && mc.player.getInventory().getStack(slot).isEmpty()) {
            return slot;
         }
      }

      return previousSlot == 8 ? 7 : 8;
   }

   private void swapInventorySlotWithHotbar(int inventorySlot, int hotbarSlot) {
      if (mc.interactionManager != null && mc.getNetworkHandler() != null) {
         int syncId = mc.player.currentScreenHandler.syncId;
         mc.interactionManager.clickSlot(syncId, inventorySlot, hotbarSlot, SlotActionType.SWAP, mc.player);
         mc.getNetworkHandler().sendPacket(new CloseHandledScreenC2SPacket(syncId));
      }
   }

   private void attackTarget(LivingEntity targetedEntity) {
      if (mc.interactionManager != null && mc.player != null) {
         if (this.rwWallBypass.isEnabled() && !this.canSeeTarget(targetedEntity)) {
            this.performRwWallBypass(targetedEntity);
         }

         this.shield = mc.player.isUsingItem() && mc.player.getActiveItem().getItem().getUseAction(mc.player.getActiveItem()) == UseAction.BLOCK;
         if (this.shield) {
            mc.player.networkHandler.sendPacket(new PlayerActionC2SPacket(Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, Direction.DOWN));
         }

         if (CombatUtility.shouldBreakShield(targetedEntity) && CombatUtility.canBreakShield(targetedEntity)) {
            CombatUtility.tryBreakShield(targetedEntity);
         }

         this.lastAttackCooldown = mc.player.getAttackCooldownProgress(0.0F);
         this.wasCriticalReady = this.shouldWaitForCritical(targetedEntity) && CombatUtility.canPerformCriticalHit(targetedEntity, true);
         mc.interactionManager.attackEntity(mc.player, targetedEntity);
         mc.player.swingHand(Hand.MAIN_HAND);

         if (this.shield) {
            mc.interactionManager
               .sendSequencedPacket(
                  mc.world,
                  sequence -> new PlayerInteractItemC2SPacket(
                     mc.player.getActiveHand(),
                     sequence,
                     Rockstar.getInstance().getRotationHandler().getCurrentRotation().getYaw(),
                     Rockstar.getInstance().getRotationHandler().getCurrentRotation().getPitch()
                  )
               );
         }

         this.additional = new Rotation(MathUtility.random(5.0, 20.0), MathUtility.random(5.0, 10.0));
         this.attackTimer.reset();
         this.attacks++;
         this.wallBypassArmed = false;
         this.queuedUseHit = false;
         this.skipAttack = false;
         this.lavaCritJumpTime = 0L;
      }
   }

   private void performRwWallBypass(LivingEntity target) {
      if (mc.player == null || mc.world == null || mc.player.networkHandler == null) {
         return;
      }

      Rotation rotation = Rockstar.getInstance().getRotationHandler().getCurrentRotation();
      for (BlockHitResult hit : this.collectWallBlockHits(target, rotation)) {
         BlockPos pos = hit.getBlockPos();
         mc.player.networkHandler.sendPacket(new PlayerActionC2SPacket(Action.START_DESTROY_BLOCK, pos, hit.getSide()));
         mc.player.networkHandler.sendPacket(new PlayerActionC2SPacket(Action.STOP_DESTROY_BLOCK, pos, hit.getSide()));
      }

      this.wallBypassArmed = true;
   }

   private List<BlockHitResult> collectWallBlockHits(LivingEntity target, Rotation rotation) {
      ArrayList<BlockHitResult> hits = new ArrayList<>();
      if (target == null || mc.player == null || mc.world == null) {
         return hits;
      }

      float partialTicks = mc.getRenderTickCounter().getTickDelta(false);
      Vec3d start = mc.player.getCameraPosVec(partialTicks);
      Vec3d direction = rotation.getRotationVector().normalize();
      double reach = this.aimDistance.getCurrentValue();
      Vec3d end = start.add(direction.multiply(reach));
      double targetDistance = this.calculateTargetRayDistance(start, direction, end, reach, target);
      LinkedHashSet<Vec3d> origins = new LinkedHashSet<>();
      origins.add(start);
      Vec3d lateral = this.perpendicular(direction);
      if (lateral.lengthSquared() > 1.0E-8) {
         lateral = lateral.normalize().multiply(0.09);
         origins.add(start.add(lateral));
         origins.add(start.subtract(lateral));
      }

      HashSet<BlockPos> visited = new HashSet<>();
      for (Vec3d origin : origins) {
         Vec3d rayEnd = origin.add(direction.multiply(reach));

         for (BlockHitResult hit : this.traceBlocks(origin, rayEnd, direction, start, targetDistance)) {
            if (visited.add(hit.getBlockPos())) {
               hits.add(hit);
            }
         }
      }

      hits.sort(Comparator.comparingDouble(hit -> hit.getPos().squaredDistanceTo(start)));
      return hits;
   }

   private static Vec3d perpendicular(Vec3d direction) {
      Vec3d flat = new Vec3d(direction.x, 0.0, direction.z);
      if (flat.lengthSquared() < 1.0E-8) {
         return Vec3d.ZERO;
      }

      flat = flat.normalize();
      return new Vec3d(-flat.z, 0.0, flat.x);
   }

   private double calculateTargetRayDistance(Vec3d start, Vec3d direction, Vec3d end, double reach, LivingEntity target) {
      Optional<Vec3d> hit = target.getBoundingBox().raycast(start, end);
      if (hit.isPresent()) {
         return hit.get().subtract(start).dotProduct(direction);
      }

      double eyeDistance = target.getEyePos().subtract(start).dotProduct(direction);
      return eyeDistance > 0.0 && eyeDistance <= reach ? eyeDistance : reach;
   }

   private List<BlockHitResult> traceBlocks(Vec3d start, Vec3d end, Vec3d direction, Vec3d origin, double targetDistance) {
      ArrayList<BlockHitResult> hits = new ArrayList<>();
      Vec3d cursor = start;
      HashSet<BlockPos> visited = new HashSet<>();

      for (int i = 0; i < 40; i++) {
         BlockHitResult hit = mc.world.raycast(new RaycastContext(cursor, end, ShapeType.COLLIDER, FluidHandling.NONE, mc.player));
         if (hit.getType() != HitResult.Type.BLOCK) {
            break;
         }

         double distanceAlongRay = hit.getPos().subtract(origin).dotProduct(direction);
         if (distanceAlongRay >= targetDistance - 1.0E-4) {
            break;
         }

         Block block = mc.world.getBlockState(hit.getBlockPos()).getBlock();
         if (block instanceof DoorBlock || block instanceof TrapdoorBlock) {
            cursor = hit.getPos().add(direction.multiply(0.01));
            continue;
         }

         BlockPos pos = hit.getBlockPos();
         if (!visited.add(pos)) {
            cursor = hit.getPos().add(direction.multiply(0.02));
            continue;
         }

         hits.add(hit);
         cursor = hit.getPos().add(direction.multiply(0.01));
      }

      return hits;
   }

   private void rotateHead(LivingEntity targetedEntity) {
      if (!this.onlyWeapon.isEnabled() || EntityUtility.isHoldingWeapon()) {
         if (!this.rotationMode.is(this.noRotation)) {
            MoveCorrection moveCorrection;
            if (this.moveCorrectionMode.is(this.silentMoveCorrection)) {
               moveCorrection = MoveCorrection.SILENT;
            } else if (this.moveCorrectionMode.is(this.directMoveCorrection)) {
               moveCorrection = MoveCorrection.DIRECT;
            } else {
               moveCorrection = MoveCorrection.NONE;
            }

            RotationHandler handler = Rockstar.getInstance().getRotationHandler();
            if (this.rotationMode.is(this.simpleRotation)) {
               Rotation rot = RotationMath.getRotationTo(
                  RotationMath.getNearestPoint(
                     targetedEntity,
                     Rockstar.getInstance().getModuleManager().getModule(ElytraTarget.class).isEnabled() && targetedEntity instanceof PlayerEntity player
                        ? ElytraPredictionSystem.predictPlayerPosition(player)
                        : targetedEntity.getPos()
                  )
               );
               if (mc.player.getEyePos().distanceTo(targetedEntity.getEyePos()) > 3.0) {
                  rot.setYaw(
                     RotationMath.getRotationTo(
                           (Rockstar.getInstance().getModuleManager().getModule(ElytraTarget.class).isEnabled()
                                    && targetedEntity instanceof PlayerEntity playerx
                                 ? ElytraPredictionSystem.predictPlayerPosition(playerx)
                                 : targetedEntity.getPos())
                              .add(0.0, targetedEntity.getEyeHeight(targetedEntity.getPose()), 0.0)
                        )
                        .getYaw()
                  );
               }

               handler.rotate(rot, moveCorrection, 180.0F, 180.0F, 180.0F, RotationPriority.TO_TARGET);
            }

            if (this.rotationMode.is(this.holyWorldRotation)) {
               this.holyWorldRotationMode.rotate(this, handler, targetedEntity, moveCorrection);
            }

            if (this.rotationMode.is(this.funTimeRotation) || this.rotationMode.is(this.vonTamRotation)) {
               this.funTimeRotationModeImpl.rotate(this, handler, targetedEntity, moveCorrection);
            }

            if (this.rotationMode.is(this.spookyTimeRotation)) {
               this.spookyTimeRotationMode.rotate(this, handler, targetedEntity, moveCorrection);
            }

            if (this.rotationMode.is(this.oneTickRotation)) {
               this.oneTickRotationMode.rotate(this, handler, targetedEntity, moveCorrection);
            }

            if (this.rotationMode.is(this.reallyWorldRotation)) {
               this.reallyWorldRotationMode.rotate(this, handler, targetedEntity, moveCorrection);
            }

            if (this.rotationMode.is(this.slimeWorldRotation)) {
               this.slimeWorldRotationMode.rotate(this, handler, targetedEntity, moveCorrection);
            }

            if (this.rotationMode.is(this.slothRotation)) {
               this.slothRotationMode.rotate(this, handler, targetedEntity, moveCorrection);
            }
         }
      }
   }

   private boolean canSeeTarget(LivingEntity target) {
      Rotation currentRotation = Rockstar.getInstance().getRotationHandler().getCurrentRotation();
      return MathUtility.canTraceWithBlock(
         this.attackDistance.getCurrentValue(),
         currentRotation.getYaw(),
         currentRotation.getPitch(),
         mc.player,
         target,
         !this.noHitInv.isEnabled()
      );
   }

   private boolean shouldSwapHandForHit() {
      if (mc.player == null || !mc.player.isUsingItem()) {
         return false;
      }
      if (!this.offhandHit.isSelected()) {
         return mc.player.getActiveHand() == Hand.MAIN_HAND;
      }
      return mc.player.getActiveHand() == Hand.MAIN_HAND;
   }

   private long getAttackDelayMs() {
      int min = Math.round(this.minCps.getCurrentValue());
      int max = Math.round(this.maxCps.getCurrentValue());
      if (min > max) {
         int swap = min;
         min = max;
         max = swap;
      }

      int cps = (int)Math.floor(MathUtility.random(min, max + 1));
      return Math.max(1L, 1000L / Math.max(1, cps));
   }

   public float getGCDValue() {
      double sensitivity = (Double)mc.options.getMouseSensitivity().getValue();
      double value = sensitivity * 0.6 + 0.2;
      double result = Math.pow(value, 3.0) * 0.8;
      return (float)result * 0.15F;
   }

   public float getSensitivity(float rot) {
      return this.getDeltaMouse(rot) * this.getGCDValue();
   }

   public float getDeltaMouse(float delta) {
      return Math.round(delta / this.getGCDValue());
   }

   public boolean shouldPreventSprinting() {
      if (!this.sprintResetMode.is(this.sprintResetSmart)) {
         return false;
      }

      if (Rockstar.getInstance().getModuleManager().getModule(KnockbackTweaks.class).isEnabled()) {
         return false;
      }

      LivingEntity target = Rockstar.getInstance().getTargetManager().getCurrentTarget() instanceof LivingEntity living ? living : null;
      if (target == null || mc.player == null) {
         return false;
      }

      if (this.rayTrace.isEnabled() || mc.player.isSubmergedInWater()) {
         return false;
      }

      if (this.styleAttack.is(this.fastPvp)) {
         return false;
      }

      Criticals criticals = Rockstar.getInstance().getModuleManager().getModule(Criticals.class);
      boolean predict = criticals.isEnabled() && (criticals.canCritical() || mc.player.isOnGround())
         || !mc.player.isOnGround() && FallingPlayer.fromPlayer(mc.player).findFall(CombatUtility.getFallDistance(target));
      return this.shouldWaitForCritical(target)
         && (
            predict
               || CombatUtility.canPerformCriticalHit(target, true)
               || !this.attackTimer.finished(!ServerUtility.isHW() && !ServerUtility.isST() ? 50L : (long)MathUtility.random(50.0, 150.0))
         );
   }

   private boolean inRange(LivingEntity target) {
      return MathHelper.sqrt((float)mc.player.squaredDistanceTo(RotationMath.getNearestPoint(target))) > this.attackDistance.getCurrentValue();
   }

   public boolean isRotationTargetValid(LivingEntity target) {
      return mc.player != null && mc.world != null && target != null && target.isAlive() && mc.world.hasEntity(target) && !this.inRange(target);
   }

   public boolean isReadyToAttackNow() {
      return this.isCooledDown();
   }

   public float getAttackDistanceValue() {
      return this.attackDistance.getCurrentValue();
   }

   public boolean isWallsEnabled() {
      return this.walls.isEnabled();
   }

   public boolean isNoHitInvEnabled() {
      return this.noHitInv.isEnabled();
   }

   public boolean isHitVectorModeEnabled() {
      return this.hitVectorMode.isSelected();
   }

   public boolean isHolyWorldRotationSelected() {
      return this.rotationMode.is(this.holyWorldRotation);
   }

   public boolean isSpookyTimeRotationSelected() {
      return this.rotationMode.is(this.spookyTimeRotation);
   }

   public boolean isFunTimeRotationSelected() {
      return this.rotationMode.is(this.funTimeRotation);
   }

   private void resetRotationModes() {
      this.funTimeRotationModeImpl.reset();
      this.spookyTimeRotationMode.reset();
      this.oneTickRotationMode.reset();
      this.reallyWorldRotationMode.reset();
      this.slimeWorldRotationMode.reset();
      this.slothRotationMode.reset();
   }

   @Override
   public void onEnable() {
      this.rotationStartTime = System.currentTimeMillis();
      this.noise = new PerlinNoise();
      this.noiseFactor = 1.0F;
      this.lavaCritJumpTime = 0L;
      this.pendingLavaCritAttack = false;
      this.sprintResetPending = false;
      this.pendingAttackTarget = null;
      this.skipAttack = false;
      this.resetRotationModes();
      super.onEnable();
   }

   @Override
   public void onDisable() {
      Rockstar.getInstance().getTargetManager().reset();
      this.resetRotationModes();
      this.lavaCritJumpTime = 0L;
      this.pendingLavaCritAttack = false;
      this.sprintResetPending = false;
      this.pendingAttackTarget = null;
      this.skipAttack = false;
      if (mc.player != null && this.rotationMode.is(this.slothRotation)) {
         Rotation rotation = Rockstar.getInstance().getRotationHandler().getCurrentRotation();
         mc.player.setYaw(rotation.getYaw());
         mc.player.setPitch(rotation.getPitch());
      }

      super.onDisable();
   }

   @Generated
   public ModeSetting.Value getFastPvp() {
      return this.fastPvp;
   }

   @Generated
   public ModeSetting.Value getSlowPvp() {
      return this.slowPvp;
   }

   @Generated
   public Timer getAttackTimer() {
      return this.attackTimer;
   }

   @Generated
   public int getAttacks() {
      return this.attacks;
   }
}
