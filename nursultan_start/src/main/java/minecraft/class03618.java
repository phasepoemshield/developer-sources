/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00753
 *  minecraft.class01164
 *  minecraft.class01177
 *  minecraft.class01190
 *  minecraft.class01194
 *  minecraft.class03481
 *  minecraft.class03630
 *  minecraft.class03645
 *  minecraft.class04782
 *  minecraft.class05378
 *  minecraft.class06289
 *  minecraft.class06370
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Optional;
import minecraft.class00753;
import minecraft.class01164;
import minecraft.class01177;
import minecraft.class01190;
import minecraft.class01194;
import minecraft.class03481;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class03630;
import minecraft.class03645;
import minecraft.class04782;
import minecraft.class05378;
import minecraft.class06289;
import minecraft.class06370;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07438;
import org.jspecify.annotations.Nullable;

class class03618
implements class03481 {
    private static final int y = 16;
    private final class01190 L;
    final /* synthetic */ class03630 N;

    class03618(class03630 class036302) {
        this.N = class036302;
        this.L = new class01177((class07049)this.N, this.N.method_5751());
    }

    public class01190 y() {
        return this.L;
    }

    public void N(class04782 class047822, class07209 class072092, class03556<class01194> class035562, @Nullable class07049 class070492, @Nullable class07049 class070493, float f) {
        if (class035562.N(class01194.o)) {
            class03645.N((class07438)this.N, (class07209)new class07209((class00753)class072092));
        }
    }

    public boolean N(class04782 class047822, class07209 class072092, class03556<class01194> class035562, class01164 class011642) {
        if (this.N.Nt()) {
            return false;
        }
        Optional var5 = this.N.method_18868().L(class05378.Nh);
        if (var5.isEmpty()) {
            return true;
        }
        class06289 class062892 = (class06289)var5.get();
        return class062892.N(class047822.method_27983(), this.N.method_24515(), 1024) && class062892.y().equals((Object)class072092);
    }

    public int N() {
        return 16;
    }

    public class03530<class01194> R() {
        return class06370.i;
    }
}

