/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import minecraft.class04480;
import minecraft.class04489;

final class class04510
extends Record {
    private final class04489 element;
    final List<class04480> problems;
    private final Map<class04489, class04510> children;

    public List<class04480> L() {
        return this.problems;
    }

    public class04510(class04489 class044892) {
        this(class044892, new ArrayList<class04480>(), new LinkedHashMap<class04489, class04510>());
    }

    private class04510(class04489 class044892, List<class04480> list, Map<class04489, class04510> map) {
        this.element = class044892;
        this.problems = list;
        this.children = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04510.class, "element;problems;children", "element", "problems", "children"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04510.class, "element;problems;children", "element", "problems", "children"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04510.class, "element;problems;children", "element", "problems", "children"}, this);
    }

    public Map<class04489, class04510> u() {
        return this.children;
    }

    public class04489 y() {
        return this.element;
    }

    public class04510 N(class04489 class044892) {
        return this.children.computeIfAbsent(class044892, class04510::new);
    }

    public List<String> N() {
        int n = this.problems.size();
        int n2 = this.children.size();
        if (n == 0 && n2 == 0) {
            return List.of();
        }
        if (n == 0 && n2 == 1) {
            ArrayList<String> arrayList = new ArrayList<String>();
            this.children.forEach((class044892, class045102) -> arrayList.addAll(class045102.N()));
            arrayList.set(0, this.element.get() + (String)arrayList.get(0));
            return arrayList;
        }
        if (n == 1 && n2 == 0) {
            return List.of(this.element.get() + ": " + ((class04480)this.problems.getFirst()).N());
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        this.children.forEach((class044892, class045102) -> arrayList.addAll(class045102.N()));
        arrayList.replaceAll(string -> "  " + string);
        for (class04480 class044802 : this.problems) {
            arrayList.add("  " + class044802.N());
        }
        arrayList.addFirst(this.element.get() + ":");
        return arrayList;
    }
}

