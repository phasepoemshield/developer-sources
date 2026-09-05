/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class00649
 *  minecraft.class03059
 *  minecraft.class03926
 *  minecraft.class04770
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00392;
import minecraft.class00649;
import minecraft.class03059;
import minecraft.class03926;
import minecraft.class04770;

public final class class10103
extends Record
implements class03059 {
    private final class03926 message;

    public class10103(class03926 class039262) {
        this.message = class039262;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10103.class, "message", "message"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10103.class, "message", "message"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10103.class, "message", "message"}, this);
    }

    public class03926 y() {
        return this.message;
    }

    public void N(class04770 class047702, boolean bl, class00649 class006492) {
        class03926 class039262 = this.message.N(bl);
        if (!class039262.z()) {
            class047702.field_13987.method_45170(class039262, class006492);
        }
    }

    public class00392 N() {
        return this.message.u();
    }
}

