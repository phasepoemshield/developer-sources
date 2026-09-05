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
 *  minecraft.class01487
 *  minecraft.class03748
 *  minecraft.class06685
 *  minecraft.class06702
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;
import java.util.UUID;
import minecraft.class00392;
import minecraft.class01487;
import minecraft.class03748;
import minecraft.class06685;
import minecraft.class06702;

public final class class06425
extends Record {
    final class00392 name;
    final boolean visible;
    final int value;
    final int max;
    final class06685 color;
    final class06702 overlay;
    final boolean darkenScreen;
    final boolean playBossMusic;
    final boolean createWorldFog;
    final Set<UUID> players;
    public static final Codec<class06425> U = RecordCodecBuilder.create(instance -> instance.group((App)class03748.N.fieldOf("Name").forGetter(class06425::N), (App)Codec.BOOL.optionalFieldOf("Visible", (Object)false).forGetter(class06425::y), (App)Codec.INT.optionalFieldOf("Value", (Object)0).forGetter(class06425::L), (App)Codec.INT.optionalFieldOf("Max", (Object)100).forGetter(class06425::u), (App)class06685.field_56628.optionalFieldOf("Color", (Object)class06685.field_5786).forGetter(class06425::i), (App)class06702.field_56629.optionalFieldOf("Overlay", (Object)class06702.field_5795).forGetter(class06425::R), (App)Codec.BOOL.optionalFieldOf("DarkenScreen", (Object)false).forGetter(class06425::M), (App)Codec.BOOL.optionalFieldOf("PlayBossMusic", (Object)false).forGetter(class06425::B), (App)Codec.BOOL.optionalFieldOf("CreateWorldFog", (Object)false).forGetter(class06425::Z), (App)class01487.y.optionalFieldOf("Players", Set.of()).forGetter(class06425::z)).apply(instance, class06425::new));

    public int L() {
        return this.value;
    }

    public boolean M() {
        return this.darkenScreen;
    }

    public class06425(class00392 class003922, boolean bl, int n, int n2, class06685 class066852, class06702 class067022, boolean bl2, boolean bl3, boolean bl4, Set<UUID> set) {
        this.name = class003922;
        this.visible = bl;
        this.value = n;
        this.max = n2;
        this.color = class066852;
        this.overlay = class067022;
        this.darkenScreen = bl2;
        this.playBossMusic = bl3;
        this.createWorldFog = bl4;
        this.players = set;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06425.class, "name;visible;value;max;color;overlay;darkenScreen;playBossMusic;createWorldFog;players", "name", "visible", "value", "max", "color", "overlay", "darkenScreen", "playBossMusic", "createWorldFog", "players"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06425.class, "name;visible;value;max;color;overlay;darkenScreen;playBossMusic;createWorldFog;players", "name", "visible", "value", "max", "color", "overlay", "darkenScreen", "playBossMusic", "createWorldFog", "players"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06425.class, "name;visible;value;max;color;overlay;darkenScreen;playBossMusic;createWorldFog;players", "name", "visible", "value", "max", "color", "overlay", "darkenScreen", "playBossMusic", "createWorldFog", "players"}, this);
    }

    public boolean B() {
        return this.playBossMusic;
    }

    public boolean Z() {
        return this.createWorldFog;
    }

    public class06685 i() {
        return this.color;
    }

    public Set<UUID> z() {
        return this.players;
    }

    public int u() {
        return this.max;
    }

    public boolean y() {
        return this.visible;
    }

    public class00392 N() {
        return this.name;
    }

    public class06702 R() {
        return this.overlay;
    }
}

