/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Decoder
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01001
 *  minecraft.class01203
 *  minecraft.class01207
 *  minecraft.class01219
 *  minecraft.class01224
 *  minecraft.class01228
 *  minecraft.class01233
 *  minecraft.class01894
 *  minecraft.class02610
 *  minecraft.class03556
 *  minecraft.class05163
 *  minecraft.class05235
 *  minecraft.class05246
 *  minecraft.class05248
 *  minecraft.class05255
 *  minecraft.class05267
 *  minecraft.class05282
 *  minecraft.class05324
 *  minecraft.class05483
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06993
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07536
 *  minecraft.class08070
 *  minecraft.class08088
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01001;
import minecraft.class01203;
import minecraft.class01207;
import minecraft.class01219;
import minecraft.class01224;
import minecraft.class01228;
import minecraft.class01233;
import minecraft.class01894;
import minecraft.class02610;
import minecraft.class03556;
import minecraft.class05163;
import minecraft.class05235;
import minecraft.class05246;
import minecraft.class05248;
import minecraft.class05255;
import minecraft.class05267;
import minecraft.class05282;
import minecraft.class05324;
import minecraft.class05483;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06993;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07536;
import minecraft.class08070;
import minecraft.class08088;

public class class04872
extends class05248 {
    private static final Comparator<class01203> R = Comparator.comparingInt(class01203::M).reversed();
    private static final Codec<Either<class01894, class01207>> M = Codec.of(class04872::N, (Decoder)class01894.N.map(Either::left));
    public static final MapCodec<class04872> N = RecordCodecBuilder.mapCodec(instance -> instance.group(class04872.u(), class04872.y(), (App)class04872.R(), class04872.L()).apply(instance, class04872::new));
    protected final Either<class01894, class01207> y;
    protected final class03556<class05483> L;
    protected final Optional<class02610> u;

    protected static <E extends class04872> RecordCodecBuilder<E, Optional<class02610>> L() {
        return class02610.field_52239.optionalFieldOf("override_liquid_settings").forGetter(class048722 -> class048722.u);
    }

    public class04872(Either<class01894, class01207> either, class03556<class05483> class035562, class05246 class052462, Optional<class02610> optional) {
        super(class052462);
        this.y = either;
        this.L = class035562;
        this.u = optional;
    }

    public String toString() {
        return "Single[" + String.valueOf(this.y) + "]";
    }

    public class01894 i() {
        return (class01894)this.y.orThrow();
    }

    protected static <E extends class04872> RecordCodecBuilder<E, Either<class01894, class01207>> u() {
        return M.fieldOf("location").forGetter(class048722 -> class048722.y);
    }

    protected static <E extends class04872> RecordCodecBuilder<E, class03556<class05483>> y() {
        return class05235.u.fieldOf("processors").forGetter(class048722 -> class048722.L);
    }

    public class05267<?> N() {
        return class05267.N;
    }

    private static <T> DataResult<T> N(Either<class01894, class01207> either, DynamicOps<T> dynamicOps, T t) {
        Optional optional = either.left();
        if (optional.isEmpty()) {
            return DataResult.error(() -> "Can not serialize a runtime pool element");
        }
        return class01894.N.encode((Object)((class01894)optional.get()), dynamicOps, t);
    }

    public List<class01203> N(class01224 class012242, class07209 class072092, class06993 class069932, class06069 class060692) {
        List list = this.N(class012242).N(class072092, class069932);
        class07536.L((List)list, (class06069)class060692);
        class04872.N(list);
        return list;
    }

    public List<class01228> N(class01224 class012242, class07209 class072092, class06993 class069932, boolean bl) {
        ObjectArrayList objectArrayList = this.N(class012242).N(class072092, new class01233().N(class069932), class00869.sh, bl);
        ArrayList arrayList = Lists.newArrayList();
        for (class01228 class012282 : objectArrayList) {
            class07001 class070012 = class012282.L();
            if (class070012 == null || (class08070)class070012.N_15("mode", class08070.field_56673).orElseThrow() != class08070.field_12696) continue;
            arrayList.add(class012282);
        }
        return arrayList;
    }

    private class01207 N(class01224 class012242) {
        return (class01207)this.y.map(arg_0 -> ((class01224)class012242).N(arg_0), Function.identity());
    }

    public class00753 N(class01224 class012242, class06993 class069932) {
        return this.N(class012242).N(class069932);
    }

    public class01233 N(class06993 class069932, class05163 class051632, class02610 class026102, boolean bl) {
        class01233 class012332 = new class01233();
        class012332.N(class051632);
        class012332.N(class069932);
        class012332.y(true);
        class012332.N(false);
        class012332.N((class01219)class05282.y);
        class012332.L(true);
        class012332.N(this.u.orElse(class026102));
        if (!bl) {
            class012332.N((class01219)class05255.y);
        }
        ((class05483)this.L.N()).N().forEach(arg_0 -> ((class01233)class012332).N(arg_0));
        this.M().y().forEach(arg_0 -> ((class01233)class012332).N(arg_0));
        return class012332;
    }

    public boolean N(class01224 class012242, class05974 class059742, class05324 class053242, class08088 class080882, class07209 class072092, class07209 class072093, class06993 class069932, class05163 class051632, class06069 class060692, class02610 class026102, boolean bl) {
        class01233 class012332;
        class01207 class012072 = this.N(class012242);
        if (class012072.N((class01001)class059742, class072092, class072093, class012332 = this.N(class069932, class051632, class026102, bl), class060692, 18)) {
            for (class01228 class012282 : class01207.N((class01001)class059742, (class07209)class072092, (class07209)class072093, (class01233)class012332, this.N(class012242, class072092, class069932, false))) {
                this.N((class07284)class059742, class012282, class072092, class069932, class060692, class051632);
            }
            return true;
        }
        return false;
    }

    public class05163 N(class01224 class012242, class07209 class072092, class06993 class069932) {
        return this.N(class012242).y(new class01233().N(class069932), class072092);
    }

    static void N(List<class01203> list) {
        list.sort(R);
    }
}

