/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.TargetEsp
 *  Nursultan.class09063
 *  Nursultan.class09087
 *  Nursultan.class09321
 *  Nursultan.class09322
 *  Nursultan.class11174
 *  Nursultan.class11185
 *  Nursultan.class11204
 *  Nursultan.class11213
 *  Nursultan.class11300
 *  Nursultan.class11798
 *  Nursultan.class11807
 *  Nursultan.class11887
 *  Nursultan.class11903
 *  Nursultan.class11905
 *  Nursultan.class11925
 *  Nursultan.class11934
 *  Nursultan.class11998
 *  Nursultan.class12019
 *  Nursultan.class12026
 *  Nursultan.class12031
 *  Nursultan.class12036
 *  Nursultan.class12038
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07438
 *  minecraft.class08066
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fStack
 *  org.joml.Quaternionfc
 */
package Nursultan;

import Nursultan.TargetEsp;
import Nursultan.class09063;
import Nursultan.class09087;
import Nursultan.class09321;
import Nursultan.class09322;
import Nursultan.class11174;
import Nursultan.class11185;
import Nursultan.class11204;
import Nursultan.class11213;
import Nursultan.class11300;
import Nursultan.class11515;
import Nursultan.class11798;
import Nursultan.class11807;
import Nursultan.class11887;
import Nursultan.class11903;
import Nursultan.class11905;
import Nursultan.class11925;
import Nursultan.class11934;
import Nursultan.class11998;
import Nursultan.class12019;
import Nursultan.class12026;
import Nursultan.class12031;
import Nursultan.class12036;
import Nursultan.class12038;
import java.time.Duration;
import java.util.Arrays;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07438;
import minecraft.class08066;
import org.joml.Matrix4f;
import org.joml.Matrix4fStack;
import org.joml.Quaternionfc;

public class class11441
extends class11807<TargetEsp> {
    public static Object y_0;
    public static Object y_1;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;

    private static void M() {
        y_0 = null;
        y_1 = null;
    }

    public class11441(TargetEsp targetEsp, String string, boolean bl) {
        super((Object)targetEsp, string, bl);
        this.R();
        this.L_0 = new class11934[4];
        this.L_1 = class11174.N().N(class11204.L().N((class12036)class12019.N_1).N((class09322)class11185.Z_1).N(4).N()).N(class11213.N((class09087)((class09087)class09063.N_2), (int)4096, (int)1024)).N();
        this.L_2 = ((class09322)class11185.Z_1).z("u_projection");
        this.L_3 = ((class09322)class11185.Z_1).z("u_view");
        this.L_4 = ((class09322)class11185.Z_1).M("texture_in");
        for (int i = 0; i < ((class11934[])this.L_0).length; ++i) {
            ((class11934[])this.L_0)[i] = new class11934(class11903.FORWARDS);
        }
    }

    static {
        class11441.N();
        class11441.M();
        y_0 = Duration.ofMillis(300L);
        y_1 = Duration.ofMillis(100L);
    }

    public void y(Object object) {
        this.R();
        if (object instanceof class09321) {
            class11934 class1193432;
            class09321 class093212 = (class09321)object;
            boolean bl = ((TargetEsp)((class11798)this).N_1).m();
            Duration duration = bl ? (Duration)y_0 : (Duration)y_1;
            for (int i = 1; i < ((class11934[])this.L_0).length; ++i) {
                int n;
                class11934 class119344 = ((class11934[])this.L_0)[i - 1];
                int n2 = n = bl ? 1 : 0;
                if (!(bl ? class119344.E() > (double)0.4f : class119344.E() <= (double)0.6f)) {
                    class119344.N((double)n, duration, bl ? (class11887)class11905.y_0 : (class11887)class11905.N_5);
                    break;
                }
                ((class11934[])this.L_0)[i].N((double)n, duration, bl ? (class11887)class11905.y_0 : (class11887)class11905.N_5);
            }
            for (class11934 class1193432 : (Matrix4fStack)this.L_0) {
                class1193432.N();
            }
            if (Arrays.stream((class11934[])this.L_0).allMatch(class119342 -> class119342.N(class11903.BACKWARDS))) {
                return;
            }
            Matrix4fStack matrix4fStack = class093212.R();
            class07438 class074382 = ((TargetEsp)((class11798)this).N_1).T();
            class06889 class068892 = class093212.y().y();
            class1193432 = ((class11174)this.L_1).R();
            float f = (float)(class11925.i((class07049)class074382) - class068892.M);
            float f2 = (float)(class11925.u((class07049)class074382) - class068892.B) + class074382.method_17682() / 2.0f;
            float f3 = (float)(class11925.L((class07049)class074382) - class068892.Z);
            float f4 = (float)((1.0 - Math.sin(Math.max(((float)class074382.fields_2212a028292fd3c078969e3ee4c71d9e8_0.intValue() - ((class06202)((class11798)this).N_0).NK().N(false)) / 10.0f * (float)Math.PI, 0.0f))) * (double)0.3f + (double)0.7f);
            int n = (Integer)((class11515)((TargetEsp)((class11798)this).N_1).L_5).i();
            int n3 = 4;
            float f5 = 0.2f;
            float f6 = f5 * 2.0f * f4;
            float f7 = (float)(Math.sin((double)((float)((class04453)((class06202)((class11798)this).N_0).T_4).field_6012 + ((class06202)((class11798)this).N_0).NK().N(false)) % 40.0 / 40.0 * 6.2831854820251465) * 2.0);
            for (int i = 0; i < n3; ++i) {
                matrix4fStack.pushMatrix();
                matrix4fStack.translate(f, f2, f3);
                float f8 = ((class11934[])this.L_0)[i].E().floatValue() * 0.5f;
                matrix4fStack.scale(1.0f + (0.5f - f8));
                matrix4fStack.rotate((Quaternionfc)class093212.y().M());
                float f9 = (float)i * ((float)Math.PI * 2 / (float)n3);
                matrix4fStack.rotate(f9 + f7, 0.0f, 0.0f, 1.0f);
                matrix4fStack.translate(0.0f, f6, 0.0f);
                matrix4fStack.rotate((float)Math.PI, 0.0f, 0.0f, 1.0f);
                int n4 = class1193432.i();
                int n5 = class11300.N((int)n, (int)((int)((float)class11300.y((int)n) * f8 * 2.0f)));
                class1193432.N((Matrix4f)matrix4fStack, -f5, f5, 0.0f).N(0.0f, 0.0f).y(n5).y();
                class1193432.N((Matrix4f)matrix4fStack, f5, f5, 0.0f).N(1.0f, 0.0f).y(n5).y();
                class1193432.N((Matrix4f)matrix4fStack, f5, -f5, 0.0f).N(1.0f, 1.0f).y(n5).y();
                class1193432.N((Matrix4f)matrix4fStack, -f5, -f5, 0.0f).N(0.0f, 1.0f).y(n5).y();
                ((class11174)this.L_1).L().y(n4);
                matrix4fStack.popMatrix();
            }
            class11925.N((class08066)((class06202)((class11798)this).N_0).e(), (boolean)true);
            ((class11174)this.L_1).N((T class093222) -> {
                this.R();
                ((class12038)this.L_2).N(class093212.i());
                ((class12038)this.L_3).N(class093212.N());
                ((class12026)this.L_4).N(((class12031)class11998.N_1).N());
            });
        }
    }

    private static void N() {
    }

    private void R() {
    }
}

