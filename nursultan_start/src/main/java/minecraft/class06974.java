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
import minecraft.class06955;

public final class class06974
extends Record
implements class06955 {
    private final class01894 texturePath;
    private final String url;

    public String L() {
        return this.url;
    }

    public class06974(class01894 class018942, String string) {
        this.texturePath = class018942;
        this.url = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06974.class, "texturePath;url", "texturePath", "url"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06974.class, "texturePath;url", "texturePath", "url"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06974.class, "texturePath;url", "texturePath", "url"}, this);
    }

    @Override
    public class01894 y() {
        return this.texturePath;
    }

    @Override
    public class01894 N() {
        return this.texturePath;
    }
}

