/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class01224
 *  minecraft.class01281
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04869
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06993
 *  minecraft.class07209
 *  minecraft.class07536
 *  org.apache.commons.lang3.mutable.MutableObject
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import java.util.function.Function;
import minecraft.class01224;
import minecraft.class01281;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04869;
import minecraft.class05246;
import minecraft.class05248;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06993;
import minecraft.class07209;
import minecraft.class07536;
import org.apache.commons.lang3.mutable.MutableObject;

public class class05281 {
    private static final int L = Integer.MIN_VALUE;
    private static final MutableObject<Codec<class03556<class05281>>> u = new MutableObject();
    public static final Codec<class05281> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.lazyInitialized(u).fieldOf("fallback").forGetter(class05281::y), (App)Codec.mapPair((MapCodec)class05248.i.fieldOf("element"), (MapCodec)Codec.intRange((int)1, (int)150).fieldOf("weight")).codec().listOf().fieldOf("elements").forGetter(class052812 -> class052812.i)).apply(instance, class05281::new));
    public static final Codec<class03556<class05281>> y = (Codec)class07536.N((Object)class01281.N((class05946)class04227.yv, N), arg_0 -> u.setValue(arg_0));
    private final List<Pair<class05248, Integer>> i;
    private final ObjectArrayList<class05248> R;
    private final class03556<class05281> M;
    private int B = Integer.MIN_VALUE;

    public int L() {
        return this.R.size();
    }

    public class05281(class03556<class05281> class035562, List<Pair<class05248, Integer>> list) {
        this.i = list;
        this.R = new ObjectArrayList();
        for (Pair<class05248, Integer> pair : list) {
            class05248 class052482 = (class05248)pair.getFirst();
            for (int i = 0; i < (Integer)pair.getSecond(); ++i) {
                this.R.add((Object)class052482);
            }
        }
        this.M = class035562;
    }

    public class05281(class03556<class05281> class035562, List<Pair<Function<class05246, ? extends class05248>, Integer>> list, class05246 class052462) {
        this.i = Lists.newArrayList();
        this.R = new ObjectArrayList();
        for (Pair<Function<class05246, ? extends class05248>, Integer> pair : list) {
            class05248 class052482 = (class05248)((Function)pair.getFirst()).apply(class052462);
            this.i.add((Pair<class05248, Integer>)Pair.of((Object)class052482, (Object)((Integer)pair.getSecond())));
            for (int i = 0; i < (Integer)pair.getSecond(); ++i) {
                this.R.add((Object)class052482);
            }
        }
        this.M = class035562;
    }

    public List<class05248> y(class06069 class060692) {
        return class07536.N(this.R, (class06069)class060692);
    }

    public class03556<class05281> y() {
        return this.M;
    }

    public int N(class01224 class012242) {
        if (this.B == Integer.MIN_VALUE) {
            this.B = this.R.stream().filter(class052482 -> class052482 != class04869.y).mapToInt(class052482 -> class052482.N(class012242, class07209.field_10980, class06993.field_11467).i()).max().orElse(0);
        }
        return this.B;
    }

    public List<Pair<class05248, Integer>> N() {
        return this.i;
    }

    public class05248 N(class06069 class060692) {
        if (this.R.isEmpty()) {
            return class04869.y;
        }
        return (class05248)this.R.get(class060692.y(this.R.size()));
    }
}

