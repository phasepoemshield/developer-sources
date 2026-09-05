/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09080
 *  Nursultan.class10967
 *  Nursultan.class11174
 *  Nursultan.class11190
 *  Nursultan.class11216
 *  Nursultan.class11826
 *  Nursultan.class11836
 *  Nursultan.class11925
 *  Nursultan.class11938
 *  com.mojang.blaze3d.systems.RenderSystem
 *  minecraft.class06202
 *  minecraft.class08066
 *  org.joml.Matrix4f
 */
package Nursultan;

import Nursultan.class09080;
import Nursultan.class10967;
import Nursultan.class11174;
import Nursultan.class11190;
import Nursultan.class11216;
import Nursultan.class11826;
import Nursultan.class11836;
import Nursultan.class11925;
import Nursultan.class11938;
import com.mojang.blaze3d.systems.RenderSystem;
import minecraft.class06202;
import minecraft.class08066;
import org.joml.Matrix4f;

public class class09336
implements class11826<class10967> {
    static {
        class09336.N();
    }

    public void listen(class10967 class109672) {
        class06202 class062022 = class06202.Nq();
        class11836 class118362 = class11938.k();
        class118362.N(class109672.N());
        class11925.N((class08066)class062022.e(), (boolean)true);
        ((class11216)class11925.L_6).N(class11925.L(), (Matrix4f)class11925.y_3);
        ((class11174)class11190.y_3).M();
        ((class11174)class11190.y_1).N(class093222 -> {
            class093222.z("u_projection").N(class11925.L());
            class093222.z("u_view").N(RenderSystem.getModelViewMatrix());
            class093222.M("texture_in").N(class118362.N());
        });
        ((class11174)class11190.N_0).M();
        class09080.L();
    }

    private static void N() {
    }
}

