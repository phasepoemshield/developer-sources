/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09403
 *  com.google.common.collect.ImmutableList
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap
 *  minecraft.class00500
 *  minecraft.class00587
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01002
 *  minecraft.class01029
 *  minecraft.class01281
 *  minecraft.class03541
 *  minecraft.class03543
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class04995
 *  minecraft.class05024
 *  minecraft.class05487
 *  minecraft.class05946
 *  minecraft.class05987
 *  minecraft.class06009
 *  minecraft.class06069
 *  minecraft.class06075
 *  minecraft.class07117
 *  minecraft.class07209
 *  minecraft.class07287
 *  minecraft.class07289
 *  minecraft.class07836
 *  minecraft.class08498
 *  net.caffeinemc.mods.sodium.client.world.biome.BiomeColorMaps
 *  net.irisshaders.iris.mixinterface.ExtendedBiome
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class09403;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import java.util.List;
import java.util.Optional;
import minecraft.class00500;
import minecraft.class00587;
import minecraft.class00772;
import minecraft.class00777;
import minecraft.class00801;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01002;
import minecraft.class01029;
import minecraft.class01281;
import minecraft.class03541;
import minecraft.class03543;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04995;
import minecraft.class05024;
import minecraft.class05487;
import minecraft.class05946;
import minecraft.class05987;
import minecraft.class06009;
import minecraft.class06069;
import minecraft.class06075;
import minecraft.class07117;
import minecraft.class07209;
import minecraft.class07287;
import minecraft.class07289;
import minecraft.class07836;
import minecraft.class08498;
import net.caffeinemc.mods.sodium.client.world.biome.BiomeColorMaps;
import net.irisshaders.iris.mixinterface.ExtendedBiome;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public final class class00780
implements ExtendedBiome {
    public static final Codec<class00780> N = RecordCodecBuilder.create(instance -> instance.group((App)class00777.u.forGetter(class007802 -> class007802.M), (App)class00587.u.optionalFieldOf("attributes", (Object)class00587.N).forGetter(class007802 -> class007802.z), (App)class05987.R.fieldOf("effects").forGetter(class007802 -> class007802.W), (App)class01029.y.forGetter(class007802 -> class007802.B), (App)class01002.L.forGetter(class007802 -> class007802.Z)).apply(instance, class00780::new));
    public static final Codec<class00780> y = RecordCodecBuilder.create(instance -> instance.group((App)class00777.u.forGetter(class007802 -> class007802.M), (App)class00587.L.optionalFieldOf("attributes", (Object)class00587.N).forGetter(class007802 -> class007802.z), (App)class05987.R.fieldOf("effects").forGetter(class007802 -> class007802.W)).apply(instance, (class007772, class005872, class059872) -> new class00780((class00777)((Object)((Object)class007772)), (class00587)class005872, (class05987)class059872, class01029.N, class01002.y)));
    public static final Codec<class03556<class00780>> L = class01281.N((class05946)class04227.NA, N);
    public static final Codec<class03543<class00780>> u = class03541.N((class05946)class04227.NA, N);
    private static final class05024 U = new class05024((class06069)new class07836((class06069)new class06075(1234L)), (List)ImmutableList.of((Object)0));
    static final class05024 i = new class05024((class06069)new class07836((class06069)new class06075(3456L)), (List)ImmutableList.of((Object)-2, (Object)-1, (Object)0));
    @Deprecated(forRemoval=true)
    public static final class05024 R = new class05024((class06069)new class07836((class06069)new class06075(2345L)), (List)ImmutableList.of((Object)0));
    private static final int E = 1024;
    public class00777 M;
    public final class01029 B;
    public final class01002 Z;
    public class00587 z;
    private final class05987 W;
    private final ThreadLocal<Long2FloatLinkedOpenHashMap> m = ThreadLocal.withInitial(() -> {
        class09403 class094032 = new class09403(this, 1024, 0.25f);
        class094032.defaultReturnValue(Float.NaN);
        return class094032;
    });
    private int P = -1;
    private boolean s;
    private int T;
    private boolean b;
    private int j;
    private int v;
    private class05987 n;

    private class04688 L(class05487 class054872, class07209 class072092) {
        return null;
    }

    public class01029 L() {
        return this.B;
    }

    public boolean L(class07209 class072092, int n) {
        return this.i(class072092, n) >= 0.15f;
    }

    public class05987 M() {
        return this.W;
    }

    private void P() {
        this.n = this.W;
        Optional optional = this.n.u();
        if (optional.isPresent()) {
            this.s = true;
            this.T = (Integer)optional.get();
        } else {
            this.s = false;
        }
        Optional optional2 = this.n.y();
        if (optional2.isPresent()) {
            this.b = true;
            this.j = (Integer)optional2.get();
        } else {
            this.b = false;
        }
        this.v = this.s();
    }

    class00780(class00777 class007772, class00587 class005872, class05987 class059872, class01029 class010292, class01002 class010022) {
        this.M = class007772;
        this.B = class010292;
        this.Z = class010022;
        this.z = class005872;
        this.W = class059872;
        this.N((CallbackInfo)null);
    }

    public int B() {
        return this.W.N();
    }

    public int Z() {
        if (this.W != this.n) {
            this.P();
        }
        int n = this.b ? this.j : BiomeColorMaps.getFoliageColor((int)this.v);
        return n;
    }

    public float i() {
        return this.M.y();
    }

    @Deprecated
    public float i(class07209 class072092, int n) {
        return this.R(class072092, n);
    }

    private int s() {
        double d = class04995.N((float)this.M.y(), (float)0.0f, (float)1.0f);
        double d2 = class04995.N((float)this.M.u(), (float)0.0f, (float)1.0f);
        return BiomeColorMaps.getIndex((double)d, (double)d2);
    }

    private int U() {
        double d = class04995.N((float)this.M.y(), (float)0.0f, (float)1.0f);
        double d2 = class04995.N((float)this.M.u(), (float)0.0f, (float)1.0f);
        return class07287.N((double)d, (double)d2);
    }

    private int z() {
        Optional optional = this.W.u();
        if (optional.isPresent()) {
            return (Integer)optional.get();
        }
        return this.U();
    }

    public boolean u(class07209 class072092, int n) {
        return this.i(class072092, n) > 0.1f;
    }

    public int u() {
        return this.W.L().orElseGet(this::W);
    }

    public boolean y(class05487 class054872, class07209 class072092) {
        class00500 class005002;
        if (this.N(class072092, class054872.method_8615()) != class00801.field_9383) {
            return false;
        }
        return class054872.L(class072092.method_10264()) && class054872.method_8314(class00772.field_9282, class072092) < 10 && ((class005002 = class054872.method_8320(class072092)).P() || class005002.N(class00869.is)) && class00869.is.W().N(class054872, class072092);
    }

    public boolean y(class07209 class072092, int n) {
        return !this.L(class072092, n);
    }

    public boolean y() {
        return this.M.N();
    }

    private int E() {
        double d = class04995.N((float)this.M.y(), (float)0.0f, (float)1.0f);
        double d2 = class04995.N((float)this.M.u(), (float)0.0f, (float)1.0f);
        return class07289.N((double)d, (double)d2);
    }

    public class00801 N(class07209 class072092, int n) {
        if (!this.y()) {
            return class00801.field_9384;
        }
        return this.y(class072092, n) ? class00801.field_9383 : class00801.field_9382;
    }

    private class00891 N(class00500 class005002) {
        return class005002.Y().N() == class04684.L ? class005002.i() : null;
    }

    private class04651 N(class04688 class046882) {
        return class04684.L;
    }

    private void N(CallbackInfo callbackInfo) {
        this.P();
    }

    public class01002 N() {
        return this.Z;
    }

    public int N(double d, double d2) {
        if (this.W != this.n) {
            this.P();
        }
        int n = this.s ? this.T : BiomeColorMaps.getGrassColor((int)this.v);
        class06009 class060092 = this.n.i();
        if (class060092 != class06009.field_26426) {
            n = class060092.N(d, d2, n);
        }
        return n;
    }

    public boolean N(class05487 class054872, class07209 class072092) {
        return this.N(class054872, class072092, true);
    }

    public boolean N(class05487 class054872, class07209 class072092, boolean bl) {
        if (this.L(class072092, class054872.method_8615())) {
            return false;
        }
        if (class054872.L(class072092.method_10264()) && class054872.method_8314(class00772.field_9282, class072092) < 10) {
            class00500 class005002 = class054872.method_8320(class072092);
            class07209 class072093 = class072092;
            class05487 class054873 = class054872;
            if (this.N((class04688)(class054873 = this.L(class054873, class072093))) == class04684.L && this.N((class00500)(class054873 = class005002)) instanceof class07117) {
                if (!bl) {
                    return true;
                }
                if (!(class054872.z(class072092.method_10067()) && class054872.z(class072092.method_10078()) && class054872.z(class072092.method_10095()) && class054872.z(class072092.method_10072()))) {
                    return true;
                }
            }
        }
        return false;
    }

    public void setBiomeCategory(int n) {
        this.P = n;
    }

    public float getDownfall() {
        return this.M.u();
    }

    public int getBiomeCategory() {
        return this.P;
    }

    private int W() {
        double d = class04995.N((float)this.M.y(), (float)0.0f, (float)1.0f);
        double d2 = class04995.N((float)this.M.u(), (float)0.0f, (float)1.0f);
        return class08498.N((double)d, (double)d2);
    }

    public class00587 R() {
        return this.z;
    }

    private float R(class07209 class072092, int n) {
        float f = this.M.L().N(class072092, this.i());
        int n2 = n + 17;
        if (class072092.method_10264() > n2) {
            float f2 = (float)(U.N((double)((float)class072092.method_10263() / 8.0f), (double)((float)class072092.method_10260() / 8.0f), false) * 8.0);
            return f - (f2 + (float)class072092.method_10264() - (float)n2) * 0.05f / 40.0f;
        }
        return f;
    }
}

