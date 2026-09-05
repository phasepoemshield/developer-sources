/*
 * Decompiled with CFR 0.152.
 */
package fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.function;

@FunctionalInterface
public interface FailableDoubleSupplier<E extends Throwable> {
    public double getAsDouble() throws E;
}

