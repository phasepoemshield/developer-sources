/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10021
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09871;
import Nursultan.class10021;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class09854
extends Record {
    private final class10021 element;
    private final class09871 scrollbarPart;
    private final float accumulatedOffsetY;
    public static final class09854 N = new class09854(null, class09871.NONE, 0.0f);

    public class10021 L() {
        return this.element;
    }

    public class09854(class10021 class100212, class09871 class098712, float f) {
        this.element = class100212;
        this.scrollbarPart = class098712;
        this.accumulatedOffsetY = f;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09854.class, "element;scrollbarPart;accumulatedOffsetY", "element", "scrollbarPart", "accumulatedOffsetY"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09854.class, "element;scrollbarPart;accumulatedOffsetY", "element", "scrollbarPart", "accumulatedOffsetY"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09854.class, "element;scrollbarPart;accumulatedOffsetY", "element", "scrollbarPart", "accumulatedOffsetY"}, this);
    }

    public float i() {
        return this.accumulatedOffsetY;
    }

    public class09871 u() {
        return this.scrollbarPart;
    }

    public boolean y() {
        return this.element == null;
    }

    public boolean N() {
        return this.scrollbarPart != class09871.NONE;
    }
}

