/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01087
 *  minecraft.class07947
 *  minecraft.class08195
 *  minecraft.class08774
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Objects;
import java.util.Optional;
import minecraft.class01087;
import minecraft.class07947;
import minecraft.class08195;
import minecraft.class08774;

public final class class07397
extends Record {
    private final class07947 player;
    private final Optional<class08195> permissionLevel;
    private final Optional<Boolean> bypassesPlayerLimit;
    public static final MapCodec<class07397> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class07947.N.codec().fieldOf("player").forGetter(class07397::N), (App)class08195.field_63202.optionalFieldOf("permissionLevel").forGetter(class07397::y), (App)Codec.BOOL.optionalFieldOf("bypassesPlayerLimit").forGetter(class07397::L)).apply(instance, class07397::new));

    public Optional<Boolean> L() {
        return this.bypassesPlayerLimit;
    }

    public class07397(class07947 class079472, Optional<class08195> optional, Optional<Boolean> optional2) {
        this.player = class079472;
        this.permissionLevel = optional;
        this.bypassesPlayerLimit = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07397.class, "player;permissionLevel;bypassesPlayerLimit", "player", "permissionLevel", "bypassesPlayerLimit"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07397.class, "player;permissionLevel;bypassesPlayerLimit", "player", "permissionLevel", "bypassesPlayerLimit"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07397.class, "player;permissionLevel;bypassesPlayerLimit", "player", "permissionLevel", "bypassesPlayerLimit"}, this);
    }

    public Optional<class08195> y() {
        return this.permissionLevel;
    }

    public static class07397 N(class01087 class010872) {
        return new class07397(class07947.N((class08774)Objects.requireNonNull((class08774)class010872.B())), Optional.of(class010872.N().N()), Optional.of(class010872.y()));
    }

    public class07947 N() {
        return this.player;
    }
}

