/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.modules.render.predicts;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2={"Loxxxde/\u0634\u0650;", "", "<init>", "(Ljava/lang/String;I)V", "ENTITY", "BLOCK", "LIMIT", "rain-visuals"})
public final class TrajectoryImpactType
extends Enum<TrajectoryImpactType> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* enum */ TrajectoryImpactType LIMIT;
    public static final /* enum */ TrajectoryImpactType ENTITY;
    private static final /* synthetic */ TrajectoryImpactType[] $VALUES;
    public static final /* enum */ TrajectoryImpactType BLOCK;

    static {
        ENTITY = new TrajectoryImpactType();
        BLOCK = new TrajectoryImpactType();
        LIMIT = new TrajectoryImpactType();
        $VALUES = TrajectoryImpactType.$values();
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }

    public static TrajectoryImpactType valueOf(String value) {
        return Enum.valueOf(TrajectoryImpactType.class, value);
    }

    public static TrajectoryImpactType[] values() {
        return (TrajectoryImpactType[])$VALUES.clone();
    }

    private static final /* synthetic */ TrajectoryImpactType[] $values() {
        TrajectoryImpactType[] trajectoryImpactTypeArray = new TrajectoryImpactType[3];
        trajectoryImpactTypeArray[0] = ENTITY;
        trajectoryImpactTypeArray[1] = BLOCK;
        trajectoryImpactTypeArray[2] = LIMIT;
        return trajectoryImpactTypeArray;
    }

    @NotNull
    public static EnumEntries<TrajectoryImpactType> getEntries() {
        return $ENTRIES;
    }
}

