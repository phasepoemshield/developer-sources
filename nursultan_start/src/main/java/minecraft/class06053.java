/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class05163
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class05163;
import minecraft.class06040;

public final class class06053
extends Record {
    private final class05163 box;
    private final class06040 terrainAdjustment;
    private final int groundLevelDelta;

    public int L() {
        return this.groundLevelDelta;
    }

    public class06053(class05163 class051632, class06040 class060402, int n) {
        this.box = class051632;
        this.terrainAdjustment = class060402;
        this.groundLevelDelta = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06053.class, "box;terrainAdjustment;groundLevelDelta", "box", "terrainAdjustment", "groundLevelDelta"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06053.class, "box;terrainAdjustment;groundLevelDelta", "box", "terrainAdjustment", "groundLevelDelta"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06053.class, "box;terrainAdjustment;groundLevelDelta", "box", "terrainAdjustment", "groundLevelDelta"}, this);
    }

    public class06040 y() {
        return this.terrainAdjustment;
    }

    public class05163 N() {
        return this.box;
    }
}

