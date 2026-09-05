/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00265
 *  minecraft.class00282
 *  minecraft.class00311
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class03448
 *  minecraft.class06086
 *  minecraft.class06584
 *  minecraft.class07299
 *  minecraft.class08394
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import minecraft.class00265;
import minecraft.class00282;
import minecraft.class00311;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class03448;
import minecraft.class04650;
import minecraft.class04666;
import minecraft.class04680;
import minecraft.class06086;
import minecraft.class06584;
import minecraft.class07299;
import minecraft.class08394;

public class class04658
implements class04680 {
    private static final class01894 N = class01894.y((String)"toast/recipe");
    private static final long i = 5000L;
    private static final class00392 R = class00392.L((String)"recipe.toast.title");
    private static final class00392 M = class00392.L((String)"recipe.toast.description");
    private final List<class04666> B = new ArrayList<class04666>();
    private long Z;
    private boolean z;
    private class04650 U = class04650.field_2209;
    private int E;

    private class04658() {
    }

    @Override
    public class04650 i() {
        return this.U;
    }

    @Override
    public void N(class01054 class010542, class01590 class015902, long l) {
        class010542.N(class08394.Na, N, 0, 0, this.L(), this.u());
        class010542.N(class015902, R, 30, 7, -11534256, false);
        class010542.N(class015902, M, 30, 18, -16777216, false);
        class04666 class046662 = this.B.get(this.E);
        class010542.i().pushMatrix();
        class010542.i().scale(0.6f, 0.6f);
        class010542.y(class046662.N(), 3, 3);
        class010542.i().popMatrix();
        class010542.y(class046662.y(), 8, 8);
    }

    public static void N(class06086 class060862, class00265 class002652) {
        class04658 class046582 = (class04658)class060862.N(class04658.class, y);
        if (class046582 == null) {
            class046582 = new class04658();
            class060862.N((class04680)class046582);
        }
        class00311 class003112 = class00282.N((class07299)((class03448)class060862.i().T_3));
        class06584 class065842 = class002652.i().y(class003112);
        class06584 class065843 = class002652.u().y(class003112);
        class046582.N(class065842, class065843);
    }

    private void N(class06584 class065842, class06584 class065843) {
        this.B.add(new class04666(class065842, class065843));
        this.z = true;
    }

    @Override
    public void N(class06086 class060862, long l) {
        if (this.z) {
            this.Z = l;
            this.z = false;
        }
        this.U = this.B.isEmpty() ? class04650.field_2209 : ((double)(l - this.Z) >= 5000.0 * class060862.R() ? class04650.field_2209 : class04650.field_2210);
        this.E = (int)((double)l / Math.max(1.0, 5000.0 * class060862.R() / (double)this.B.size()) % (double)this.B.size());
    }
}

