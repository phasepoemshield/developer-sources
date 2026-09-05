/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap
 *  java.lang.MatchException
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class04651
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class05911
 *  minecraft.class06851
 *  minecraft.class07131
 *  minecraft.class07311
 *  minecraft.class07536
 *  minecraft.class08743
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.rendering.BlockRenderLayerMapImpl
 *  net.irisshaders.iris.shaderpack.materialmap.BlockMaterialMapping
 *  net.irisshaders.iris.shaderpack.materialmap.BlockRenderType
 *  net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap;
import java.util.Map;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class04651;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class05911;
import minecraft.class06851;
import minecraft.class07131;
import minecraft.class07311;
import minecraft.class07536;
import minecraft.class08743;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.rendering.BlockRenderLayerMapImpl;
import net.irisshaders.iris.shaderpack.materialmap.BlockMaterialMapping;
import net.irisshaders.iris.shaderpack.materialmap.BlockRenderType;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public class class05885 {
    private static Map<class00891, class08743> N = (Map)class07536.N((Object)Maps.newHashMap(), (T hashMap) -> {
        class08743 class087432 = class08743.field_60927;
        hashMap.put(class00869.Ml, class087432);
        class08743 class087433 = class08743.field_60925;
        hashMap.put(class00869.Z, class087433);
        hashMap.put(class00869.RQ, class087433);
        class00869.RO.N((T class008912) -> hashMap.put(class008912, class087433));
        hashMap.put(class00869.MG, class087433);
        hashMap.put(class00869.Bf, class087433);
        hashMap.put(class00869.Rg, class087433);
        class00869.RI.N((T class008912) -> hashMap.put(class008912, class087433));
        hashMap.put(class00869.Nc, class087433);
        hashMap.put(class00869.NV, class087433);
        hashMap.put(class00869.Ne, class087433);
        hashMap.put(class00869.NX, class087433);
        hashMap.put(class00869.Na, class087433);
        hashMap.put(class00869.NH, class087433);
        hashMap.put(class00869.Np, class087433);
        hashMap.put(class00869.NF, class087433);
        hashMap.put(class00869.Nf, class087433);
        hashMap.put(class00869.NC, class087433);
        hashMap.put(class00869.NM, class087433);
        hashMap.put(class00869.NA, class087433);
        hashMap.put(class00869.w, class087433);
        hashMap.put(class00869.k, class087433);
        hashMap.put(class00869.Y, class087433);
        hashMap.put(class00869.Q, class087433);
        hashMap.put(class00869.O, class087433);
        hashMap.put(class00869.g, class087433);
        hashMap.put(class00869.I, class087433);
        hashMap.put(class00869.J, class087433);
        hashMap.put(class00869.yM, class087433);
        hashMap.put(class00869.yB, class087433);
        hashMap.put(class00869.yZ, class087433);
        hashMap.put(class00869.yz, class087433);
        hashMap.put(class00869.yU, class087433);
        hashMap.put(class00869.yE, class087433);
        hashMap.put(class00869.yW, class087433);
        hashMap.put(class00869.ym, class087433);
        hashMap.put(class00869.yP, class087433);
        hashMap.put(class00869.ys, class087433);
        hashMap.put(class00869.yT, class087433);
        hashMap.put(class00869.yb, class087433);
        hashMap.put(class00869.yj, class087433);
        hashMap.put(class00869.yv, class087433);
        hashMap.put(class00869.yn, class087433);
        hashMap.put(class00869.yt, class087433);
        hashMap.put(class00869.yG, class087433);
        hashMap.put(class00869.yl, class087433);
        hashMap.put(class00869.yw, class087433);
        hashMap.put(class00869.yk, class087433);
        hashMap.put(class00869.yY, class087433);
        hashMap.put(class00869.yO, class087433);
        hashMap.put(class00869.yQ, class087433);
        hashMap.put(class00869.yg, class087433);
        hashMap.put(class00869.yI, class087433);
        hashMap.put(class00869.yJ, class087433);
        hashMap.put(class00869.yo, class087433);
        hashMap.put(class00869.Ly, class087433);
        hashMap.put(class00869.nx, class087433);
        hashMap.put(class00869.nD, class087433);
        hashMap.put(class00869.Lu, class087433);
        hashMap.put(class00869.Li, class087433);
        hashMap.put(class00869.LR, class087433);
        hashMap.put(class00869.LM, class087433);
        hashMap.put(class00869.LB, class087433);
        hashMap.put(class00869.LZ, class087433);
        hashMap.put(class00869.Lz, class087433);
        hashMap.put(class00869.LU, class087433);
        hashMap.put(class00869.LE, class087433);
        hashMap.put(class00869.LW, class087433);
        hashMap.put(class00869.Lm, class087433);
        hashMap.put(class00869.LP, class087433);
        hashMap.put(class00869.Ls, class087433);
        hashMap.put(class00869.LT, class087433);
        hashMap.put(class00869.Le, class087433);
        hashMap.put(class00869.LH, class087433);
        hashMap.put(class00869.iO, class087433);
        hashMap.put(class00869.ig, class087433);
        hashMap.put(class00869.iI, class087433);
        hashMap.put(class00869.iJ, class087433);
        hashMap.put(class00869.Lc, class087433);
        hashMap.put(class00869.LX, class087433);
        hashMap.put(class00869.La, class087433);
        hashMap.put(class00869.np, class087433);
        hashMap.put(class00869.nF, class087433);
        hashMap.put(class00869.Lh, class087433);
        hashMap.put(class00869.uE, class087433);
        hashMap.put(class00869.uW, class087433);
        hashMap.put(class00869.um, class087433);
        hashMap.put(class00869.ur, class087433);
        hashMap.put(class00869.iW, class087433);
        hashMap.put(class00869.im, class087433);
        hashMap.put(class00869.ij, class087433);
        hashMap.put(class00869.it, class087433);
        hashMap.put(class00869.iH, class087433);
        hashMap.put(class00869.Ru, class087433);
        hashMap.put(class00869.Ri, class087433);
        hashMap.put(class00869.RR, class087433);
        hashMap.put(class00869.RM, class087433);
        hashMap.put(class00869.RB, class087433);
        hashMap.put(class00869.RZ, class087433);
        hashMap.put(class00869.Rz, class087433);
        hashMap.put(class00869.RU, class087433);
        hashMap.put(class00869.sV, class087433);
        hashMap.put(class00869.se, class087433);
        hashMap.put(class00869.RE, class087433);
        hashMap.put(class00869.RW, class087433);
        hashMap.put(class00869.jC, class087433);
        hashMap.put(class00869.jS, class087433);
        hashMap.put(class00869.jD, class087433);
        hashMap.put(class00869.jx, class087433);
        hashMap.put(class00869.jh, class087433);
        hashMap.put(class00869.jr, class087433);
        hashMap.put(class00869.vy, class087433);
        hashMap.put(class00869.vN, class087433);
        hashMap.put(class00869.RK, class087433);
        hashMap.put(class00869.RV, class087433);
        hashMap.put(class00869.Re, class087433);
        hashMap.put(class00869.RH, class087433);
        hashMap.put(class00869.Rc, class087433);
        hashMap.put(class00869.nC, class087433);
        hashMap.put(class00869.nS, class087433);
        hashMap.put(class00869.RX, class087433);
        hashMap.put(class00869.Ra, class087433);
        hashMap.put(class00869.RS, class087433);
        hashMap.put(class00869.MR, class087433);
        hashMap.put(class00869.MB, class087433);
        hashMap.put(class00869.Mb, class087433);
        hashMap.put(class00869.MJ, class087433);
        hashMap.put(class00869.Mq, class087433);
        hashMap.put(class00869.MK, class087433);
        hashMap.put(class00869.MV, class087433);
        hashMap.put(class00869.Me, class087433);
        hashMap.put(class00869.MH, class087433);
        hashMap.put(class00869.Mc, class087433);
        hashMap.put(class00869.MX, class087433);
        hashMap.put(class00869.Ma, class087433);
        hashMap.put(class00869.Mp, class087433);
        hashMap.put(class00869.MF, class087433);
        hashMap.put(class00869.MA, class087433);
        hashMap.put(class00869.Mf, class087433);
        hashMap.put(class00869.nh, class087433);
        hashMap.put(class00869.nr, class087433);
        hashMap.put(class00869.MC, class087433);
        hashMap.put(class00869.MS, class087433);
        hashMap.put(class00869.Mx, class087433);
        hashMap.put(class00869.MD, class087433);
        hashMap.put(class00869.Mh, class087433);
        hashMap.put(class00869.Mr, class087433);
        hashMap.put(class00869.BN, class087433);
        hashMap.put(class00869.By, class087433);
        hashMap.put(class00869.BL, class087433);
        hashMap.put(class00869.Bu, class087433);
        hashMap.put(class00869.Bi, class087433);
        hashMap.put(class00869.BR, class087433);
        hashMap.put(class00869.BM, class087433);
        hashMap.put(class00869.BB, class087433);
        hashMap.put(class00869.BZ, class087433);
        hashMap.put(class00869.no, class087433);
        hashMap.put(class00869.nq, class087433);
        hashMap.put(class00869.Mo, class087433);
        hashMap.put(class00869.Bz, class087433);
        hashMap.put(class00869.BU, class087433);
        hashMap.put(class00869.Ba, class087433);
        hashMap.put(class00869.Bh, class087433);
        hashMap.put(class00869.Zp, class087433);
        hashMap.put(class00869.zt, class087433);
        hashMap.put(class00869.zG, class087433);
        hashMap.put(class00869.zl, class087433);
        hashMap.put(class00869.zd, class087433);
        hashMap.put(class00869.zw, class087433);
        hashMap.put(class00869.zk, class087433);
        hashMap.put(class00869.EM, class087433);
        hashMap.put(class00869.EB, class087433);
        hashMap.put(class00869.EZ, class087433);
        hashMap.put(class00869.Ez, class087433);
        hashMap.put(class00869.EU, class087433);
        hashMap.put(class00869.EE, class087433);
        hashMap.put(class00869.EW, class087433);
        hashMap.put(class00869.Em, class087433);
        hashMap.put(class00869.EP, class087433);
        hashMap.put(class00869.jH, class087433);
        hashMap.put(class00869.jc, class087433);
        hashMap.put(class00869.ja, class087433);
        hashMap.put(class00869.jX, class087433);
        hashMap.put(class00869.jp, class087433);
        hashMap.put(class00869.jF, class087433);
        hashMap.put(class00869.jf, class087433);
        hashMap.put(class00869.jA, class087433);
        hashMap.put(class00869.Es, class087433);
        hashMap.put(class00869.ET, class087433);
        hashMap.put(class00869.Eb, class087433);
        hashMap.put(class00869.LL, class087433);
        hashMap.put(class00869.EG, class087433);
        hashMap.put(class00869.Ed, class087433);
        hashMap.put(class00869.El, class087433);
        hashMap.put(class00869.Ew, class087433);
        hashMap.put(class00869.Wh, class087433);
        hashMap.put(class00869.Wr, class087433);
        hashMap.put(class00869.my, class087433);
        hashMap.put(class00869.mP, class087433);
        hashMap.put(class00869.ms, class087433);
        hashMap.put(class00869.mT, class087433);
        hashMap.put(class00869.mb, class087433);
        hashMap.put(class00869.mj, class087433);
        hashMap.put(class00869.mv, class087433);
        hashMap.put(class00869.mn, class087433);
        hashMap.put(class00869.mt, class087433);
        hashMap.put(class00869.mG, class087433);
        hashMap.put(class00869.ml, class087433);
        hashMap.put(class00869.md, class087433);
        hashMap.put(class00869.mw, class087433);
        hashMap.put(class00869.mk, class087433);
        hashMap.put(class00869.mY, class087433);
        hashMap.put(class00869.mQ, class087433);
        hashMap.put(class00869.mO, class087433);
        hashMap.put(class00869.mg, class087433);
        hashMap.put(class00869.mI, class087433);
        hashMap.put(class00869.mJ, class087433);
        hashMap.put(class00869.mo, class087433);
        hashMap.put(class00869.mq, class087433);
        hashMap.put(class00869.mK, class087433);
        hashMap.put(class00869.mV, class087433);
        hashMap.put(class00869.me, class087433);
        hashMap.put(class00869.mH, class087433);
        hashMap.put(class00869.mc, class087433);
        hashMap.put(class00869.mX, class087433);
        hashMap.put(class00869.ma, class087433);
        hashMap.put(class00869.mp, class087433);
        hashMap.put(class00869.mF, class087433);
        hashMap.put(class00869.mA, class087433);
        hashMap.put(class00869.mC, class087433);
        hashMap.put(class00869.mS, class087433);
        hashMap.put(class00869.mx, class087433);
        hashMap.put(class00869.mD, class087433);
        hashMap.put(class00869.Pa, class087433);
        hashMap.put(class00869.Pr, class087433);
        hashMap.put(class00869.sy, class087433);
        hashMap.put(class00869.sL, class087433);
        class00869.su.N((T class008912) -> hashMap.put(class008912, class087433));
        hashMap.put(class00869.si, class087433);
        hashMap.put(class00869.sR, class087433);
        hashMap.put(class00869.sM, class087433);
        hashMap.put(class00869.sl, class087433);
        hashMap.put(class00869.sd, class087433);
        hashMap.put(class00869.sw, class087433);
        hashMap.put(class00869.sk, class087433);
        hashMap.put(class00869.ss, class087433);
        hashMap.put(class00869.st, class087433);
        hashMap.put(class00869.sW, class087433);
        hashMap.put(class00869.sY, class087433);
        hashMap.put(class00869.sP, class087433);
        hashMap.put(class00869.TW, class087433);
        hashMap.put(class00869.Tm, class087433);
        hashMap.put(class00869.TP, class087433);
        hashMap.put(class00869.Ts, class087433);
        hashMap.put(class00869.sA, class087433);
        hashMap.put(class00869.sf, class087433);
        hashMap.put(class00869.vp, class087433);
        hashMap.put(class00869.bd, class087433);
        hashMap.put(class00869.bl, class087433);
        hashMap.put(class00869.bG, class087433);
        hashMap.put(class00869.bt, class087433);
        hashMap.put(class00869.vA, class087433);
        hashMap.put(class00869.vf, class087433);
        hashMap.put(class00869.vC, class087433);
        hashMap.put(class00869.vx, class087433);
        hashMap.put(class00869.vS, class087433);
        hashMap.put(class00869.vh, class087433);
        hashMap.put(class00869.vr, class087433);
        hashMap.put(class00869.nN, class087433);
        hashMap.put(class00869.nL, class087433);
        hashMap.put(class00869.nu, class087433);
        hashMap.put(class00869.ni, class087433);
        hashMap.put(class00869.nR, class087433);
        hashMap.put(class00869.bp, class087433);
        hashMap.put(class00869.bF, class087433);
        hashMap.put(class00869.bf, class087433);
        hashMap.put(class00869.bS, class087433);
        hashMap.put(class00869.o, class087433);
        hashMap.put(class00869.nH, class087433);
        hashMap.put(class00869.vL, class087433);
        hashMap.put(class00869.vu, class087433);
        hashMap.put(class00869.vi, class087433);
        hashMap.put(class00869.vR, class087433);
        hashMap.put(class00869.vM, class087433);
        hashMap.put(class00869.vB, class087433);
        hashMap.put(class00869.vZ, class087433);
        hashMap.put(class00869.vz, class087433);
        hashMap.put(class00869.tN, class087433);
        hashMap.put(class00869.iv, class087433);
        hashMap.put(class00869.MO, class087433);
        class08743 class087434 = class08743.field_60926;
        hashMap.put(class00869.iT, class087434);
        hashMap.put(class00869.iq, class087434);
        hashMap.put(class00869.ND, class087434);
        hashMap.put(class00869.RJ, class087434);
        hashMap.put(class00869.ic, class087434);
        hashMap.put(class00869.iX, class087434);
        hashMap.put(class00869.ia, class087434);
        hashMap.put(class00869.ip, class087434);
        hashMap.put(class00869.iF, class087434);
        hashMap.put(class00869.iA, class087434);
        hashMap.put(class00869.f_if__1, class087434);
        hashMap.put(class00869.iC, class087434);
        hashMap.put(class00869.iS, class087434);
        hashMap.put(class00869.ix, class087434);
        hashMap.put(class00869.iD, class087434);
        hashMap.put(class00869.ih, class087434);
        hashMap.put(class00869.ir, class087434);
        hashMap.put(class00869.RN, class087434);
        hashMap.put(class00869.Lf, class087434);
        hashMap.put(class00869.Ry, class087434);
        hashMap.put(class00869.RL, class087434);
        hashMap.put(class00869.ZT, class087434);
        hashMap.put(class00869.Zb, class087434);
        hashMap.put(class00869.Zj, class087434);
        hashMap.put(class00869.Zv, class087434);
        hashMap.put(class00869.Zn, class087434);
        hashMap.put(class00869.Zt, class087434);
        hashMap.put(class00869.ZG, class087434);
        hashMap.put(class00869.Zl, class087434);
        hashMap.put(class00869.Zd, class087434);
        hashMap.put(class00869.Zw, class087434);
        hashMap.put(class00869.Zk, class087434);
        hashMap.put(class00869.ZY, class087434);
        hashMap.put(class00869.ZQ, class087434);
        hashMap.put(class00869.ZO, class087434);
        hashMap.put(class00869.Zg, class087434);
        hashMap.put(class00869.ZI, class087434);
        hashMap.put(class00869.Zc, class087434);
        hashMap.put(class00869.TM, class087434);
        hashMap.put(class00869.Eg, class087434);
        hashMap.put(class00869.PN, class087434);
        hashMap.put(class00869.bX, class087434);
    });
    private static Map<class04651, class08743> y = (Map)class07536.N((Object)Maps.newHashMap(), (T hashMap) -> {
        hashMap.put(class04684.y, class08743.field_60926);
        hashMap.put(class04684.L, class08743.field_60926);
    });
    private static boolean L;
    private static final class08743[] u;

    public static class07311 L(class00500 class005002) {
        if (class05885.N(class005002) == class08743.field_60926) {
            return class05911.U();
        }
        return class05911.Z();
    }

    static {
        u = new class08743[BlockRenderType.values().length];
        for (int i = 0; i < BlockRenderType.values().length; ++i) {
            class05885.u[i] = BlockMaterialMapping.convertBlockToRenderType((BlockRenderType)BlockRenderType.values()[i]);
        }
        N = new Reference2ReferenceOpenHashMap(N);
        y = new Reference2ReferenceOpenHashMap(y);
        class05885.N(null);
    }

    public static class07311 y(class00500 class005002) {
        class00891 class008912 = class005002.i();
        if (class008912 instanceof class07131) {
            return L ? class06851.y() : class06851.N();
        }
        class08743 class087432 = N.get(class008912);
        if (class087432 != null) {
            return switch (class087432) {
                default -> throw new MatchException(null, null);
                case class08743.field_60923 -> class06851.N();
                case class08743.field_60925 -> class06851.y();
                case class08743.field_60926 -> class06851.L();
                case class08743.field_60927 -> class06851.P();
            };
        }
        return class06851.N();
    }

    public static class08743 N(class00500 class005002) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        class05885.N(class005002, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class08743)callbackInfoReturnable.getReturnValue();
        }
        class00891 class008912 = class005002.i();
        if (class008912 instanceof class07131) {
            return L ? class08743.field_60925 : class08743.field_60923;
        }
        class08743 class087432 = N.get(class008912);
        if (class087432 != null) {
            return class087432;
        }
        return class08743.field_60923;
    }

    private static void N(CallbackInfo callbackInfo) {
        BlockRenderLayerMapImpl.setup(N::put, y::put);
    }

    private static void N(class00500 class005002, CallbackInfoReturnable callbackInfoReturnable) {
        BlockRenderType blockRenderType = (BlockRenderType)WorldRenderingSettings.INSTANCE.getBlockTypeIds().get(class005002.i());
        if (blockRenderType != null) {
            callbackInfoReturnable.setReturnValue((Object)u[blockRenderType.ordinal()]);
        }
    }

    public static class08743 N(class04688 class046882) {
        class08743 class087432 = y.get(class046882.N());
        if (class087432 != null) {
            return class087432;
        }
        return class08743.field_60923;
    }

    public static void N(boolean bl) {
        L = bl;
    }
}

