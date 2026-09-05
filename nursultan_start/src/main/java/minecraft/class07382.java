/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07808
 *  minecraft.class07947
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class07808;
import minecraft.class07947;

public final class class07382
extends Record {
    private final boolean started;
    private final List<class07947> players;
    private final class07808 version;
    public static final Codec<class07382> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.BOOL.fieldOf("started").forGetter(class07382::N), (App)class07947.N.codec().listOf().lenientOptionalFieldOf("players", List.of()).forGetter(class07382::y), (App)class07808.N.fieldOf("version").forGetter(class07382::L)).apply(instance, class07382::new));
    public static final class07382 y = new class07382(false, List.of(), class07808.N());

    public class07808 L() {
        return this.version;
    }

    public class07382(boolean bl, List<class07947> list, class07808 class078082) {
        this.started = bl;
        this.players = list;
        this.version = class078082;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07382.class, "started;players;version", "started", "players", "version"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07382.class, "started;players;version", "started", "players", "version"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07382.class, "started;players;version", "started", "players", "version"}, this);
    }

    public List<class07947> y() {
        return this.players;
    }

    public boolean N() {
        return this.started;
    }
}

