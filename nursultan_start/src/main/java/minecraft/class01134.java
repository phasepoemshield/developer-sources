/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;

public final class class01134
extends Record {
    private final class01894 model;
    private final String layer;

    public class01134(class01894 class018942, String string) {
        this.model = class018942;
        this.layer = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01134.class, "model;layer", "model", "layer"}, this, object);
    }

    public String toString() {
        return String.valueOf(this.model) + "#" + this.layer;
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01134.class, "model;layer", "model", "layer"}, this);
    }

    public String y() {
        return this.layer;
    }

    public class01894 N() {
        return this.model;
    }
}

