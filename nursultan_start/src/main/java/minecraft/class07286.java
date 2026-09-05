/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02834
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class06338
 *  minecraft.class06581
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import minecraft.class02834;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class06338;
import minecraft.class06581;
import minecraft.class07300;

public final class class07286
extends Record {
    final class03543<class06581> supportedItems;
    final Optional<class03543<class06581>> primaryItems;
    private final int weight;
    private final int maxLevel;
    private final class07300 minCost;
    private final class07300 maxCost;
    private final int anvilCost;
    private final List<class02834> slots;
    public static final MapCodec<class07286> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03541.N((class05946)class04227.F).fieldOf("supported_items").forGetter(class07286::N), (App)class03541.N((class05946)class04227.F).optionalFieldOf("primary_items").forGetter(class07286::y), (App)class06338.N((int)1, (int)1024).fieldOf("weight").forGetter(class07286::L), (App)class06338.N((int)1, (int)255).fieldOf("max_level").forGetter(class07286::u), (App)class07300.N.fieldOf("min_cost").forGetter(class07286::i), (App)class07300.N.fieldOf("max_cost").forGetter(class07286::R), (App)class06338.T.fieldOf("anvil_cost").forGetter(class07286::M), (App)class02834.field_49226.listOf().fieldOf("slots").forGetter(class07286::B)).apply(instance, class07286::new));

    public int L() {
        return this.weight;
    }

    public int M() {
        return this.anvilCost;
    }

    public class07286(class03543<class06581> class035432, Optional<class03543<class06581>> optional, int n, int n2, class07300 class073002, class07300 class073003, int n3, List<class02834> list) {
        this.supportedItems = class035432;
        this.primaryItems = optional;
        this.weight = n;
        this.maxLevel = n2;
        this.minCost = class073002;
        this.maxCost = class073003;
        this.anvilCost = n3;
        this.slots = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07286.class, "supportedItems;primaryItems;weight;maxLevel;minCost;maxCost;anvilCost;slots", "supportedItems", "primaryItems", "weight", "maxLevel", "minCost", "maxCost", "anvilCost", "slots"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07286.class, "supportedItems;primaryItems;weight;maxLevel;minCost;maxCost;anvilCost;slots", "supportedItems", "primaryItems", "weight", "maxLevel", "minCost", "maxCost", "anvilCost", "slots"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07286.class, "supportedItems;primaryItems;weight;maxLevel;minCost;maxCost;anvilCost;slots", "supportedItems", "primaryItems", "weight", "maxLevel", "minCost", "maxCost", "anvilCost", "slots"}, this);
    }

    public List<class02834> B() {
        return this.slots;
    }

    public class07300 i() {
        return this.minCost;
    }

    public int u() {
        return this.maxLevel;
    }

    public Optional<class03543<class06581>> y() {
        return this.primaryItems;
    }

    public class03543<class06581> N() {
        return this.supportedItems;
    }

    public class07300 R() {
        return this.maxCost;
    }
}

