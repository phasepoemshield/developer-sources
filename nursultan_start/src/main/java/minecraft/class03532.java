/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Products$P5
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
 *  minecraft.class00753
 *  minecraft.class02045
 *  minecraft.class04206
 *  minecraft.class06069
 *  minecraft.class06075
 *  minecraft.class06338
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class07836
 */
package minecraft;

import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import minecraft.class00753;
import minecraft.class02045;
import minecraft.class03538;
import minecraft.class03549;
import minecraft.class03555;
import minecraft.class04206;
import minecraft.class06069;
import minecraft.class06075;
import minecraft.class06338;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class07836;

public abstract class class03532 {
    public static final Codec<class03532> y = class04206.a.T().dispatch(class03532::i, class03549::codec);
    private static final int N = 10387320;
    private final class00753 L;
    private final class03555 u;
    private final float i;
    private final int R;
    private final Optional<class03538> M;

    public static boolean L(long l, int n, int n2, int n3, float f) {
        class07836 class078362 = new class07836((class06069)new class06075(0L));
        class078362.N(l, n2, n3, 10387320);
        return class078362.z() < f;
    }

    public boolean L(class02045 class020452, int n, int n2) {
        return !this.M.isPresent() || !this.M.get().N(class020452, n, n2);
    }

    protected class03555 M() {
        return this.u;
    }

    public class03532(class00753 class007532, class03555 class035552, float f, int n, Optional<class03538> optional) {
        this.L = class007532;
        this.u = class035552;
        this.i = f;
        this.R = n;
        this.M = optional;
    }

    protected float B() {
        return this.i;
    }

    protected int Z() {
        return this.R;
    }

    public abstract class03549<?> i();

    protected Optional<class03538> z() {
        return this.M;
    }

    public static boolean u(long l, int n, int n2, int n3, float f) {
        int n4 = n2 >> 4;
        int n5 = n3 >> 4;
        class07836 class078362 = new class07836((class06069)new class06075(0L));
        class078362.N((long)(n4 ^ n5 << 4) ^ l);
        class078362.M();
        return class078362.y((int)(1.0f / f)) == 0;
    }

    public static boolean y(long l, int n, int n2, int n3, float f) {
        class07836 class078362 = new class07836((class06069)new class06075(0L));
        class078362.L(l, n2, n3);
        return class078362.U() < (double)f;
    }

    public boolean y(class02045 class020452, int n, int n2) {
        return this.N(class020452, n, n2) && this.N(n, n2, class020452.u()) && this.L(class020452, n, n2);
    }

    protected static <S extends class03532> Products.P5<RecordCodecBuilder.Mu<S>, class00753, class03555, Float, Integer, Optional<class03538>> N(RecordCodecBuilder.Instance<S> instance) {
        return instance.group((App)class00753.method_39677((int)16).optionalFieldOf("locate_offset", (Object)class00753.field_11176).forGetter(class03532::R), (App)class03555.field_37786.optionalFieldOf("frequency_reduction_method", (Object)class03555.field_37782).forGetter(class03532::M), (App)Codec.floatRange((float)0.0f, (float)1.0f).optionalFieldOf("frequency", (Object)Float.valueOf(1.0f)).forGetter(class03532::B), (App)class06338.T.fieldOf("salt").forGetter(class03532::Z), (App)class03538.N.optionalFieldOf("exclusion_zone").forGetter(class03532::z));
    }

    public static boolean N(long l, int n, int n2, int n3, float f) {
        class07836 class078362 = new class07836((class06069)new class06075(0L));
        class078362.N(l, n, n2, n3);
        return class078362.z() < f;
    }

    public boolean N(int n, int n2, long l) {
        return !(this.i < 1.0f) || this.u.N(l, this.R, n, n2, this.i);
    }

    protected abstract boolean N(class02045 var1, int var2, int var3);

    public class07209 N(class07321 class073212) {
        return new class07209(class073212.i(), 0, class073212.R()).method_10081(this.R());
    }

    protected class00753 R() {
        return this.L;
    }
}

