/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03099
 */
package minecraft;

import java.util.List;
import minecraft.class01714;
import minecraft.class01739;
import minecraft.class01742;
import minecraft.class01752;
import minecraft.class03099;

public class class01722<T, P>
implements class01742<T> {
    private final class01739<T, P> N;
    private final List<P> y;
    private final class01714<T> L;
    private int u;

    private class01722(class01739<T, P> class017392, List<P> list, class03099 class030992) {
        this.N = class017392;
        this.y = list;
        this.L = new class01714(class030992, this);
    }

    @Override
    public void execute(class01752<T> class017522, class03099 class030992) {
        P p = this.y.get(this.u);
        class017522.N(this.N.create(class030992, p));
        if (++this.u < this.y.size()) {
            class017522.N(this.L);
        }
    }

    public static <T, P> void N(class01752<T> class017522, class03099 class030992, List<P> list, class01739<T, P> class017392) {
        switch (list.size()) {
            case 0: {
                break;
            }
            case 1: {
                class017522.N(class017392.create(class030992, list.get(0)));
                break;
            }
            case 2: {
                class017522.N(class017392.create(class030992, list.get(0)));
                class017522.N(class017392.create(class030992, list.get(1)));
                break;
            }
            default: {
                class017522.N(new class01722<T, P>(class017392, list, (class03099)class030992).L);
            }
        }
    }
}

