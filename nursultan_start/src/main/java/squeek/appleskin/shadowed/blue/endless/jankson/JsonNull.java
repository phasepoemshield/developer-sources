/*
 * Decompiled with CFR 0.152.
 */
package squeek.appleskin.shadowed.blue.endless.jankson;

import java.io.IOException;
import java.io.Writer;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonElement;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonGrammar;

public class JsonNull
extends JsonElement {
    public static final JsonNull INSTANCE = new JsonNull();

    private JsonNull() {
    }

    public boolean equals(Object object) {
        return object == INSTANCE;
    }

    public String toString() {
        return "null";
    }

    public int hashCode() {
        return 0;
    }

    @Override
    public JsonNull clone() {
        return this;
    }

    @Override
    public String toJson(boolean bl, boolean bl2, int n) {
        return "null";
    }

    @Override
    public void toJson(Writer writer, JsonGrammar jsonGrammar, int n) throws IOException {
        writer.write("null");
    }
}

