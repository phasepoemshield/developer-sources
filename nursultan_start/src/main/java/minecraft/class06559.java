/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  minecraft.class03568
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07267
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07881
 *  minecraft.class08036
 */
package minecraft;

import com.google.common.collect.Maps;
import java.util.Map;
import minecraft.class03568;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06563;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07267;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07881;
import minecraft.class08036;

public class class06559
extends class06581
implements class03568 {
    private static final Map<class06563, class06559> N = Maps.newEnumMap(class06563.class);
    private final class06563 y;

    public class06559(class06563 class065632, class06573 class065732) {
        super(class065732);
        this.y = class065632;
        N.put(class065632, this);
    }

    public static class06559 N(class06563 class065632) {
        return N.get((Object)class065632);
    }

    public boolean N(class07299 class072992, class07267 class072672, boolean bl, class08036 class080362) {
        if (class072672.N(class036102 -> class036102.N(this.N()), bl)) {
            class072992.method_8396(null, class072672.d(), class04909.zn, class04911.field_15245, 1.0f, 1.0f);
            return true;
        }
        return false;
    }

    @Override
    public class07082 N(class06584 class065842, class08036 class080362, class07438 class074382, class07050 class070502) {
        class07881 class078812;
        if (class074382 instanceof class07881 && (class078812 = (class07881)class074382).method_5805() && !class078812.m() && class078812.W() != this.y) {
            class078812.method_73183().method_43129((class07049)class080362, (class07049)class078812, class04909.zn, class04911.field_15248, 1.0f, 1.0f);
            if (!class080362.method_73183().method_8608()) {
                class078812.N(this.y);
                class065842.B(1);
            }
            return class07082.N;
        }
        return class07082.i;
    }

    public class06563 N() {
        return this.y;
    }
}

