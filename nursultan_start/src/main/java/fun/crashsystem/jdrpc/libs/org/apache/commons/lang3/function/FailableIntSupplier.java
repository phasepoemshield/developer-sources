/*
 * Decompiled with CFR 0.152.
 */
package fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.function;

@FunctionalInterface
public interface FailableIntSupplier<E extends Throwable> {
    public int getAsInt() throws E;
}

