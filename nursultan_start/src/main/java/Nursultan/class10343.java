/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00891
 *  minecraft.class02733
 *  minecraft.class02752
 *  minecraft.class03794
 *  minecraft.class04376
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07299
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import Nursultan.class10340;
import java.util.function.Consumer;
import minecraft.class00500;
import minecraft.class00891;
import minecraft.class02733;
import minecraft.class02752;
import minecraft.class03794;
import minecraft.class04376;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07299;
import org.jspecify.annotations.Nullable;

public final class class10343
implements class10340 {
    private final class07209 N;
    private final class00891 y;
    private @Nullable class02733 L;
    private final @Nullable class07211 u;
    private int i = 0;

    public class10343(class07209 class072092, class00891 class008912, @Nullable class02733 class027332, @Nullable class07211 class072112) {
        this.N = class072092;
        this.y = class008912;
        this.L = class027332;
        this.u = class072112;
        if (class04376.N[this.i] == class072112) {
            ++this.i;
        }
    }

    @Override
    public boolean N(class07299 class072992) {
        class07211 class072112 = class04376.N[this.i++];
        class07209 class072092 = this.N.method_10093(class072112);
        class00500 class005002 = class072992.method_8320(class072092);
        class02733 class027332 = null;
        if (class072992.method_45162().y(class03794.L)) {
            if (this.L == null) {
                this.L = class02752.N((class07299)class072992, (class07211)(this.u == null ? null : this.u.b()), null);
            }
            class027332 = this.L.y(class072112);
        }
        class04376.N((class07299)class072992, (class00500)class005002, (class07209)class072092, (class00891)this.y, (class02733)class027332, (boolean)false);
        if (this.i < class04376.N.length && class04376.N[this.i] == this.u) {
            ++this.i;
        }
        return this.i < class04376.N.length;
    }

    @Override
    public void N(Consumer<class07209> consumer) {
        for (class07211 class072112 : class04376.N) {
            if (class072112 == this.u) continue;
            class07209 class072092 = this.N.method_10093(class072112);
            consumer.accept(class072092);
        }
    }
}

