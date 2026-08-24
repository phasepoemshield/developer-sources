/*
 * Decompiled with CFR 0.152.
 */
package org.slf4j.helpers;

import org.slf4j.event.LoggingEvent;
import org.slf4j.helpers.MessageFormatter;

public class NormalizedParameters {
    final Throwable throwable;
    final String message;
    final Object[] arguments;

    public String getMessage() {
        return this.message;
    }

    public NormalizedParameters(String message, Object[] arguments, Throwable throwable) {
        this.message = message;
        this.arguments = arguments;
        this.throwable = throwable;
    }

    public static NormalizedParameters normalize(LoggingEvent event) {
        return NormalizedParameters.normalize(event.getMessage(), event.getArgumentArray(), event.getThrowable());
    }

    public static Throwable getThrowableCandidate(Object[] argArray) {
        block5: {
            block4: {
                if (argArray == null) break block4;
                if (argArray.length != 0) break block5;
            }
            return null;
        }
        Object lastEntry = argArray[argArray.length - 1];
        if (lastEntry instanceof Throwable) {
            return (Throwable)lastEntry;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public static Object[] trimmedCopy(Object[] argArray) {
        void var2_2;
        if (argArray == null || argArray.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        int trimmedLen = argArray.length - 1;
        Object[] trimmed = new Object[trimmedLen];
        if (trimmedLen > 0) {
            void var1_1;
            System.arraycopy(argArray, 0, trimmed, 0, (int)var1_1);
        }
        return var2_2;
    }

    /*
     * WARNING - void declaration
     */
    public static NormalizedParameters normalize(String msg, Object[] arguments, Throwable t) {
        void var1_1;
        String string;
        if (t != null) {
            return new NormalizedParameters(msg, arguments, t);
        }
        if (arguments == null || arguments.length == 0) {
            return new NormalizedParameters(msg, arguments, t);
        }
        Throwable throwableCandidate = NormalizedParameters.getThrowableCandidate(arguments);
        if (throwableCandidate != null) {
            Object[] trimmedArguments = MessageFormatter.trimmedCopy(arguments);
            return new NormalizedParameters(msg, trimmedArguments, throwableCandidate);
        }
        return new NormalizedParameters(string, (Object[])var1_1);
    }

    public NormalizedParameters(String message, Object[] arguments) {
        this(message, arguments, null);
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public Object[] getArguments() {
        return this.arguments;
    }
}

