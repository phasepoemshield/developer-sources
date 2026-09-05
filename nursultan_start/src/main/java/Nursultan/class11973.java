/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class11959;
import Nursultan.class11989;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Consumer;

public class class11973 {
    public Object N_0;
    public Object N_1;

    public class11973() {
        this.i();
        this.N_0 = new Object[0];
        this.N_1 = new ConcurrentLinkedQueue();
    }

    private void i() {
    }

    public void y() {
        ((Queue)this.N_1).clear();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void N(class11959 class119592, Consumer<class11989> consumer) {
        Object object = this.N_0;
        synchronized (object) {
            class11989 class119892;
            if (class119592 == null || ((Queue)this.N_1).isEmpty()) {
                return;
            }
            ArrayList<class11989> arrayList = null;
            while ((class119892 = (class11989)((Object)((Queue)this.N_1).poll())) != null) {
                if (class119892.y() == class119592) {
                    consumer.accept(class119892);
                    continue;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<class11989>();
                }
                arrayList.add(class119892);
            }
            if (arrayList != null) {
                ((Queue)this.N_1).addAll(arrayList);
            }
        }
    }

    public boolean N() {
        return ((Queue)this.N_1).isEmpty();
    }

    public void N(class11989 class119892) {
        ((Queue)this.N_1).add(class119892);
    }
}

