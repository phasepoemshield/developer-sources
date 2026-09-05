/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class00649
 *  minecraft.class03059
 *  minecraft.class04770
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00392;
import minecraft.class00649;
import minecraft.class03059;
import minecraft.class04770;

public final class class10105
extends Record
implements class03059 {
    private final class00392 content;

    public class10105(class00392 class003922) {
        this.content = class003922;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10105.class, "content", "content"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10105.class, "content", "content"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10105.class, "content", "content"}, this);
    }

    public class00392 N() {
        return this.content;
    }

    public void N(class04770 class047702, boolean bl, class00649 class006492) {
        class047702.field_13987.method_45168(this.content, class006492);
    }
}

