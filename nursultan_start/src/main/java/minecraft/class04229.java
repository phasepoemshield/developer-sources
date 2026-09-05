/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class03695
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00392;
import minecraft.class03695;

final class class04229
extends Record {
    private final class03695 container;
    private final class00392 narration;

    class04229(class03695 class036952, class00392 class003922) {
        this.container = class036952;
        this.narration = class003922;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04229.class, "container;narration", "container", "narration"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04229.class, "container;narration", "container", "narration"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04229.class, "container;narration", "container", "narration"}, this);
    }

    public class00392 y() {
        return this.narration;
    }

    public class03695 N() {
        return this.container;
    }
}

