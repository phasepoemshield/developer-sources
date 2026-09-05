/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00554
 *  minecraft.class00869
 *  minecraft.class04688
 *  minecraft.class05474
 *  minecraft.class05487
 *  minecraft.class05835
 *  minecraft.class05862
 *  minecraft.class06183
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class08050
 *  net.caffeinemc.mods.lithium.common.util.Pos$ChunkCoord
 *  net.caffeinemc.mods.lithium.common.util.Pos$SectionYIndex
 *  net.caffeinemc.mods.lithium.mixin.world.raycast.ClipContextAccessor
 */
package Nursultan;

import java.util.function.BiFunction;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00554;
import minecraft.class00869;
import minecraft.class04688;
import minecraft.class05474;
import minecraft.class05487;
import minecraft.class05835;
import minecraft.class05862;
import minecraft.class06183;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class08050;
import net.caffeinemc.mods.lithium.common.util.Pos;
import net.caffeinemc.mods.lithium.mixin.world.raycast.ClipContextAccessor;

public class class10734
implements BiFunction<class05862, class07209, class06183> {
    int N = Integer.MIN_VALUE;
    int y = Integer.MIN_VALUE;
    class08050 L = null;
    final boolean u = ((ClipContextAccessor)this.i).getFluidHandling() != class05835.field_1348;
    final /* synthetic */ class05862 i;
    final /* synthetic */ class07290 R;

    public class10734(class07290 class072902, class05862 class058622) {
        this.R = class072902;
        this.i = class058622;
    }

    @Override
    public class06183 apply(class05862 class058622, class07209 class072092) {
        class00494 class004942;
        class06889 class068892;
        class00500 class005002 = this.N((class05487)this.R, class072092);
        class06889 class068893 = class058622.y();
        class06183 class061832 = this.R.N(class068893, class068892 = class058622.N(), class072092, class004942 = class058622.N(class005002, this.R, class072092), class005002);
        double d = class061832 == null ? Double.MAX_VALUE : class058622.y().M(class061832.y());
        double d2 = Double.MAX_VALUE;
        class06183 class061833 = null;
        if (this.u) {
            class04688 class046882 = class005002.Y();
            class061833 = class058622.N(class046882, this.R, class072092).method_1092(class068893, class068892, class072092);
            d2 = class061833 == null ? Double.MAX_VALUE : class058622.y().M(class061833.y());
        }
        return d <= d2 ? class061832 : class061833;
    }

    private class00500 N(class05487 class054872, class07209 class072092) {
        class00554 class005542;
        class08050 class080502;
        if (class054872.method_31601(class072092.method_10264())) {
            return class00869.mh.W();
        }
        int n = Pos.ChunkCoord.fromBlockCoord((int)class072092.method_10263());
        int n2 = Pos.ChunkCoord.fromBlockCoord((int)class072092.method_10260());
        if (this.N != n || this.y != n2) {
            this.L = class054872.method_8392(n, n2);
            this.N = n;
            this.y = n2;
        }
        if ((class080502 = this.L) != null && (class005542 = class080502.u()[Pos.SectionYIndex.fromBlockCoord((class05474)class080502, (int)class072092.method_10264())]) != null && !class005542.L()) {
            return class005542.N(class072092.method_10263() & 0xF, class072092.method_10264() & 0xF, class072092.method_10260() & 0xF);
        }
        return class00869.N.W();
    }
}

