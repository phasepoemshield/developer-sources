/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01424
 *  minecraft.class07709
 *  minecraft.class07726
 */
package minecraft;

import java.io.DataInput;
import java.io.IOException;
import minecraft.class01424;
import minecraft.class07709;
import minecraft.class07726;

public interface class01477<T extends class07709>
extends class01424<T> {
    default public void N(DataInput dataInput, int n, class07726 class077262) throws IOException {
        for (int i = 0; i < n; ++i) {
            this.y(dataInput, class077262);
        }
    }
}

