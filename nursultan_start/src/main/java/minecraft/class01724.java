/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03099
 *  minecraft.class03102
 *  minecraft.class03115
 */
package minecraft;

import java.util.List;
import minecraft.class01704;
import minecraft.class01711;
import minecraft.class01714;
import minecraft.class01716;
import minecraft.class01722;
import minecraft.class01747;
import minecraft.class01752;
import minecraft.class03099;
import minecraft.class03102;
import minecraft.class03115;

public class class01724<T extends class01711<T>>
implements class01716<T> {
    private final class01747<T> N;
    private final class03102 y;
    private final boolean L;

    public class01724(class01747<T> class017472, class03102 class031022, boolean bl) {
        this.N = class017472;
        this.y = class031022;
        this.L = bl;
    }

    @Override
    public void N(T t, class01752<T> class017522, class03099 class030993) {
        class017522.i();
        List<class01716<T>> list = this.N.y();
        class01704 class017042 = class017522.y();
        if (class017042 != null) {
            class017042.N(class030993.L(), this.N.N(), this.N.y().size());
        }
        int n = class030993.L() + 1;
        class03115 class031152 = this.L ? class030993.i() : class017522.y(n);
        class03099 class030994 = new class03099(n, this.y, class031152);
        class01722.N(class017522, class030994, list, (class030992, class017162) -> new class01714<class01711>(class030992, class017162.N(t)));
    }
}

