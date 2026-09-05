/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03033
 *  minecraft.class04039
 */
package Nursultan;

import Nursultan.class10099;
import minecraft.class03033;
import minecraft.class04039;

public class class10091
extends class10099 {
    final /* synthetic */ class04039 N;
    final /* synthetic */ class03033 y;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class10091(class03033 class030332, class04039 class040392) {
        this.y = class030332;
        this.N = class040392;
        super(class040392);
    }

    protected boolean N() {
        return this.L.T == Integer.MIN_VALUE || this.L.s + (this.y.u() ? this.L.j : 0) >= this.L.T + this.y.y() + this.L.E * this.y.L();
    }
}

