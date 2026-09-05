/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class08501
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.List;
import minecraft.class02315;
import minecraft.class02325;
import minecraft.class02328;
import minecraft.class02332;
import minecraft.class02353;
import minecraft.class08501;

public final class class02358<S, T>
extends Record
implements class02315<S> {
    private final class08501<S, T> element;
    private final class02353<List<T>> listName;
    private final int minRepetitions;

    public class02358(class08501<S, T> class085012, class02353<List<T>> class023532, int n) {
        this.element = class085012;
        this.listName = class023532;
        this.minRepetitions = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02358.class, "element;listName;minRepetitions", "element", "listName", "minRepetitions"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02358.class, "element;listName;minRepetitions", "element", "listName", "minRepetitions"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02358.class, "element;listName;minRepetitions", "element", "listName", "minRepetitions"}, this);
    }

    public int i() {
        return this.minRepetitions;
    }

    public class02353<List<T>> y() {
        return this.listName;
    }

    @Override
    public boolean N(class02325<S> class023252, class02332 class023322, class02328 class023282) {
        int n;
        int n2 = class023252.M();
        ArrayList<T> arrayList = new ArrayList<T>(this.minRepetitions);
        while (true) {
            n = class023252.M();
            T t = class023252.N(this.element);
            if (t == null) break;
            arrayList.add(t);
        }
        class023252.N(n);
        if (arrayList.size() < this.minRepetitions) {
            class023252.N(n2);
            return false;
        }
        class023322.N(this.listName, arrayList);
        return true;
    }

    public class08501<S, T> N() {
        return this.element;
    }
}

