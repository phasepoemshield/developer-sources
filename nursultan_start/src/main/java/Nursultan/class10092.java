/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03037
 *  minecraft.class04039
 *  minecraft.class04995
 */
package Nursultan;

import Nursultan.class10099;
import minecraft.class03037;
import minecraft.class04039;
import minecraft.class04995;

public class class10092
extends class10099 {
    final /* synthetic */ class04039 N;
    final /* synthetic */ boolean y;
    final /* synthetic */ class03037 i;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class10092(class03037 class030372, class04039 class040392, boolean bl) {
        this.i = class030372;
        this.N = class040392;
        this.y = bl;
        super(class040392);
    }

    protected boolean N() {
        int n = this.y ? this.L.b : this.L.j;
        int n2 = this.i.L() ? this.L.E : 0;
        int n3 = this.i.u() == 0 ? 0 : (int)class04995.y((double)this.L.N(), (double)-1.0, (double)1.0, (double)0.0, (double)this.i.u());
        return n <= 1 + this.i.y() + n2 + n3;
    }
}

