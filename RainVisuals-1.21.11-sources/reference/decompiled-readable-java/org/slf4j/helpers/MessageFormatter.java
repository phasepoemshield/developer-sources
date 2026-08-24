/*
 * Decompiled with CFR 0.152.
 */
package org.slf4j.helpers;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.helpers.FormattingTuple;
import org.slf4j.helpers.NormalizedParameters;
import org.slf4j.helpers.Reporter;

public final class MessageFormatter {
    static final char DELIM_STOP = '}';
    static final char DELIM_START = '{';
    static final String DELIM_STR = "{}";
    private static final char ESCAPE_CHAR = '\\';

    /*
     * WARNING - void declaration
     */
    private static void booleanArrayAppend(StringBuilder sbuf, boolean[] a2) {
        sbuf.append('[');
        int len = a2.length;
        int i = 0;
        while (i < len) {
            void var3_3;
            sbuf.append(a2[i]);
            if (i != len + -1) {
                sbuf.append(", ");
            }
            ++var3_3;
        }
        sbuf.append(']');
    }

    public static final FormattingTuple format(String messagePattern, Object arg1, Object arg2) {
        Object[] objectArray = new Object[2];
        objectArray[0] = arg1;
        objectArray[1] = arg2;
        return MessageFormatter.arrayFormat(messagePattern, objectArray);
    }

    public static String basicArrayFormat(NormalizedParameters np) {
        return MessageFormatter.basicArrayFormat(np.getMessage(), np.getArguments());
    }

    /*
     * WARNING - void declaration
     */
    private static void objectArrayAppend(StringBuilder sbuf, Object[] a2, Map<Object[], Object> seenMap) {
        StringBuilder stringBuilder;
        sbuf.append('[');
        if (!seenMap.containsKey(a2)) {
            seenMap.put(a2, null);
            int len = a2.length;
            int i = 0;
            while (i < len) {
                void var4_4;
                MessageFormatter.deeplyAppendParameter(sbuf, a2[i], seenMap);
                if (i != len + -1) {
                    sbuf.append(", ");
                }
                ++var4_4;
            }
            seenMap.remove(a2);
        } else {
            sbuf.append("...");
        }
        stringBuilder.append(']');
    }

    public static Object[] trimmedCopy(Object[] argArray) {
        return NormalizedParameters.trimmedCopy(argArray);
    }

    /*
     * WARNING - void declaration
     */
    private static void floatArrayAppend(StringBuilder sbuf, float[] a2) {
        sbuf.append('[');
        int len = a2.length;
        int i = 0;
        while (i < len) {
            void var3_3;
            sbuf.append(a2[i]);
            if (i != len + -1) {
                sbuf.append(", ");
            }
            ++var3_3;
        }
        sbuf.append(']');
    }

    /*
     * WARNING - void declaration
     */
    private static void shortArrayAppend(StringBuilder sbuf, short[] a2) {
        sbuf.append('[');
        int len = a2.length;
        int i = 0;
        while (i < len) {
            void var3_3;
            sbuf.append(a2[i]);
            if (i != len + -1) {
                sbuf.append(", ");
            }
            ++var3_3;
        }
        sbuf.append(']');
    }

    /*
     * WARNING - void declaration
     */
    private static void byteArrayAppend(StringBuilder sbuf, byte[] a2) {
        sbuf.append('[');
        int len = a2.length;
        int i = 0;
        while (i < len) {
            void var3_3;
            sbuf.append(a2[i]);
            if (i != len + -1) {
                sbuf.append(", ");
            }
            ++var3_3;
        }
        sbuf.append(']');
    }

    public static final FormattingTuple format(String messagePattern, Object arg) {
        Object[] objectArray = new Object[1];
        objectArray[0] = arg;
        return MessageFormatter.arrayFormat(messagePattern, objectArray);
    }

    /*
     * WARNING - void declaration
     */
    private static void doubleArrayAppend(StringBuilder sbuf, double[] a2) {
        sbuf.append('[');
        int len = a2.length;
        int i = 0;
        while (i < len) {
            void var3_3;
            sbuf.append(a2[i]);
            if (i != len + -1) {
                sbuf.append(", ");
            }
            ++var3_3;
        }
        sbuf.append(']');
    }

    public static Throwable getThrowableCandidate(Object[] argArray) {
        return NormalizedParameters.getThrowableCandidate(argArray);
    }

    /*
     * WARNING - void declaration
     */
    public static final FormattingTuple arrayFormat(String messagePattern, Object[] argArray, Throwable throwable) {
        void var2_2;
        void var1_1;
        void var5_4;
        if (messagePattern == null) {
            return new FormattingTuple(null, argArray, throwable);
        }
        if (argArray == null) {
            return new FormattingTuple(messagePattern);
        }
        int i = 0;
        StringBuilder sbuf = new StringBuilder(messagePattern.length() + 50);
        for (int L = 0; L < argArray.length; ++L) {
            void var4_6;
            int j = messagePattern.indexOf(DELIM_STR, i);
            if (j == -1) {
                if (i == 0) {
                    return new FormattingTuple(messagePattern, argArray, throwable);
                }
                sbuf.append(messagePattern, i, messagePattern.length());
                return new FormattingTuple(sbuf.toString(), argArray, throwable);
            }
            if (MessageFormatter.isEscapedDelimeter(messagePattern, j)) {
                if (!MessageFormatter.isDoubleEscaped(messagePattern, j)) {
                    --L;
                    sbuf.append(messagePattern, i, j - 1);
                    sbuf.append('{');
                    i = j + 1;
                    continue;
                }
                sbuf.append(messagePattern, i, j - 1);
                MessageFormatter.deeplyAppendParameter(sbuf, argArray[L], new HashMap<Object[], Object>());
                i = j + 2;
                continue;
            }
            sbuf.append(messagePattern, i, j);
            MessageFormatter.deeplyAppendParameter(sbuf, argArray[L], new HashMap<Object[], Object>());
            i = var4_6 + 2;
        }
        sbuf.append(messagePattern, i, messagePattern.length());
        return new FormattingTuple(var5_4.toString(), (Object[])var1_1, (Throwable)var2_2);
    }

    static final boolean isDoubleEscaped(String messagePattern, int delimeterStartIndex) {
        if (delimeterStartIndex >= 2 && messagePattern.charAt(delimeterStartIndex + -2) == '\\') {
            return true;
        }
        return false;
    }

    public static final FormattingTuple arrayFormat(String messagePattern, Object[] argArray) {
        Throwable throwableCandidate = MessageFormatter.getThrowableCandidate(argArray);
        Object[] args2 = argArray;
        if (throwableCandidate != null) {
            args2 = MessageFormatter.trimmedCopy(argArray);
        }
        return MessageFormatter.arrayFormat(messagePattern, args2, throwableCandidate);
    }

    static final boolean isEscapedDelimeter(String messagePattern, int delimeterStartIndex) {
        if (delimeterStartIndex == 0) {
            return false;
        }
        char potentialEscape = messagePattern.charAt(delimeterStartIndex + -1);
        if (potentialEscape == '\\') {
            return true;
        }
        return false;
    }

    public static final String basicArrayFormat(String messagePattern, Object[] argArray) {
        FormattingTuple ft = MessageFormatter.arrayFormat(messagePattern, argArray, null);
        return ft.getMessage();
    }

    private static void safeObjectAppend(StringBuilder sbuf, Object o) {
        try {
            String oAsString = o.toString();
            sbuf.append(oAsString);
        }
        catch (Throwable t) {
            Reporter.error("Failed toString() invocation on an object of type [" + o.getClass().getName() + "]", t);
            sbuf.append("[FAILED toString()]");
        }
    }

    private static void deeplyAppendParameter(StringBuilder sbuf, Object o, Map<Object[], Object> seenMap) {
        if (o == null) {
            sbuf.append("null");
            return;
        }
        if (!o.getClass().isArray()) {
            MessageFormatter.safeObjectAppend(sbuf, o);
        } else if (o instanceof boolean[]) {
            MessageFormatter.booleanArrayAppend(sbuf, (boolean[])o);
        } else if (o instanceof byte[]) {
            MessageFormatter.byteArrayAppend(sbuf, (byte[])o);
        } else if (o instanceof char[]) {
            MessageFormatter.charArrayAppend(sbuf, (char[])o);
        } else if (o instanceof short[]) {
            MessageFormatter.shortArrayAppend(sbuf, (short[])o);
        } else if (o instanceof int[]) {
            MessageFormatter.intArrayAppend(sbuf, (int[])o);
        } else if (o instanceof long[]) {
            MessageFormatter.longArrayAppend(sbuf, (long[])o);
        } else if (o instanceof float[]) {
            MessageFormatter.floatArrayAppend(sbuf, (float[])o);
        } else if (o instanceof double[]) {
            MessageFormatter.doubleArrayAppend(sbuf, (double[])o);
        } else {
            MessageFormatter.objectArrayAppend(sbuf, (Object[])o, seenMap);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void intArrayAppend(StringBuilder sbuf, int[] a2) {
        sbuf.append('[');
        int len = a2.length;
        int i = 0;
        while (i < len) {
            void var3_3;
            sbuf.append(a2[i]);
            if (i != len + -1) {
                sbuf.append(", ");
            }
            ++var3_3;
        }
        sbuf.append(']');
    }

    /*
     * WARNING - void declaration
     */
    private static void charArrayAppend(StringBuilder sbuf, char[] a2) {
        sbuf.append('[');
        int len = a2.length;
        int i = 0;
        while (i < len) {
            void var3_3;
            sbuf.append(a2[i]);
            if (i != len + -1) {
                sbuf.append(", ");
            }
            ++var3_3;
        }
        sbuf.append(']');
    }

    /*
     * WARNING - void declaration
     */
    private static void longArrayAppend(StringBuilder sbuf, long[] a2) {
        sbuf.append('[');
        int len = a2.length;
        int i = 0;
        while (i < len) {
            void var3_3;
            sbuf.append(a2[i]);
            if (i != len + -1) {
                sbuf.append(", ");
            }
            ++var3_3;
        }
        sbuf.append(']');
    }
}

