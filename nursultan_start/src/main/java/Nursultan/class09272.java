/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11827
 *  Nursultan.class11940
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09279;
import Nursultan.class11827;
import Nursultan.class11940;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public non-sealed class class09272
extends Record
implements class09279 {
    public List<class11827> presets;

    public class09272(List<class11827> list) {
        this.presets = list;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09272.class, "presets", "presets"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09272.class, "presets", "presets"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09272.class, "presets", "presets"}, this);
    }

    @Override
    public void y(class11940 class119402) {
        class119402.y(this.presets.size());
        Iterator<class11827> var2 = this.presets.iterator();
        while (var2.hasNext()) {
            var2.next().N(class119402);
        }
    }

    public static class09272 N(class11940 class119402) {
        int n = class119402.R();
        ArrayList<class11827> arrayList = new ArrayList<class11827>(n);
        for (int i = 0; i < n; ++i) {
            arrayList.add(class11827.y((class11940)class119402));
        }
        return new class09272(arrayList);
    }

    public List<class11827> N() {
        return this.presets;
    }
}

