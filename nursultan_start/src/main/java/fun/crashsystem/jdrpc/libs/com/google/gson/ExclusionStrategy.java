/*
 * Decompiled with CFR 0.152.
 */
package fun.crashsystem.jdrpc.libs.com.google.gson;

import fun.crashsystem.jdrpc.libs.com.google.gson.FieldAttributes;

public interface ExclusionStrategy {
    public boolean shouldSkipField(FieldAttributes var1);

    public boolean shouldSkipClass(Class<?> var1);
}

