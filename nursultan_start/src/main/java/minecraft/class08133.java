/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00992
 *  minecraft.class01422
 *  minecraft.class01434
 *  minecraft.class01590
 *  minecraft.class01999
 *  minecraft.class04790
 *  minecraft.class07921
 *  minecraft.class07937
 *  net.irisshaders.iris.mixin.fantastic.FeatureRenderDispatcherAccessor
 */
package minecraft;

import minecraft.class00992;
import minecraft.class01422;
import minecraft.class01434;
import minecraft.class01590;
import minecraft.class01999;
import minecraft.class04790;
import minecraft.class07921;
import minecraft.class07937;
import minecraft.class08105;
import minecraft.class08117;
import minecraft.class08120;
import minecraft.class08123;
import minecraft.class08125;
import minecraft.class08128;
import minecraft.class08131;
import minecraft.class08132;
import minecraft.class08135;
import minecraft.class08144;
import net.irisshaders.iris.mixin.fantastic.FeatureRenderDispatcherAccessor;

public class class08133
implements AutoCloseable,
FeatureRenderDispatcherAccessor {
    private final class04790 N;
    private final class01999 y;
    private final class01422 L;
    private final class08117 u;
    private final class01434 i;
    private final class01422 R;
    private final class01590 M;
    private final class08128 B = new class08128();
    private final class08125 Z = new class08125();
    private final class08135 z = new class08135();
    private final class07921 U = new class07921();
    private final class08120 E = new class08120();
    private final class08105 W = new class08105();
    private final class08132 m = new class08132();
    private final class08144 P = new class08144();
    private final class08131 s = new class08131();
    private final class08123 T = new class08123();
    private final class00992 b = new class00992();

    public class04790 L() {
        return this.N;
    }

    public class08133(class04790 class047902, class01999 class019992, class01422 class014222, class08117 class081172, class01434 class014342, class01422 class014223, class01590 class015902) {
        this.N = class047902;
        this.y = class019992;
        this.L = class014222;
        this.u = class081172;
        this.i = class014342;
        this.R = class014223;
        this.M = class015902;
    }

    @Override
    public void close() {
        this.b.close();
    }

    public void y() {
        this.b.N();
    }

    public void N() {
        for (class07937 class079372 : this.N.L().values()) {
            this.B.N(class079372, this.L);
            this.z.N(class079372, this.L, this.i, this.R);
            this.U.N(class079372, this.L, this.i, this.R);
            this.Z.N(class079372, this.L, this.u);
            this.E.N(class079372, this.L, this.M);
            this.W.N(class079372, this.L);
            this.m.N(class079372, this.L);
            this.P.N(class079372, this.L, this.i);
            this.T.N(class079372, this.L, this.y, this.i);
            this.s.N(class079372, this.L);
            this.b.N(class079372);
        }
        this.N.N();
    }

    public /* synthetic */ class00992 getParticleFeatureRenderer() {
        return this.b;
    }
}

