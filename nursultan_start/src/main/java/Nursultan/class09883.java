/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00554
 *  minecraft.class00869
 *  minecraft.class05474
 *  minecraft.class05487
 *  minecraft.class05862
 *  minecraft.class06183
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class08050
 *  net.caffeinemc.mods.lithium.common.util.Pos$ChunkCoord
 *  net.caffeinemc.mods.lithium.common.util.Pos$SectionYIndex
 *  net.caffeinemc.mods.lithium.common.world.explosions.ClipContextAccess
 */
package Nursultan;

import java.util.function.BiFunction;
import minecraft.class00500;
import minecraft.class00554;
import minecraft.class00869;
import minecraft.class05474;
import minecraft.class05487;
import minecraft.class05862;
import minecraft.class06183;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class08050;
import net.caffeinemc.mods.lithium.common.util.Pos;
import net.caffeinemc.mods.lithium.common.world.explosions.ClipContextAccess;

public class class09883
implements BiFunction<class05862, class07209, class06183> {
    final class07299 N;
    int y;
    int L;
    class08050 u;
    final /* synthetic */ class07049 i;

    public class09883(class07049 class070492) {
        this.i = class070492;
        this.N = this.i.method_73183();
        this.y = Integer.MIN_VALUE;
        this.L = Integer.MIN_VALUE;
        this.u = null;
    }

    @Override
    public class06183 apply(class05862 class058622, class07209 class072092) {
        return this.N((class05487)this.N, class072092).y((class07290)this.N, class072092, ((ClipContextAccess)class058622).lithium$getCollisionContext()).method_1092(class058622.y(), class058622.N(), class072092);
    }

    private class00500 N(class05487 class054872, class07209 class072092) {
        class00554 class005542;
        class08050 class080502;
        if (class054872.method_31601(class072092.method_10264())) {
            return class00869.mh.W();
        }
        int n = Pos.ChunkCoord.fromBlockCoord((int)class072092.method_10263());
        int n2 = Pos.ChunkCoord.fromBlockCoord((int)class072092.method_10260());
        if (this.y != n || this.L != n2) {
            this.u = class054872.method_8392(n, n2);
            this.y = n;
            this.L = n2;
        }
        if ((class080502 = this.u) != null && (class005542 = class080502.u()[Pos.SectionYIndex.fromBlockCoord((class05474)class080502, (int)class072092.method_10264())]) != null && !class005542.L()) {
            return class005542.N(class072092.method_10263() & 0xF, class072092.method_10264() & 0xF, class072092.method_10260() & 0xF);
        }
        return class00869.N.W();
    }
}

