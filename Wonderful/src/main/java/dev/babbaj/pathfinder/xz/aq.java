package dev.babbaj.pathfinder.xz;

import dev.babbaj.pathfinder.xz.am;
import dev.babbaj.pathfinder.xz.ap;

public final class aq
extends am {

    private aq(ap ap2) {
        this.a = ap2;
        super(ap2);
    }

    public final int a(int n2) {
        if (this.a.a.a(((am)(Object)this).a, 0) == 0) {
            return this.a.a.a(((am)(Object)this).a[n2]) + 2;
        }
        if (this.a.a.a(((am)(Object)this).a, 1) == 0) {
            return this.a.a.a(this.b[n2]) + 2 + 8;
        }
        return this.a.a.a(this.b) + 2 + 8 + 8;
    }
}