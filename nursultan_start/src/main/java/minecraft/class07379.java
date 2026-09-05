/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07947
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import minecraft.class07415;
import minecraft.class07947;

public final class class07379
extends Record {
    private final class07415 message;
    private final boolean overlay;
    private final Optional<List<class07947>> receivingPlayers;
    public static final Codec<class07379> N = RecordCodecBuilder.create(instance -> instance.group((App)class07415.N.fieldOf("message").forGetter(class07379::N), (App)Codec.BOOL.fieldOf("overlay").forGetter(class07379::y), (App)class07947.N.codec().listOf().lenientOptionalFieldOf("receivingPlayers").forGetter(class07379::L)).apply(instance, class07379::new));

    public Optional<List<class07947>> L() {
        return this.receivingPlayers;
    }

    public class07379(class07415 class074152, boolean bl, Optional<List<class07947>> optional) {
        this.message = class074152;
        this.overlay = bl;
        this.receivingPlayers = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07379.class, "message;overlay;receivingPlayers", "message", "overlay", "receivingPlayers"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07379.class, "message;overlay;receivingPlayers", "message", "overlay", "receivingPlayers"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07379.class, "message;overlay;receivingPlayers", "message", "overlay", "receivingPlayers"}, this);
    }

    public boolean y() {
        return this.overlay;
    }

    public class07415 N() {
        return this.message;
    }
}

