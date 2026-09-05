/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonReader
 */
package fun.crashsystem.jdrpc.libs.com.google.gson.internal;

import fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonReader;
import java.io.IOException;

public abstract class JsonReaderInternalAccess {
    public static volatile JsonReaderInternalAccess INSTANCE;

    public abstract void promoteNameToValue(JsonReader var1) throws IOException;
}

