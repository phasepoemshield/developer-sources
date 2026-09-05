/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10297
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00780
 *  minecraft.class03979
 *  minecraft.class04227
 *  minecraft.class05946
 */
package minecraft;

import Nursultan.class10297;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import minecraft.class00780;
import minecraft.class03979;
import minecraft.class04017;
import minecraft.class04018;
import minecraft.class04020;
import minecraft.class04039;
import minecraft.class04227;
import minecraft.class05946;

public final class class04034
implements class04017 {
    static final class03979<class04034> N = class03979.N((MapCodec)class05946.N((class05946)class04227.NA).listOf().fieldOf("biome_is").xmap(class04020::N, class040342 -> class040342.u));
    private final List<class05946<class00780>> u;
    public final Predicate<class05946<class00780>> y;

    class04034(List<class05946<class00780>> list) {
        this.u = list;
        this.y = Set.copyOf(list)::contains;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof class04034) {
            class04034 class040342 = (class04034)object;
            return this.u.equals(class040342.u);
        }
        return false;
    }

    public String toString() {
        return "BiomeConditionSource[biomes=" + String.valueOf(this.u) + "]";
    }

    public int hashCode() {
        return this.u.hashCode();
    }

    @Override
    public class04018 apply(class04039 class040392) {
        return new class10297(this, class040392);
    }

    @Override
    public class03979<? extends class04017> N() {
        return N;
    }
}

