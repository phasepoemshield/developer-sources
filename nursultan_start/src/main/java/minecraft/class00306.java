/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01474
 *  minecraft.class03193
 *  minecraft.class03238
 *  minecraft.class04227
 *  minecraft.class05894
 *  minecraft.class05930
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07536
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import minecraft.class00288;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01474;
import minecraft.class03193;
import minecraft.class03238;
import minecraft.class04227;
import minecraft.class05894;
import minecraft.class05930;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07536;
import minecraft.class08092;

public class class00306
extends class01474 {
    public static final MapCodec<class00306> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("leaves_probability").forGetter(class003062 -> Float.valueOf(class003062.L)), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("trunk_probability").forGetter(class003062 -> Float.valueOf(class003062.u)), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("ground_probability").forGetter(class003062 -> Float.valueOf(class003062.i))).apply(instance, class00306::new));
    private final float L;
    private final float u;
    private final float i;

    public class00306(float f, float f2, float f3) {
        this.L = f;
        this.u = f2;
        this.i = f3;
    }

    protected class05930<?> N() {
        return class05930.L;
    }

    public void N(class05894 class058942) {
        class06069 class060692 = class058942.y();
        class05974 class059742 = (class05974)class058942.N();
        List var4 = class07536.N((ObjectArrayList)class058942.L(), (class06069)class060692);
        if (var4.isEmpty()) {
            return;
        }
        class07209 class072093 = Collections.min(var4, Comparator.comparingInt(class00753::method_10264));
        if (class060692.z() < this.i) {
            class059742.method_30349().method_46759(class04227.Nh).flatMap(class007512 -> class007512.N(class03193.H)).ifPresent(class035292 -> ((class03238)class035292.N()).N(class059742, class059742.method_8410().method_14178().U(), class060692, class072093.method_10084()));
        }
        class058942.L().forEach(class072092 -> {
            class07209 class072093;
            if (class060692.z() < this.u && class058942.N(class072093 = class072092.method_10074())) {
                class00306.N(class072093, class058942);
            }
        });
        class058942.u().forEach(class072092 -> {
            class07209 class072093;
            if (class060692.z() < this.L && class058942.N(class072093 = class072092.method_10074())) {
                class00306.N(class072093, class058942);
            }
        });
    }

    private static void N(class07209 class072092, class05894 class058942) {
        while (class058942.N(class072092.method_10074()) && !((double)class058942.y().z() < 0.5)) {
            class058942.N(class072092, (class00500)class00869.nS.W().y((class08092)class00288.y, (Comparable)Boolean.valueOf(false)));
            class072092 = class072092.method_10074();
        }
        class058942.N(class072092, (class00500)class00869.nS.W().y((class08092)class00288.y, (Comparable)Boolean.valueOf(true)));
    }
}

