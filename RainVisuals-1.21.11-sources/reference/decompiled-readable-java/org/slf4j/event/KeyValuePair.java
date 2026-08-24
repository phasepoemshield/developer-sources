/*
 * Decompiled with CFR 0.152.
 */
package org.slf4j.event;

import java.util.Objects;

public class KeyValuePair {
    public final String key;
    public final Object value;

    public int hashCode() {
        Object[] objectArray = new Object[2];
        objectArray[0] = this.key;
        objectArray[1] = this.value;
        return Objects.hash(objectArray);
    }

    public KeyValuePair(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public String toString() {
        return String.valueOf(this.key) + "=\"" + String.valueOf(this.value) + "\"";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) return false;
        if (this.getClass() != o.getClass()) {
            return false;
        }
        KeyValuePair that = (KeyValuePair)o;
        if (!Objects.equals(this.key, that.key)) return false;
        if (!Objects.equals(this.value, that.value)) return false;
        return true;
    }
}

