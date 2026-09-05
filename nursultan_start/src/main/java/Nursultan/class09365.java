/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class00417
 *  minecraft.class00458
 *  minecraft.class00638
 *  minecraft.class07878
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;
import minecraft.class00417;
import minecraft.class00458;
import minecraft.class00638;
import minecraft.class07878;

public final class class09365<T extends class00638>
extends Record {
    private final T listener;
    private final class00381<T> packet;

    public class00381<T> L() {
        return this.packet;
    }

    public class09365(T t, class00381<T> class003812) {
        this.listener = t;
        this.packet = class003812;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09365.class, "listener;packet", "listener", "packet"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09365.class, "listener;packet", "listener", "packet"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09365.class, "listener;packet", "listener", "packet"}, this);
    }

    public T y() {
        return this.listener;
    }

    public void N() {
        if (this.listener.method_52413(this.packet)) {
            try {
                this.packet.method_65081(this.listener);
            }
            catch (Exception exception) {
                if (exception instanceof class07878 && ((class07878)exception).getCause() instanceof OutOfMemoryError) {
                    throw class00417.N((Exception)exception, this.packet, this.listener);
                }
                this.listener.method_59807(this.packet, exception);
            }
        } else {
            class00458.N.debug("Ignoring packet due to disconnection: {}", this.packet);
        }
    }
}

