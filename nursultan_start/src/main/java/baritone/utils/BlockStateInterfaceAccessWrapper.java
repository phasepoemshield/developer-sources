/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class04688
 *  minecraft.class07209
 *  minecraft.class07290
 */
package baritone.utils;

import baritone.utils.BlockStateInterface;
import javax.annotation.Nullable;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class04688;
import minecraft.class07209;
import minecraft.class07290;

public final class BlockStateInterfaceAccessWrapper
implements class07290 {
    private final BlockStateInterface bsi;

    public int method_31607() {
        return this.bsi.world.method_31607();
    }

    public class00500 method_8320(class07209 class072092) {
        return this.bsi.get0(class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
    }

    public class04688 method_8316(class07209 class072092) {
        return this.method_8320(class072092).Y();
    }

    BlockStateInterfaceAccessWrapper(BlockStateInterface blockStateInterface) {
        this.bsi = blockStateInterface;
    }

    @Nullable
    public class00394 method_8321(class07209 class072092) {
        return null;
    }

    public int method_31605() {
        return this.bsi.world.method_31605();
    }
}

