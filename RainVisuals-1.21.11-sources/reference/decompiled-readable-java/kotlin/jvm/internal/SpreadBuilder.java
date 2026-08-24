/*
 * Decompiled with CFR 0.152.
 */
package kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class SpreadBuilder {
    private final ArrayList<Object> list;

    public int size() {
        return this.list.size();
    }

    public SpreadBuilder(int size) {
        this.list = new ArrayList(size);
    }

    public Object[] toArray(Object[] a2) {
        return this.list.toArray(a2);
    }

    /*
     * WARNING - void declaration
     */
    public void addSpread(Object container) {
        if (container == null) {
            return;
        }
        if (container instanceof Object[]) {
            Object[] array = (Object[])container;
            if (array.length > 0) {
                this.list.ensureCapacity(this.list.size() + array.length);
                Collections.addAll(this.list, array);
            }
        } else if (container instanceof Collection) {
            this.list.addAll((Collection)container);
        } else if (container instanceof Iterable) {
            Iterator array = ((Iterable)container).iterator();
            while (array.hasNext()) {
                void var3_5;
                Object element = array.next();
                this.list.add(var3_5);
            }
        } else if (container instanceof Iterator) {
            Iterator iterator2 = (Iterator)container;
            while (iterator2.hasNext()) {
                this.list.add(iterator2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + container.getClass());
        }
    }

    public void add(Object element) {
        this.list.add(element);
    }
}

