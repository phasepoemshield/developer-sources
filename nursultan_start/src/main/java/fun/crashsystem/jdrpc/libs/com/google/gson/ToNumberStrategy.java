/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonReader
 */
package fun.crashsystem.jdrpc.libs.com.google.gson;

import fun.crashsystem.jdrpc.libs.com.google.gson.stream.JsonReader;
import java.io.IOException;

public interface ToNumberStrategy {
    public Number readNumber(JsonReader var1) throws IOException;
}

