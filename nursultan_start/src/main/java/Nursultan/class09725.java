/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09714;
import Nursultan.class09729;
import Nursultan.class09732;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class class09725
extends Record
implements class09729 {
    private final class09732 cov;
    private final class09714 c1;
    private final class09714 c2;
    private final int[][] adv;

    public class09714 L() {
        return this.c2;
    }

    class09725(class09732 class097322, class09714 class097142, class09714 class097143, int[][] nArray) {
        this.cov = class097322;
        this.c1 = class097142;
        this.c2 = class097143;
        this.adv = nArray;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09725.class, "cov;c1;c2;adv", "cov", "c1", "c2", "adv"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09725.class, "cov;c1;c2;adv", "cov", "c1", "c2", "adv"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09725.class, "cov;c1;c2;adv", "cov", "c1", "c2", "adv"}, this);
    }

    public int[][] u() {
        return this.adv;
    }

    public class09714 y() {
        return this.c1;
    }

    @Override
    public int N(int n, int n2) {
        if (!this.cov.N(n)) {
            return Integer.MIN_VALUE;
        }
        int n3 = this.c1.N(n);
        int n4 = this.c2.N(n2);
        return n3 < this.adv.length && n4 < this.adv[n3].length ? this.adv[n3][n4] : 0;
    }

    public class09732 N() {
        return this.cov;
    }
}

