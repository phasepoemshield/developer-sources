/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00423
 *  minecraft.class01894
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00423;
import minecraft.class01894;

public final class class02897<T extends class00381<?>>
extends Record {
    private final class00423 flow;
    private final class01894 id;

    public class02897(class00423 class004232, class01894 class018942) {
        this.flow = class004232;
        this.id = class018942;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02897.class, "flow;id", "flow", "id"}, this, object);
    }

    public String toString() {
        return this.flow.y() + "/" + String.valueOf(this.id);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02897.class, "flow;id", "flow", "id"}, this);
    }

    public class01894 y() {
        return this.id;
    }

    public class00423 N() {
        return this.flow;
    }
}

