/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00963
 *  minecraft.class00972
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class06244
 *  minecraft.class06959
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00963;
import minecraft.class00972;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class06244;
import minecraft.class06959;

final class class00998
extends Record
implements class00972 {
    private final List<class00963> states;

    public void submit(class01237 class012372, class06959 class069592) {
        for (class00963 class009632 : this.states) {
            class012372.N(class009632.N(), (Object)class06244.field_17274, class009632.y(), class009632.L(), 0xF000F0, class01384.u, class009632.u(), null, 0, null);
        }
    }

    class00998(List<class00963> list) {
        this.states = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00998.class, "states", "states"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00998.class, "states", "states"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00998.class, "states", "states"}, this);
    }

    public List<class00963> N() {
        return this.states;
    }
}

