/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.TargetEsp
 *  Nursultan.class09321
 *  Nursultan.class11174
 *  Nursultan.class11178
 *  Nursultan.class11184
 *  Nursultan.class11190
 *  Nursultan.class11300
 *  Nursultan.class11798
 *  Nursultan.class11807
 *  Nursultan.class11887
 *  Nursultan.class11903
 *  Nursultan.class11905
 *  Nursultan.class11925
 *  Nursultan.class11934
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07438
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fStack
 */
package Nursultan;

import Nursultan.TargetEsp;
import Nursultan.class09321;
import Nursultan.class11174;
import Nursultan.class11178;
import Nursultan.class11184;
import Nursultan.class11190;
import Nursultan.class11300;
import Nursultan.class11515;
import Nursultan.class11798;
import Nursultan.class11807;
import Nursultan.class11887;
import Nursultan.class11903;
import Nursultan.class11905;
import Nursultan.class11925;
import Nursultan.class11934;
import java.time.Duration;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07438;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;

public class class11434
extends class11807<TargetEsp> {
    public Object y_0;
    public static Object L_0;

    private static void M() {
        L_0 = null;
    }

    public class11434(TargetEsp targetEsp, String string, boolean bl) {
        super((Object)targetEsp, string, bl);
        this.B();
        this.y_0 = new class11934(class11903.FORWARDS);
    }

    static {
        class11434.M();
        L_0 = Duration.ofMillis(300L);
    }

    private void B() {
    }

    public void y(Object object) {
        this.B();
        if (object instanceof class09321) {
            class09321 class093212 = (class09321)object;
            ((class11934)this.y_0).N(((TargetEsp)((class11798)this).N_1).m() ? 1.0 : 0.0, (Duration)L_0, (class11887)class11905.u_4);
            ((class11934)this.y_0).N();
            if (((class11934)this.y_0).N(class11903.BACKWARDS)) {
                return;
            }
            class11174 class111742 = (class11174)class11190.N_3;
            class11174 class111743 = (class11174)class11190.N_1;
            Matrix4fStack matrix4fStack = class093212.R();
            class07438 class074382 = ((TargetEsp)((class11798)this).N_1).T();
            class06889 class068892 = class093212.y().y();
            float f = (float)(class11925.i((class07049)class074382) - class068892.M);
            float f2 = (float)(class11925.u((class07049)class074382) - class068892.B);
            float f3 = (float)(class11925.L((class07049)class074382) - class068892.Z);
            class11184 class111842 = class111742.R();
            class11184 class111843 = class111743.R();
            class11178 class111782 = class111743.L();
            int n = 35;
            float f4 = ((TargetEsp)((class11798)this).N_1).T().method_17682() / 2.0f;
            double d = (double)((float)((class04453)((class06202)((class11798)this).N_0).T_4).field_6012 + ((class06202)((class11798)this).N_0).NK().N(false)) / 4.0;
            float f5 = (float)Math.sin(d) * f4 + f4;
            float f6 = (float)Math.cos(d);
            int n2 = (Integer)((class11515)((TargetEsp)((class11798)this).N_1).L_5).i();
            int n3 = class11300.N((int)n2, (int)((int)(255.0 * ((class11934)this.y_0).E())));
            int n4 = class11300.N((int)n2, (int)((int)(120.0 * ((class11934)this.y_0).E())));
            int n5 = class11300.N((int)n2, (int)0);
            float f7 = class074382.method_17681();
            for (int i = 0; i < n; ++i) {
                int n6 = class111843.i();
                float f8 = (float)Math.toRadians(360.0f / (float)n * (float)i);
                float f9 = (float)Math.sin(f8) * f7;
                float f10 = (float)Math.cos(f8) * f7;
                float f11 = (float)Math.toRadians(360.0f / (float)n * (float)(i + 1));
                float f12 = (float)Math.sin(f11) * f7;
                float f13 = (float)Math.cos(f11) * f7;
                class111842.N((Matrix4f)matrix4fStack, f + f9, f2 + f5, f3 + f10).N((Matrix4f)matrix4fStack, f + f12, f2 + f5, f3 + f13).y(n3).y(n3).N(0.0f).y();
                class111843.N((Matrix4f)matrix4fStack, f + f12, f2 + f5 - f6 / 2.0f, f3 + f13).y(n5).y();
                class111843.N((Matrix4f)matrix4fStack, f + f9, f2 + f5 - f6 / 2.0f, f3 + f10).y(n5).y();
                class111843.N((Matrix4f)matrix4fStack, f + f9, f2 + f5, f3 + f10).y(n4).y();
                class111843.N((Matrix4f)matrix4fStack, f + f12, f2 + f5, f3 + f13).y(n4).y();
                class111782.y(n6);
            }
        }
    }
}

