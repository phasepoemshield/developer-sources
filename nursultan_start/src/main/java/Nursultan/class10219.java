/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  minecraft.class02968
 *  minecraft.class03643
 */
package Nursultan;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.util.Optional;
import minecraft.class02968;
import minecraft.class03643;

public class class10219
implements class03643 {
    final /* synthetic */ JsonObject L;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class10219(JsonObject jsonObject) {
        this.L = jsonObject;
    }

    public <T> Optional<T> N(class02968<T> class029682) {
        String string = class029682.N();
        if (this.L.has(string)) {
            return Optional.of(class029682.y().parse((DynamicOps)JsonOps.INSTANCE, (Object)this.L.get(string)).getOrThrow(JsonParseException::new));
        }
        return Optional.empty();
    }
}

