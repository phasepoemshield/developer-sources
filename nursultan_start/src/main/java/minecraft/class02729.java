/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  minecraft.class00500
 *  minecraft.class01098
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class01894
 *  minecraft.class01999
 *  minecraft.class02058
 *  minecraft.class02294
 *  minecraft.class06249
 *  minecraft.class06252
 *  minecraft.class06851
 *  minecraft.class07209
 *  minecraft.class07295
 *  minecraft.class07311
 *  minecraft.class08448
 *  minecraft.class08476
 *  minecraft.class08626
 *  minecraft.class08887
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  org.joml.Quaternionfc
 */
package minecraft;

import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import minecraft.class00500;
import minecraft.class01098;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class01894;
import minecraft.class01999;
import minecraft.class02058;
import minecraft.class02294;
import minecraft.class02730;
import minecraft.class06249;
import minecraft.class06252;
import minecraft.class06851;
import minecraft.class07209;
import minecraft.class07295;
import minecraft.class07311;
import minecraft.class08448;
import minecraft.class08476;
import minecraft.class08626;
import minecraft.class08887;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.joml.Quaternionfc;

@Environment(value=EnvType.CLIENT)
public class class02729
extends class06249<class08448, class01098> {
    private final class01999 N;

    public class02729(class06252<class08448, class01098> class062522, class01999 class019992) {
        super(class062522);
        this.N = class019992;
    }

    private void N(class01237 class012372, class01421 class014212, class07311 class073112, class08887 class088872, float f, float f2, float f3, int n, int n2, int n3, class00500 class005002) {
        class012372.submitBlockStateModel(class014212, class087432 -> class073112, class088872, 1.0f, 1.0f, 1.0f, n, n2, n3, (class07295)class02730.field_52611, class07209.field_10980, class005002);
    }

    private void N(class01237 class012372, class01421 class014212, class07311 class073112, class08887 class088872, float f, float f2, float f3, int n, int n2, int n3, LocalRef localRef) {
        this.N(class012372, class014212, class073112, class088872, f, f2, f3, n, n2, n3, (class00500)localRef.get());
    }

    private void N(class01421 class014212, class01237 class012372, int n, boolean bl, int n2, class00500 class005002, int n3, class08887 class088872) {
        if (bl) {
            int n4 = n2;
            int n5 = n3;
            int n6 = n;
            float f = 0.0f;
            float f2 = 0.0f;
            float f3 = 0.0f;
            class08887 class088873 = class088872;
            class07311 class073112 = class06851.j((class01894)class08626.N);
            class01421 class014213 = class014212;
            class01237 class012373 = class012372;
            LocalRefImpl localRefImpl = new LocalRefImpl();
            localRefImpl.init((Object)class005002);
            this.N(class012373, class014213, class073112, class088873, f3, f2, f, n6, n5, n4, (LocalRef)localRefImpl);
            class005002 = (class00500)localRefImpl.dispose();
        } else {
            class012372.N(class014212, class005002, n, n3, n2);
        }
    }

    public void N(class01421 class014212, class01237 class012372, int n, class08448 class084482, float f, float f2) {
        boolean bl;
        if (class084482.NB) {
            return;
        }
        boolean bl2 = bl = class084482.y() && class084482.v;
        if (class084482.v && !bl) {
            return;
        }
        class00500 class005002 = class084482.N.N();
        int n2 = class02294.N((class08476)class084482, (float)0.0f);
        class08887 class088872 = this.N.N(class005002);
        class014212.N();
        class014212.N(0.2f, -0.35f, 0.5f);
        class014212.N((Quaternionfc)class02058.u.N(-48.0f));
        class014212.y(-1.0f, -1.0f, 1.0f);
        class014212.N(-0.5f, -0.5f, -0.5f);
        this.N(class014212, class012372, n, bl, class084482.l, class005002, n2, class088872);
        class014212.y();
        class014212.N();
        class014212.N(0.2f, -0.35f, 0.5f);
        class014212.N((Quaternionfc)class02058.u.N(42.0f));
        class014212.N(0.1f, 0.0f, -0.6f);
        class014212.N((Quaternionfc)class02058.u.N(-48.0f));
        class014212.y(-1.0f, -1.0f, 1.0f);
        class014212.N(-0.5f, -0.5f, -0.5f);
        this.N(class014212, class012372, n, bl, class084482.l, class005002, n2, class088872);
        class014212.y();
        class014212.N();
        ((class01098)this.u()).u().N(class014212);
        class014212.N(0.0f, -0.7f, -0.2f);
        class014212.N((Quaternionfc)class02058.u.N(-78.0f));
        class014212.y(-1.0f, -1.0f, 1.0f);
        class014212.N(-0.5f, -0.5f, -0.5f);
        this.N(class014212, class012372, n, bl, class084482.l, class005002, n2, class088872);
        class014212.y();
    }
}

