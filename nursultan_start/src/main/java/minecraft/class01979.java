/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00701
 *  minecraft.class00737
 *  minecraft.class00891
 *  minecraft.class01194
 *  minecraft.class01362
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06344
 *  minecraft.class06665
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07105
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07204
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class07796
 *  minecraft.class08071
 *  minecraft.class08092
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00701;
import minecraft.class00737;
import minecraft.class00891;
import minecraft.class01194;
import minecraft.class01362;
import minecraft.class01965;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06344;
import minecraft.class06665;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07105;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07204;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07796;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;

public class class01979
extends class07796
implements class06344 {
    public static final MapCodec<class01979> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class04206.i.T().fieldOf("turns_into").forGetter(class01979::y), (App)class04206.y.T().fieldOf("brush_sound").forGetter(class01979::L), (App)class04206.y.T().fieldOf("brush_completed_sound").forGetter(class01979::u), (App)class01979.t()).apply(instance, class01979::new));
    private static final class08071 L = class06665.yk;
    public static final int y = 2;
    private final class00891 u;
    private final class04891 i;
    private final class04891 R;

    public class04891 L() {
        return this.i;
    }

    public class01979(class00891 class008912, class04891 class048912, class04891 class048913, class01362 class013622) {
        super(class013622);
        this.u = class008912;
        this.i = class048912;
        this.R = class048913;
        this.P((class00500)((class00500)this.Q.y()).y((class08092)L, (Comparable)Integer.valueOf(0)));
    }

    public class04891 u() {
        return this.R;
    }

    public class00891 y() {
        return this.u;
    }

    public @Nullable class00394 N(class07209 class072092, class00500 class005002) {
        return new class01965(class072092, class005002);
    }

    public MapCodec<class01979> N() {
        return N;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L});
    }

    public void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
        class072992.N(class072092, (class00891)this, 2);
    }

    public class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        class087132.N(class072092, (class00891)this, 2);
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    public void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        class01965 class019652;
        class00394 class003942 = class047822.method_8321(class072092);
        if (class003942 instanceof class01965) {
            class019652 = (class01965)class003942;
            class019652.N(class047822);
        }
        if (!class07204.U((class00500)class047822.method_8320(class072092.method_10074())) || class072092.method_10264() < class047822.method_31607()) {
            return;
        }
        class019652 = class00701.N((class07299)class047822, (class07209)class072092, (class00500)class005002);
        class019652.y();
    }

    public void N(class07299 class072992, class07209 class072092, class00701 class007012) {
        class06889 class068892 = class007012.method_5829().R();
        class072992.N(2001, class07209.method_49638((class00737)class068892), class00891.W((class00500)class007012.L()));
        class072992.N((class07049)class007012, (class03556)class01194.R, class068892);
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        class07209 class072093;
        if (class060692.y(16) == 0 && class07204.U((class00500)class072992.method_8320(class072093 = class072092.method_10074()))) {
            double d = (double)class072092.method_10263() + class060692.U();
            double d2 = (double)class072092.method_10264() - 0.05;
            double d3 = (double)class072092.method_10260() + class060692.U();
            class072992.method_8406((class07126)new class07105(class07107.O, class005002), d, d2, d3, 0.0, 0.0, 0.0);
        }
    }
}

