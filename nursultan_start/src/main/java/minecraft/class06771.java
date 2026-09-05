/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06901
 *  minecraft.class06942
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07221
 *  minecraft.class07290
 *  minecraft.class08092
 *  minecraft.class08713
 *  minecraft.class08791
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06901;
import minecraft.class06942;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07221;
import minecraft.class07290;
import minecraft.class08092;
import minecraft.class08713;
import minecraft.class08791;

public class class06771
extends class06901 {
    public static final MapCodec<class06771> N = class06771.y(class06771::new);

    public class06771(class01362 class013622) {
        super(10.0f, class013622);
        this.P((class00500)((class00500)((class00500)((class00500)((class00500)((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)Boolean.valueOf(false))).y((class08092)L, (Comparable)Boolean.valueOf(false))).y((class08092)u, (Comparable)Boolean.valueOf(false))).y((class08092)i, (Comparable)Boolean.valueOf(false))).y((class08092)R, (Comparable)Boolean.valueOf(false))).y((class08092)M, (Comparable)Boolean.valueOf(false)));
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L, u, i, R, M});
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        if (!class005002.N((class05487)class047822, class072092)) {
            class047822.N(class072092, true);
        }
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    public MapCodec<class06771> N() {
        return N;
    }

    public class00500 N(class06942 class069422) {
        return class06771.N((class07290)class069422.method_8045(), class069422.method_8037(), this.W());
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (!class005002.N(class054872, class072092)) {
            class087132.N(class072092, (class00891)this, 1);
            return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
        }
        boolean bl = class005003.N((class00891)this) || class005003.N(class00869.Eb) || class072112 == class07211.field_11033 && class005003.N(class00869.MP);
        return (class00500)class005002.y((class08092)B.get(class072112), (Comparable)Boolean.valueOf(bl));
    }

    public static class00500 N(class07290 class072902, class07209 class072092, class00500 class005002) {
        class00500 class005003 = class072902.method_8320(class072092.method_10074());
        class00500 class005004 = class072902.method_8320(class072092.method_10084());
        class00500 class005005 = class072902.method_8320(class072092.method_10095());
        class00500 class005006 = class072902.method_8320(class072092.method_10078());
        class00500 class005007 = class072902.method_8320(class072092.method_10072());
        class00500 class005008 = class072902.method_8320(class072092.method_10067());
        class00891 class008912 = class005002.i();
        return (class00500)((class00500)((class00500)((class00500)((class00500)((class00500)class005002.L((class08092)M, (Comparable)Boolean.valueOf(class005003.N(class008912) || class005003.N(class00869.Eb) || class005003.N(class00869.MP)))).L((class08092)R, (Comparable)Boolean.valueOf(class005004.N(class008912) || class005004.N(class00869.Eb)))).L((class08092)y, (Comparable)Boolean.valueOf(class005005.N(class008912) || class005005.N(class00869.Eb)))).L((class08092)L, (Comparable)Boolean.valueOf(class005006.N(class008912) || class005006.N(class00869.Eb)))).L((class08092)u, (Comparable)Boolean.valueOf(class005007.N(class008912) || class005007.N(class00869.Eb)))).L((class08092)i, (Comparable)Boolean.valueOf(class005008.N(class008912) || class005008.N(class00869.Eb)));
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        class00500 class005003 = class054872.method_8320(class072092.method_10074());
        boolean bl = !class054872.method_8320(class072092.method_10084()).P() && !class005003.P();
        for (class07211 class072112 : class07221.field_11062) {
            class07209 class072093 = class072092.method_10093(class072112);
            if (!class054872.method_8320(class072093).N((class00891)this)) continue;
            if (bl) {
                return false;
            }
            class00500 class005004 = class054872.method_8320(class072093.method_10074());
            if (!class005004.N((class00891)this) && !class005004.N(class00869.MP)) continue;
            return true;
        }
        return class005003.N((class00891)this) || class005003.N(class00869.MP);
    }
}

