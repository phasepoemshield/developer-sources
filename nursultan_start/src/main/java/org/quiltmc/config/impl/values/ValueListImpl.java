/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.values.ComplexConfigValue
 *  org.quiltmc.config.api.values.CompoundConfigValue
 *  org.quiltmc.config.api.values.TrackedValue
 */
package org.quiltmc.config.impl.values;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.UnaryOperator;
import org.quiltmc.config.api.values.ComplexConfigValue;
import org.quiltmc.config.api.values.CompoundConfigValue;
import org.quiltmc.config.api.values.TrackedValue;
import org.quiltmc.config.api.values.ValueList;
import org.quiltmc.config.impl.tree.TrackedValueImpl;
import org.quiltmc.config.impl.values.ValueMapImpl;

public final class ValueListImpl
implements CompoundConfigValue,
ValueList {
    private final Object defaultValue;
    private final List values;
    private TrackedValueImpl configValue;

    public ValueListImpl(Object object, List list) {
        this.defaultValue = object;
        this.values = list;
    }

    @Override
    public boolean remove(Object object) {
        boolean bl = this.values.remove(object);
        if (bl) {
            this.configValue.serializeAndInvokeCallbacks();
        }
        return bl;
    }

    public Object remove(int n) {
        Object e = this.values.remove(n);
        this.configValue.serializeAndInvokeCallbacks();
        return e;
    }

    @Override
    public int size() {
        return this.values.size();
    }

    public Object get(int n) {
        return this.values.get(n);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof ValueListImpl) {
            object = (ValueListImpl)object;
            return ((ValueListImpl)object).defaultValue.equals(this.defaultValue) && ((ValueListImpl)object).values.equals(this.values);
        }
        return false;
    }

    public Iterable values() {
        return this;
    }

    @Override
    public int hashCode() {
        return this.values.hashCode();
    }

    @Override
    public int indexOf(Object object) {
        return this.values.indexOf(object);
    }

    @Override
    public void clear() {
        if (this.isEmpty()) {
            this.values.clear();
        } else {
            ValueListImpl valueListImpl = this;
            valueListImpl.values.clear();
            valueListImpl.configValue.serializeAndInvokeCallbacks();
        }
    }

    @Override
    public int lastIndexOf(Object object) {
        return this.values.lastIndexOf(object);
    }

    @Override
    public boolean isEmpty() {
        return this.values.isEmpty();
    }

    public void replaceAll(UnaryOperator unaryOperator) {
        ValueListImpl valueListImpl = this;
        valueListImpl.values.replaceAll(unaryOperator);
        valueListImpl.configValue.serializeAndInvokeCallbacks();
    }

    @Override
    public boolean add(Object object) {
        ValueListImpl valueListImpl = this;
        valueListImpl.values.add(object);
        valueListImpl.configValue.serializeAndInvokeCallbacks();
        return true;
    }

    public void add(int n, Object object) {
        ValueListImpl valueListImpl = this;
        valueListImpl.values.add(n, object);
        valueListImpl.configValue.serializeAndInvokeCallbacks();
    }

    public List subList(int n, int n2) {
        return this.values.subList(n, n2);
    }

    @Override
    public Object[] toArray() {
        return this.values.toArray();
    }

    @Override
    public Object[] toArray(Object[] objectArray) {
        return this.values.toArray(objectArray);
    }

    @Override
    public Iterator iterator() {
        return this.values.iterator();
    }

    @Override
    public boolean contains(Object object) {
        return this.values.contains(object);
    }

    @Override
    public Spliterator spliterator() {
        return this.values.spliterator();
    }

    @Override
    public boolean addAll(Collection collection) {
        boolean bl = this.values.addAll(collection);
        if (bl) {
            this.configValue.serializeAndInvokeCallbacks();
        }
        return bl;
    }

    public boolean addAll(int n, Collection collection) {
        boolean bl = this.values.addAll(n, collection);
        n = bl ? 1 : 0;
        if (bl) {
            this.configValue.serializeAndInvokeCallbacks();
        }
        return n != 0;
    }

    public Object set(int n, Object object) {
        Object object2 = this.values.set(n, object);
        if (object instanceof ComplexConfigValue) {
            ((ComplexConfigValue)object).setValue((TrackedValue)this.configValue);
        }
        if (object2 != null && object != null && !object2.equals(object) || object2 != null && object == null || object2 == null && object != null) {
            this.configValue.serializeAndInvokeCallbacks();
        }
        return object2;
    }

    public void sort(Comparator comparator) {
        ValueListImpl valueListImpl = this;
        valueListImpl.values.sort(comparator);
        valueListImpl.configValue.serializeAndInvokeCallbacks();
    }

    public void setValue(TrackedValue trackedValue) {
        ((ValueListImpl)((Object)iterator)).configValue = (TrackedValueImpl)trackedValue;
        if (((ValueListImpl)((Object)iterator)).defaultValue instanceof ComplexConfigValue) {
            Iterator iterator = ((ValueListImpl)((Object)iterator)).values.iterator();
            while (iterator.hasNext()) {
                ((ComplexConfigValue)iterator.next()).setValue(trackedValue);
            }
        }
    }

    public Class getType() {
        return this.defaultValue.getClass();
    }

    public ValueList copy() {
        ArrayList<Object> arrayList;
        ArrayList<Object> arrayList2 = arrayList;
        arrayList = new ArrayList<Object>(this.values.size());
        for (Object e : this.values) {
            if (e instanceof CompoundConfigValue) {
                arrayList2.add(((CompoundConfigValue)e).copy());
                continue;
            }
            arrayList2.add(e);
        }
        ValueListImpl valueListImpl = new ValueListImpl(this.defaultValue, arrayList2);
        valueListImpl.setValue(this.configValue);
        return valueListImpl;
    }

    public Object getDefaultValue() {
        return this.defaultValue;
    }

    public void grow() {
        Object object = this.defaultValue;
        if (object instanceof ValueListImpl) {
            this.values.add(((ValueListImpl)object).copy());
        } else if (object instanceof ValueMapImpl) {
            this.values.add(((ValueMapImpl)object).copy());
        } else {
            this.values.add(object);
        }
    }

    @Override
    public boolean removeAll(Collection collection) {
        boolean bl = this.values.removeAll(collection);
        if (bl) {
            this.configValue.serializeAndInvokeCallbacks();
        }
        return bl;
    }

    @Override
    public boolean retainAll(Collection collection) {
        boolean bl = this.values.retainAll(collection);
        if (bl) {
            this.configValue.serializeAndInvokeCallbacks();
        }
        return bl;
    }

    public ListIterator listIterator(int n) {
        return this.values.listIterator(n);
    }

    public ListIterator listIterator() {
        return this.values.listIterator();
    }

    @Override
    public boolean containsAll(Collection collection) {
        return new HashSet(this.values).containsAll(collection);
    }
}

