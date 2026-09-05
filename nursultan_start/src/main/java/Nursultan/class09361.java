/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00394
 *  minecraft.class04489
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00394;
import minecraft.class04489;

public final class class09361
extends Record
implements class04489 {
    private final class00394 blockEntity;

    public class09361(class00394 class003942) {
        this.blockEntity = class003942;
    }

    public String get() {
        return this.blockEntity.Q() + "@" + String.valueOf(this.blockEntity.d());
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09361.class, "blockEntity", "blockEntity"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09361.class, "blockEntity", "blockEntity"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09361.class, "blockEntity", "blockEntity"}, this);
    }

    public class00394 N() {
        return this.blockEntity;
    }
}

