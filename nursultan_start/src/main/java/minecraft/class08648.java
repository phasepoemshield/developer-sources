/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.systems.RenderSystem
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01422
 *  minecraft.class01540
 *  minecraft.class02058
 *  minecraft.class03386
 *  minecraft.class06202
 *  minecraft.class07311
 *  minecraft.class08672
 *  minecraft.class08676
 *  org.joml.Matrix4fStack
 *  org.joml.Quaternionfc
 */
package minecraft;

import com.mojang.blaze3d.systems.RenderSystem;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01422;
import minecraft.class01540;
import minecraft.class02058;
import minecraft.class03386;
import minecraft.class06202;
import minecraft.class07311;
import minecraft.class08672;
import minecraft.class08676;
import org.joml.Matrix4fStack;
import org.joml.Quaternionfc;

public class class08648
extends class08672<class08676> {
    public class08648(class01422 class014222) {
        super(class014222);
    }

    protected String y() {
        return "player skin";
    }

    protected void N(class08676 class086762, class01421 class014212) {
        ((class03386)class06202.Nq().i_5).v().N(class01540.field_60029);
        int n = class06202.Nq().Nt().j();
        Matrix4fStack matrix4fStack = RenderSystem.getModelViewStack();
        matrix4fStack.pushMatrix();
        float f = class086762.N() * (float)n;
        matrix4fStack.rotateAround((Quaternionfc)class02058.y.N(class086762.u()), 0.0f, f * -class086762.U(), 0.0f);
        class014212.N((Quaternionfc)class02058.u.N(-class086762.z()));
        class014212.N(0.0f, -1.6010001f, 0.0f);
        class07311 class073112 = class086762.y().method_23500(class086762.L());
        class086762.y().method_60879(class014212, this.N.method_73477(class073112), 0xF000F0, class01384.u);
        this.N.u();
        matrix4fStack.popMatrix();
    }

    public Class<class08676> N() {
        return class08676.class;
    }
}

