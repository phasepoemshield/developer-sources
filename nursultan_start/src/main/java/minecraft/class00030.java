/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00015
 *  minecraft.class00453
 *  minecraft.class00737
 *  minecraft.class00831
 *  minecraft.class02195
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04398
 *  minecraft.class04748
 *  minecraft.class04782
 *  minecraft.class05908
 *  minecraft.class05946
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06548
 *  minecraft.class06551
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07439
 *  minecraft.class07491
 *  minecraft.class07769
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;
import minecraft.class00015;
import minecraft.class00453;
import minecraft.class00737;
import minecraft.class00831;
import minecraft.class02195;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04398;
import minecraft.class04748;
import minecraft.class04782;
import minecraft.class05908;
import minecraft.class05946;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06548;
import minecraft.class06551;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07439;
import minecraft.class07491;
import minecraft.class07769;

public class class00030
extends class00453 {
    public static final class03530<class04748> N = class04398.E;
    public static final class03556<class02195> y = class00831.Z;
    public static final byte L = 2;
    public static final int u = 50;
    public static final boolean i = true;
    public static final MapCodec<class00030> R = RecordCodecBuilder.mapCodec(instance -> class00030.N(instance).and(instance.group((App)class03530.N((class05946)class04227.yj).optionalFieldOf("destination", N).forGetter(class000302 -> class000302.B), (App)class02195.y.optionalFieldOf("decoration", y).forGetter(class000302 -> class000302.Z), (App)Codec.BYTE.optionalFieldOf("zoom", (Object)2).forGetter(class000302 -> class000302.z), (App)Codec.INT.optionalFieldOf("search_radius", (Object)50).forGetter(class000302 -> class000302.U), (App)Codec.BOOL.optionalFieldOf("skip_existing_chunks", (Object)true).forGetter(class000302 -> class000302.E))).apply(instance, class00030::new));
    private final class03530<class04748> B;
    private final class03556<class02195> Z;
    private final byte z;
    private final int U;
    private final boolean E;

    public static class00015 L() {
        return new class00015();
    }

    class00030(List<class05957> list, class03530<class04748> class035302, class03556<class02195> class035562, byte by, int n, boolean bl) {
        super(list);
        this.B = class035302;
        this.Z = class035562;
        this.z = by;
        this.U = n;
        this.E = bl;
    }

    public Set<class07491<?>> y() {
        return Set.of(class06551.B);
    }

    public class05959<class00030> N() {
        return class07439.T;
    }

    public class06584 N(class06584 class065842, class05908 class059082) {
        class04782 class047822;
        class07209 class072092;
        if (!class065842.N(class06570.Gt)) {
            return class065842;
        }
        class06889 class068892 = (class06889)class059082.L(class06551.B);
        if (class068892 != null && (class072092 = (class047822 = class059082.u()).method_8487(this.B, class07209.method_49638((class00737)class068892), this.U, this.E)) != null) {
            class06584 class065843 = class06548.N((class04782)class047822, (int)class072092.method_10263(), (int)class072092.method_10260(), (byte)this.z, (boolean)true, (boolean)true);
            class06548.N((class04782)class047822, (class06584)class065843);
            class07769.N((class06584)class065843, (class07209)class072092, (String)"+", this.Z);
            return class065843;
        }
        return class065842;
    }
}

