/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class01929
 *  minecraft.class02204
 *  minecraft.class02362
 *  minecraft.class02666
 *  minecraft.class02694
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class04449
 *  minecraft.class05946
 *  minecraft.class06497
 *  minecraft.class06541
 *  minecraft.class06591
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.function.Consumer;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class01929;
import minecraft.class02204;
import minecraft.class02362;
import minecraft.class02666;
import minecraft.class02694;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class04449;
import minecraft.class05946;
import minecraft.class06497;
import minecraft.class06541;
import minecraft.class06591;

public final class class08582
extends Record
implements class02694 {
    private final class02204<class04449> instrument;
    public static final Codec<class08582> N = class02204.N((class05946)class04227.yZ, (Codec)class04449.L).xmap(class08582::new, class08582::N);
    public static final class02362<class04247, class08582> y = class02204.N((class05946)class04227.yZ, (class02362)class04449.u).N_10(class08582::new, class08582::N);

    public class08582(class02204<class04449> class022042) {
        this.instrument = class022042;
    }

    @Deprecated
    public class08582(class05946<class04449> class059462) {
        this((class02204<class04449>)new class02204(class059462));
    }

    public class08582(class03556<class04449> class035562) {
        this((class02204<class04449>)new class02204(class035562));
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08582.class, "instrument", "instrument"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08582.class, "instrument", "instrument"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08582.class, "instrument", "instrument"}, this);
    }

    public Optional<class03556<class04449>> N(class01929 class019292) {
        return this.instrument.N(class019292);
    }

    public class02204<class04449> N() {
        return this.instrument;
    }

    public void N(class06591 class065912, Consumer<class00392> consumer, class06497 class064972, class02666 class026662) {
        class01929 class019292 = class065912.N();
        if (class019292 == null) {
            return;
        }
        this.N(class019292).ifPresent(class035562 -> {
            class00392 class003922 = class00390.N((class00392)((class04449)class035562.N()).u(), (class00405)class00405.N.N(class06541.field_1080));
            consumer.accept(class003922);
        });
    }
}

