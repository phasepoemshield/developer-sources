package fun.wonderful.client.modules.impl.combat;

import fun.wonderful.Wonderful;
import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventAttackEntity;
import fun.wonderful.api.events.implement.EventGameUpdate;
import fun.wonderful.api.events.implement.EventKeyboardInput;
import fun.wonderful.api.events.implement.EventMoveInput;
import fun.wonderful.api.events.implement.EventTickPost;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.events.implement.EventUpdatePost;
import fun.wonderful.api.storages.implement.FreeLookStorage;
import fun.wonderful.api.storages.implement.RotationStorage;
import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.api.utils.combat.PredictUtils;
import fun.wonderful.api.utils.input.MovingUtil;
import fun.wonderful.api.utils.math.TimerUtils;
import fun.wonderful.api.utils.player.HotbarUtil;
import fun.wonderful.api.utils.player.SlotSearchResult;
import fun.wonderful.api.utils.rotate.MultipointUtils;
import fun.wonderful.api.utils.rotate.Rotation;
import fun.wonderful.api.utils.rotate.RotationUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.impl.combat.AntiBot;
import fun.wonderful.client.modules.impl.combat.AutoExplosion;
import fun.wonderful.client.modules.impl.combat.TpsSync;
import fun.wonderful.client.modules.impl.combat.components.RotationComponent;
import fun.wonderful.client.modules.impl.combat.components.interpolation.BestPoint;
import fun.wonderful.client.modules.impl.combat.components.rotations.КомпонентЭлитры;
import fun.wonderful.client.modules.impl.combat.components.rotations.РотацияЭлитры;
import fun.wonderful.client.modules.impl.combat.components.rotations.РотацияХолиВорлдИИ;
import fun.wonderful.client.modules.impl.combat.components.rotations.РотацияСлот2;
import fun.wonderful.client.modules.impl.combat.components.rotations.МультипоинтСлот;
import fun.wonderful.client.modules.impl.combat.components.rotations.ТестоваяРотация;
import fun.wonderful.client.modules.impl.combat.components.rotations.РотацияВеллМайн;
import fun.wonderful.client.modules.impl.combat.ivanrwrot.ИванРуХит;
import fun.wonderful.client.modules.impl.combat.ivanrwrot.ИванРуРейТрейс;
import fun.wonderful.client.modules.impl.combat.ivanrwrot.ИванРвРотация;
import fun.wonderful.client.modules.impl.movement.Sprint;
import fun.wonderful.client.modules.impl.player.AutoEat;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import fun.wonderful.client.modules.settings.implement.ListSetting;
import fun.wonderful.client.modules.settings.implement.ModeSetting;
import fun.wonderful.mixin.ILivingEntity;
import java.util.ArrayList;
import java.util.Comparator;
import lombok.Generated;
import net.minecraft.util.Hand;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.BatEntity;
import net.minecraft.entity.passive.CodEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.mob.Monster;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShieldItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.world.BlockView;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Position;
import net.minecraft.util.math.Box;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.RaycastContext;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.MaceItem;
import ru.ocz.protection.annotation.MBA;

public class Aura
extends Module {
    public static Aura INSTANCE = new Aura();
    private static final float NON_ELYTRA_SAFE_ATTACK_RANGE = 2.95f;
    public final ModeSetting rotationType = new ModeSetting("Ротация", "Плавная", "Плавная", "Резкая", "СпукиТайм", "Слот2", "ХолиВорлдИИ", "БезРотации");
    private final ListSetting targets = new ListSetting("Таргеты", new BooleanSetting("Игроки", true), new BooleanSetting("Голые", true), new BooleanSetting("Невидимки", true), new BooleanSetting("Мирные", false), new BooleanSetting("Мобы", true));
    private final FloatSetting range = new FloatSetting("Дистанция атаки", 3.0f, 0.0f, 6.0f, 0.05f);
    private final FloatSetting aimRange = new FloatSetting("Дистанция наводки", 3.0f, 0.0f, 6.0f, 0.05f);
    private final FloatSetting elytraAimRange = new FloatSetting("Дистанция на элитрах", 50.0f, 10.0f, 100.0f, 0.05f);
    public final BooleanSetting smartCrit = new BooleanSetting("Умные криты", false);
    private final BooleanSetting sprintReset = new BooleanSetting("Сброс спринта", true);
    private final BooleanSetting throughWalls = new BooleanSetting("Бить через стены", true);
    private final BooleanSetting raycast = new BooleanSetting("Проверка на наведение", false);
    private final BooleanSetting unpressShield = new BooleanSetting("Отжимать щит", false);
    private final BooleanSetting breakShield = new BooleanSetting("Ломать щит", true);
    private final BooleanSetting attackOnEating = new BooleanSetting("Не бить когда ешь", true);
    public static BooleanSetting clientLook = new BooleanSetting("Наводка от первого лица", false);
    private final ModeSetting moveFix = new ModeSetting("Коррекция", "Нет", "Нет", "Свободная", "Сфокусированная", "Полная");
    private final ModeSetting priority = new ModeSetting("Приоритет", "Дистанция", "Дистанция", "Здоровье", "Угол", "Никакой");
    private LivingEntity target;
    private Vec2f currentRotations = new Vec2f(0.0f, 0.0f);
    private Vec2f targetRotations = new Vec2f(0.0f, 0.0f);
    private final TimerUtils attackTimer = new TimerUtils();
    private final BooleanSetting rwWallBypass = new BooleanSetting("Обход рв стен", false);
    private final BooleanSetting rwWallLookDown = new BooleanSetting("Смотреть вниз", false).visible(this.rwWallBypass::isState);
    private final РотацияВеллМайн ротацияВеллМайн = new РотацияВеллМайн();
    private final ТестоваяРотация тестоваяРотация = new ТестоваяРотация();
    private final РотацияСлот2 РотацияСлот2 = new РотацияСлот2();
    private final РотацияХолиВорлдИИ ротацияХолиВорлдИИ = new РотацияХолиВорлдИИ();
    private final ИванРвРотация иванРуРотация = new ИванРвРотация();
    private final РотацияЭлитры ротацияЭлитры = new РотацияЭлитры();
    private final ИванРуХит иванРуХит = new ИванРуХит();
    private final TimerUtils backTimer = new TimerUtils();
    private TpsSync tpsSync;
    private long cps = 0L;
    private int sprintResetTicksLeft = 0;
    private boolean sprintResetDone = false;
    private LivingEntity serverRotationTarget = null;
    private int serverRotationTick = -1;
    private float serverRotationYaw = 0.0f;
    private float serverRotationPitch = 0.0f;
    private int ticksToAttack = 0;
    private int snapAttackAge = -1;
    private boolean snapAttackQueued = false;
    private LivingEntity snapAttackTarget = null;
    private float lastYaw = 0.0f;
    private float lastPitch = 0.0f;
    private int jumpCritIntentTicks = 0;
    public static float adjYaw;
    public static float adjPitch;
    public static float otvodkaYaw;
    public static float otvodkaPitch;
    public boolean isRotated;

    public Aura() {
        super("AttackAura", "Автоматически бьет энтити", Module.ModuleCategory.COMBAT);
        this.addSettings(this.rotationType, this.targets, this.range, this.aimRange, this.elytraAimRange, this.smartCrit, this.sprintReset, this.attackOnEating, this.throughWalls, this.rwWallBypass, this.rwWallLookDown, this.raycast, this.unpressShield, this.breakShield, clientLook, this.moveFix, this.priority);
    }

    @EventLink
    public void onPlayerTick(EventUpdate var1) {
    }

    @EventLink
    public void onAttackEntity(EventAttackEntity event) {
        if (Aura.mc.player == null || Aura.mc.world == null) {
            return;
        }
        if (event.getPlayer() != Aura.mc.player) {
            return;
        }
        Entity class_12972 = event.getTarget();
        if (!(class_12972 instanceof LivingEntity)) {
            return;
        }
        LivingEntity living = (LivingEntity)class_12972;
        if (!this.isValidTarget(living)) {
            return;
        }
        this.target = living;
    }

    @EventLink
    public void onMoveInput(EventMoveInput event) {
        this.refreshJumpCritIntent();
        if (this.isIvanRwMode() && this.иванРуХит.onMoveInput(event)) {
            return;
        }
        if (this.sprintResetTicksLeft > 0) {
            event.setForward(0.0f);
            event.setStrafe(0.0f);
            Aura.mc.player.setSprinting(false);
            --this.sprintResetTicksLeft;
            return;
        }
        this.applyMoveFix(event);
    }

    private void applyMoveFix(EventMoveInput event) {
        if (Aura.mc.player == null || this.target == null || this.isMovementCorrectionUnsafe() || this.rotationType.is("БезРотации") || this.moveFix.getIndex() == 0) {
            return;
        }
        if (this.moveFix.getIndex() == 1) {
            MovingUtil.fixMovementFree(event);
        }
    }

    @EventLink
    public void onKeyboardInput(EventKeyboardInput event) {
        if (Aura.mc.player == null || Aura.mc.world == null || this.target == null || this.isMovementCorrectionUnsafe() || this.rotationType.is("БезРотации")) {
            return;
        }
        float correctionYaw = this.getCorrectionYaw();
        if (this.moveFix.getIndex() == 2) {
            event.setYaw(correctionYaw, Aura.mc.player.getYaw());
        } else if (this.moveFix.getIndex() == 3) {
            event.setYaw(correctionYaw, this.getTargetDirectionYaw());
        }
    }

    private boolean isMovementCorrectionUnsafe() {
        return Aura.mc.player.isGliding() || Aura.mc.player.isTouchingWater() || Aura.mc.player.isSubmergedInWater() || Aura.mc.player.isSwimming();
    }

    private float getCorrectionYaw() {
        if (RotationStorage.instance != null && RotationStorage.instance.targetRotation() != null) {
            return RotationStorage.instance.targetRotation().getYaw();
        }
        return Aura.mc.player.getYaw();
    }

    private float getTargetDirectionYaw() {
        return RotationUtils.getRotations((Vec3d)(Object)this.target.getBoundingBox().getCenter()).x;
    }

    private void applyMovementCorrection(EventMoveInput event, float yaw, float directionYaw) {
        float forward = event.getForward();
        float strafe = event.getStrafe();
        if (forward == 0.0f && strafe == 0.0f) {
            return;
        }
        double angle = MathHelper.wrapDegrees((double)Math.toDegrees(MovingUtil.direction(directionYaw, forward, strafe)));
        float closestForward = 0.0f;
        float closestStrafe = 0.0f;
        float closestDifference = Float.MAX_VALUE;
        for (float predictedForward = -1.0f; predictedForward <= 1.0f; predictedForward += 1.0f) {
            for (float predictedStrafe = -1.0f; predictedStrafe <= 1.0f; predictedStrafe += 1.0f) {
                double predictedAngle;
                double difference;
                if (predictedForward == 0.0f && predictedStrafe == 0.0f || !((difference = Math.abs(angle - (predictedAngle = MathHelper.wrapDegrees((double)Math.toDegrees(MovingUtil.direction(yaw, predictedForward, predictedStrafe)))))) < (double)closestDifference)) continue;
                closestDifference = (float)difference;
                closestForward = predictedForward;
                closestStrafe = predictedStrafe;
            }
        }
        event.setForward(closestForward);
        event.setStrafe(closestStrafe);
    }

    @EventLink
    private void onGameUpdate(EventGameUpdate e2) {
        if (Aura.mc.player == null || Aura.mc.world == null || this.target == null) {
            return;
        }
        if (this.isElytraPursuitActive(this.target)) {
            return;
        }
        this.rotate();
        this.serverRotationTarget = this.target;
        this.serverRotationTick = Aura.mc.player.age;
        this.serverRotationYaw = Aura.mc.player.getYaw();
        this.serverRotationPitch = Aura.mc.player.getPitch();
    }

    @EventLink
    public void onTick(EventUpdate var1) {
    }

    @EventLink
    public void onTickPost(EventTickPost e2) {
        if (Aura.mc.player == null || Aura.mc.world == null) {
            return;
        }
        if (!this.isIvanRwMode()) {
            return;
        }
        this.updateIvanRwSprintStatus();
    }

    @EventLink
    public void onPost(EventUpdatePost e2) {
        boolean packetCrits;
        if (Aura.mc.player == null || Aura.mc.world == null) {
            return;
        }
        boolean bl = packetCrits = ModuleClass.packetCriticals.isEnable() && Aura.mc.player.hasStatusEffect(StatusEffects.SLOW_FALLING);
        if (packetCrits && Aura.mc.player.fallDistance > 0.0f && Aura.mc.player.fallDistance < 1.0f) {
            this.processAttack();
        }
    }

    private void processAttack() {
    }


    private boolean isIvanRwMode() {
        return this.rotationType.is("Плавная");
    }

    private void updateIvanRwSprintStatus() {
        boolean active = this.sprintReset.isState() && !this.shouldSkipSprintReset();
        this.иванРуХит.updateSprintStatus(active, this.target, this.isIvanRwLookingAtTarget(), this.isIvanRwInDistance());
    }

    private void processIvanRwAttack() {
        boolean isCrit;
        boolean onlySpace;
        boolean onlyCrit;
        if (this.cps > System.currentTimeMillis()) {
            return;
        }
        if (this.attackOnEating.isState() && (this.shouldBlockAttackWhileUsingItem() || AutoEat.shouldSuppressCombat())) {
            return;
        }
        if (AutoExplosion.INSTANCE.isRotatingForCrystal()) {
            return;
        }
        if (!this.isIvanRwServerAimReady()) {
            return;
        }
        if (!this.isIvanRwLookingAtTarget()) {
            return;
        }
        if (!this.isIvanRwInDistance()) {
            return;
        }
        boolean elytraTargeting = this.isElytraPursuitActive(this.target);
        if (elytraTargeting) {
            onlyCrit = false;
            onlySpace = false;
            isCrit = true;
        } else {
            onlyCrit = this.smartCrit.isState();
            onlySpace = this.smartCrit.isState();
            boolean bl = isCrit = this.canCritical(this.target) || this.иванРуХит.isValidFallState();
        }
        if (!this.иванРуХит.canHit(onlyCrit, onlySpace, isCrit, this.tpsSync)) {
            return;
        }
        ИванРуХит.SprintReset reset = Aura.mc.player.isGliding() ? ИванРуХит.SprintReset.PACKET : (this.sprintReset.isState() && !this.shouldSkipSprintReset() ? ИванРуХит.SprintReset.LEGIT : ИванРуХит.SprintReset.PACKET);
        if (!this.иванРуХит.preHit(reset)) {
            return;
        }
        this.attack();
        this.иванРуХит.postHit();
        this.иванРуРотация.attacked();
    }

    private boolean isIvanRwLookingAtTarget() {
        boolean canSee;
        if (Aura.mc.player == null || this.target == null) {
            return false;
        }
        if (this.isElytraPursuitActive(this.target)) {
            return true;
        }
        if (this.isUsingRwWallSnap()) {
            return true;
        }
        float yaw = Aura.mc.player.getYaw();
        float pitch = Aura.mc.player.getPitch();
        if (Wonderful.INSTANCE != null && Wonderful.INSTANCE.serverStorage != null) {
            float sYaw = Wonderful.INSTANCE.serverStorage.getServerYaw();
            float sPitch = Wonderful.INSTANCE.serverStorage.getServerPitch();
            if (!(Float.isNaN(sYaw) || Float.isNaN(sPitch) || sYaw == 0.0f && sPitch == 0.0f)) {
                yaw = sYaw;
                pitch = sPitch;
            }
        }
        if (!(canSee = ИванРуРейТрейс.rayTraceWithBlock(this.range.getValue().floatValue(), yaw, pitch, (Entity)Aura.mc.player, (Entity)(Object)this.target)) && this.throughWalls.isState()) {
            canSee = ИванРуРейТрейс.rayTraceEntityBox(this.range.getValue().floatValue(), yaw, pitch, (Entity)Aura.mc.player, (Entity)(Object)this.target);
        }
        return canSee;
    }

    private boolean isIvanRwServerAimReady() {
        if (Aura.mc.player == null || this.target == null) {
            return false;
        }
        if (this.isElytraPursuitActive(this.target)) {
            return true;
        }
        if (this.isUsingRwWallSnap()) {
            return true;
        }
        if (!this.isIvanRwInDistance()) {
            return false;
        }
        if (Wonderful.INSTANCE == null || Wonderful.INSTANCE.serverStorage == null) {
            return true;
        }
        float serverYaw = Wonderful.INSTANCE.serverStorage.getServerYaw();
        float serverPitch = Wonderful.INSTANCE.serverStorage.getServerPitch();
        if (serverYaw == 0.0f && serverPitch == 0.0f) {
            return true;
        }
        if (Float.isNaN(serverYaw) || Float.isNaN(serverPitch)) {
            return false;
        }
        boolean canSee = ИванРуРейТрейс.rayTraceWithBlock(this.range.getValue().floatValue(), serverYaw, serverPitch, (Entity)Aura.mc.player, (Entity)(Object)this.target);
        if (!canSee && this.throughWalls.isState()) {
            canSee = ИванРуРейТрейс.rayTraceEntityBox(this.range.getValue().floatValue(), serverYaw, serverPitch, (Entity)Aura.mc.player, (Entity)(Object)this.target);
        }
        return canSee;
    }

    private boolean isIvanRwInDistance() {
        return this.target != null && ИванРуРейТрейс.strictDistance((Entity)Aura.mc.player, (Entity)(Object)this.target) <= (double)this.range.getValue().floatValue();
    }

    public void Rotate() {
        this.rotate();
    }

    private void rotate() {
    }


    private void updateElytraPursuitRotation(Rotation rotation, float yawSpeed, float pitchSpeed) {
        if (clientLook.isState()) {
            RotationStorage.update(rotation, yawSpeed, pitchSpeed, yawSpeed, pitchSpeed, 1, 1, true);
            return;
        }
        if (Aura.mc.gameRenderer == null || Aura.mc.gameRenderer.getCamera() == null) {
            RotationStorage.update(rotation, yawSpeed, pitchSpeed, yawSpeed, pitchSpeed, 1, 1, false);
            return;
        }
        float cameraYaw = Aura.mc.gameRenderer.getCamera().getYaw();
        float cameraPitch = Aura.mc.gameRenderer.getCamera().getPitch();
        FreeLookStorage.setActive(true);
        FreeLookStorage.setFreeYaw(cameraYaw);
        FreeLookStorage.setFreePitch(cameraPitch);
        RotationStorage.update(rotation, yawSpeed, pitchSpeed, yawSpeed, pitchSpeed, 1, 1, false);
        FreeLookStorage.setActive(true);
        FreeLookStorage.setFreeYaw(cameraYaw);
        FreeLookStorage.setFreePitch(cameraPitch);
    }

    @MBA(mode=3)
    private void updateSnapRotation(LivingEntity var1) {
    }


    private boolean isSnapRotationActive() {
        return this.rotationType.is("Резкая") || this.isUsingRwWallSnap();
    }

    private boolean prepareSnapAttack() {
        if (!this.snapAttackQueued) {
            this.snapAttackQueued = true;
            this.snapAttackAge = Aura.mc.player.age + 1;
            this.snapAttackTarget = this.target;
            return false;
        }
        if (Aura.mc.player.age > this.snapAttackAge) {
            this.resetSnapAttack();
            return false;
        }
        return this.isSnapAimReadyForAttack();
    }

    private boolean shouldUseQueuedSnapAttack() {
        if (!this.snapAttackQueued || Aura.mc.player == null || this.target == null || this.target != this.snapAttackTarget) {
            return false;
        }
        if (Aura.mc.player.age > this.snapAttackAge + 1) {
            this.resetSnapAttack();
            return false;
        }
        return Aura.mc.player.age >= this.snapAttackAge;
    }

    private boolean isSnapAimReadyForAttack() {
        boolean onTarget;
        if (this.target == null || Aura.mc.player == null) {
            return false;
        }
        float yawDiff = Math.abs(MathHelper.wrapDegrees((float)(this.targetRotations.x - Aura.mc.player.getYaw())));
        float pitchDiff = Math.abs(this.targetRotations.y - Aura.mc.player.getPitch());
        boolean bl = onTarget = this.isUsingRwWallSnap() || this.isElytraPursuitActive(this.target);
        if (!onTarget) {
            EntityHitResult result = this.getAttackRaycastResult();
            onTarget = result != null && result.getEntity() == this.target;
        }
        return yawDiff <= 3.0f && pitchDiff <= 2.5f && onTarget;
    }

    private boolean isUsingRwWallSnap() {
        return this.rwWallBypass.isState() && this.target != null && this.isTargetBehindWall(this.target);
    }

    private boolean shouldKeepRwWallPitchDown() {
        return this.isUsingRwWallSnap() && this.rwWallLookDown.isState();
    }

    private boolean shouldSkipSprintResetInWater() {
        return Aura.mc.player != null && (Aura.mc.player.isTouchingWater() || Aura.mc.player.isSubmergedInWater()) && Sprint.INSTANCE != null && Sprint.INSTANCE.shouldKeepSprintInWater();
    }

    private boolean shouldSkipSprintReset() {
        return this.shouldSkipSprintResetInWater() || Aura.mc.player != null && Aura.mc.player.isGliding();
    }

    private boolean isElytraPursuitActive(LivingEntity currentTarget) {
        return Aura.mc.player != null && currentTarget != null && ModuleClass.elytraTarget != null && ModuleClass.elytraTarget.shouldTarget(currentTarget);
    }

    private EntityHitResult getAttackRaycastResult() {
        Vec3d eyePos = Aura.mc.player.getCameraPosVec(1.0f);
        Vec3d lookVec = Aura.mc.player.getRotationVec(1.0f);
        float reach = this.getEffectiveAttackRange(this.target);
        Vec3d reachVec = eyePos.add(lookVec.multiply((double)reach));
        return ProjectileUtil.raycast((Entity)Aura.mc.player, (Vec3d)eyePos, (Vec3d)reachVec, (Box)Aura.mc.player.getBoundingBox().expand((double)reach), ex -> ex != Aura.mc.player && ex.isAlive(), (double)(reach * reach));
    }

    private boolean isTargetBehindWall(LivingEntity entity) {
        if (entity == null || Aura.mc.player == null || Aura.mc.world == null) {
            return false;
        }
        return !Aura.mc.player.canSee((Entity)entity) || this.hasNarrowRwWallGap(entity);
    }

    private boolean hasNarrowRwWallGap(LivingEntity entity) {
        if (entity == null || Aura.mc.player == null || Aura.mc.world == null || !this.rwWallBypass.isState()) {
            return false;
        }
        Vec3d eyePos = Aura.mc.player.getEyePos();
        Box box = entity.getBoundingBox();
        double centerX = box.getCenter().x;
        double centerZ = box.getCenter().z;
        Vec3d[] points = new Vec3d[]{box.getCenter(), this.getStableBodyPoint(entity), new Vec3d(centerX, box.maxY - 0.08, centerZ), new Vec3d(centerX, box.minY + 0.12, centerZ), new Vec3d(box.minX + 0.04, box.minY + box.getLengthY() * 0.55, centerZ), new Vec3d(box.maxX - 0.04, box.minY + box.getLengthY() * 0.55, centerZ), new Vec3d(centerX, box.minY + box.getLengthY() * 0.55, box.minZ + 0.04), new Vec3d(centerX, box.minY + box.getLengthY() * 0.55, box.maxZ - 0.04)};
        int blocked = 0;
        int clear = 0;
        for (Vec3d point : points) {
            BlockHitResult hit = Aura.mc.world.raycast(new RaycastContext(eyePos, point, RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, (Entity)Aura.mc.player));
            if (hit != null && hit.getType() == HitResult.Type.BLOCK) {
                ++blocked;
                continue;
            }
            ++clear;
        }
        return clear > 0 && blocked >= clear;
    }

    private Vec3d getPredictedRotationPoint(LivingEntity target, Vec3d point) {
        if (Aura.mc.player != null && target != null && this.isElytraPursuitActive(target)) {
            return PredictUtils.bypasselytrahacking(target);
        }
        return point;
    }

    private Vec3d getStableBodyPoint(LivingEntity target) {
        Box box = target.getBoundingBox();
        return new Vec3d(box.getCenter().x, box.minY + box.getLengthY() * 0.72, box.getCenter().z);
    }

    private LivingEntity findTarget() {
        ArrayList<LivingEntity> entities = new ArrayList<LivingEntity>();
        for (Entity entity2 : Aura.mc.world.getEntities()) {
            LivingEntity living;
            if (!(entity2 instanceof LivingEntity) || !this.isValidTarget(living = (LivingEntity)entity2)) continue;
            entities.add(living);
        }
        if (entities.isEmpty() || !this.isEnable()) {
            return null;
        }
        switch (this.priority.getCurrent()) {
            case "Дистанция": {
                entities.sort(Comparator.comparingDouble(entity -> entity.getBoundingBox().getCenter().squaredDistanceTo(Aura.mc.player.getEyePos())));
                break;
            }
            case "Здоровье": {
                entities.sort(Comparator.comparingDouble(LivingEntity::getHealth));
                break;
            }
            case "Угол": {
                entities.sort(Comparator.comparingDouble(entity -> {
                    Vec2f vec = RotationUtils.getRotations(entity.getBoundingBox().getCenter());
                    double dy = Math.abs(MathHelper.wrapDegrees((float)(vec.x - Aura.mc.player.getYaw())));
                    double dp = Math.abs(MathHelper.wrapDegrees((float)(vec.y - Aura.mc.player.getPitch())));
                    return dy + dp;
                }));
                break;
            }
        }
        return entities.isEmpty() ? null : (LivingEntity)entities.get(0);
    }

    private void updateTarget() {
        if (!this.isEnable()) {
            this.target = null;
            return;
        }
        if (this.target != null && this.isValidTarget(this.target)) {
            return;
        }
        this.target = this.findTarget();
    }

    private void attack() {
    }


    private long getLegitAttackCooldownJitter() {
        return 0L;
    }


    private void tryBreakRwWallBlockPacket() {
        Vec3d end;
        if (!this.rwWallBypass.isState() || this.target == null || Aura.mc.player == null || Aura.mc.world == null) {
            return;
        }
        if (Aura.mc.player.canSee((Entity)(Object)this.target)) {
            return;
        }
        if (Aura.mc.player.networkHandler == null) {
            return;
        }
        Vec3d start = Aura.mc.player.getEyePos();
        BlockHitResult hit = Aura.mc.world.raycast(new RaycastContext(start, end = this.target.getBoundingBox().getCenter(), RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, (Entity)Aura.mc.player));
        if (hit == null || hit.getType() != HitResult.Type.BLOCK) {
            return;
        }
        BlockPos blockPos = hit.getBlockPos();
        if (Aura.mc.world.getBlockState(blockPos).isAir()) {
            return;
        }
        if (Aura.mc.world.getBlockState(blockPos).getHardness((BlockView)Aura.mc.world, blockPos) < 0.0f) {
            return;
        }
        Direction direction = hit.getSide() == null ? Direction.UP : hit.getSide();
        Aura.mc.player.networkHandler.sendPacket((Packet)new PlayerActionC2SPacket(PlayerActionC2SPacket.Action.START_DESTROY_BLOCK, blockPos, direction));
        Aura.mc.player.networkHandler.sendPacket((Packet)new PlayerActionC2SPacket(PlayerActionC2SPacket.Action.STOP_DESTROY_BLOCK, blockPos, direction));
    }

    private boolean shieldBreak(PlayerEntity entity) {
        SlotSearchResult axeSlot = HotbarUtil.getAxe();
        if (!axeSlot.found()) {
            return false;
        }
        int previousSlot = Aura.mc.player.getInventory().selectedSlot;
        if (axeSlot.slot() == previousSlot) {
            Aura.mc.interactionManager.attackEntity((PlayerEntity)Aura.mc.player, (Entity)entity);
            if (ModuleClass.elytraresolver != null && !this.isElytraPursuitActive((LivingEntity)entity)) {
                ModuleClass.elytraresolver.onAuraAttack();
            }
            return true;
        }
        if (axeSlot.isInHotBar()) {
            return this.attackWithSilentHotbarSlot(entity, axeSlot.slot(), previousSlot);
        }
        if (Aura.mc.player.currentScreenHandler.syncId != 0) {
            return false;
        }
        int swapHotbarSlot = this.findSilentSwapHotbarSlot(previousSlot);
        if (swapHotbarSlot == -1) {
            return false;
        }
        this.swapInventoryIntoHotbar(axeSlot.slot(), swapHotbarSlot);
        boolean attacked = false;
        try {
            attacked = this.attackWithSilentHotbarSlot(entity, swapHotbarSlot, previousSlot);
        }
        finally {
            this.swapInventoryIntoHotbar(axeSlot.slot(), swapHotbarSlot);
        }
        return attacked;
    }

    private boolean attackWithSilentHotbarSlot(PlayerEntity entity, int attackSlot, int previousSlot) {
        if (Aura.mc.player == null || Aura.mc.player.networkHandler == null || Aura.mc.interactionManager == null) {
            return false;
        }
        Aura.mc.player.networkHandler.sendPacket((Packet)new UpdateSelectedSlotC2SPacket(attackSlot));
        try {
            Aura.mc.interactionManager.attackEntity((PlayerEntity)Aura.mc.player, (Entity)entity);
            if (ModuleClass.elytraresolver != null && !this.isElytraPursuitActive((LivingEntity)entity)) {
                ModuleClass.elytraresolver.onAuraAttack();
            }
            boolean bl = true;
            return bl;
        }
        finally {
            Aura.mc.player.networkHandler.sendPacket((Packet)new UpdateSelectedSlotC2SPacket(previousSlot));
        }
    }

    private void swapInventoryIntoHotbar(int inventorySlot, int hotbarSlot) {
        if (Aura.mc.player == null || Aura.mc.interactionManager == null || Aura.mc.player.networkHandler == null) {
            return;
        }
        int syncId = Aura.mc.player.currentScreenHandler.syncId;
        Aura.mc.interactionManager.clickSlot(syncId, inventorySlot, hotbarSlot, SlotActionType.SWAP, (PlayerEntity)Aura.mc.player);
        Aura.mc.player.networkHandler.sendPacket((Packet)new CloseHandledScreenC2SPacket(syncId));
    }

    private int findSilentSwapHotbarSlot(int previousSlot) {
        for (int slot = 8; slot >= 0; --slot) {
            if (slot == previousSlot) continue;
            return slot;
        }
        return previousSlot >= 0 && previousSlot < 9 ? previousSlot : -1;
    }

    private Hand getBlockingShieldHand() {
        if (Aura.mc.player == null || !Aura.mc.player.isBlocking()) {
            return null;
        }
        Hand activeHand = Aura.mc.player.getActiveHand();
        if (activeHand == null) {
            return null;
        }
        return this.isShieldStack(Aura.mc.player.getStackInHand(activeHand)) ? activeHand : null;
    }

    private boolean shouldBlockAttackWhileUsingItem() {
        if (Aura.mc.player == null || !Aura.mc.player.isUsingItem()) {
            return false;
        }
        return !this.unpressShield.isState() || this.getBlockingShieldHand() == null;
    }

    private void restoreShieldBlocking(Hand hand) {
        if (Aura.mc.player == null || Aura.mc.interactionManager == null || hand == null) {
            return;
        }
        if (!this.isShieldStack(Aura.mc.player.getStackInHand(hand)) || Aura.mc.player.isUsingItem()) {
            return;
        }
        Aura.mc.interactionManager.interactItem((PlayerEntity)Aura.mc.player, hand);
    }

    private boolean isShieldStack(ItemStack stack) {
        return !stack.isEmpty() && stack.getItem() instanceof ShieldItem;
    }

    private boolean isWeapon() {
        Item item = Aura.mc.player.getMainHandStack().getItem();
        return item != Items.AIR && (item instanceof SwordItem || item instanceof PickaxeItem || item instanceof AxeItem || item instanceof HoeItem || item instanceof ShovelItem || item instanceof MaceItem || item == Items.MACE);
    }

    private boolean isValidTarget(LivingEntity entity) {
        Vec3d nearestPoint;
        if (entity == null || entity == Aura.mc.player) {
            return false;
        }
        if (!entity.isAlive() || entity.getHealth() <= 0.0f) {
            return false;
        }
        if (entity instanceof ArmorStandEntity) {
            return false;
        }
        if (entity instanceof IronGolemEntity || entity instanceof BatEntity) {
            return false;
        }
        if (AntiBot.checkBot(entity)) {
            return false;
        }
        if (entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity)entity;
            if (!this.targets.is("Игроки")) {
                return false;
            }
            if (this.isNaked(player) && !this.targets.is("Голые")) {
                return false;
            }
            if (player.hasStatusEffect(StatusEffects.INVISIBILITY) && !this.targets.is("Невидимки")) {
                return false;
            }
            if (Wonderful.INSTANCE.friendStorage.isFriend(entity.getName().getString())) {
                return false;
            }
        } else if (entity instanceof PassiveEntity || entity instanceof CodEntity) {
            if (!this.targets.is("Мирные")) {
                return false;
            }
        } else if (entity instanceof HostileEntity || entity instanceof Monster) {
            if (!this.targets.is("Мобы")) {
                return false;
            }
        } else {
            return false;
        }
        if ((nearestPoint = BestPoint.getNearestPoint((Entity)entity)) == null) {
            nearestPoint = MultipointUtils.getClosestPoint((Entity)entity);
        }
        if (Aura.mc.player.getEyePos().distanceTo(nearestPoint) > (double)this.getMaxAimRange()) {
            return false;
        }
        return this.throughWalls.isState() || this.rwWallBypass.isState() || Aura.mc.player.canSee((Entity)entity);
    }

    private boolean isNaked(PlayerEntity player) {
        for (ItemStack armorStack : player.getArmorItems()) {
            if (armorStack.isEmpty()) continue;
            return false;
        }
        return true;
    }

    private boolean shouldAttack() {
        if (Aura.mc.player.getAttackCooldownProgress(1.5f) < this.getAICooldown()) {
            return false;
        }
        EntityHitResult result = this.getAttackRaycastResult();
        if (!this.isAttackAimReady(result)) {
            return false;
        }
        if (this.isElytraPursuitActive(this.target)) {
            double strictDist = ИванРуРейТрейс.strictDistance((Entity)Aura.mc.player, (Entity)(Object)this.target);
            return !(strictDist > (double)this.range.getValue().floatValue());
        }
        if (!this.isAttackDistanceReady(this.target)) {
            return false;
        }
        if (this.rotationType.is("Слот2")) {
            if (this.isJumpCritIntent()) {
                return this.isStrictCritWindow();
            }
            return this.canCritical(this.target);
        }
        if (this.isJumpCritIntent()) {
            return this.isStrictCritWindow();
        }
        return this.canCritical(this.target);
    }

    private boolean shouldWaitForJumpCrit() {
        return this.isJumpCritIntent() && !this.isStrictCritWindow();
    }

    private boolean isStrictCritWindow() {
        return Aura.mc.player != null && !Aura.mc.player.isOnGround() && Aura.mc.player.getVelocity().y < 0.0 && Aura.mc.player.fallDistance > 0.0f;
    }

    private boolean isJumpCritIntent() {
        return this.isJumpInputActive() && this.canWaitForNormalJumpCrit();
    }

    private void refreshJumpCritIntent() {
        if (this.isJumpInputActive()) {
            this.jumpCritIntentTicks = 4;
        } else if (this.jumpCritIntentTicks > 0) {
            --this.jumpCritIntentTicks;
        }
    }

    private boolean isJumpInputActive() {
        if (Aura.mc.player == null || Aura.mc.options == null) {
            return false;
        }
        return Aura.mc.options.jumpKey.isPressed() || Aura.mc.player.input.playerInput.jump() || this.jumpCritIntentTicks > 0;
    }

    private boolean canWaitForNormalJumpCrit() {
        return Aura.mc.player != null && Aura.mc.world != null && !Aura.mc.player.isTouchingWater() && !Aura.mc.player.isSubmergedInWater() && !Aura.mc.player.isInLava() && !Aura.mc.player.isClimbing() && !Aura.mc.player.hasVehicle() && !Aura.mc.player.getAbilities().flying && !Aura.mc.player.isGliding() && !Aura.mc.player.hasStatusEffect(StatusEffects.LEVITATION) && !Aura.mc.player.hasStatusEffect(StatusEffects.SLOW_FALLING) && !Aura.mc.player.hasStatusEffect(StatusEffects.BLINDNESS) && !this.isInCobweb();
    }

    private float getAICooldown() {
        Item item = Aura.mc.player.getMainHandStack().getItem();
        if (item == Items.AIR) {
            return 0.9f;
        }
        if (item instanceof AxeItem || item instanceof ShovelItem) {
            return 0.95f;
        }
        return 0.93f;
    }

    private boolean canCritical(LivingEntity target) {
        boolean isCritPossible;
        boolean packetCrits = ModuleClass.packetCriticals.isEnable();
        boolean hasSlowFalling = Aura.mc.player.hasStatusEffect(StatusEffects.SLOW_FALLING);
        boolean inCobweb = this.isInCobweb();
        if (packetCrits && inCobweb) {
            return true;
        }
        if (packetCrits && hasSlowFalling) {
            return Aura.mc.player.getVelocity().y < 0.0 && Aura.mc.player.fallDistance > 0.0f;
        }
        boolean bl = isCritPossible = !Aura.mc.player.isOnGround() && Aura.mc.player.getVelocity().y < 0.0 && Aura.mc.player.fallDistance > 0.0f;
        if (this.cannotPerformCrit()) {
            return true;
        }
        if (this.smartCrit.isState()) {
            return Aura.mc.player.isOnGround() || isCritPossible;
        }
        return isCritPossible;
    }

    private boolean cannotPerformCrit() {
        return Aura.mc.player.isInLava() || Aura.mc.player.isClimbing() || Aura.mc.player.hasStatusEffect(StatusEffects.LEVITATION) || Aura.mc.player.hasStatusEffect(StatusEffects.SLOW_FALLING) || Aura.mc.player.hasStatusEffect(StatusEffects.BLINDNESS) || this.isInCobweb() || Aura.mc.player.isGliding() || Aura.mc.player.hasVehicle() || Aura.mc.player.getAbilities().flying || Aura.mc.player.isTouchingWater() || Aura.mc.player.isSubmergedInWater();
    }

    private boolean isInCobweb() {
        if (Aura.mc.player == null || Aura.mc.world == null) {
            return false;
        }
        Box box = Aura.mc.player.getBoundingBox();
        for (BlockPos pos : BlockPos.iterate((int)MathHelper.floor((double)box.minX), (int)MathHelper.floor((double)box.minY), (int)MathHelper.floor((double)box.minZ), (int)MathHelper.floor((double)box.maxX), (int)MathHelper.floor((double)box.maxY), (int)MathHelper.floor((double)box.maxZ))) {
            if (!Aura.mc.world.getBlockState(pos).isOf(Blocks.COBWEB)) continue;
            return true;
        }
        return false;
    }

    private boolean isAttackDistanceReady(LivingEntity entity) {
        if (Aura.mc.player == null || entity == null) {
            return false;
        }
        float attackRange = this.getEffectiveAttackRange(entity);
        Vec3d nearestPoint = МультипоинтСлот.getNearestPoint((Entity)entity, attackRange);
        return Aura.mc.player.getEyePos().distanceTo(nearestPoint) <= (double)attackRange;
    }

    private boolean isAttackAimReady(EntityHitResult result) {
        if (Aura.mc.player == null || this.target == null) {
            return false;
        }
        if (this.isElytraPursuitActive(this.target)) {
            return true;
        }
        if (this.isUsingRwWallSnap()) {
            return true;
        }
        if (this.rotationType.is("ХолиВорлдИИ") && !this.ротацияХолиВорлдИИ.hasVisiblePoint(this.target, this.getEffectiveAttackRange(this.target))) {
            return false;
        }
        return result != null && result.getEntity() == this.target;
    }

    private float getEffectiveAttackRange(LivingEntity entity) {
        if (entity != null && Aura.mc.player != null && ModuleClass.elytraTarget != null && ModuleClass.elytraTarget.shouldTarget(entity)) {
            return this.range.getValue().floatValue();
        }
        return Math.min(this.range.getValue().floatValue(), 2.95f);
    }

    public boolean isAboveWater() {
        BlockPos pos = BlockPos.ofFloored((Position)Aura.mc.player.getPos().add(0.0, -0.4, 0.0));
        return !Aura.mc.player.isSubmergedInWater() && Aura.mc.world.getBlockState(pos).isOf(Blocks.WATER);
    }

    public float getAttackCooldown() {
        return MathHelper.clamp((float)((float)((ILivingEntity)Aura.mc.player).getLastAttackedTicks() / this.getAttackCooldownProgressPerTick()), (float)0.0f, (float)1.0f);
    }

    public float getRange() {
        return this.range.getValue().floatValue();
    }

    public float getAttackCooldownProgressPerTick() {
        return (float)(1.0 / Aura.mc.player.getAttributeValue(EntityAttributes.ATTACK_SPEED) * 20.0);
    }

    private float getMaxAimRange() {
        return Aura.mc.player.isGliding() ? this.elytraAimRange.getValue().floatValue() : this.range.getValue().floatValue() + this.aimRange.getValue().floatValue();
    }

    @Override
    public void onDisable() {
        super.onDisable();
        if (this.target != null) {
            this.backTimer.reset();
        }
        this.target = null;
        this.ротацияВеллМайн.reset();
        this.тестоваяРотация.reset();
        this.РотацияСлот2.reset();
        this.ротацияХолиВорлдИИ.reset();
        this.иванРуРотация.reset();
        this.иванРуХит.reset();
        this.sprintResetTicksLeft = 0;
        this.sprintResetDone = false;
        this.ticksToAttack = 0;
        this.jumpCritIntentTicks = 0;
        this.resetSnapAttack();
        КомпонентЭлитры.resetState();
        РотацияЭлитры.reset();
        if (RotationStorage.instance != null) {
            RotationStorage.instance.stopRotation();
        }
        if (RotationComponent.instance != null) {
            RotationComponent.instance.stopRotation();
        }
    }

    @Override
    public void onEnable() {
        super.onEnable();
        if (RotationStorage.instance != null) {
            RotationStorage.instance.stopRotation();
        }
        if (RotationComponent.instance != null) {
            RotationComponent.instance.stopRotation();
        }
        this.ротацияВеллМайн.reset();
        this.тестоваяРотация.reset();
        this.РотацияСлот2.reset();
        this.ротацияХолиВорлдИИ.reset();
        this.иванРуРотация.reset();
        this.иванРуХит.reset();
        this.sprintResetTicksLeft = 0;
        this.sprintResetDone = false;
        this.ticksToAttack = 0;
        this.jumpCritIntentTicks = 0;
        this.resetSnapAttack();
        РотацияЭлитры.reset();
        if (Aura.mc.player != null) {
            this.currentRotations = new Vec2f(Aura.mc.player.getYaw(), Aura.mc.player.getPitch());
            this.lastYaw = Aura.mc.player.getYaw();
            this.lastPitch = Aura.mc.player.getPitch();
        }
    }

    private void resetSnapAttack() {
        this.snapAttackAge = -1;
        this.snapAttackQueued = false;
        this.snapAttackTarget = null;
    }

    @Generated
    public LivingEntity getTarget() {
        return this.target;
    }

    @Generated
    public Vec2f getCurrentRotations() {
        return this.currentRotations;
    }

    @Generated
    public Vec2f getTargetRotations() {
        return this.targetRotations;
    }

    @Generated
    public TimerUtils getAttackTimer() {
        return this.attackTimer;
    }
}