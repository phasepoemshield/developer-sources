/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Lifecycle
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02298
 */
package minecraft;

import com.mojang.serialization.Lifecycle;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class02298;

public final class class02819
extends Record {
    private final Optional<class02298> knownPackInfo;
    private final Lifecycle lifecycle;
    public static final class02819 N = new class02819(Optional.empty(), Lifecycle.stable());

    public class02819(Optional<class02298> optional, Lifecycle lifecycle) {
        this.knownPackInfo = optional;
        this.lifecycle = lifecycle;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02819.class, "knownPackInfo;lifecycle", "knownPackInfo", "lifecycle"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02819.class, "knownPackInfo;lifecycle", "knownPackInfo", "lifecycle"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02819.class, "knownPackInfo;lifecycle", "knownPackInfo", "lifecycle"}, this);
    }

    public Lifecycle y() {
        return this.lifecycle;
    }

    public Optional<class02298> N() {
        return this.knownPackInfo;
    }
}

