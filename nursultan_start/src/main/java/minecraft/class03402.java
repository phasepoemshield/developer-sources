/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00405
 *  minecraft.class00578
 *  minecraft.class00620
 *  minecraft.class01609
 *  minecraft.class02566
 *  minecraft.class07915
 *  minecraft.class08394
 *  minecraft.class08652
 *  minecraft.class08656
 *  minecraft.class08669
 *  minecraft.class08679
 */
package minecraft;

import minecraft.class00405;
import minecraft.class00578;
import minecraft.class00620;
import minecraft.class01609;
import minecraft.class02566;
import minecraft.class03386;
import minecraft.class07915;
import minecraft.class08394;
import minecraft.class08652;
import minecraft.class08656;
import minecraft.class08669;
import minecraft.class08679;

class class03402
implements class01609 {
    private int L;
    final /* synthetic */ class08652 N;
    final /* synthetic */ class03386 y;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class03402(class03386 class033862, class08652 class086522) {
        this.y = class033862;
        this.N = class086522;
    }

    private void N(class00620 class006202, boolean bl) {
        int n = (bl ? 128 : 255) - (this.L++ & 1) * 64;
        class00405 class004052 = class006202.z();
        int n2 = class004052.Z() != null ? n : 0;
        int n3 = class004052.z() != null ? n : 0;
        int n4 = n2 == 0 || n3 == 0 ? n : 0;
        int n5 = class02566.y((int)128, (int)n2, (int)n3, (int)n4);
        this.y.B.N((class08669)new class08656(class08394.NH, class08679.N(), this.N.L, (int)class006202.P(), (int)class006202.s(), (int)class006202.T(), (int)class006202.b(), n5, n5, this.N.z));
    }

    public void N(class00578 class005782) {
        this.N((class00620)class005782, true);
    }

    public void N(class07915 class079152) {
        this.N((class00620)class079152, false);
    }
}

