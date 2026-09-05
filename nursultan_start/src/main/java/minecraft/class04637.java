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

public final class class04637
extends Record {
    private final String image;
    final class01894 textureId;

    public class04637(String string, class01894 class018942) {
        this.image = string;
        this.textureId = class018942;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04637.class, "image;textureId", "image", "textureId"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04637.class, "image;textureId", "image", "textureId"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04637.class, "image;textureId", "image", "textureId"}, this);
    }

    public class01894 y() {
        return this.textureId;
    }

    public String N() {
        return this.image;
    }
}

