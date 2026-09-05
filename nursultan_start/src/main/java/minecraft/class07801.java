/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
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
 *  minecraft.class06584
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06898
 *  minecraft.class06942
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08092
 *  minecraft.class08713
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
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
import minecraft.class06584;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06898;
import minecraft.class06942;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08092;
import minecraft.class08713;
import org.jspecify.annotations.Nullable;

public class class07801
extends class00891
implements class06084 {
    public static final MapCodec<class07801> N = class07801.y(class07801::new);
    public static final class06667 y = class06665.q;

    public class07801(class01362 class013622) {
        super(class013622);
        this.P((class00500)this.W().y((class08092)y, (Comparable)Boolean.valueOf(false)));
    }

    protected class04688 u(class00500 class005002) {
        if (((Boolean)class005002.L((class08092)y)).booleanValue()) {
            return class04684.L.N(false);
        }
        return super.u(class005002);
    }

    protected float y(class00500 class005002, class07290 class072902, class07209 class072092) {
        return 1.0f;
    }

    protected boolean y(class00500 class005002) {
        return class005002.Y().W();
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{y});
    }

    public class06584 N(@Nullable class07438 class074382, class07284 class072842, class07209 class072092, class00500 class005002) {
        if (!(class074382 instanceof class08036) || !((class08036)class074382).method_68878()) {
            return class06584.E;
        }
        return super.N(class074382, class072842, class072092, class005002);
    }

    public boolean N(@Nullable class07438 class074382, class07290 class072902, class07209 class072092, class00500 class005002, class04651 class046512) {
        if (!(class074382 instanceof class08036) || !((class08036)class074382).method_68878()) {
            return false;
        }
        return super.N(class074382, class072902, class072092, class005002, class046512);
    }

    public @Nullable class00500 N(class06942 class069422) {
        return (class00500)this.W().y((class08092)y, (Comparable)Boolean.valueOf(class069422.method_8045().method_8316(class069422.method_8037()).N() == class04684.L));
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (((Boolean)class005002.L((class08092)y)).booleanValue()) {
            class087132.N(class072092, (class04651)class04684.L, class04684.L.N(class054872));
        }
        return super.N(class005002, class054872, class087132, class072092, class072112, class072093, class005003, class060692);
    }

    public MapCodec<class07801> N() {
        return N;
    }

    protected class06898 d_(class00500 class005002) {
        return class06898.field_11455;
    }
}

