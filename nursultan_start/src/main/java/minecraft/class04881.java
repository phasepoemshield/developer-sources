/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00753
 *  minecraft.class01203
 *  minecraft.class01224
 *  minecraft.class02610
 *  minecraft.class05163
 *  minecraft.class05246
 *  minecraft.class05248
 *  minecraft.class05267
 *  minecraft.class05324
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06993
 *  minecraft.class07209
 *  minecraft.class08088
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import minecraft.class00753;
import minecraft.class01203;
import minecraft.class01224;
import minecraft.class02610;
import minecraft.class04869;
import minecraft.class05163;
import minecraft.class05246;
import minecraft.class05248;
import minecraft.class05267;
import minecraft.class05324;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06993;
import minecraft.class07209;
import minecraft.class08088;

public class class04881
extends class05248 {
    public static final MapCodec<class04881> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class05248.i.listOf().fieldOf("elements").forGetter(class048812 -> class048812.y), (App)class04881.R()).apply(instance, class04881::new));
    private final List<class05248> y;

    public class04881(List<class05248> list, class05246 class052462) {
        super(class052462);
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Elements are empty");
        }
        this.y = list;
        this.y(class052462);
    }

    public String toString() {
        return "List[" + this.y.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
    }

    public List<class05248> y() {
        return this.y;
    }

    private void y(class05246 class052462) {
        this.y.forEach(class052482 -> class052482.N(class052462));
    }

    public class00753 N(class01224 class012242, class06993 class069932) {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        Iterator<class05248> iterator = this.y.iterator();
        while (iterator.hasNext()) {
            class00753 class007532 = iterator.next().N(class012242, class069932);
            n = Math.max(n, class007532.method_10263());
            n2 = Math.max(n2, class007532.method_10264());
            n3 = Math.max(n3, class007532.method_10260());
        }
        return new class00753(n, n2, n3);
    }

    public class05163 N(class01224 class012242, class07209 class072092, class06993 class069932) {
        return (class05163)class05163.y(this.y.stream().filter(class052482 -> class052482 != class04869.y).map(class052482 -> class052482.N(class012242, class072092, class069932))::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox for ListPoolElement"));
    }

    public boolean N(class01224 class012242, class05974 class059742, class05324 class053242, class08088 class080882, class07209 class072092, class07209 class072093, class06993 class069932, class05163 class051632, class06069 class060692, class02610 class026102, boolean bl) {
        Iterator<class05248> iterator = this.y.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().N(class012242, class059742, class053242, class080882, class072092, class072093, class069932, class051632, class060692, class026102, bl)) continue;
            return false;
        }
        return true;
    }

    public class05267<?> N() {
        return class05267.y;
    }

    public class05248 N(class05246 class052462) {
        super.N(class052462);
        this.y(class052462);
        return this;
    }

    public List<class01203> N(class01224 class012242, class07209 class072092, class06993 class069932, class06069 class060692) {
        return this.y.get(0).N(class012242, class072092, class069932, class060692);
    }
}

