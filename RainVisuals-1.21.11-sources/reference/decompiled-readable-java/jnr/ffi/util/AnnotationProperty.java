/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.util;

import java.util.Arrays;

final class AnnotationProperty {
    private Object value;
    private final String name;
    private final Class<?> type;

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        AnnotationProperty other = (AnnotationProperty)obj;
        if (this.name == null) {
            if (other.getName() != null) {
                return false;
            }
        } else if (!this.name.equals(other.getName())) {
            return false;
        }
        if (this.type == null) {
            if (other.getType() != null) {
                return false;
            }
        } else if (!this.type.equals(other.getType())) {
            return false;
        }
        if (this.value == null) {
            if (other.getValue() != null) {
                return false;
            }
        } else {
            if (!this.type.isArray()) {
                return this.value.equals(other.getValue());
            }
            if (this.value instanceof Object[]) {
                if (other.getValue() instanceof Object[]) {
                    Arrays.equals((Object[])this.value, (Object[])other.getValue());
                }
            }
            if (this.type == byte[].class) {
                return Arrays.equals((byte[])this.value, (byte[])other.getValue());
            }
            if (this.type == char[].class) {
                return Arrays.equals((char[])this.value, (char[])other.getValue());
            }
            if (this.type == double[].class) {
                return Arrays.equals((double[])this.value, (double[])other.getValue());
            }
            if (this.type == float[].class) {
                return Arrays.equals((float[])this.value, (float[])other.getValue());
            }
            if (this.type == int[].class) {
                return Arrays.equals((int[])this.value, (int[])other.getValue());
            }
            if (this.type == long[].class) {
                return Arrays.equals((long[])this.value, (long[])other.getValue());
            }
            if (this.type == short[].class) {
                return Arrays.equals((short[])this.value, (short[])other.getValue());
            }
            if (this.type == boolean[].class) {
                void var2_2;
                return Arrays.equals((boolean[])this.value, (boolean[])var2_2.getValue());
            }
        }
        return false;
    }

    public Object getValue() {
        return this.value;
    }

    public void setValue(Object value) {
        if (!(value == null || this.type.isAssignableFrom(value.getClass()) || this.type == Boolean.TYPE && value.getClass() == Boolean.class || this.type == Byte.TYPE && value.getClass() == Byte.class || this.type == Character.TYPE && value.getClass() == Character.class || this.type == Double.TYPE && value.getClass() == Double.class || this.type == Float.TYPE && value.getClass() == Float.class || this.type == Integer.TYPE && value.getClass() == Integer.class || this.type == Long.TYPE && value.getClass() == Long.class || this.type == Short.TYPE && value.getClass() == Short.class)) {
            throw new IllegalArgumentException("Cannot assign value of type '" + value.getClass().getName() + "' to property '" + this.name + "' of type '" + this.type.getName() + "'");
        }
        this.value = value;
    }

    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = 31 * result + this.name.hashCode();
        result = 31 * result + this.type.hashCode();
        int n = 31 * result + this.getValueHashCode();
        return n;
    }

    public AnnotationProperty(String name, Class<?> type) {
        this.name = name;
        this.type = type;
    }

    protected String valueToString() {
        if (!this.type.isArray()) {
            return String.valueOf(this.value);
        }
        Class<?> arrayType = this.type.getComponentType();
        if (arrayType == Boolean.TYPE) {
            return Arrays.toString((boolean[])this.value);
        }
        if (arrayType == Byte.TYPE) {
            return Arrays.toString((byte[])this.value);
        }
        if (arrayType == Character.TYPE) {
            return Arrays.toString((char[])this.value);
        }
        if (arrayType == Double.TYPE) {
            return Arrays.toString((double[])this.value);
        }
        if (arrayType == Float.TYPE) {
            return Arrays.toString((float[])this.value);
        }
        if (arrayType == Integer.TYPE) {
            return Arrays.toString((int[])this.value);
        }
        if (arrayType == Long.TYPE) {
            return Arrays.toString((long[])this.value);
        }
        if (arrayType == Short.TYPE) {
            return Arrays.toString((short[])this.value);
        }
        return Arrays.toString((Object[])this.value);
    }

    public String toString() {
        return "(name=" + this.name + ", type=" + (this.type.isArray() ? this.type.getComponentType().getName() + "[]" : this.type.getName()) + ", value=" + this.valueToString() + ")";
    }

    public String getName() {
        return this.name;
    }

    protected int getValueHashCode() {
        if (this.value == null) {
            return 0;
        }
        if (!this.type.isArray()) {
            return this.value.hashCode();
        }
        if (this.type == byte[].class) {
            return Arrays.hashCode((byte[])this.value);
        }
        if (this.type == char[].class) {
            return Arrays.hashCode((char[])this.value);
        }
        if (this.type == double[].class) {
            return Arrays.hashCode((double[])this.value);
        }
        if (this.type == float[].class) {
            return Arrays.hashCode((float[])this.value);
        }
        if (this.type == int[].class) {
            return Arrays.hashCode((int[])this.value);
        }
        if (this.type == long[].class) {
            return Arrays.hashCode((long[])this.value);
        }
        if (this.type == short[].class) {
            return Arrays.hashCode((short[])this.value);
        }
        if (this.type == boolean[].class) {
            return Arrays.hashCode((boolean[])this.value);
        }
        return Arrays.hashCode((Object[])this.value);
    }

    public Class<?> getType() {
        return this.type;
    }
}

