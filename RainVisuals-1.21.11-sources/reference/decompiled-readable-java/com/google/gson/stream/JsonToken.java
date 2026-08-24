/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.stream;

public final class JsonToken
extends Enum<JsonToken> {
    public static final /* enum */ JsonToken END_ARRAY;
    public static final /* enum */ JsonToken END_OBJECT;
    private static final /* synthetic */ JsonToken[] $VALUES;
    public static final /* enum */ JsonToken NULL;
    public static final /* enum */ JsonToken BEGIN_ARRAY;
    public static final /* enum */ JsonToken NUMBER;
    public static final /* enum */ JsonToken STRING;
    public static final /* enum */ JsonToken NAME;
    public static final /* enum */ JsonToken END_DOCUMENT;
    public static final /* enum */ JsonToken BEGIN_OBJECT;
    public static final /* enum */ JsonToken BOOLEAN;

    public static JsonToken valueOf(String name) {
        return Enum.valueOf(JsonToken.class, name);
    }

    public static JsonToken[] values() {
        return (JsonToken[])$VALUES.clone();
    }

    static {
        BEGIN_ARRAY = new JsonToken();
        END_ARRAY = new JsonToken();
        BEGIN_OBJECT = new JsonToken();
        END_OBJECT = new JsonToken();
        NAME = new JsonToken();
        STRING = new JsonToken();
        NUMBER = new JsonToken();
        BOOLEAN = new JsonToken();
        NULL = new JsonToken();
        END_DOCUMENT = new JsonToken();
        JsonToken[] jsonTokenArray = new JsonToken[10];
        jsonTokenArray[0] = BEGIN_ARRAY;
        jsonTokenArray[1] = END_ARRAY;
        jsonTokenArray[2] = BEGIN_OBJECT;
        jsonTokenArray[3] = END_OBJECT;
        jsonTokenArray[4] = NAME;
        jsonTokenArray[5] = STRING;
        jsonTokenArray[6] = NUMBER;
        jsonTokenArray[7] = BOOLEAN;
        jsonTokenArray[8] = NULL;
        jsonTokenArray[9] = END_DOCUMENT;
        $VALUES = jsonTokenArray;
    }
}

