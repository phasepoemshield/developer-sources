/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09064
 *  Nursultan.class09065
 *  Nursultan.class09076
 */
package Nursultan;

import Nursultan.class09064;
import Nursultan.class09065;
import Nursultan.class09076;
import Nursultan.class11171;
import Nursultan.class11187;
import Nursultan.class11192;
import Nursultan.class11202;
import java.util.Arrays;
import java.util.List;

public class class11218<C>
implements class11192<C> {
    public static Object N_0;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;

    class11218(List<class11171<C>> list, class09065 class090652) {
        this.y();
        this.y_0 = list;
        this.y_1 = class090652;
        class11202 class112022 = new class11202();
        for (int i = 0; i < list.size(); ++i) {
            list.get(i).N(class112022);
        }
        this.y_2 = class112022.u();
        this.y_3 = class11218.N(list, ((class09064[])this.y_2).length);
        this.y_4 = class090652.N();
    }

    static {
        class11218.i();
    }

    private static void i() {
        N_0 = new int[0];
    }

    @Override
    public void execute(C c) {
        try (class09076 class090762 = ((class09076)this.y_4).N((class09064[])this.y_2);){
            List list = (List)this.y_0;
            int[][] nArray = (int[][])this.y_3;
            class09064[] class09064Array = (class09064[])this.y_2;
            for (int i = 0; i < list.size(); ++i) {
                ((class11171)list.get(i)).N(c, class090762, (class09065)this.y_1);
                for (int n : nArray[i]) {
                    if (class09064Array[n].Z()) continue;
                    class090762.L(n);
                }
            }
        }
    }

    private void y() {
    }

    private static <C> int[][] N(List<class11171<C>> list, int n) {
        int n2;
        int n3;
        int[] nArray = new int[n];
        Arrays.fill(nArray, -1);
        for (int i = 0; i < list.size(); ++i) {
            int[] objectArray = list.get(i).y();
            int nArray2 = objectArray.length;
            for (n3 = 0; n3 < nArray2; ++n3) {
                n2 = objectArray[n3];
                nArray[n2] = i;
            }
        }
        int[][] nArrayArray = new int[list.size()][];
        boolean[] blArray = new boolean[n];
        int[] nArray2 = new int[n];
        for (n3 = 0; n3 < list.size(); ++n3) {
            n2 = 0;
            for (int n4 : list.get(n3).y()) {
                if (blArray[n4] || nArray[n4] != n3) continue;
                blArray[n4] = true;
                nArray2[n2++] = n4;
            }
            int[] nArray3 = Arrays.copyOf(nArray2, n2);
            for (int i = 0; i < n2; ++i) {
                blArray[nArray3[i]] = false;
            }
            nArrayArray[n3] = nArray3.length == 0 ? (int[])N_0 : nArray3;
        }
        return nArrayArray;
    }

    public static <C> class11187<C> N() {
        return new class11187((class09065)class09065.y_0);
    }

    public static <C> class11187<C> N(class09065 class090652) {
        return new class11187(class090652);
    }
}

