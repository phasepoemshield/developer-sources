/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.ints.IntIterator
 *  minecraft.class01001
 *  minecraft.class01219
 *  minecraft.class01228
 *  minecraft.class01233
 *  minecraft.class02142
 *  minecraft.class05235
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.ints.IntIterator;
import java.util.List;
import java.util.stream.IntStream;
import minecraft.class01001;
import minecraft.class01219;
import minecraft.class01228;
import minecraft.class01233;
import minecraft.class02142;
import minecraft.class05235;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07536;

public class class03564
extends class01219 {
    public static final MapCodec<class03564> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class05235.N.fieldOf("delegate").forGetter(class035642 -> class035642.y), (App)class02142.i.fieldOf("limit").forGetter(class035642 -> class035642.L)).apply(instance, class03564::new));
    private final class01219 y;
    private final class02142 L;

    public class03564(class01219 class012192, class02142 class021422) {
        this.y = class012192;
        this.L = class021422;
    }

    protected class05235<?> N() {
        return class05235.P;
    }

    public final List<class01228> N(class01001 class010012, class07209 class072092, class07209 class072093, List<class01228> list, List<class01228> list2, class01233 class012332) {
        if (this.L.L() == 0 || list2.isEmpty()) {
            return list2;
        }
        if (list.size() != list2.size()) {
            class07536.y((String)("Original block info list not in sync with processed list, skipping processing. Original size: " + list.size() + ", Processed size: " + list2.size()));
            return list2;
        }
        class06069 class060692 = class06069.y((long)class010012.method_8410().method_8412()).L().N(class072092);
        int n = Math.min(this.L.N(class060692), list2.size());
        if (n < 1) {
            return list2;
        }
        IntIterator intIterator = class07536.N((IntStream)IntStream.range(0, list2.size()), (class06069)class060692).intIterator();
        int n2 = 0;
        while (intIterator.hasNext() && n2 < n) {
            class01228 class012282;
            int n3 = intIterator.nextInt();
            class01228 class012283 = list.get(n3);
            class01228 class012284 = this.y.N((class05487)class010012, class072092, class072093, class012283, class012282 = list2.get(n3), class012332);
            if (class012284 == null || class012282.equals((Object)class012284)) continue;
            ++n2;
            list2.set(n3, class012284);
        }
        return list2;
    }
}

