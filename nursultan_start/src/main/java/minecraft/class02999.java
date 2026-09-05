/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00549
 *  minecraft.class00780
 *  minecraft.class00795
 *  minecraft.class00869
 *  minecraft.class03025
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04330
 *  minecraft.class05474
 *  minecraft.class05946
 *  minecraft.class07209
 *  minecraft.class07361
 *  minecraft.class08050
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.BitSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.LongStream;
import minecraft.class00549;
import minecraft.class00780;
import minecraft.class00795;
import minecraft.class00869;
import minecraft.class03025;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04330;
import minecraft.class05474;
import minecraft.class05946;
import minecraft.class07209;
import minecraft.class07361;
import minecraft.class08050;

public final class class02999 {
    private static final BitSet L = new BitSet(0);
    private static final Codec<BitSet> u = Codec.LONG_STREAM.xmap(longStream -> BitSet.valueOf(longStream.toArray()), bitSet -> LongStream.of(bitSet.toLongArray()));
    private static final Codec<class00549> i = class04206.W.T().comapFlatMap(class005492 -> class005492 == class00549.L ? DataResult.error(() -> "target_status cannot be empty") : DataResult.success((Object)class005492), Function.identity());
    public static final Codec<class02999> N = RecordCodecBuilder.create(instance -> instance.group((App)i.fieldOf("target_status").forGetter(class02999::N), (App)u.lenientOptionalFieldOf("missing_bedrock").forGetter(class029992 -> class029992.B.isEmpty() ? Optional.empty() : Optional.of(class029992.B))).apply(instance, class02999::new));
    private static final Set<class05946<class00780>> R = Set.of(class00795.Ny, class00795.NN, class00795.NL);
    public static final class05474 y = new class03025();
    private final class00549 M;
    private final BitSet B;

    private class02999(class00549 class005492, Optional<BitSet> optional) {
        this.M = class005492;
        this.B = optional.orElse(L);
    }

    public boolean y() {
        return !this.B.isEmpty();
    }

    public void y(class07361 class073612) {
        class05474 class054742 = class073612.w();
        int n = class054742.method_31607();
        int n2 = class054742.method_31600();
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                if (!this.N(i, j)) continue;
                class07209.method_10094((int)i, (int)n, (int)j, (int)i, (int)n2, (int)j).forEach(class072092 -> class073612.N(class072092, class00869.N.W()));
            }
        }
    }

    public static void N(class07361 class073612) {
        int n = 4;
        class07209.method_10094((int)0, (int)0, (int)0, (int)15, (int)4, (int)15).forEach(class072092 -> {
            if (class073612.method_8320(class072092).N(class00869.q)) {
                class073612.N(class072092, class00869.nZ.W());
            }
        });
    }

    public class00549 N() {
        return this.M;
    }

    public boolean N(int n, int n2) {
        return this.B.get((n2 & 0xF) * 16 + (n & 0xF));
    }

    public static class04330 N(class04330 class043302, class08050 class080502) {
        if (!class080502.d()) {
            return class043302;
        }
        Predicate<class05946> predicate = R::contains;
        return (n, n2, n3, class032222) -> {
            class03556 class035562 = class043302.method_38109(n, n2, n3, class032222);
            if (class035562.N(predicate)) {
                return class035562;
            }
            return class080502.method_16359(n, 0, n3);
        };
    }
}

