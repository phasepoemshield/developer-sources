/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00494
 *  minecraft.class07209
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00494;
import minecraft.class07209;

public class class11019
extends Record {
    public class00494 voxelShape;
    public class07209 blockPos;

    public class11019(class07209 class072092, class00494 class004942) {
        this.blockPos = class072092;
        this.voxelShape = class004942;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11019.class, "blockPos;voxelShape", "blockPos", "voxelShape"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11019.class, "blockPos;voxelShape", "blockPos", "voxelShape"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11019.class, "blockPos;voxelShape", "blockPos", "voxelShape"}, this);
    }

    public class07209 y() {
        return this.blockPos;
    }

    public class00494 N() {
        return this.voxelShape;
    }
}

