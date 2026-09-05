/*
 * Decompiled with CFR 0.152.
 */
package fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.function;

@FunctionalInterface
public interface FailableDoubleBinaryOperator<E extends Throwable> {
    public double applyAsDouble(double var1, double var3) throws E;
}

