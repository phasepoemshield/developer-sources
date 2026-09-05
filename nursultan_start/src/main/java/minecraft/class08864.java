/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class02006
 *  minecraft.class02028
 *  minecraft.class08350
 */
package minecraft;

import minecraft.class00500;
import minecraft.class02006;
import minecraft.class02028;
import minecraft.class08350;
import minecraft.class08872;
import minecraft.class08880;
import minecraft.class08887;
import minecraft.class08889;

public class class08864
implements class08889 {
    final class08880 N;
    private final class02006<class08887> y = new class08872(this);

    public class08864(class08880 class088802) {
        this.N = class088802;
    }

    @Override
    public class08887 method_65542(class00500 class005002, class02028 class020282) {
        return (class08887)class020282.N(this.y);
    }

    public void method_62326(class08350 class083502) {
        this.N.method_62326(class083502);
    }

    @Override
    public Object method_62332(class00500 class005002) {
        return this;
    }
}

