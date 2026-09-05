/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.AbstractDoubleList
 *  it.unimi.dsi.fastutil.doubles.DoubleList
 */
package minecraft;

import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;
import it.unimi.dsi.fastutil.doubles.DoubleList;

public class class07255
extends AbstractDoubleList {
    private final DoubleList N;
    private final double y;

    public class07255(DoubleList doubleList, double d) {
        this.N = doubleList;
        this.y = d;
    }

    public int size() {
        return this.N.size();
    }

    public double getDouble(int n) {
        return this.N.getDouble(n) + this.y;
    }
}

