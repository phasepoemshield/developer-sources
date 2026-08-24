/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.util.math.Vec3d
 */
package kotakbaz.rain.module.modules.render.predicts;

import java.util.List;
import kotakbaz.rain.module.modules.render.predicts.TrajectoryImpact;
import kotakbaz.rain.module.modules.render.predicts.TrajectoryImpactType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u00020\u0013H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0017\u001a\u00020\u0016H\u00d6\u0081\u0004\u00a2\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0011\u0010\u001f\u001a\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006 "}, d2={"Loxxxde/\u0628\u062e;", "", "", "Lnet/minecraft/class_243;", "points", "Loxxxde/\u0627\u0623;", "impact", "<init>", "(Ljava/util/List;Lkotakbaz/rain/module/modules/render/predicts/TrajectoryImpact;)V", "component1", "()Ljava/util/List;", "component2", "()Lkotakbaz/rain/module/modules/render/predicts/TrajectoryImpact;", "copy", "(Ljava/util/List;Lkotakbaz/rain/module/modules/render/predicts/TrajectoryImpact;)Lkotakbaz/rain/module/modules/render/predicts/TrajectoryPrediction;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getPoints", "Loxxxde/\u0627\u0623;", "getImpact", "getHitsTarget", "()Z", "hitsTarget", "rain-visuals"})
public final class TrajectoryPrediction {
    @NotNull
    private final List<Vec3d> points;
    @NotNull
    private final TrajectoryImpact impact;

    @NotNull
    public final List<Vec3d> component1() {
        return this.points;
    }

    @NotNull
    public final TrajectoryPrediction copy(@NotNull List<? extends Vec3d> points, @NotNull TrajectoryImpact impact) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(impact, "impact");
        return new TrajectoryPrediction(points, impact);
    }

    @NotNull
    public final TrajectoryImpact component2() {
        return this.impact;
    }

    @NotNull
    public final List<Vec3d> getPoints() {
        return this.points;
    }

    public final boolean getHitsTarget() {
        return this.impact.getType() == TrajectoryImpactType.ENTITY && this.impact.getTarget() != null;
    }

    @NotNull
    public String toString() {
        return "TrajectoryPrediction(points=" + this.points + ", impact=" + this.impact + ")";
    }

    public int hashCode() {
        int result = ((Object)this.points).hashCode();
        result = result * 31 + this.impact.hashCode();
        return result;
    }

    @NotNull
    public final TrajectoryImpact getImpact() {
        return this.impact;
    }

    public TrajectoryPrediction(@NotNull List<? extends Vec3d> points, @NotNull TrajectoryImpact impact) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(impact, "impact");
        this.points = points;
        this.impact = impact;
    }

    public static /* synthetic */ TrajectoryPrediction copy$default(TrajectoryPrediction trajectoryPrediction, List list, TrajectoryImpact trajectoryImpact, int n, Object object) {
        if ((n & 1) != 0) {
            list = trajectoryPrediction.points;
        }
        if ((n & 2) != 0) {
            trajectoryImpact = trajectoryPrediction.impact;
        }
        return trajectoryPrediction.copy(list, trajectoryImpact);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrajectoryPrediction)) {
            return false;
        }
        TrajectoryPrediction trajectoryPrediction = (TrajectoryPrediction)other;
        if (!Intrinsics.areEqual(this.points, trajectoryPrediction.points)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.impact, trajectoryPrediction.impact)) {
            return false;
        }
        return true;
    }
}

