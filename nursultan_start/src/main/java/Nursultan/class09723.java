/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09940
 *  Nursultan.class09941
 *  Nursultan.class09946
 *  Nursultan.class09953
 *  Nursultan.class09960
 */
package Nursultan;

import Nursultan.class09711;
import Nursultan.class09721;
import Nursultan.class09722;
import Nursultan.class09727;
import Nursultan.class09744;
import Nursultan.class09756;
import Nursultan.class09760;
import Nursultan.class09940;
import Nursultan.class09941;
import Nursultan.class09946;
import Nursultan.class09953;
import Nursultan.class09960;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public final class class09723 {
    private static final int N = 16;
    private static final int y = 8;
    static final class09960[] L;
    private final class09940 u;
    private final int i;
    private final int R;
    private final int M;
    private final int B;
    private final int Z;
    private final int z;
    private final byte[] U;
    private final ArrayList<class09946> E = new ArrayList();
    private final ArrayList<class09756> W = new ArrayList();
    private final class09953 m = new class09953();
    private final class09721 P = new class09721(16);
    private byte[] s;
    private int T;
    private int b;
    private int j;
    private int v;
    private int n;
    private int t;

    public int L() {
        return this.T;
    }

    private class09946 L(class09946 class099462) {
        class09946 class099463 = Objects.requireNonNull(class099462, "texture");
        if (class099463.z() != this) {
            throw new IllegalArgumentException("Texture handle does not belong to this atlas");
        }
        return class099463;
    }

    private boolean L(class09946 class099462, byte[] byArray, int n, int n2) {
        int n3 = this.y(class099462);
        class09760 class097602 = this.b();
        class09722 class097222 = this.u(class099462);
        this.E.remove(n3);
        this.L(class097222.N(), class097222.y(), class097222.i(), class097222.R());
        this.s();
        this.v();
        class09727 class097272 = this.N(n, n2);
        if (class097272 != null) {
            this.N(class099462, n3, byArray, n, n2, class097222, class097272, class097602.L());
            return true;
        }
        this.N(class099462, n3, class097602);
        return this.N(class099462, byArray, n, n2, true);
    }

    private void L(int n, int n2, int n3, int n4) {
        if (n3 <= 0 || n4 <= 0 || n < 0 || n2 < 0 || n + n3 > this.i) {
            return;
        }
        if (n2 >= this.R || n2 + n4 > this.R) {
            return;
        }
        if (n3 < 8 || n4 < 8) {
            return;
        }
        class09756 class097562 = new class09756(n, n2, n3, n4);
        int n5 = 0;
        while (n5 < this.W.size()) {
            class09756 class097563 = this.W.get(n5);
            if (class09723.N(class097562, class097563)) {
                this.W.remove(n5);
                continue;
            }
            if (class09723.N(class097563, class097562)) {
                return;
            }
            if (class09723.y(class097562, class097563)) {
                class097562 = class09723.L(class097562, class097563);
                this.W.remove(n5);
                n5 = 0;
                continue;
            }
            ++n5;
        }
        this.W.add(class097562);
    }

    private class09727 L(int n, int n2) {
        int n3;
        class09711 class097112 = this.B(n, n2);
        int n4 = -1;
        int n5 = Integer.MAX_VALUE;
        int n6 = Integer.MAX_VALUE;
        int n7 = Integer.MAX_VALUE;
        int n8 = Integer.MAX_VALUE;
        for (int i = 0; i < this.W.size(); ++i) {
            class09756 class097562 = this.W.get(i);
            if (class097112.N() > class097562.L || class097112.y() > class097562.u) continue;
            n3 = class097562.L * class097562.u - class097112.N() * class097112.y();
            int n9 = Math.min(class097562.L - class097112.N(), class097562.u - class097112.y());
            if (n3 >= n5 && (n3 != n5 || n9 >= n6) && (n3 != n5 || n9 != n6 || class097562.y >= n7 && (class097562.y != n7 || class097562.N >= n8))) continue;
            n4 = i;
            n5 = n3;
            n6 = n9;
            n8 = class097562.N;
            n7 = class097562.y;
        }
        if (n4 < 0) {
            return null;
        }
        class09756 class097563 = this.W.remove(n4);
        this.L(class097563.N + class097112.N(), class097563.y, class097563.L - class097112.N(), class097563.u);
        this.L(class097563.N, class097563.y + class097112.y(), class097112.N(), class097563.u - class097112.y());
        int n10 = Math.max(this.b, class097563.y + n2);
        n3 = this.y(n10);
        return new class09727(class097563.N, class097563.y, class097112.N(), class097112.y(), n3, 0, false);
    }

    private static class09756 L(class09756 class097562, class09756 class097563) {
        int n = Math.min(class097562.N, class097563.N);
        int n2 = Math.min(class097562.y, class097563.y);
        int n3 = Math.max(class097562.N(), class097563.N());
        int n4 = Math.max(class097562.y(), class097563.y());
        return new class09756(n, n2, n3 - n, n4 - n2);
    }

    private int L(int n) {
        return class09723.N((long)n + (long)this.M, "padded width is too large");
    }

    public byte[] M() {
        return this.U;
    }

    private int M(int n, int n2) {
        if (n >= this.T) {
            return 0;
        }
        return Math.min(n + n2, this.T) - n;
    }

    private int P() {
        int n = 0;
        for (class09946 class099462 : this.E) {
            n = Math.max(n, class099462.y() + this.u(class099462.u()));
        }
        return n;
    }

    private void T() {
        this.b = 0;
        this.j = 0;
        this.T = this.B;
        this.W.clear();
        this.v();
    }

    public class09723(class09940 class099402, int n, int n2) {
        this(class099402, n, n2, 0, 1);
    }

    public class09723(class09940 class099402, int n, int n2, int n3, int n4) {
        this.u = Objects.requireNonNull(class099402, "format");
        if (n <= 0) {
            throw new IllegalArgumentException("maxWidth must be > 0");
        }
        if (n2 <= 0) {
            throw new IllegalArgumentException("maxHeight must be > 0");
        }
        if (n3 < 0) {
            throw new IllegalArgumentException("padding must be >= 0");
        }
        if (n4 <= 0) {
            throw new IllegalArgumentException("minHeight must be > 0");
        }
        if (n4 > n2) {
            throw new IllegalArgumentException("minHeight must be <= maxHeight");
        }
        this.i = n;
        this.R = n2;
        this.M = n3;
        this.B = n4;
        this.Z = class099402.N();
        this.z = class09723.N(n, this.Z, "maxWidth * bytesPerPixel");
        this.U = new byte[class09723.N((long)this.z * (long)n2, "atlas pixel buffer is too large")];
        this.T = n4;
    }

    public class09723(class09940 class099402, int n, int n2, int n3) {
        this(class099402, n, n2, n3, 1);
    }

    private class09711 B(int n, int n2) {
        return new class09711(this.L(n), this.u(n2));
    }

    public boolean B() {
        return this.P.N();
    }

    public class09960[] Z() {
        return this.P.y();
    }

    private void i(int n, int n2) {
        if (n2 > n) {
            this.u(n, n2 - n);
        }
    }

    public int i() {
        return this.R;
    }

    private void i(int n) {
        if (this.s == null || this.s.length < n) {
            this.s = new byte[n];
        }
    }

    private class09722 i(int n, int n2, int n3, int n4) {
        class09711 class097112 = this.B(n3, n4);
        return new class09722(n, n2, n3, n4, class097112.N(), class097112.y());
    }

    private class09760 b() {
        return new class09760(this.b, this.j, this.T, this.v, this.n, this.t, new ArrayList<class09756>(this.W));
    }

    private void s() {
        this.b = this.m();
        this.j = this.P();
        this.T = this.y(this.b);
    }

    private int m() {
        int n = 0;
        for (class09946 class099462 : this.E) {
            n = Math.max(n, class099462.y() + class099462.u());
        }
        return n;
    }

    private void v() {
        this.v = 0;
        this.n = this.j;
        this.t = 0;
    }

    private void j() {
        this.P.N(0, 0, this.i, this.T);
    }

    public class09960[] U() {
        if (this.W.isEmpty()) {
            return L;
        }
        class09960[] class09960Array = new class09960[this.W.size()];
        int n = 0;
        for (int i = 0; i < this.W.size(); ++i) {
            class09756 class097562 = this.W.get(i);
            int n2 = this.M(class097562.y, class097562.u);
            if (n2 <= 0) continue;
            class09960Array[n++] = new class09960(class097562.N, class097562.y, class097562.L, n2);
        }
        if (n == 0) {
            return L;
        }
        if (n != class09960Array.length) {
            class09960Array = Arrays.copyOf(class09960Array, n);
        }
        return class09960Array;
    }

    public class09960[] z() {
        return this.P.L();
    }

    private class09722 u(class09946 class099462) {
        return this.i(class099462.N(), class099462.y(), class099462.L(), class099462.u());
    }

    private void u(int n, int n2) {
        if (n2 <= 0) {
            return;
        }
        Arrays.fill(this.U, this.R(n), this.R(n + n2), (byte)0);
    }

    public int u() {
        return this.i;
    }

    private void u(int n, int n2, int n3, int n4) {
        if (n3 <= 0 || n4 <= 0 || this.W.isEmpty()) {
            return;
        }
        int n5 = n + n3;
        int n6 = n2 + n4;
        ArrayList<class09756> arrayList = new ArrayList<class09756>(this.W);
        this.W.clear();
        for (int i = 0; i < arrayList.size(); ++i) {
            class09756 class097562 = arrayList.get(i);
            int n7 = Math.max(class097562.N, n);
            int n8 = Math.max(class097562.y, n2);
            int n9 = Math.min(class097562.N(), n5);
            int n10 = Math.min(class097562.y(), n6);
            if (n7 >= n9 || n8 >= n10) {
                this.L(class097562.N, class097562.y, class097562.L, class097562.u);
                continue;
            }
            this.L(class097562.N, class097562.y, class097562.L, n8 - class097562.y);
            this.L(class097562.N, n10, class097562.L, class097562.y() - n10);
            this.L(class097562.N, n8, n7 - class097562.N, n10 - n8);
            this.L(n9, n8, class097562.N() - n9, n10 - n8);
        }
    }

    private int u(int n) {
        return class09723.N((long)n + (long)this.M, "padded height is too large");
    }

    public int y() {
        return this.i;
    }

    private int y(int n) {
        if (n <= 0) {
            return this.B;
        }
        if (n <= this.B) {
            return this.B;
        }
        return Math.min(class09941.N((int)n), this.R);
    }

    private static boolean y(class09756 class097562, class09756 class097563) {
        return class097562.y == class097563.y && class097562.u == class097563.u && class097562.N <= class097563.N() && class097563.N <= class097562.N() || class097562.N == class097563.N && class097562.L == class097563.L && class097562.y <= class097563.y() && class097563.y <= class097562.y();
    }

    private void y(class09946 class099462, byte[] byArray, int n, int n2) {
        int n3 = this.T;
        int n4 = class099462.N();
        int n5 = class099462.y();
        class09722 class097222 = this.u(class099462);
        class09722 class097223 = this.i(n4, n5, n, n2);
        this.N(n4, n5, class097222.i(), class097222.R());
        this.N(byArray, n4, n5, n, n2);
        class099462.N(n4, n5, n, n2);
        this.L(n4 + class097223.i(), n5, class097222.i() - class097223.i(), class097222.R());
        this.L(n4, n5 + class097223.R(), class097223.i(), class097222.R() - class097223.R());
        this.s();
        this.v();
        this.N(n3, n4, n5, class097222.i(), class097222.R());
    }

    private void y(int n, int n2, int n3, int n4, int n5) {
        if (this.T != n) {
            this.j();
            return;
        }
        this.y(n2, n3, n4, n5);
    }

    private void y(byte[] byArray, int n, int n2) {
        Objects.requireNonNull(byArray, "bytes");
        if (n <= 0) {
            throw new IllegalArgumentException("width must be > 0");
        }
        if (n2 <= 0) {
            throw new IllegalArgumentException("height must be > 0");
        }
        if (n > this.i) {
            throw new IllegalArgumentException("width exceeds atlas maxWidth");
        }
        if (n2 > this.R) {
            throw new IllegalArgumentException("height exceeds atlas maxHeight");
        }
        int n3 = class09723.N((long)n * (long)n2 * (long)this.Z, "texture byte array is too large");
        if (byArray.length != n3) {
            throw new IllegalArgumentException("Expected " + n3 + " bytes but got " + byArray.length);
        }
    }

    private void y(int n, int n2, int n3, int n4) {
        int n5 = this.M(n2, n4);
        if (n5 <= 0) {
            return;
        }
        this.P.N(n, n2, n3, n5);
    }

    private int y(class09946 class099462) {
        int n = this.E.indexOf(class099462);
        if (n < 0) {
            throw new IllegalStateException("Texture handle is not registered in the atlas");
        }
        return n;
    }

    private class09727 y(int n, int n2) {
        class09711 class097112 = this.B(n, n2);
        int n3 = this.v;
        int n4 = this.n;
        int n5 = this.t;
        if (n3 + class097112.N() > this.i) {
            n3 = 0;
            n4 += n5;
            n5 = 0;
        }
        if (n4 + class097112.y() > this.R) {
            return null;
        }
        if (!this.E.isEmpty() && n4 + n2 > this.T) {
            return null;
        }
        int n6 = Math.max(this.b, n4 + n2);
        int n7 = this.y(n6);
        return new class09727(n3, n4, class097112.N(), class097112.y(), n7, Math.max(n5, class097112.y()), true);
    }

    public void E() {
        this.P.u();
    }

    private static int N(int n, int n2, String string) {
        return class09723.N((long)n * (long)n2, string);
    }

    private static int N(long l, String string) {
        if (l < 0L || l > Integer.MAX_VALUE) {
            throw new IllegalArgumentException(string);
        }
        return (int)l;
    }

    private void N(class09727 class097272) {
        if (class097272.M()) {
            this.v = class097272.N() + class097272.L();
            this.n = class097272.y();
            this.t = class097272.R();
            return;
        }
        this.v();
    }

    public class09946 N(byte[] byArray, int n, int n2) {
        this.y(byArray, n, n2);
        class09946 class099462 = new class09946(this);
        class09727 class097272 = this.N(n, n2);
        if (class097272 != null) {
            this.N(class099462, byArray, n, n2, class097272);
            return class099462;
        }
        if (!this.N(class099462, byArray, n, n2, false)) {
            throw new IllegalStateException("Texture does not fit into the atlas");
        }
        return class099462;
    }

    public boolean N(class09946 class099462) {
        class09946 class099463 = this.L(class099462);
        if (!class099463.i()) {
            return false;
        }
        if (!this.E.remove(class099463)) {
            return false;
        }
        class09722 class097222 = this.u(class099463);
        int n = this.T;
        this.N(class097222.N(), class097222.y(), class097222.i(), class097222.R());
        class099463.U();
        if (this.E.isEmpty()) {
            this.T();
        } else {
            this.s();
            this.L(class097222.N(), class097222.y(), class097222.i(), class097222.R());
            this.v();
        }
        this.N(n, class097222.N(), class097222.y(), class097222.i(), class097222.R());
        return true;
    }

    public class09940 N() {
        return this.u;
    }

    public class09946 N(class09946 class099462, byte[] byArray, int n, int n2) {
        class09946 class099463 = this.L(class099462);
        if (!class099463.i()) {
            throw new IllegalStateException("Texture handle is not alive");
        }
        this.y(byArray, n, n2);
        if (class099463.L() == n && class099463.u() == n2) {
            this.N(byArray, class099463.N(), class099463.y(), n, n2);
            this.P.N(class099463.N(), class099463.y(), n, n2);
            return class099463;
        }
        if (n <= class099463.L() && n2 <= class099463.u()) {
            this.y(class099463, byArray, n, n2);
            return class099463;
        }
        if (!this.L(class099463, byArray, n, n2)) {
            throw new IllegalStateException("Updated texture does not fit into the atlas");
        }
        return class099463;
    }

    private void N(class09946 class099462, byte[] byArray, class09722 class097222, class09727 class097272) {
        this.N(class097222.N(), class097222.y(), class097222.i(), class097222.R());
        this.N(byArray, class097222.N(), class097222.y(), class097222.L(), class097222.u());
        if (class097272.M()) {
            this.u(class097222.N(), class097222.y(), class097222.i(), class097222.R());
        }
        class099462.N(class097222.N(), class097222.y(), class097222.L(), class097222.u());
        this.b = Math.max(this.b, class097222.M());
        this.j = Math.max(this.j, class097222.B());
        this.T = class097272.i();
        this.N(class097272);
    }

    private void N(byte[] byArray, int n, int n2, int n3, int n4) {
        int n5 = class09723.N(n3, this.Z, "texture row is too large");
        for (int i = 0; i < n4; ++i) {
            int n6 = i * n5;
            int n7 = this.R(n, n2 + i);
            System.arraycopy(byArray, n6, this.U, n7, n5);
        }
    }

    private void N(byte[] byArray, int n, int n2, int n3, int n4, byte[] byArray2, int n5, int n6) {
        int n7 = class09723.N(n3, this.Z, "texture row is too large");
        for (int i = 0; i < n4; ++i) {
            int n8 = this.R(n, n2 + i);
            int n9 = this.R(n5, n6 + i);
            System.arraycopy(byArray, n8, byArray2, n9, n7);
        }
    }

    private void N(int n, int n2, int n3, int n4) {
        int n5 = class09723.N(n3, this.Z, "texture row is too large");
        for (int i = 0; i < n4; ++i) {
            int n6 = this.R(n, n2 + i);
            Arrays.fill(this.U, n6, n6 + n5, (byte)0);
        }
    }

    private class09727 N(int n, int n2) {
        class09727 class097272 = this.L(n, n2);
        if (class097272 != null) {
            return class097272;
        }
        return this.y(n, n2);
    }

    private boolean N(class09946 class099462, byte[] byArray, int n, int n2, boolean bl) {
        class09744 class097442 = this.N(class099462, n, n2, bl);
        if (class097442 == null) {
            return false;
        }
        this.N(class097442, class099462, byArray, n, n2, bl);
        return true;
    }

    private class09744 N(class09946 class099462, int n, int n2, boolean bl) {
        int n3 = this.T;
        class09744 class097442;
        while ((class097442 = this.N(class099462, n, n2, bl, n3)) == null) {
            int n4 = this.N(n3);
            if (n4 <= n3) {
                return null;
            }
            n3 = n4;
        }
        return class097442;
    }

    private class09744 N(class09946 class099462, int n, int n2, boolean bl, int n3) {
        int n4;
        int n5 = class099462 != null && !bl ? 1 : 0;
        int n6 = this.E.size() + n5;
        if (n6 == 0) {
            return class09744.B;
        }
        class09946[] class09946Array = new class09946[n6];
        int[] nArray = new int[n6];
        int[] nArray2 = new int[n6];
        int[] nArray3 = new int[n6];
        int[] nArray4 = new int[n6];
        int[] nArray5 = new int[n6];
        boolean[] blArray = new boolean[n6];
        int n7 = 0;
        Iterator<class09946> var16 = this.E.iterator();
        while (var16.hasNext()) {
            class09946 class099463;
            class09946Array[n7] = class099463 = var16.next();
            nArray[n7] = n7;
            if (class099463 == class099462 && bl) {
                nArray2[n7] = this.L(n);
                nArray3[n7] = this.u(n2);
            } else {
                nArray2[n7] = this.L(class099463.L());
                nArray3[n7] = this.u(class099463.u());
            }
            ++n7;
        }
        if (class099462 != null && !bl) {
            class09946Array[n7] = class099462;
            nArray[n7] = n7;
            nArray2[n7] = this.L(n);
            nArray3[n7] = this.u(n2);
        }
        this.m.N(this.i, n3, this.i);
        this.m.N(1);
        if (!this.m.N(nArray, nArray2, nArray3, nArray4, nArray5, blArray, n6)) {
            return null;
        }
        int n8 = 0;
        int n9 = 0;
        for (n4 = 0; n4 < n6; ++n4) {
            class09946 class099464 = class09946Array[n4];
            int n10 = class099464 == class099462 ? n2 : class099464.u();
            n8 = Math.max(n8, nArray5[n4] + n10);
            n9 = Math.max(n9, nArray5[n4] + nArray3[n4]);
        }
        if (n9 > n3) {
            return null;
        }
        n4 = this.y(n8);
        return new class09744(class09946Array, nArray4, nArray5, n6, n8, n9, n4);
    }

    private void N(class09744 class097442, class09946 class099462, byte[] byArray, int n, int n2, boolean bl) {
        int n3 = this.T;
        int n4 = this.R(n3);
        this.i(n4);
        if (n4 > 0) {
            System.arraycopy(this.U, 0, this.s, 0, n4);
        }
        int n5 = Math.max(n3, class097442.M());
        Arrays.fill(this.U, 0, this.R(n5), (byte)0);
        for (int i = 0; i < class097442.u(); ++i) {
            int n6;
            class09946 class099463 = class097442.N()[i];
            int n7 = class097442.y()[i];
            int n8 = class097442.L()[i];
            int n9 = class099463 == class099462 ? n : class099463.L();
            int n10 = n6 = class099463 == class099462 ? n2 : class099463.u();
            if (class099463 == class099462) {
                this.N(byArray, n7, n8, n9, n6);
            } else {
                this.N(this.s, class099463.N(), class099463.y(), n9, n6, this.U, n7, n8);
            }
            class099463.N(n7, n8, n9, n6);
        }
        if (class099462 != null && !bl) {
            this.E.add(class099462);
        }
        this.b = class097442.i();
        this.j = class097442.R();
        this.T = class097442.M();
        this.W.clear();
        this.v();
        this.j();
    }

    private void N(int n, int n2, int n3, int n4, int n5) {
        if (this.T < n) {
            this.u(this.T, n - this.T);
            this.j();
            return;
        }
        this.y(n2, n3, n4, n5);
    }

    private int N(int n) {
        if (n >= this.R) {
            return n;
        }
        return Math.min(class09941.N((int)(n + 1)), this.R);
    }

    private void N(class09946 class099462, byte[] byArray, int n, int n2, class09727 class097272) {
        int n3 = this.T;
        class09722 class097222 = this.i(class097272.N(), class097272.y(), n, n2);
        this.i(n3, class097272.i());
        this.N(class099462, byArray, class097222, class097272);
        this.E.add(class099462);
        this.y(n3, class097222.N(), class097222.y(), n, n2);
    }

    private static boolean N(class09756 class097562, class09756 class097563) {
        return class097562.N <= class097563.N && class097562.y <= class097563.y && class097562.N() >= class097563.N() && class097562.y() >= class097563.y();
    }

    private void N(class09946 class099462, int n, byte[] byArray, int n2, int n3, class09722 class097222, class09727 class097272, int n4) {
        class09722 class097223 = this.i(class097272.N(), class097272.y(), n2, n3);
        int n5 = this.T;
        this.i(n5, class097272.i());
        this.N(class097222.N(), class097222.y(), class097222.i(), class097222.R());
        this.N(class099462, byArray, class097223, class097272);
        this.E.add(Math.min(n, this.E.size()), class099462);
        if (this.T < n4) {
            this.u(this.T, n4 - this.T);
        }
        if (this.T != n4) {
            this.j();
        } else {
            this.y(class097222.N(), class097222.y(), class097222.i(), class097222.R());
            this.y(class097223.N(), class097223.y(), class097223.i(), class097223.R());
        }
    }

    private void N(class09946 class099462, int n, class09760 class097602) {
        this.E.add(Math.min(n, this.E.size()), class099462);
        this.W.clear();
        this.W.addAll(class097602.M());
        this.b = class097602.N();
        this.j = class097602.y();
        this.T = class097602.L();
        this.v = class097602.u();
        this.n = class097602.i();
        this.t = class097602.R();
    }

    public void W() {
        if (this.E.isEmpty()) {
            return;
        }
        if (!this.N(null, null, 0, 0, false)) {
            throw new IllegalStateException("Active textures do not fit into the atlas");
        }
    }

    private int R(int n) {
        return class09723.N((long)n * (long)this.z, "row byte count is too large");
    }

    public int R() {
        return this.M;
    }

    private int R(int n, int n2) {
        return n2 * this.z + n * this.Z;
    }
}

