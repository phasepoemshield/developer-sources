/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class04688
 *  minecraft.class06092
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07290
 *  net.caffeinemc.mods.lithium.common.world.explosions.ClipContextAccess
 *  net.caffeinemc.mods.lithium.mixin.world.raycast.ClipContextAccessor
 */
package minecraft;

import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class04688;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class06092;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07290;
import net.caffeinemc.mods.lithium.common.world.explosions.ClipContextAccess;
import net.caffeinemc.mods.lithium.mixin.world.raycast.ClipContextAccessor;

public class class05862
implements ClipContextAccess,
ClipContextAccessor {
    private class06889 N;
    private final class06889 y;
    private final class05849 L;
    private final class05835 u;
    private final class06092 i;

    public class05862(class06889 class068892, class06889 class068893, class05849 class058492, class05835 class058352, class07049 class070492) {
        this(class068892, class068893, class058492, class058352, class06092.N((class07049)class070492));
    }

    public class05862(class06889 class068892, class06889 class068893, class05849 class058492, class05835 class058352, class06092 class060922) {
        this.N = class068892;
        this.y = class068893;
        this.L = class058492;
        this.u = class058352;
        this.i = class060922;
    }

    public class06889 y() {
        return this.N;
    }

    public class00494 N(class00500 class005002, class07290 class072902, class07209 class072092) {
        return this.L.get(class005002, class072902, class072092, this.i);
    }

    public class00494 N(class04688 class046882, class07290 class072902, class07209 class072092) {
        return this.u.N(class046882) ? class046882.u(class072902, class072092) : class00389.N();
    }

    public class06889 N() {
        return this.y;
    }

    public class06092 lithium$getCollisionContext() {
        return this.i;
    }

    public void lithium$setFrom(class06889 class068892) {
        this.N = class068892;
    }

    public /* synthetic */ class05835 getFluidHandling() {
        return this.u;
    }
}

