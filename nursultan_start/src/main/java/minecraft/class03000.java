/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00500;
import minecraft.class03003;

final class class03000
extends Record
implements class03003 {
    private final class00500 state;

    class03000(class00500 class005002) {
        this.state = class005002;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03000.class, "state", "state"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03000.class, "state", "state"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03000.class, "state", "state"}, this);
    }

    public class00500 N() {
        return this.state;
    }

    @Override
    public class00500 tryApply(int n, int n2, int n3) {
        return this.state;
    }
}

