/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.values.ComplexConfigValue
 *  org.quiltmc.config.api.values.CompoundConfigValue
 *  org.quiltmc.config.api.values.TrackedValue
 */
package org.quiltmc.config.impl.values;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.quiltmc.config.api.values.ComplexConfigValue;
import org.quiltmc.config.api.values.CompoundConfigValue;
import org.quiltmc.config.api.values.TrackedValue;
import org.quiltmc.config.api.values.ValueMap;
import org.quiltmc.config.impl.tree.TrackedValueImpl;
import org.quiltmc.config.impl.values.ValueListImpl;

public final class ValueMapImpl
implements CompoundConfigValue,
ValueMap {
    private final Object defaultValue;
    private final Map values;
    private TrackedValueImpl configValue;

    public ValueMapImpl(Object object, Map map) {
        this.defaultValue = object;
        this.values = map;
    }

    public Object remove(Object object) {
        Object v = this.values.remove(object);
        this.configValue.serializeAndInvokeCallbacks();
        return v;
    }

    @Override
    public int size() {
        return this.values.size();
    }

    public Object get(Object object) {
        return this.values.get(object);
    }

    public Object put(String object, Object object2) {
        object = this.values.put(object, object2);
        if (object2 instanceof ComplexConfigValue) {
            ((ComplexConfigValue)object2).setValue((TrackedValue)this.configValue);
        }
        this.configValue.serializeAndInvokeCallbacks();
        return object;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && ValueMapImpl.class == object.getClass()) {
            object = (ValueMapImpl)object;
            return Objects.equals(this.defaultValue, ((ValueMapImpl)object).defaultValue) && Objects.equals(this.values, ((ValueMapImpl)object).values);
        }
        return false;
    }

    public Collection values() {
        return this.values.values();
    }

    @Override
    public int hashCode() {
        ValueMapImpl valueMapImpl = object;
        Object object = valueMapImpl.defaultValue;
        Map map = valueMapImpl.values;
        TrackedValueImpl trackedValueImpl = valueMapImpl.configValue;
        return Objects.hash(object, map, trackedValueImpl);
    }

    @Override
    public void clear() {
        ValueMapImpl valueMapImpl = this;
        valueMapImpl.values.clear();
        valueMapImpl.configValue.serializeAndInvokeCallbacks();
    }

    @Override
    public boolean isEmpty() {
        return this.values.isEmpty();
    }

    public Iterator iterator() {
        return this.values.entrySet().iterator();
    }

    public Set entrySet() {
        return this.values.entrySet();
    }

    public void putAll(Map object) {
        this.values.putAll(object);
        for (Object e : object.values()) {
            if (!(e instanceof ComplexConfigValue)) continue;
            ((ComplexConfigValue)e).setValue((TrackedValue)this.configValue);
        }
        this.configValue.serializeAndInvokeCallbacks();
    }

    @Override
    public boolean containsKey(Object object) {
        return this.values.containsKey(object);
    }

    public Set keySet() {
        return this.values.keySet();
    }

    @Override
    public boolean containsValue(Object object) {
        return this.values.containsValue(object);
    }

    public void setValue(TrackedValue trackedValue) {
        ((ValueMapImpl)((Object)iterator)).configValue = (TrackedValueImpl)trackedValue;
        if (((ValueMapImpl)((Object)iterator)).defaultValue instanceof ComplexConfigValue) {
            Iterator iterator = ((ValueMapImpl)((Object)iterator)).values.values().iterator();
            while (iterator.hasNext()) {
                ((ComplexConfigValue)iterator.next()).setValue(trackedValue);
            }
        }
    }

    public Class getType() {
        return this.defaultValue.getClass();
    }

    public ValueMap copy() {
        LinkedHashMap<String, Object> linkedHashMap;
        LinkedHashMap<String, Object> linkedHashMap2 = linkedHashMap;
        linkedHashMap = new LinkedHashMap<String, Object>();
        for (Map.Entry entry : this) {
            Object v = entry.getValue();
            if (v instanceof CompoundConfigValue) {
                linkedHashMap2.put((String)entry.getKey(), ((CompoundConfigValue)v).copy());
                continue;
            }
            linkedHashMap2.put((String)entry.getKey(), v);
        }
        ValueMapImpl valueMapImpl = new ValueMapImpl(this.defaultValue, linkedHashMap2);
        valueMapImpl.setValue(this.configValue);
        return valueMapImpl;
    }

    public Object getDefaultValue() {
        return this.defaultValue;
    }

    public void grow() {
        Object object = this.defaultValue;
        if (object instanceof ValueListImpl) {
            this.values.put("", ((ValueListImpl)object).copy());
        } else if (object instanceof ValueMapImpl) {
            this.values.put("", ((ValueMapImpl)object).copy());
        } else {
            this.values.put("", object);
        }
    }
}

