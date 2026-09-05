/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.BitSet;
import java.util.List;
import minecraft.class08012;
import minecraft.class08022;
import minecraft.class08034;
import org.jspecify.annotations.Nullable;

class class08014<T> {
    private final List<? extends class08022<T>> L;
    private final int u;
    private final List<T> i;
    private final int R;
    private final BitSet M;
    private final IntList B = new IntArrayList();
    static final /* synthetic */ boolean N;
    final /* synthetic */ class08034 y;

    private @Nullable IntList L(int n) {
        this.B.clear();
        this.z(n);
        this.B.add(n);
        while (!this.B.isEmpty()) {
            int n2;
            int n3 = this.B.size();
            if (class08014.N(n3 - 1)) {
                n2 = this.B.getInt(n3 - 1);
                for (var4_4 = 0; var4_4 < this.u; ++var4_4) {
                    if (this.B(var4_4) || !this.y(n2, var4_4) || this.u(n2, var4_4)) continue;
                    this.M(var4_4);
                    this.B.add(var4_4);
                    break;
                }
            } else {
                n2 = this.B.getInt(n3 - 1);
                if (!this.u(n2)) {
                    return this.B;
                }
                for (var4_4 = 0; var4_4 < this.R; ++var4_4) {
                    if (this.U(var4_4) || !this.u(var4_4, n2)) continue;
                    if (!N && !this.y(var4_4, n2)) {
                        throw new AssertionError();
                    }
                    this.z(var4_4);
                    this.B.add(var4_4);
                    break;
                }
            }
            if ((n2 = this.B.size()) != n3) continue;
            this.B.removeInt(n2 - 1);
        }
        return null;
    }

    private int L(int n, int n2) {
        if (!(N || n >= 0 && n < this.R)) {
            throw new AssertionError();
        }
        if (!(N || n2 >= 0 && n2 < this.u)) {
            throw new AssertionError();
        }
        return this.B() + n * this.u + n2;
    }

    private int L() {
        return this.u;
    }

    private int M(int n, int n2) {
        if (!(N || n >= 0 && n < this.R)) {
            throw new AssertionError();
        }
        if (!(N || n2 >= 0 && n2 < this.u)) {
            throw new AssertionError();
        }
        return this.z() + n * this.u + n2;
    }

    private int M() {
        return this.u;
    }

    private void M(int n) {
        this.M.set(this.Z(n));
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class08014(class08034 class080342, List list) {
        this.y = class080342;
        this.L = list;
        this.u = list.size();
        this.i = class080342.N(list);
        this.R = this.i.size();
        this.M = new BitSet(this.L() + this.i() + this.M() + this.Z() + this.U());
        this.N();
    }

    static {
        N = !class08034.class.desiredAssertionStatus();
    }

    private void B(int n, int n2) {
        this.M.clear(n, n + n2);
    }

    private int B() {
        return this.R() + this.M();
    }

    private boolean B(int n) {
        return this.M.get(this.Z(n));
    }

    private int Z() {
        return this.u * this.R;
    }

    private int Z(int n) {
        if (!(N || n >= 0 && n < this.u)) {
            throw new AssertionError();
        }
        return this.y() + n;
    }

    private void i(int n) {
        this.M.set(this.R(n));
    }

    private int i() {
        return this.R;
    }

    private void i(int n, int n2) {
        int n3 = this.M(n, n2);
        if (!N && this.M.get(n3)) {
            throw new AssertionError();
        }
        this.M.set(n3);
    }

    private boolean U(int n) {
        return this.M.get(this.E(n));
    }

    private int U() {
        return this.u * this.R;
    }

    private int z() {
        return this.B() + this.Z();
    }

    private void z(int n) {
        this.M.set(this.E(n));
    }

    private boolean u(int n, int n2) {
        return this.M.get(this.M(n, n2));
    }

    private boolean u(int n) {
        return this.M.get(this.R(n));
    }

    private int u() {
        return this.y() + this.L();
    }

    private int y() {
        return 0;
    }

    public int y(int n, @Nullable class08012<T> class080122) {
        int n2;
        int n3 = 0;
        int n4 = Math.min(n, this.y.N(this.L)) + 1;
        while (true) {
            if (this.N(n2 = (n3 + n4) / 2, null)) {
                if (n4 - n3 <= 1) break;
                n3 = n2;
                continue;
            }
            n4 = n2;
        }
        if (n2 > 0) {
            this.N(n2, class080122);
        }
        return n2;
    }

    private @Nullable IntList y(int n) {
        this.W();
        for (int i = 0; i < this.R; ++i) {
            IntList intList;
            if (!this.y.N(this.i.get(i), n) || (intList = this.L(i)) == null) continue;
            return intList;
        }
        return null;
    }

    private boolean y(int n, int n2) {
        return this.M.get(this.L(n, n2));
    }

    private void E() {
        this.B(this.R(), this.M());
    }

    private int E(int n) {
        if (!(N || n >= 0 && n < this.R)) {
            throw new AssertionError();
        }
        return this.u() + n;
    }

    private static boolean N(int n) {
        return (n & 1) == 0;
    }

    private void N(int n, int n2) {
        this.M.set(this.L(n, n2));
    }

    public boolean N(int n, @Nullable class08012<T> class080122) {
        int n2;
        int n3;
        int n4;
        IntList intList;
        if (n <= 0) {
            return true;
        }
        int n5 = 0;
        while ((intList = this.y(n)) != null) {
            n4 = intList.getInt(0);
            this.y.y(this.i.get(n4), n);
            n3 = intList.size() - 1;
            this.i(intList.getInt(n3));
            ++n5;
            for (n2 = 0; n2 < intList.size() - 1; ++n2) {
                int n6;
                int n7;
                if (class08014.N(n2)) {
                    n7 = intList.getInt(n2);
                    n6 = intList.getInt(n2 + 1);
                    this.i(n7, n6);
                    continue;
                }
                n7 = intList.getInt(n2 + 1);
                n6 = intList.getInt(n2);
                this.R(n7, n6);
            }
        }
        boolean bl = n5 == this.u;
        n4 = bl && class080122 != null ? 1 : 0;
        this.W();
        this.E();
        block2: for (n3 = 0; n3 < this.u; ++n3) {
            for (n2 = 0; n2 < this.R; ++n2) {
                if (!this.u(n2, n3)) continue;
                this.R(n2, n3);
                this.y.L(this.i.get(n2), n);
                if (n4 == 0) continue block2;
                class080122.accept(this.i.get(n2));
                continue block2;
            }
        }
        if (!N && !this.M.get(this.z(), this.z() + this.U()).isEmpty()) {
            throw new AssertionError();
        }
        return bl;
    }

    private void N() {
        for (int i = 0; i < this.u; ++i) {
            class08022<T> class080222 = this.L.get(i);
            for (int j = 0; j < this.R; ++j) {
                if (!class080222.acceptsItem(this.i.get(j))) continue;
                this.N(j, i);
            }
        }
    }

    private void W() {
        this.B(this.y(), this.L());
        this.B(this.u(), this.i());
    }

    private void R(int n, int n2) {
        int n3 = this.M(n, n2);
        if (!N && !this.M.get(n3)) {
            throw new AssertionError();
        }
        this.M.clear(n3);
    }

    private int R() {
        return this.u() + this.i();
    }

    private int R(int n) {
        if (!(N || n >= 0 && n < this.u)) {
            throw new AssertionError();
        }
        return this.R() + n;
    }
}

