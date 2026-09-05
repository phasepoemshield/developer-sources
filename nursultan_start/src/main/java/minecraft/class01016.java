/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04206
 *  minecraft.class06338
 *  minecraft.class07078
 *  minecraft.class07428
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04206;
import minecraft.class06338;
import minecraft.class07078;
import minecraft.class07428;

public final class class01016
extends Record {
    private final class07078<?> type;
    private final int minCount;
    private final int maxCount;
    public static final MapCodec<class01016> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class04206.M.T().fieldOf("type").forGetter(class010162 -> class010162.type), (App)class06338.b.fieldOf("minCount").forGetter(class010162 -> class010162.minCount), (App)class06338.b.fieldOf("maxCount").forGetter(class010162 -> class010162.maxCount)).apply(instance, class01016::new)).validate(class010162 -> {
        if (class010162.minCount > class010162.maxCount) {
            return DataResult.error(() -> "minCount needs to be smaller or equal to maxCount");
        }
        return DataResult.success((Object)class010162);
    });

    public int L() {
        return this.maxCount;
    }

    public class01016(class07078<?> class070782, int n, int n2) {
        class070782 = class070782.i() == class07428.field_17715 ? class07078.Nh : class070782;
        this.type = class070782;
        this.minCount = n;
        this.maxCount = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01016.class, "type;minCount;maxCount", "type", "minCount", "maxCount"}, this, object);
    }

    public String toString() {
        return String.valueOf(class07078.N(this.type)) + "*(" + this.minCount + "-" + this.maxCount + ")";
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01016.class, "type;minCount;maxCount", "type", "minCount", "maxCount"}, this);
    }

    public int y() {
        return this.minCount;
    }

    public class07078<?> N() {
        return this.type;
    }
}

