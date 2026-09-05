/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class03647
 *  minecraft.class05054
 *  minecraft.class05291
 *  minecraft.class06386
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import minecraft.class01471;
import minecraft.class01474;
import minecraft.class01479;
import minecraft.class03647;
import minecraft.class05054;
import minecraft.class05291;
import minecraft.class06386;

public class class01476
implements class06386 {
    public static final Codec<class01476> N = RecordCodecBuilder.create(instance -> instance.group((App)class01471.N.fieldOf("trunk_provider").forGetter(class014762 -> class014762.y), (App)class05291.y.fieldOf("trunk_placer").forGetter(class014762 -> class014762.u), (App)class01471.N.fieldOf("foliage_provider").forGetter(class014762 -> class014762.i), (App)class01479.L.fieldOf("foliage_placer").forGetter(class014762 -> class014762.M), (App)class03647.u.optionalFieldOf("root_placer").forGetter(class014762 -> class014762.B), (App)class01471.N.fieldOf("dirt_provider").forGetter(class014762 -> class014762.L), (App)class05054.N.fieldOf("minimum_size").forGetter(class014762 -> class014762.Z), (App)class01474.y.listOf().fieldOf("decorators").forGetter(class014762 -> class014762.z), (App)Codec.BOOL.fieldOf("ignore_vines").orElse((Object)false).forGetter(class014762 -> class014762.U), (App)Codec.BOOL.fieldOf("force_dirt").orElse((Object)false).forGetter(class014762 -> class014762.E)).apply(instance, class01476::new));
    public final class01471 y;
    public final class01471 L;
    public final class05291 u;
    public final class01471 i;
    public final class01479 M;
    public final Optional<class03647> B;
    public final class05054 Z;
    public final List<class01474> z;
    public final boolean U;
    public final boolean E;

    protected class01476(class01471 class014712, class05291 class052912, class01471 class014713, class01479 class014792, Optional<class03647> optional, class01471 class014714, class05054 class050542, List<class01474> list, boolean bl, boolean bl2) {
        this.y = class014712;
        this.u = class052912;
        this.i = class014713;
        this.M = class014792;
        this.B = optional;
        this.L = class014714;
        this.Z = class050542;
        this.z = list;
        this.U = bl;
        this.E = bl2;
    }
}

