/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01487
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import minecraft.class01487;
import minecraft.class07209;

public final class class07826
extends Record {
    final boolean needsStateScanning;
    final boolean dragonKilled;
    final boolean previouslyKilled;
    final boolean isRespawning;
    final Optional<UUID> dragonUUID;
    final Optional<class07209> exitPortalLocation;
    final Optional<List<Integer>> gateways;
    public static final Codec<class07826> B = RecordCodecBuilder.create(instance -> instance.group((App)Codec.BOOL.fieldOf("NeedsStateScanning").orElse((Object)true).forGetter(class07826::N), (App)Codec.BOOL.fieldOf("DragonKilled").orElse((Object)false).forGetter(class07826::y), (App)Codec.BOOL.fieldOf("PreviouslyKilled").orElse((Object)false).forGetter(class07826::L), (App)Codec.BOOL.lenientOptionalFieldOf("IsRespawning", (Object)false).forGetter(class07826::u), (App)class01487.N.lenientOptionalFieldOf("Dragon").forGetter(class07826::i), (App)class07209.field_25064.lenientOptionalFieldOf("ExitPortalLocation").forGetter(class07826::R), (App)Codec.list((Codec)Codec.INT).lenientOptionalFieldOf("Gateways").forGetter(class07826::M)).apply(instance, class07826::new));
    public static final class07826 Z = new class07826(true, false, false, false, Optional.empty(), Optional.empty(), Optional.empty());

    public boolean L() {
        return this.previouslyKilled;
    }

    public Optional<List<Integer>> M() {
        return this.gateways;
    }

    public class07826(boolean bl, boolean bl2, boolean bl3, boolean bl4, Optional<UUID> optional, Optional<class07209> optional2, Optional<List<Integer>> optional3) {
        this.needsStateScanning = bl;
        this.dragonKilled = bl2;
        this.previouslyKilled = bl3;
        this.isRespawning = bl4;
        this.dragonUUID = optional;
        this.exitPortalLocation = optional2;
        this.gateways = optional3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07826.class, "needsStateScanning;dragonKilled;previouslyKilled;isRespawning;dragonUUID;exitPortalLocation;gateways", "needsStateScanning", "dragonKilled", "previouslyKilled", "isRespawning", "dragonUUID", "exitPortalLocation", "gateways"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07826.class, "needsStateScanning;dragonKilled;previouslyKilled;isRespawning;dragonUUID;exitPortalLocation;gateways", "needsStateScanning", "dragonKilled", "previouslyKilled", "isRespawning", "dragonUUID", "exitPortalLocation", "gateways"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07826.class, "needsStateScanning;dragonKilled;previouslyKilled;isRespawning;dragonUUID;exitPortalLocation;gateways", "needsStateScanning", "dragonKilled", "previouslyKilled", "isRespawning", "dragonUUID", "exitPortalLocation", "gateways"}, this);
    }

    public Optional<UUID> i() {
        return this.dragonUUID;
    }

    public boolean u() {
        return this.isRespawning;
    }

    public boolean y() {
        return this.dragonKilled;
    }

    public boolean N() {
        return this.needsStateScanning;
    }

    public Optional<class07209> R() {
        return this.exitPortalLocation;
    }
}

