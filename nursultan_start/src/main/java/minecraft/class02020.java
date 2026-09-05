/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  java.lang.MatchException
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01391
 *  minecraft.class01421
 *  minecraft.class01423
 *  minecraft.class01587
 *  minecraft.class01833
 *  minecraft.class02566
 *  minecraft.class02730
 *  minecraft.class04995
 *  minecraft.class05474
 *  minecraft.class06069
 *  minecraft.class06202
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07290
 *  minecraft.class07295
 *  minecraft.class07878
 *  minecraft.class08877
 *  minecraft.class08887
 *  net.caffeinemc.mods.sodium.api.texture.SpriteUtil
 *  net.caffeinemc.mods.sodium.api.util.ColorABGR
 *  net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter
 *  net.caffeinemc.mods.sodium.client.model.quad.BakedQuadView
 *  net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView
 *  net.caffeinemc.mods.sodium.client.render.frapi.render.SimpleBlockRenderContext
 *  net.caffeinemc.mods.sodium.client.render.immediate.model.BakedModelEncoder
 *  net.caffeinemc.mods.sodium.client.render.vertex.VertexConsumerUtils
 *  net.caffeinemc.mods.sodium.client.util.DirectionUtil
 *  net.caffeinemc.mods.sodium.mixin.frapi.ModelBlockRendererAccessor
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.render.FabricBlockModelRenderer
 *  org.joml.Vector3fc
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01391;
import minecraft.class01421;
import minecraft.class01423;
import minecraft.class01587;
import minecraft.class01833;
import minecraft.class02010;
import minecraft.class02022;
import minecraft.class02023;
import minecraft.class02029;
import minecraft.class02032;
import minecraft.class02566;
import minecraft.class02730;
import minecraft.class04995;
import minecraft.class05474;
import minecraft.class06069;
import minecraft.class06202;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07290;
import minecraft.class07295;
import minecraft.class07878;
import minecraft.class08877;
import minecraft.class08887;
import net.caffeinemc.mods.sodium.api.texture.SpriteUtil;
import net.caffeinemc.mods.sodium.api.util.ColorABGR;
import net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter;
import net.caffeinemc.mods.sodium.client.model.quad.BakedQuadView;
import net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView;
import net.caffeinemc.mods.sodium.client.render.frapi.render.SimpleBlockRenderContext;
import net.caffeinemc.mods.sodium.client.render.immediate.model.BakedModelEncoder;
import net.caffeinemc.mods.sodium.client.render.vertex.VertexConsumerUtils;
import net.caffeinemc.mods.sodium.client.util.DirectionUtil;
import net.caffeinemc.mods.sodium.mixin.frapi.ModelBlockRendererAccessor;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.render.FabricBlockModelRenderer;
import org.joml.Vector3fc;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
public class class02020
implements ModelBlockRendererAccessor,
FabricBlockModelRenderer {
    private static final class07211[] y = class07211.values();
    private final class01587 L;
    private static final int u = 100;
    static final ThreadLocal<class02029> N = ThreadLocal.withInitial(class02029::new);
    private static final ThreadLocal i;
    private static final ThreadLocal R;

    private static /* synthetic */ List L() {
        return new ObjectArrayList();
    }

    public void L(class07295 class072952, List<class08877> list, class00500 class005002, class07209 class072092, class01421 class014212, class01391 class013912, boolean bl, int n) {
        class02023 class020232 = new class02023();
        int n2 = 0;
        int n3 = 0;
        for (class08877 class088772 : list) {
            for (class07211 class072112 : y) {
                List var21;
                boolean bl2;
                int n4 = 1 << class072112.ordinal();
                boolean bl3 = (n2 & n4) == 1;
                boolean bl4 = bl2 = (n3 & n4) == 1;
                if (bl3 && !bl2 || (var21 = class088772.N(class072112)).isEmpty()) continue;
                class07218 class072182 = class020232.N.N((class00753)class072092, class072112);
                if (!bl3) {
                    bl2 = class02020.N(class072952, class005002, bl, class072112, (class07209)class072182);
                    n2 |= n4;
                    if (bl2) {
                        n3 |= n4;
                    }
                }
                if (!bl2) continue;
                int n5 = class020232.B.N(class005002, class072952, (class07209)class072182);
                this.N(class072952, class005002, class072092, n5, n, false, class014212, class013912, var21, class020232);
            }
            List var14 = class088772.N(null);
            if (var14.isEmpty()) continue;
            this.N(class072952, class005002, class072092, -1, n, true, class014212, class013912, var14, class020232);
        }
    }

    public class02020(class01587 class015872) {
        this.L = class015872;
    }

    private static /* synthetic */ class06069 u() {
        return new class01833(42L);
    }

    public static void y() {
        N.get().y();
    }

    public void y(class07295 class072952, List<class08877> list, class00500 class005002, class07209 class072092, class01421 class014212, class01391 class013912, boolean bl, int n) {
        class02032 class020322 = new class02032();
        int n2 = 0;
        int n3 = 0;
        for (class08877 class088772 : list) {
            for (class07211 class072112 : y) {
                List var21;
                boolean bl2;
                int n4 = 1 << class072112.ordinal();
                boolean bl3 = (n2 & n4) == 1;
                boolean bl4 = bl2 = (n3 & n4) == 1;
                if (bl3 && !bl2 || (var21 = class088772.N(class072112)).isEmpty()) continue;
                if (!bl3) {
                    bl2 = class02020.N(class072952, class005002, bl, class072112, (class07209)class020322.N.N((class00753)class072092, class072112));
                    n2 |= n4;
                    if (bl2) {
                        n3 |= n4;
                    }
                }
                if (!bl2) continue;
                this.N(class072952, class005002, class072092, class014212, class013912, var21, class020322, n);
            }
            List var14 = class088772.N(null);
            if (var14.isEmpty()) continue;
            this.N(class072952, class005002, class072092, class014212, class013912, var14, class020322, n);
        }
    }

    private static void N(class01423 class014232, VertexBufferWriter vertexBufferWriter, int n, List list, int n2, int n3) {
        for (int i = 0; i < list.size(); ++i) {
            BakedQuadView bakedQuadView = (class02022)list.get(i);
            int n4 = bakedQuadView.hasColor() ? n : -1;
            BakedModelEncoder.writeQuadVertices((VertexBufferWriter)vertexBufferWriter, (class01423)class014232, (ModelQuadView)bakedQuadView, (int)n4, (int)n2, (int)n3, (boolean)false);
            if (bakedQuadView.getSprite() == null) continue;
            SpriteUtil.INSTANCE.markSpriteActive(bakedQuadView.getSprite());
        }
    }

    private void N(class07295 class072952, class00500 class005002, class07209 class072092, class01391 class013912, class01423 class014232, class02022 class020222, Object object, int n, CallbackInfo callbackInfo) {
        if (class020222.E() != null) {
            SpriteUtil.INSTANCE.markSpriteActive(class020222.E());
        }
    }

    public static void N(class01423 class014232, class01391 class013912, class08887 class088872, float f, float f2, float f3, int n, int n2) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        class02020.N(class014232, class013912, class088872, f, f2, f3, n, n2, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        ((SimpleBlockRenderContext)SimpleBlockRenderContext.POOL.get()).bufferModel(class014232, class087432 -> class013912, class088872, f, f2, f3, n, n2, (class07295)class02730.field_52611, class07209.field_10980, class00869.N.W());
    }

    private static void N(class01423 class014232, class01391 class013912, class08887 class088872, float f, float f2, float f3, int n, int n2, CallbackInfo callbackInfo) {
        VertexBufferWriter vertexBufferWriter = VertexConsumerUtils.convertOrLog((class01391)class013912);
        if (vertexBufferWriter == null) {
            return;
        }
        callbackInfo.cancel();
        class06069 class060692 = (class06069)i.get();
        f = class04995.N((float)f, (float)0.0f, (float)1.0f);
        f2 = class04995.N((float)f2, (float)0.0f, (float)1.0f);
        f3 = class04995.N((float)f3, (float)0.0f, (float)1.0f);
        int n3 = ColorABGR.pack((float)f, (float)f2, (float)f3, (float)1.0f);
        class060692.N(42L);
        List list = (List)R.get();
        list.clear();
        class088872.method_68513(class060692, list);
        for (class08877 class088772 : list) {
            for (class07211 class072112 : DirectionUtil.ALL_DIRECTIONS) {
                List var19 = class088772.N(class072112);
                if (var19.isEmpty()) continue;
                class02020.N(class014232, vertexBufferWriter, n3, var19, n, n2);
            }
            List var15 = class088772.N(null);
            if (var15.isEmpty()) continue;
            class02020.N(class014232, vertexBufferWriter, n3, var15, n, n2);
        }
    }

    private void N(class07295 class072952, class00500 class005002, class07209 class072092, class01391 class013912, class01423 class014232, class02022 class020222, class02023 class020232, int n) {
        float f;
        float f2;
        float f3;
        this.N(class072952, class005002, class072092, class013912, class014232, class020222, class020232, n, null);
        int n2 = class020222.z();
        if (n2 != -1) {
            int n3;
            if (class020232.R == n2) {
                n3 = class020232.M;
            } else {
                n3 = this.L.N(class005002, class072952, class072092, n2);
                class020232.R = n2;
                class020232.M = n3;
            }
            f3 = class02566.m((int)n3);
            f2 = class02566.P((int)n3);
            f = class02566.s((int)n3);
        } else {
            f3 = 1.0f;
            f2 = 1.0f;
            f = 1.0f;
        }
        class013912.N(class014232, class020222, class020232.u, f3, f2, f, 1.0f, class020232.i, n);
    }

    private void N(class07295 class072952, class00500 class005002, class07209 class072092, class01421 class014212, class01391 class013912, List<class02022> list, class02032 class020322, int n) {
        for (class02022 class020222 : list) {
            class02020.N(class072952, class005002, class072092, class020222, class020322);
            class020322.N(class072952, class005002, class072092, class020222.U(), class020222.W());
            this.N(class072952, class005002, class072092, class013912, class014212.L(), class020222, (class02023)class020322, n);
        }
    }

    private static boolean N(class07295 class072952, class00500 class005002, boolean bl, class07211 class072112, class07209 class072092) {
        if (!bl) {
            return true;
        }
        class00500 class005003 = class072952.method_8320(class072092);
        return class00891.N((class00500)class005002, (class00500)class005003, (class07211)class072112);
    }

    public void N(class07295 class072952, List<class08877> list, class00500 class005002, class07209 class072092, class01421 class014212, class01391 class013912, boolean bl, int n) {
        if (list.isEmpty()) {
            return;
        }
        boolean bl2 = class06202.yb() && class005002.m() == 0 && ((class08877)list.getFirst()).y();
        class014212.N(class005002.N(class072092));
        try {
            if (bl2) {
                this.y(class072952, list, class005002, class072092, class014212, class013912, bl, n);
            } else {
                this.L(class072952, list, class005002, class072092, class014212, class013912, bl, n);
            }
        }
        catch (Throwable throwable) {
            class07080 class070802 = class07080.N((Throwable)throwable, (String)"Tesselating block model");
            class07074 class070742 = class070802.N("Block model being tesselated");
            class07074.N((class07074)class070742, (class05474)class072952, (class07209)class072092, (class00500)class005002);
            class070742.N("Using AO", (Object)bl2);
            throw new class07878(class070802);
        }
    }

    public static void N() {
        N.get().N();
    }

    private static void N(class01423 class014232, class01391 class013912, float f, float f2, float f3, List<class02022> list, int n, int n2) {
        for (class02022 class020222 : list) {
            float f4;
            float f5;
            float f6;
            if (class020222.N()) {
                f6 = class04995.N((float)f, (float)0.0f, (float)1.0f);
                f5 = class04995.N((float)f2, (float)0.0f, (float)1.0f);
                f4 = class04995.N((float)f3, (float)0.0f, (float)1.0f);
            } else {
                f6 = 1.0f;
                f5 = 1.0f;
                f4 = 1.0f;
            }
            class013912.N(class014232, class020222, f6, f5, f4, 1.0f, n, n2);
        }
    }

    private void N(class07295 class072952, class00500 class005002, class07209 class072092, int n, int n2, boolean bl, class01421 class014212, class01391 class013912, List<class02022> list, class02023 class020232) {
        for (class02022 class020222 : list) {
            float f;
            if (bl) {
                class02020.N(class072952, class005002, class072092, class020222, class020232);
                class07209 class072093 = class020232.y ? class020232.N.N((class00753)class072092, class020222.U()) : class072092;
                n = class020232.B.N(class005002, class072952, class072093);
            }
            class020232.u[0] = f = class072952.method_24852(class020222.U(), class020222.W());
            class020232.u[1] = f;
            class020232.u[2] = f;
            class020232.u[3] = f;
            class020232.i[0] = n;
            class020232.i[1] = n;
            class020232.i[2] = n;
            class020232.i[3] = n;
            this.N(class072952, class005002, class072092, class013912, class014212.L(), class020222, class020232, n2);
        }
    }

    public static void N(class07295 class072952, class00500 class005002, class07209 class072092, class02022 class020222, class02023 class020232) {
        float f = 32.0f;
        float f2 = 32.0f;
        float f3 = 32.0f;
        float f4 = -32.0f;
        float f5 = -32.0f;
        float f6 = -32.0f;
        for (int i = 0; i < 4; ++i) {
            Vector3fc vector3fc = class020222.N(i);
            float f7 = vector3fc.x();
            float f8 = vector3fc.y();
            float f9 = vector3fc.z();
            f = Math.min(f, f7);
            f2 = Math.min(f2, f8);
            f3 = Math.min(f3, f9);
            f4 = Math.max(f4, f7);
            f5 = Math.max(f5, f8);
            f6 = Math.max(f6, f9);
        }
        if (class020232 instanceof class02032) {
            class02032 class020322 = (class02032)class020232;
            class020322.Z[class02010.field_4215.field_58168] = f;
            class020322.Z[class02010.field_4219.field_58168] = f4;
            class020322.Z[class02010.field_4210.field_58168] = f2;
            class020322.Z[class02010.field_4212.field_58168] = f5;
            class020322.Z[class02010.field_4211.field_58168] = f3;
            class020322.Z[class02010.field_4213.field_58168] = f6;
            class020322.Z[class02010.field_4216.field_58168] = 1.0f - f;
            class020322.Z[class02010.field_4214.field_58168] = 1.0f - f4;
            class020322.Z[class02010.field_4220.field_58168] = 1.0f - f2;
            class020322.Z[class02010.field_4217.field_58168] = 1.0f - f5;
            class020322.Z[class02010.field_4218.field_58168] = 1.0f - f3;
            class020322.Z[class02010.field_4221.field_58168] = 1.0f - f6;
        }
        float f10 = 1.0E-4f;
        float f11 = 0.9999f;
        class020232.L = switch (class020222.U()) {
            default -> throw new MatchException(null, null);
            case class07211.field_11033, class07211.field_11036 -> {
                if (f >= 1.0E-4f || f3 >= 1.0E-4f || f4 <= 0.9999f || f6 <= 0.9999f) {
                    yield true;
                }
                yield false;
            }
            case class07211.field_11043, class07211.field_11035 -> {
                if (f >= 1.0E-4f || f2 >= 1.0E-4f || f4 <= 0.9999f || f5 <= 0.9999f) {
                    yield true;
                }
                yield false;
            }
            case class07211.field_11039, class07211.field_11034 -> f2 >= 1.0E-4f || f3 >= 1.0E-4f || f5 <= 0.9999f || f6 <= 0.9999f;
        };
        class020232.y = switch (class020222.U()) {
            default -> throw new MatchException(null, null);
            case class07211.field_11033 -> {
                if (f2 == f5 && (f2 < 1.0E-4f || class005002.W((class07290)class072952, class072092))) {
                    yield true;
                }
                yield false;
            }
            case class07211.field_11036 -> {
                if (f2 == f5 && (f5 > 0.9999f || class005002.W((class07290)class072952, class072092))) {
                    yield true;
                }
                yield false;
            }
            case class07211.field_11043 -> {
                if (f3 == f6 && (f3 < 1.0E-4f || class005002.W((class07290)class072952, class072092))) {
                    yield true;
                }
                yield false;
            }
            case class07211.field_11035 -> {
                if (f3 == f6 && (f6 > 0.9999f || class005002.W((class07290)class072952, class072092))) {
                    yield true;
                }
                yield false;
            }
            case class07211.field_11039 -> {
                if (f == f4 && (f < 1.0E-4f || class005002.W((class07290)class072952, class072092))) {
                    yield true;
                }
                yield false;
            }
            case class07211.field_11034 -> f == f4 && (f4 > 0.9999f || class005002.W((class07290)class072952, class072092));
        };
    }

    public /* synthetic */ class01587 sodium$getBlockColors() {
        return this.L;
    }
}

