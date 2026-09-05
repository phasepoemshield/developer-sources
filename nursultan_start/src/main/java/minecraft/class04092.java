/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Collection;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class04063;
import minecraft.class04065;
import minecraft.class04076;
import minecraft.class04083;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import org.jspecify.annotations.Nullable;

class class04092
implements class04065 {
    class04092() {
    }

    @Override
    public int N(class04083 class040832, class07284 class072842, class07209 class072092, class06069 class060692, class04076 class040762, boolean bl) {
        return class040832.L() > 0 ? class040832.y() : 0;
    }

    @Override
    public boolean N(class07284 class072842, class07209 class072092, class00500 class005002, @Nullable Collection<class07211> collection, boolean bl) {
        if (collection == null) {
            return ((class04063)class00869.bf).i().N(class072842.method_8320(class072092), class072842, class072092, bl) > 0L;
        }
        if (!collection.isEmpty()) {
            if (class005002.P() || class005002.Y().y((class04651)class04684.L)) {
                return class04063.N(class072842, class072092, class005002, collection);
            }
            return false;
        }
        return class04065.super.N(class072842, class072092, class005002, collection, bl);
    }

    @Override
    public int f_(int n) {
        return Math.max(n - 1, 0);
    }
}

