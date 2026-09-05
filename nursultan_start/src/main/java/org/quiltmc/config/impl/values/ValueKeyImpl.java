/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.impl.values;

import java.util.Arrays;
import java.util.Iterator;
import org.quiltmc.config.api.values.ValueKey;
import org.quiltmc.config.impl.values.ValueKeyImpl$Itr;

public final class ValueKeyImpl
implements ValueKey {
    private final String string;
    private final String[] keys;

    static /* synthetic */ String[] access$100(ValueKeyImpl valueKeyImpl) {
        return valueKeyImpl.keys;
    }

    @Override
    public ValueKey child(String string) {
        String[] stringArray = stringArray.keys;
        int n = stringArray.keys.length;
        String[] stringArray2 = new String[n + 1];
        String[] stringArray3 = stringArray2;
        int n2 = stringArray.length;
        System.arraycopy(stringArray, 0, stringArray3, 0, n2);
        stringArray2[n] = string;
        return new ValueKeyImpl(stringArray3);
    }

    @Override
    public ValueKey child(ValueKey valueKey) {
        int n = this.keys.length;
        String[] stringArray = new String[valueKey.length() + n];
        int n2 = this.keys.length;
        System.arraycopy(this.keys, 0, stringArray, 0, n2);
        int n3 = this.keys.length;
        int n4 = valueKey.length();
        System.arraycopy(((ValueKeyImpl)valueKey).keys, 0, stringArray, n3, n4);
        return new ValueKeyImpl(stringArray);
    }

    public ValueKeyImpl(String[] stringArray) {
        if (stringArray.length != 0) {
            StringBuilder stringBuilder;
            block3: {
                StringBuilder stringBuilder2;
                stringArray = new String[stringArray.length];
                this.keys = stringArray;
                int n = stringArray.length;
                System.arraycopy(stringArray, 0, stringArray, 0, n);
                stringBuilder = stringBuilder2;
                stringBuilder2 = new StringBuilder(stringArray[0]);
                int n2 = 0;
                while (true) {
                    String[] stringArray2 = this.keys;
                    if (n2 >= this.keys.length) break block3;
                    if (stringArray2[n2] == null) break;
                    if (n2 > 0) {
                        stringBuilder.append('.').append(this.keys[n2]);
                    }
                    ++n2;
                }
                throw new IllegalArgumentException("No component of a key can be null");
            }
            this.string = stringBuilder.toString();
            return;
        }
        throw new IllegalArgumentException("Keys cannot be empty");
    }

    public ValueKeyImpl(String string, String ... object) {
        block2: {
            StringBuilder stringBuilder;
            String[] stringArray = object;
            String[] stringArray2 = new String[stringArray.length + 1];
            object = stringArray2;
            this.keys = object;
            stringArray2[0] = string;
            int n = stringArray.length;
            System.arraycopy(object, 0, object, 1, n);
            object = stringBuilder;
            stringBuilder = new StringBuilder(string);
            int n2 = 0;
            while (true) {
                String[] stringArray3 = this.keys;
                if (n2 >= this.keys.length) break block2;
                if (stringArray3[n2] == null) break;
                if (n2 > 0) {
                    ((StringBuilder)object).append('.').append(this.keys[n2]);
                }
                ++n2;
            }
            throw new IllegalArgumentException("No component of a key can be null");
        }
        this.string = ((StringBuilder)object).toString();
    }

    public boolean equals(Object object) {
        if (!(object instanceof ValueKeyImpl)) {
            return false;
        }
        if (((ValueKeyImpl)(object = (ValueKeyImpl)object)).length() != this.length()) {
            return false;
        }
        for (int i = 0; i < this.length(); ++i) {
            if (this.getKeyComponent(i).equals(((ValueKeyImpl)object).getKeyComponent(i))) continue;
            return false;
        }
        return true;
    }

    @Override
    public int length() {
        return this.keys.length;
    }

    public String toString() {
        return this.string;
    }

    public int hashCode() {
        return Arrays.hashCode(this.keys);
    }

    @Override
    public boolean startsWith(ValueKey valueKey) {
        for (int i = 0; i < valueKey.length() && i < this.length(); ++i) {
            if (valueKey.getKeyComponent(i).equals(this.keys[i])) continue;
            return false;
        }
        return true;
    }

    public Iterator iterator() {
        return new ValueKeyImpl$Itr(this, null);
    }

    @Override
    public boolean isSibling(ValueKey valueKey) {
        String[] stringArray = this.keys;
        if (this.keys.length > 1 && stringArray.length == valueKey.length()) {
            int n = 0;
            while (true) {
                String[] stringArray2 = this.keys;
                if (n >= this.keys.length - 1) break;
                if (!stringArray2[n].equals(valueKey.getKeyComponent(n))) {
                    return false;
                }
                ++n;
            }
            return true;
        }
        return false;
    }

    @Override
    public String getLastComponent() {
        return this.keys[this.keys.length - 1];
    }

    @Override
    public String getKeyComponent(int n) {
        return this.keys[n];
    }
}

