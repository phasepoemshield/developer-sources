/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07920
 *  minecraft.class07924
 *  minecraft.class07931
 *  minecraft.class07940
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import com.google.gson.JsonElement;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class07920;
import minecraft.class07924;
import minecraft.class07931;
import minecraft.class07940;
import org.jspecify.annotations.Nullable;

public final class class10856<Params>
extends Record
implements class07940<Params, Void> {
    private final class07931<Params, Void> info;
    private final class07924 attributes;

    public class10856(class07931<Params, Void> class079312, class07924 class079242) {
        this.info = class079312;
        this.attributes = class079242;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10856.class, "info;attributes", "info", "attributes"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10856.class, "info;attributes", "info", "attributes"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10856.class, "info;attributes", "info", "attributes"}, this);
    }

    public class07924 y() {
        return this.attributes;
    }

    public class07931<Params, Void> N() {
        return this.info;
    }

    public @Nullable JsonElement N(Params Params) {
        if (this.info.L().isEmpty()) {
            throw new IllegalStateException("Method defined as having no parameters");
        }
        return (JsonElement)((class07920)this.info.L().get()).L().z().encodeStart((DynamicOps)JsonOps.INSTANCE, Params).getOrThrow();
    }
}

