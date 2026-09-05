/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00392
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class01118
 *  minecraft.class01210
 *  minecraft.class01362
 *  minecraft.class03965
 *  minecraft.class05880
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06237
 *  minecraft.class07082
 *  minecraft.class07264
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07500
 *  minecraft.class07796
 *  minecraft.class08036
 *  minecraft.class08791
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.List;
import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class01118;
import minecraft.class01210;
import minecraft.class01362;
import minecraft.class03965;
import minecraft.class05880;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06237;
import minecraft.class07082;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07264;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07500;
import minecraft.class07796;
import minecraft.class08036;
import minecraft.class08791;
import org.jspecify.annotations.Nullable;

public class class07203
extends class07796 {
    public static final MapCodec<class07203> N = class07203.y(class07203::new);
    public static final List<class07209> y = class07209.method_17962(-2, 0, -2, 2, 1, 2).filter(class072092 -> Math.abs(class072092.method_10263()) == 2 || Math.abs(class072092.method_10260()) == 2).map(class07209::method_10062).toList();
    private static final class00494 L = class00891.y((double)16.0, (double)0.0, (double)12.0);

    public class07203(class01362 class013622) {
        super(class013622);
    }

    protected @Nullable class06237 N(class00500 class005002, class07299 class072992, class07209 class072092) {
        class00394 class003942 = class072992.method_8321(class072092);
        if (class003942 instanceof class07264) {
            class00392 class003922 = ((class07264)class003942).method_5476();
            return new class03965((n, class080442, class080362) -> new class07500(n, class080442, class05880.N((class07299)class072992, (class07209)class072092)), class003922);
        }
        return null;
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        if (!class072992.method_8608()) {
            class080362.method_17355(class005002.N(class072992, class072092));
        }
        return class07082.N;
    }

    public MapCodec<class07203> N() {
        return N;
    }

    public static boolean N(class07299 class072992, class07209 class072092, class07209 class072093) {
        return class072992.method_8320(class072092.method_10081(class072093)).N(class01210.Lc) && class072992.method_8320(class072092.method_10069(class072093.method_10263() / 2, class072093.method_10264(), class072093.method_10260() / 2)).N(class01210.LX);
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return L;
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        super.N_20(class005002, class072992, class072092, class060692);
        for (class07209 class072093 : y) {
            if (class060692.y(16) != 0 || !class07203.N(class072992, class072092, class072093)) continue;
            class072992.method_8406((class07126)class07107.v, (double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + 2.0, (double)class072092.method_10260() + 0.5, (double)((float)class072093.method_10263() + class060692.z()) - 0.5, (double)((float)class072093.method_10264() - class060692.z() - 1.0f), (double)((float)class072093.method_10260() + class060692.z()) - 0.5);
        }
    }

    public class00394 N(class07209 class072092, class00500 class005002) {
        return new class07264(class072092, class005002);
    }

    public <T extends class00394> @Nullable class01118<T> N(class07299 class072992, class00500 class005002, class00404<T> class004042) {
        return class072992.method_8608() ? class07203.N(class004042, (class00404)class00404.field_11912, class07264::N) : null;
    }

    protected boolean a_(class00500 class005002) {
        return true;
    }
}

