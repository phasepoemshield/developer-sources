/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10329
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class03328
 *  minecraft.class03366
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class03599
 *  minecraft.class03942
 *  minecraft.class04206
 *  minecraft.class05908
 *  minecraft.class05950
 *  minecraft.class05957
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class08122
 */
package minecraft;

import Nursultan.class10329;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Consumer;
import minecraft.class03328;
import minecraft.class03366;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class03599;
import minecraft.class03942;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class05908;
import minecraft.class05950;
import minecraft.class05957;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class08122;

public class class04289
extends class03328 {
    public static final MapCodec<class04289> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03530.N(class04227.F).fieldOf("name").forGetter(class042892 -> class042892.u), (App)Codec.BOOL.fieldOf("expand").forGetter(class042892 -> class042892.E)).and(class04289.y(instance)).apply(instance, class04289::new));
    private final class03530<class06581> u;
    private final boolean E;

    private class04289(class03530<class06581> class035302, boolean bl, int n, int n2, List<class05957> list, List<class08122> list2) {
        super(n, n2, list, list2);
        this.u = class035302;
        this.E = bl;
    }

    public boolean expand(class05908 class059082, Consumer<class03599> consumer) {
        if (this.E) {
            return this.N(class059082, consumer);
        }
        return super.expand(class059082, consumer);
    }

    public static class03366<?> y(class03530<class06581> class035302) {
        return class04289.N((n, n2, list, list2) -> new class04289(class035302, true, n, n2, list, list2));
    }

    public class05950 N() {
        return class03942.R;
    }

    public static class03366<?> N(class03530<class06581> class035302) {
        return class04289.N((n, n2, list, list2) -> new class04289(class035302, false, n, n2, list, list2));
    }

    public void N(Consumer<class06584> consumer, class05908 class059082) {
        class04206.B.u(this.u).forEach(class035562 -> consumer.accept(new class06584(class035562)));
    }

    private boolean N(class05908 class059082, Consumer<class03599> consumer) {
        if (this.N(class059082)) {
            for (class03556 class035562 : class04206.B.u(this.u)) {
                consumer.accept((class03599)new class10329(this, class035562));
            }
            return true;
        }
        return false;
    }
}

