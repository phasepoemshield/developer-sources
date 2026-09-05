/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class03730
 *  minecraft.class04250
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class03730;
import minecraft.class04250;

public final class class07832
extends Record
implements class00381<class03730> {
    private final long time;
    public static final class02362<class00667, class07832> N = class00381.N(class07832::N, class07832::new);

    private class07832(class00667 class006672) {
        this(class006672.readLong());
    }

    public class07832(long l) {
        this.time = l;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07832.class, "time", "time"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07832.class, "time", "time"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07832.class, "time", "time"}, this);
    }

    public long N() {
        return this.time;
    }

    public void method_65081(class03730 class037302) {
        class037302.N(this);
    }

    private void N(class00667 class006672) {
        class006672.writeLong(this.time);
    }

    public class02897<class07832> method_65080() {
        return class04250.N;
    }
}

