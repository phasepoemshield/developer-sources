/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.gson.stream.JsonReader
 */
package com.viaversion.viaversion.libs.gson;

import com.viaversion.viaversion.libs.gson.stream.JsonReader;
import java.io.IOException;

public interface ToNumberStrategy {
    public Number readNumber(JsonReader var1) throws IOException;
}

