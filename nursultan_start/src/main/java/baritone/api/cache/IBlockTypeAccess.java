/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class07209
 */
package baritone.api.cache;

import minecraft.class00500;
import minecraft.class07209;

public interface IBlockTypeAccess {
    public class00500 getBlock(int var1, int var2, int var3);

    default public class00500 getBlock(class07209 class072092) {
        return this.getBlock(class072092.method_10263(), class072092.method_10264(), class072092.method_10260());
    }
}

