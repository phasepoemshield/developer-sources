/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class06069
 *  minecraft.class06084
 *  minecraft.class06092
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class05439;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06084;
import minecraft.class06092;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;

public class class05453
extends class05439
implements class06084 {
    public static final MapCodec<class05453> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.FLOAT.fieldOf("height").forGetter(class054532 -> Float.valueOf(class054532.i)), (App)Codec.FLOAT.fieldOf("width").forGetter(class054532 -> Float.valueOf(class054532.R)), (App)class05453.t()).apply(instance, class05453::new));
    public static final class06667 L = class06665.q;
    public static final class08064<class07211> u = class06665.F;
    private final float i;
    private final float R;
    private final Map<class07211, class00494> M;

    public class05453(float f, float f2, class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.W().y((class08092)L, (Comparable)Boolean.valueOf(false))).y(u, (Comparable)class07211.field_11036));
        this.M = class00389.u((class00494)class00891.L((double)f2, (double)(16.0f - f), (double)16.0));
        this.i = f;
        this.R = f2;
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)L)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L, u});
    }

    public MapCodec<class05453> N() {
        return y;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return this.M.get(class005002.L(u));
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)L)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        if (class072112 == ((class07211)class005002.L(u)).b() && !class005002.N(class054872, class072092)) {
            return class00869.N.W();
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    public @Nullable class00500 N(class06942 class069422) {
        class07299 class072992 = class069422.method_8045();
        class07209 class072092 = class069422.method_8037();
        return (class00500)((class00500)this.W().y((class08092)L, (Comparable)Boolean.valueOf(class072992.method_8316(class072092).N() == class04684.L))).y(u, (Comparable)class069422.method_8038());
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(u, (Comparable)class069932.N((class07211)class005002.L(u)));
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L(u)));
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        class07211 class072112 = (class07211)class005002.L(u);
        class07209 class072093 = class072092.method_10093(class072112.b());
        return class054872.method_8320(class072093).L((class07290)class054872, class072093, class072112);
    }
}

