/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04548
 *  minecraft.class04782
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00772;
import minecraft.class04548;
import minecraft.class04782;
import minecraft.class07209;

public final class class00778
extends Record {
    private final class04548<Integer> blockLightLimit;
    private final class04548<Integer> skyLightLimit;
    private static final class04548<Integer> u = new class04548((Comparable)Integer.valueOf(0), (Comparable)Integer.valueOf(15));
    public static final Codec<class00778> N = RecordCodecBuilder.create(instance -> instance.group((App)class00778.N("block_light_limit").forGetter(class007782 -> class007782.blockLightLimit), (App)class00778.N("sky_light_limit").forGetter(class007782 -> class007782.skyLightLimit)).apply(instance, class00778::new));

    public class00778(class04548<Integer> class045482, class04548<Integer> class045483) {
        this.blockLightLimit = class045482;
        this.skyLightLimit = class045483;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00778.class, "blockLightLimit;skyLightLimit", "blockLightLimit", "skyLightLimit"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00778.class, "blockLightLimit;skyLightLimit", "blockLightLimit", "skyLightLimit"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00778.class, "blockLightLimit;skyLightLimit", "blockLightLimit", "skyLightLimit"}, this);
    }

    public class04548<Integer> y() {
        return this.skyLightLimit;
    }

    private static DataResult<class04548<Integer>> N(class04548<Integer> class045482) {
        if (!u.N(class045482)) {
            return DataResult.error(() -> "Light values must be withing range " + String.valueOf(u));
        }
        return DataResult.success(class045482);
    }

    public class04548<Integer> N() {
        return this.blockLightLimit;
    }

    public boolean N(class07209 class072092, class04782 class047822) {
        return this.blockLightLimit.N((Comparable)Integer.valueOf(class047822.method_8314(class00772.field_9282, class072092))) && this.skyLightLimit.N((Comparable)Integer.valueOf(class047822.method_8314(class00772.field_9284, class072092)));
    }

    private static MapCodec<class04548<Integer>> N(String string) {
        return class04548.N.lenientOptionalFieldOf(string, u).validate(class00778::N);
    }
}

