package fun.nexisdlc.modules.impl.combat;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.events.impl.client.EventPostSync;
import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.utils.client.other.Script;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.math.time.StopWatch;
import fun.nexisdlc.client.utils.player.PlayerInventoryUtil;
import fun.nexisdlc.client.utils.player.PlayerUtils;
import fun.nexisdlc.client.utils.player.rotation.RotationTask;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BindSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeSetting;
import fun.nexisdlc.modules.api.settings.impl.SliderSetting;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.thrown.EnderPearlEntity;
import net.minecraft.item.Items;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;

import java.util.Comparator;

@FunctionAdd(name = "TargetPearl", alias = "Target Pearl", category = Category.Combat, description = "Автоматически кидает пёрл за выбранной целью")
public class TargetPearl extends Function {
    private final StopWatch stopWatch = new StopWatch();
    private final Script script = new Script();
    private final ModeSetting modeSetting = new ModeSetting("Режим", "Всегда", "Бинд", "Всегда");
    private final ModeSetting targetSetting = new ModeSetting("Цели", "Таргет ауры", "Таргет ауры", "Все");
    private final BindSetting throwSetting = new BindSetting("Кнопка броска", -1).setVisible(() -> modeSetting.is("Бинд"));
    private final SliderSetting distanceSetting = new SliderSetting("Дистанция", 6f, 3f, 20, 1f);

    public TargetPearl() {
        addSettings(modeSetting, targetSetting, throwSetting, distanceSetting);
    }

    @EventHandler
    public void onUpdate(UpdateEvent event) {
        if (nullCheck() || !stopWatch.hasReached(1000)) return;
        if (modeSetting.is("Бинд") && !PlayerInventoryUtil.isKey(throwSetting)) return;
        if (PlayerInventoryUtil.getSlot(Items.ENDER_PEARL) == null || hasLocalPearlInFlight()) {
            stopWatch.reset();
            return;
        }

        LivingEntity auraTarget = AuraModule.target;
        EnderPearlEntity candidate = mc.world.getEntitiesByClass(EnderPearlEntity.class, mc.player.getBoundingBox().expand(128), pearl -> true)
                .stream()
                .filter(pearl -> !isLocalPearl(pearl))
                .filter(this::isValidOwner)
                .filter(pearl -> targetSetting.is("Все") || pearl.getOwner() == auraTarget)
                .min(Comparator.comparingDouble(this::getRotationDiffToHit))
                .orElse(null);
        if (candidate == null) return;

        HitResult targetHit = predictPearlHit(candidate);
        if (targetHit == null || new Vec3d(mc.player.getX(), mc.player.getY(), mc.player.getZ()).distanceTo(targetHit.getPos()) <= distanceSetting.get()) return;

        Vec3d eyePos = mc.player.getEyePos();
        float yaw = calcYaw(eyePos, targetHit.getPos());
        Angle best = findBestAngle(eyePos, targetHit.getPos(), yaw);
        if (best == null) return;

        RotationTask.setTargetRotation(best.yaw, best.pitch, Float.MAX_VALUE, Float.MAX_VALUE, 1f, 1f, 0, 7);
        PlayerUtils.unPressMoveKeys();
        script.cleanup().addTickStep(0, () -> {
            PlayerInventoryUtil.swapAndUse(Items.ENDER_PEARL);
            PlayerUtils.enableMoveKeys();
        });
        stopWatch.reset();
    }

    @EventHandler
    public void onPostSync(EventPostSync event) {
        script.update();
    }

    private boolean hasLocalPearlInFlight() {
        return !mc.world.getEntitiesByClass(EnderPearlEntity.class, mc.player.getBoundingBox().expand(128), this::isLocalPearl).isEmpty();
    }

    private boolean isLocalPearl(EnderPearlEntity pearl) {
        Entity owner = pearl.getOwner();
        return owner != null && owner == mc.player;
    }

    private boolean isValidOwner(EnderPearlEntity pearl) {
        Entity owner = pearl.getOwner();
        return owner instanceof LivingEntity living && owner != mc.player && !Nexis.getInstance().getFriendStorage().isFriend(living.getName().getString());
    }

    private double getRotationDiffToHit(EnderPearlEntity pearl) {
        HitResult hit = predictPearlHit(pearl);
        if (hit == null) return Double.MAX_VALUE;
        Vec3d eyePos = mc.player.getEyePos();
        float yaw = calcYaw(eyePos, hit.getPos());
        float pitch = calcPitch(eyePos, hit.getPos());
        return Math.abs(MathHelper.wrapDegrees(yaw - RotationTask.visualHeadYaw)) + Math.abs(pitch - RotationTask.visualHeadPitch);
    }

    private Angle findBestAngle(Vec3d eyePos, Vec3d targetPos, float yaw) {
        Angle best = null;
        double bestDist = Double.MAX_VALUE;
        for (int pitch = -89; pitch <= 89; pitch++) {
            HitResult hit = simulateThrow(eyePos, PlayerUtils.toVector(yaw, pitch));
            if (hit == null) continue;
            double dist = hit.getPos().distanceTo(targetPos);
            if (dist <= 3.0 && dist < bestDist) {
                bestDist = dist;
                best = new Angle(yaw, pitch);
            }
        }
        return best;
    }

    private HitResult simulateThrow(Vec3d start, Vec3d direction) {
        Vec3d velocity = direction.normalize().multiply(1.5);
        Vec3d pos = start;
        for (int i = 0; i < 160; i++) {
            Vec3d nextPos = pos.add(velocity);
            HitResult hit = mc.world.raycast(new RaycastContext(pos, nextPos, RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, mc.player));
            if (hit.getType() == HitResult.Type.BLOCK) return hit;
            pos = nextPos;
            velocity = applyPearlMotion(pos, velocity);
            if (pos.y < -64) break;
        }
        return new BlockHitResult(pos, Direction.UP, BlockPos.ofFloored(pos), false);
    }

    private HitResult predictPearlHit(EnderPearlEntity pearl) {
        Vec3d pos = new Vec3d(pearl.getX(), pearl.getY(), pearl.getZ());
        Vec3d motion = pearl.getVelocity();
        for (int i = 0; i < 160; i++) {
            Vec3d prevPos = pos;
            pos = pos.add(motion);
            motion = applyPearlMotion(prevPos, motion);
            HitResult hit = mc.world.raycast(new RaycastContext(prevPos, pos, RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, pearl));
            if (hit.getType() == HitResult.Type.BLOCK) return hit;
            if (pos.y < -64) break;
        }
        return new BlockHitResult(pos, Direction.UP, BlockPos.ofFloored(pos), false);
    }

    private Vec3d applyPearlMotion(Vec3d pos, Vec3d motion) {
        boolean inWater = mc.world.getBlockState(BlockPos.ofFloored(pos)).getFluidState().isIn(net.minecraft.registry.tag.FluidTags.WATER);
        return (inWater ? motion.multiply(0.8) : motion.multiply(0.99)).add(0, -0.03f, 0);
    }

    private static float calcYaw(Vec3d from, Vec3d to) {
        Vec3d diff = to.subtract(from);
        return (float) (Math.toDegrees(Math.atan2(diff.z, diff.x)) - 90.0);
    }

    private static float calcPitch(Vec3d from, Vec3d to) {
        Vec3d diff = to.subtract(from);
        return (float) -Math.toDegrees(Math.atan2(diff.y, Math.sqrt(diff.x * diff.x + diff.z * diff.z)));
    }

    private record Angle(float yaw, float pitch) {
    }
}
