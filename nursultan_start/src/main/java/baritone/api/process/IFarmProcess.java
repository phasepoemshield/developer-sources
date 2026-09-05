/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07209
 */
package baritone.api.process;

import baritone.api.process.IBaritoneProcess;
import minecraft.class07209;

public interface IFarmProcess
extends IBaritoneProcess {
    public void farm(int var1, class07209 var2);

    default public void farm() {
        this.farm(0, null);
    }

    default public void farm(int n) {
        this.farm(n, null);
    }
}

