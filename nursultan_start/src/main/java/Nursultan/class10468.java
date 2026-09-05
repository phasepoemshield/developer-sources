/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00780
 *  minecraft.class03543
 *  minecraft.class04426
 *  minecraft.class04758
 *  minecraft.class06040
 *  minecraft.class07428
 *  minecraft.class07852
 */
package Nursultan;

import java.util.Map;
import minecraft.class00780;
import minecraft.class03543;
import minecraft.class04426;
import minecraft.class04758;
import minecraft.class06040;
import minecraft.class07428;
import minecraft.class07852;

public class class10468 {
    private final class03543<class00780> N;
    private Map<class07428, class04426> y = class04758.i.y();
    private class07852 L = class04758.i.L();
    private class06040 u = class04758.i.u();

    public class10468(class03543<class00780> class035432) {
        this.N = class035432;
    }

    public class04758 N() {
        return new class04758(this.N, this.y, this.L, this.u);
    }

    public class10468 N(class06040 class060402) {
        this.u = class060402;
        return this;
    }

    public class10468 N(class07852 class078522) {
        this.L = class078522;
        return this;
    }

    public class10468 N(Map<class07428, class04426> map) {
        this.y = map;
        return this;
    }
}

