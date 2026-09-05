/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00389
 *  minecraft.class00394
 *  minecraft.class00404
 *  minecraft.class00483
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00737
 *  minecraft.class00891
 *  minecraft.class01118
 *  minecraft.class01362
 *  minecraft.class04160
 *  minecraft.class05487
 *  minecraft.class06092
 *  minecraft.class06183
 *  minecraft.class06551
 *  minecraft.class06584
 *  minecraft.class06898
 *  minecraft.class06993
 *  minecraft.class07082
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07796
 *  minecraft.class08036
 *  minecraft.class08064
 *  minecraft.class08083
 *  minecraft.class08092
 *  minecraft.class08791
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Collections;
import java.util.List;
import minecraft.class00389;
import minecraft.class00394;
import minecraft.class00404;
import minecraft.class00483;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00510;
import minecraft.class00513;
import minecraft.class00517;
import minecraft.class00737;
import minecraft.class00891;
import minecraft.class01118;
import minecraft.class01362;
import minecraft.class04160;
import minecraft.class05487;
import minecraft.class06092;
import minecraft.class06183;
import minecraft.class06551;
import minecraft.class06584;
import minecraft.class06898;
import minecraft.class06993;
import minecraft.class07082;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07796;
import minecraft.class08036;
import minecraft.class08064;
import minecraft.class08083;
import minecraft.class08092;
import minecraft.class08791;
import org.jspecify.annotations.Nullable;

public class class00511
extends class07796 {
    public static final MapCodec<class00511> N = class00511.y(class00511::new);
    public static final class08064<class07211> y = class00483.y;
    public static final class08064<class08083> L = class00483.L;

    public class00511(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)((class00500)this.Q.y()).y(y, (Comparable)class07211.field_11043)).y(L, (Comparable)class08083.field_12637));
    }

    protected class00494 y_4(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        class00510 class005102 = this.N(class072902, class072092);
        if (class005102 != null) {
            return class005102.N(class072902, class072092);
        }
        return class00389.N();
    }

    protected class00500 N(class00500 class005002, class07111 class071112) {
        return class005002.N(class071112.N((class07211)class005002.L(y)));
    }

    protected class00500 N(class00500 class005002, class06993 class069932) {
        return (class00500)class005002.y(y, (Comparable)class069932.N((class07211)class005002.L(y)));
    }

    public class06584 N(class05487 class054872, class07209 class072092, class00500 class005002, boolean bl) {
        return class06584.E;
    }

    private @Nullable class00510 N(class07290 class072902, class07209 class072092) {
        class00394 class003942 = class072902.method_8321(class072092);
        if (class003942 instanceof class00510) {
            return (class00510)class003942;
        }
        return null;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L});
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        return false;
    }

    public MapCodec<class00511> N() {
        return N;
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        if (!class072992.method_8608() && class072992.method_8321(class072092) == null) {
            class072992.method_8650(class072092, false);
            return class07082.L;
        }
        return class07082.i;
    }

    public void N_7(class07284 class072842, class07209 class072092, class00500 class005002) {
        class07209 class072093 = class072092.method_10093(((class07211)class005002.L(y)).b());
        class00500 class005003 = class072842.method_8320(class072093);
        if (class005003.i() instanceof class00513 && ((Boolean)class005003.L((class08092)class00513.L)).booleanValue()) {
            class072842.method_8650(class072093, false);
        }
    }

    public <T extends class00394> @Nullable class01118<T> N(class07299 class072992, class00500 class005002, class00404<T> class004042) {
        return class00511.N(class004042, (class00404)class00404.field_11897, class00510::N);
    }

    public static class00394 N(class07209 class072092, class00500 class005002, class00500 class005003, class07211 class072112, boolean bl, boolean bl2) {
        return new class00510(class072092, class005002, class005003, class072112, bl, bl2);
    }

    public @Nullable class00394 N(class07209 class072092, class00500 class005002) {
        return null;
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return class00389.N();
    }

    protected List<class06584> N(class00500 class005002, class04160 class041602) {
        class00510 class005102 = this.N((class07290)class041602.N(), class07209.method_49638((class00737)((class00737)class041602.N(class06551.B))));
        if (class005102 == null) {
            return Collections.emptyList();
        }
        return class005102.M().N(class041602);
    }

    protected class06898 d_(class00500 class005002) {
        return class06898.field_11455;
    }
}

