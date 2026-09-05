/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.msgpack.core.MessageTypeCastException
 *  org.msgpack.value.ImmutableArrayValue
 *  org.msgpack.value.ImmutableBinaryValue
 *  org.msgpack.value.ImmutableBooleanValue
 *  org.msgpack.value.ImmutableExtensionValue
 *  org.msgpack.value.ImmutableFloatValue
 *  org.msgpack.value.ImmutableIntegerValue
 *  org.msgpack.value.ImmutableMapValue
 *  org.msgpack.value.ImmutableNilValue
 *  org.msgpack.value.ImmutableNumberValue
 *  org.msgpack.value.ImmutableRawValue
 *  org.msgpack.value.ImmutableStringValue
 *  org.msgpack.value.ImmutableTimestampValue
 *  org.msgpack.value.ImmutableValue
 */
package org.msgpack.value.impl;

import org.msgpack.core.MessageTypeCastException;
import org.msgpack.value.ImmutableArrayValue;
import org.msgpack.value.ImmutableBinaryValue;
import org.msgpack.value.ImmutableBooleanValue;
import org.msgpack.value.ImmutableExtensionValue;
import org.msgpack.value.ImmutableFloatValue;
import org.msgpack.value.ImmutableIntegerValue;
import org.msgpack.value.ImmutableMapValue;
import org.msgpack.value.ImmutableNilValue;
import org.msgpack.value.ImmutableNumberValue;
import org.msgpack.value.ImmutableRawValue;
import org.msgpack.value.ImmutableStringValue;
import org.msgpack.value.ImmutableTimestampValue;
import org.msgpack.value.ImmutableValue;

abstract class AbstractImmutableValue
implements ImmutableValue {
    AbstractImmutableValue() {
    }

    public boolean isMapValue() {
        return this.getValueType().isMapType();
    }

    public boolean isNilValue() {
        return this.getValueType().isNilType();
    }

    public ImmutableMapValue asMapValue() {
        throw new MessageTypeCastException();
    }

    public ImmutableRawValue asRawValue() {
        throw new MessageTypeCastException();
    }

    public boolean isRawValue() {
        return this.getValueType().isRawType();
    }

    public ImmutableNilValue asNilValue() {
        throw new MessageTypeCastException();
    }

    public boolean isExtensionValue() {
        return this.getValueType().isExtensionType();
    }

    public ImmutableExtensionValue asExtensionValue() {
        throw new MessageTypeCastException();
    }

    public boolean isIntegerValue() {
        return this.getValueType().isIntegerType();
    }

    public ImmutableBinaryValue asBinaryValue() {
        throw new MessageTypeCastException();
    }

    public ImmutableArrayValue asArrayValue() {
        throw new MessageTypeCastException();
    }

    public boolean isNumberValue() {
        return this.getValueType().isNumberType();
    }

    public boolean isTimestampValue() {
        return false;
    }

    public boolean isFloatValue() {
        return this.getValueType().isFloatType();
    }

    public ImmutableIntegerValue asIntegerValue() {
        throw new MessageTypeCastException();
    }

    public boolean isStringValue() {
        return this.getValueType().isStringType();
    }

    public boolean isArrayValue() {
        return this.getValueType().isArrayType();
    }

    public ImmutableBooleanValue asBooleanValue() {
        throw new MessageTypeCastException();
    }

    public ImmutableFloatValue asFloatValue() {
        throw new MessageTypeCastException();
    }

    public ImmutableNumberValue asNumberValue() {
        throw new MessageTypeCastException();
    }

    public ImmutableStringValue asStringValue() {
        throw new MessageTypeCastException();
    }

    public boolean isBooleanValue() {
        return this.getValueType().isBooleanType();
    }

    public boolean isBinaryValue() {
        return this.getValueType().isBinaryType();
    }

    public ImmutableTimestampValue asTimestampValue() {
        throw new MessageTypeCastException();
    }
}

