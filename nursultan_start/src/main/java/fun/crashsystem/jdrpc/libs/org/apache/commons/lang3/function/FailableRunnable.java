/*
 * Decompiled with CFR 0.152.
 */
package fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.function;

@FunctionalInterface
public interface FailableRunnable<E extends Throwable> {
    public void run() throws E;
}

