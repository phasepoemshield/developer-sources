/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 */
package net.caffeinemc.mods.lithium.common.util.change_tracking;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.ArrayList;
import net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber;
import net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber$CountChangeSubscriber;
import net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber$EnchantmentSubscriber;

public class ChangeSubscriber$Multi<T>
implements ChangeSubscriber$CountChangeSubscriber<T>,
ChangeSubscriber$EnchantmentSubscriber<T> {
    final ArrayList<ChangeSubscriber<T>> subscribers;
    final IntArrayList subscriberDatas;

    public ChangeSubscriber$Multi(ArrayList<ChangeSubscriber<T>> arrayList, IntArrayList intArrayList) {
        this.subscribers = arrayList;
        this.subscriberDatas = intArrayList;
    }

    int indexOf(ChangeSubscriber<T> changeSubscriber, int n, boolean bl) {
        if (!bl) {
            return this.subscribers.indexOf(changeSubscriber);
        }
        for (int i = 0; i < this.subscribers.size(); ++i) {
            if (this.subscribers.get(i) != changeSubscriber || this.subscriberDatas.getInt(i) != n) continue;
            return i;
        }
        return -1;
    }

    @Override
    public void lithium$notifyCount(T t, int n, int n2) {
        ArrayList<ChangeSubscriber<T>> arrayList = this.subscribers;
        for (int i = 0; i < arrayList.size(); ++i) {
            ChangeSubscriber<T> changeSubscriber = arrayList.get(i);
            if (!(changeSubscriber instanceof ChangeSubscriber$CountChangeSubscriber)) continue;
            ChangeSubscriber$CountChangeSubscriber changeSubscriber$CountChangeSubscriber = (ChangeSubscriber$CountChangeSubscriber)changeSubscriber;
            changeSubscriber$CountChangeSubscriber.lithium$notifyCount(t, this.subscriberDatas.getInt(i), n2);
        }
    }

    @Override
    public void lithium$forceUnsubscribe(T t, int n) {
        ArrayList<ChangeSubscriber<T>> arrayList = this.subscribers;
        for (int i = 0; i < arrayList.size(); ++i) {
            ChangeSubscriber<T> changeSubscriber = arrayList.get(i);
            changeSubscriber.lithium$forceUnsubscribe(t, this.subscriberDatas.getInt(i));
        }
    }

    @Override
    public void lithium$notify(T t, int n) {
        ArrayList<ChangeSubscriber<T>> arrayList = this.subscribers;
        for (int i = 0; i < arrayList.size(); ++i) {
            ChangeSubscriber<T> changeSubscriber = arrayList.get(i);
            changeSubscriber.lithium$notify(t, this.subscriberDatas.getInt(i));
        }
    }

    @Override
    public void lithium$notifyAfterEnchantmentChange(T t, int n) {
        ArrayList<ChangeSubscriber<T>> arrayList = this.subscribers;
        for (int i = 0; i < arrayList.size(); ++i) {
            ChangeSubscriber<T> changeSubscriber = arrayList.get(i);
            if (!(changeSubscriber instanceof ChangeSubscriber$EnchantmentSubscriber)) continue;
            ChangeSubscriber$EnchantmentSubscriber changeSubscriber$EnchantmentSubscriber = (ChangeSubscriber$EnchantmentSubscriber)changeSubscriber;
            changeSubscriber$EnchantmentSubscriber.lithium$notifyAfterEnchantmentChange(t, this.subscriberDatas.getInt(i));
        }
    }
}

