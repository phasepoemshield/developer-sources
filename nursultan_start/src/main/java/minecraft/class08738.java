/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00642
 *  minecraft.class00737
 *  minecraft.class01624
 *  minecraft.class01929
 *  minecraft.class03713
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class06889
 *  minecraft.class07001
 *  minecraft.class07109
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class08299
 *  minecraft.class08308
 */
package minecraft;

import java.util.Optional;
import minecraft.class00642;
import minecraft.class00737;
import minecraft.class01624;
import minecraft.class01929;
import minecraft.class03713;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class06889;
import minecraft.class07001;
import minecraft.class07109;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class08299;
import minecraft.class08308;
import minecraft.class08733;
import minecraft.class08758;

final class class08738
implements class08733 {
    private final class04782 y;
    private final class06889 L;
    private final class07109 u;
    final /* synthetic */ class08758 N;

    class08738(class08758 class087582, class04782 class047822, class06889 class068892, class07109 class071092) {
        this.N = class087582;
        this.y = class047822;
        this.L = class068892;
        this.u = class071092;
    }

    public class04770 N(class00642 class006422, class03713 class037132) {
        class07321 class073212 = new class07321(class07209.method_49638((class00737)this.L));
        this.y.method_72270(class073212, 3);
        class04770 class047702 = new class04770(this.N.u, this.y, class037132.N(), class037132.L());
        try (class04495 class044952 = new class04495(class047702.method_71370(), class08758.N);){
            Optional<class08299> optional = this.N.u.Nm().L(this.N.i).map(class070012 -> class08308.N((class04490)class044952, (class01929)this.N.u.yt(), (class07001)class070012));
            optional.ifPresent(arg_0 -> ((class04770)class047702).method_5651(arg_0));
            class047702.method_60949(this.L, this.u.z, this.u.U);
            this.N.u.Nm().N(class006422, class047702, class037132);
            optional.ifPresent(class082992 -> {
                class047702.method_64131(class082992);
                class047702.method_64125(class082992);
            });
            class04770 class047703 = class047702;
            return class047703;
        }
    }

    public void N() {
        this.y.method_14178().y(class01624.M, new class07321(class07209.method_49638((class00737)this.L)), 3);
    }
}

