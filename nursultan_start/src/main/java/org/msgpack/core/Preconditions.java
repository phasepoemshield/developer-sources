/*
 * Decompiled with CFR 0.152.
 */
package org.msgpack.core;

public final class Preconditions {
    private Preconditions() {
    }

    static String format(String string, Object ... objectArray) {
        int n;
        string = String.valueOf(string);
        StringBuilder stringBuilder = new StringBuilder(string.length() + 16 * objectArray.length);
        int n2 = 0;
        int n3 = 0;
        while (n3 < objectArray.length && (n = string.indexOf("%s", n2)) != -1) {
            stringBuilder.append(string.substring(n2, n));
            stringBuilder.append(objectArray[n3++]);
            n2 = n + 2;
        }
        stringBuilder.append(string.substring(n2));
        if (n3 < objectArray.length) {
            stringBuilder.append(" [");
            stringBuilder.append(objectArray[n3++]);
            while (n3 < objectArray.length) {
                stringBuilder.append(", ");
                stringBuilder.append(objectArray[n3++]);
            }
            stringBuilder.append(']');
        }
        return stringBuilder.toString();
    }

    public static void checkState(boolean bl, String string, Object ... objectArray) {
        if (!bl) {
            throw new IllegalStateException(Preconditions.format(string, objectArray));
        }
    }

    public static void checkState(boolean bl) {
        if (!bl) {
            throw new IllegalStateException();
        }
    }

    public static void checkState(boolean bl, Object object) {
        if (!bl) {
            throw new IllegalStateException(String.valueOf(object));
        }
    }

    public static int checkElementIndex(int n, int n2, String string) {
        if (n < 0 || n >= n2) {
            throw new IndexOutOfBoundsException(Preconditions.badElementIndex(n, n2, string));
        }
        return n;
    }

    public static int checkElementIndex(int n, int n2) {
        return Preconditions.checkElementIndex(n, n2, "index");
    }

    public static void checkPositionIndexes(int n, int n2, int n3) {
        if (n < 0 || n2 < n || n2 > n3) {
            throw new IndexOutOfBoundsException(Preconditions.badPositionIndexes(n, n2, n3));
        }
    }

    public static <T> T checkNotNull(T t, String string, Object ... objectArray) {
        if (t == null) {
            throw new NullPointerException(Preconditions.format(string, objectArray));
        }
        return t;
    }

    public static <T> T checkNotNull(T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        return t;
    }

    public static <T> T checkNotNull(T t, Object object) {
        if (t == null) {
            throw new NullPointerException(String.valueOf(object));
        }
        return t;
    }

    public static void checkArgument(boolean bl, Object object) {
        if (!bl) {
            throw new IllegalArgumentException(String.valueOf(object));
        }
    }

    public static void checkArgument(boolean bl, String string, Object ... objectArray) {
        if (!bl) {
            throw new IllegalArgumentException(Preconditions.format(string, objectArray));
        }
    }

    public static void checkArgument(boolean bl) {
        if (!bl) {
            throw new IllegalArgumentException();
        }
    }

    public static int checkPositionIndex(int n, int n2, String string) {
        if (n < 0 || n > n2) {
            throw new IndexOutOfBoundsException(Preconditions.badPositionIndex(n, n2, string));
        }
        return n;
    }

    public static int checkPositionIndex(int n, int n2) {
        return Preconditions.checkPositionIndex(n, n2, "index");
    }

    private static String badElementIndex(int n, int n2, String string) {
        if (n < 0) {
            return Preconditions.format("%s (%s) must not be negative", string, n);
        }
        if (n2 < 0) {
            throw new IllegalArgumentException("negative size: " + n2);
        }
        return Preconditions.format("%s (%s) must be less than size (%s)", string, n, n2);
    }

    private static String badPositionIndex(int n, int n2, String string) {
        if (n < 0) {
            return Preconditions.format("%s (%s) must not be negative", string, n);
        }
        if (n2 < 0) {
            throw new IllegalArgumentException("negative size: " + n2);
        }
        return Preconditions.format("%s (%s) must not be greater than size (%s)", string, n, n2);
    }

    private static String badPositionIndexes(int n, int n2, int n3) {
        if (n < 0 || n > n3) {
            return Preconditions.badPositionIndex(n, n3, "start index");
        }
        if (n2 < 0 || n2 > n3) {
            return Preconditions.badPositionIndex(n2, n3, "end index");
        }
        return Preconditions.format("end index (%s) must not be less than start index (%s)", n2, n);
    }
}

