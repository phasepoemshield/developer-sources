/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01929
 *  minecraft.class02003
 *  minecraft.class02969
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01929;
import minecraft.class02003;
import minecraft.class02969;

public final class class02347
extends Record {
    private final class02003<class02969> layers;
    private final class01929 lookupWithUpdatedTags;

    public class02347(class02003<class02969> class020032, class01929 class019292) {
        this.layers = class020032;
        this.lookupWithUpdatedTags = class019292;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02347.class, "layers;lookupWithUpdatedTags", "layers", "lookupWithUpdatedTags"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02347.class, "layers;lookupWithUpdatedTags", "layers", "lookupWithUpdatedTags"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02347.class, "layers;lookupWithUpdatedTags", "layers", "lookupWithUpdatedTags"}, this);
    }

    public class01929 y() {
        return this.lookupWithUpdatedTags;
    }

    public class02003<class02969> N() {
        return this.layers;
    }
}

