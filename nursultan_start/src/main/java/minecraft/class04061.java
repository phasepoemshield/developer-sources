/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01155
 *  minecraft.class01164
 *  minecraft.class01190
 *  minecraft.class01194
 *  minecraft.class03481
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class06370
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class01155;
import minecraft.class01164;
import minecraft.class01190;
import minecraft.class01194;
import minecraft.class03481;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class04007;
import minecraft.class04093;
import minecraft.class04782;
import minecraft.class06370;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

class class04061
implements class03481 {
    private static final int y = 8;
    private final class01190 L;
    final /* synthetic */ class04093 N;

    public class04061(class04093 class040932) {
        this.N = class040932;
        this.L = new class01155(class040932.U);
    }

    public boolean i() {
        return true;
    }

    public void u() {
        this.N.method_5431();
    }

    public class01190 y() {
        return this.L;
    }

    public boolean N(class04782 class047822, class07209 class072092, class03556<class01194> class035562, class01164 class011642) {
        return (Boolean)this.N.w().L((class08092)class04007.y) == false && class04093.N(class011642.N()) != null;
    }

    public void N(class04782 class047822, class07209 class072092, class03556<class01194> class035562, @Nullable class07049 class070492, @Nullable class07049 class070493, float f) {
        this.N.N(class047822, class04093.N(class070493 != null ? class070493 : class070492));
    }

    public int N() {
        return 8;
    }

    public class03530<class01194> R() {
        return class06370.L;
    }
}

