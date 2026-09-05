/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00392;

public final class class08944
extends Record {
    private final class00392 label;
    private final float sortKey;
    public static final class08944 N = new class08944((class00392)class00392.L((String)"debug.options.category.text"), 1.0f);
    public static final class08944 y = new class08944((class00392)class00392.L((String)"debug.options.category.renderer"), 2.0f);

    public class08944(class00392 class003922, float f) {
        this.label = class003922;
        this.sortKey = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08944.class, "label;sortKey", "label", "sortKey"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08944.class, "label;sortKey", "label", "sortKey"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08944.class, "label;sortKey", "label", "sortKey"}, this);
    }

    public float y() {
        return this.sortKey;
    }

    public class00392 N() {
        return this.label;
    }
}

