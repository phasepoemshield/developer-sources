/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Sets
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.Arrays
 *  it.unimi.dsi.fastutil.Swapper
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntComparator
 *  it.unimi.dsi.fastutil.ints.IntList
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.Swapper;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntComparator;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.slf4j.Logger;

public class class00067<T> {
    private static final boolean y = Boolean.parseBoolean(System.getProperty("SuffixArray.printComparisons", "false"));
    private static final boolean L = Boolean.parseBoolean(System.getProperty("SuffixArray.printArray", "false"));
    private static final Logger u = LogUtils.getLogger();
    private static final int i = -1;
    private static final int R = -2;
    protected final List<T> N = Lists.newArrayList();
    private final IntList M = new IntArrayList();
    private final IntList B = new IntArrayList();
    private IntList Z = new IntArrayList();
    private IntList z = new IntArrayList();
    private int U;

    private void y() {
        for (int i = 0; i < this.Z.size(); ++i) {
            u.debug("{} {}", (Object)i, (Object)this.N(i));
        }
        u.debug("");
    }

    public List<T> N(String string) {
        int n;
        int n2;
        int n3 = this.Z.size();
        int n4 = 0;
        int n5 = n3;
        while (n4 < n5) {
            n2 = n4 + (n5 - n4) / 2;
            n = this.N(string, n2);
            if (y) {
                u.debug("comparing lower \"{}\" with {} \"{}\": {}", new Object[]{string, n2, this.N(n2), n});
            }
            if (n > 0) {
                n4 = n2 + 1;
                continue;
            }
            n5 = n2;
        }
        if (n4 < 0 || n4 >= n3) {
            return Collections.emptyList();
        }
        n2 = n4;
        n5 = n3;
        while (n4 < n5) {
            n = n4 + (n5 - n4) / 2;
            int n6 = this.N(string, n);
            if (y) {
                u.debug("comparing upper \"{}\" with {} \"{}\": {}", new Object[]{string, n, this.N(n), n6});
            }
            if (n6 >= 0) {
                n4 = n + 1;
                continue;
            }
            n5 = n;
        }
        n = n4;
        IntOpenHashSet intOpenHashSet = new IntOpenHashSet();
        for (int i = n2; i < n; ++i) {
            intOpenHashSet.add(this.Z.getInt(i));
        }
        int[] nArray = intOpenHashSet.toIntArray();
        Arrays.sort(nArray);
        LinkedHashSet linkedHashSet = Sets.newLinkedHashSet();
        for (int n7 : nArray) {
            linkedHashSet.add(this.N.get(n7));
        }
        return Lists.newArrayList((Iterable)linkedHashSet);
    }

    private int N(String string, int n) {
        int n2 = this.B.getInt(this.Z.getInt(n));
        int n3 = this.z.getInt(n);
        for (int i = 0; i < string.length(); ++i) {
            char c;
            int n4 = this.M.getInt(n2 + n3 + i);
            if (n4 == -1) {
                return 1;
            }
            char c2 = string.charAt(i);
            if (c2 < (c = (char)n4)) {
                return -1;
            }
            if (c2 <= c) continue;
            return 1;
        }
        return 0;
    }

    public void N(T t, String string) {
        this.U = Math.max(this.U, string.length());
        int n = this.N.size();
        this.N.add(t);
        this.B.add(this.M.size());
        for (int i = 0; i < string.length(); ++i) {
            this.Z.add(n);
            this.z.add(i);
            this.M.add((int)string.charAt(i));
        }
        this.Z.add(n);
        this.z.add(string.length());
        this.M.add(-1);
    }

    private String N(int n) {
        int n2 = this.z.getInt(n);
        int n3 = this.B.getInt(this.Z.getInt(n));
        StringBuilder stringBuilder = new StringBuilder();
        int n4 = 0;
        while (n3 + n4 < this.M.size()) {
            int n5;
            if (n4 == n2) {
                stringBuilder.append('^');
            }
            if ((n5 = this.M.getInt(n3 + n4)) == -1) break;
            stringBuilder.append((char)n5);
            ++n4;
        }
        return stringBuilder.toString();
    }

    public void N() {
        int n3;
        int n4 = this.M.size();
        int[] nArray = new int[n4];
        int[] nArray2 = new int[n4];
        int[] nArray3 = new int[n4];
        int[] nArray4 = new int[n4];
        IntComparator intComparator = (n, n2) -> {
            if (nArray2[n] == nArray2[n2]) {
                return Integer.compare(nArray3[n], nArray3[n2]);
            }
            return Integer.compare(nArray2[n], nArray2[n2]);
        };
        Swapper swapper = (n, n2) -> {
            if (n != n2) {
                int n3 = nArray2[n];
                nArray[n] = nArray2[n2];
                nArray[n2] = n3;
                n3 = nArray3[n];
                nArray2[n] = nArray3[n2];
                nArray2[n2] = n3;
                n3 = nArray4[n];
                nArray3[n] = nArray4[n2];
                nArray3[n2] = n3;
            }
        };
        for (n3 = 0; n3 < n4; ++n3) {
            nArray[n3] = this.M.getInt(n3);
        }
        n3 = 1;
        int n5 = Math.min(n4, this.U);
        while (n3 * 2 < n5) {
            int n6;
            for (n6 = 0; n6 < n4; ++n6) {
                nArray2[n6] = nArray[n6];
                nArray3[n6] = n6 + n3 < n4 ? nArray[n6 + n3] : -2;
                nArray4[n6] = n6;
            }
            it.unimi.dsi.fastutil.Arrays.quickSort((int)0, (int)n4, (IntComparator)intComparator, (Swapper)swapper);
            for (n6 = 0; n6 < n4; ++n6) {
                nArray[nArray4[n6]] = n6 > 0 && nArray2[n6] == nArray2[n6 - 1] && nArray3[n6] == nArray3[n6 - 1] ? nArray[nArray4[n6 - 1]] : n6;
            }
            n3 *= 2;
        }
        IntList intList = this.Z;
        IntList intList2 = this.z;
        this.Z = new IntArrayList(intList.size());
        this.z = new IntArrayList(intList2.size());
        for (int i = 0; i < n4; ++i) {
            int n7 = nArray4[i];
            this.Z.add(intList.getInt(n7));
            this.z.add(intList2.getInt(n7));
        }
        if (L) {
            this.y();
        }
    }
}

