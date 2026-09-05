/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class04995
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class01894;
import minecraft.class04995;
import minecraft.class06338;

public final class class08301
extends Record {
    private final int nearDistance;
    private final int farDistance;
    private final List<class01894> sprites;
    private final List<class01894> spriteLocations;
    public static final String N = "hud/locator_bar_dot/";
    public static final int y = 128;
    public static final int L = 332;
    private static final Codec<Integer> Z = Codec.intRange((int)0, (int)60000000);
    public static final Codec<class08301> u = RecordCodecBuilder.create(instance -> instance.group((App)Z.optionalFieldOf("near_distance", (Object)128).forGetter(class08301::y), (App)Z.optionalFieldOf("far_distance", (Object)332).forGetter(class08301::L), (App)class06338.y((Codec)class01894.N.listOf()).fieldOf("sprites").forGetter(class08301::u)).apply(instance, class08301::new)).validate(class08301::N);

    public int L() {
        return this.farDistance;
    }

    public class08301(int n, int n2, List<class01894> list) {
        this(n, n2, list, list.stream().map(class018942 -> class018942.R(N)).toList());
    }

    public class08301(int n, int n2, List<class01894> list, List<class01894> list2) {
        this.nearDistance = n;
        this.farDistance = n2;
        this.sprites = list;
        this.spriteLocations = list2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08301.class, "nearDistance;farDistance;sprites;spriteLocations", "nearDistance", "farDistance", "sprites", "spriteLocations"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08301.class, "nearDistance;farDistance;sprites;spriteLocations", "nearDistance", "farDistance", "sprites", "spriteLocations"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08301.class, "nearDistance;farDistance;sprites;spriteLocations", "nearDistance", "farDistance", "sprites", "spriteLocations"}, this);
    }

    public List<class01894> i() {
        return this.spriteLocations;
    }

    public List<class01894> u() {
        return this.sprites;
    }

    public int y() {
        return this.nearDistance;
    }

    public class01894 N(float f) {
        if (f < (float)this.nearDistance) {
            return (class01894)this.spriteLocations.getFirst();
        }
        if (f >= (float)this.farDistance) {
            return (class01894)this.spriteLocations.getLast();
        }
        if (this.spriteLocations.size() == 1) {
            return (class01894)this.spriteLocations.getFirst();
        }
        if (this.spriteLocations.size() == 3) {
            return this.spriteLocations.get(1);
        }
        int n = class04995.N((float)((f - (float)this.nearDistance) / (float)(this.farDistance - this.nearDistance)), (int)1, (int)(this.spriteLocations.size() - 1));
        return this.spriteLocations.get(n);
    }

    public DataResult<class08301> N() {
        if (this.sprites.isEmpty()) {
            return DataResult.error(() -> "Must have at least one sprite icon");
        }
        if (this.nearDistance <= 0) {
            return DataResult.error(() -> "Near distance (" + this.nearDistance + ") must be greater than zero");
        }
        if (this.nearDistance >= this.farDistance) {
            return DataResult.error(() -> "Far distance (" + this.farDistance + ") cannot be closer or equal to near distance (" + this.nearDistance + ")");
        }
        return DataResult.success((Object)((Object)this));
    }
}

