/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.api.parsers.TagLikeParser
 *  eu.pb4.placeholders.api.parsers.TagLikeParser$Context
 *  eu.pb4.placeholders.api.parsers.TagLikeParser$Format
 *  eu.pb4.placeholders.api.parsers.TagLikeParser$Provider
 */
package eu.pb4.placeholders.impl.textparser;

import eu.pb4.placeholders.api.parsers.TagLikeParser;

public class SingleTagLikeParser
extends TagLikeParser {
    private final TagLikeParser.Format format;
    private final TagLikeParser.Provider provider;

    public SingleTagLikeParser(TagLikeParser.Format format, TagLikeParser.Provider provider) {
        this.format = format;
        this.provider = provider;
    }

    public TagLikeParser.Format format() {
        return this.format;
    }

    public TagLikeParser.Provider provider() {
        return this.provider;
    }

    public void handleLiteral(String string, TagLikeParser.Context context) {
        int n = 0;
        while (n != -1) {
            n = this.handleTag(string, n, this.format.findFirst(string, n, this.provider, context), this.provider, context);
        }
    }
}

