/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class08193
 *  minecraft.class09006
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class08193;
import minecraft.class09006;

public final class class08849
extends Record {
    private final class09006 view;
    private final class08193 sampler;

    public class08849(class09006 class090062, class08193 class081932) {
        this.view = class090062;
        this.sampler = class081932;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08849.class, "view;sampler", "view", "sampler"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08849.class, "view;sampler", "view", "sampler"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08849.class, "view;sampler", "view", "sampler"}, this);
    }

    public class08193 y() {
        return this.sampler;
    }

    public class09006 N() {
        return this.view;
    }
}

