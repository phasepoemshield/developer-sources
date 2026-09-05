/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07209
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class07209;
import minecraft.class08972;
import minecraft.class08976;

public final class class08958
extends Record
implements class08976 {
    private final class07209 pos;

    @Override
    public class07209 L() {
        return this.pos;
    }

    public class08958(class07209 class072092) {
        this.pos = class072092;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08958.class, "pos", "pos"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08958.class, "pos", "pos"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08958.class, "pos", "pos"}, this);
    }

    @Override
    public boolean y() {
        return true;
    }

    @Override
    public boolean N(class08972 class089722) {
        return false;
    }

    @Override
    public boolean N() {
        return false;
    }
}

