/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;

public abstract class LongSerializationPolicy
extends Enum<LongSerializationPolicy> {
    public static final /* enum */ LongSerializationPolicy DEFAULT = new LongSerializationPolicy(){

        @Override
        public JsonElement serialize(Long value) {
            if (value == null) {
                return JsonNull.INSTANCE;
            }
            return new JsonPrimitive(value);
        }
    };
    public static final /* enum */ LongSerializationPolicy STRING = new LongSerializationPolicy(){

        @Override
        public JsonElement serialize(Long value) {
            if (value == null) {
                return JsonNull.INSTANCE;
            }
            return new JsonPrimitive(value.toString());
        }
    };
    private static final /* synthetic */ LongSerializationPolicy[] $VALUES;

    static {
        LongSerializationPolicy[] longSerializationPolicyArray = new LongSerializationPolicy[2];
        longSerializationPolicyArray[0] = DEFAULT;
        longSerializationPolicyArray[1] = STRING;
        $VALUES = longSerializationPolicyArray;
    }

    public abstract JsonElement serialize(Long var1);

    public static LongSerializationPolicy valueOf(String name) {
        return Enum.valueOf(LongSerializationPolicy.class, name);
    }

    public static LongSerializationPolicy[] values() {
        return (LongSerializationPolicy[])$VALUES.clone();
    }
}

