/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.Particles
 *  Nursultan.class10990
 *  Nursultan.class10996
 *  Nursultan.class11300
 *  Nursultan.class11783
 *  Nursultan.class11798
 *  Nursultan.class11812
 *  Nursultan.class11821
 *  Nursultan.class11908
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00381
 *  minecraft.class00509
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class06069
 *  minecraft.class06202
 *  minecraft.class07049
 *  minecraft.class07299
 */
package Nursultan;

import Nursultan.Particles;
import Nursultan.class10990;
import Nursultan.class10996;
import Nursultan.class11179;
import Nursultan.class11230;
import Nursultan.class11300;
import Nursultan.class11783;
import Nursultan.class11798;
import Nursultan.class11812;
import Nursultan.class11821;
import Nursultan.class11908;
import java.lang.runtime.SwitchBootstraps;
import java.util.Objects;
import minecraft.class00381;
import minecraft.class00509;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06202;
import minecraft.class07049;
import minecraft.class07299;

public class class11246
extends class11230 {
    public class11246(Particles particles, String string, boolean bl) {
        super(particles, string, bl);
    }

    public void y(Object object) {
        Object object2 = object;
        Objects.requireNonNull(object2);
        Object object3 = object2;
        int n = 0;
        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class10990.class, class10996.class}, (Object)object3, (int)n)) {
            case 0: {
                class07049 class070492;
                class00509 class005092;
                class00381 var6 = ((class10990)object3).u();
                if (!(var6 instanceof class00509) || (class005092 = (class00509)var6).N() != 35 || (class070492 = class005092.N((class07299)((class03448)((class06202)((class11798)this).N_0).T_3))) == (class04453)((class06202)((class11798)this).N_0).T_4 || class070492 == null) break;
                ((class11812)((class11783)class070492).dataManager()).R().N((Object)40);
                break;
            }
            case 1: {
                class10996 class109962 = (class10996)object3;
                class06069 class060692 = ((class04453)((class06202)((class11798)this).N_0).T_4).method_59922();
                for (class07049 class070493 : ((class03448)((class06202)((class11798)this).N_0).T_3).M()) {
                    class11821 var9 = ((class11812)((class11783)class070493).dataManager()).R();
                    if ((Integer)var9.N() <= 0) continue;
                    for (int i = 0; i < 16; ++i) {
                        double d = class060692.z() * 2.0f - 1.0f;
                        double d2 = class060692.z() * 2.0f - 1.0f;
                        double d3 = class060692.z() * 2.0f - 1.0f;
                        if (class04995.E((double)d) + class04995.E((double)d2) + class04995.E((double)d3) > 1.0) continue;
                        class11179 class111792 = new class11179(class11908.N((int)60, (int)72), this.N(class060692));
                        class111792.y(class11908.y((float)0.8f, (float)1.5f));
                        class111792.N(d, d2 + 0.2, d3);
                        class111792.y(class070493.method_23316(d / 4.0), class070493.method_23323(0.5 + d2 / 4.0), class070493.method_23324(d3 / 4.0));
                        class111792.y(0.6);
                        class111792.N(1.0);
                        this.N(class111792);
                    }
                    var9.N((Object)((Integer)var9.N() - 1));
                }
                break;
            }
        }
    }

    private int N(class06069 class060692) {
        if (class060692.y(4) == 0) {
            return class11300.N((float)(0.6f + class060692.z() * 0.2f), (float)(0.6f + class060692.z() * 0.3f), (float)(class060692.z() * 0.2f));
        }
        return class11300.N((float)(0.1f + class060692.z() * 0.2f), (float)(0.4f + class060692.z() * 0.3f), (float)(class060692.z() * 0.2f));
    }
}

