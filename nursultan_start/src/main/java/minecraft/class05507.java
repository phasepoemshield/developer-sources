/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class06541
 *  minecraft.class07701
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00392;
import minecraft.class05494;
import minecraft.class05513;
import minecraft.class05520;
import minecraft.class05532;
import minecraft.class06541;
import minecraft.class07701;

public final class class05507
extends Record
implements class05532 {
    private final class07701 source;
    private final class05494 tracker;

    private void L() {
        if (this.tracker.Z()) {
            this.source.N(() -> class00392.N((String)"commands.test.summary", (Object[])new Object[]{this.tracker.B()}).N(class06541.field_1068), true);
            if (this.tracker.u()) {
                this.source.y((class00392)class00392.N((String)"commands.test.summary.failed", (Object[])new Object[]{this.tracker.N()}));
            } else {
                this.source.N(() -> class00392.L((String)"commands.test.summary.all_required_passed").N(class06541.field_1060), true);
            }
            if (this.tracker.i()) {
                this.source.N((class00392)class00392.N((String)"commands.test.summary.optional_failed", (Object[])new Object[]{this.tracker.y()}));
            }
        }
    }

    public class05507(class07701 class077012, class05494 class054942) {
        this.source = class077012;
        this.tracker = class054942;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05507.class, "source;tracker", "source", "tracker"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05507.class, "source;tracker", "source", "tracker"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05507.class, "source;tracker", "source", "tracker"}, this);
    }

    public class05494 y() {
        return this.tracker;
    }

    @Override
    public void y(class05513 class055132, class05520 class055202) {
        this.L();
    }

    @Override
    public void N(class05513 class055132, class05513 class055133, class05520 class055202) {
        this.tracker.N(class055133);
    }

    public class07701 N() {
        return this.source;
    }

    @Override
    public void N(class05513 class055132) {
    }

    @Override
    public void N(class05513 class055132, class05520 class055202) {
        this.L();
    }
}

