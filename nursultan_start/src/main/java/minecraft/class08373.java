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
 *  minecraft.class03448
 *  minecraft.class03662
 *  minecraft.class06428
 *  minecraft.class06584
 *  minecraft.class07438
 *  minecraft.class08909
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03448;
import minecraft.class03662;
import minecraft.class06428;
import minecraft.class06584;
import minecraft.class07438;
import minecraft.class08909;
import org.jspecify.annotations.Nullable;

public final class class08373
extends Record
implements class08909 {
    private final class06428 keybind;
    private static final Codec<class06428> L = Codec.STRING.comapFlatMap(string -> {
        class06428 class064282 = class06428.y((String)string);
        return class064282 != null ? DataResult.success((Object)class064282) : DataResult.error(() -> "Invalid keybind: " + string);
    }, class06428::U);
    public static final MapCodec<class08373> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)L.fieldOf("keybind").forGetter(class08373::y)).apply(instance, class08373::new));

    public class08373(class06428 class064282) {
        this.keybind = class064282;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08373.class, "keybind", "keybind"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08373.class, "keybind", "keybind"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08373.class, "keybind", "keybind"}, this);
    }

    public class06428 y() {
        return this.keybind;
    }

    public MapCodec<class08373> N() {
        return N;
    }

    public boolean method_65638(class06584 class065842, @Nullable class03448 class034482, @Nullable class07438 class074382, int n, class03662 class036622) {
        return this.keybind.R();
    }
}

