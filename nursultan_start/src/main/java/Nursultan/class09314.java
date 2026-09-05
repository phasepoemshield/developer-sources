/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11174
 *  Nursultan.class11190
 *  Nursultan.class11216
 *  Nursultan.class11826
 *  Nursultan.class11925
 *  minecraft.class06202
 *  minecraft.class08066
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package Nursultan;

import Nursultan.class09321;
import Nursultan.class11174;
import Nursultan.class11190;
import Nursultan.class11216;
import Nursultan.class11826;
import Nursultan.class11925;
import minecraft.class06202;
import minecraft.class08066;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public class class09314
implements class11826<class09321> {
    public void listen(class09321 class093212) {
        ((Matrix4f)class11925.y_4).set((Matrix4fc)new Matrix4f((Matrix4fc)class093212.i()));
        ((Matrix4f)class11925.y_4).mul((Matrix4fc)class093212.N());
        class11925.N((class08066)class06202.Nq().e(), (boolean)true);
        ((class11216)class11925.L_6).N(class093212.i(), class093212.N());
        ((class11174)class11190.y_3).M();
        ((class11174)class11190.N_1).M();
        class11190.N();
    }
}

