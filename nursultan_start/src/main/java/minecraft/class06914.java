/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00250
 *  minecraft.class01194
 *  minecraft.class01235
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class05835
 *  minecraft.class06113
 *  minecraft.class06183
 *  minecraft.class06573
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07042
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07078
 *  minecraft.class07082
 *  minecraft.class07089
 *  minecraft.class07113
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import minecraft.class00250;
import minecraft.class01194;
import minecraft.class01235;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class05835;
import minecraft.class06113;
import minecraft.class06183;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07089;
import minecraft.class07113;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class06914
extends class06581 {
    private final class07078<? extends class00250> N;

    public class06914(class07078<? extends class00250> class070782, class06573 class065732) {
        super(class065732);
        this.N = class070782;
    }

    public class07082 N(class07299 class072992, class08036 class080362, class07050 class070502) {
        class06889 class068892;
        class06584 class065842 = class080362.method_5998(class070502);
        class06183 class061832 = class06914.N((class07299)class072992, (class08036)class080362, (class05835)class05835.field_1347);
        if (class061832.N() == class07113.field_1333) {
            return class07082.i;
        }
        class06889 class068893 = class080362.method_5828(1.0f);
        double d = 5.0;
        List var9 = class072992.method_8333((class07049)class080362, class080362.method_5829().y(class068893.L(5.0)).M(1.0), class07042.B);
        if (!var9.isEmpty()) {
            class068892 = class080362.method_33571();
            for (class07049 class070492 : var9) {
                if (!class070492.method_5829().M((double)class070492.method_5871()).u(class068892)) continue;
                return class07082.i;
            }
        }
        if (class061832.N() == class07113.field_1332) {
            class068892 = this.N(class072992, (class07089)class061832, class065842, class080362);
            if (class068892 == null) {
                return class07082.u;
            }
            class068892.method_36456(class080362.method_36454());
            if (!class072992.method_8587((class07049)class068892, class068892.method_5829())) {
                return class07082.u;
            }
            if (!class072992.method_8608()) {
                class072992.method_8649((class07049)class068892);
                class072992.N((class07049)class080362, (class03556)class01194.v, class061832.y());
                class065842.N(1, (class07438)class080362);
            }
            class080362.method_7259(class01235.L.y((Object)this));
            return class07082.N;
        }
        return class07082.i;
    }

    private @Nullable class00250 N(class07299 class072992, class07089 class070892, class06584 class065842, class08036 class080362) {
        class00250 class002502 = (class00250)this.N.N(class072992, class06113.field_16465);
        if (class002502 != null) {
            class06889 class068892 = class070892.y();
            class002502.N(class068892.M, class068892.B, class068892.Z);
            if (class072992 instanceof class04782) {
                class07078.N((class07299)((class04782)class072992), (class06584)class065842, (class07438)class080362).accept(class002502);
            }
        }
        return class002502;
    }
}

