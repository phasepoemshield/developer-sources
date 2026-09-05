/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson;

import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonGrammar;

public class JsonGrammar$Builder {
    private JsonGrammar grammar = new JsonGrammar();

    public JsonGrammar build() {
        return this.grammar;
    }

    public JsonGrammar$Builder printTrailingCommas(boolean bl) {
        this.grammar.printTrailingCommas = bl;
        return this;
    }

    public JsonGrammar$Builder bareSpecialNumerics(boolean bl) {
        this.grammar.bareSpecialNumerics = bl;
        return this;
    }

    public JsonGrammar$Builder printCommas(boolean bl) {
        this.grammar.printCommas = bl;
        return this;
    }

    public JsonGrammar$Builder printWhitespace(boolean bl) {
        this.grammar.printWhitespace = bl;
        return this;
    }

    public JsonGrammar$Builder withComments(boolean bl) {
        this.grammar.comments = bl;
        return this;
    }

    public JsonGrammar$Builder bareRootObject(boolean bl) {
        this.grammar.bareRootObject = bl;
        return this;
    }

    public JsonGrammar$Builder printUnquotedKeys(boolean bl) {
        this.grammar.printUnquotedKeys = bl;
        return this;
    }
}

