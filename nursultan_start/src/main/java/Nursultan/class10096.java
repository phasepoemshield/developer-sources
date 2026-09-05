/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01818
 *  minecraft.class03005
 *  minecraft.class04039
 *  minecraft.class04995
 */
package Nursultan;

import Nursultan.class10099;
import minecraft.class01818;
import minecraft.class03005;
import minecraft.class04039;
import minecraft.class04995;

public class class10096
extends class10099 {
    final /* synthetic */ class04039 N;
    final /* synthetic */ int y;
    final /* synthetic */ int i;
    final /* synthetic */ class01818 R;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class10096(class03005 class030052, class04039 class040392, int n, int n2, class01818 class018182) {
        this.N = class040392;
        this.y = n;
        this.i = n2;
        this.R = class018182;
        super(class040392);
    }

    protected boolean N() {
        int n = this.L.s;
        if (n <= this.y) {
            return true;
        }
        if (n >= this.i) {
            return false;
        }
        double d = class04995.y((double)n, (double)this.y, (double)this.i, (double)1.0, (double)0.0);
        return (double)this.R.N(this.L.z, n, this.L.U).z() < d;
    }
}

