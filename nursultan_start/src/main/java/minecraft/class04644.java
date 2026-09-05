/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01231
 *  minecraft.class03530
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05487
 *  minecraft.class05787
 *  minecraft.class06069
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class07049
 *  minecraft.class07107
 *  minecraft.class07117
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07305
 *  minecraft.class08092
 *  minecraft.class08397
 *  minecraft.class08400
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Optional;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01231;
import minecraft.class03530;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05487;
import minecraft.class05787;
import minecraft.class06069;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class07049;
import minecraft.class07107;
import minecraft.class07117;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07305;
import minecraft.class08092;
import minecraft.class08397;
import minecraft.class08400;
import org.jspecify.annotations.Nullable;

public abstract class class04644
extends class05787 {
    public int L(class05487 class054872) {
        return 1;
    }

    protected float L() {
        return 100.0f;
    }

    public @Nullable class07126 B() {
        return class07107.W;
    }

    public class04651 i() {
        return class04684.L;
    }

    public Optional<class04891> z() {
        return Optional.of(class04909.ut);
    }

    public class04651 u() {
        return class04684.y;
    }

    public class00500 y(class04688 class046882) {
        return (class00500)class00869.K.W().y((class08092)class07117.y, (Comparable)Integer.valueOf(class04644.i((class04688)class046882)));
    }

    public int y(class05487 class054872) {
        return 4;
    }

    public int N(class05487 class054872) {
        return 5;
    }

    public class06581 N() {
        return class06570.jE;
    }

    protected void N(class07299 class072992, class07209 class072092, class07049 class070492, class08400 class084002) {
        class084002.N(class08397.field_56645);
    }

    public boolean N(class04688 class046882, class07290 class072902, class07209 class072092, class04651 class046512, class07211 class072112) {
        return class072112 == class07211.field_11033 && !class046512.N((class03530<class04651>)class01231.N);
    }

    protected boolean N(class04782 class047822) {
        return (Boolean)class047822.method_64395().N(class07305.NM);
    }

    protected void N(class07284 class072842, class07209 class072092, class00500 class005002) {
        class00394 class003942 = class005002.k() ? class072842.method_8321(class072092) : null;
        class00891.N((class00500)class005002, (class07284)class072842, (class07209)class072092, (class00394)class003942);
    }

    public void N(class07299 class072992, class07209 class072092, class04688 class046882, class06069 class060692) {
        if (!class046882.u() && !((Boolean)class046882.L((class08092)N)).booleanValue()) {
            if (class060692.y(64) == 0) {
                class072992.method_8486((double)class072092.method_10263() + 0.5, (double)class072092.method_10264() + 0.5, (double)class072092.method_10260() + 0.5, class04909.It, class04911.field_15256, class060692.z() * 0.25f + 0.75f, class060692.z() + 0.5f, false);
            }
        } else if (class060692.y(10) == 0) {
            class072992.method_8406((class07126)class07107.Ns, (double)class072092.method_10263() + class060692.U(), (double)class072092.method_10264() + class060692.U(), (double)class072092.method_10260() + class060692.U(), 0.0, 0.0, 0.0);
        }
    }

    public boolean N(class04651 class046512) {
        return class046512 == class04684.L || class046512 == class04684.y;
    }
}

