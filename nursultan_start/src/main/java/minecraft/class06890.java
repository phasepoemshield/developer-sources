/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00630
 *  minecraft.class07003
 *  minecraft.class07185
 *  minecraft.class07716
 *  minecraft.class07739
 *  net.caffeinemc.mods.lithium.mixin.minimal_nonvanilla.collisions.empty_space.BitSetDiscreteVoxelShapeAccessor
 */
package minecraft;

import java.util.BitSet;
import minecraft.class00630;
import minecraft.class07003;
import minecraft.class07185;
import minecraft.class07716;
import minecraft.class07739;
import net.caffeinemc.mods.lithium.mixin.minimal_nonvanilla.collisions.empty_space.BitSetDiscreteVoxelShapeAccessor;

public final class class06890
extends class07739
implements BitSetDiscreteVoxelShapeAccessor {
    private final BitSet N;
    private int y;
    private int L;
    private int u;
    private int i;
    private int R;
    private int M;

    public class06890(class07739 class077392) {
        super(class077392.field_1374, class077392.field_1373, class077392.field_1372);
        if (class077392 instanceof class06890) {
            this.N = (BitSet)((class06890)class077392).N.clone();
        } else {
            this.N = new BitSet(this.field_1374 * this.field_1373 * this.field_1372);
            for (int i = 0; i < this.field_1374; ++i) {
                for (int j = 0; j < this.field_1373; ++j) {
                    for (int k = 0; k < this.field_1372; ++k) {
                        if (!class077392.method_1063(i, j, k)) continue;
                        this.N.set(this.N(i, j, k));
                    }
                }
            }
        }
        this.y = class077392.method_1055(class07185.field_11048);
        this.L = class077392.method_1055(class07185.field_11052);
        this.u = class077392.method_1055(class07185.field_11051);
        this.i = class077392.method_1045(class07185.field_11048);
        this.R = class077392.method_1045(class07185.field_11052);
        this.M = class077392.method_1045(class07185.field_11051);
    }

    public class06890(int n, int n2, int n3) {
        super(n, n2, n3);
        this.N = new BitSet(n * n2 * n3);
        this.y = n;
        this.L = n2;
        this.u = n3;
    }

    private void y(int n, int n2, int n3, int n4) {
        this.N.clear(this.N(n3, n4, n), this.N(n3, n4, n2));
    }

    public boolean y(int n, int n2, int n3) {
        return n > 0 && n < this.field_1374 - 1 && n2 > 0 && n2 < this.field_1373 - 1 && n3 > 0 && n3 < this.field_1372 - 1 && this.method_1063(n, n2, n3) && this.method_1063(n - 1, n2, n3) && this.method_1063(n + 1, n2, n3) && this.method_1063(n, n2 - 1, n3) && this.method_1063(n, n2 + 1, n3) && this.method_1063(n, n2, n3 - 1) && this.method_1063(n, n2, n3 + 1);
    }

    private boolean N(int n, int n2, int n3, int n4, int n5) {
        for (int i = n; i < n2; ++i) {
            if (this.N(n3, n4, i, n5)) continue;
            return false;
        }
        return true;
    }

    private boolean N(int n, int n2, int n3, int n4) {
        if (n3 >= this.field_1374 || n4 >= this.field_1373) {
            return false;
        }
        return this.N.nextClearBit(this.N(n3, n4, n)) >= this.N(n3, n4, n2);
    }

    public static void N(class07739 class077392, class07716 class077162, boolean bl) {
        class06890 class068902 = new class06890(class077392);
        for (int i = 0; i < class068902.field_1373; ++i) {
            for (int j = 0; j < class068902.field_1374; ++j) {
                int n = -1;
                for (int k = 0; k <= class068902.field_1372; ++k) {
                    if (class068902.method_1044(j, i, k)) {
                        if (bl) {
                            if (n != -1) continue;
                            n = k;
                            continue;
                        }
                        class077162.consume(j, i, k, j + 1, i + 1, k + 1);
                        continue;
                    }
                    if (n == -1) continue;
                    int n2 = j;
                    int n3 = i;
                    class068902.y(n, k, j, i);
                    while (class068902.N(n, k, n2 + 1, i)) {
                        class068902.y(n, k, n2 + 1, i);
                        ++n2;
                    }
                    while (class068902.N(j, n2 + 1, n, k, n3 + 1)) {
                        for (int i2 = j; i2 <= n2; ++i2) {
                            class068902.y(n, k, i2, n3 + 1);
                        }
                        ++n3;
                    }
                    class077162.consume(j, i, n, n2 + 1, n3 + 1, k);
                    n = -1;
                }
            }
        }
    }

    static class06890 N(class07739 class077392, class07739 class077393, class00630 class006302, class00630 class006303, class00630 class006304, class07003 class070032) {
        class06890 class068902 = new class06890(class006302.size() - 1, class006303.size() - 1, class006304.size() - 1);
        int[] nArray = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        class006302.method_1065((n, n2, n3) -> {
            boolean[] blArray = new boolean[]{false};
            class006303.method_1065((n4, n5, n6) -> {
                boolean[] blArray2 = new boolean[]{false};
                class006304.method_1065((n7, n8, n9) -> {
                    if (class070032.apply(class077392.method_1044(n, n4, n7), class077393.method_1044(n2, n5, n8))) {
                        class068902.N.set(class068902.N(n3, n6, n9));
                        nArray[2] = Math.min(nArray[2], n9);
                        nArray[5] = Math.max(nArray[5], n9);
                        blArray[0] = true;
                    }
                    return true;
                });
                if (blArray2[0]) {
                    nArray[1] = Math.min(nArray[1], n6);
                    nArray[4] = Math.max(nArray[4], n6);
                    blArray[0] = true;
                }
                return true;
            });
            if (blArray[0]) {
                nArray[0] = Math.min(nArray[0], n3);
                nArray[3] = Math.max(nArray[3], n3);
            }
            return true;
        });
        class068902.y = nArray[0];
        class068902.L = nArray[1];
        class068902.u = nArray[2];
        class068902.i = nArray[3] + 1;
        class068902.R = nArray[4] + 1;
        class068902.M = nArray[5] + 1;
        return class068902;
    }

    protected int N(int n, int n2, int n3) {
        return (n * this.field_1373 + n2) * this.field_1372 + n3;
    }

    public static class06890 N(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        class06890 class068902 = new class06890(n, n2, n3);
        class068902.y = n4;
        class068902.L = n5;
        class068902.u = n6;
        class068902.i = n7;
        class068902.R = n8;
        class068902.M = n9;
        for (int i = n4; i < n7; ++i) {
            for (int j = n5; j < n8; ++j) {
                for (int k = n6; k < n9; ++k) {
                    class068902.N(i, j, k, false);
                }
            }
        }
        return class068902;
    }

    private void N(int n, int n2, int n3, boolean bl) {
        this.N.set(this.N(n, n2, n3));
        if (bl) {
            this.y = Math.min(this.y, n);
            this.L = Math.min(this.L, n2);
            this.u = Math.min(this.u, n3);
            this.i = Math.max(this.i, n + 1);
            this.R = Math.max(this.R, n2 + 1);
            this.M = Math.max(this.M, n3 + 1);
        }
    }

    public int method_1045(class07185 class071852) {
        return class071852.N(this.i, this.R, this.M);
    }

    public boolean method_1056() {
        return this.N.isEmpty();
    }

    public int method_1055(class07185 class071852) {
        return class071852.N(this.y, this.L, this.u);
    }

    public /* synthetic */ BitSet getStorage() {
        return this.N;
    }

    public boolean method_1063(int n, int n2, int n3) {
        return this.N.get(this.N(n, n2, n3));
    }

    public void method_1049(int n, int n2, int n3) {
        this.N(n, n2, n3, true);
    }
}

