/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03836
 *  minecraft.class06889
 *  org.lwjgl.openal.AL10
 */
package minecraft;

import minecraft.class03836;
import minecraft.class06889;
import org.lwjgl.openal.AL10;

public class class06310 {
    private class03836 N = class03836.N;

    public class03836 y() {
        return this.N;
    }

    public void N(class03836 class038362) {
        this.N = class038362;
        class06889 class068892 = class038362.y();
        class06889 class068893 = class038362.L();
        class06889 class068894 = class038362.u();
        AL10.alListener3f((int)4100, (float)((float)class068892.M), (float)((float)class068892.B), (float)((float)class068892.Z));
        AL10.alListenerfv((int)4111, (float[])new float[]{(float)class068893.M, (float)class068893.B, (float)class068893.Z, (float)class068894.N(), (float)class068894.y(), (float)class068894.L()});
    }

    public void N() {
        this.N(class03836.N);
    }
}

