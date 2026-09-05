/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00517
 *  minecraft.class00608
 *  minecraft.class00655
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class04782
 *  minecraft.class05487
 *  minecraft.class05989
 *  minecraft.class06069
 *  minecraft.class06092
 *  minecraft.class06665
 *  minecraft.class06667
 *  minecraft.class06901
 *  minecraft.class06942
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07536
 *  minecraft.class08071
 *  minecraft.class08092
 *  minecraft.class08713
 *  net.fabricmc.fabric.api.registry.FlammableBlockRegistry$Entry
 *  net.fabricmc.fabric.impl.content.registry.FireBlockHooks
 *  net.fabricmc.fabric.impl.content.registry.FlammableBlockRegistryImpl
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.util.Map;
import java.util.function.Function;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00517;
import minecraft.class00608;
import minecraft.class00655;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04782;
import minecraft.class05487;
import minecraft.class05989;
import minecraft.class06069;
import minecraft.class06092;
import minecraft.class06665;
import minecraft.class06667;
import minecraft.class06901;
import minecraft.class06942;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07536;
import minecraft.class08071;
import minecraft.class08092;
import minecraft.class08713;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.impl.content.registry.FireBlockHooks;
import net.fabricmc.fabric.impl.content.registry.FlammableBlockRegistryImpl;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00756
extends class05989
implements FireBlockHooks {
    public static final MapCodec<class00756> N = class00756.y(class00756::new);
    public static final int y = 15;
    public static final class08071 L = class06665.Nk;
    public static final class06667 u = class06901.y;
    public static final class06667 i = class06901.L;
    public static final class06667 R = class06901.u;
    public static final class06667 M = class06901.i;
    public static final class06667 B = class06901.R;
    public static final Map<class07211, class06667> Z = (Map)class06901.B.entrySet().stream().filter(entry -> entry.getKey() != class07211.field_11033).collect(class07536.N());
    private final Function<class00500, class00494> F;
    private static final int A = 60;
    private static final int f = 30;
    private static final int C = 15;
    private static final int S = 5;
    private static final int x = 100;
    private static final int D = 60;
    private static final int h = 20;
    private static final int r = 5;
    private final Object2IntMap<class00891> NN = new Object2IntOpenHashMap();
    private final Object2IntMap<class00891> Ny = new Object2IntOpenHashMap();
    private FlammableBlockRegistryImpl NL;

    private Function<class00500, class00494> L() {
        Map var1 = class00389.u((class00494)class00891.L((double)16.0, (double)0.0, (double)1.0));
        return this.N((T class005002) -> {
            class00494 class004942 = class00389.N();
            for (Map.Entry<class07211, class06667> entry : Z.entrySet()) {
                if (!((Boolean)class005002.L((class08092)entry.getValue())).booleanValue()) continue;
                class004942 = class00389.N((class00494)class004942, (class00494)((class00494)var1.get(entry.getKey())));
            }
            return class004942.method_1110() ? O : class004942;
        }, new class08092[]{L});
    }

    private int T(class00500 class005002) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.y(class005002, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueI();
        }
        if (class005002.y((class08092)class06665.q) && ((Boolean)class005002.L((class08092)class06665.q)).booleanValue()) {
            return 0;
        }
        return this.Ny.getInt((Object)class005002.i());
    }

    public class00756(class01362 class013622) {
        super(class013622, 1.0f);
        this.P((class00500)((class00500)((class00500)((class00500)((class00500)((class00500)((class00500)this.Q.y()).y((class08092)L, (Comparable)Integer.valueOf(0))).y((class08092)u, (Comparable)Boolean.valueOf(false))).y((class08092)i, (Comparable)Boolean.valueOf(false))).y((class08092)R, (Comparable)Boolean.valueOf(false))).y((class08092)M, (Comparable)Boolean.valueOf(false))).y((class08092)B, (Comparable)Boolean.valueOf(false)));
        this.F = this.L();
        this.N(class013622, null);
    }

    private int b(class00500 class005002) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueI();
        }
        if (class005002.y((class08092)class06665.q) && ((Boolean)class005002.L((class08092)class06665.q)).booleanValue()) {
            return 0;
        }
        return this.NN.getInt((Object)class005002.i());
    }

    public boolean U(class00500 class005002) {
        return this.b(class005002) > 0;
    }

    private boolean u(class07290 class072902, class07209 class072092) {
        for (class07211 class072112 : class07211.values()) {
            if (!this.U(class072902.method_8320(class072092.method_10093(class072112)))) continue;
            return true;
        }
        return false;
    }

    private void y(class00500 class005002, CallbackInfoReturnable callbackInfoReturnable) {
        FlammableBlockRegistry.Entry entry = this.NL.getFabric(class005002.i());
        if (entry != null) {
            if (class005002.y((class08092)class06665.q) && ((Boolean)class005002.L((class08092)class06665.q)).booleanValue()) {
                callbackInfoReturnable.setReturnValue((Object)0);
            } else {
                callbackInfoReturnable.setReturnValue((Object)entry.getSpreadChance());
            }
        }
    }

    public static void y() {
        class00756 class007562 = (class00756)class00869.Lc;
        class007562.N(class00869.m, 5, 20);
        class007562.N(class00869.P, 5, 20);
        class007562.N(class00869.s, 5, 20);
        class007562.N(class00869.T, 5, 20);
        class007562.N(class00869.b, 5, 20);
        class007562.N(class00869.j, 5, 20);
        class007562.N(class00869.v, 5, 20);
        class007562.N(class00869.t, 5, 20);
        class007562.N(class00869.G, 5, 20);
        class007562.N(class00869.l, 5, 20);
        class007562.N(class00869.d, 5, 20);
        class007562.N(class00869.UE, 5, 20);
        class007562.N(class00869.UW, 5, 20);
        class007562.N(class00869.Um, 5, 20);
        class007562.N(class00869.UP, 5, 20);
        class007562.N(class00869.Us, 5, 20);
        class007562.N(class00869.UT, 5, 20);
        class007562.N(class00869.Ub, 5, 20);
        class007562.N(class00869.Uj, 5, 20);
        class007562.N(class00869.Uv, 5, 20);
        class007562.N(class00869.Un, 5, 20);
        class007562.N(class00869.Ut, 5, 20);
        class007562.N(class00869.Rp, 5, 20);
        class007562.N(class00869.UX, 5, 20);
        class007562.N(class00869.Ua, 5, 20);
        class007562.N(class00869.Up, 5, 20);
        class007562.N(class00869.UF, 5, 20);
        class007562.N(class00869.UA, 5, 20);
        class007562.N(class00869.Uf, 5, 20);
        class007562.N(class00869.UC, 5, 20);
        class007562.N(class00869.US, 5, 20);
        class007562.N(class00869.Ux, 5, 20);
        class007562.N(class00869.il, 5, 20);
        class007562.N(class00869.UD, 5, 20);
        class007562.N(class00869.Uh, 5, 20);
        class007562.N(class00869.Ur, 5, 20);
        class007562.N(class00869.EN, 5, 20);
        class007562.N(class00869.Ey, 5, 20);
        class007562.N(class00869.EL, 5, 20);
        class007562.N(class00869.Eu, 5, 20);
        class007562.N(class00869.Ei, 5, 20);
        class007562.N(class00869.ER, 5, 20);
        class007562.N(class00869.LF, 5, 20);
        class007562.N(class00869.Mk, 5, 20);
        class007562.N(class00869.Mw, 5, 20);
        class007562.N(class00869.MY, 5, 20);
        class007562.N(class00869.ZJ, 5, 20);
        class007562.N(class00869.Zo, 5, 20);
        class007562.N(class00869.Zq, 5, 20);
        class007562.N(class00869.ZK, 5, 20);
        class007562.N(class00869.ZV, 5, 20);
        class007562.N(class00869.Ze, 5, 20);
        class007562.N(class00869.ZH, 5, 20);
        class007562.N(class00869.D, 5, 5);
        class007562.N(class00869.h, 5, 5);
        class007562.N(class00869.r, 5, 5);
        class007562.N(class00869.NN, 5, 5);
        class007562.N(class00869.Ny, 5, 5);
        class007562.N(class00869.NL, 5, 5);
        class007562.N(class00869.Ni, 5, 5);
        class007562.N(class00869.Nu, 5, 5);
        class007562.N(class00869.NR, 5, 5);
        class007562.N(class00869.NZ, 5, 5);
        class007562.N(class00869.NT, 5, 5);
        class007562.N(class00869.Nz, 5, 5);
        class007562.N(class00869.NU, 5, 5);
        class007562.N(class00869.NE, 5, 5);
        class007562.N(class00869.NW, 5, 5);
        class007562.N(class00869.Nm, 5, 5);
        class007562.N(class00869.NP, 5, 5);
        class007562.N(class00869.Ns, 5, 5);
        class007562.N(class00869.Nb, 5, 5);
        class007562.N(class00869.Nj, 5, 5);
        class007562.N(class00869.NY, 5, 5);
        class007562.N(class00869.NQ, 5, 5);
        class007562.N(class00869.NO, 5, 5);
        class007562.N(class00869.Ng, 5, 5);
        class007562.N(class00869.NI, 5, 5);
        class007562.N(class00869.NJ, 5, 5);
        class007562.N(class00869.No, 5, 5);
        class007562.N(class00869.Nq, 5, 5);
        class007562.N(class00869.NK, 5, 5);
        class007562.N(class00869.Nv, 5, 5);
        class007562.N(class00869.Nn, 5, 5);
        class007562.N(class00869.Nt, 5, 5);
        class007562.N(class00869.NG, 5, 5);
        class007562.N(class00869.Nl, 5, 5);
        class007562.N(class00869.Nd, 5, 5);
        class007562.N(class00869.n, 5, 5);
        class007562.N(class00869.Nw, 5, 5);
        class007562.N(class00869.Nk, 5, 5);
        class007562.N(class00869.NM, 5, 20);
        class007562.N(class00869.NV, 30, 60);
        class007562.N(class00869.Ne, 30, 60);
        class007562.N(class00869.NH, 30, 60);
        class007562.N(class00869.Nc, 30, 60);
        class007562.N(class00869.NX, 30, 60);
        class007562.N(class00869.Na, 30, 60);
        class007562.N(class00869.Np, 30, 60);
        class007562.N(class00869.NF, 30, 60);
        class007562.N(class00869.NA, 30, 60);
        class007562.N(class00869.Lt, 30, 20);
        class007562.N(class00869.Ln, 15, 100);
        class007562.N(class00869.yk, 60, 100);
        class007562.N(class00869.yY, 60, 100);
        class007562.N(class00869.yQ, 60, 100);
        class007562.N(class00869.yg, 60, 100);
        class007562.N(class00869.yI, 60, 100);
        class007562.N(class00869.zt, 60, 100);
        class007562.N(class00869.zG, 60, 100);
        class007562.N(class00869.zl, 60, 100);
        class007562.N(class00869.zd, 60, 100);
        class007562.N(class00869.zw, 60, 100);
        class007562.N(class00869.zk, 60, 100);
        class007562.N(class00869.Ly, 60, 100);
        class007562.N(class00869.Lu, 60, 100);
        class007562.N(class00869.nx, 60, 100);
        class007562.N(class00869.nD, 60, 100);
        class007562.N(class00869.Li, 60, 100);
        class007562.N(class00869.LR, 60, 100);
        class007562.N(class00869.LM, 60, 100);
        class007562.N(class00869.LB, 60, 100);
        class007562.N(class00869.LZ, 60, 100);
        class007562.N(class00869.Lz, 60, 100);
        class007562.N(class00869.LU, 60, 100);
        class007562.N(class00869.LE, 60, 100);
        class007562.N(class00869.LW, 60, 100);
        class007562.N(class00869.LP, 60, 100);
        class007562.N(class00869.LL, 60, 100);
        class007562.N(class00869.Ed, 60, 100);
        class007562.N(class00869.Lm, 60, 100);
        class007562.N(class00869.vh, 60, 100);
        class007562.N(class00869.vr, 60, 100);
        class007562.N(class00869.nN, 60, 100);
        class007562.N(class00869.iv, 60, 100);
        class007562.N(class00869.yV, 30, 60);
        class007562.N(class00869.ye, 30, 60);
        class007562.N(class00869.yH, 30, 60);
        class007562.N(class00869.yc, 30, 60);
        class007562.N(class00869.yX, 30, 60);
        class007562.N(class00869.ya, 30, 60);
        class007562.N(class00869.yp, 30, 60);
        class007562.N(class00869.yF, 30, 60);
        class007562.N(class00869.yA, 30, 60);
        class007562.N(class00869.yf, 30, 60);
        class007562.N(class00869.yC, 30, 60);
        class007562.N(class00869.yS, 30, 60);
        class007562.N(class00869.yx, 30, 60);
        class007562.N(class00869.yD, 30, 60);
        class007562.N(class00869.yh, 30, 60);
        class007562.N(class00869.yr, 30, 60);
        class007562.N(class00869.Rc, 15, 100);
        class007562.N(class00869.zv, 5, 5);
        class007562.N(class00869.zy, 60, 20);
        class007562.N(class00869.Tu, 15, 20);
        class007562.N(class00869.zL, 60, 20);
        class007562.N(class00869.zu, 60, 20);
        class007562.N(class00869.zi, 60, 20);
        class007562.N(class00869.zR, 60, 20);
        class007562.N(class00869.zM, 60, 20);
        class007562.N(class00869.zB, 60, 20);
        class007562.N(class00869.zZ, 60, 20);
        class007562.N(class00869.zz, 60, 20);
        class007562.N(class00869.zU, 60, 20);
        class007562.N(class00869.zE, 60, 20);
        class007562.N(class00869.zW, 60, 20);
        class007562.N(class00869.zm, 60, 20);
        class007562.N(class00869.zP, 60, 20);
        class007562.N(class00869.zs, 60, 20);
        class007562.N(class00869.zT, 60, 20);
        class007562.N(class00869.zb, 60, 20);
        class007562.N(class00869.nf, 5, 100);
        class007562.N(class00869.nC, 5, 100);
        class007562.N(class00869.nS, 5, 100);
        class007562.N(class00869.mN, 30, 60);
        class007562.N(class00869.mx, 60, 60);
        class007562.N(class00869.Pa, 60, 60);
        class007562.N(class00869.PD, 30, 20);
        class007562.N(class00869.TL, 5, 20);
        class007562.N(class00869.sM, 60, 100);
        class007562.N(class00869.TR, 5, 20);
        class007562.N(class00869.Ti, 30, 20);
        class007562.N(class00869.Nf, 30, 60);
        class007562.N(class00869.NC, 30, 60);
        class007562.N(class00869.vA, 15, 60);
        class007562.N(class00869.vf, 15, 60);
        class007562.N(class00869.vC, 60, 100);
        class007562.N(class00869.vS, 30, 60);
        class007562.N(class00869.vx, 30, 60);
        class007562.N(class00869.nL, 60, 100);
        class007562.N(class00869.nu, 60, 100);
        class007562.N(class00869.ni, 60, 100);
        class007562.N(class00869.nR, 30, 60);
        class007562.N(class00869.RX, 15, 100);
        class007562.N(class00869.tN, 60, 100);
        class007562.N(class00869.yO, 60, 100);
        class007562.N(class00869.Ll, 30, 20);
        class007562.N(class00869.Ld, 30, 20);
        class007562.N(class00869.Lw, 30, 20);
        class007562.N(class00869.Lk, 30, 20);
        class007562.N(class00869.LQ, 30, 20);
        class007562.N(class00869.LO, 30, 20);
        class007562.N(class00869.Lg, 30, 20);
        class007562.N(class00869.LI, 30, 20);
        class007562.N(class00869.LJ, 30, 20);
        class007562.N(class00869.Lo, 30, 20);
    }

    protected void N_23(class00500 class005002, class07299 class072992, class07209 class072092, class00500 class005003, boolean bl) {
        super.N_23(class005002, class072992, class072092, class005003, bl);
        class072992.N(class072092, (class00891)this, class00756.N(class072992.field_9229));
    }

    public void N(class00891 class008912, int n, int n2) {
        this.NN.put((Object)class008912, n);
        this.Ny.put((Object)class008912, n2);
    }

    protected void N(class00517<class00891, class00500> class005172) {
        class005172.N(new class08092[]{L, u, i, R, M, B});
    }

    private static int N(class06069 class060692) {
        return 30 + class060692.y(10);
    }

    private void N(class00500 class005002, CallbackInfoReturnable callbackInfoReturnable) {
        FlammableBlockRegistry.Entry entry = this.NL.getFabric(class005002.i());
        if (entry != null) {
            if (class005002.y((class08092)class06665.q) && ((Boolean)class005002.L((class08092)class06665.q)).booleanValue()) {
                callbackInfoReturnable.setReturnValue((Object)0);
            } else {
                callbackInfoReturnable.setReturnValue((Object)entry.getBurnChance());
            }
        }
    }

    private void N(class01362 class013622, CallbackInfo callbackInfo) {
        this.NL = FlammableBlockRegistryImpl.getInstance((class00891)((class00891)this));
    }

    private void N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922, CallbackInfoReturnable callbackInfoReturnable) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2)) {
            callbackInfoReturnable.setReturnValue((Object)class00389.N());
        }
    }

    protected class00500 N(class07290 class072902, class07209 class072092) {
        class07209 class072093 = class072092.method_10074();
        class00500 class005002 = class072902.method_8320(class072093);
        if (this.U(class005002) || class005002.L(class072902, class072093, class07211.field_11036)) {
            return this.W();
        }
        class00500 class005003 = this.W();
        for (class07211 class072112 : class07211.values()) {
            class06667 class066672 = Z.get(class072112);
            if (class066672 == null) continue;
            class005003 = (class00500)class005003.y((class08092)class066672, (Comparable)Boolean.valueOf(this.U(class072902.method_8320(class072092.method_10093(class072112)))));
        }
        return class005003;
    }

    public class00500 N(class06942 class069422) {
        return this.N((class07290)class069422.method_8045(), class069422.method_8037());
    }

    protected class00494 N(class00500 class005002, class07290 class072902, class07209 class072092, class06092 class060922) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.N(class005002, class072902, class072092, class060922, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return (class00494)callbackInfoReturnable.getReturnValue();
        }
        return this.F.apply(class005002);
    }

    protected class00500 N(class00500 class005002, class05487 class054872, class08713 class087132, class07209 class072092, class07211 class072112, class07209 class072093, class00500 class005003, class06069 class060692) {
        if (this.a_(class005002, class054872, class072092)) {
            return this.N(class054872, class072092, (int)((Integer)class005002.L((class08092)L)));
        }
        return class00869.N.W();
    }

    public MapCodec<class00756> N() {
        return N;
    }

    private class00500 N(class05487 class054872, class07209 class072092, int n) {
        class00500 class005002 = class00756.y((class07290)class054872, (class07209)class072092);
        if (class005002.N(class00869.Lc)) {
            return (class00500)class005002.y((class08092)L, (Comparable)Integer.valueOf(n));
        }
        return class005002;
    }

    private int N(class05487 class054872, class07209 class072092) {
        if (!class054872.R(class072092)) {
            return 0;
        }
        int n = 0;
        for (class07211 class072112 : class07211.values()) {
            class00500 class005002 = class054872.method_8320(class072092.method_10093(class072112));
            n = Math.max(this.b(class005002), n);
        }
        return n;
    }

    protected boolean N(class07299 class072992, class07209 class072092) {
        return class072992.method_8520(class072092) || class072992.method_8520(class072092.method_10067()) || class072992.method_8520(class072092.method_10078()) || class072992.method_8520(class072092.method_10095()) || class072992.method_8520(class072092.method_10072());
    }

    protected void N(class00500 class005002, class04782 class047822, class07209 class072092, class06069 class060692) {
        boolean bl;
        class047822.N(class072092, (class00891)this, class00756.N(class047822.field_9229));
        if (!class047822.method_76058(class072092)) {
            return;
        }
        if (!class005002.N((class05487)class047822, class072092)) {
            class047822.method_8650(class072092, false);
        }
        boolean bl2 = class047822.method_8320(class072092.method_10074()).N(class047822.method_8597().U());
        int n = (Integer)class005002.L((class08092)L);
        if (!bl2 && class047822.method_8419() && this.N((class07299)class047822, class072092) && class060692.z() < 0.2f + (float)n * 0.03f) {
            class047822.method_8650(class072092, false);
            return;
        }
        int n2 = Math.min(15, n + class060692.y(3) / 2);
        if (n != n2) {
            class005002 = (class00500)class005002.y((class08092)L, (Comparable)Integer.valueOf(n2));
            class047822.method_8652(class072092, class005002, 260);
        }
        if (!bl2) {
            if (!this.u((class07290)class047822, class072092)) {
                class07209 class072093 = class072092.method_10074();
                if (!class047822.method_8320(class072093).L((class07290)class047822, class072093, class07211.field_11036) || n > 3) {
                    class047822.method_8650(class072092, false);
                }
                return;
            }
            if (n == 15 && class060692.y(4) == 0 && !this.U(class047822.method_8320(class072092.method_10074()))) {
                class047822.method_8650(class072092, false);
                return;
            }
        }
        int n3 = (bl = ((Boolean)class047822.method_75728().N(class00608.J, class072092)).booleanValue()) ? -50 : 0;
        this.N((class07299)class047822, class072092.method_10078(), 300 + n3, class060692, n);
        this.N((class07299)class047822, class072092.method_10067(), 300 + n3, class060692, n);
        this.N((class07299)class047822, class072092.method_10074(), 250 + n3, class060692, n);
        this.N((class07299)class047822, class072092.method_10084(), 250 + n3, class060692, n);
        this.N((class07299)class047822, class072092.method_10095(), 300 + n3, class060692, n);
        this.N((class07299)class047822, class072092.method_10072(), 300 + n3, class060692, n);
        class07218 class072182 = new class07218();
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                for (int k = -1; k <= 4; ++k) {
                    if (i == 0 && k == 0 && j == 0) continue;
                    int n4 = 100;
                    if (k > 1) {
                        n4 += (k - 1) * 100;
                    }
                    class072182.N((class00753)class072092, i, k, j);
                    int n5 = this.N((class05487)class047822, (class07209)class072182);
                    if (n5 <= 0) continue;
                    int n6 = (n5 + 40 + class047822.y().N() * 7) / (n + 30);
                    if (bl) {
                        n6 /= 2;
                    }
                    if (n6 <= 0 || class060692.y(n4) > n6 || class047822.method_8419() && this.N((class07299)class047822, (class07209)class072182)) continue;
                    int n7 = Math.min(15, n + class060692.y(5) / 4);
                    class047822.method_8652((class07209)class072182, this.N((class05487)class047822, (class07209)class072182, n7), 3);
                }
            }
        }
    }

    private void N(class07299 class072992, class07209 class072092, int n, class06069 class060692, int n2) {
        int n3 = this.T(class072992.method_8320(class072092));
        if (class060692.y(n) < n3) {
            class00500 class005002 = class072992.method_8320(class072092);
            if (class060692.y(n2 + 10) < 5 && !class072992.method_8520(class072092)) {
                int n4 = Math.min(n2 + class060692.y(5) / 4, 15);
                class072992.method_8652(class072092, this.N((class05487)class072992, class072092, n4), 3);
            } else {
                class072992.method_8650(class072092, false);
            }
            class00891 class008912 = class005002.i();
            if (class008912 instanceof class00655) {
                class00655.N((class07299)class072992, (class07209)class072092);
            }
        }
    }

    protected boolean a_(class00500 class005002, class05487 class054872, class07209 class072092) {
        class07209 class072093 = class072092.method_10074();
        return class054872.method_8320(class072093).L((class07290)class054872, class072093, class07211.field_11036) || this.u((class07290)class054872, class072092);
    }

    public FlammableBlockRegistry.Entry fabric_getVanillaEntry(class00500 class005002) {
        return new FlammableBlockRegistry.Entry(this.b(class005002), this.T(class005002));
    }
}

