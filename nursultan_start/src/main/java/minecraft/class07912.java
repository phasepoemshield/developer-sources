/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.gson.JsonElement;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class07924;
import minecraft.class07931;
import minecraft.class07940;
import org.jspecify.annotations.Nullable;

public final class class07912<Params, Result>
extends Record
implements class07940<Params, Result> {
    private final class07931<Params, Result> info;
    private final class07924 attributes;

    public class07912(class07931<Params, Result> class079312, class07924 class079242) {
        this.info = class079312;
        this.attributes = class079242;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07912.class, "info;attributes", "info", "attributes"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07912.class, "info;attributes", "info", "attributes"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07912.class, "info;attributes", "info", "attributes"}, this);
    }

    @Override
    public class07924 y() {
        return this.attributes;
    }

    @Override
    public Result N(JsonElement jsonElement) {
        if (this.info.u().isEmpty()) {
            throw new IllegalStateException("Method defined as having no result");
        }
        return (Result)this.info.u().get().L().z().parse((DynamicOps)JsonOps.INSTANCE, (Object)jsonElement).getOrThrow();
    }

    @Override
    public class07931<Params, Result> N() {
        return this.info;
    }

    @Override
    public @Nullable JsonElement N(Params Params) {
        if (this.info.L().isEmpty()) {
            throw new IllegalStateException("Method defined as having no parameters");
        }
        return (JsonElement)this.info.L().get().L().z().encodeStart((DynamicOps)JsonOps.INSTANCE, Params).getOrThrow();
    }
}

