/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.draggable.animation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u062b\u0634;
import oxxxde.\u0638\u0629;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b\u00a2\u0006\u0004\b\u0006\u0010\tj\u0002\b\nj\u0002\b\u000b\u00a8\u0006\f"}, d2={"Loxxxde/\u0631\u0636;", "", "<init>", "(Ljava/lang/String;I)V", "", "x", "apply", "(D)D", "", "(F)F", "LINEAR", "SINE_OUT", "rain-visuals"})
public abstract class Easing
extends Enum<Easing> {
    public static final /* enum */ Easing LINEAR = new \u062b\u0634("LINEAR", 0);
    private static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* enum */ Easing SINE_OUT = new \u0638\u0629("SINE_OUT", 1);
    private static final /* synthetic */ Easing[] $VALUES;

    public /* synthetic */ Easing(String $enum$name, int $enum$ordinal, DefaultConstructorMarker $constructor_marker) {
        this();
    }

    public static Easing valueOf(String value) {
        return Enum.valueOf(Easing.class, value);
    }

    public static Easing[] values() {
        return (Easing[])$VALUES.clone();
    }

    private static final /* synthetic */ Easing[] $values() {
        Easing[] easingArray = new Easing[2];
        easingArray[0] = LINEAR;
        easingArray[1] = SINE_OUT;
        return easingArray;
    }

    @NotNull
    public static EnumEntries<Easing> getEntries() {
        return $ENTRIES;
    }

    private Easing() {
    }

    public final float apply(float x) {
        return (float)this.apply((double)x);
    }

    static {
        $VALUES = Easing.$values();
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }

    public abstract double apply(double var1);
}

