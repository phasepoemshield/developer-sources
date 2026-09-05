/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01404
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01404;
import minecraft.class03665;

final class class03685
extends Record
implements class03665<class01404> {
    private final class01404 previous;
    private final class01404 current;

    class03685(class01404 class014042, class01404 class014043) {
        this.previous = class014042;
        this.current = class014043;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03685.class, "previous;current", "previous", "current"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03685.class, "previous;current", "previous", "current"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03685.class, "previous;current", "previous", "current"}, this);
    }

    public class01404 y() {
        return this.current;
    }

    public class01404 N() {
        return this.previous;
    }

    @Override
    public class01404 method_48888(float f) {
        if ((double)f >= 1.0) {
            return this.current;
        }
        return this.previous.N(this.current, f);
    }
}

