/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class09714;
import Nursultan.class09725;
import Nursultan.class09729;
import Nursultan.class09730;
import Nursultan.class09732;
import Nursultan.class09748;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

final class class09754 {
    final ByteBuffer N;
    int y = 1000;

    int L(int n) {
        return this.N.getShort(n);
    }

    class09714 M(int n) {
        int n2;
        int n3 = this.y(n);
        ArrayList<int[]> arrayList = new ArrayList<int[]>();
        if (n3 == 1) {
            var4_4 = this.y(n + 2);
            var5_6 = this.y(n + 4);
            for (var6_8 = 0; var6_8 < var5_6; ++var6_8) {
                n2 = this.y(n + 6 + var6_8 * 2);
                if (n2 == 0) continue;
                arrayList.add(new int[]{var4_4 + var6_8, var4_4 + var6_8, n2});
            }
        } else if (n3 == 2) {
            var4_4 = this.y(n + 2);
            for (var5_6 = 0; var5_6 < var4_4; ++var5_6) {
                var6_8 = n + 4 + var5_6 * 6;
                arrayList.add(new int[]{this.y(var6_8), this.y(var6_8 + 2), this.y(var6_8 + 4)});
            }
        }
        arrayList.sort((nArray, nArray2) -> Integer.compare(nArray[0], nArray2[0]));
        int[] nArray3 = new int[arrayList.size()];
        int[] nArray4 = new int[arrayList.size()];
        int[] nArray5 = new int[arrayList.size()];
        for (n2 = 0; n2 < arrayList.size(); ++n2) {
            nArray3[n2] = ((int[])arrayList.get(n2))[0];
            nArray4[n2] = ((int[])arrayList.get(n2))[1];
            nArray5[n2] = ((int[])arrayList.get(n2))[2];
        }
        return new class09714(nArray3, nArray4, nArray5);
    }

    class09754(byte[] byArray) {
        this.N = ByteBuffer.wrap(byArray);
    }

    static int B(int n) {
        return Integer.bitCount(n & 0xFFFF) * 2;
    }

    static int Z(int n) {
        if ((n & 4) == 0) {
            return -1;
        }
        int n2 = 0;
        if ((n & 1) != 0) {
            n2 += 2;
        }
        if ((n & 2) != 0) {
            n2 += 2;
        }
        return n2;
    }

    String i(int n) {
        return "" + (char)this.N(n) + (char)this.N(n + 1) + (char)this.N(n + 2) + (char)this.N(n + 3);
    }

    long u(int n) {
        return (long)this.N.getInt(n) & 0xFFFFFFFFL;
    }

    class09729 y(int n, int n2, int n3, int n4) {
        class09732 class097322 = new class09732(this.R(n + this.y(n + 2)));
        class09714 class097142 = this.M(n + this.y(n + 8));
        class09714 class097143 = this.M(n + this.y(n + 10));
        int n5 = this.y(n + 12);
        int n6 = this.y(n + 14);
        int n7 = class09754.B(n2);
        int n8 = class09754.B(n3);
        int n9 = n7 + n8;
        int n10 = n + 16;
        int[][] nArray = new int[n5][n6];
        for (int i = 0; i < n5; ++i) {
            for (int j = 0; j < n6; ++j) {
                int n11 = n10 + (i * n6 + j) * n9;
                nArray[i][j] = n4 >= 0 ? this.L(n11 + n4) : 0;
            }
        }
        return new class09725(class097322, class097142, class097143, nArray);
    }

    int y(int n) {
        return this.N.getShort(n) & 0xFFFF;
    }

    class09730 N() {
        int n;
        int n2;
        int n3;
        Object object;
        int n4;
        int n5;
        int n6 = this.y(4);
        int n7 = -1;
        int n8 = -1;
        for (n5 = 0; n5 < n6; ++n5) {
            n4 = 12 + n5 * 16;
            object = this.i(n4);
            if (((String)object).equals("GPOS")) {
                n7 = (int)this.u(n4 + 8);
                continue;
            }
            if (!((String)object).equals("head")) continue;
            n8 = (int)this.u(n4 + 8);
        }
        if (n8 >= 0) {
            this.y = this.y(n8 + 18);
        }
        if (n7 < 0) {
            return new class09730(this.y, List.of());
        }
        n5 = n7 + this.y(n7 + 6);
        n4 = n7 + this.y(n7 + 8);
        object = new LinkedHashSet();
        int n9 = this.y(n5);
        for (n3 = 0; n3 < n9; ++n3) {
            int n10 = n5 + 2 + n3 * 6;
            if (!this.i(n10).equals("kern")) continue;
            int n11 = n5 + this.y(n10 + 4);
            n2 = this.y(n11 + 2);
            for (n = 0; n < n2; ++n) {
                object.add(this.y(n11 + 4 + n * 2));
            }
        }
        if (object.isEmpty()) {
            return new class09730(this.y, List.of());
        }
        n3 = this.y(n4);
        ArrayList<List<class09729>> arrayList = new ArrayList<List<class09729>>();
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            n2 = (Integer)iterator.next();
            if (n2 >= n3) continue;
            n = n4 + this.y(n4 + 2 + n2 * 2);
            int n12 = this.y(n);
            int n13 = this.y(n + 4);
            ArrayList<class09729> arrayList2 = new ArrayList<class09729>();
            for (int i = 0; i < n13; ++i) {
                int n14 = n + this.y(n + 6 + i * 2);
                if (n12 == 2) {
                    this.N(arrayList2, n14);
                    continue;
                }
                if (n12 != 9 || this.y(n14) != 1 || this.y(n14 + 2) != 2) continue;
                this.N(arrayList2, n14 + (int)this.u(n14 + 4));
            }
            if (arrayList2.isEmpty()) continue;
            arrayList.add(arrayList2);
        }
        return new class09730(this.y, arrayList);
    }

    int N(int n) {
        return this.N.get(n) & 0xFF;
    }

    class09729 N(int n, int n2, int n3, int n4) {
        int[] nArray = this.R(n + this.y(n + 2));
        int n5 = class09754.B(n2);
        int n6 = class09754.B(n3);
        int n7 = this.y(n + 8);
        HashMap<Long, Integer> hashMap = new HashMap<Long, Integer>();
        for (int i = 0; i < n7 && i < nArray.length; ++i) {
            int n8 = n + this.y(n + 10 + i * 2);
            int n9 = this.y(n8);
            int n10 = n8 + 2;
            for (int j = 0; j < n9; ++j) {
                int n11;
                int n12 = this.y(n10);
                int n13 = n11 = n4 >= 0 ? this.L(n10 + 2 + n4) : 0;
                if (n11 != 0) {
                    hashMap.put((long)nArray[i] << 32 | (long)n12 & 0xFFFFFFFFL, n11);
                }
                n10 += 2 + n5 + n6;
            }
        }
        return new class09748(hashMap);
    }

    void N(List<class09729> list, int n) {
        int n2 = this.y(n);
        int n3 = this.y(n + 4);
        int n4 = this.y(n + 6);
        int n5 = class09754.Z(n3);
        if (n2 == 1) {
            list.add(this.N(n, n3, n4, n5));
        } else if (n2 == 2) {
            list.add(this.y(n, n3, n4, n5));
        }
    }

    int[] R(int n) {
        int n2;
        if (this.y(n) == 1) {
            int n3 = this.y(n + 2);
            int[] nArray = new int[n3];
            for (int i = 0; i < n3; ++i) {
                nArray[i] = this.y(n + 4 + i * 2);
            }
            return nArray;
        }
        int n4 = this.y(n + 2);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < n4; ++i) {
            n2 = n + 4 + i * 6;
            for (int j = this.y(n2); j <= this.y(n2 + 2); ++j) {
                arrayList.add(j);
            }
        }
        int[] nArray = new int[arrayList.size()];
        for (n2 = 0; n2 < nArray.length; ++n2) {
            nArray[n2] = (Integer)arrayList.get(n2);
        }
        Arrays.sort(nArray);
        return nArray;
    }
}

