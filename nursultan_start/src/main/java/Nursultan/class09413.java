/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00949
 *  minecraft.class01894
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00949;
import minecraft.class01894;

public final class class09413
extends Record
implements class00949 {
    private final class01894 atlasId;
    private final class01894 spriteId;

    public class09413(class01894 class018942, class01894 class018943) {
        this.atlasId = class018942;
        this.spriteId = class018943;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09413.class, "atlasId;spriteId", "atlasId", "spriteId"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09413.class, "atlasId;spriteId", "atlasId", "spriteId"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09413.class, "atlasId;spriteId", "atlasId", "spriteId"}, this);
    }

    public class01894 y() {
        return this.spriteId;
    }

    public class01894 N() {
        return this.atlasId;
    }
}

