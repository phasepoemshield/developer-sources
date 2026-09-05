/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04298
 *  minecraft.class04309
 *  minecraft.class04327
 *  minecraft.class07209
 */
package minecraft;

import java.util.function.Function;
import minecraft.class04298;
import minecraft.class04309;
import minecraft.class04327;
import minecraft.class07209;

public class class01628<T>
implements class04298<T> {
    private final Function<class07209, class04327<T>> N;

    public class01628(Function<class07209, class04327<T>> function) {
        this.N = function;
    }

    public boolean y(class07209 class072092, T t) {
        return false;
    }

    public int N() {
        return 0;
    }

    public void N(class04309<T> class043092) {
        this.N.apply(class043092.y()).N(class043092);
    }

    public boolean N(class07209 class072092, T t) {
        return this.N.apply(class072092).N(class072092, t);
    }
}

