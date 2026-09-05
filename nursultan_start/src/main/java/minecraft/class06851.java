/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10678
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.textures.AddressMode
 *  com.mojang.blaze3d.textures.FilterMode
 *  minecraft.class01894
 *  minecraft.class02862
 *  minecraft.class03334
 *  minecraft.class07311
 *  minecraft.class07536
 *  minecraft.class08188
 *  minecraft.class08394
 *  minecraft.class08626
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.pipeline.WorldRenderingPipeline
 */
package minecraft;

import Nursultan.class10678;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import minecraft.class01894;
import minecraft.class02862;
import minecraft.class03334;
import minecraft.class06823;
import minecraft.class06828;
import minecraft.class06833;
import minecraft.class06835;
import minecraft.class06856;
import minecraft.class07311;
import minecraft.class07536;
import minecraft.class08188;
import minecraft.class08394;
import minecraft.class08626;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;

public class class06851 {
    static final BiFunction<class01894, Boolean, class07311> N = class07536.N((T class018942, U bl) -> class07311.method_75940((String)"outline", (class06828)class06828.N(bl != false ? class08394.yy : class08394.yL).N("Sampler0", (class01894)class018942).N(class06856.y).N(class06823.field_21854).i()));
    public static final Supplier<class08188> y = () -> RenderSystem.getSamplerCache().N(AddressMode.CLAMP_TO_EDGE, AddressMode.CLAMP_TO_EDGE, FilterMode.LINEAR, FilterMode.NEAREST, true);
    private static final class07311 R = class07311.method_75940((String)"solid_moving_block", (class06828)class06828.N(class08394.l).N().N("Sampler0", class08626.N, y).L().N(class06823.field_21855).i());
    private static final class07311 M = class07311.method_75940((String)"cutout_moving_block", (class06828)class06828.N(class08394.k).N().N("Sampler0", class08626.N, y).L().N(class06823.field_21855).i());
    private static final class07311 B = class07311.method_75940((String)"translucent_moving_block", (class06828)class06828.N(class08394.I).N().N("Sampler0", class08626.N, y).N(class06856.u).u().N(786432).N(class06823.field_21855).i());
    private static final Function<class01894, class07311> Z = class07536.y_4(class018942 -> {
        class06828 class068282 = class06828.N(class08394.J).N("Sampler0", (class01894)class018942).N().y().N(class06833.y).L().N(class06823.field_21855).i();
        return class07311.method_75940((String)"armor_cutout_no_cull", (class06828)class068282);
    });
    private static final Function<class01894, class07311> z = class07536.y_4(class018942 -> {
        class06828 class068282 = class06828.N(class08394.q).N("Sampler0", (class01894)class018942).N().y().N(class06833.y).L().u().N(class06823.field_21855).i();
        return class07311.method_75940((String)"armor_translucent", (class06828)class068282);
    });
    private static final Function<class01894, class07311> U = class07536.y_4(class018942 -> {
        class06828 class068282 = class06828.N(class08394.K).N("Sampler0", (class01894)class018942).N().y().L().N(class06823.field_21855).i();
        return class07311.method_75940((String)"entity_solid", (class06828)class068282);
    });
    private static final Function<class01894, class07311> E = class07536.y_4(class018942 -> {
        class06828 class068282 = class06828.N(class08394.V).N("Sampler0", (class01894)class018942).N().y().N(class06833.L).L().N(class06823.field_21855).i();
        return class07311.method_75940((String)"entity_solid_z_offset_forward", (class06828)class068282);
    });
    private static final Function<class01894, class07311> W = class07536.y_4(class018942 -> {
        class06828 class068282 = class06828.N(class08394.e).N("Sampler0", (class01894)class018942).N().y().L().N(class06823.field_21855).i();
        return class07311.method_75940((String)"entity_cutout", (class06828)class068282);
    });
    private static final BiFunction<class01894, Boolean, class07311> m = class07536.N((T class018942, U bl) -> {
        class06828 class068282 = class06828.N(class08394.H).N("Sampler0", (class01894)class018942).N().y().L().N(bl != false ? class06823.field_21855 : class06823.field_21853).i();
        return class07311.method_75940((String)"entity_cutout_no_cull", (class06828)class068282);
    });
    private static final BiFunction<class01894, Boolean, class07311> P = class07536.N((T class018942, U bl) -> {
        class06828 class068282 = class06828.N(class08394.c).N("Sampler0", (class01894)class018942).N().y().N(class06833.y).L().N(bl != false ? class06823.field_21855 : class06823.field_21853).i();
        return class07311.method_75940((String)"entity_cutout_no_cull_z_offset", (class06828)class068282);
    });
    private static final Function<class01894, class07311> s = class07536.y_4(class018942 -> {
        class06828 class068282 = class06828.N(class08394.D).N("Sampler0", (class01894)class018942).N(class06856.u).N().y().L().u().N(class06823.field_21855).i();
        return class07311.method_75940((String)"item_entity_translucent_cull", (class06828)class068282);
    });
    private static final BiFunction<class01894, Boolean, class07311> T = class07536.N((T class018942, U bl) -> {
        class06828 class068282 = class06828.N(class08394.X).N("Sampler0", (class01894)class018942).N().y().L().u().N(bl != false ? class06823.field_21855 : class06823.field_21853).i();
        return class07311.method_75940((String)"entity_translucent", (class06828)class068282);
    });
    private static final BiFunction<class01894, Boolean, class07311> b = class07536.N((T class018942, U bl) -> {
        class06828 class068282 = class06828.N(class08394.a).N("Sampler0", (class01894)class018942).y().L().u().N(bl != false ? class06823.field_21855 : class06823.field_21853).i();
        return class07311.method_75940((String)"entity_translucent_emissive", (class06828)class068282);
    });
    private static final Function<class01894, class07311> j = class07536.y_4(class018942 -> {
        class06828 class068282 = class06828.N(class08394.p).N("Sampler0", (class01894)class018942).N().y().N(class06823.field_21855).i();
        return class07311.method_75940((String)"entity_smooth_cutout", (class06828)class068282);
    });
    private static final BiFunction<class01894, Boolean, class07311> v = class07536.N((T class018942, U bl) -> {
        class06828 class068282 = class06828.N(bl != false ? class08394.r : class08394.h).N("Sampler0", (class01894)class018942).u().i();
        return class07311.method_75940((String)"beacon_beam", (class06828)class068282);
    });
    private static final Function<class01894, class07311> n = class07536.y_4(class018942 -> {
        class06828 class068282 = class06828.N(class08394.S).N("Sampler0", (class01894)class018942).N().y().i();
        return class07311.method_75940((String)"entity_decal", (class06828)class068282);
    });
    private static final Function<class01894, class07311> t = class07536.y_4(class018942 -> {
        class06828 class068282 = class06828.N(class08394.F).N("Sampler0", (class01894)class018942).N().y().u().i();
        return class07311.method_75940((String)"entity_no_outline", (class06828)class068282);
    });
    private static final Function<class01894, class07311> G = class07536.y_4(class018942 -> {
        class06828 class068282 = class06828.N(class08394.x).N("Sampler0", (class01894)class018942).N().y().N(class06833.y).i();
        return class07311.method_75940((String)"entity_shadow", (class06828)class068282);
    });
    private static final Function<class01894, class07311> l = class07536.y_4(class018942 -> {
        class06828 class068282 = class06828.N(class08394.NN).N("Sampler0", (class01894)class018942).N(class06823.field_21855).i();
        return class07311.method_75940((String)"entity_alpha", (class06828)class068282);
    });
    private static final Function<class01894, class07311> d = class07536.y_4(class018942 -> class07311.method_75940((String)"eyes", (class06828)class06828.N(class08394.C).N("Sampler0", (class01894)class018942).u().i()));
    private static final class07311 w = class07311.method_75940((String)"leash", (class06828)class06828.N(class08394.Ny).N().i());
    private static final class07311 k = class07311.method_75940((String)"water_mask", (class06828)class06828.N(class08394.NL).i());
    private static final class07311 Y = class07311.method_75940((String)"armor_entity_glint", (class06828)class06828.N(class08394.Nu).N("Sampler0", class02862.N).N(class06835.i).N(class06833.y).i());
    private static final class07311 Q = class07311.method_75940((String)"glint_translucent", (class06828)class06828.N(class08394.Nu).N("Sampler0", class02862.y).N(class06835.L).N(class06856.u).i());
    private static final class07311 O = class07311.method_75940((String)"glint", (class06828)class06828.N(class08394.Nu).N("Sampler0", class02862.y).N(class06835.L).i());
    private static final class07311 g = class07311.method_75940((String)"entity_glint", (class06828)class06828.N(class08394.Nu).N("Sampler0", class02862.y).N(class06835.u).i());
    private static final Function<class01894, class07311> I = class07536.y_4(class018942 -> class07311.method_75940((String)"crumbling", (class06828)class06828.N(class08394.Ni).N("Sampler0", (class01894)class018942).u().i()));
    private static final Function<class01894, class07311> J = class07536.y_4(class018942 -> class07311.method_75940((String)"text", (class06828)class06828.N(class08394.NR).N("Sampler0", (class01894)class018942).N().N(786432).i()));
    private static final class07311 o = class07311.method_75940((String)"text_background", (class06828)class06828.N(class08394.NB).N().u().i());
    private static final Function<class01894, class07311> q = class07536.y_4(class018942 -> class07311.method_75940((String)"text_intensity", (class06828)class06828.N(class08394.NZ).N("Sampler0", (class01894)class018942).N().N(786432).i()));
    private static final Function<class01894, class07311> K = class07536.y_4(class018942 -> class07311.method_75940((String)"text_polygon_offset", (class06828)class06828.N(class08394.NU).N("Sampler0", (class01894)class018942).N().u().i()));
    private static final Function<class01894, class07311> V = class07536.y_4(class018942 -> class07311.method_75940((String)"text_intensity_polygon_offset", (class06828)class06828.N(class08394.NZ).N("Sampler0", (class01894)class018942).N().u().i()));
    private static final Function<class01894, class07311> e = class07536.y_4(class018942 -> class07311.method_75940((String)"text_see_through", (class06828)class06828.N(class08394.NE).N("Sampler0", (class01894)class018942).N().i()));
    private static final class07311 H = class07311.method_75940((String)"text_background_see_through", (class06828)class06828.N(class08394.NW).N().u().i());
    private static final Function<class01894, class07311> c = class07536.y_4(class018942 -> class07311.method_75940((String)"text_intensity_see_through", (class06828)class06828.N(class08394.Nm).N("Sampler0", (class01894)class018942).N().u().i()));
    private static final class07311 X = class07311.method_75940((String)"lightning", (class06828)class06828.N(class08394.NP).N(class06856.L).u().i());
    private static final class07311 a = class07311.method_75940((String)"dragon_rays", (class06828)class06828.N(class08394.Ns).i());
    private static final class07311 p = class07311.method_75940((String)"dragon_rays_depth", (class06828)class06828.N(class08394.NT).i());
    private static final class07311 F = class07311.method_75940((String)"tripwire_moving_block", (class06828)class06828.N(class08394.O).N().N("Sampler0", class08626.N, y).N(class06856.L).L().u().N(class06823.field_21855).i());
    private static final class07311 A = class07311.method_75940((String)"end_portal", (class06828)class06828.N(class08394.Nb).N("Sampler0", class03334.N).N("Sampler1", class03334.y).i());
    private static final class07311 f = class07311.method_75940((String)"end_gateway", (class06828)class06828.N(class08394.Nj).N("Sampler0", class03334.N).N("Sampler1", class03334.y).i());
    public static final class07311 L = class07311.method_75940((String)"lines", (class06828)class06828.N(class08394.Nt).N(class06833.y).N(class06856.u).i());
    public static final class07311 u = class07311.method_75940((String)"lines_translucent", (class06828)class06828.N(class08394.NG).N(class06833.y).N(class06856.u).i());
    public static final class07311 i = class07311.method_75940((String)"secondary_block_outline", (class06828)class06828.N(class08394.Nl).N(class06833.y).N(class06856.u).i());
    private static final class07311 C = class07311.method_75940((String)"debug_filled_box", (class06828)class06828.N(class08394.Nw).u().N(class06833.y).i());
    private static final class07311 S = class07311.method_75940((String)"debug_point", (class06828)class06828.N(class08394.Nd).i());
    private static final class07311 x = class07311.method_75940((String)"debug_quads", (class06828)class06828.N(class08394.Nk).u().i());
    private static final class07311 D = class07311.method_75940((String)"debug_triangle_fan", (class06828)class06828.N(class08394.NY).u().i());
    private static final Function<class01894, class07311> h = class06851.N(class08394.NI);
    private static final Function<class01894, class07311> r = class06851.N(class08394.NJ);
    private static final Function<class01894, class07311> NN = class07536.y_4(class018942 -> class07311.method_75940((String)"block_screen_effect", (class06828)class06828.N(class08394.NF).N("Sampler0", (class01894)class018942).i()));
    private static final Function<class01894, class07311> Ny = class07536.y_4(class018942 -> class07311.method_75940((String)"fire_screen_effect", (class06828)class06828.N(class08394.NA).N("Sampler0", (class01894)class018942).i()));

    public static class07311 w(class01894 class018942) {
        return c.apply(class018942);
    }

    public static class07311 L() {
        return B;
    }

    public static class07311 L(class01894 class018942, boolean bl) {
        return T.apply(class018942, bl);
    }

    public static class07311 L(class01894 class018942) {
        return z.apply(class018942);
    }

    public static class07311 M() {
        return Q;
    }

    private static class07311 M(class01894 class018942, boolean bl) {
        return (bl ? h : r).apply(class018942);
    }

    public static class07311 M(class01894 class018942) {
        return class06851.N(class018942, true);
    }

    public static class07311 P(class01894 class018942) {
        return G.apply(class018942);
    }

    public static class07311 P() {
        return F;
    }

    public static class07311 T(class01894 class018942) {
        return d.apply(class018942);
    }

    public static class07311 T() {
        return f;
    }

    public static class07311 B() {
        return O;
    }

    public static class07311 B(class01894 class018942) {
        return class06851.y(class018942, true);
    }

    public static class07311 Z() {
        return g;
    }

    public static class07311 Z(class01894 class018942) {
        return s.apply(class018942);
    }

    public static class07311 i(class01894 class018942) {
        return E.apply(class018942);
    }

    public static class07311 i(class01894 class018942, boolean bl) {
        return v.apply(class018942, bl);
    }

    public static class07311 i() {
        return k;
    }

    public static class07311 b() {
        return L;
    }

    public static class07311 b(class01894 class018942) {
        return b.apply(class018942, false);
    }

    public static class07311 s() {
        return A;
    }

    public static class07311 s(class01894 class018942) {
        return l.apply(class018942);
    }

    public static class07311 n(class01894 class018942) {
        return J.apply(class018942);
    }

    public static class07311 n() {
        return C;
    }

    public static class07311 l(class01894 class018942) {
        return V.apply(class018942);
    }

    public static class07311 l() {
        return D;
    }

    public static class07311 d(class01894 class018942) {
        return e.apply(class018942);
    }

    public static class07311 m() {
        return p;
    }

    public static class07311 m(class01894 class018942) {
        return t.apply(class018942);
    }

    public static class07311 k(class01894 class018942) {
        return NN.apply(class018942);
    }

    public static class07311 t() {
        return S;
    }

    public static class07311 t(class01894 class018942) {
        return q.apply(class018942);
    }

    public static class07311 v() {
        return i;
    }

    public static class07311 v(class01894 class018942) {
        return I.apply(class018942);
    }

    public static class07311 j(class01894 class018942) {
        return N.apply(class018942, false);
    }

    public static class07311 j() {
        return u;
    }

    public static class07311 U(class01894 class018942) {
        return class06851.u(class018942, true);
    }

    public static class07311 U() {
        return H;
    }

    public static class07311 z(class01894 class018942) {
        return class06851.L(class018942, true);
    }

    public static class07311 z() {
        return o;
    }

    public static class07311 u() {
        return w;
    }

    public static class07311 u(class01894 class018942, boolean bl) {
        return b.apply(class018942, bl);
    }

    public static class07311 u(class01894 class018942) {
        return U.apply(class018942);
    }

    public static class07311 y() {
        return M;
    }

    public static class07311 y(class01894 class018942, float f, float f2) {
        return class07311.method_75940((String)"energy_swirl", (class06828)class06828.N(class08394.f).N("Sampler0", class018942).N((class06835)new class10678(f, f2)).N().y().u().i());
    }

    public static class07311 y(class01894 class018942, boolean bl) {
        return P.apply(class018942, bl);
    }

    public static class07311 y(class01894 class018942) {
        class06828 class068282 = class06828.N(class08394.o).N("Sampler0", class018942).N().y().N(class06833.y).L().N(class06823.field_21855).i();
        return class07311.method_75940((String)"armor_decal_cutout_no_cull", (class06828)class068282);
    }

    public static class07311 E() {
        return X;
    }

    public static class07311 E(class01894 class018942) {
        return j.apply(class018942);
    }

    public static class07311 N() {
        return R;
    }

    private static class07311 N(class01894 class018942, boolean bl, Operation operation) {
        if (Iris.getPipelineManager().getPipeline().map(WorldRenderingPipeline::shouldWriteRainAndSnowToDepthBuffer).orElse(false).booleanValue()) {
            return (class07311)operation.call(new Object[]{class018942, true});
        }
        return (class07311)operation.call(new Object[]{class018942, bl});
    }

    public static class07311 N(class01894 class018942) {
        return Z.apply(class018942);
    }

    public static class07311 N(class01894 class018942, boolean bl) {
        return m.apply(class018942, bl);
    }

    private static Function<class01894, class07311> N(RenderPipeline renderPipeline) {
        return class07536.y_4(class018942 -> class07311.method_75940((String)"weather", (class06828)class06828.N(renderPipeline).N("Sampler0", (class01894)class018942).N(class06856.L).N().i()));
    }

    public static class07311 N(class01894 class018942, float f, float f2) {
        return class07311.method_75940((String)"breeze_wind", (class06828)class06828.N(class08394.A).N("Sampler0", class018942).N((class06835)new class10678(f, f2)).N().u().i());
    }

    public static class07311 W() {
        return a;
    }

    public static class07311 W(class01894 class018942) {
        return n.apply(class018942);
    }

    public static class07311 R(class01894 class018942, boolean bl) {
        return class06851.N(class018942, bl, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[net.minecraft.class_2960, boolean]");
            return class06851.M((class01894)objectArray[0], (Boolean)objectArray[1]);
        });
    }

    public static class07311 R(class01894 class018942) {
        return W.apply(class018942);
    }

    public static class07311 R() {
        return Y;
    }

    public static class07311 G(class01894 class018942) {
        return K.apply(class018942);
    }

    public static class07311 G() {
        return x;
    }

    public static class07311 Y(class01894 class018942) {
        return Ny.apply(class018942);
    }
}

