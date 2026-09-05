/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00143
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02389
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00143;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02389;

public final class class00450
extends Record {
    private final class00143 path;
    private final float maxNodeDistance;
    public static final class02362<class00667, class00450> N = class02362.N((class02362)class00143.N, class00450::N, (class02362)class02389.E, class00450::y, class00450::new);

    public class00450(class00143 class001432, float f) {
        this.path = class001432;
        this.maxNodeDistance = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00450.class, "path;maxNodeDistance", "path", "maxNodeDistance"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00450.class, "path;maxNodeDistance", "path", "maxNodeDistance"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00450.class, "path;maxNodeDistance", "path", "maxNodeDistance"}, this);
    }

    public float y() {
        return this.maxNodeDistance;
    }

    public class00143 N() {
        return this.path;
    }
}

