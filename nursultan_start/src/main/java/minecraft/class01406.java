/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap$Entry
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMaps
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00734
 *  minecraft.class00821
 *  minecraft.class00836
 *  minecraft.class01205
 *  minecraft.class01894
 *  minecraft.class02227
 *  minecraft.class03622
 *  minecraft.class03631
 *  minecraft.class03704
 *  minecraft.class03711
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04895
 *  minecraft.class04912
 *  minecraft.class05946
 *  minecraft.class06145
 *  minecraft.class06338
 *  minecraft.class06521
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07113
 *  minecraft.class07299
 *  minecraft.class08038
 *  minecraft.class08697
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMaps;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import minecraft.class00734;
import minecraft.class00821;
import minecraft.class00836;
import minecraft.class01205;
import minecraft.class01385;
import minecraft.class01419;
import minecraft.class01894;
import minecraft.class02227;
import minecraft.class03622;
import minecraft.class03631;
import minecraft.class03704;
import minecraft.class03711;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04895;
import minecraft.class04912;
import minecraft.class05946;
import minecraft.class06145;
import minecraft.class06338;
import minecraft.class06521;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07113;
import minecraft.class07299;
import minecraft.class08038;
import minecraft.class08697;
import org.jspecify.annotations.Nullable;

public final class class01406
extends Record
implements class03622 {
    private final class00836 level;
    private final class02227 gameType;
    private final List<class01419<?>> stats;
    private final Object2BooleanMap<class05946<class06521<?>>> recipes;
    private final Map<class01894, class01385> advancements;
    private final Optional<class00821> lookingAt;
    private final Optional<class08697> input;
    public static final int N = 100;
    public static final MapCodec<class01406> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class00836.u.optionalFieldOf("level", (Object)class00836.L).forGetter(class01406::y), (App)class02227.L.optionalFieldOf("gamemode", (Object)class02227.N).forGetter(class01406::L), (App)class01419.N.listOf().optionalFieldOf("stats", List.of()).forGetter(class01406::u), (App)class06338.R((Codec)class06521.M).optionalFieldOf("recipes", (Object)Object2BooleanMaps.emptyMap()).forGetter(class01406::i), (App)Codec.unboundedMap((Codec)class01894.N, class01385.y).optionalFieldOf("advancements", Map.of()).forGetter(class01406::R), (App)class00821.N.optionalFieldOf("looking_at").forGetter(class01406::M), (App)class08697.N.optionalFieldOf("input").forGetter(class01406::B)).apply(instance, class01406::new));

    public class02227 L() {
        return this.gameType;
    }

    public Optional<class00821> M() {
        return this.lookingAt;
    }

    public class01406(class00836 class008362, class02227 class022272, List<class01419<?>> list, Object2BooleanMap<class05946<class06521<?>>> object2BooleanMap, Map<class01894, class01385> map, Optional<class00821> optional, Optional<class08697> optional2) {
        this.level = class008362;
        this.gameType = class022272;
        this.stats = list;
        this.recipes = object2BooleanMap;
        this.advancements = map;
        this.lookingAt = optional;
        this.input = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01406.class, "level;gameType;stats;recipes;advancements;lookingAt;input", "level", "gameType", "stats", "recipes", "advancements", "lookingAt", "input"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01406.class, "level;gameType;stats;recipes;advancements;lookingAt;input", "level", "gameType", "stats", "recipes", "advancements", "lookingAt", "input"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01406.class, "level;gameType;stats;recipes;advancements;lookingAt;input", "level", "gameType", "stats", "recipes", "advancements", "lookingAt", "input"}, this);
    }

    public Optional<class08697> B() {
        return this.input;
    }

    public Object2BooleanMap<class05946<class06521<?>>> i() {
        return this.recipes;
    }

    public List<class01419<?>> u() {
        return this.stats;
    }

    public class00836 y() {
        return this.level;
    }

    public boolean N(class07049 class070493, class04782 class047822, @Nullable class06889 class068892) {
        class03711 class037112;
        Object2BooleanMap.Entry entry2;
        if (!(class070493 instanceof class04770)) {
            return false;
        }
        class04770 class047702 = (class04770)class070493;
        if (!this.level.u(class047702.fields_37fa3311b0e9d3e9b883d09222919bf5a_0.intValue())) {
            return false;
        }
        if (!this.gameType.N(class047702.method_68876())) {
            return false;
        }
        class04895 class048952 = class047702.method_14248();
        for (class01419<?> objectIterator2 : this.stats) {
            if (objectIterator2.N((class01205)class048952)) continue;
            return false;
        }
        class04912 class049122 = class047702.method_14253();
        for (Object2BooleanMap.Entry entry2 : this.recipes.object2BooleanEntrySet()) {
            if (class049122.y((class05946)entry2.getKey()) == entry2.getBooleanValue()) continue;
            return false;
        }
        if (!this.advancements.isEmpty()) {
            class03704 class037042 = class047702.method_14236();
            entry2 = class047702.method_51469().method_8503().Nh();
            for (Map.Entry<class01894, class01385> entry3 : this.advancements.entrySet()) {
                class037112 = entry2.N(entry3.getKey());
                if (class037112 != null && entry3.getValue().test(class037042.y(class037112))) continue;
                return false;
            }
        }
        if (this.lookingAt.isPresent()) {
            class06889 class068893 = class047702.method_33571();
            entry2 = class047702.method_5828(1.0f);
            class06889 class068894 = class068893.y(entry2.M * 100.0, entry2.B * 100.0, entry2.Z * 100.0);
            class06145 class061452 = class08038.N((class07299)class047702.method_51469(), (class07049)class047702, (class06889)class068893, (class06889)class068894, (class00734)new class00734(class068893, class068894).M(1.0), class070492 -> !class070492.method_7325(), (float)0.0f);
            if (class061452 == null || class061452.N() != class07113.field_1331) {
                return false;
            }
            class037112 = class061452.L();
            if (!this.lookingAt.get().N(class047702, (class07049)class037112) || !class047702.method_6057((class07049)class037112)) {
                return false;
            }
        }
        return !this.input.isPresent() || this.input.get().N(class047702.method_63562());
    }

    public MapCodec<class01406> N() {
        return class03631.L;
    }

    public Map<class01894, class01385> R() {
        return this.advancements;
    }
}

