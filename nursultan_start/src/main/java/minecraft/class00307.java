/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class02362
 *  minecraft.class04247
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import minecraft.class00299;
import minecraft.class00308;
import minecraft.class00311;
import minecraft.class00319;
import minecraft.class02362;
import minecraft.class04247;

public class class00307
implements class00299 {
    public static final class00307 L = new class00307();
    public static final MapCodec<class00307> u = MapCodec.unit((Object)L);
    public static final class02362<class04247, class00307> i = class02362.N((Object)L);
    public static final class00319<class00307> R = new class00319<class00307>(u, i);

    private class00307() {
    }

    public String toString() {
        return "<empty>";
    }

    @Override
    public <T> Stream<T> N(class00311 class003112, class00308<T> class003082) {
        return Stream.empty();
    }

    public class00319<class00307> N() {
        return R;
    }
}

