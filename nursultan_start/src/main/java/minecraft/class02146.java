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

public final class class02146
extends Record {
    private final class07209 targetPos;
    private final int weight;

    public class02146(class07209 class072092, int n) {
        this.targetPos = class072092;
        this.weight = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02146.class, "targetPos;weight", "targetPos", "weight"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02146.class, "targetPos;weight", "targetPos", "weight"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02146.class, "targetPos;weight", "targetPos", "weight"}, this);
    }

    public int y() {
        return this.weight;
    }

    public class07209 N() {
        return this.targetPos;
    }
}

