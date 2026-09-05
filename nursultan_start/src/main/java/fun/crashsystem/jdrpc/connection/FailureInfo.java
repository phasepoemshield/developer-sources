/*
 * Decompiled with CFR 0.152.
 */
package fun.crashsystem.jdrpc.connection;

public record FailureInfo(String type, String message) {
    public static FailureInfo from(Throwable throwable) {
        if (throwable == null) {
            return new FailureInfo("Unknown", "Unknown");
        }
        String string = throwable.getMessage();
        return new FailureInfo(throwable.getClass().getName(), string == null ? "Unknown" : string);
    }
}

