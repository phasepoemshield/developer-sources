/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09471
 *  minecraft.class01481
 *  minecraft.class03154
 *  minecraft.class03175
 *  minecraft.class06997
 *  minecraft.class07709
 *  minecraft.class07726
 */
package minecraft;

import Nursultan.class09471;
import java.io.DataInput;
import java.io.IOException;
import minecraft.class01481;
import minecraft.class03154;
import minecraft.class03175;
import minecraft.class06997;
import minecraft.class07709;
import minecraft.class07726;

public interface class01424<T extends class07709> {
    public T L(DataInput var1, class07726 var2) throws IOException;

    public String y();

    public void y(DataInput var1, class07726 var2) throws IOException;

    default public void y(DataInput dataInput, class03175 class031752, class07726 class077262) throws IOException {
        switch (class01481.N[class031752.y(this).ordinal()]) {
            case 1: {
                this.N(dataInput, class031752, class077262);
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                this.y(dataInput, class077262);
            }
        }
    }

    public static class01424<class06997> N(int n) {
        return new class09471(n);
    }

    public class03154 N(DataInput var1, class03175 var2, class07726 var3) throws IOException;

    public String N();

    public void N(DataInput var1, int var2, class07726 var3) throws IOException;
}

