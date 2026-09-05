/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 */
package baritone.api.process;

import baritone.api.process.IBaritoneProcess;
import baritone.api.utils.BlockOptionalMeta;
import baritone.api.utils.BlockOptionalMetaLookup;
import java.util.stream.Stream;
import minecraft.class00891;

public interface IMineProcess
extends IBaritoneProcess {
    default public void mine(class00891 ... class00891Array) {
        this.mine(0, class00891Array);
    }

    default public void mine(int n, BlockOptionalMeta ... blockOptionalMetaArray) {
        this.mine(n, new BlockOptionalMetaLookup(blockOptionalMetaArray));
    }

    default public void mine(int n, class00891 ... class00891Array) {
        this.mine(n, new BlockOptionalMetaLookup((BlockOptionalMeta[])Stream.of(class00891Array).map(BlockOptionalMeta::new).toArray(BlockOptionalMeta[]::new)));
    }

    default public void mine(BlockOptionalMeta ... blockOptionalMetaArray) {
        this.mine(0, blockOptionalMetaArray);
    }

    public void mine(int var1, BlockOptionalMetaLookup var2);

    default public void mine(BlockOptionalMetaLookup blockOptionalMetaLookup) {
        this.mine(0, blockOptionalMetaLookup);
    }

    default public void cancel() {
        this.onLostControl();
    }

    public void mineByName(int var1, String ... var2);

    default public void mineByName(String ... stringArray) {
        this.mineByName(0, stringArray);
    }
}

