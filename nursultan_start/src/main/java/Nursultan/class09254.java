/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11789
 *  Nursultan.class11940
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09282;
import Nursultan.class11789;
import Nursultan.class11940;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public non-sealed class class09254
extends Record
implements class09282 {
    public List<class11789> shares;

    public class09254(List<class11789> list) {
        this.shares = list;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09254.class, "shares", "shares"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09254.class, "shares", "shares"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09254.class, "shares", "shares"}, this);
    }

    public static class09254 y(class11940 class119402) {
        int n = class119402.R();
        ArrayList<class11789> arrayList = new ArrayList<class11789>(n);
        for (int i = 0; i < n; ++i) {
            arrayList.add(class11789.N((class11940)class119402));
        }
        return new class09254(arrayList);
    }

    @Override
    public void N(class11940 class119402) {
        class119402.y(this.shares.size());
        Iterator<class11789> var2 = this.shares.iterator();
        while (var2.hasNext()) {
            var2.next().y(class119402);
        }
    }

    public List<class11789> N() {
        return this.shares;
    }
}

