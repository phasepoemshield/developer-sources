/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10981
 *  Nursultan.class11938
 *  me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod
 *  minecraft.class00608
 *  minecraft.class00772
 *  minecraft.class00780
 *  minecraft.class01056
 *  minecraft.class02233
 *  minecraft.class02566
 *  minecraft.class03386
 *  minecraft.class03448
 *  minecraft.class03970
 *  minecraft.class04798
 *  minecraft.class04995
 *  minecraft.class05363
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07604
 *  minecraft.class09005
 *  org.jspecify.annotations.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class10981;
import Nursultan.class11938;
import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import minecraft.class00608;
import minecraft.class00772;
import minecraft.class00780;
import minecraft.class01056;
import minecraft.class02233;
import minecraft.class02566;
import minecraft.class03386;
import minecraft.class03448;
import minecraft.class03970;
import minecraft.class04798;
import minecraft.class04995;
import minecraft.class05363;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07604;
import minecraft.class09005;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class09042
extends class09005 {
    private static final int N = 8;
    private static final float y = -160.0f;
    private static final float L = -256.0f;
    private float u;

    private void N(class05363 class053632, class03448 class034482, class02233 class022332) {
        class07209 class072092 = class053632.u();
        class00780 class007802 = (class00780)class034482.i(class072092).N();
        float f = class022332.N();
        float f2 = class022332.N(false);
        boolean bl = class007802.y();
        float f3 = class04995.N((float)(((float)class034482.method_22336().N(class00772.field_9284).L(class072092) - 8.0f) / 7.0f), (float)0.0f, (float)1.0f);
        float f4 = class034482.method_8430(f2) * f3 * (bl ? 1.0f : 0.5f);
        this.u += (f4 - this.u) * f * 0.2f;
    }

    public boolean N(@Nullable class04798 class047982, class07049 class070492) {
        return class047982 == class04798.field_60563;
    }

    private void N(class03970 class039702, class05363 class053632, class03448 class034482, float f, class02233 class022332, CallbackInfo callbackInfo) {
        class10981 class109812 = class10981.L();
        class11938.L().L((Object)class109812);
        if (class109812.y()) {
            class039702.N = 999999.0f;
            class039702.L = 1000000.0f;
        }
    }

    public int N(int n) {
        if (!SodiumExtraClientMod.options().detailSettings.skyColors) {
            return 7907327;
        }
        return n;
    }

    public void N(class03970 class039702, class05363 class053632, class03448 class034482, float f, class02233 class022332) {
        this.N(class053632, class034482, class022332);
        float f2 = class022332.N(false);
        class039702.N = ((Float)class053632.U().N(class00608.y, f2)).floatValue();
        class039702.L = ((Float)class053632.U().N(class00608.L, f2)).floatValue();
        class039702.N += -160.0f * this.u;
        float f3 = Math.min(96.0f, class039702.L);
        class039702.L = Math.max(f3, class039702.L + -256.0f * this.u);
        class039702.i = Math.min(f, ((Float)class053632.U().N(class00608.u, f2)).floatValue());
        class039702.R = Math.min((float)((Integer)((class05630)class06202.Nq().i_7).E().method_41753() * 16), ((Float)class053632.U().N(class00608.i, f2)).floatValue());
        if (((class01056)class06202.Nq().i_6).U().u()) {
            class039702.N = Math.min(class039702.N, 10.0f);
            class039702.i = class039702.L = Math.min(class039702.L, 96.0f);
            class039702.R = class039702.L;
        }
        this.N(class039702, class053632, class034482, f, class022332, null);
    }

    private static int N(int n, float f, float f2) {
        if (f > 0.0f) {
            float f3 = 1.0f - f * 0.5f;
            float f4 = 1.0f - f * 0.4f;
            n = class02566.N((int)n, (float)f3, (float)f3, (float)f4);
        }
        if (f2 > 0.0f) {
            n = class02566.y((int)n, (float)(1.0f - f2 * 0.5f));
        }
        return n;
    }

    public int N(class03448 class034482, class05363 class053632, int n, float f) {
        float f2;
        int n2 = (Integer)class053632.U().N(class00608.N, f);
        if (n >= 4) {
            int n3;
            float f3;
            float f4 = ((Float)class053632.U().N(class00608.W, f)).floatValue() * ((float)Math.PI / 180);
            f2 = class04995.m((double)f4) > 0.0f ? -1.0f : 1.0f;
            class07604 class076042 = ((class03386)class06202.Nq().i_5).i();
            float f5 = (class076042 != null ? class076042.N() : class053632.m()).dot(f2, 0.0f, 0.0f);
            if (f5 > 0.0f && (f3 = class02566.W((int)(n3 = ((Integer)class053632.U().N(class00608.z, f)).intValue()))) > 0.0f) {
                n2 = class02566.N((float)(f5 * f3), (int)n2, (int)class02566.M((int)n3));
            }
        }
        int n4 = (Integer)class053632.U().N(class00608.Z, f);
        float f6 = class034482.method_8478(f);
        float f7 = class034482.method_8430(f);
        int n5 = n4;
        n4 = class09042.N(this.N(n5), f7, f6);
        f2 = Math.min(((Float)class053632.U().N(class00608.u, f)).floatValue() / 16.0f, (float)n);
        float f8 = class04995.y((float)(f2 / 32.0f), (float)0.25f, (float)1.0f);
        f8 = 1.0f - (float)Math.pow(f8, 0.25);
        n2 = class02566.N((float)f8, (int)n2, (int)n4);
        return n2;
    }
}

