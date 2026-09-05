/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06667
 *  minecraft.class06901
 *  minecraft.class06942
 *  minecraft.class06993
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class08092
 *  minecraft.class08713
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Map;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06667;
import minecraft.class06901;
import minecraft.class06942;
import minecraft.class06993;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class08092;
import minecraft.class08713;

public class class00746
extends class00891 {
    public static final MapCodec<class00746> N = class00746.y(class00746::new);
    public static final class06667 y = class06901.y;
    public static final class06667 L = class06901.L;
    public static final class06667 u = class06901.u;
    public static final class06667 i = class06901.i;
    public static final class06667 R = class06901.R;
    public static final class06667 M = class06901.M;
    private static final Map<class07211, class06667> B = class06901.B;

    public class00746(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)((class00500)((class00500)((class00500)((class00500)this.Q.y()).y((class08092)y, (Comparable)Boolean.valueOf(true))).y((class08092)L, (Comparable)Boolean.valueOf(true))).y((class08092)u, (Comparable)Boolean.valueOf(true))).y((class08092)i, (Comparable)Boolean.valueOf(true))).y((class08092)R, (Comparable)Boolean.valueOf(true))).y((class08092)M, (Comparable)Boolean.valueOf(true)));
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{R, M, y, L, u, i});
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return (class00500)((class00500)((class00500)((class00500)((class00500)((class00500)class005002.y((class08092)B.get(class071112.y(class07211.field_11043)), (Comparable)((Boolean)class005002.L((class08092)y)))).y((class08092)B.get(class071112.y(class07211.field_11035)), (Comparable)((Boolean)class005002.L((class08092)u)))).y((class08092)B.get(class071112.y(class07211.field_11034)), (Comparable)((Boolean)class005002.L((class08092)L)))).y((class08092)B.get(class071112.y(class07211.field_11039)), (Comparable)((Boolean)class005002.L((class08092)i)))).y((class08092)B.get(class071112.y(class07211.field_11036)), (Comparable)((Boolean)class005002.L((class08092)R)))).y((class08092)B.get(class071112.y(class07211.field_11033)), (Comparable)((Boolean)class005002.L((class08092)M)));
    }

    public MapCodec<class00746> N() {
        return N;
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)((class00500)((class00500)((class00500)((class00500)((class00500)class005002.y((class08092)B.get(class069932.N(class07211.field_11043)), (Comparable)((Boolean)class005002.L((class08092)y)))).y((class08092)B.get(class069932.N(class07211.field_11035)), (Comparable)((Boolean)class005002.L((class08092)u)))).y((class08092)B.get(class069932.N(class07211.field_11034)), (Comparable)((Boolean)class005002.L((class08092)L)))).y((class08092)B.get(class069932.N(class07211.field_11039)), (Comparable)((Boolean)class005002.L((class08092)i)))).y((class08092)B.get(class069932.N(class07211.field_11036)), (Comparable)((Boolean)class005002.L((class08092)R)))).y((class08092)B.get(class069932.N(class07211.field_11033)), (Comparable)((Boolean)class005002.L((class08092)M)));
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (class005003.N((class00891)this)) {
            return (class00500)class005002.y((class08092)B.get(class072112), (Comparable)Boolean.valueOf(false));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    public class00500 N(class06942 class069422) {
        class07299 class072992 = class069422.method_8045();
        class07209 class072092 = class069422.method_8037();
        return (class00500)((class00500)((class00500)((class00500)((class00500)((class00500)this.W().y((class08092)M, (Comparable)Boolean.valueOf(!class072992.method_8320(class072092.method_10074()).N((class00891)this)))).y((class08092)R, (Comparable)Boolean.valueOf(!class072992.method_8320(class072092.method_10084()).N((class00891)this)))).y((class08092)y, (Comparable)Boolean.valueOf(!class072992.method_8320(class072092.method_10095()).N((class00891)this)))).y((class08092)L, (Comparable)Boolean.valueOf(!class072992.method_8320(class072092.method_10078()).N((class00891)this)))).y((class08092)u, (Comparable)Boolean.valueOf(!class072992.method_8320(class072092.method_10072()).N((class00891)this)))).y((class08092)i, (Comparable)Boolean.valueOf(!class072992.method_8320(class072092.method_10067()).N((class00891)this)));
    }
}

