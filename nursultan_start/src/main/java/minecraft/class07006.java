/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01929
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01929;
import minecraft.class07034;

final class class07006<T>
extends Record {
    final class01929 contents;
    final class07034<T> parent;

    class07006(class01929 class019292, class07034<T> class070342) {
        this.contents = class019292;
        this.parent = class070342;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07006.class, "contents;parent", "contents", "parent"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07006.class, "contents;parent", "contents", "parent"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07006.class, "contents;parent", "contents", "parent"}, this);
    }

    public class07034<T> y() {
        return this.parent;
    }

    public class01929 N() {
        return this.contents;
    }
}

