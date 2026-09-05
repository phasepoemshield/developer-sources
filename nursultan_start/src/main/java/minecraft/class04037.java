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
import minecraft.class04043;

public final class class04037
extends Record {
    private final long seedLo;
    private final long seedHi;

    public long L() {
        return this.seedHi;
    }

    public class04037(long l, long l2) {
        this.seedLo = l;
        this.seedHi = l2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04037.class, "seedLo;seedHi", "seedLo", "seedHi"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04037.class, "seedLo;seedHi", "seedLo", "seedHi"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04037.class, "seedLo;seedHi", "seedLo", "seedHi"}, this);
    }

    public long y() {
        return this.seedLo;
    }

    public class04037 N(class04037 class040372) {
        return this.N(class040372.seedLo, class040372.seedHi);
    }

    public class04037 N(long l, long l2) {
        return new class04037(this.seedLo ^ l, this.seedHi ^ l2);
    }

    public class04037 N() {
        return new class04037(class04043.N(this.seedLo), class04043.N(this.seedHi));
    }
}

