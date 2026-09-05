/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00394
 *  minecraft.class00453
 *  minecraft.class02477
 *  minecraft.class02480
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class05908
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06584
 *  minecraft.class06841
 *  minecraft.class07049
 *  minecraft.class07439
 *  minecraft.class07491
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import minecraft.class00394;
import minecraft.class00453;
import minecraft.class02477;
import minecraft.class02480;
import minecraft.class02666;
import minecraft.class02684;
import minecraft.class02695;
import minecraft.class02711;
import minecraft.class02712;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class05908;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06584;
import minecraft.class06841;
import minecraft.class07049;
import minecraft.class07439;
import minecraft.class07491;
import minecraft.class07536;

public class class02683
extends class00453 {
    private static final Codec<class06841<class02666>> y = class06841.N(class068502 -> class068502.N(class02712::new).y(class02711::new).L(class02712::new));
    public static final MapCodec<class02683> N = RecordCodecBuilder.mapCodec(instance -> class02683.N(instance).and(instance.group((App)y.fieldOf("source").forGetter(class026832 -> class026832.L), (App)class02477.N.listOf().optionalFieldOf("include").forGetter(class026832 -> class026832.u), (App)class02477.N.listOf().optionalFieldOf("exclude").forGetter(class026832 -> class026832.i))).apply(instance, class02683::new));
    private final class06841<class02666> L;
    private final Optional<List<class02477<?>>> u;
    private final Optional<List<class02477<?>>> i;
    private final Predicate<class02477<?>> R;

    class02683(List<class05957> list, class06841<class02666> class068412, Optional<List<class02477<?>>> optional, Optional<List<class02477<?>>> optional2) {
        super(list);
        this.L = class068412;
        this.u = optional.map(List::copyOf);
        this.i = optional2.map(List::copyOf);
        ArrayList arrayList = new ArrayList(2);
        optional2.ifPresent(list2 -> arrayList.add(class024772 -> !list2.contains(class024772)));
        optional.ifPresent(list2 -> arrayList.add(list2::contains));
        this.R = class07536.N(arrayList);
    }

    public Set<class07491<?>> y() {
        return Set.of(this.L.N());
    }

    public static class02684 y(class07491<? extends class00394> class074912) {
        return new class02684((class06841<class02666>)new class02711(class074912));
    }

    public class05959<class02683> N() {
        return class07439.K;
    }

    public class06584 N(class06584 class065842, class05908 class059082) {
        class02666 class026662 = (class02666)this.L.N(class059082);
        if (class026662 != null) {
            if (class026662 instanceof class02695) {
                class02695 class026952 = (class02695)class026662;
                class065842.y(class026952.N(this.R));
            } else {
                Collection collection = this.i.orElse(List.of());
                this.u.map(Collection::stream).orElse(class04206.NW.z().map(class03556::N)).forEach(class024772 -> {
                    if (collection.contains(class024772)) {
                        return;
                    }
                    class02480 class024802 = class026662.u(class024772);
                    if (class024802 != null) {
                        class065842.N(class024802);
                    }
                });
            }
        }
        return class065842;
    }

    public static class02684 N(class07491<? extends class07049> class074912) {
        return new class02684((class06841<class02666>)new class02712<class07049>(class074912));
    }
}

