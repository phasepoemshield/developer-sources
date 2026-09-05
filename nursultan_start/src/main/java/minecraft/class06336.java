/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class04651
 *  minecraft.class07209
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00500;
import minecraft.class04651;
import minecraft.class07209;

final class class06336
extends Record {
    final class07209 pos;
    final class04651 fluid;
    final class00500 sourceState;

    public class00500 L() {
        return this.sourceState;
    }

    class06336(class07209 class072092, class04651 class046512, class00500 class005002) {
        this.pos = class072092;
        this.fluid = class046512;
        this.sourceState = class005002;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06336.class, "pos;fluid;sourceState", "pos", "fluid", "sourceState"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06336.class, "pos;fluid;sourceState", "pos", "fluid", "sourceState"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06336.class, "pos;fluid;sourceState", "pos", "fluid", "sourceState"}, this);
    }

    public class04651 y() {
        return this.fluid;
    }

    public class07209 N() {
        return this.pos;
    }
}

