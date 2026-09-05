/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 */
package Nursultan;

import Nursultan.class09071;
import Nursultan.class09079;
import Nursultan.class09082;
import Nursultan.class09092;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.EnumMap;
import java.util.Map;

public class class09100 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public static Object y_0;
    public static Object y_1;

    public class09100(class09082 class090822, String string, byte[] byArray) {
        this.y();
        this.N_0 = new EnumMap(class09079.class);
        this.N_1 = class090822;
        this.N_2 = string;
        this.N_3 = byArray;
    }

    static {
        class09100.R();
        y_0 = new class09092[]{class09092.N(48, 57), class09092.N(97, 122), class09092.N(65, 90), class09092.N(1072, 1103), class09092.N(1040, 1071), class09092.N(1105), class09092.N(1025), class09092.N(33, 47), class09092.N(9889), class09092.N(9733), class09092.N(9679), class09092.N(58, 64), class09092.N(91, 96), class09092.N(167), class09092.N(123, 126), class09092.N(8470), class09092.N(32), class09092.N(183), class09092.N(169), class09092.N(187), class09092.N(171), class09092.N(8211), class09092.N(8212)};
        y_1 = class09100.i();
    }

    private static int[] i() {
        IntArrayList intArrayList = new IntArrayList();
        class09092[] class09092Array = (class09092[])y_0;
        int n = class09092Array.length;
        for (int i = 0; i < n; ++i) {
            class09092Array[i].N((IntList)intArrayList);
        }
        return intArrayList.toIntArray();
    }

    private void y() {
    }

    public class09071 N(class09079 class090792) {
        class09071 class090712 = (class09071)((Map)this.N_0).get((Object)class090792);
        if (class090712 != null) {
            return class090712;
        }
        class09071 class090713 = ((class09082)this.N_1).N((String)this.N_2, (byte[])this.N_3, class090792);
        for (int n : (int[])y_1) {
            class090713.N(n);
        }
        ((Map)this.N_0).put(class090792, class090713);
        return class090713;
    }

    private static void R() {
        y_0 = null;
        y_1 = null;
    }
}

