/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class03238
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04336
 *  minecraft.class06391
 *  minecraft.class07536
 *  minecraft.class07829
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import minecraft.class03238;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04336;
import minecraft.class06391;
import minecraft.class07536;
import minecraft.class07829;
import org.slf4j.Logger;

public class class01029 {
    private static final Logger M = LogUtils.getLogger();
    public static final class01029 N = new class01029((class03543<class07829<?>>)class03543.N((class03556[])new class03556[0]), List.of());
    public static final MapCodec<class01029> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class07829.L.promotePartial(class07536.N((String)"Carver: ", arg_0 -> ((Logger)M).error(arg_0))).fieldOf("carvers").forGetter(class010292 -> class010292.L), (App)class04336.u.promotePartial(class07536.N((String)"Features: ", arg_0 -> ((Logger)M).error(arg_0))).fieldOf("features").forGetter(class010292 -> class010292.u)).apply(instance, class01029::new));
    public class03543<class07829<?>> L;
    public List<class03543<class04336>> u;
    public Supplier<List<class03238<?, ?>>> i;
    public Supplier<Set<class04336>> R;

    public List<class03543<class04336>> L() {
        return this.u;
    }

    class01029(class03543<class07829<?>> class035432, List<class03543<class04336>> list) {
        this.L = class035432;
        this.u = list;
        this.i = Suppliers.memoize(() -> (List)list.stream().flatMap(class03543::N).map(class03556::N).flatMap(class04336::N).filter(class032382 -> class032382.y() == class06391.u).collect(ImmutableList.toImmutableList()));
        this.R = Suppliers.memoize(() -> list.stream().flatMap(class03543::N).map(class03556::N).collect(Collectors.toSet()));
    }

    public List<class03238<?, ?>> y() {
        return this.i.get();
    }

    public boolean N(class04336 class043362) {
        return this.R.get().contains(class043362);
    }

    public Iterable<class03556<class07829<?>>> N() {
        return this.L;
    }
}

