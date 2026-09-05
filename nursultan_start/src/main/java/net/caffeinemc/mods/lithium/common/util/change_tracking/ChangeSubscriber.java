/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  minecraft.class06584
 */
package net.caffeinemc.mods.lithium.common.util.change_tracking;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.ArrayList;
import minecraft.class06584;
import net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber$Multi;

public interface ChangeSubscriber<T> {
    public static <T> ChangeSubscriber<T> combine(ChangeSubscriber<T> changeSubscriber, int n, ChangeSubscriber<T> changeSubscriber2, int n2) {
        if (changeSubscriber == null) {
            return changeSubscriber2;
        }
        if (changeSubscriber instanceof ChangeSubscriber$Multi) {
            ArrayList arrayList = new ArrayList(((ChangeSubscriber$Multi)changeSubscriber).subscribers);
            IntArrayList intArrayList = new IntArrayList((IntList)((ChangeSubscriber$Multi)changeSubscriber).subscriberDatas);
            arrayList.add(changeSubscriber2);
            intArrayList.add(n2);
            return new ChangeSubscriber$Multi(arrayList, intArrayList);
        }
        ArrayList arrayList = new ArrayList();
        IntArrayList intArrayList = new IntArrayList();
        arrayList.add(changeSubscriber);
        intArrayList.add(n);
        arrayList.add(changeSubscriber2);
        intArrayList.add(n2);
        return new ChangeSubscriber$Multi(arrayList, intArrayList);
    }

    public static int dataOf(ChangeSubscriber<?> changeSubscriber, ChangeSubscriber<?> changeSubscriber2, int n) {
        int n2;
        if (changeSubscriber instanceof ChangeSubscriber$Multi) {
            ChangeSubscriber$Multi changeSubscriber$Multi = (ChangeSubscriber$Multi)changeSubscriber;
            n2 = changeSubscriber$Multi.subscriberDatas.getInt(changeSubscriber$Multi.subscribers.indexOf(changeSubscriber2));
        } else {
            n2 = n;
        }
        return n2;
    }

    public static <T> ChangeSubscriber<T> without(ChangeSubscriber<T> changeSubscriber, ChangeSubscriber<T> changeSubscriber2, int n, boolean bl) {
        if (changeSubscriber == changeSubscriber2) {
            return null;
        }
        if (changeSubscriber instanceof ChangeSubscriber$Multi) {
            ChangeSubscriber$Multi changeSubscriber$Multi = (ChangeSubscriber$Multi)changeSubscriber;
            int n2 = changeSubscriber$Multi.indexOf(changeSubscriber2, n, bl);
            if (n2 != -1) {
                if (changeSubscriber$Multi.subscribers.size() == 2) {
                    return changeSubscriber$Multi.subscribers.get(1 - n2);
                }
                ArrayList arrayList = new ArrayList(changeSubscriber$Multi.subscribers);
                IntArrayList intArrayList = new IntArrayList((IntList)changeSubscriber$Multi.subscriberDatas);
                arrayList.remove(n2);
                intArrayList.removeInt(n2);
                return new ChangeSubscriber$Multi(arrayList, intArrayList);
            }
            return changeSubscriber;
        }
        return changeSubscriber;
    }

    public static <T> ChangeSubscriber<T> without(ChangeSubscriber<T> changeSubscriber, ChangeSubscriber<T> changeSubscriber2) {
        return ChangeSubscriber.without(changeSubscriber, changeSubscriber2, 0, false);
    }

    public void lithium$forceUnsubscribe(T var1, int var2);

    public static <T> int dataWithout(ChangeSubscriber<T> changeSubscriber, ChangeSubscriber<T> changeSubscriber2, int n, int n2, boolean bl) {
        if (changeSubscriber instanceof ChangeSubscriber$Multi) {
            ChangeSubscriber$Multi changeSubscriber$Multi = (ChangeSubscriber$Multi)changeSubscriber;
            int n3 = changeSubscriber$Multi.indexOf(changeSubscriber2, n2, bl);
            if (n3 != -1) {
                if (changeSubscriber$Multi.subscribers.size() == 2) {
                    return changeSubscriber$Multi.subscriberDatas.getInt(1 - n3);
                }
                return n;
            }
            return n;
        }
        return changeSubscriber == changeSubscriber2 ? 0 : n;
    }

    public static <T> int dataWithout(ChangeSubscriber<T> changeSubscriber, ChangeSubscriber<T> changeSubscriber2, int n) {
        return ChangeSubscriber.dataWithout(changeSubscriber, changeSubscriber2, n, 0, false);
    }

    public static boolean containsSubscriber(ChangeSubscriber<class06584> changeSubscriber, int n, ChangeSubscriber<class06584> changeSubscriber2, int n2) {
        if (changeSubscriber instanceof ChangeSubscriber$Multi) {
            ChangeSubscriber$Multi changeSubscriber$Multi = (ChangeSubscriber$Multi)changeSubscriber;
            return changeSubscriber$Multi.indexOf(changeSubscriber2, n2, true) != -1;
        }
        return changeSubscriber == changeSubscriber2 && n == n2;
    }

    public void lithium$notify(T var1, int var2);
}

