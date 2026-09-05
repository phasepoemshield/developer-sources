/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00235
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01137
 *  minecraft.class01362
 *  minecraft.class02484
 *  minecraft.class02733
 *  minecraft.class02841
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06183
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06942
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07796
 *  minecraft.class08036
 *  minecraft.class08064
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00235;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01137;
import minecraft.class01362;
import minecraft.class02484;
import minecraft.class02733;
import minecraft.class02841;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06183;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06942;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07796;
import minecraft.class08036;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08594;
import org.jspecify.annotations.Nullable;

public class class08620
extends class07796
implements class01137 {
    public static final MapCodec<class08620> N = class08620.y(class08620::new);
    public static final class08064<class00235> y = class06665.yo;

    public class08620(class01362 class013622) {
        super(class013622);
    }

    private static @Nullable class08594 N(class07299 class072992, class07209 class072092) {
        class00394 class003942;
        if (class072992 instanceof class04782 && (class003942 = ((class04782)class072992).method_8321(class072092)) instanceof class08594) {
            return (class08594)class003942;
        }
        return null;
    }

    public int N_8(class00500 class005002, class07290 class072902, class07209 class072092, class07211 class072112) {
        if (class005002.L(y) != class00235.field_56024) {
            return 0;
        }
        class00394 class003942 = class072902.method_8321(class072092);
        if (class003942 instanceof class08594) {
            return ((class08594)class003942).y() ? 15 : 0;
        }
        return 0;
    }

    public class06584 N(class05487 class054872, class07209 class072092, class00500 class005002, boolean bl) {
        return class08620.N(super.N(class054872, class072092, class005002, bl), (class00235)class005002.L(y));
    }

    public static class06584 N(class06584 class065842, class00235 class002352) {
        class065842.N(class02484.Nl, (Object)((class02841)class065842.a_(class02484.Nl, (Object)class02841.N)).N(y, (Comparable)class002352));
        return class065842;
    }

    protected MapCodec<class08620> N() {
        return N;
    }

    protected void N(class00500 class005002, class07299 class072992, class07209 class072092, class00891 class008912, @Nullable class02733 class027332, boolean bl) {
        class08594 class085942 = class08620.N(class072992, class072092);
        if (class085942 == null) {
            return;
        }
        if (class085942.L() == class00235.field_56024) {
            return;
        }
        boolean bl2 = class072992.W(class072092);
        boolean bl3 = class085942.y();
        if (bl2 && !bl3) {
            class085942.N(true);
            class085942.R();
        } else if (!bl2 && bl3) {
            class085942.N(false);
        }
    }

    public class00500 N(class06942 class069422) {
        class00235 class002352;
        class02841 class028412 = (class02841)class069422.method_8041().method_58694(class02484.Nl);
        class00500 class005002 = this.W();
        if (class028412 != null && (class002352 = (class00235)class028412.N(y)) != null) {
            class005002 = (class00500)class005002.y(y, (Comparable)class002352);
        }
        return class005002;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y});
    }

    protected class07082 N(class00500 class005002, class07299 class072992, class07209 class072092, class08036 class080362, class06183 class061832) {
        class00394 class003942 = class072992.method_8321(class072092);
        if (!(class003942 instanceof class08594)) {
            return class07082.i;
        }
        class08594 class085942 = (class08594)class003942;
        if (!class080362.method_7338()) {
            return class07082.i;
        }
        if (class072992.method_8608()) {
            class080362.method_66695(class085942);
        }
        return class07082.N;
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        class08594 class085942 = class08620.N((class07299)class047822, class072092);
        if (class085942 == null) {
            return;
        }
        class085942.u();
    }

    public @Nullable class00394 N(class07209 class072092, class00500 class005002) {
        return new class08594(class072092, class005002);
    }
}

