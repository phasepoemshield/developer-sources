/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  minecraft.class01390
 *  minecraft.class01391
 *  minecraft.class01407
 *  minecraft.class01421
 *  minecraft.class01423
 *  minecraft.class01833
 *  minecraft.class01894
 *  minecraft.class02022
 *  minecraft.class02054
 *  minecraft.class02566
 *  minecraft.class03662
 *  minecraft.class05911
 *  minecraft.class05921
 *  minecraft.class06069
 *  minecraft.class06202
 *  minecraft.class06851
 *  minecraft.class07311
 *  minecraft.class08915
 *  net.caffeinemc.mods.sodium.api.texture.SpriteUtil
 *  net.caffeinemc.mods.sodium.api.util.ColorARGB
 *  net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter
 *  net.caffeinemc.mods.sodium.client.model.quad.BakedQuadView
 *  net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView
 *  net.caffeinemc.mods.sodium.client.render.immediate.model.BakedModelEncoder
 *  net.caffeinemc.mods.sodium.client.render.vertex.VertexConsumerUtils
 *  net.caffeinemc.mods.sodium.mixin.frapi.ItemRendererAccessor
 *  org.joml.Matrix4f
 */
package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.List;
import minecraft.class01390;
import minecraft.class01391;
import minecraft.class01407;
import minecraft.class01421;
import minecraft.class01423;
import minecraft.class01833;
import minecraft.class01894;
import minecraft.class02022;
import minecraft.class02054;
import minecraft.class02566;
import minecraft.class03662;
import minecraft.class05911;
import minecraft.class05921;
import minecraft.class06069;
import minecraft.class06202;
import minecraft.class06851;
import minecraft.class07311;
import minecraft.class08915;
import net.caffeinemc.mods.sodium.api.texture.SpriteUtil;
import net.caffeinemc.mods.sodium.api.util.ColorARGB;
import net.caffeinemc.mods.sodium.api.vertex.buffer.VertexBufferWriter;
import net.caffeinemc.mods.sodium.client.model.quad.BakedQuadView;
import net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView;
import net.caffeinemc.mods.sodium.client.render.immediate.model.BakedModelEncoder;
import net.caffeinemc.mods.sodium.client.render.vertex.VertexConsumerUtils;
import net.caffeinemc.mods.sodium.mixin.frapi.ItemRendererAccessor;
import org.joml.Matrix4f;

public class class02862
implements ItemRendererAccessor {
    public static final class01894 N = class01894.y((String)"textures/misc/enchanted_glint_armor.png");
    public static final class01894 y = class01894.y((String)"textures/misc/enchanted_glint_item.png");
    public static final float L = 0.5f;
    public static final float u = 0.75f;
    public static final float i = 0.0078125f;
    public static final int R = -1;
    private static final ThreadLocal M;

    private static class01391 y(class01407 class014072, class07311 class073112, class01423 class014232) {
        return class05921.N((class01391)new class01390(class014072.method_73477(class02862.N(class073112) ? class06851.M() : class06851.B()), class014232, 0.0078125f), (class01391)class014072.method_73477(class073112));
    }

    private static void N(class01423 class014232, VertexBufferWriter vertexBufferWriter, List list, int[] nArray, int n, int n2) {
        for (int i = 0; i < list.size(); ++i) {
            class02022 class020222 = (class02022)list.get(i);
            BakedQuadView bakedQuadView = (BakedQuadView)class020222;
            int n3 = -1;
            if (class020222.N()) {
                n3 = ColorARGB.toABGR((int)class02862.N(nArray, class020222.z()));
            }
            BakedModelEncoder.writeQuadVertices((VertexBufferWriter)vertexBufferWriter, (class01423)class014232, (ModelQuadView)bakedQuadView, (int)n3, (int)n, (int)n2, (boolean)BakedModelEncoder.shouldMultiplyAlpha());
            if (bakedQuadView.getSprite() == null) continue;
            SpriteUtil.INSTANCE.markSpriteActive(bakedQuadView.getSprite());
        }
    }

    private static void N(class01421 class014212, class01391 class013912, List list, int[] nArray, int n, int n2, Operation operation) {
        VertexBufferWriter vertexBufferWriter = VertexConsumerUtils.convertOrLog((class01391)class013912);
        if (vertexBufferWriter == null) {
            operation.call(new Object[]{class014212, class013912, list, nArray, n, n2});
            return;
        }
        if (!list.isEmpty()) {
            class02862.N(class014212.L(), vertexBufferWriter, list, nArray, n, n2);
        }
    }

    private static /* synthetic */ class06069 N() {
        return new class01833(42L);
    }

    public static /* synthetic */ class01391 N(class01407 class014072, class07311 class073112, class01423 class014232) {
        return class02862.y(class014072, class073112, class014232);
    }

    public static void N(class03662 class036622, class01421 class014212, class01407 class014072, int n, int n2, int[] nArray, List<class02022> list, class07311 class073112, class08915 class089152) {
        class01391 class013912;
        if (class089152 == class08915.field_55343) {
            class01423 class014232 = class014212.L().u();
            if (class036622 == class03662.field_4317) {
                class02054.N((Matrix4f)class014232.N(), (float)0.5f);
            } else if (class036622.y()) {
                class02054.N((Matrix4f)class014232.N(), (float)0.75f);
            }
            class013912 = class02862.y(class014072, class073112, class014232);
        } else {
            class013912 = class02862.N(class014072, class073112, true, class089152 != class08915.field_55341);
        }
        class02862.N(class014212, class013912, list, nArray, n, n2, objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)6, (String)"[net.minecraft.class_4587, net.minecraft.class_4588, java.util.List, int[], int, int]");
            Object[] objectArray2 = objectArray;
            class02862.N((class01421)objectArray[0], (class01391)objectArray2[1], (List<class02022>)((List)objectArray2[2]), (int[])objectArray2[3], (int)((Integer)objectArray2[4]), (int)((Integer)objectArray2[5]));
            return null;
        });
    }

    public static class01391 N(class01407 class014072, class07311 class073112, boolean bl, boolean bl2) {
        if (bl2) {
            if (class02862.N(class073112)) {
                return class05921.N((class01391)class014072.method_73477(class06851.M()), (class01391)class014072.method_73477(class073112));
            }
            return class05921.N((class01391)class014072.method_73477(bl ? class06851.B() : class06851.Z()), (class01391)class014072.method_73477(class073112));
        }
        return class014072.method_73477(class073112);
    }

    public static List<class07311> N(class07311 class073112, boolean bl, boolean bl2) {
        if (bl2) {
            if (class02862.N(class073112)) {
                return List.of(class073112, class06851.M());
            }
            return List.of(class073112, bl ? class06851.B() : class06851.Z());
        }
        return List.of(class073112);
    }

    private static boolean N(class07311 class073112) {
        return class06202.C() && (class073112 == class05911.z() || class073112 == class05911.U());
    }

    private static int N(int[] nArray, int n) {
        if (n < 0 || n >= nArray.length) {
            return -1;
        }
        return nArray[n];
    }

    private static void N(class01421 class014212, class01391 class013912, List<class02022> list, int[] nArray, int n, int n2) {
        class01423 class014232 = class014212.L();
        for (class02022 class020222 : list) {
            float f;
            float f2;
            float f3;
            float f4;
            if (class020222.N()) {
                int n3 = class02862.N(nArray, class020222.z());
                f4 = (float)class02566.y((int)n3) / 255.0f;
                f3 = (float)class02566.L((int)n3) / 255.0f;
                f2 = (float)class02566.u((int)n3) / 255.0f;
                f = (float)class02566.i((int)n3) / 255.0f;
            } else {
                f4 = 1.0f;
                f3 = 1.0f;
                f2 = 1.0f;
                f = 1.0f;
            }
            class013912.N(class014232, class020222, f3, f2, f, f4, n, n2);
        }
    }
}

