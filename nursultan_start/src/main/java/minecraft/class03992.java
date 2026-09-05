/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01164
 *  minecraft.class01177
 *  minecraft.class01190
 *  minecraft.class01194
 *  minecraft.class03481
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class04909
 *  minecraft.class05378
 *  minecraft.class06244
 *  minecraft.class06370
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Optional;
import minecraft.class01164;
import minecraft.class01177;
import minecraft.class01190;
import minecraft.class01194;
import minecraft.class03481;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class03984;
import minecraft.class04003;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class05378;
import minecraft.class06244;
import minecraft.class06370;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07438;
import org.jspecify.annotations.Nullable;

class class03992
implements class03481 {
    private static final int y = 16;
    private final class01190 L;
    final /* synthetic */ class04003 N;

    public boolean L() {
        return true;
    }

    class03992(class04003 class040032) {
        this.N = class040032;
        this.L = new class01177((class07049)this.N, this.N.method_5751());
    }

    public class01190 y() {
        return this.L;
    }

    public boolean N(class04782 class047822, class07209 class072092, class03556<class01194> class035562, class01164 class011642) {
        class07438 class074382;
        if (this.N.Nt() || this.N.method_29504() || this.N.method_18868().N(class05378.Nf) || this.N.M() || !class047822.method_8621().N(class072092)) {
            return false;
        }
        class07049 class070492 = class011642.N();
        return !(class070492 instanceof class07438) || this.N.L((class07049)(class074382 = (class07438)class070492));
    }

    public void N(class04782 class047822, class07209 class072092, class03556<class01194> class035562, @Nullable class07049 class070492, @Nullable class07049 class070493, float f) {
        if (this.N.method_29504()) {
            return;
        }
        class04003.N(this.N).N(class05378.Nf, (Object)class06244.field_17274, 40L);
        class047822.method_8421((class07049)this.N, (byte)61);
        this.N.method_5783(class04909.Ij, 5.0f, this.N.method_6017());
        class07209 class072093 = class072092;
        if (class070493 != null) {
            if (this.N.method_24516(class070493, 30.0)) {
                if (this.N.method_18868().N(class05378.Ne)) {
                    if (this.N.L(class070493)) {
                        class072093 = class070493.method_24515();
                    }
                    this.N.i(class070493);
                } else {
                    this.N.N(class070493, 10, true);
                }
            }
            this.N.method_18868().N(class05378.Ne, (Object)class06244.field_17274, 100L);
        } else {
            this.N.i(class070492);
        }
        if (!this.N.W().u()) {
            Optional<class07438> var8 = this.N.M.N();
            if (class070493 != null || var8.isEmpty() || var8.get() == class070492) {
                class03984.N(this.N, class072093);
            }
        }
    }

    public int N() {
        return 16;
    }

    public class03530<class01194> R() {
        return class06370.y;
    }
}

