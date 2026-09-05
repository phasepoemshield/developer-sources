/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class01999
 *  minecraft.class02058
 *  minecraft.class02294
 *  minecraft.class02730
 *  minecraft.class04386
 *  minecraft.class05885
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06851
 *  minecraft.class07209
 *  minecraft.class07295
 *  minecraft.class07311
 *  minecraft.class08476
 *  minecraft.class08626
 *  minecraft.class08806
 *  minecraft.class08887
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.renderer.v1.render.RenderLayerHelper
 *  org.joml.Quaternionfc
 */
package minecraft;

import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class01999;
import minecraft.class02058;
import minecraft.class02294;
import minecraft.class02730;
import minecraft.class04386;
import minecraft.class05885;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06851;
import minecraft.class07209;
import minecraft.class07295;
import minecraft.class07311;
import minecraft.class08476;
import minecraft.class08626;
import minecraft.class08806;
import minecraft.class08887;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.render.RenderLayerHelper;
import org.joml.Quaternionfc;

@Environment(value=EnvType.CLIENT)
public class class02428
extends class06249<class08806, class04386> {
    private final class01999 N;

    public class02428(class06252<class08806, class04386> class062522, class01999 class019992) {
        super(class062522);
        this.N = class019992;
    }

    private void N(class01237 class012372, class01421 class014212, class07311 class073112, class08887 class088872, float f, float f2, float f3, int n, int n2, int n3, class08806 class088062, class00500 class005002) {
        if (class088062.y() && class088062.v) {
            class012372.submitBlockStateModel(class014212, class087432 -> class073112, class088872, 1.0f, 1.0f, 1.0f, n, n2, n3, (class07295)class02730.field_52611, class07209.field_10980, class005002);
        } else {
            class012372.submitBlockStateModel(class014212, RenderLayerHelper::getEntityBlockLayer, class088872, 1.0f, 1.0f, 1.0f, n, n2, n3, (class07295)class02730.field_52611, class07209.field_10980, class005002);
        }
    }

    private void N(class01237 class012372, class01421 class014212, class07311 class073112, class08887 class088872, float f, float f2, float f3, int n, int n2, int n3, LocalRef localRef, LocalRef localRef2) {
        this.N(class012372, class014212, class073112, class088872, f, f2, f3, n, n2, n3, (class08806)localRef.get(), (class00500)localRef2.get());
    }

    public void N(class01421 class014212, class01237 class012372, int n, class08806 class088062, float f, float f2) {
        if (!class088062.N) {
            return;
        }
        if (class088062.v && !class088062.y()) {
            return;
        }
        class014212.N();
        ((class04386)this.u()).y().N(class014212);
        float f3 = 0.625f;
        class014212.N(0.0f, -0.34375f, 0.0f);
        class014212.N((Quaternionfc)class02058.u.N(180.0f));
        class014212.y(0.625f, -0.625f, -0.625f);
        class00500 class005002 = class00869.iK.W();
        class08887 class088872 = this.N.N(class005002);
        int n2 = class02294.N((class08476)class088062, (float)0.0f);
        class014212.N(-0.5f, -0.5f, -0.5f);
        class07311 class073112 = class088062.y() && class088062.v ? class06851.j((class01894)class08626.N) : class05885.L((class00500)class005002);
        int n3 = class088062.l;
        int n4 = n2;
        int n5 = n;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        class08887 class088873 = class088872;
        class07311 class073113 = class073112;
        class01421 class014213 = class014212;
        class01237 class012373 = class012372;
        LocalRefImpl localRefImpl = new LocalRefImpl();
        LocalRefImpl localRefImpl2 = new LocalRefImpl();
        localRefImpl.init((Object)class088062);
        localRefImpl2.init((Object)class005002);
        this.N(class012373, class014213, class073113, class088873, f6, f5, f4, n5, n4, n3, (LocalRef)localRefImpl, (LocalRef)localRefImpl2);
        class005002 = (class00500)localRefImpl2.dispose();
        class088062 = (class08806)localRefImpl.dispose();
        class014212.y();
    }
}

