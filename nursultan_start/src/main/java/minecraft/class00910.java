/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06069
 *  minecraft.class07948
 *  minecraft.class08985
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06069;
import minecraft.class07948;
import minecraft.class08985;

public final class class00910
extends Record
implements class08985 {
    private final class07948 glyph;

    public class00910(class07948 class079482) {
        this.glyph = class079482;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00910.class, "glyph", "glyph"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00910.class, "glyph", "glyph"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00910.class, "glyph", "glyph"}, this);
    }

    public class07948 N() {
        return this.glyph;
    }

    public class07948 N(int n) {
        return this.glyph;
    }

    public class07948 N(class06069 class060692, int n) {
        return this.glyph;
    }
}

