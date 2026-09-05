/*
 * Decompiled with CFR 0.152.
 */
package squeek.appleskin.shadowed.blue.endless.jankson;

import java.util.Objects;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonElement;

class JsonArray$Entry {
    String comment;
    JsonElement value;

    public JsonArray$Entry() {
    }

    public JsonArray$Entry(JsonElement jsonElement) {
        this.value = jsonElement;
    }

    public boolean equals(Object object) {
        if (!(object instanceof JsonArray$Entry)) {
            return false;
        }
        JsonArray$Entry jsonArray$Entry = (JsonArray$Entry)object;
        return Objects.equals(this.comment, jsonArray$Entry.comment) && Objects.equals(this.value, jsonArray$Entry.value);
    }

    public int hashCode() {
        return Objects.hash(this.comment, this.value);
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String string) {
        this.comment = string != null && !string.trim().isEmpty() ? string : null;
    }
}

