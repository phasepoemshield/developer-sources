/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07924
 *  minecraft.class07931
 *  minecraft.class07940
 *  minecraft.class07941
 */
package Nursultan;

import com.google.gson.JsonElement;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class07924;
import minecraft.class07931;
import minecraft.class07940;
import minecraft.class07941;

public final class class10855<Result>
extends Record
implements class07940<Void, Result> {
    private final class07931<Void, Result> info;
    private final class07924 attributes;

    public class10855(class07931<Void, Result> class079312, class07924 class079242) {
        this.info = class079312;
        this.attributes = class079242;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10855.class, "info;attributes", "info", "attributes"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10855.class, "info;attributes", "info", "attributes"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10855.class, "info;attributes", "info", "attributes"}, this);
    }

    public class07924 y() {
        return this.attributes;
    }

    public class07931<Void, Result> N() {
        return this.info;
    }

    public Result N(JsonElement jsonElement) {
        if (this.info.u().isEmpty()) {
            throw new IllegalStateException("Method defined as having no result");
        }
        return (Result)((class07941)this.info.u().get()).L().z().parse((DynamicOps)JsonOps.INSTANCE, (Object)jsonElement).getOrThrow();
    }
}

