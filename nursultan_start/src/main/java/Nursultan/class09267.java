/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10732
 *  Nursultan.class11940
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09260;
import Nursultan.class10732;
import Nursultan.class11940;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public non-sealed class class09267
extends Record
implements class09260 {
    public List<class10732> entries;

    public class09267(List<class10732> list) {
        this.entries = list;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09267.class, "entries", "entries"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09267.class, "entries", "entries"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09267.class, "entries", "entries"}, this);
    }

    public static class09267 y(class11940 class119402) {
        int n = class119402.R();
        ArrayList<class10732> arrayList = new ArrayList<class10732>(n);
        for (int i = 0; i < n; ++i) {
            arrayList.add(class10732.y((class11940)class119402));
        }
        return new class09267(arrayList);
    }

    public List<class10732> N() {
        return this.entries;
    }

    @Override
    public void N(class11940 class119402) {
        class119402.y(this.entries.size());
        Iterator<class10732> var2 = this.entries.iterator();
        while (var2.hasNext()) {
            var2.next().N(class119402);
        }
    }
}

