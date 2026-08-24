/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix.util;

public class MethodName {
    private static final int CLIENT_CODE_STACK_INDEX;

    public static String getCallerMethodName() {
        return Thread.currentThread().getStackTrace()[CLIENT_CODE_STACK_INDEX + 1].getMethodName();
    }

    public static String getMethodName() {
        return Thread.currentThread().getStackTrace()[CLIENT_CODE_STACK_INDEX].getMethodName();
    }

    /*
     * WARNING - void declaration
     */
    static {
        void var0;
        int i = 0;
        StackTraceElement[] stackTraceElementArray = Thread.currentThread().getStackTrace();
        int n = stackTraceElementArray.length;
        for (int j = 0; j < n; ++j) {
            StackTraceElement ste = stackTraceElementArray[j];
            ++i;
            if (ste.getClassName().equals(MethodName.class.getName())) break;
        }
        CLIENT_CODE_STACK_INDEX = var0;
    }
}

