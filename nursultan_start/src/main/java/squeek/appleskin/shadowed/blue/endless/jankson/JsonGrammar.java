/*
 * Decompiled with CFR 0.152.
 */
package squeek.appleskin.shadowed.blue.endless.jankson;

import squeek.appleskin.shadowed.blue.endless.jankson.JsonGrammar$Builder;

public class JsonGrammar {
    public static final JsonGrammar JANKSON = JsonGrammar.builder().bareSpecialNumerics(true).build();
    public static final JsonGrammar JSON5 = JsonGrammar.builder().withComments(true).printTrailingCommas(true).bareSpecialNumerics(true).build();
    public static final JsonGrammar STRICT = JsonGrammar.builder().withComments(false).build();
    public static final JsonGrammar COMPACT = JsonGrammar.builder().withComments(false).printWhitespace(false).bareSpecialNumerics(true).build();
    protected boolean comments = true;
    protected boolean printWhitespace = true;
    protected boolean printCommas = true;
    protected boolean printTrailingCommas = false;
    protected boolean bareSpecialNumerics = false;
    protected boolean bareRootObject = false;
    protected boolean printUnquotedKeys = false;

    public static JsonGrammar$Builder builder() {
        return new JsonGrammar$Builder();
    }

    public boolean shouldOutputWhitespace() {
        return this.printWhitespace;
    }

    public boolean hasComments() {
        return this.comments;
    }
}

