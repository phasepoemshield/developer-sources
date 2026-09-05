/*
 * Decompiled with CFR 0.152.
 */
package eu.pb4.placeholders.api.parsers;

import eu.pb4.placeholders.api.ParserContext$Key;
import eu.pb4.placeholders.api.node.DynamicTextNode;
import eu.pb4.placeholders.api.parsers.TagLikeParser$Context;
import eu.pb4.placeholders.api.parsers.TagLikeParser$Provider;

class TagLikeParser$Provider$4
implements TagLikeParser$Provider {
    final /* synthetic */ ParserContext$Key val$key;

    TagLikeParser$Provider$4(ParserContext$Key parserContext$Key) {
        this.val$key = parserContext$Key;
    }

    @Override
    public boolean isValidTag(String string, TagLikeParser$Context tagLikeParser$Context) {
        return true;
    }

    @Override
    public void handleTag(String string, String string2, TagLikeParser$Context tagLikeParser$Context) {
        tagLikeParser$Context.addNode(new DynamicTextNode(string, this.val$key));
    }
}

