/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07393
 *  minecraft.class07400
 *  minecraft.class07403
 *  minecraft.class07412
 *  minecraft.class07945
 *  minecraft.class07946
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Locale;
import minecraft.class07393;
import minecraft.class07400;
import minecraft.class07403;
import minecraft.class07412;
import minecraft.class07929;
import minecraft.class07931;
import minecraft.class07945;
import minecraft.class07946;
import org.jspecify.annotations.Nullable;

public final class class07943<Params, Result>
extends Record
implements class07945<Params, Result> {
    private final class07931<Params, Result> info;
    private final class07946 attributes;
    private final class07929<Params, Result> function;

    public class07929<Params, Result> L() {
        return this.function;
    }

    public class07943(class07931<Params, Result> class079312, class07946 class079462, class07929<Params, Result> class079292) {
        this.info = class079312;
        this.attributes = class079462;
        this.function = class079292;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07943.class, "info;attributes;function", "info", "attributes", "function"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07943.class, "info;attributes;function", "info", "attributes", "function"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07943.class, "info;attributes;function", "info", "attributes", "function"}, this);
    }

    public class07946 y() {
        return this.attributes;
    }

    public class07931<Params, Result> N() {
        return this.info;
    }

    public JsonElement N(class07393 class073932, @Nullable JsonElement jsonElement, class07403 class074032) {
        JsonElement jsonElement2;
        Object object;
        Object object2;
        if (jsonElement == null || !jsonElement.isJsonArray() && !jsonElement.isJsonObject()) {
            throw new class07400("Expected params as array or named");
        }
        if (this.info.L().isEmpty()) {
            throw new IllegalArgumentException("Method defined as having parameters without describing them");
        }
        if (jsonElement.isJsonObject()) {
            object2 = this.info.L().get().y();
            object = jsonElement.getAsJsonObject().get((String)object2);
            if (object == null) {
                throw new class07400(String.format(Locale.ROOT, "Params passed by-name, but expected param [%s] does not exist", object2));
            }
            jsonElement2 = object;
        } else {
            object2 = jsonElement.getAsJsonArray();
            if (object2.isEmpty() || object2.size() > 1) {
                throw new class07400("Expected exactly one element in the params array");
            }
            jsonElement2 = object2.get(0);
        }
        object2 = this.info.L().get().L().z().parse((DynamicOps)JsonOps.INSTANCE, (Object)jsonElement2).getOrThrow(class07400::new);
        object = this.function.apply(class073932, (JsonArray)object2, class074032);
        if (this.info.u().isEmpty()) {
            throw new IllegalStateException("No result codec defined");
        }
        return (JsonElement)this.info.u().get().L().z().encodeStart((DynamicOps)JsonOps.INSTANCE, object).getOrThrow(class07412::new);
    }
}

