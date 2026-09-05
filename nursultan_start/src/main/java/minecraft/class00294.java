/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class02362
 *  minecraft.class02755
 *  minecraft.class04247
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import minecraft.class00282;
import minecraft.class00287;
import minecraft.class00299;
import minecraft.class00308;
import minecraft.class00311;
import minecraft.class00319;
import minecraft.class02362;
import minecraft.class02755;
import minecraft.class04247;

public class class00294
implements class00299 {
    public static final class00294 L = new class00294();
    public static final MapCodec<class00294> u = MapCodec.unit((Object)L);
    public static final class02362<class04247, class00294> i = class02362.N((Object)L);
    public static final class00319<class00294> R = new class00319<class00294>(u, i);

    private class00294() {
    }

    public String toString() {
        return "<any fuel>";
    }

    @Override
    public <T> Stream<T> N(class00311 class003112, class00308<T> class003082) {
        if (class003082 instanceof class00287) {
            class00287 class002872 = (class00287)class003082;
            class02755 class027552 = class003112.L(class00282.N);
            if (class027552 != null) {
                return class027552.N().stream().map(class002872::N);
            }
        }
        return Stream.empty();
    }

    public class00319<class00294> N() {
        return R;
    }
}

