/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06889
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06889;

public final class class03836
extends Record {
    private final class06889 position;
    private final class06889 forward;
    private final class06889 up;
    public static final class03836 N = new class03836(class06889.L, new class06889(0.0, 0.0, -1.0), new class06889(0.0, 1.0, 0.0));

    public class06889 L() {
        return this.forward;
    }

    public class03836(class06889 class068892, class06889 class068893, class06889 class068894) {
        this.position = class068892;
        this.forward = class068893;
        this.up = class068894;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03836.class, "position;forward;up", "position", "forward", "up"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03836.class, "position;forward;up", "position", "forward", "up"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03836.class, "position;forward;up", "position", "forward", "up"}, this);
    }

    public class06889 u() {
        return this.up;
    }

    public class06889 y() {
        return this.position;
    }

    public class06889 N() {
        return this.forward.L(this.up);
    }
}

