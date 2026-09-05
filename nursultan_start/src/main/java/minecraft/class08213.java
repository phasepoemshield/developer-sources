/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02666
 *  minecraft.class02694
 *  minecraft.class04247
 *  minecraft.class06338
 *  minecraft.class06497
 *  minecraft.class06517
 *  minecraft.class06584
 *  minecraft.class06591
 *  minecraft.class07047
 *  minecraft.class07055
 *  minecraft.class07299
 *  minecraft.class07438
 */
package minecraft;

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
import minecraft.class04247;
import minecraft.class06338;
import minecraft.class06497;
import minecraft.class06517;
import minecraft.class06584;
import minecraft.class06591;
import minecraft.class07047;
import minecraft.class07055;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08209;
import minecraft.class08237;

public final class class08213
extends Record
implements class02694,
class08237 {
    private final int value;
    public static final int N = 120000;
    public static final int y = 0;
    public static final int L = 4;
    public static final Codec<class08213> u = class06338.N((int)0, (int)4).xmap(class08213::new, class08213::N);
    public static final class02362<class04247, class08213> i = class02362.N((class02362)class02389.B, class08213::N, class08213::new);

    public class08213(int n) {
        this.value = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08213.class, "value", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08213.class, "value", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08213.class, "value", "value"}, this);
    }

    @Override
    public void N(class07299 class072992, class07438 class074382, class06584 class065842, class08209 class082092) {
        class074382.method_6092(new class07055(class07047.g, 120000, this.value, false, false, true));
    }

    public int N() {
        return this.value;
    }

    public void N(class06591 class065912, Consumer<class00392> consumer, class06497 class064972, class02666 class026662) {
        class06517.N(List.of(new class07055(class07047.g, 120000, this.value, false, false, true)), consumer, (float)1.0f, (float)class065912.y());
    }
}

