/*
 * Decompiled with CFR 0.152.
 */
package fun.crashsystem.jdrpc.util;

public final class ProcessId {
    private ProcessId() {
    }

    public static long current() {
        return ProcessHandle.current().pid();
    }
}

