/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.MatchException
 *  minecraft.class01894
 *  minecraft.class02216
 *  minecraft.class02610
 *  minecraft.class03098
 *  minecraft.class03129
 *  minecraft.class03556
 *  minecraft.class03855
 *  minecraft.class04367
 *  minecraft.class04748
 *  minecraft.class04758
 *  minecraft.class04764
 *  minecraft.class04780
 *  minecraft.class04848
 *  minecraft.class05281
 *  minecraft.class06057
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class07830
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import minecraft.class01031;
import minecraft.class01894;
import minecraft.class02216;
import minecraft.class02610;
import minecraft.class03098;
import minecraft.class03129;
import minecraft.class03556;
import minecraft.class03855;
import minecraft.class04367;
import minecraft.class04748;
import minecraft.class04758;
import minecraft.class04764;
import minecraft.class04780;
import minecraft.class04848;
import minecraft.class05281;
import minecraft.class06057;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class07830;

public final class class01017
extends class04748 {
    public static final class02216 N = class02216.y;
    public static final class02610 y = class02610.field_52238;
    public static final int R = 128;
    public static final int M = 0;
    public static final int B = 20;
    public static final MapCodec<class01017> Z = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01017.N(instance), (App)class05281.y.fieldOf("start_pool").forGetter(class010172 -> class010172.z), (App)class01894.N.optionalFieldOf("start_jigsaw_name").forGetter(class010172 -> class010172.U), (App)Codec.intRange((int)0, (int)20).fieldOf("size").forGetter(class010172 -> class010172.E), (App)class03855.L.fieldOf("start_height").forGetter(class010172 -> class010172.W), (App)Codec.BOOL.fieldOf("use_expansion_hack").forGetter(class010172 -> class010172.m), (App)class07830.field_24772.optionalFieldOf("project_start_to_heightmap").forGetter(class010172 -> class010172.P), (App)class01031.N.fieldOf("max_distance_from_center").forGetter(class010172 -> class010172.s), (App)Codec.list((Codec)class03129.y).optionalFieldOf("pool_aliases", List.of()).forGetter(class010172 -> class010172.T), (App)class02216.N.optionalFieldOf("dimension_padding", (Object)N).forGetter(class010172 -> class010172.b), (App)class02610.field_52239.optionalFieldOf("liquid_settings", (Object)y).forGetter(class010172 -> class010172.j)).apply(instance, class01017::new)).validate(class01017::N);
    private final class03556<class05281> z;
    private final Optional<class01894> U;
    private final int E;
    private final class03855 W;
    private final boolean m;
    private final Optional<class07830> P;
    private final class01031 s;
    private final List<class03129> T;
    private final class02216 b;
    private final class02610 j;

    public List<class03129> M() {
        return this.T;
    }

    public class01017(class04758 class047582, class03556<class05281> class035562, int n, class03855 class038552, boolean bl) {
        this(class047582, class035562, Optional.empty(), n, class038552, bl, Optional.empty(), new class01031(80), List.of(), N, y);
    }

    public class01017(class04758 class047582, class03556<class05281> class035562, int n, class03855 class038552, boolean bl, class07830 class078302) {
        this(class047582, class035562, Optional.empty(), n, class038552, bl, Optional.of(class078302), new class01031(80), List.of(), N, y);
    }

    public class01017(class04758 class047582, class03556<class05281> class035562, Optional<class01894> optional, int n, class03855 class038552, boolean bl, Optional<class07830> optional2, class01031 class010312, List<class03129> list, class02216 class022162, class02610 class026102) {
        super(class047582);
        this.z = class035562;
        this.U = optional;
        this.E = n;
        this.W = class038552;
        this.m = bl;
        this.P = optional2;
        this.s = class010312;
        this.T = list;
        this.b = class022162;
        this.j = class026102;
    }

    public Optional<class04780> N(class04764 class047642) {
        class07321 class073212 = class047642.B();
        int n = this.W.N((class06069)class047642.R(), new class06057(class047642.y(), class047642.Z()));
        class07209 class072092 = new class07209(class073212.i(), n, class073212.R());
        return class04848.N((class04764)class047642, this.z, this.U, (int)this.E, (class07209)class072092, (boolean)this.m, this.P, (class01031)this.s, (class03098)class03098.N(this.T, (class07209)class072092, (long)class047642.M()), (class02216)this.b, (class02610)this.j);
    }

    public class04367<?> N() {
        return class04367.R;
    }

    private static DataResult<class01017> N(class01017 class010172) {
        int n;
        switch (class010172.i()) {
            default: {
                throw new MatchException(null, null);
            }
            case field_28922: {
                int n2 = 0;
                break;
            }
            case field_28923: 
            case field_38431: 
            case field_38432: 
            case field_51413: {
                int n2 = n = 12;
            }
        }
        if (class010172.s.N() + n > 128) {
            return DataResult.error(() -> "Horizontal structure size including terrain adaptation must not exceed 128");
        }
        return DataResult.success((Object)((Object)class010172));
    }

    public class03556<class05281> R() {
        return this.z;
    }
}

