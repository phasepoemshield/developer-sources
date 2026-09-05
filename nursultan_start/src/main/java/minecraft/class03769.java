/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01194
 *  minecraft.class01226
 *  minecraft.class01235
 *  minecraft.class01362
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class06183
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06704
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07101
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07796
 *  minecraft.class08036
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08990
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.OptionalInt;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01194;
import minecraft.class01226;
import minecraft.class01235;
import minecraft.class01362;
import minecraft.class03556;
import minecraft.class03773;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06183;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06704;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07101;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07796;
import minecraft.class08036;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08990;
import org.jspecify.annotations.Nullable;

public class class03769
extends class07796
implements class08990 {
    public static final MapCodec<class03769> N = class03769.y(class03769::new);
    public static final class08064<class07211> y = class07101.R;
    public static final class06667 L = class06665.yn;
    public static final class06667 u = class06665.yt;
    public static final class06667 i = class06665.yG;
    public static final class06667 R = class06665.yl;
    public static final class06667 M = class06665.yd;
    public static final class06667 B = class06665.yw;
    private static final int O = 6;
    private static final int F = 3;
    public static final List<class06667> Z = List.of(L, u, i, R, M, B);

    public int L() {
        return 3;
    }

    public class03769(class01362 class013622) {
        super(class013622);
        class00500 class005002 = (class00500)((class00500)this.Q.y()).y(y, (Comparable)class07211.field_11043);
        for (class06667 class066672 : Z) {
            class005002 = (class00500)class005002.y((class08092)class066672, (Comparable)Boolean.valueOf(false));
        }
        this.P(class005002);
    }

    public int y() {
        return 2;
    }

    protected boolean N(class00500 class005002) {
        return true;
    }

    public class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L(y)));
    }

    public class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(y, (Comparable)class069932.N((class07211)class005002.L(y)));
    }

    public class00500 N(class06942 class069422) {
        return (class00500)this.W().y(y, (Comparable)class069422.method_8042().b());
    }

    protected int N_24(class00500 class005002, class07299 class072992, class07209 class072092, class07211 class072112) {
        if (class072992.method_8608()) {
            return 0;
        }
        class00394 class003942 = class072992.method_8321(class072092);
        if (class003942 instanceof class03773) {
            return ((class03773)class003942).L() + 1;
        }
        return 0;
    }

    public MapCodec<class03769> N() {
        return N;
    }

    private static void N(class07299 class072992, class07209 class072092, class08036 class080362, class03773 class037732, int n) {
        if (class072992.method_8608()) {
            return;
        }
        class06584 class065842 = class037732.method_5434(n, 1);
        class04891 class048912 = class065842.N(class06570.Gq) ? class04909.Rg : class04909.RO;
        class072992.method_8396(null, class072092, class048912, class04911.field_15245, 1.0f, 1.0f);
        if (!class080362.method_31548().M(class065842)) {
            class080362.method_7328(class065842, false);
        }
        class072992.N((class07049)class080362, (class03556)class01194.L, class072092);
    }

    private static void N(class07299 class072992, class07209 class072092, class08036 class080362, class03773 class037732, class06584 class065842, int n) {
        if (class072992.method_8608()) {
            return;
        }
        class080362.method_7259(class01235.L.y((Object)class065842.B()));
        class04891 class048912 = class065842.N(class06570.Gq) ? class04909.RY : class04909.Rk;
        class037732.method_5447(n, class065842.y(1, (class07438)class080362));
        class072992.method_8396(null, class072092, class048912, class04911.field_15245, 1.0f, 1.0f);
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        Object object = class072992.method_8321(class072092);
        if (!(object instanceof class03773)) {
            return class07082.i;
        }
        class03773 class037732 = (class03773)((Object)object);
        object = this.N(class061832, (class07211)class005002.L(y));
        if (((OptionalInt)object).isEmpty()) {
            return class07082.i;
        }
        if (!((Boolean)class005002.L((class08092)Z.get(((OptionalInt)object).getAsInt()))).booleanValue()) {
            return class07082.L;
        }
        class03769.N(class072992, class072092, class080362, class037732, ((OptionalInt)object).getAsInt());
        return class07082.N;
    }

    protected class07082 N(class06584 class065842, class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class07050 class070502, class06183 class061832) {
        Object object = class072992.method_8321(class072092);
        if (!(object instanceof class03773)) {
            return class07082.i;
        }
        class03773 class037732 = (class03773)((Object)object);
        if (!class065842.N(class01226.yv)) {
            return class07082.R;
        }
        object = this.N(class061832, (class07211)class005002.L(y));
        if (((OptionalInt)object).isEmpty()) {
            return class07082.i;
        }
        if (((Boolean)class005002.L((class08092)Z.get(((OptionalInt)object).getAsInt()))).booleanValue()) {
            return class07082.R;
        }
        class03769.N(class072992, class072092, class080362, class037732, class065842, ((OptionalInt)object).getAsInt());
        return class07082.N;
    }

    public @Nullable class00394 N(class07209 class072092, class00500 class005002) {
        return new class03773(class072092, class005002);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y});
        Z.forEach(class080922 -> class005172.N(new class08092[]{class080922}));
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, boolean bl) {
        class06704.N((class00500)class005002, (class07299)class047822, (class07209)class072092);
    }
}

