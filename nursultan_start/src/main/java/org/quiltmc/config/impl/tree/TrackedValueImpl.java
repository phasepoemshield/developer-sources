/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.Constraint
 *  org.quiltmc.config.api.exceptions.TrackedValueException
 *  org.quiltmc.config.api.metadata.MetadataType
 *  org.quiltmc.config.api.values.ComplexConfigValue
 *  org.quiltmc.config.api.values.TrackedValue
 *  org.quiltmc.config.api.values.TrackedValue$UpdateCallback
 */
package org.quiltmc.config.impl.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.quiltmc.config.api.Constraint;
import org.quiltmc.config.api.exceptions.TrackedValueException;
import org.quiltmc.config.api.metadata.MetadataType;
import org.quiltmc.config.api.values.ComplexConfigValue;
import org.quiltmc.config.api.values.TrackedValue;
import org.quiltmc.config.api.values.ValueKey;
import org.quiltmc.config.impl.AbstractMetadataContainer;
import org.quiltmc.config.impl.ConfigImpl;
import org.quiltmc.config.impl.util.ImmutableIterable;

public final class TrackedValueImpl
extends AbstractMetadataContainer
implements TrackedValue {
    public List callbacks;
    public List constraints;
    private final Object defaultValue;
    private ValueKey key;
    private ConfigImpl config;
    private Object value;
    private boolean isBeingOverridden = false;
    private Object valueOverride;

    public TrackedValueImpl setKey(ValueKey valueKey) {
        this.key = valueKey;
        return this;
    }

    public TrackedValueImpl(ValueKey valueKey, Object object, Map map, List list, List list2) {
        super(map);
        this.key = valueKey;
        this.defaultValue = object;
        this.value = object;
        this.callbacks = list;
        this.constraints = list2;
        this.assertValue(object);
        if (object instanceof ComplexConfigValue) {
            Object object2 = object;
            ((ComplexConfigValue)object2).setValue((TrackedValue)this);
            this.value = ((ComplexConfigValue)object2).copy();
        } else {
            this.value = object;
        }
    }

    public Object value() {
        return this.isBeingOverridden ? this.valueOverride : this.value;
    }

    public String toString() {
        String string = ((TrackedValueImpl)((Object)string)).value.toString();
        StringBuilder stringBuilder = new StringBuilder("TrackedValueImpl[");
        stringBuilder.append(string);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public ValueKey key() {
        return this.key;
    }

    public Object setValue(Object object, boolean bl) {
        this.assertValue(object);
        if (object instanceof ComplexConfigValue) {
            ((ComplexConfigValue)object).setValue((TrackedValue)this);
        }
        Object object2 = this.value;
        this.value = object;
        if (bl) {
            this.config.save();
        }
        if (!this.isBeingOverridden()) {
            this.invokeCallbacks();
        }
        return object2;
    }

    public Object getDefaultValue() {
        return this.defaultValue;
    }

    public Iterable constraints() {
        return new ImmutableIterable(this.constraints);
    }

    public Optional checkForFailingConstraints(Object object) {
        ArrayList<String> arrayList = null;
        if (object == null) {
            ArrayList<String> arrayList2;
            arrayList = arrayList2;
            new ArrayList<String>().add("Value cannot be null");
        }
        Iterator iterator = ((TrackedValueImpl)((Object)iterator)).constraints.iterator();
        while (iterator.hasNext()) {
            Optional optional = ((Constraint)iterator.next()).test(object);
            if (!optional.isPresent()) continue;
            if (arrayList == null) {
                ArrayList<String> arrayList3;
                arrayList = arrayList3;
                arrayList3 = new ArrayList<String>();
            }
            arrayList.add((String)optional.get());
        }
        if (arrayList == null) {
            return Optional.empty();
        }
        return Optional.of(new ImmutableIterable(arrayList));
    }

    public void propagateInheritedMetadata(Map object) {
        object = object.entrySet().iterator();
        while (object.hasNext()) {
            Map.Entry entry;
            Map.Entry entry2 = entry = (Map.Entry)object.next();
            entry = (MetadataType)entry2.getKey();
            this.metadata.putIfAbsent(entry, entry2.getValue());
        }
    }

    private void assertValue(Object iterator) {
        if (((Optional)(object2 = ((TrackedValueImpl)object2).checkForFailingConstraints(iterator))).isPresent()) {
            StringBuilder stringBuilder;
            Object object = object2;
            Object object2 = stringBuilder;
            stringBuilder = new StringBuilder();
            iterator = ((Iterable)((Optional)object).get()).iterator();
            while (iterator.hasNext()) {
                ((StringBuilder)object2).append((String)iterator.next()).append('\n');
            }
            throw new TrackedValueException(((StringBuilder)object2).toString());
        }
    }

    public Object getRealValue() {
        return this.value;
    }

    public void setOverride(Object object) {
        TrackedValueImpl trackedValueImpl = this;
        trackedValueImpl.assertValue(object);
        trackedValueImpl.isBeingOverridden = true;
        trackedValueImpl.valueOverride = object;
        trackedValueImpl.invokeCallbacks();
    }

    public void removeOverride() {
        this.isBeingOverridden = false;
        this.valueOverride = null;
        this.invokeCallbacks();
    }

    public boolean isBeingOverridden() {
        return this.isBeingOverridden;
    }

    public void setConfig(ConfigImpl configImpl) {
        if (this.config == null) {
            this.config = configImpl;
            return;
        }
        throw new TrackedValueException("TrackedValue '" + this.key + "' cannot be assigned to multiple configs");
    }

    public void serializeAndInvokeCallbacks() {
        TrackedValueImpl trackedValueImpl = this;
        trackedValueImpl.config.save();
        trackedValueImpl.config.invokeCallbacks();
        Iterator iterator = trackedValueImpl.callbacks.iterator();
        while (iterator.hasNext()) {
            ((TrackedValue.UpdateCallback)iterator.next()).onUpdate((TrackedValue)this);
        }
    }

    public void invokeCallbacks() {
        TrackedValueImpl trackedValueImpl = this;
        trackedValueImpl.config.invokeCallbacks();
        Iterator iterator = trackedValueImpl.callbacks.iterator();
        while (iterator.hasNext()) {
            ((TrackedValue.UpdateCallback)iterator.next()).onUpdate((TrackedValue)this);
        }
    }

    public void registerCallback(TrackedValue.UpdateCallback updateCallback) {
        this.callbacks.add(updateCallback);
    }
}

