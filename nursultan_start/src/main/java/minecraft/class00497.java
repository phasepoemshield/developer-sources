/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03748
 *  minecraft.class05220
 *  minecraft.class06541
 *  minecraft.class06656
 *  minecraft.class06672
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class03748;
import minecraft.class05220;
import minecraft.class06541;
import minecraft.class06656;
import minecraft.class06672;

public final class class00497
extends Record {
    private final String name;
    private final Optional<class00392> displayName;
    private final Optional<class06541> color;
    private final boolean allowFriendlyFire;
    private final boolean seeFriendlyInvisibles;
    private final class00392 memberNamePrefix;
    private final class00392 memberNameSuffix;
    private final class06672 nameTagVisibility;
    private final class06672 deathMessageVisibility;
    private final class06656 collisionRule;
    private final List<String> players;
    public static final Codec<class00497> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.STRING.fieldOf("Name").forGetter(class00497::N), (App)class03748.N.optionalFieldOf("DisplayName").forGetter(class00497::y), (App)class06541.field_56511.optionalFieldOf("TeamColor").forGetter(class00497::L), (App)Codec.BOOL.optionalFieldOf("AllowFriendlyFire", (Object)true).forGetter(class00497::u), (App)Codec.BOOL.optionalFieldOf("SeeFriendlyInvisibles", (Object)true).forGetter(class00497::i), (App)class03748.N.optionalFieldOf("MemberNamePrefix", (Object)class05220.N).forGetter(class00497::R), (App)class03748.N.optionalFieldOf("MemberNameSuffix", (Object)class05220.N).forGetter(class00497::M), (App)class06672.field_56489.optionalFieldOf("NameTagVisibility", (Object)class06672.field_1442).forGetter(class00497::B), (App)class06672.field_56489.optionalFieldOf("DeathMessageVisibility", (Object)class06672.field_1442).forGetter(class00497::Z), (App)class06656.field_56486.optionalFieldOf("CollisionRule", (Object)class06656.field_1437).forGetter(class00497::z), (App)Codec.STRING.listOf().optionalFieldOf("Players", List.of()).forGetter(class00497::U)).apply(instance, class00497::new));

    public Optional<class06541> L() {
        return this.color;
    }

    public class00392 M() {
        return this.memberNameSuffix;
    }

    public class00497(String string, Optional<class00392> optional, Optional<class06541> optional2, boolean bl, boolean bl2, class00392 class003922, class00392 class003923, class06672 class066722, class06672 class066723, class06656 class066562, List<String> list) {
        this.name = string;
        this.displayName = optional;
        this.color = optional2;
        this.allowFriendlyFire = bl;
        this.seeFriendlyInvisibles = bl2;
        this.memberNamePrefix = class003922;
        this.memberNameSuffix = class003923;
        this.nameTagVisibility = class066722;
        this.deathMessageVisibility = class066723;
        this.collisionRule = class066562;
        this.players = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00497.class, "name;displayName;color;allowFriendlyFire;seeFriendlyInvisibles;memberNamePrefix;memberNameSuffix;nameTagVisibility;deathMessageVisibility;collisionRule;players", "name", "displayName", "color", "allowFriendlyFire", "seeFriendlyInvisibles", "memberNamePrefix", "memberNameSuffix", "nameTagVisibility", "deathMessageVisibility", "collisionRule", "players"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00497.class, "name;displayName;color;allowFriendlyFire;seeFriendlyInvisibles;memberNamePrefix;memberNameSuffix;nameTagVisibility;deathMessageVisibility;collisionRule;players", "name", "displayName", "color", "allowFriendlyFire", "seeFriendlyInvisibles", "memberNamePrefix", "memberNameSuffix", "nameTagVisibility", "deathMessageVisibility", "collisionRule", "players"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00497.class, "name;displayName;color;allowFriendlyFire;seeFriendlyInvisibles;memberNamePrefix;memberNameSuffix;nameTagVisibility;deathMessageVisibility;collisionRule;players", "name", "displayName", "color", "allowFriendlyFire", "seeFriendlyInvisibles", "memberNamePrefix", "memberNameSuffix", "nameTagVisibility", "deathMessageVisibility", "collisionRule", "players"}, this);
    }

    public class06672 B() {
        return this.nameTagVisibility;
    }

    public class06672 Z() {
        return this.deathMessageVisibility;
    }

    public boolean i() {
        return this.seeFriendlyInvisibles;
    }

    public List<String> U() {
        return this.players;
    }

    public class06656 z() {
        return this.collisionRule;
    }

    public boolean u() {
        return this.allowFriendlyFire;
    }

    public Optional<class00392> y() {
        return this.displayName;
    }

    public String N() {
        return this.name;
    }

    public class00392 R() {
        return this.memberNamePrefix;
    }
}

