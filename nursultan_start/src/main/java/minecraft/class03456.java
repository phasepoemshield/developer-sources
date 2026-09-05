/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import minecraft.class03425;
import minecraft.class03428;
import minecraft.class03441;
import minecraft.class03444;
import minecraft.class03447;
import minecraft.class03457;

class class03456
implements class03428 {
    private final int y;
    final /* synthetic */ class03425 N;

    class03456(class03425 class034252, int n) {
        this.N = class034252;
        this.y = n;
    }

    @Override
    public class03428 N() {
        return new class03456(this.N, this.y + 1);
    }

    @Override
    public void N(class03457 class034572, class03447<?> class034472) {
        this.N.y.computeIfAbsent(new class03441(class034572, this.y), class034412 -> new class03444()).N(this.N.N, class034472);
    }
}

