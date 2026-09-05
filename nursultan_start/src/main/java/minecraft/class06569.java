/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01235
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08036
 */
package minecraft;

import minecraft.class01235;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class06548;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08036;

public class class06569
extends class06581 {
    public class06569(class06573 class065732) {
        super(class065732);
    }

    @Override
    public class07082 N(class07299 class072992, class08036 class080362, class07050 class070502) {
        class06584 class065842 = class080362.method_5998(class070502);
        if (!(class072992 instanceof class04782)) {
            return class07082.N;
        }
        class04782 class047822 = (class04782)class072992;
        class065842.N(1, (class07438)class080362);
        class080362.method_7259(class01235.L.y((Object)this));
        class047822.method_43129(null, (class07049)class080362, class04909.OH, class080362.method_5634(), 1.0f, 1.0f);
        class06584 class065843 = class06548.N(class047822, class080362.method_31477(), class080362.method_31479(), (byte)0, true, false);
        if (class065842.R()) {
            return class07082.N.N(class065843);
        }
        if (!class080362.method_31548().M(class065843.t())) {
            class080362.method_7328(class065843, false);
        }
        return class07082.N;
    }
}

