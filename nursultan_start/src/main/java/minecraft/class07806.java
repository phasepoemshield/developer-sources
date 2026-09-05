/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class03748
 *  minecraft.class05220
 *  minecraft.class07824
 *  minecraft.class07837
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class03748;
import minecraft.class05220;
import minecraft.class07808;
import minecraft.class07824;
import minecraft.class07837;

public final class class07806
extends Record {
    private final class00392 description;
    private final Optional<class07837> players;
    private final Optional<class07808> version;
    private final Optional<class07824> favicon;
    private final boolean enforcesSecureChat;
    public static final Codec<class07806> N = RecordCodecBuilder.create(instance -> instance.group((App)class03748.N.lenientOptionalFieldOf("description", (Object)class05220.N).forGetter(class07806::N), (App)class07837.N.lenientOptionalFieldOf("players").forGetter(class07806::y), (App)class07808.N.lenientOptionalFieldOf("version").forGetter(class07806::L), (App)class07824.N.lenientOptionalFieldOf("favicon").forGetter(class07806::u), (App)Codec.BOOL.lenientOptionalFieldOf("enforcesSecureChat", (Object)false).forGetter(class07806::i)).apply(instance, class07806::new));

    public Optional<class07808> L() {
        return this.version;
    }

    public class07806(class00392 class003922, Optional<class07837> optional, Optional<class07808> optional2, Optional<class07824> optional3, boolean bl) {
        this.description = class003922;
        this.players = optional;
        this.version = optional2;
        this.favicon = optional3;
        this.enforcesSecureChat = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07806.class, "description;players;version;favicon;enforcesSecureChat", "description", "players", "version", "favicon", "enforcesSecureChat"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07806.class, "description;players;version;favicon;enforcesSecureChat", "description", "players", "version", "favicon", "enforcesSecureChat"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07806.class, "description;players;version;favicon;enforcesSecureChat", "description", "players", "version", "favicon", "enforcesSecureChat"}, this);
    }

    public boolean i() {
        return this.enforcesSecureChat;
    }

    public Optional<class07824> u() {
        return this.favicon;
    }

    public Optional<class07837> y() {
        return this.players;
    }

    public class00392 N() {
        return this.description;
    }
}

