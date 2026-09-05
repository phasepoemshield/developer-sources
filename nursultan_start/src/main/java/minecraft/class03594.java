/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class03336
 *  minecraft.class03368
 *  minecraft.class05074
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class07001
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class03336;
import minecraft.class03368;
import minecraft.class05074;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class07001;
import org.jspecify.annotations.Nullable;

public class class03594
implements class03336 {
    public static final MapCodec<class03594> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class05074.N.fieldOf("loot_table").forGetter(class035942 -> class035942.y)).apply(instance, class03594::new));
    private final class05946<class05074> y;

    public class03594(class05946<class05074> class059462) {
        this.y = class059462;
    }

    public class07001 N(class06069 class060692, @Nullable class07001 class070012) {
        class07001 class070013 = class070012 == null ? new class07001() : class070012.N();
        class070013.N("LootTable", class05074.N, this.y);
        class070013.N("LootTableSeed", class060692.B());
        return class070013;
    }

    public class03368<?> N() {
        return class03368.u;
    }
}

