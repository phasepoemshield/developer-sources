/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06386
 *  minecraft.class07211
 *  minecraft.class07221
 *  minecraft.class07536
 *  minecraft.class08815
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06386;
import minecraft.class07211;
import minecraft.class07221;
import minecraft.class07536;
import minecraft.class08815;

public class class05583
implements class06386 {
    public static final Codec<class05583> N = RecordCodecBuilder.create(instance -> instance.group((App)class04206.i.T().fieldOf("block").flatXmap(class05583::N, DataResult::success).orElse((Object)((class08815)class00869.RX)).forGetter(class055832 -> class055832.y), (App)Codec.intRange((int)1, (int)64).fieldOf("search_range").orElse((Object)10).forGetter(class055832 -> class055832.L), (App)Codec.BOOL.fieldOf("can_place_on_floor").orElse((Object)false).forGetter(class055832 -> class055832.u), (App)Codec.BOOL.fieldOf("can_place_on_ceiling").orElse((Object)false).forGetter(class055832 -> class055832.i), (App)Codec.BOOL.fieldOf("can_place_on_wall").orElse((Object)false).forGetter(class055832 -> class055832.M), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("chance_of_spreading").orElse((Object)Float.valueOf(0.5f)).forGetter(class055832 -> Float.valueOf(class055832.B)), (App)class03541.N((class05946)class04227.Z).fieldOf("can_be_placed_on").forGetter(class055832 -> class055832.Z)).apply(instance, class05583::new));
    public final class08815 y;
    public final int L;
    public final boolean u;
    public final boolean i;
    public final boolean M;
    public final float B;
    public final class03543<class00891> Z;
    private final ObjectArrayList<class07211> z;

    public class05583(class08815 class088152, int n, boolean bl, boolean bl2, boolean bl3, float f, class03543<class00891> class035432) {
        this.y = class088152;
        this.L = n;
        this.u = bl;
        this.i = bl2;
        this.M = bl3;
        this.B = f;
        this.Z = class035432;
        this.z = new ObjectArrayList(6);
        if (bl2) {
            this.z.add((Object)class07211.field_11036);
        }
        if (bl) {
            this.z.add((Object)class07211.field_11033);
        }
        if (bl3) {
            class07221.field_11062.forEach(arg_0 -> this.z.add(arg_0));
        }
    }

    private static DataResult<class08815> N(class00891 class008912) {
        return class008912 instanceof class08815 ? DataResult.success((Object)((class08815)class008912)) : DataResult.error(() -> "Growth block should be a multiface spreadeable block");
    }

    public List<class07211> N(class06069 class060692, class07211 class072112) {
        return class07536.N(this.z.stream().filter(class072113 -> class072113 != class072112), (class06069)class060692);
    }

    public List<class07211> N(class06069 class060692) {
        return class07536.N(this.z, (class06069)class060692);
    }
}

