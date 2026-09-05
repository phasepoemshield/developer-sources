/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.codecs.PrimitiveCodec
 */
package minecraft;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.PrimitiveCodec;
import minecraft.class00622;

class class00595
implements PrimitiveCodec<String> {
    class00595() {
    }

    public String toString() {
        return "NamespacedString";
    }

    public <T> DataResult<String> read(DynamicOps<T> dynamicOps, T t) {
        return dynamicOps.getStringValue(t).map(class00622::N);
    }

    public <T> T write(DynamicOps<T> dynamicOps, String string) {
        return (T)dynamicOps.createString(string);
    }
}

