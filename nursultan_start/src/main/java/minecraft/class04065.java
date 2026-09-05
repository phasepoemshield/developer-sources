/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class08815
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Collection;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class04076;
import minecraft.class04083;
import minecraft.class04092;
import minecraft.class06069;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class08815;
import org.jspecify.annotations.Nullable;

public interface class04065 {
    public static final class04065 y_ = new class04092();

    default public byte L() {
        return 1;
    }

    default public boolean u() {
        return true;
    }

    public int N(class04083 var1, class07284 var2, class07209 var3, class06069 var4, class04076 var5, boolean var6);

    default public boolean N(class07284 class072842, class07209 class072092, class06069 class060692) {
        return false;
    }

    default public void N(class07284 class072842, class00500 class005002, class07209 class072092, class06069 class060692) {
    }

    default public boolean N(class07284 class072842, class07209 class072092, class00500 class005002, @Nullable Collection<class07211> collection, boolean bl) {
        return ((class08815)class00869.bf).y().N(class005002, class072842, class072092, bl) > 0L;
    }

    default public int f_(int n) {
        return 1;
    }
}

