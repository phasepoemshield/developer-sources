/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 */
package Nursultan;

import Nursultan.class09979;
import Nursultan.class09992;
import Nursultan.class09998;
import Nursultan.class10002;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class class10006 {
    public static final class10006 N = new class10006(null);
    private final List<class09998> y;

    private class10006(List<class09998> list) {
        this.y = list == null || list.isEmpty() ? List.of() : List.copyOf(list);
    }

    public List<class09998> y() {
        return this.y;
    }

    public class10006 N(class10006 class100062) {
        if (class100062 == null || class100062.N()) {
            return this;
        }
        if (this.N()) {
            return class100062;
        }
        ArrayList<class09998> arrayList = new ArrayList<class09998>(this.y.size() + class100062.y.size());
        arrayList.addAll(this.y);
        arrayList.addAll(class100062.y);
        return new class10006(arrayList);
    }

    private static boolean N(class09979 class099792, boolean bl, boolean bl2, boolean bl3) {
        return switch (class099792) {
            default -> throw new MatchException(null, null);
            case class09979.HOVER -> bl;
            case class09979.FOCUS -> bl2;
            case class09979.ACTIVE -> bl3;
        };
    }

    private static boolean N(List<class09992> list, class09992 class099922) {
        Iterator<class09992> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() != class099922) continue;
            return true;
        }
        return false;
    }

    public boolean N() {
        return this.y.isEmpty();
    }

    public class10006 N(class09979 class099792, class09992 class099922, class10002 class100022) {
        if (class099792 == null || class099922 == null || class100022 == null || class100022.N()) {
            return this;
        }
        ArrayList<class09998> arrayList = new ArrayList<class09998>(this.y.size() + 1);
        arrayList.addAll(this.y);
        arrayList.add(new class09998(class099792, class099922, class100022));
        return new class10006(arrayList);
    }

    public boolean N(class09979 class099792) {
        if (class099792 == null || this.N()) {
            return false;
        }
        Iterator<class09998> iterator = this.y.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().N() != class099792) continue;
            return true;
        }
        return false;
    }

    public class10002 N(List<class09992> list, boolean bl, boolean bl2, boolean bl3) {
        if (this.N() || list == null || list.isEmpty()) {
            return class10002.N;
        }
        class10002 class100022 = class10002.N;
        for (class09998 class099982 : this.y) {
            if (!class10006.N(class099982.N(), bl, bl2, bl3) || !class10006.N(list, class099982.y())) continue;
            class100022 = class100022.N(class099982.L());
        }
        return class100022;
    }
}

