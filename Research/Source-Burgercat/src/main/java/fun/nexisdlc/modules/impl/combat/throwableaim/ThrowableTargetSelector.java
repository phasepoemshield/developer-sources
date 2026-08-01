package fun.nexisdlc.modules.impl.combat.throwableaim;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.ModeListSetting;
import fun.nexisdlc.modules.impl.combat.AntiBotSystem;
import fun.nexisdlc.modules.impl.combat.ThrowableAim;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.Monster;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;

import java.util.Comparator;

public final class ThrowableTargetSelector {
    private ThrowableTargetSelector() {
    }

    public static class TargetResult {
        public final LivingEntity mainTarget;
        public final LivingEntity subconsciousTarget;

        public TargetResult(LivingEntity mainTarget, LivingEntity subconsciousTarget) {
            this.mainTarget = mainTarget;
            this.subconsciousTarget = subconsciousTarget;
        }
    }

    public static TargetResult selectTargets(MinecraftClient mc, ThrowableAim throwableAim) {
        if (mc.player == null || mc.world == null) {
            return new TargetResult(null, null);
        }

        double range = throwableAim.distance.get();
        double searchRange = range + 0.7;
        double searchRangeSq = searchRange * searchRange;
        double attackRangeSq = range * range;

        Box search = mc.player.getBoundingBox().expand(searchRange, searchRange + 1, searchRange);
        Vec3d playerPos = new Vec3d(mc.player.getX(), mc.player.getY(), mc.player.getZ());

        LivingEntity candidate = mc.world.getEntitiesByClass(LivingEntity.class, search, e -> true)
                .stream()
                .filter(entity -> isValid(mc, (LivingEntity) entity, searchRangeSq, playerPos))
                .filter(entity -> canSeeThroughWall(mc, (LivingEntity) entity))
                .map(entity -> (LivingEntity) entity)
                .min(Comparator.comparingDouble(entity -> mc.player.distanceTo(entity)))
                .orElse(null);

        if (candidate != null) {
            Vec3d entityPos = new Vec3d(candidate.getX(), candidate.getY(), candidate.getZ());
            double horizontalDistanceSq = entityPos.subtract(playerPos).multiply(1, 0, 1).lengthSquared();

            if (horizontalDistanceSq <= attackRangeSq) {
                return new TargetResult(candidate, candidate);
            } else {
                return new TargetResult(null, candidate);
            }
        }

        return new TargetResult(null, null);
    }

    public static boolean isValid(MinecraftClient mc, LivingEntity entity, double rangeSq, Vec3d playerPos) {
        if (entity == null || mc.player == null) {
            return false;
        }
        if (entity == mc.player || !entity.isAlive() || entity.age < 2) {
            return false;
        }
        if (entity instanceof ClientPlayerEntity || entity.isInvulnerable()) {
            return false;
        }

        Vec3d entityPos = new Vec3d(entity.getX(), entity.getY(), entity.getZ());
        double horizontalDistanceSq = entityPos.subtract(playerPos).multiply(1, 0, 1).lengthSquared();
        if (horizontalDistanceSq > rangeSq) {
            return false;
        }

        if (entity instanceof PlayerEntity player) {
            if (Nexis.getInstance().getFriendStorage().isFriend(player.getName().getString())) {
                return false;
            }
            if (isTeammate(mc, player) && !targetSetting("Тиммейты", false)) {
                return false;
            }
            if (isBot(player)) {
                return targetSetting("Боты", false);
            }
            if (!targetSetting("Игроки", true)) {
                return false;
            }
            if (player.getArmor() == 0 && !targetSetting("Игроки без брони", true)) {
                return false;
            }
            if (player.isInvisible() && player.getArmor() == 0 && !targetSetting("Невидимые", true)) {
                return false;
            }
            return true;
        }

        if (entity instanceof Monster || entity instanceof HostileEntity) {
            return targetSetting("Мобы", true);
        }

        if (entity instanceof AnimalEntity) {
            return targetSetting("Животные", false);
        }

        return false;
    }

    private static boolean isTeammate(MinecraftClient mc, PlayerEntity player) {
        return mc.player != null && player != mc.player && mc.player.isTeammate(player);
    }

    private static boolean isBot(PlayerEntity player) {
        return AntiBotSystem.isBot(player);
    }

    private static boolean targetSetting(String name, boolean fallback) {
        return getModeListValue(ThrowableAim.targets, name, fallback);
    }

    private static boolean getModeListValue(ModeListSetting setting, String name, boolean fallback) {
        if (setting == null) {
            return fallback;
        }
        BooleanSetting value = setting.getByName(name);
        return value != null ? value.get() : fallback;
    }

    private static boolean canSeeThroughWall(MinecraftClient mc, Entity entity) {
        if (entity == null || mc.player == null || mc.world == null) {
            return false;
        }

        return mc.world.raycast(new RaycastContext(
                mc.player.getEyePos(),
                entity.getEyePos(),
                RaycastContext.ShapeType.COLLIDER,
                RaycastContext.FluidHandling.NONE,
                mc.player)).getType() == BlockHitResult.Type.MISS;
    }
}
