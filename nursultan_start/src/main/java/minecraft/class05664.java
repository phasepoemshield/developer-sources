/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02484
 *  minecraft.class02679
 *  minecraft.class02680
 *  minecraft.class02692
 *  minecraft.class03556
 *  minecraft.class04782
 *  minecraft.class05663
 *  minecraft.class06069
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07084
 *  minecraft.class07310
 *  minecraft.class07324
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import minecraft.class02484;
import minecraft.class02679;
import minecraft.class02680;
import minecraft.class02692;
import minecraft.class03556;
import minecraft.class04782;
import minecraft.class05663;
import minecraft.class06069;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07084;
import minecraft.class07310;
import minecraft.class07324;
import org.jspecify.annotations.Nullable;

public class class05664
implements class05663 {
    private final class02692 N;
    private final int y;
    private final float L;

    public class05664(class03556<class07084> class035562, int n, int n2) {
        this(new class02692(List.of(new class02679(class035562, n))), n2, 0.05f);
    }

    public class05664(class02692 class026922, int n, float f) {
        this.N = class026922;
        this.y = n;
        this.L = f;
    }

    public @Nullable class07324 N(class04782 class047822, class07049 class070492, class06069 class060692) {
        class06584 class065842 = new class06584((class07310)class06570.dk, 1);
        class065842.N(class02484.NN, (Object)this.N);
        return new class07324(new class02680((class07310)class06570.Ty), class065842, 12, this.y, this.L);
    }
}

