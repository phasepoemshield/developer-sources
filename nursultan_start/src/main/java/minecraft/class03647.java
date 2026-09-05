/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Products$P3
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 *  minecraft.class00500
 *  minecraft.class01231
 *  minecraft.class01339
 *  minecraft.class01471
 *  minecraft.class01476
 *  minecraft.class02142
 *  minecraft.class03194
 *  minecraft.class03619
 *  minecraft.class04206
 *  minecraft.class04887
 *  minecraft.class06069
 *  minecraft.class06665
 *  minecraft.class07209
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.BiConsumer;
import minecraft.class00500;
import minecraft.class01231;
import minecraft.class01339;
import minecraft.class01471;
import minecraft.class01476;
import minecraft.class02142;
import minecraft.class03194;
import minecraft.class03619;
import minecraft.class03628;
import minecraft.class04206;
import minecraft.class04887;
import minecraft.class06069;
import minecraft.class06665;
import minecraft.class07209;
import minecraft.class08092;

public abstract class class03647 {
    public static final Codec<class03647> u = class04206.x.T().dispatch(class03647::N, class03619::N);
    protected final class02142 i;
    protected final class01471 R;
    protected final Optional<class03628> M;

    public class03647(class02142 class021422, class01471 class014712, Optional<class03628> optional) {
        this.i = class021422;
        this.R = class014712;
        this.M = optional;
    }

    public class07209 N(class07209 class072092, class06069 class060692) {
        return class072092.method_10086(this.i.N(class060692));
    }

    protected static <P extends class03647> Products.P3<RecordCodecBuilder.Mu<P>, class02142, class01471, Optional<class03628>> N(RecordCodecBuilder.Instance<P> instance) {
        return instance.group((App)class02142.L.fieldOf("trunk_offset_y").forGetter(class036472 -> class036472.i), (App)class01471.N.fieldOf("root_provider").forGetter(class036472 -> class036472.R), (App)class03628.N.optionalFieldOf("above_root_placement").forGetter(class036472 -> class036472.M));
    }

    protected abstract class03619<?> N();

    public abstract boolean N(class04887 var1, BiConsumer<class07209, class00500> var2, class06069 var3, class07209 var4, class07209 var5, class01476 var6);

    public boolean N(class04887 class048872, class07209 class072092) {
        return class03194.L((class04887)class048872, (class07209)class072092);
    }

    public void N(class04887 class048872, BiConsumer<class07209, class00500> biConsumer, class06069 class060692, class07209 class072092, class01476 class014762) {
        if (!this.N(class048872, class072092)) {
            return;
        }
        biConsumer.accept(class072092, this.N(class048872, class072092, this.R.N(class060692, class072092)));
        if (this.M.isPresent()) {
            class03628 class036282 = this.M.get();
            class07209 class072093 = class072092.method_10084();
            if (class060692.z() < class036282.y() && class048872.method_16358(class072093, class01339::P)) {
                biConsumer.accept(class072093, this.N(class048872, class072093, class036282.N().N(class060692, class072093)));
            }
        }
    }

    protected class00500 N(class04887 class048872, class07209 class072092, class00500 class005002) {
        if (class005002.y((class08092)class06665.q)) {
            boolean bl = class048872.method_35237(class072092, class046882 -> class046882.N(class01231.N));
            return (class00500)class005002.y((class08092)class06665.q, (Comparable)Boolean.valueOf(bl));
        }
        return class005002;
    }
}

