/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.visuals.settings.VisualSettings
 *  minecraft.class00392
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01194
 *  minecraft.class01210
 *  minecraft.class02484
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class05970
 *  minecraft.class06501
 *  minecraft.class07082
 *  minecraft.class07107
 *  minecraft.class07126
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class08036
 */
package minecraft;

import com.viaversion.viafabricplus.visuals.settings.VisualSettings;
import minecraft.class00392;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class02484;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class05970;
import minecraft.class06501;
import minecraft.class06506;
import minecraft.class06517;
import minecraft.class06570;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07082;
import minecraft.class07107;
import minecraft.class07126;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class08036;

public class class06586
extends class06581 {
    @Override
    public boolean L(class06584 class065842) {
        if (VisualSettings.INSTANCE.potionEnchantmentGlint.isEnabled()) {
            return ((class06517)((Object)class065842.a_(class02484.h, (Object)class06517.N))).L();
        }
        return super.L(class065842);
    }

    public class06586(class06573 class065732) {
        super(class065732);
    }

    @Override
    public class06584 E() {
        class06584 class065842 = super.E();
        class065842.N(class02484.h, new class06517(class06506.N));
        return class065842;
    }

    @Override
    public class00392 N(class06584 class065842) {
        class06517 class065172 = (class06517)((Object)class065842.method_58694(class02484.h));
        return class065172 != null ? class065172.N(this.W + ".effect.") : super.N(class065842);
    }

    @Override
    public class07082 N(class06501 class065012) {
        class07299 class072992 = class065012.method_8045();
        class07209 class072092 = class065012.method_8037();
        class08036 class080362 = class065012.method_8036();
        class06584 class065842 = class065012.method_8041();
        class06517 class065172 = (class06517)((Object)class065842.a_(class02484.h, (Object)class06517.N));
        class00500 class005002 = class072992.method_8320(class072092);
        if (class065012.method_8038() != class07211.field_11033 && class005002.N(class01210.Lw) && class065172.N(class06506.N)) {
            class072992.method_8396(null, class072092, class04909.Ex, class04911.field_15245, 1.0f, 1.0f);
            class080362.method_6122(class065012.method_20287(), class05970.N((class06584)class065842, (class08036)class080362, (class06584)new class06584(class06570.nP)));
            if (!class072992.method_8608()) {
                class04782 class047822 = (class04782)class072992;
                for (int i = 0; i < 5; ++i) {
                    class047822.method_65096((class07126)class07107.NT, (double)class072092.method_10263() + class072992.field_9229.U(), (double)(class072092.method_10264() + 1), (double)class072092.method_10260() + class072992.field_9229.U(), 1, 0.0, 0.0, 0.0, 1.0);
                }
            }
            class072992.method_8396(null, class072092, class04909.Lc, class04911.field_15245, 1.0f, 1.0f);
            class072992.N(null, (class03556)class01194.w, class072092);
            class072992.method_8501(class072092, class00869.nB.W());
            return class07082.N;
        }
        return class07082.i;
    }
}

