/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.viaversion.viafabricplus.settings.impl.DebugSettings
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00753
 *  minecraft.class01194
 *  minecraft.class01362
 *  minecraft.class01960
 *  minecraft.class02733
 *  minecraft.class02752
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04911
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06584
 *  minecraft.class06657
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class07003
 *  minecraft.class07049
 *  minecraft.class07082
 *  minecraft.class07193
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07307
 *  minecraft.class08007
 *  minecraft.class08036
 *  minecraft.class08092
 *  minecraft.class08400
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00753;
import minecraft.class00891;
import minecraft.class01194;
import minecraft.class01362;
import minecraft.class01960;
import minecraft.class02733;
import minecraft.class02752;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04911;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06584;
import minecraft.class06657;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class07003;
import minecraft.class07049;
import minecraft.class07082;
import minecraft.class07193;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07307;
import minecraft.class08007;
import minecraft.class08036;
import minecraft.class08092;
import minecraft.class08400;
import org.jspecify.annotations.Nullable;

public class class00889
extends class07193 {
    public static final MapCodec<class00889> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01960.N.fieldOf("block_set_type").forGetter(class008892 -> class008892.u), (App)Codec.intRange((int)1, (int)1024).fieldOf("ticks_to_stay_pressed").forGetter(class008892 -> class008892.i), (App)class00889.t()).apply(instance, class00889::new));
    public static final class06667 y = class06665.k;
    private final class01960 u;
    private final int i;
    private final Function<class00500, class00494> M;

    protected void L(class00500 class005002, class07299 class072992, class07209 class072092) {
        boolean bl;
        class08007 class080072 = this.u.i() ? (class08007)class072992.N(class08007.class, class005002.R((class07290)class072992, class072092).method_1107().N(class072092)).stream().findFirst().orElse(null) : null;
        boolean bl2 = class080072 != null;
        if (bl2 != (bl = ((Boolean)class005002.L((class08092)y)).booleanValue())) {
            class072992.method_8652(class072092, (class00500)class005002.y((class08092)y, (Comparable)Boolean.valueOf(bl2)), 3);
            this.u(class005002, class072992, class072092);
            this.N(null, (class07284)class072992, class072092, bl2);
            class072992.N((class07049)class080072, (class03556)(bl2 ? class01194.N : class01194.i), class072092);
        }
        if (bl2) {
            class072992.N(new class07209((class00753)class072092), (class00891)((Object)this), this.i);
        }
    }

    public class00889(class01960 class019602, int n, class01362 class013622) {
        super(class013622.N(class019602.M()));
        this.u = class019602;
        this.P((class00500)((class00500)((class00500)((class00500)this.Q.y()).y((class08092)R, (Comparable)class07211.field_11043)).y((class08092)y, (Comparable)Boolean.valueOf(false))).y((class08092)L, (Comparable)class06657.field_12471));
        this.i = n;
        this.M = this.y();
    }

    private void u(class00500 class005002, class07299 class072992, class07209 class072092) {
        class07211 class072112;
        class02733 class027332 = class02752.N((class07299)class072992, (class07211)class072112, (class07211)((class072112 = class00889.U((class00500)class005002).b()).z().L() ? class07211.field_11036 : (class07211)class005002.L((class08092)R)));
        class072992.method_8452(class072092, (class00891)((Object)this), class027332);
        class072992.method_8452(class072092.method_10093(class072112), (class00891)((Object)this), class027332);
    }

    private Function<class00500, class00494> y() {
        class00494 class004942 = class00891.N(14.0);
        class00494 class004943 = class00891.N(12.0);
        Map map = class00389.i((class00494)class00891.y(6.0, 4.0, 8.0, 16.0));
        return this.N((T class005002) -> class00389.N((class00494)((class00494)((Map)map.get(class005002.L((class08092)L))).get(class005002.L((class08092)R))), (class00494)((Boolean)class005002.L((class08092)y) != false ? class004942 : class004943), (class07003)class07003.i));
    }

    protected int y(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        if (((Boolean)class005002.L((class08092)y)).booleanValue() && class00889.U((class00500)class005002) == class072112) {
            return 15;
        }
        return 0;
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (!((Boolean)class005002.L((class08092)y)).booleanValue()) {
            return;
        }
        this.L(class005002, (class07299)class047822, class072092);
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class07049 class070492, class08400 class084002, boolean bl) {
        if (class072992.method_8608() || !this.u.i() || ((Boolean)class005002.L((class08092)y)).booleanValue()) {
            return;
        }
        this.L(class005002, class072992, class072092);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{R, y, L});
    }

    public void N(class00500 class005002, class07299 class072992, class07209 class072092, @Nullable class08036 class080362) {
        class072992.method_8652(class072092, (class00500)class005002.y((class08092)y, (Comparable)Boolean.valueOf(true)), 3);
        this.u(class005002, class072992, class072092);
        class072992.N(class072092, (class00891)((Object)this), this.i);
        this.N(class080362, (class07284)class072992, class072092, true);
        class072992.N((class07049)class080362, (class03556)class01194.N, class072092);
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class07307 class073072, BiConsumer<class06584, class07209> biConsumer) {
        if (class073072.M() && !((Boolean)class005002.L((class08092)y)).booleanValue()) {
            this.N(class005002, (class07299)class047822, class072092, null);
        }
        super.N(class005002, class047822, class072092, class073072, biConsumer);
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        if (((Boolean)class005002.L((class08092)y)).booleanValue()) {
            return class07082.L;
        }
        this.N(class005002, class072992, class072092, class080362);
        return class07082.N;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return this.M.apply(class005002);
    }

    public MapCodec<class00889> N() {
        return N;
    }

    private boolean N(class07284 class072842, class07049 class070492, class07209 class072092, class04891 class048912, class04911 class049112) {
        return !DebugSettings.INSTANCE.serversidePlaceSounds.isEnabled();
    }

    protected int N_8(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        return (Boolean)class005002.L((class08092)y) != false ? 15 : 0;
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, boolean bl) {
        if (!bl && ((Boolean)class005002.L((class08092)y)).booleanValue()) {
            this.u(class005002, (class07299)class047822, class072092);
        }
    }

    protected class04891 N(boolean bl) {
        return bl ? this.u.P() : this.u.m();
    }

    protected void N(@Nullable class08036 class080362, class07284 class072842, class07209 class072092, boolean bl) {
        block0: {
            class04891 class048912;
            class07209 class072093;
            class04911 class049112 = class04911.field_15245;
            class07284 class072843 = class072842;
            Object object = bl ? class080362 : null;
            if (!this.N(class072843, (class07049)object, class072093 = class072092, class048912 = this.N(bl), class049112)) break block0;
            class072843.N((class07049)object, class072093, class048912, class049112);
        }
    }

    protected boolean i_(class00500 class005002) {
        return true;
    }
}

