/*
 * Decompiled with CFR 0.152.
 */
package squeek.appleskin.shadowed.blue.endless.jankson;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonGrammar;

public abstract class JsonElement
implements Cloneable {
    public abstract JsonElement clone();

    public String toJson(JsonGrammar jsonGrammar) {
        return this.toJson(jsonGrammar, 0);
    }

    @Deprecated
    public abstract String toJson(boolean var1, boolean var2, int var3);

    public abstract void toJson(Writer var1, JsonGrammar var2, int var3) throws IOException;

    public String toJson(JsonGrammar jsonGrammar, int n) {
        StringWriter stringWriter = new StringWriter();
        try {
            this.toJson(stringWriter, jsonGrammar, n);
            stringWriter.flush();
            return stringWriter.toString();
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    public String toJson(boolean bl, boolean bl2) {
        return this.toJson(bl, bl2, 0);
    }

    public String toJson() {
        return this.toJson(false, false, 0);
    }
}

