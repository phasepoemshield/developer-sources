/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntList
 *  minecraft.class05033
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.IntList;
import minecraft.class02495;
import minecraft.class05033;

public interface class02466
extends class05033 {
    default public int y() {
        return this.N().size();
    }

    public IntList N();

    public static class02466 N(String string, IntList intList) {
        return new class02495(intList, string);
    }
}

