/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.entity.projectile.ProjectileUtil
 *  net.minecraft.registry.tag.FluidTags
 *  net.minecraft.registry.tag.TagKey
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.EntityHitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Position
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 *  net.minecraft.world.World
 */
package oxxxde;

import java.util.ArrayList;
import java.util.Collection;
import kotakbaz.rain.module.modules.render.predicts.ProjectileLaunch;
import kotakbaz.rain.module.modules.render.predicts.TrajectoryImpact;
import kotakbaz.rain.module.modules.render.predicts.TrajectoryImpactType;
import kotakbaz.rain.module.modules.render.predicts.TrajectoryPrediction;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Position;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0637\u062b;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\rH\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b#\u0010\"\u00a8\u0006$"}, d2={"Loxxxde/\u062d\u0648;", "", "<init>", "()V", "Lnet/minecraft/class_638;", "world", "Lnet/minecraft/class_1657;", "shooter", "Loxxxde/\u0638\u0631;", "launch", "Loxxxde/\u0628\u062e;", "predict", "(Lnet/minecraft/class_638;Lnet/minecraft/class_1657;Lkotakbaz/rain/module/modules/render/predicts/ProjectileLaunch;)Lkotakbaz/rain/module/modules/render/predicts/TrajectoryPrediction;", "Lnet/minecraft/class_243;", "initialVelocity", "(Lkotakbaz/rain/module/modules/render/predicts/ProjectileLaunch;)Lnet/minecraft/class_243;", "start", "intendedEnd", "Loxxxde/\u0627\u0623;", "findCollision", "(Lnet/minecraft/class_638;Lnet/minecraft/class_1657;Lnet/minecraft/class_243;Lnet/minecraft/class_243;)Lkotakbaz/rain/module/modules/render/predicts/TrajectoryImpact;", "Lnet/minecraft/class_1297;", "entity", "", "isValidTarget", "(Lnet/minecraft/class_1657;Lnet/minecraft/class_1297;)Z", "position", "isOutsideWorld", "(Lnet/minecraft/class_638;Lnet/minecraft/class_243;)Z", "", "MAX_STEPS", "I", "", "SEARCH_MARGIN", "D", "WORLD_HEIGHT_PADDING", "rain-visuals"})
public final class \u062d\u0648 {
    private static final int MAX_STEPS = 240;
    private static final double WORLD_HEIGHT_PADDING = 16.0;
    @NotNull
    public static final \u062d\u0648 INSTANCE = new \u062d\u0648();
    private static final double SEARCH_MARGIN = 1.0;

    private static final boolean findCollision$lambda$0(PlayerEntity $shooter, Entity entity) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        return INSTANCE.isValidTarget($shooter, entity);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final TrajectoryPrediction predict(@NotNull ClientWorld world, @NotNull PlayerEntity shooter, @NotNull ProjectileLaunch launch) {
        Intrinsics.checkNotNullParameter(world, "world");
        Intrinsics.checkNotNullParameter(shooter, "shooter");
        Intrinsics.checkNotNullParameter(launch, "launch");
        ArrayList points = new ArrayList(241);
        Vec3d position = null;
        position = launch.getOrigin();
        Vec3d velocity = null;
        velocity = this.initialVelocity(launch);
        ((Collection)points).add(position);
        int n = 240;
        for (int i = 0; i < n; ++i) {
            TagKey tagKey;
            Vec3d intendedEnd;
            void $this$isIn$iv;
            int it = i;
            boolean bl = false;
            Intrinsics.checkNotNullExpressionValue(world.getFluidState(BlockPos.ofFloored((Position)((Position)position))), "getFluidState(...)");
            TagKey tagKey2 = FluidTags.WATER;
            Intrinsics.checkNotNullExpressionValue(tagKey2, "WATER");
            TagKey tag$iv = tagKey2;
            boolean $i$f$isIn = false;
            boolean inWater = $this$isIn$iv.isIn(tag$iv);
            tag$iv = inWater ? velocity.multiply(launch.getProjectile().getWaterDrag()) : velocity;
            Intrinsics.checkNotNull(tag$iv);
            TagKey movement = tag$iv;
            Intrinsics.checkNotNullExpressionValue(position.add((Vec3d)movement), "add(...)");
            TrajectoryImpact collision = INSTANCE.findCollision(world, shooter, position, intendedEnd);
            if (collision != null) {
                ((Collection)points).add(collision.getPosition());
                return new TrajectoryPrediction(points, collision);
            }
            position = intendedEnd;
            ((Collection)points).add(position);
            if (INSTANCE.isOutsideWorld(world, position)) {
                return new TrajectoryPrediction(points, new TrajectoryImpact(TrajectoryImpactType.LIMIT, position, null, 4, null));
            }
            if (inWater) {
                tagKey = movement;
            } else {
                Vec3d vec3d = velocity.multiply(launch.getProjectile().getAirDrag());
                tagKey = vec3d;
                Intrinsics.checkNotNullExpressionValue(vec3d, "scale(...)");
            }
            velocity = tagKey;
            Vec3d vec3d = velocity.add(0.0, -launch.getProjectile().getGravity(), 0.0);
            Intrinsics.checkNotNullExpressionValue(vec3d, "add(...)");
            velocity = vec3d;
        }
        return new TrajectoryPrediction(points, new TrajectoryImpact(TrajectoryImpactType.LIMIT, (Vec3d)CollectionsKt.last(points), null, 4, null));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean isOutsideWorld(ClientWorld world, Vec3d position) {
        if (position.y < (double)\u0637\u062b.getBottomY((World)world) - 16.0) return true;
        if (!(position.y > (double)\u0637\u062b.getTopYInclusive((World)world) + 16.0)) return false;
        return true;
    }

    private final Vec3d initialVelocity(ProjectileLaunch launch) {
        Vec3d vec3d = launch.getDirection().normalize().multiply(launch.getSpeed());
        Intrinsics.checkNotNullExpressionValue(vec3d, "scale(...)");
        Vec3d velocity = vec3d;
        if (!launch.getProjectile().getInheritsShooterMovement()) {
            return velocity;
        }
        Vec3d vec3d2 = velocity.add(launch.getInheritedMovement().x, launch.getInheritedMovement().y, launch.getInheritedMovement().z);
        Intrinsics.checkNotNullExpressionValue(vec3d2, "add(...)");
        Vec3d vec3d3 = vec3d2;
        return vec3d3;
    }

    private \u062d\u0648() {
    }

    /*
     * WARNING - void declaration
     */
    private final boolean isValidTarget(PlayerEntity shooter, Entity entity) {
        LivingEntity living;
        block9: {
            block8: {
                LivingEntity livingEntity = entity instanceof LivingEntity ? (LivingEntity)entity : null;
                if (livingEntity == null) {
                    return false;
                }
                living = livingEntity;
                if (living == shooter) break block8;
                if (living.isRemoved()) break block8;
                if (living.isAlive()) break block9;
            }
            return false;
        }
        if (!living.canBeHitByProjectile()) {
            return false;
        }
        if (living.isConnectedThroughVehicle((Entity)shooter)) {
            return false;
        }
        if (living instanceof PlayerEntity) {
            void var3_3;
            if (!shooter.shouldDamagePlayer((PlayerEntity)var3_3)) {
                return false;
            }
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private final TrajectoryImpact findCollision(ClientWorld world, PlayerEntity shooter, Vec3d start, Vec3d intendedEnd) {
        Vec3d vec3d;
        void $this$raycast$iv;
        World world2 = (World)world;
        RaycastContext context$iv = new RaycastContext(start, intendedEnd, RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, (Entity)shooter);
        boolean $i$f$raycast = false;
        BlockHitResult blockHitResult = $this$raycast$iv.raycast(context$iv);
        Intrinsics.checkNotNullExpressionValue(blockHitResult, "clip(...)");
        BlockHitResult blockHit = blockHitResult;
        if (blockHit.getType() == HitResult.Type.MISS) {
            vec3d = intendedEnd;
        } else {
            Vec3d vec3d2 = blockHit.getPos();
            vec3d = vec3d2;
            Intrinsics.checkNotNullExpressionValue(vec3d2, "getLocation(...)");
        }
        Vec3d collisionEnd = vec3d;
        Box box = new Box(start, collisionEnd).expand(1.0);
        Intrinsics.checkNotNullExpressionValue(box, "inflate(...)");
        Box searchBox = box;
        double maxDistanceSq = start.squaredDistanceTo(collisionEnd);
        EntityHitResult entityHit = ProjectileUtil.raycast((Entity)((Entity)shooter), (Vec3d)start, (Vec3d)collisionEnd, (Box)searchBox, arg_0 -> \u062d\u0648.findCollision$lambda$0(shooter, arg_0), (double)maxDistanceSq);
        if (entityHit != null) {
            Vec3d vec3d3 = entityHit.getPos();
            Intrinsics.checkNotNullExpressionValue(vec3d3, "getLocation(...)");
            Entity entity = entityHit.getEntity();
            Intrinsics.checkNotNull(entity, "null cannot be cast to non-null type net.minecraft.world.entity.LivingEntity");
            return new TrajectoryImpact(TrajectoryImpactType.ENTITY, vec3d3, (LivingEntity)entity);
        }
        if (blockHit.getType() != HitResult.Type.MISS) {
            Vec3d vec3d4 = blockHit.getPos();
            Intrinsics.checkNotNullExpressionValue(vec3d4, "getLocation(...)");
            return new TrajectoryImpact(TrajectoryImpactType.BLOCK, vec3d4, null, 4, null);
        }
        return null;
    }
}

