/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import com.mojang.datafixers.util.Either;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class10191<T>
extends Record {
    private final Either<T, Exception> value;
    public final long time;

    public class10191(Either<T, Exception> either, long l) {
        this.value = either;
        this.time = l;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10191.class, "value;time", "value", "time"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10191.class, "value;time", "value", "time"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10191.class, "value;time", "value", "time"}, this);
    }

    public long y() {
        return this.time;
    }

    public Either<T, Exception> N() {
        return this.value;
    }
}

