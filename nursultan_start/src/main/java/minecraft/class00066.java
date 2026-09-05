/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01140
 *  minecraft.class01226
 *  minecraft.class01237
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class04802
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06271
 *  minecraft.class06851
 *  minecraft.class07311
 *  minecraft.class08670
 *  minecraft.class08684
 */
package minecraft;

import minecraft.class01140;
import minecraft.class01226;
import minecraft.class01237;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class04802;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06271;
import minecraft.class06851;
import minecraft.class07311;
import minecraft.class08670;
import minecraft.class08684;

public class class00066<M extends class08684>
extends class06249<class08670, M> {
    private final class07311 N;
    private final class08684 y;
    private final class08684 L;

    public class00066(class06252<class08670, M> class062522, class01140 class011402, class01894 class018942) {
        super(class062522);
        this.N = class06851.M((class01894)class018942);
        this.y = new class08684(class011402.N(class04802.yj));
        this.L = new class08684(class011402.N(class04802.yv));
    }

    public void N(class01421 class014212, class01237 class012372, int n, class08670 class086702, float f, float f2) {
        if (!class086702.L || !class086702.N.N(class01226.NH)) {
            return;
        }
        class08684 class086842 = class086702.NB ? this.L : this.y;
        class012372.N((class06271)class086842, (Object)class086702, class014212, this.N, n, class01384.u, class086702.l, null);
    }
}

