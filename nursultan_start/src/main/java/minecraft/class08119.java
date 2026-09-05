/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01089
 *  minecraft.class01994
 *  minecraft.class02008
 *  minecraft.class08626
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import minecraft.class01089;
import minecraft.class01994;
import minecraft.class02008;
import minecraft.class08126;
import minecraft.class08626;

final class class08119
extends Record
implements AutoCloseable {
    final class08626 atlas;
    final class08126 config;

    class08119(class08626 class086262, class08126 class081262) {
        this.atlas = class086262;
        this.config = class081262;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08119.class, "atlas;config", "atlas", "config"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08119.class, "atlas;config", "atlas", "config"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08119.class, "atlas;config", "atlas", "config"}, this);
    }

    @Override
    public void close() {
        this.atlas.u();
    }

    public class08126 y() {
        return this.config;
    }

    CompletableFuture<class02008> N(class01089 class010892, Executor executor, int n) {
        return class01994.N((class08626)this.atlas).N(class010892, this.config.y(), this.config.L() ? n : 0, executor, this.config.u());
    }

    public class08626 N() {
        return this.atlas;
    }
}

