/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01034
 *  minecraft.class01281
 *  minecraft.class03238
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07529
 *  minecraft.class08088
 *  org.apache.commons.lang3.mutable.MutableBoolean
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class01034;
import minecraft.class01281;
import minecraft.class03238;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04297;
import minecraft.class04320;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07529;
import minecraft.class08088;
import org.apache.commons.lang3.mutable.MutableBoolean;

public final class class04336
extends Record {
    private final class03556<class03238<?, ?>> feature;
    private final List<class04297> placement;
    public static final Codec<class04336> N = RecordCodecBuilder.create(instance -> instance.group((App)class03238.y.fieldOf("feature").forGetter(class043362 -> class043362.feature), (App)class04297.y.listOf().fieldOf("placement").forGetter(class043362 -> class043362.placement)).apply(instance, class04336::new));
    public static final Codec<class03556<class04336>> y = class01281.N(class04227.ys, N);
    public static final Codec<class03543<class04336>> L = class03541.N(class04227.ys, N);
    public static final Codec<List<class03543<class04336>>> u = class03541.N(class04227.ys, N, (boolean)true).listOf();

    public List<class04297> L() {
        return this.placement;
    }

    public class04336(class03556<class03238<?, ?>> class035562, List<class04297> list) {
        this.feature = class035562;
        this.placement = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04336.class, "feature;placement", "feature", "placement"}, this, object);
    }

    public String toString() {
        return "Placed " + String.valueOf(this.feature);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04336.class, "feature;placement", "feature", "placement"}, this);
    }

    public boolean y(class05974 class059742, class08088 class080882, class06069 class060692, class07209 class072092) {
        return this.N(new class01034(class059742, class080882, Optional.of(this)), class060692, class072092);
    }

    public class03556<class03238<?, ?>> y() {
        return this.feature;
    }

    private boolean N(class01034 class010342, class06069 class060692, class07209 class072093) {
        class04297 class0429722;
        Stream<Object> stream = Stream.of(class072093);
        for (class04297 class0429722 : this.placement) {
            stream = stream.flatMap(class072092 -> class0429722.N(class010342, class060692, (class07209)class072092));
        }
        class03238 class032382 = (class03238)this.feature.N();
        class0429722 = new MutableBoolean();
        stream.forEach(arg_0 -> class04336.N(class032382, class010342, class060692, (MutableBoolean)class0429722, arg_0));
        return class0429722.isTrue();
    }

    public Stream<class03238<?, ?>> N() {
        return ((class03238)this.feature.N()).N();
    }

    public boolean N(class05974 class059742, class08088 class080882, class06069 class060692, class07209 class072092) {
        return this.N(new class01034(class059742, class080882, Optional.empty()), class060692, class072092);
    }

    private static /* synthetic */ void N(class03238 class032382, class01034 class010342, class06069 class060692, MutableBoolean mutableBoolean, class07209 class072092) {
        if (class032382.N(class010342.y(), class010342.u(), class060692, class072092)) {
            mutableBoolean.setTrue();
            if (class07529.Na) {
                class04320.N(class010342.y().method_8410(), class032382, class010342.L());
            }
        }
    }
}

