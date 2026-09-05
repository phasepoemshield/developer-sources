/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class04247
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import minecraft.class02362;
import minecraft.class02464;
import minecraft.class02477;
import minecraft.class02509;
import minecraft.class04247;

public final class class02480<T>
extends Record {
    private final class02477<T> type;
    private final T value;
    public static final class02362<class04247, class02480<?>> N = new class02464();

    public class02480(class02477<T> class024772, T t) {
        this.type = class024772;
        this.value = t;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02480.class, "type;value", "type", "value"}, this, object);
    }

    public String toString() {
        return String.valueOf(this.type) + "=>" + String.valueOf(this.value);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02480.class, "type;value", "type", "value"}, this);
    }

    public T y() {
        return this.value;
    }

    public static <T> class02480<T> N(class02477<T> class024772, Object object) {
        return new class02480<Object>(class024772, object);
    }

    public static class02480<?> N(Map.Entry<class02477<?>, Object> entry) {
        return class02480.N(entry.getKey(), entry.getValue());
    }

    public void N(class02509 class025092) {
        class025092.y(this.type, this.value);
    }

    public class02477<T> N() {
        return this.type;
    }

    public <D> DataResult<D> N(DynamicOps<D> dynamicOps) {
        Codec<T> codec = this.type.y();
        if (codec == null) {
            return DataResult.error(() -> "Component of type " + String.valueOf(this.type) + " is not encodable");
        }
        return codec.encodeStart(dynamicOps, this.value);
    }
}

