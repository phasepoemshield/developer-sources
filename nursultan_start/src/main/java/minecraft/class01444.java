/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07709
 *  minecraft.class07726
 */
package minecraft;

import java.io.DataInput;
import java.io.IOException;
import minecraft.class01424;
import minecraft.class07709;
import minecraft.class07726;

public interface class01444<T extends class07709>
extends class01424<T> {
    public int L();

    @Override
    default public void y(DataInput dataInput, class07726 class077262) throws IOException {
        dataInput.skipBytes(this.L());
    }

    @Override
    default public void N(DataInput dataInput, int n, class07726 class077262) throws IOException {
        dataInput.skipBytes(this.L() * n);
    }
}

