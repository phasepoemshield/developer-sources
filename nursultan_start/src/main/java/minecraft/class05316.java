/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.logging.LogUtils
 *  minecraft.class00032
 *  minecraft.class00245
 *  minecraft.class00673
 *  minecraft.class00680
 *  minecraft.class00681
 *  minecraft.class00682
 *  minecraft.class00683
 *  minecraft.class00690
 *  minecraft.class01266
 *  minecraft.class01377
 *  minecraft.class01489
 *  minecraft.class01964
 *  minecraft.class02148
 *  minecraft.class02839
 *  minecraft.class02976
 *  minecraft.class03630
 *  minecraft.class03811
 *  minecraft.class04003
 *  minecraft.class04067
 *  minecraft.class04096
 *  minecraft.class04206
 *  minecraft.class04241
 *  minecraft.class04508
 *  minecraft.class04626
 *  minecraft.class05292
 *  minecraft.class05538
 *  minecraft.class05574
 *  minecraft.class06018
 *  minecraft.class06129
 *  minecraft.class06165
 *  minecraft.class06824
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07140
 *  minecraft.class07141
 *  minecraft.class07144
 *  minecraft.class07147
 *  minecraft.class07149
 *  minecraft.class07150
 *  minecraft.class07153
 *  minecraft.class07178
 *  minecraft.class07182
 *  minecraft.class07428
 *  minecraft.class07438
 *  minecraft.class07520
 *  minecraft.class07523
 *  minecraft.class07525
 *  minecraft.class07528
 *  minecraft.class07530
 *  minecraft.class07534
 *  minecraft.class07536
 *  minecraft.class07538
 *  minecraft.class07541
 *  minecraft.class07549
 *  minecraft.class07550
 *  minecraft.class07557
 *  minecraft.class07560
 *  minecraft.class07617
 *  minecraft.class07618
 *  minecraft.class07625
 *  minecraft.class07627
 *  minecraft.class07628
 *  minecraft.class07629
 *  minecraft.class07632
 *  minecraft.class07637
 *  minecraft.class07654
 *  minecraft.class07862
 *  minecraft.class07869
 *  minecraft.class07872
 *  minecraft.class07877
 *  minecraft.class07879
 *  minecraft.class07881
 *  minecraft.class07883
 *  minecraft.class07888
 *  minecraft.class07894
 *  minecraft.class08004
 *  minecraft.class08011
 *  minecraft.class08036
 *  minecraft.class08041
 *  minecraft.class08042
 *  minecraft.class08047
 *  minecraft.class08157
 *  minecraft.class08187
 *  minecraft.class08583
 *  minecraft.class08982
 *  net.fabricmc.fabric.mixin.object.builder.DefaultAttributesAccessor
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.IdentityHashMap;
import java.util.Map;
import minecraft.class00032;
import minecraft.class00245;
import minecraft.class00673;
import minecraft.class00680;
import minecraft.class00681;
import minecraft.class00682;
import minecraft.class00683;
import minecraft.class00690;
import minecraft.class01266;
import minecraft.class01377;
import minecraft.class01489;
import minecraft.class01964;
import minecraft.class02148;
import minecraft.class02839;
import minecraft.class02976;
import minecraft.class03630;
import minecraft.class03811;
import minecraft.class04003;
import minecraft.class04067;
import minecraft.class04096;
import minecraft.class04206;
import minecraft.class04241;
import minecraft.class04508;
import minecraft.class04626;
import minecraft.class05292;
import minecraft.class05308;
import minecraft.class05538;
import minecraft.class05574;
import minecraft.class06018;
import minecraft.class06129;
import minecraft.class06165;
import minecraft.class06824;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07140;
import minecraft.class07141;
import minecraft.class07144;
import minecraft.class07147;
import minecraft.class07149;
import minecraft.class07150;
import minecraft.class07153;
import minecraft.class07178;
import minecraft.class07182;
import minecraft.class07428;
import minecraft.class07438;
import minecraft.class07520;
import minecraft.class07523;
import minecraft.class07525;
import minecraft.class07528;
import minecraft.class07530;
import minecraft.class07534;
import minecraft.class07536;
import minecraft.class07538;
import minecraft.class07541;
import minecraft.class07549;
import minecraft.class07550;
import minecraft.class07557;
import minecraft.class07560;
import minecraft.class07617;
import minecraft.class07618;
import minecraft.class07625;
import minecraft.class07627;
import minecraft.class07628;
import minecraft.class07629;
import minecraft.class07632;
import minecraft.class07637;
import minecraft.class07654;
import minecraft.class07862;
import minecraft.class07869;
import minecraft.class07872;
import minecraft.class07877;
import minecraft.class07879;
import minecraft.class07881;
import minecraft.class07883;
import minecraft.class07888;
import minecraft.class07894;
import minecraft.class08004;
import minecraft.class08011;
import minecraft.class08036;
import minecraft.class08041;
import minecraft.class08042;
import minecraft.class08047;
import minecraft.class08157;
import minecraft.class08187;
import minecraft.class08583;
import minecraft.class08982;
import net.fabricmc.fabric.mixin.object.builder.DefaultAttributesAccessor;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05316
implements DefaultAttributesAccessor {
    private static final Logger N = LogUtils.getLogger();
    private static Map<class07078<? extends class07438>, class05308> y = ImmutableMap.builder().put((Object)class07078.i, (Object)class03630.M().N()).put((Object)class07078.M, (Object)class03811.B().N()).put((Object)class07078.B, (Object)class00681.N().N()).put((Object)class07078.z, (Object)class05538.n().N()).put((Object)class07078.W, (Object)class07632.M().N()).put((Object)class07078.m, (Object)class04626.No().N()).put((Object)class07078.T, (Object)class07530.M().N()).put((Object)class07078.j, (Object)class02839.M().N()).put((Object)class07078.l, (Object)class07617.t().N()).put((Object)class07078.t, (Object)class02976.ND().N()).put((Object)class07078.G, (Object)class02976.ND().N()).put((Object)class07078.d, (Object)class07534.M().N()).put((Object)class07078.Q, (Object)class07628.B().N()).put((Object)class07078.O, (Object)class07629.M().N()).put((Object)class07078.g, (Object)class08982.M().N()).put((Object)class07078.J, (Object)class08583.B().N()).put((Object)class07078.o, (Object)class00245.M().N()).put((Object)class07078.q, (Object)class07550.M().N()).put((Object)class07078.e, (Object)class07618.W().N()).put((Object)class07078.H, (Object)class07877.W().N()).put((Object)class07078.X, (Object)class07541.M().N()).put((Object)class07078.p, (Object)class07520.M().N()).put((Object)class07078.F, (Object)class07525.M().N()).put((Object)class07078.A, (Object)class07560.M().N()).put((Object)class07078.f, (Object)class00690.B().N()).put((Object)class07078.x, (Object)class07538.B().N()).put((Object)class07078.v, (Object)class04508.M().N()).put((Object)class07078.Ni, (Object)class06165.B().N()).put((Object)class07078.NR, (Object)class04067.v().N()).put((Object)class07078.NB, (Object)class07523.Z().N()).put((Object)class07078.NZ, (Object)class00032.B().N()).put((Object)class07078.Nz, (Object)class07557.M().N()).put((Object)class07078.NE, (Object)class05574.B().N()).put((Object)class07078.NW, (Object)class02148.W().N()).put((Object)class07078.Nm, (Object)class07549.W().N()).put((Object)class07078.NP, (Object)class06018.B().N()).put((Object)class07078.NT, (Object)class07862.NK().N()).put((Object)class07078.Nb, (Object)class08004.l().N()).put((Object)class07078.Nj, (Object)class07149.B().N()).put((Object)class07078.Nn, (Object)class07625.M().N()).put((Object)class07078.NQ, (Object)class00683.Nr().N()).put((Object)class07078.Ng, (Object)class07140.M().N()).put((Object)class07078.No, (Object)class07438.method_26827().N()).put((Object)class07078.NV, (Object)class08583.B().N()).put((Object)class07078.Ne, (Object)class07877.W().N()).put((Object)class07078.NH, (Object)class08157.B().N()).put((Object)class07078.Na, (Object)class06129.W().N()).put((Object)class07078.NC, (Object)class07637.w().N()).put((Object)class07078.NS, (Object)class06824.M().N()).put((Object)class07078.Nx, (Object)class07654.B().N()).put((Object)class07078.ND, (Object)class07150.Y().N()).put((Object)class07078.Nh, (Object)class07627.B().N()).put((Object)class07078.Nr, (Object)class01489.M().N()).put((Object)class07078.yN, (Object)class01266.M().N()).put((Object)class07078.yy, (Object)class07178.B().N()).put((Object)class07078.Ly, (Object)class08036.method_26956().N()).put((Object)class07078.yL, (Object)class07869.m().N()).put((Object)class07078.yR, (Object)class07629.M().N()).put((Object)class07078.yM, (Object)class07879.W().N()).put((Object)class07078.yB, (Object)class07153.M().N()).put((Object)class07078.yZ, (Object)class07629.M().N()).put((Object)class07078.yz, (Object)class07881.B().N()).put((Object)class07078.yU, (Object)class07144.M().N()).put((Object)class07078.yW, (Object)class07147.M().N()).put((Object)class07078.ym, (Object)class07528.m().N()).put((Object)class07078.yP, (Object)class00682.W().N()).put((Object)class07078.ys, (Object)class07150.Y().N()).put((Object)class07078.yb, (Object)class01964.B().N()).put((Object)class07078.yv, (Object)class07888.M().N()).put((Object)class07078.yG, (Object)class07141.B().N()).put((Object)class07078.yw, (Object)class07883.B().N()).put((Object)class07078.yk, (Object)class07528.m().N()).put((Object)class07078.yY, (Object)class01377.m().N()).put((Object)class07078.yQ, (Object)class04096.v().N()).put((Object)class07078.yJ, (Object)class00683.Nr().N()).put((Object)class07078.yq, (Object)class07629.M().N()).put((Object)class07078.yK, (Object)class07872.m().N()).put((Object)class07078.yV, (Object)class08042.M().N()).put((Object)class07078.ye, (Object)class08041.B().N()).put((Object)class07078.yH, (Object)class08011.B().N()).put((Object)class07078.yX, (Object)class04003.B().N()).put((Object)class07078.yc, (Object)class07079.H().N()).put((Object)class07078.yp, (Object)class08047.B().N()).put((Object)class07078.yF, (Object)class00680.B().N()).put((Object)class07078.yA, (Object)class07528.m().N()).put((Object)class07078.yC, (Object)class07894.v().N()).put((Object)class07078.yS, (Object)class05292.M().N()).put((Object)class07078.yx, (Object)class08004.l().N()).put((Object)class07078.yD, (Object)class00673.W().N()).put((Object)class07078.yh, (Object)class08187.I().N()).put((Object)class07078.yr, (Object)class08004.l().N()).put((Object)class07078.LN, (Object)class07182.v().N()).build();

    public static /* synthetic */ Map y() {
        return y;
    }

    public static boolean y(class07078<?> class070782) {
        return y.containsKey(class070782);
    }

    public static void N() {
        class04206.M.j().filter(class070782 -> class070782.i() != class07428.field_17715).filter(class070782 -> !class05316.y(class070782)).map(arg_0 -> ((class04241)class04206.M).y(arg_0)).forEach(class018942 -> class07536.y((String)("Entity " + String.valueOf(class018942) + " has no attributes")));
    }

    private static void N(CallbackInfo callbackInfo) {
        y = new IdentityHashMap<class07078<? extends class07438>, class05308>(y);
    }

    public static class05308 N(class07078<? extends class07438> class070782) {
        return y.get(class070782);
    }
}

