/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.util.math.Vec3d
 */
package kotakbaz.rain.module.modules.render.predicts;

import kotakbaz.rain.module.modules.render.predicts.TrajectoryImpactType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u00020\u0016H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u00020\u0019H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f\u00a8\u0006\""}, d2={"Loxxxde/\u0627\u0623;", "", "Loxxxde/\u0634\u0650;", "type", "Lnet/minecraft/class_243;", "position", "Lnet/minecraft/class_1309;", "target", "<init>", "(Lkotakbaz/rain/module/modules/render/predicts/TrajectoryImpactType;Lnet/minecraft/class_243;Lnet/minecraft/class_1309;)V", "component1", "()Lkotakbaz/rain/module/modules/render/predicts/TrajectoryImpactType;", "component2", "()Lnet/minecraft/class_243;", "component3", "()Lnet/minecraft/class_1309;", "copy", "(Lkotakbaz/rain/module/modules/render/predicts/TrajectoryImpactType;Lnet/minecraft/class_243;Lnet/minecraft/class_1309;)Lkotakbaz/rain/module/modules/render/predicts/TrajectoryImpact;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Loxxxde/\u0634\u0650;", "getType", "Lnet/minecraft/class_243;", "getPosition", "Lnet/minecraft/class_1309;", "getTarget", "rain-visuals"})
public final class TrajectoryImpact {
    @Nullable
    private final LivingEntity target;
    @NotNull
    private final Vec3d position;
    @NotNull
    private final TrajectoryImpactType type;

    public /* synthetic */ TrajectoryImpact(TrajectoryImpactType trajectoryImpactType, Vec3d vec3d, LivingEntity livingEntity, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 4) != 0) {
            livingEntity = null;
        }
        this(trajectoryImpactType, vec3d, livingEntity);
    }

    @NotNull
    public final TrajectoryImpactType component1() {
        return this.type;
    }

    @Nullable
    public final LivingEntity getTarget() {
        return this.target;
    }

    public TrajectoryImpact(@NotNull TrajectoryImpactType type, @NotNull Vec3d position, @Nullable LivingEntity target) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter(position, "position");
        this.type = type;
        this.position = position;
        this.target = target;
    }

    public static /* synthetic */ TrajectoryImpact copy$default(TrajectoryImpact trajectoryImpact, TrajectoryImpactType trajectoryImpactType, Vec3d vec3d, LivingEntity livingEntity, int n, Object object) {
        if ((n & 1) != 0) {
            trajectoryImpactType = trajectoryImpact.type;
        }
        if ((n & 2) != 0) {
            vec3d = trajectoryImpact.position;
        }
        if ((n & 4) != 0) {
            livingEntity = trajectoryImpact.target;
        }
        return trajectoryImpact.copy(trajectoryImpactType, vec3d, livingEntity);
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        void var1_1;
        int result = this.type.hashCode();
        result = result * 31 + this.position.hashCode();
        result = result * 31 + (this.target == null ? 0 : this.target.hashCode());
        return (int)var1_1;
    }

    @NotNull
    public final TrajectoryImpact copy(@NotNull TrajectoryImpactType type, @NotNull Vec3d position, @Nullable LivingEntity target) {
        Intrinsics.checkNotNullParameter((Object)type, "type");
        Intrinsics.checkNotNullParameter(position, "position");
        return new TrajectoryImpact(type, position, target);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrajectoryImpact)) {
            return false;
        }
        TrajectoryImpact trajectoryImpact = (TrajectoryImpact)other;
        if (this.type != trajectoryImpact.type) {
            return false;
        }
        if (!Intrinsics.areEqual(this.position, trajectoryImpact.position)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.target, trajectoryImpact.target)) {
            return false;
        }
        return true;
    }

    @NotNull
    public final Vec3d component2() {
        return this.position;
    }

    @NotNull
    public final TrajectoryImpactType getType() {
        return this.type;
    }

    @Nullable
    public final LivingEntity component3() {
        return this.target;
    }

    @NotNull
    public final Vec3d getPosition() {
        return this.position;
    }

    @NotNull
    public String toString() {
        return "TrajectoryImpact(type=" + this.type + ", position=" + this.position + ", target=" + this.target + ")";
    }
}

