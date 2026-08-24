/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.modules.render.predicts;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u00a2\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\b\u001a\u00020\u00078\u0006\u00a2\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017\u00a8\u0006\u0018"}, d2={"Loxxxde/\u0630\u0638;", "", "", "speed", "gravity", "airDrag", "waterDrag", "", "inheritsShooterMovement", "<init>", "(Ljava/lang/String;IDDDDZ)V", "D", "getSpeed", "()D", "getGravity", "getAirDrag", "getWaterDrag", "Z", "getInheritsShooterMovement", "()Z", "CROSSBOW_ARROW", "BOW_ARROW", "ENDER_PEARL", "TRIDENT", "rain-visuals"})
public final class PredictedProjectile
extends Enum<PredictedProjectile> {
    public static final /* enum */ PredictedProjectile TRIDENT;
    private final double airDrag;
    private final double gravity;
    private static final /* synthetic */ PredictedProjectile[] $VALUES;
    public static final /* enum */ PredictedProjectile CROSSBOW_ARROW;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* enum */ PredictedProjectile BOW_ARROW;
    private final double waterDrag;
    private final boolean inheritsShooterMovement;
    private final double speed;
    public static final /* enum */ PredictedProjectile ENDER_PEARL;

    public final double getGravity() {
        return this.gravity;
    }

    private PredictedProjectile(double speed, double gravity, double airDrag, double waterDrag, boolean inheritsShooterMovement) {
        this.speed = speed;
        this.gravity = gravity;
        this.airDrag = airDrag;
        this.waterDrag = waterDrag;
        this.inheritsShooterMovement = inheritsShooterMovement;
    }

    public final double getWaterDrag() {
        return this.waterDrag;
    }

    public final double getSpeed() {
        return this.speed;
    }

    public final boolean getInheritsShooterMovement() {
        return this.inheritsShooterMovement;
    }

    public static PredictedProjectile[] values() {
        return (PredictedProjectile[])$VALUES.clone();
    }

    static {
        CROSSBOW_ARROW = new PredictedProjectile(3.15, 0.05, 0.99, 0.6, false);
        BOW_ARROW = new PredictedProjectile(3.0, 0.05, 0.99, 0.6, true);
        ENDER_PEARL = new PredictedProjectile(1.5, 0.03, 0.99, 0.8, true);
        TRIDENT = new PredictedProjectile(2.5, 0.05, 0.99, 0.99, true);
        $VALUES = PredictedProjectile.$values();
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }

    public static PredictedProjectile valueOf(String value) {
        return Enum.valueOf(PredictedProjectile.class, value);
    }

    private static final /* synthetic */ PredictedProjectile[] $values() {
        PredictedProjectile[] predictedProjectileArray = new PredictedProjectile[4];
        predictedProjectileArray[0] = CROSSBOW_ARROW;
        predictedProjectileArray[1] = BOW_ARROW;
        predictedProjectileArray[2] = ENDER_PEARL;
        predictedProjectileArray[3] = TRIDENT;
        return predictedProjectileArray;
    }

    public final double getAirDrag() {
        return this.airDrag;
    }

    @NotNull
    public static EnumEntries<PredictedProjectile> getEntries() {
        return $ENTRIES;
    }
}

