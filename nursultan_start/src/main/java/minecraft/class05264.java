/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01584
 *  minecraft.class01894
 *  minecraft.class01905
 *  minecraft.class01921
 *  minecraft.class01929
 *  minecraft.class03519
 *  minecraft.class03529
 *  minecraft.class03556
 *  minecraft.class03764
 *  minecraft.class04227
 *  minecraft.class04382
 *  minecraft.class05946
 *  minecraft.class05964
 *  minecraft.class07850
 *  minecraft.class08088
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.gson.JsonObject;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.Optional;
import minecraft.class01584;
import minecraft.class01894;
import minecraft.class01905;
import minecraft.class01921;
import minecraft.class01929;
import minecraft.class03519;
import minecraft.class03529;
import minecraft.class03556;
import minecraft.class03764;
import minecraft.class04227;
import minecraft.class04382;
import minecraft.class05270;
import minecraft.class05946;
import minecraft.class05964;
import minecraft.class07850;
import minecraft.class08088;
import org.slf4j.Logger;

final class class05264
extends Record {
    private final JsonObject generatorSettings;
    private final String levelType;
    private static final Map<String, class05946<class04382>> L = Map.of("default", class05964.N, "largebiomes", class05964.L);

    class05264(JsonObject jsonObject, String string) {
        this.generatorSettings = jsonObject;
        this.levelType = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class05264.class, "generatorSettings;levelType", "generatorSettings", "levelType"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class05264.class, "generatorSettings;levelType", "generatorSettings", "levelType"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class05264.class, "generatorSettings;levelType", "generatorSettings", "levelType"}, this);
    }

    public String y() {
        return this.levelType;
    }

    public class03764 N(class01929 class019292) {
        class01921 class019212 = class019292.y(class04227.yO);
        class03529 class035292 = (class03529)class019212.N(class05964.N).or(() -> class05264.N((class01905)class019212)).orElseThrow(() -> new IllegalStateException("Invalid datapack contents: can't find default preset"));
        class03556 class035562 = (class03556)Optional.ofNullable(class01894.L((String)this.levelType)).map(class018942 -> class05946.N((class05946)class04227.yO, (class01894)class018942)).or(() -> Optional.ofNullable(L.get(this.levelType))).flatMap(arg_0 -> ((class01905)class019212).N(arg_0)).orElseGet(() -> {
            class05270.N.warn("Failed to parse level-type {}, defaulting to {}", (Object)this.levelType, (Object)class035292.B().N());
            return class035292;
        });
        class03764 class037642 = ((class04382)class035562.N()).N();
        if (class035562.N(class05964.y)) {
            class03519 class035192 = class019292.N((DynamicOps)JsonOps.INSTANCE);
            Optional var7 = class01584.N.parse(new Dynamic((DynamicOps)class035192, (Object)this.N())).resultOrPartial(arg_0 -> ((Logger)class05270.N).error(arg_0));
            if (var7.isPresent()) {
                return class037642.N(class019292, (class08088)new class07850((class01584)var7.get()));
            }
        }
        return class037642;
    }

    private static /* synthetic */ Optional N(class01905 class019052) {
        return class019052.z().findAny();
    }

    public JsonObject N() {
        return this.generatorSettings;
    }
}

