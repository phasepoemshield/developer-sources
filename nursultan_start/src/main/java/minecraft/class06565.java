/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01194
 *  minecraft.class02484
 *  minecraft.class02837
 *  minecraft.class03556
 *  minecraft.class04651
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04911
 *  minecraft.class05549
 *  minecraft.class06113
 *  minecraft.class06913
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07299
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class01194;
import minecraft.class02484;
import minecraft.class02837;
import minecraft.class03556;
import minecraft.class04651;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04911;
import minecraft.class05549;
import minecraft.class06113;
import minecraft.class06573;
import minecraft.class06584;
import minecraft.class06913;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07438;
import org.jspecify.annotations.Nullable;

public class class06565
extends class06913 {
    private final class07078<? extends class07079> N;
    private final class04891 y;

    public class06565(class07078<? extends class07079> class070782, class04651 class046512, class04891 class048912, class06573 class065732) {
        super(class046512, class065732);
        this.N = class070782;
        this.y = class048912;
    }

    private void N(class04782 class047822, class06584 class065842, class07209 class072092) {
        class07079 class070792 = (class07079)this.N.y(class047822, class07078.N((class07299)class047822, (class06584)class065842, null), class072092, class06113.field_16473, true, false);
        if (class070792 instanceof class05549) {
            class05549 class055492 = (class05549)class070792;
            class02837 class028372 = (class02837)class065842.a_(class02484.NM, class02837.N);
            class055492.N(class028372.y());
            class055492.N(true);
        }
        if (class070792 != null) {
            class047822.y((class07049)class070792);
            class070792.D();
        }
    }

    protected void N(@Nullable class07438 class074382, class07284 class072842, class07209 class072092) {
        class072842.method_8396((class07049)class074382, class072092, this.y, class04911.field_15254, 1.0f, 1.0f);
    }

    public void N(@Nullable class07438 class074382, class07299 class072992, class06584 class065842, class07209 class072092) {
        if (class072992 instanceof class04782) {
            this.N((class04782)class072992, class065842, class072092);
            class072992.N((class07049)class074382, (class03556)class01194.v, class072092);
        }
    }
}

