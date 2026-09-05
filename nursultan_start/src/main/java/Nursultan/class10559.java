/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09454
 *  minecraft.class02727
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.class09454;
import java.io.File;
import minecraft.class02727;
import minecraft.class06202;

public class class10559
implements Runnable {
    public Object N_0;
    public Object N_1;
    public Object N_2;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class10559(class06202 class062022, class09454 class094542) {
        this.y();
        this.N_2 = class062022;
        this.N_1 = class094542;
    }

    @Override
    public void run() {
        if (!((Boolean)this.N_0).booleanValue()) {
            this.N_0 = true;
            class02727.N((File)((class09454)this.N_1).L.N, (long)((Thread)((class06202)this.N_2).G_2).threadId());
        }
    }

    private void y() {
        this.N_0 = false;
    }
}

