/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class00394
 *  minecraft.class00405
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01164
 *  minecraft.class01194
 *  minecraft.class01235
 *  minecraft.class01929
 *  minecraft.class02362
 *  minecraft.class02484
 *  minecraft.class02666
 *  minecraft.class02694
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class06497
 *  minecraft.class06541
 *  minecraft.class06584
 *  minecraft.class06591
 *  minecraft.class07049
 *  minecraft.class07082
 *  minecraft.class07122
 *  minecraft.class07209
 *  minecraft.class07249
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00405;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01164;
import minecraft.class01194;
import minecraft.class01235;
import minecraft.class01929;
import minecraft.class02204;
import minecraft.class02206;
import minecraft.class02362;
import minecraft.class02484;
import minecraft.class02666;
import minecraft.class02694;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class06497;
import minecraft.class06541;
import minecraft.class06584;
import minecraft.class06591;
import minecraft.class07049;
import minecraft.class07082;
import minecraft.class07122;
import minecraft.class07209;
import minecraft.class07249;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08092;

public final class class02232
extends Record
implements class02694 {
    private final class02204<class02206> song;
    public static final Codec<class02232> N = class02204.N(class04227.yz, class02206.L).xmap(class02232::new, class02232::N);
    public static final class02362<class04247, class02232> y = class02362.N(class02204.N(class04227.yz, class02206.u), class02232::N, class02232::new);

    public class02232(class02204<class02206> class022042) {
        this.song = class022042;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02232.class, "song", "song"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02232.class, "song", "song"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02232.class, "song", "song"}, this);
    }

    public static class07082 N(class07299 class072992, class07209 class072092, class06584 class065842, class08036 class080362) {
        if ((class02232)((Object)class065842.method_58694(class02484.NE)) == null) {
            return class07082.R;
        }
        class00500 class005002 = class072992.method_8320(class072092);
        if (!class005002.N(class00869.iG) || ((Boolean)class005002.L((class08092)class07122.y)).booleanValue()) {
            return class07082.R;
        }
        if (!class072992.method_8608()) {
            class06584 class065843 = class065842.y(1, (class07438)class080362);
            class00394 class003942 = class072992.method_8321(class072092);
            if (class003942 instanceof class07249) {
                ((class07249)class003942).N(class065843);
                class072992.N((class03556)class01194.L, class072092, class01164.N((class07049)class080362, (class00500)class005002));
            }
            class080362.method_7281(class01235.Nm);
        }
        return class07082.N;
    }

    public class02204<class02206> N() {
        return this.song;
    }

    public void N(class06591 class065912, Consumer<class00392> consumer, class06497 class064972, class02666 class026662) {
        class01929 class019292 = class065912.N();
        if (class019292 != null) {
            this.song.N(class019292).ifPresent(class035562 -> {
                class00392 class003922 = class00390.N((class00392)((class02206)((Object)((Object)class035562.N()))).L(), (class00405)class00405.N.N(class06541.field_1080));
                consumer.accept(class003922);
            });
        }
    }
}

