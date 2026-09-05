/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 */
package baritone.api.process;

import baritone.api.process.IBaritoneProcess;
import baritone.api.utils.BlockOptionalMeta;
import minecraft.class00891;

public interface IGetToBlockProcess
extends IBaritoneProcess {
    public void getToBlock(BlockOptionalMeta var1);

    default public void getToBlock(class00891 class008912) {
        this.getToBlock(new BlockOptionalMeta(class008912));
    }

    public boolean blacklistClosest();
}

