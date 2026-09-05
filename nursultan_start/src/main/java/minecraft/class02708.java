/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04247
 *  minecraft.class06497
 *  minecraft.class06541
 *  minecraft.class06591
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02666;
import minecraft.class02694;
import minecraft.class02717;
import minecraft.class04247;
import minecraft.class06497;
import minecraft.class06541;
import minecraft.class06591;
import org.slf4j.Logger;

public final class class02708
extends Record
implements class02694 {
    final List<class02717> layers;
    static final Logger y = LogUtils.getLogger();
    public static final class02708 L = new class02708(List.of());
    public static final Codec<class02708> u = class02717.N.listOf().xmap(class02708::new, class02708::y);
    public static final class02362<class04247, class02708> i = class02717.y.N_33(class02389.N()).N_10(class02708::new, class02708::y);

    public class02708(List<class02717> list) {
        this.layers = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02708.class, "layers", "layers"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02708.class, "layers", "layers"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02708.class, "layers", "layers"}, this);
    }

    public List<class02717> y() {
        return this.layers;
    }

    public class02708 N() {
        return new class02708(List.copyOf(this.layers.subList(0, this.layers.size() - 1)));
    }

    @Override
    public void N(class06591 class065912, Consumer<class00392> consumer, class06497 class064972, class02666 class026662) {
        for (int i = 0; i < Math.min(this.y().size(), 6); ++i) {
            consumer.accept((class00392)this.y().get(i).N().N(class06541.field_1080));
        }
    }
}

