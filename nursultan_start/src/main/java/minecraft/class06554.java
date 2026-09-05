/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00679
 *  minecraft.class00693
 *  minecraft.class00698
 *  minecraft.class00710
 *  minecraft.class01194
 *  minecraft.class02254
 *  minecraft.class02484
 *  minecraft.class03556
 *  minecraft.class06497
 *  minecraft.class06501
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08562
 */
package minecraft;

import java.util.Optional;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class00679;
import minecraft.class00693;
import minecraft.class00698;
import minecraft.class00710;
import minecraft.class01194;
import minecraft.class02254;
import minecraft.class02484;
import minecraft.class03556;
import minecraft.class06497;
import minecraft.class06501;
import minecraft.class06541;
import minecraft.class06573;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06591;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08562;

public class class06554
extends class06581 {
    private static final class00392 N = class00392.L((String)"painting.random").N(class06541.field_1080);
    private final class07078<? extends class00710> y;

    public class06554(class07078<? extends class00710> class070782, class06573 class065732) {
        super(class065732);
        this.y = class070782;
    }

    @Override
    public class07082 N(class06501 class065012) {
        class00679 class006792;
        class07209 class072092 = class065012.method_8037();
        class07211 class072112 = class065012.method_8038();
        class07209 class072093 = class072092.method_10093(class072112);
        class08036 class080362 = class065012.method_8036();
        class06584 class065842 = class065012.method_8041();
        if (class080362 != null && !this.N(class080362, class072112, class065842, class072093)) {
            return class07082.u;
        }
        class07299 class072992 = class065012.method_8045();
        if (this.y == class07078.NF) {
            Optional var9 = class00698.N((class07299)class072992, (class07209)class072093, (class07211)class072112);
            if (var9.isEmpty()) {
                return class07082.L;
            }
            class006792 = (class00710)var9.get();
        } else if (this.y == class07078.Nl) {
            class006792 = new class00679(class072992, class072093, class072112);
        } else if (this.y == class07078.NU) {
            class006792 = new class02254(class072992, class072093, class072112);
        } else {
            return class07082.N;
        }
        class07078.N((class07299)class072992, (class06584)class065842, (class07438)class080362).accept(class006792);
        if (class006792.y()) {
            if (!class072992.method_8608()) {
                class006792.i();
                class072992.N((class07049)class080362, (class03556)class01194.v, class006792.method_73189());
                class072992.method_8649((class07049)class006792);
            }
            class065842.B(1);
            return class07082.N;
        }
        return class07082.L;
    }

    @Override
    public void N(class06584 class065842, class06591 class065912, class08562 class085622, Consumer<class00392> consumer, class06497 class064972) {
        if (this.y == class07078.NF && class085622.N(class02484.NC)) {
            class03556 class035562 = (class03556)class065842.method_58694(class02484.NC);
            if (class035562 != null) {
                ((class00693)class035562.N()).i().ifPresent(consumer);
                ((class00693)class035562.N()).R().ifPresent(consumer);
                consumer.accept((class00392)class00392.N((String)"painting.dimensions", (Object[])new Object[]{((class00693)class035562.N()).y(), ((class00693)class035562.N()).L()}));
            } else if (class064972.y()) {
                consumer.accept(N);
            }
        }
    }

    protected boolean N(class08036 class080362, class07211 class072112, class06584 class065842, class07209 class072092) {
        return !class072112.z().y() && class080362.method_7343(class072092, class072112, class065842);
    }
}

