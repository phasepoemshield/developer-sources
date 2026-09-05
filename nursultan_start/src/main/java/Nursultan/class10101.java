/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03011
 *  minecraft.class04039
 *  minecraft.class05041
 */
package Nursultan;

import Nursultan.class10097;
import minecraft.class03011;
import minecraft.class04039;
import minecraft.class05041;

public class class10101
extends class10097 {
    final /* synthetic */ class04039 N;
    final /* synthetic */ class05041 y;
    final /* synthetic */ class03011 i;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class10101(class03011 class030112, class04039 class040392, class05041 class050412) {
        this.i = class030112;
        this.N = class040392;
        this.y = class050412;
        super(class040392);
    }

    protected boolean N() {
        double d = this.y.N((double)this.L.z, 0.0, (double)this.L.U);
        return d >= this.i.L() && d <= this.i.u();
    }
}

