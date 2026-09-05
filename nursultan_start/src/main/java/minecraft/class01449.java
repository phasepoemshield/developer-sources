/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class04457
 *  minecraft.class07001
 *  minecraft.class07701
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.stream.Stream;
import minecraft.class01894;
import minecraft.class04457;
import minecraft.class07001;
import minecraft.class07701;

public final class class01449
extends Record
implements class04457 {
    private final class01894 id;
    public static final MapCodec<class01449> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01894.N.fieldOf("storage").forGetter(class01449::y)).apply(instance, class01449::new));

    public class01449(class01894 class018942) {
        this.id = class018942;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01449.class, "id", "id"}, this, object);
    }

    public String toString() {
        return "storage=" + String.valueOf(this.id);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01449.class, "id", "id"}, this);
    }

    public class01894 y() {
        return this.id;
    }

    public MapCodec<class01449> N() {
        return N;
    }

    public Stream<class07001> N(class07701 class077012) {
        return Stream.of(class077012.W().yZ().N(this.id));
    }
}

