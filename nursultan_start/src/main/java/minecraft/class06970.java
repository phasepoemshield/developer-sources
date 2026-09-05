/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00455
 *  minecraft.class00457
 *  minecraft.class00467
 *  minecraft.class06986
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07321
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.BiConsumer;
import minecraft.class00455;
import minecraft.class00457;
import minecraft.class00467;
import minecraft.class06963;
import minecraft.class06980;
import minecraft.class06986;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07321;
import org.jspecify.annotations.Nullable;

class class06970
implements class00457 {
    final /* synthetic */ class07299 N;
    final /* synthetic */ class06963 y;

    public <T> void L(class00455<T> class004552, BiConsumer<class07049, T> biConsumer) {
        this.y.N(class004552, class06963.L(), (uUID, object) -> {
            class07049 class070492 = this.N.method_66347(uUID);
            if (class070492 != null) {
                biConsumer.accept(class070492, object);
            }
        });
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class06970(class06963 class069632, class07299 class072992) {
        this.y = class069632;
        this.N = class072992;
    }

    public <T> void y(class00455<T> class004552, BiConsumer<class07209, T> biConsumer) {
        this.y.N(class004552, class06963.u(), biConsumer);
    }

    public <T> void N(class00455<T> class004552, class00467<T> class004672) {
        class06980<T> class069802 = this.y.N(class004552);
        if (class069802 == null) {
            return;
        }
        long l = this.N.N();
        for (class06986 class069862 : class069802.u) {
            int n = (int)(class069862.y() - l);
            int n2 = class004552.L();
            class004672.accept(class069862.N(), n, n2);
        }
    }

    public <T> @Nullable T N(class00455<T> class004552, class07049 class070492) {
        return this.y.N(class004552, class070492.method_5667(), class06963.L());
    }

    public <T> @Nullable T N(class00455<T> class004552, class07209 class072092) {
        return this.y.N(class004552, class072092, class06963.u());
    }

    public <T> @Nullable T N(class00455<T> class004552, class07321 class073212) {
        return this.y.N(class004552, class073212, class06963.i());
    }

    public <T> void N(class00455<T> class004552, BiConsumer<class07321, T> biConsumer) {
        this.y.N(class004552, class06963.i(), biConsumer);
    }
}

