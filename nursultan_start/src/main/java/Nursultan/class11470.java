/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09064
 *  Nursultan.class09321
 *  Nursultan.class09322
 *  Nursultan.class11174
 *  Nursultan.class11176
 *  Nursultan.class11185
 *  Nursultan.class11192
 *  Nursultan.class11204
 *  Nursultan.class11213
 *  Nursultan.class11925
 *  Nursultan.class12026
 *  Nursultan.class12036
 *  Nursultan.class12038
 *  minecraft.class06202
 *  minecraft.class08066
 *  org.joml.Matrix4f
 */
package Nursultan;

import Nursultan.class09064;
import Nursultan.class09321;
import Nursultan.class09322;
import Nursultan.class11174;
import Nursultan.class11176;
import Nursultan.class11185;
import Nursultan.class11192;
import Nursultan.class11204;
import Nursultan.class11213;
import Nursultan.class11476;
import Nursultan.class11925;
import Nursultan.class12026;
import Nursultan.class12036;
import Nursultan.class12038;
import minecraft.class06202;
import minecraft.class08066;
import org.joml.Matrix4f;

public class class11470
implements class11192<class09321> {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public Object N_6;

    class11470(class11476 class114762, class11213 class112132) {
        this.N();
        this.N_6 = class114762;
        this.N_2 = new Matrix4f();
        this.N_3 = ((class09322)class11185.Z_1).z("u_projection");
        this.N_4 = ((class09322)class11185.Z_1).z("u_view");
        this.N_5 = ((class09322)class11185.Z_1).M("texture_in");
        this.N_0 = class112132;
        this.N_1 = class11174.N().N(class11204.L().N((class12036)class11476.y_5).N((class09322)class11185.Z_1).N(4).N()).N(class112132).N();
    }

    private void N() {
    }

    public void execute(class09321 class093212) {
        class08066 class080662 = ((class06202)((class11476)this.N_6).L_0).e();
        ((Matrix4f)this.N_2).setOrtho(0.0f, (float)class080662.N, (float)class080662.y, 0.0f, -1.0f, 1000.0f);
        class11176.N((class11213)((class11213)this.N_0), (float)0.0f, (float)0.0f, (float)0.0f, (float)class080662.N, (float)class080662.y, (int)-1);
        ((class11174)this.N_1).N(class093222 -> {
            ((class12038)this.N_3).N((Matrix4f)this.N_2);
            ((class12038)this.N_4).N((Matrix4f)class11925.y_3);
            ((class12026)this.N_5).N(((class09064)((class11476)this.N_6).L_3).U());
        });
    }
}

