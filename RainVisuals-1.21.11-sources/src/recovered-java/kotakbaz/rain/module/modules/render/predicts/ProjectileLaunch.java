/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Vec3d
 */
package kotakbaz.rain.module.modules.render.predicts;

import kotakbaz.rain.module.modules.render.predicts.PredictedProjectile;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0013\u0010\rJB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u00020\u001aH\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u00020\u001dH\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00078\u0006\u00a2\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b'\u0010\r\u00a8\u0006("}, d2={"Loxxxde/\u0638\u0631;", "", "Lnet/minecraft/class_243;", "origin", "direction", "Loxxxde/\u0630\u0638;", "projectile", "", "speed", "inheritedMovement", "<init>", "(Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lkotakbaz/rain/module/modules/render/predicts/PredictedProjectile;DLnet/minecraft/class_243;)V", "component1", "()Lnet/minecraft/class_243;", "component2", "component3", "()Lkotakbaz/rain/module/modules/render/predicts/PredictedProjectile;", "component4", "()D", "component5", "copy", "(Lnet/minecraft/class_243;Lnet/minecraft/class_243;Lkotakbaz/rain/module/modules/render/predicts/PredictedProjectile;DLnet/minecraft/class_243;)Lkotakbaz/rain/module/modules/render/predicts/ProjectileLaunch;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lnet/minecraft/class_243;", "getOrigin", "getDirection", "Loxxxde/\u0630\u0638;", "getProjectile", "D", "getSpeed", "getInheritedMovement", "rain-visuals"})
public final class ProjectileLaunch {
    @NotNull
    private final Vec3d direction;
    @NotNull
    private final Vec3d origin;
    @NotNull
    private final Vec3d inheritedMovement;
    @NotNull
    private final PredictedProjectile projectile;
    private final double speed;

    @NotNull
    public final Vec3d component5() {
        return this.inheritedMovement;
    }

    @NotNull
    public final Vec3d getOrigin() {
        return this.origin;
    }

    @NotNull
    public final Vec3d component1() {
        return this.origin;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProjectileLaunch)) {
            return false;
        }
        ProjectileLaunch projectileLaunch = (ProjectileLaunch)other;
        if (!Intrinsics.areEqual(this.origin, projectileLaunch.origin)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.direction, projectileLaunch.direction)) {
            return false;
        }
        if (this.projectile != projectileLaunch.projectile) {
            return false;
        }
        if (Double.compare(this.speed, projectileLaunch.speed) != 0) {
            return false;
        }
        if (!Intrinsics.areEqual(this.inheritedMovement, projectileLaunch.inheritedMovement)) {
            return false;
        }
        return true;
    }

    public /* synthetic */ ProjectileLaunch(Vec3d vec3d, Vec3d vec3d2, PredictedProjectile predictedProjectile, double d, Vec3d vec3d3, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 8) != 0) {
            d = predictedProjectile.getSpeed();
        }
        if ((n & 0x10) != 0) {
            Vec3d vec3d4 = Vec3d.ZERO;
            Intrinsics.checkNotNullExpressionValue(vec3d4, "ZERO");
            vec3d3 = vec3d4;
        }
        this(vec3d, vec3d2, predictedProjectile, d, vec3d3);
    }

    public static /* synthetic */ ProjectileLaunch copy$default(ProjectileLaunch projectileLaunch, Vec3d vec3d, Vec3d vec3d2, PredictedProjectile predictedProjectile, double d, Vec3d vec3d3, int n, Object object) {
        if ((n & 1) != 0) {
            vec3d = projectileLaunch.origin;
        }
        if ((n & 2) != 0) {
            vec3d2 = projectileLaunch.direction;
        }
        if ((n & 4) != 0) {
            predictedProjectile = projectileLaunch.projectile;
        }
        if ((n & 8) != 0) {
            d = projectileLaunch.speed;
        }
        if ((n & 0x10) != 0) {
            vec3d3 = projectileLaunch.inheritedMovement;
        }
        return projectileLaunch.copy(vec3d, vec3d2, predictedProjectile, d, vec3d3);
    }

    @NotNull
    public final Vec3d getDirection() {
        return this.direction;
    }

    public int hashCode() {
        int result = this.origin.hashCode();
        result = result * 31 + this.direction.hashCode();
        result = result * 31 + this.projectile.hashCode();
        result = result * 31 + Double.hashCode(this.speed);
        result = result * 31 + this.inheritedMovement.hashCode();
        return result;
    }

    public final double component4() {
        return this.speed;
    }

    @NotNull
    public final Vec3d component2() {
        return this.direction;
    }

    @NotNull
    public final ProjectileLaunch copy(@NotNull Vec3d origin, @NotNull Vec3d direction, @NotNull PredictedProjectile projectile, double speed, @NotNull Vec3d inheritedMovement) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter((Object)projectile, "projectile");
        Intrinsics.checkNotNullParameter(inheritedMovement, "inheritedMovement");
        return new ProjectileLaunch(origin, direction, projectile, speed, inheritedMovement);
    }

    public final double getSpeed() {
        return this.speed;
    }

    @NotNull
    public final Vec3d getInheritedMovement() {
        return this.inheritedMovement;
    }

    @NotNull
    public final PredictedProjectile component3() {
        return this.projectile;
    }

    @NotNull
    public String toString() {
        return "ProjectileLaunch(origin=" + this.origin + ", direction=" + this.direction + ", projectile=" + this.projectile + ", speed=" + this.speed + ", inheritedMovement=" + this.inheritedMovement + ")";
    }

    @NotNull
    public final PredictedProjectile getProjectile() {
        return this.projectile;
    }

    public ProjectileLaunch(@NotNull Vec3d origin, @NotNull Vec3d direction, @NotNull PredictedProjectile projectile, double speed, @NotNull Vec3d inheritedMovement) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter((Object)projectile, "projectile");
        Intrinsics.checkNotNullParameter(inheritedMovement, "inheritedMovement");
        this.origin = origin;
        this.direction = direction;
        this.projectile = projectile;
        this.speed = speed;
        this.inheritedMovement = inheritedMovement;
    }
}

