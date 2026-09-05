/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class04251
 *  minecraft.class07701
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00392;
import minecraft.class04251;
import minecraft.class05531;
import minecraft.class07701;

final class class05510
extends Record
implements class04251 {
    private final class07701 source;

    class05510(class07701 class077012) {
        this.source = class077012;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05510.class, "source", "source"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05510.class, "source", "source"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05510.class, "source", "source"}, this);
    }

    public void y(class05531 class055312) {
    }

    public class07701 N() {
        return this.source;
    }

    public void N(class05531 class055312) {
        this.source.N(() -> class00392.N((String)"commands.test.batch.starting", (Object[])new Object[]{class055312.L().M(), class055312.N()}), true);
    }
}

