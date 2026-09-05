/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00994
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01781
 *  minecraft.class06202
 *  minecraft.class06959
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class00972;
import minecraft.class00994;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01781;
import minecraft.class06202;
import minecraft.class06959;

public final class class00983
extends Record
implements class00972 {
    private final List<class00994> instances;

    @Override
    public void submit(class01237 class012372, class06959 class069592) {
        class01421 class014212 = new class01421();
        class01781 class017812 = class06202.Nq().Ng();
        for (class00994 class009942 : this.instances) {
            class017812.N(class009942.N(), class069592, class009942.y(), class009942.L(), class009942.u(), class014212, class012372);
        }
    }

    public class00983(List<class00994> list) {
        this.instances = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00983.class, "instances", "instances"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00983.class, "instances", "instances"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00983.class, "instances", "instances"}, this);
    }

    public List<class00994> N() {
        return this.instances;
    }
}

