/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  java.lang.MatchException
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00891
 *  minecraft.class01231
 *  minecraft.class01362
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class05487
 *  minecraft.class06069
 *  minecraft.class06084
 *  minecraft.class06092
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06942
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07438
 *  minecraft.class08054
 *  minecraft.class08064
 *  minecraft.class08092
 *  minecraft.class08713
 *  minecraft.class08791
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00891;
import minecraft.class01231;
import minecraft.class01362;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class05487;
import minecraft.class06069;
import minecraft.class06084;
import minecraft.class06092;
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06942;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07438;
import minecraft.class08054;
import minecraft.class08064;
import minecraft.class08092;
import minecraft.class08713;
import minecraft.class08791;
import org.jspecify.annotations.Nullable;

public class class07007
extends class00891
implements class06084 {
    public static final MapCodec<class07007> N = class07007.y(class07007::new);
    public static final class08064<class08054> y = class06665.yW;
    public static final class06667 L = class06665.q;
    private static final class00494 u = class00891.y((double)16.0, (double)0.0, (double)8.0);
    private static final class00494 i = class00891.y((double)16.0, (double)8.0, (double)16.0);

    public class07007(class01362 class013622) {
        super(class013622);
        this.P((class00500)((class00500)this.W().y(y, (Comparable)class08054.field_12681)).y((class08092)L, (Comparable)Boolean.valueOf(false)));
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)L)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)L)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    public boolean N(class07284 class072842, class07209 class072092, class00500 class005002, class04688 class046882) {
        if (class005002.L(y) != class08054.field_12682) {
            return super.N(class072842, class072092, class005002, class046882);
        }
        return false;
    }

    public boolean N(@Nullable class07438 class074382, class07290 class072902, class07209 class072092, class00500 class005002, class04651 class046512) {
        if (class005002.L(y) != class08054.field_12682) {
            return super.N(class074382, class072902, class072092, class005002, class046512);
        }
        return false;
    }

    public MapCodec<? extends class07007> N() {
        return N;
    }

    protected boolean N(class00500 class005002, class08791 class087912) {
        switch (class087912) {
            case field_50: {
                return false;
            }
            case field_48: {
                return class005002.Y().N(class01231.N);
            }
            case field_51: {
                return false;
            }
        }
        return false;
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y, L});
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        return switch ((class08054)class005002.L(y)) {
            default -> throw new MatchException(null, null);
            case class08054.field_12679 -> i;
            case class08054.field_12681 -> u;
            case class08054.field_12682 -> class00389.y();
        };
    }

    public @Nullable class00500 N(class06942 class069422) {
        class07209 class072092 = class069422.method_8037();
        class00500 class005002 = class069422.method_8045().method_8320(class072092);
        if (class005002.N((class00891)this)) {
            return (class00500)((class00500)class005002.y(y, (Comparable)class08054.field_12682)).y((class08092)L, (Comparable)Boolean.valueOf(false));
        }
        class04688 class046882 = class069422.method_8045().method_8316(class072092);
        class00500 class005003 = (class00500)((class00500)this.W().y(y, (Comparable)class08054.field_12681)).y((class08092)L, (Comparable)Boolean.valueOf(class046882.N() == class04684.L));
        class07211 class072112 = class069422.method_8038();
        if (class072112 == class07211.field_11033 || class072112 != class07211.field_11036 && class069422.method_17698().B - (double)class072092.method_10264() > 0.5) {
            return (class00500)class005003.y(y, (Comparable)class08054.field_12679);
        }
        return class005003;
    }

    protected boolean N(class00500 class005002, class06942 class069422) {
        class06584 class065842 = class069422.method_8041();
        class08054 class080542 = (class08054)class005002.L(y);
        if (class080542 == class08054.field_12682 || !class065842.N(this.B())) {
            return false;
        }
        if (class069422.y()) {
            boolean bl = class069422.method_17698().B - (double)class069422.method_8037().method_10264() > 0.5;
            class07211 class072112 = class069422.method_8038();
            if (class080542 == class08054.field_12681) {
                return class072112 == class07211.field_11036 || bl && class072112.z().L();
            }
            return class072112 == class07211.field_11033 || !bl && class072112.z().L();
        }
        return true;
    }

    protected boolean a_(class00500 class005002) {
        return class005002.L(y) != class08054.field_12682;
    }
}

