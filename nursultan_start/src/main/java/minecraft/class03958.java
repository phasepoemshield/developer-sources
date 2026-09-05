/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class02083
 *  minecraft.class03047
 *  minecraft.class03385
 *  minecraft.class03407
 *  minecraft.class03409
 *  minecraft.class03412
 *  minecraft.class03791
 *  minecraft.class06541
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.Predicate;
import minecraft.class00392;
import minecraft.class02083;
import minecraft.class03047;
import minecraft.class03385;
import minecraft.class03407;
import minecraft.class03409;
import minecraft.class03412;
import minecraft.class03791;
import minecraft.class03926;
import minecraft.class06541;
import org.jspecify.annotations.Nullable;

public class class03958 {
    private final class03407 N;
    private final class03791 y;
    private final Predicate<class03412> L;
    private @Nullable class02083 u = null;
    private int i;
    private int R;
    private @Nullable class03926 M;

    public class03958(class03409 class034092, Predicate<class03412> predicate) {
        this.N = class034092.y();
        this.y = new class03791(class034092.N().y().leadingContextMessageCount());
        this.L = predicate;
        this.i = this.N.y();
    }

    public void N(int n, class03385 class033852) {
        class03047 class030472;
        int n2 = 0;
        while (n2 < n && (class030472 = this.N.y(this.i)) != null) {
            class03412 class034122;
            int n3 = this.i--;
            if (!(class030472 instanceof class03412) || (class034122 = (class03412)class030472).M().equals((Object)this.M)) continue;
            if (this.N(class033852, class034122)) {
                if (this.R > 0) {
                    class033852.N((class00392)class00392.N((String)"gui.chatSelection.fold", (Object[])new Object[]{this.R}));
                    this.R = 0;
                }
                class033852.N(n3, class034122);
                ++n2;
            } else {
                ++this.R;
            }
            this.M = class034122.M();
        }
    }

    private boolean N(class03385 class033852, class03412 class034122) {
        class03926 class039262 = class034122.M();
        boolean bl = this.y.y(class039262);
        if (this.L.test(class034122)) {
            this.y.N(class039262);
            if (this.u != null && !this.u.N(class039262.U())) {
                class033852.N((class00392)class00392.N((String)"gui.chatSelection.join", (Object[])new Object[]{class034122.R().name()}).N(class06541.field_1054));
            }
            this.u = class039262.U();
            return true;
        }
        return bl;
    }
}

