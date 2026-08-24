/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.connections.shared;

public final class ExecutorNames
extends Enum<ExecutorNames> {
    public static final /* enum */ ExecutorNames SIGNAL = new ExecutorNames("SignalExecutor");
    private static final /* synthetic */ ExecutorNames[] $VALUES;
    private final String description;
    public static final /* enum */ ExecutorNames METHODRETURN;
    public static final /* enum */ ExecutorNames ERROR;
    public static final /* enum */ ExecutorNames METHODCALL;

    public static ExecutorNames valueOf(String name) {
        return Enum.valueOf(ExecutorNames.class, name);
    }

    public String getDescription() {
        return this.description;
    }

    public String toString() {
        return this.description;
    }

    public static ExecutorNames[] values() {
        return (ExecutorNames[])$VALUES.clone();
    }

    private static /* synthetic */ ExecutorNames[] $values() {
        ExecutorNames[] executorNamesArray = new ExecutorNames[4];
        executorNamesArray[0] = SIGNAL;
        executorNamesArray[1] = ERROR;
        executorNamesArray[2] = METHODCALL;
        executorNamesArray[3] = METHODRETURN;
        return executorNamesArray;
    }

    static {
        ERROR = new ExecutorNames("ErrorExecutor");
        METHODCALL = new ExecutorNames("MethodCallExecutor");
        METHODRETURN = new ExecutorNames("MethodReturnExecutor");
        $VALUES = ExecutorNames.$values();
    }

    private ExecutorNames(String _name) {
        this.description = _name;
    }
}

