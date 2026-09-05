/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01372
 *  minecraft.class06890
 *  minecraft.class07185
 *  minecraft.class07211
 *  minecraft.class07212
 *  minecraft.class07214
 *  org.joml.Vector3i
 */
package minecraft;

import minecraft.class01372;
import minecraft.class06890;
import minecraft.class07185;
import minecraft.class07211;
import minecraft.class07212;
import minecraft.class07214;
import minecraft.class07715;
import minecraft.class07716;
import org.joml.Vector3i;

public abstract class class07739 {
    private static final class07185[] field_1375 = class07185.values();
    public final int field_1374;
    public final int field_1373;
    public final int field_1372;

    public class07739(int n, int n2, int n3) {
        if (n < 0 || n2 < 0 || n3 < 0) {
            throw new IllegalArgumentException("Need all positive sizes: x: " + n + ", y: " + n2 + ", z: " + n3);
        }
        this.field_1374 = n;
        this.field_1373 = n2;
        this.field_1372 = n3;
    }

    public void method_1053(class07716 class077162, boolean bl) {
        class06890.N((class07739)this, (class07716)class077162, (boolean)bl);
    }

    public abstract int method_1045(class07185 var1);

    public int method_1058(class07185 class071852, int n, int n2) {
        if (n < 0 || n2 < 0) {
            return 0;
        }
        class07185 class071853 = class07214.field_10963.N(class071852);
        class07185 class071854 = class07214.field_10965.N(class071852);
        if (n >= this.method_1051(class071853) || n2 >= this.method_1051(class071854)) {
            return 0;
        }
        int n3 = this.method_1051(class071852);
        class07214 class072142 = class07214.N((class07185)class07185.field_11048, (class07185)class071852);
        for (int i = n3 - 1; i >= 0; --i) {
            if (!this.method_1057(class072142, i, n, n2)) continue;
            return i + 1;
        }
        return 0;
    }

    public void method_1064(class07716 class077162, boolean bl) {
        this.method_1052(class077162, class07214.field_10962, bl);
        this.method_1052(class077162, class07214.field_10963, bl);
        this.method_1052(class077162, class07214.field_10965, bl);
    }

    public boolean method_1056() {
        for (class07185 class071852 : field_1375) {
            if (this.method_1055(class071852) < this.method_1045(class071852)) continue;
            return true;
        }
        return false;
    }

    public int method_1051(class07185 class071852) {
        return class071852.N(this.field_1374, this.field_1373, this.field_1372);
    }

    public abstract int method_1055(class07185 var1);

    public boolean method_1044(int n, int n2, int n3) {
        if (n < 0 || n2 < 0 || n3 < 0) {
            return false;
        }
        if (n >= this.field_1374 || n2 >= this.field_1373 || n3 >= this.field_1372) {
            return false;
        }
        return this.method_1063(n, n2, n3);
    }

    public int method_35592(class07185 class071852, int n, int n2) {
        int n3 = this.method_1051(class071852);
        if (n < 0 || n2 < 0) {
            return n3;
        }
        class07185 class071853 = class07214.field_10963.N(class071852);
        class07185 class071854 = class07214.field_10965.N(class071852);
        if (n >= this.method_1051(class071853) || n2 >= this.method_1051(class071854)) {
            return n3;
        }
        class07214 class072142 = class07214.N((class07185)class07185.field_11048, (class07185)class071852);
        for (int i = 0; i < n3; ++i) {
            if (!this.method_1057(class072142, i, n, n2)) continue;
            return i;
        }
        return n3;
    }

    public boolean method_1062(class07214 class072142, int n, int n2, int n3) {
        return this.method_1044(class072142.N(n, n2, n3, class07185.field_11048), class072142.N(n, n2, n3, class07185.field_11052), class072142.N(n, n2, n3, class07185.field_11051));
    }

    public int method_1050() {
        return this.method_1051(class07185.field_11048);
    }

    public boolean method_1057(class07214 class072142, int n, int n2, int n3) {
        return this.method_1063(class072142.N(n, n2, n3, class07185.field_11048), class072142.N(n, n2, n3, class07185.field_11052), class072142.N(n, n2, n3, class07185.field_11051));
    }

    private void method_1061(class07715 class077152, class07214 class072142) {
        class07214 class072143 = class072142.N();
        class07185 class071852 = class072143.N(class07185.field_11051);
        int n = this.method_1051(class072143.N(class07185.field_11048));
        int n2 = this.method_1051(class072143.N(class07185.field_11052));
        int n3 = this.method_1051(class071852);
        class07211 class072112 = class07211.N((class07185)class071852, (class07212)class07212.field_11060);
        class07211 class072113 = class07211.N((class07185)class071852, (class07212)class07212.field_11056);
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n2; ++j) {
                boolean bl = false;
                for (int k = 0; k <= n3; ++k) {
                    boolean bl2;
                    boolean bl3 = bl2 = k != n3 && this.method_1057(class072143, i, j, k);
                    if (!bl && bl2) {
                        class077152.consume(class072112, class072143.N(i, j, k, class07185.field_11048), class072143.N(i, j, k, class07185.field_11052), class072143.N(i, j, k, class07185.field_11051));
                    }
                    if (bl && !bl2) {
                        class077152.consume(class072113, class072143.N(i, j, k - 1, class07185.field_11048), class072143.N(i, j, k - 1, class07185.field_11052), class072143.N(i, j, k - 1, class07185.field_11051));
                    }
                    bl = bl2;
                }
            }
        }
    }

    public class07739 method_66493(class01372 class013722) {
        if (class013722 == class01372.field_23292) {
            return this;
        }
        Vector3i vector3i = class013722.N(new Vector3i(this.field_1374, this.field_1373, this.field_1372));
        int n = class07739.method_75279(vector3i, 0);
        int n2 = class07739.method_75279(vector3i, 1);
        int n3 = class07739.method_75279(vector3i, 2);
        class06890 class068902 = new class06890(vector3i.x, vector3i.y, vector3i.z);
        for (int i = 0; i < this.field_1374; ++i) {
            for (int j = 0; j < this.field_1373; ++j) {
                for (int k = 0; k < this.field_1372; ++k) {
                    if (!this.method_1063(i, j, k)) continue;
                    Vector3i vector3i2 = class013722.N(vector3i.set(i, j, k));
                    int n4 = n + vector3i2.x;
                    int n5 = n2 + vector3i2.y;
                    int n6 = n3 + vector3i2.z;
                    class068902.method_1049(n4, n5, n6);
                }
            }
        }
        return class068902;
    }

    public int method_1047() {
        return this.method_1051(class07185.field_11052);
    }

    public abstract boolean method_1063(int var1, int var2, int var3);

    private static int method_75279(Vector3i vector3i, int n) {
        int n2 = vector3i.get(n);
        if (n2 < 0) {
            vector3i.setComponent(n, -n2);
            return -n2 - 1;
        }
        return 0;
    }

    public void method_1046(class07715 class077152) {
        this.method_1061(class077152, class07214.field_10962);
        this.method_1061(class077152, class07214.field_10963);
        this.method_1061(class077152, class07214.field_10965);
    }

    private void method_1052(class07716 class077162, class07214 class072142, boolean bl) {
        class07214 class072143 = class072142.N();
        int n = this.method_1051(class072143.N(class07185.field_11048));
        int n2 = this.method_1051(class072143.N(class07185.field_11052));
        int n3 = this.method_1051(class072143.N(class07185.field_11051));
        for (int i = 0; i <= n; ++i) {
            for (int j = 0; j <= n2; ++j) {
                int n4 = -1;
                for (int k = 0; k <= n3; ++k) {
                    int n5 = 0;
                    int n6 = 0;
                    for (int i2 = 0; i2 <= 1; ++i2) {
                        for (int i3 = 0; i3 <= 1; ++i3) {
                            if (!this.method_1062(class072143, i + i2 - 1, j + i3 - 1, k)) continue;
                            ++n5;
                            n6 ^= i2 ^ i3;
                        }
                    }
                    if (n5 == 1 || n5 == 3 || n5 == 2 && !(n6 & true)) {
                        if (bl) {
                            if (n4 != -1) continue;
                            n4 = k;
                            continue;
                        }
                        class077162.consume(class072143.N(i, j, k, class07185.field_11048), class072143.N(i, j, k, class07185.field_11052), class072143.N(i, j, k, class07185.field_11051), class072143.N(i, j, k + 1, class07185.field_11048), class072143.N(i, j, k + 1, class07185.field_11052), class072143.N(i, j, k + 1, class07185.field_11051));
                        continue;
                    }
                    if (n4 == -1) continue;
                    class077162.consume(class072143.N(i, j, n4, class07185.field_11048), class072143.N(i, j, n4, class07185.field_11052), class072143.N(i, j, n4, class07185.field_11051), class072143.N(i, j, k, class07185.field_11048), class072143.N(i, j, k, class07185.field_11052), class072143.N(i, j, k, class07185.field_11051));
                    n4 = -1;
                }
            }
        }
    }

    public abstract void method_1049(int var1, int var2, int var3);

    public int method_1048() {
        return this.method_1051(class07185.field_11051);
    }
}

