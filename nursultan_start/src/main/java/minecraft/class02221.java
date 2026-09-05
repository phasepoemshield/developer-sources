/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class02221
extends Record {
    private final float yOffset;
    private final float skullYOffset;
    private final float horizontalScale;
    public static final class02221 N = new class02221(0.0f, 0.0f, 1.0f);

    public float L() {
        return this.horizontalScale;
    }

    public class02221(float f, float f2, float f3) {
        this.yOffset = f;
        this.skullYOffset = f2;
        this.horizontalScale = f3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02221.class, "yOffset;skullYOffset;horizontalScale", "yOffset", "skullYOffset", "horizontalScale"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02221.class, "yOffset;skullYOffset;horizontalScale", "yOffset", "skullYOffset", "horizontalScale"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02221.class, "yOffset;skullYOffset;horizontalScale", "yOffset", "skullYOffset", "horizontalScale"}, this);
    }

    public float y() {
        return this.skullYOffset;
    }

    public float N() {
        return this.yOffset;
    }
}

