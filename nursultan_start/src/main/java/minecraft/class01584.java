/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class00780
 *  minecraft.class00795
 *  minecraft.class00869
 *  minecraft.class01029
 *  minecraft.class02055
 *  minecraft.class03159
 *  minecraft.class03170
 *  minecraft.class03519
 *  minecraft.class03522
 *  minecraft.class03529
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04297
 *  minecraft.class04336
 *  minecraft.class04409
 *  minecraft.class04412
 *  minecraft.class05448
 *  minecraft.class05718
 *  minecraft.class05946
 *  minecraft.class06386
 *  minecraft.class06391
 *  minecraft.class07376
 *  minecraft.class07830
 *  minecraft.class07852
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Lists;
import com.mojang.datafixers.kinds.App;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import minecraft.class00500;
import minecraft.class00780;
import minecraft.class00795;
import minecraft.class00869;
import minecraft.class01029;
import minecraft.class01627;
import minecraft.class02055;
import minecraft.class03159;
import minecraft.class03170;
import minecraft.class03519;
import minecraft.class03522;
import minecraft.class03529;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04297;
import minecraft.class04336;
import minecraft.class04409;
import minecraft.class04412;
import minecraft.class05448;
import minecraft.class05718;
import minecraft.class05946;
import minecraft.class06386;
import minecraft.class06391;
import minecraft.class07376;
import minecraft.class07830;
import minecraft.class07852;
import org.slf4j.Logger;

public class class01584 {
    private static final Logger y = LogUtils.getLogger();
    public static final Codec<class01584> N = RecordCodecBuilder.create(instance -> instance.group((App)class03541.N((class05946)class04227.yb).lenientOptionalFieldOf("structure_overrides").forGetter(class015842 -> class015842.L), (App)class01627.N.listOf().fieldOf("layers").forGetter(class01584::i), (App)Codec.BOOL.fieldOf("lakes").orElse((Object)false).forGetter(class015842 -> class015842.Z), (App)Codec.BOOL.fieldOf("features").orElse((Object)false).forGetter(class015842 -> class015842.B), (App)class00780.L.lenientOptionalFieldOf("biome").orElseGet(Optional::empty).forGetter(class015842 -> Optional.of(class015842.i)), (App)class03519.u((class05946)class00795.y), (App)class03519.u((class05946)class03159.M), (App)class03519.u((class05946)class03159.B)).apply(instance, class01584::new)).comapFlatMap(class01584::N, Function.identity()).stable();
    private final Optional<class03543<class04412>> L;
    private final List<class01627> u = Lists.newArrayList();
    private final class03556<class00780> i;
    private final List<class00500> R;
    private boolean M;
    private boolean B;
    private boolean Z;
    private final List<class03556<class04336>> z;

    public Optional<class03543<class04412>> L() {
        return this.L;
    }

    public void M() {
        this.R.clear();
        for (class01627 class016272 : this.u) {
            for (int i = 0; i < class016272.N(); ++i) {
                this.R.add(class016272.y());
            }
        }
        this.M = this.R.stream().allMatch(class005002 -> class005002.N(class00869.N));
    }

    private class01584(Optional<class03543<class04412>> optional, List<class01627> list, boolean bl, boolean bl2, Optional<class03556<class00780>> optional2, class03529<class00780> class035292, class03556<class04336> class035562, class03556<class04336> class035563) {
        this(optional, class01584.N(optional2, class035292), List.of(class035562, class035563));
        if (bl) {
            this.y();
        }
        if (bl2) {
            this.N();
        }
        this.u.addAll(list);
        this.M();
    }

    public class01584(Optional<class03543<class04412>> optional, class03556<class00780> class035562, List<class03556<class04336>> list) {
        this.L = optional;
        this.i = class035562;
        this.R = Lists.newArrayList();
        this.z = list;
    }

    public List<class01627> i() {
        return this.u;
    }

    public class03556<class00780> u() {
        return this.i;
    }

    public static List<class03556<class04336>> y(class02055<class04336> class020552) {
        return List.of(class020552.y(class03159.M), class020552.y(class03159.B));
    }

    public void y() {
        this.Z = true;
    }

    private static class03556<class00780> N(Optional<? extends class03556<class00780>> optional, class03556<class00780> class035562) {
        if (optional.isEmpty()) {
            y.error("Unknown biome, defaulting to plains");
            return class035562;
        }
        return optional.get();
    }

    public void N() {
        this.B = true;
    }

    public class01029 N(class03556<class00780> class035562) {
        class00500 class005002;
        int n;
        boolean bl;
        if (!class035562.equals(this.i)) {
            return ((class00780)class035562.N()).L();
        }
        class01029 class010292 = ((class00780)this.u().N()).L();
        class05448 class054482 = new class05448();
        if (this.Z) {
            for (class03556<class04336> object2 : this.z) {
                class054482.N(class07852.field_25186, object2);
            }
        }
        boolean bl2 = bl = (!this.M || class035562.N(class00795.N)) && this.B;
        if (bl) {
            List list = class010292.L();
            for (n = 0; n < list.size(); ++n) {
                if (n == class07852.field_13172.ordinal() || n == class07852.field_13173.ordinal() || this.Z && n == class07852.field_25186.ordinal()) continue;
                class005002 = (class03543)list.get(n);
                for (class03556 class035563 : class005002) {
                    class054482.N(n, class035563);
                }
            }
        }
        List<class00500> list = this.R();
        for (n = 0; n < list.size(); ++n) {
            class005002 = list.get(n);
            if (class07830.field_13197.u().test(class005002)) continue;
            list.set(n, null);
            class054482.N(class07852.field_13179, class03170.N((class06391)class06391.r, (class06386)new class05718(n, class005002), (class04297[])new class04297[0]));
        }
        return class054482.N();
    }

    private static DataResult<class01584> N(class01584 class015842) {
        if (class015842.u.stream().mapToInt(class01627::N).sum() > class07376.L) {
            return DataResult.error(() -> "Sum of layer heights is > " + class07376.L, (Object)class015842);
        }
        return DataResult.success((Object)class015842);
    }

    public static class03556<class00780> N(class02055<class00780> class020552) {
        return class020552.y(class00795.y);
    }

    public static class01584 N(class02055<class00780> class020552, class02055<class04412> class020553, class02055<class04336> class020554) {
        class03522 class035222 = class03543.N((class03556[])new class03556[]{class020553.y(class04409.b), class020553.y(class04409.N)});
        class01584 class015842 = new class01584(Optional.of(class035222), class01584.N(class020552), class01584.y(class020554));
        class015842.i().add(new class01627(1, class00869.q));
        class015842.i().add(new class01627(2, class00869.z));
        class015842.i().add(new class01627(1, class00869.Z));
        class015842.M();
        return class015842;
    }

    public class01584 N(List<class01627> list, Optional<class03543<class04412>> optional, class03556<class00780> class035562) {
        class01584 class015842 = new class01584(optional, class035562, this.z);
        for (class01627 class016272 : list) {
            class015842.u.add(new class01627(class016272.N(), class016272.y().i()));
            class015842.M();
        }
        if (this.B) {
            class015842.N();
        }
        if (this.Z) {
            class015842.y();
        }
        return class015842;
    }

    public List<class00500> R() {
        return this.R;
    }
}

