/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00199
 *  minecraft.class00220
 *  minecraft.class00629
 *  minecraft.class00780
 *  minecraft.class01007
 *  minecraft.class01010
 *  minecraft.class01019
 *  minecraft.class01022
 *  minecraft.class01027
 *  minecraft.class01042
 *  minecraft.class01894
 *  minecraft.class01905
 *  minecraft.class01920
 *  minecraft.class01929
 *  minecraft.class02055
 *  minecraft.class02061
 *  minecraft.class02207
 *  minecraft.class02251
 *  minecraft.class02503
 *  minecraft.class03023
 *  minecraft.class03170
 *  minecraft.class03188
 *  minecraft.class03247
 *  minecraft.class03270
 *  minecraft.class03543
 *  minecraft.class03565
 *  minecraft.class03683
 *  minecraft.class03882
 *  minecraft.class04095
 *  minecraft.class04227
 *  minecraft.class04294
 *  minecraft.class04336
 *  minecraft.class04423
 *  minecraft.class04444
 *  minecraft.class04460
 *  minecraft.class04472
 *  minecraft.class05471
 *  minecraft.class05943
 *  minecraft.class05964
 *  minecraft.class07314
 *  minecraft.class07536
 *  minecraft.class07593
 *  minecraft.class07597
 *  minecraft.class08221
 *  minecraft.class08401
 *  minecraft.class08427
 *  minecraft.class08526
 *  minecraft.class08553
 *  minecraft.class08574
 *  minecraft.class08638
 *  minecraft.class09016
 */
package minecraft;

import minecraft.class00199;
import minecraft.class00220;
import minecraft.class00629;
import minecraft.class00780;
import minecraft.class01007;
import minecraft.class01010;
import minecraft.class01019;
import minecraft.class01022;
import minecraft.class01027;
import minecraft.class01042;
import minecraft.class01894;
import minecraft.class01905;
import minecraft.class01920;
import minecraft.class01929;
import minecraft.class02055;
import minecraft.class02061;
import minecraft.class02207;
import minecraft.class02251;
import minecraft.class02503;
import minecraft.class03023;
import minecraft.class03170;
import minecraft.class03188;
import minecraft.class03247;
import minecraft.class03270;
import minecraft.class03543;
import minecraft.class03565;
import minecraft.class03683;
import minecraft.class03882;
import minecraft.class04095;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04294;
import minecraft.class04336;
import minecraft.class04423;
import minecraft.class04444;
import minecraft.class04460;
import minecraft.class04472;
import minecraft.class05471;
import minecraft.class05943;
import minecraft.class05964;
import minecraft.class07314;
import minecraft.class07536;
import minecraft.class07593;
import minecraft.class07597;
import minecraft.class08221;
import minecraft.class08401;
import minecraft.class08427;
import minecraft.class08526;
import minecraft.class08553;
import minecraft.class08574;
import minecraft.class08638;
import minecraft.class09016;

public class class04105 {
    public static final class02061 N = new class02061().N(class04227.yu, class01920::N).N(class04227.ND, class01010::N).N(class04227.Nh, class03188::N).N(class04227.ys, class03170::N).N(class04227.yj, class01007::N).N(class04227.yb, class04423::N).N(class04227.yT, class01027::N).N(class04227.yv, class01019::N).N(class04227.NA, class05471::N).N(class04227.yU, class03565::N).N(class04227.yW, class03023::N).N(class04227.yy, class03882::N).N(class04227.yE, class05943::N).N(class04227.yO, class05964::N).N(class04227.yM, class04095::N).N(class04227.NC, class00629::N).N(class04227.yk, class03247::N).N(class04227.yw, class03270::N).N(class04227.yl, class08221::N).N(class04227.yY, class02503::N).N(class04227.yQ, class08526::N).N(class04227.ym, class04472::N).N(class04227.yN, class03683::N).N(class04227.NF, class04444::N).N(class04227.yR, class07314::N).N(class04227.yi, class02251::N).N(class04227.yz, class02207::N).N(class04227.yZ, class04460::N).N(class04227.yP, class08638::N).N(class04227.Nr, class08401::N).N(class04227.NS, class08427::N).N(class04227.Nx, class07597::N).N(class04227.yn, class00220::N).N(class04227.yt, class00199::N).N(class04227.yB, class08553::N).N(class04227.Nf, class08574::N).N(class04227.yL, class09016::N).N(class04227.yG, class07593::N);

    public static void N(class02055<class04336> class020552, class01905<class00780> class019052) {
        class019052.z().forEach(class035292 -> {
            class01894 class018942 = class035292.B().N();
            ((class00780)class035292.N()).L().L().stream().flatMap(class03543::N).forEach(class035562 -> class035562.u().ifLeft(class059462 -> {
                if (!class04105.N((class04336)class020552.y(class059462).N())) {
                    class07536.y((String)("Placed feature " + String.valueOf(class059462.N()) + " in biome " + String.valueOf(class018942) + " is missing BiomeFilter.biome()"));
                }
            }).ifRight(class043362 -> {
                if (!class04105.N(class043362)) {
                    class07536.y((String)("Placed inline feature in biome " + String.valueOf(class035292) + " is missing BiomeFilter.biome()"));
                }
            }));
        });
    }

    private static boolean N(class04336 class043362) {
        return class043362.L().contains(class04294.y());
    }

    public static class01929 N() {
        class01022 class010222 = class01042.N(class04206.NF);
        class01929 class019292 = N.N((class01042)class010222);
        class04105.N(class019292);
        return class019292;
    }

    public static void N(class01929 class019292) {
        class04105.N((class02055<class04336>)class019292.y(class04227.ys), (class01905<class00780>)class019292.y(class04227.NA));
    }
}

