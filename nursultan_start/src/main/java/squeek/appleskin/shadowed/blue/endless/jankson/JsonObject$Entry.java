/*
 * Decompiled with CFR 0.152.
 */
package squeek.appleskin.shadowed.blue.endless.jankson;

import java.util.Objects;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonElement;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonObject$1;

final class JsonObject$Entry {
    private String comment;
    protected String key;
    protected JsonElement value;

    static /* synthetic */ String access$100(JsonObject$Entry jsonObject$Entry) {
        return jsonObject$Entry.comment;
    }

    /* synthetic */ JsonObject$Entry(JsonObject$1 jsonObject$1) {
        this();
    }

    private JsonObject$Entry() {
    }

    public boolean equals(Object object) {
        if (object == null || !(object instanceof JsonObject$Entry)) {
            return false;
        }
        JsonObject$Entry jsonObject$Entry = (JsonObject$Entry)object;
        if (!Objects.equals(this.comment, jsonObject$Entry.comment)) {
            return false;
        }
        if (!this.key.equals(jsonObject$Entry.key)) {
            return false;
        }
        return this.value.equals(jsonObject$Entry.value);
    }

    public int hashCode() {
        return Objects.hash(this.comment, this.key, this.value);
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String string) {
        this.comment = string != null && !string.trim().isEmpty() ? string : null;
    }
}

