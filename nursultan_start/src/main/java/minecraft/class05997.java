/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00765
 *  minecraft.class00780
 *  minecraft.class01146
 *  minecraft.class01835
 *  minecraft.class03216
 *  minecraft.class03221
 *  minecraft.class03222
 *  minecraft.class03231
 *  minecraft.class03556
 *  minecraft.class03573
 *  minecraft.class03882
 *  minecraft.class07209
 *  net.fabricmc.fabric.impl.biome.BiomeSourceAccess
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class00765;
import minecraft.class00780;
import minecraft.class01146;
import minecraft.class01835;
import minecraft.class03216;
import minecraft.class03221;
import minecraft.class03222;
import minecraft.class03231;
import minecraft.class03556;
import minecraft.class03573;
import minecraft.class03882;
import minecraft.class05946;
import minecraft.class07209;
import net.fabricmc.fabric.impl.biome.BiomeSourceAccess;

public class class05997
extends class00765
implements BiomeSourceAccess {
    private static final MapCodec<class03556<class00780>> u = class00780.L.fieldOf("biome");
    public static final MapCodec<class03221<class03556<class00780>>> y = class03221.N(u).fieldOf("biomes");
    private static final MapCodec<class03556<class03573>> i = class03573.y.fieldOf("preset").withLifecycle(Lifecycle.stable());
    public static final MapCodec<class05997> L = Codec.mapEither(y, i).xmap(class05997::new, class059972 -> class059972.R);
    private final Either<class03221<class03556<class00780>>, class03556<class03573>> R;
    private boolean M = true;

    private class05997(Either<class03221<class03556<class00780>>, class03556<class03573>> either) {
        this.R = either;
    }

    private class03221<class03556<class00780>> u() {
        return (class03221)this.R.map(class032212 -> class032212, class035562 -> ((class03573)class035562.N()).N());
    }

    protected Stream<class03556<class00780>> y() {
        return this.u().N().stream().map(Pair::getSecond);
    }

    public class03556<class00780> N(class03231 class032312) {
        return (class03556)this.u().N(class032312);
    }

    public void N(List<String> list, class07209 class072092, class03222 class032222) {
        int n = class01146.N((int)class072092.method_10263());
        int n2 = class01146.N((int)class072092.method_10264());
        int n3 = class01146.N((int)class072092.method_10260());
        class03231 class032312 = class032222.N(n, n2, n3);
        float f = class03216.N((long)class032312.u());
        float f2 = class03216.N((long)class032312.i());
        float f3 = class03216.N((long)class032312.y());
        float f4 = class03216.N((long)class032312.L());
        double d = class03882.N((float)class03216.N((long)class032312.M()));
        class01835 class018352 = new class01835();
        list.add("Biome builder PV: " + class01835.N((double)d) + " C: " + class018352.y((double)f) + " E: " + class018352.L((double)f2) + " T: " + class018352.u((double)f3) + " H: " + class018352.i((double)f4));
    }

    public static class05997 N(class03221<class03556<class00780>> class032212) {
        return new class05997((Either<class03221<class03556<class00780>>, class03556<class03573>>)Either.left(class032212));
    }

    protected MapCodec<? extends class00765> N() {
        return L;
    }

    public boolean N(class05946<class03573> class059462) {
        Optional var2 = this.R.right();
        return var2.isPresent() && ((class03556)var2.get()).N(class059462);
    }

    public static class05997 N(class03556<class03573> class035562) {
        return new class05997((Either<class03221<class03556<class00780>>, class03556<class03573>>)Either.right(class035562));
    }

    public class03556<class00780> method_38109(int n, int n2, int n3, class03222 class032222) {
        return this.N(class032222.N(n, n2, n3));
    }

    public void fabric_setModifyBiomeEntries(boolean bl) {
        this.M = bl;
    }

    public boolean fabric_shouldModifyBiomeEntries() {
        return this.M;
    }
}

