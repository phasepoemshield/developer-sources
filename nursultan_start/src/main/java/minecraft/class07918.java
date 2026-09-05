/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import minecraft.class07916;
import org.jspecify.annotations.Nullable;

public final class class07918
extends Enum<class07918> {
    public static final /* enum */ class07918 field_62300 = new class07918(-32700, "Parse error");
    public static final /* enum */ class07918 field_62301 = new class07918(-32600, "Invalid Request");
    public static final /* enum */ class07918 field_62302 = new class07918(-32601, "Method not found");
    public static final /* enum */ class07918 field_62303 = new class07918(-32602, "Invalid params");
    public static final /* enum */ class07918 field_62304 = new class07918(-32603, "Internal error");
    private final int field_62305;
    private final String field_62306;
    private static final /* synthetic */ class07918[] field_62307;

    private class07918(int n2, String string2) {
        this.field_62305 = n2;
        this.field_62306 = string2;
    }

    static {
        field_62307 = class07918.N();
    }

    public static class07918[] values() {
        return (class07918[])field_62307.clone();
    }

    public static class07918 valueOf(String string) {
        return Enum.valueOf(class07918.class, string);
    }

    public JsonObject N(JsonElement jsonElement) {
        return class07916.N(jsonElement, this.field_62306, this.field_62305, null);
    }

    private static /* synthetic */ class07918[] N() {
        return new class07918[]{field_62300, field_62301, field_62302, field_62303, field_62304};
    }

    public JsonObject N(JsonElement jsonElement, String string) {
        return class07916.N(jsonElement, this.field_62306, this.field_62305, string);
    }

    public JsonObject N(@Nullable String string) {
        return class07916.N((JsonElement)JsonNull.INSTANCE, this.field_62306, this.field_62305, string);
    }
}

