/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00647
 *  minecraft.class00669
 *  minecraft.class01894
 *  minecraft.class07001
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.Optional;
import minecraft.class00647;
import minecraft.class00669;
import minecraft.class01894;
import minecraft.class07001;
import minecraft.class08737;
import minecraft.class08752;

public final class class08775
extends Record
implements class08752 {
    private final class01894 id;
    private final Optional<class07001> additions;
    public static final MapCodec<class08775> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01894.N.fieldOf("id").forGetter(class08775::y), (App)class07001.N.optionalFieldOf("additions").forGetter(class08775::L)).apply(instance, class08775::new));

    public Optional<class07001> L() {
        return this.additions;
    }

    public class08775(class01894 class018942, Optional<class07001> optional) {
        this.id = class018942;
        this.additions = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08775.class, "id;additions", "id", "additions"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08775.class, "id;additions", "id", "additions"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08775.class, "id;additions", "id", "additions"}, this);
    }

    public class01894 y() {
        return this.id;
    }

    public MapCodec<class08775> N() {
        return N;
    }

    @Override
    public Optional<class00647> N(Map<String, class08737> map) {
        class07001 class070012 = this.additions.map(class07001::N).orElseGet(class07001::new);
        map.forEach((string, class087372) -> class070012.N(string, class087372.y()));
        return Optional.of(new class00669(this.id, Optional.of(class070012)));
    }
}

