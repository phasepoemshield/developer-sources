/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04782
 *  minecraft.class07209
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04782;
import minecraft.class07209;

final class class06415
extends Record {
    private final class04782 dimension;
    private final class07209 position;

    class06415(class04782 class047822, class07209 class072092) {
        this.dimension = class047822;
        this.position = class072092;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06415.class, "dimension;position", "dimension", "position"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06415.class, "dimension;position", "dimension", "position"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06415.class, "dimension;position", "dimension", "position"}, this);
    }

    public class07209 y() {
        return this.position;
    }

    public class04782 N() {
        return this.dimension;
    }
}

