/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00491
 *  minecraft.class00500
 *  minecraft.class01032
 *  minecraft.class01118
 *  minecraft.class01362
 *  minecraft.class02234
 *  minecraft.class04651
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06584
 *  minecraft.class06681
 *  minecraft.class06889
 *  minecraft.class06898
 *  minecraft.class07049
 *  minecraft.class07299
 *  minecraft.class07488
 *  minecraft.class07796
 *  minecraft.class08400
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Set;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00491;
import minecraft.class00500;
import minecraft.class01032;
import minecraft.class01118;
import minecraft.class01362;
import minecraft.class02234;
import minecraft.class04651;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06584;
import minecraft.class06681;
import minecraft.class06889;
import minecraft.class06898;
import minecraft.class07049;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07488;
import minecraft.class07796;
import minecraft.class08400;
import org.jspecify.annotations.Nullable;

public class class07205
extends class07796
implements class02234 {
    public static final MapCodec<class07205> N = class07205.y(class07205::new);

    public class07205(class01362 class013622) {
        super(class013622);
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class07049 class070492, class08400 class084002, boolean bl) {
        if (class070492.method_5822(false)) {
            class00491 class004912;
            class00394 class003942 = class072992.method_8321(class072092);
            if (!class072992.method_8608() && class003942 instanceof class00491 && !(class004912 = (class00491)class003942).L()) {
                class070492.method_60697((class02234)this, class072092);
                class00491.L((class07299)class072992, (class07209)class072092, (class00500)class005002, (class00491)class004912);
            }
        }
    }

    protected boolean N(class00500 class005002, class04651 class046512) {
        return false;
    }

    public @Nullable class01032 N(class04782 class047822, class07049 class070492, class07209 class072092) {
        class00394 class003942 = class047822.method_8321(class072092);
        if (!(class003942 instanceof class00491)) {
            return null;
        }
        class00491 class004912 = (class00491)class003942;
        class06889 class068892 = class004912.N(class047822, class072092);
        if (class068892 == null) {
            return null;
        }
        if (class070492 instanceof class07488) {
            return new class01032(class047822, class068892, class06889.L, 0.0f, 0.0f, Set.of(), class01032.L);
        }
        return new class01032(class047822, class068892, class06889.L, 0.0f, 0.0f, class06681.N((Set[])new Set[]{class06681.field_54094, class06681.field_40711}), class01032.L);
    }

    public MapCodec<class07205> N() {
        return N;
    }

    public class00394 N(class07209 class072092, class00500 class005002) {
        return new class00491(class072092, class005002);
    }

    public <T extends class00394> @Nullable class01118<T> N(class07299 class072992, class00500 class005002, class00404<T> class004042) {
        return class07205.N(class004042, (class00404)class00404.field_11906, (class01118)(class072992.method_8608() ? class00491::N : class00491::y));
    }

    public void N_20(class00500 class005002, class07299 class072992, class07209 class072092, class06069 class060692) {
        class00394 class003942 = class072992.method_8321(class072092);
        if (!(class003942 instanceof class00491)) {
            return;
        }
        int n = ((class00491)class003942).R();
        for (int i = 0; i < n; ++i) {
            double d = (double)class072092.method_10263() + class060692.U();
            double d2 = (double)class072092.method_10264() + class060692.U();
            double d3 = (double)class072092.method_10260() + class060692.U();
            double d4 = (class060692.U() - 0.5) * 0.5;
            double d5 = (class060692.U() - 0.5) * 0.5;
            double d6 = (class060692.U() - 0.5) * 0.5;
            int n2 = class060692.y(2) * 2 - 1;
            if (class060692.Z()) {
                d3 = (double)class072092.method_10260() + 0.5 + 0.25 * (double)n2;
                d6 = class060692.z() * 2.0f * (float)n2;
            } else {
                d = (double)class072092.method_10263() + 0.5 + 0.25 * (double)n2;
                d4 = class060692.z() * 2.0f * (float)n2;
            }
            class072992.method_8406((class07126)class07107.NM, d, d2, d3, d4, d5, d6);
        }
    }

    public class06584 N(class05487 class054872, class07209 class072092, class00500 class005002, boolean bl) {
        return class06584.E;
    }

    protected class06898 d_(class00500 class005002) {
        return class06898.field_11455;
    }
}

