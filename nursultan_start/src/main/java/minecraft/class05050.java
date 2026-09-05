/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06084
 *  minecraft.class06092
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06942
 *  minecraft.class07004
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class08092
 *  minecraft.class08713
 *  minecraft.class08791
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Map;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06084;
import minecraft.class06092;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06942;
import minecraft.class07004;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class08092;
import minecraft.class08713;
import minecraft.class08791;

public class class05050
extends class07004
implements class06084 {
    public static final MapCodec<class05050> u = class05050.y(class05050::new);
    public static final class06667 i = class06665.q;
    private static final Map<class07185, class00494> N = class00389.y((class00494)class00891.N((double)3.0, (double)3.0, (double)16.0));

    public class05050(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)this.Q.y()).y((class08092)i, (Comparable)Boolean.valueOf(false))).y((class08092)L, (Comparable)class07185.field_11052));
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)i)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{i}).N(new class08092[]{L});
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    public MapCodec<? extends class05050> N() {
        return u;
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)i)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    public class00500 N(class06942 class069422) {
        boolean bl = class069422.method_8045().method_8316(class069422.method_8037()).N() == class04684.L;
        return (class00500)super.N(class069422).y((class08092)i, (Comparable)Boolean.valueOf(bl));
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return N.get(class005002.L((class08092)L));
    }
}

