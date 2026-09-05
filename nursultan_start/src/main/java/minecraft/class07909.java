/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07393
 *  minecraft.class07400
 *  minecraft.class07403
 *  minecraft.class07945
 *  minecraft.class07946
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.gson.JsonElement;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class07393;
import minecraft.class07400;
import minecraft.class07403;
import minecraft.class07931;
import minecraft.class07936;
import minecraft.class07945;
import minecraft.class07946;
import org.jspecify.annotations.Nullable;

public final class class07909<Params, Result>
extends Record
implements class07945<Params, Result> {
    private final class07931<Params, Result> info;
    private final class07946 attributes;
    private final class07936<Result> supplier;

    public class07936<Result> L() {
        return this.supplier;
    }

    public class07909(class07931<Params, Result> class079312, class07946 class079462, class07936<Result> class079362) {
        this.info = class079312;
        this.attributes = class079462;
        this.supplier = class079362;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07909.class, "info;attributes;supplier", "info", "attributes", "supplier"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07909.class, "info;attributes;supplier", "info", "attributes", "supplier"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07909.class, "info;attributes;supplier", "info", "attributes", "supplier"}, this);
    }

    public class07946 y() {
        return this.attributes;
    }

    public class07931<Params, Result> N() {
        return this.info;
    }

    public JsonElement N(class07393 class073932, @Nullable JsonElement jsonElement, class07403 class074032) {
        if (!(jsonElement == null || jsonElement.isJsonArray() && jsonElement.getAsJsonArray().isEmpty())) {
            throw new class07400("Expected no params, or an empty array");
        }
        if (this.info.L().isPresent()) {
            throw new IllegalArgumentException("Parameterless method unexpectedly has parameter description");
        }
        Object object = this.supplier.apply(class073932, class074032);
        if (this.info.u().isEmpty()) {
            throw new IllegalStateException("No result codec defined");
        }
        return (JsonElement)this.info.u().get().L().z().encodeStart((DynamicOps)JsonOps.INSTANCE, object).getOrThrow(class07400::new);
    }
}

