/*
 * Decompiled with CFR 0.152.
 */
package eu.pb4.placeholders.api.parsers;

import eu.pb4.placeholders.api.ParserContext$Key;
import eu.pb4.placeholders.api.node.DynamicTextNode;
import eu.pb4.placeholders.api.parsers.TagLikeParser$Context;
import eu.pb4.placeholders.api.parsers.TagLikeParser$Provider;
import java.util.Set;

class TagLikeParser$Provider$3
implements TagLikeParser$Provider {
    final /* synthetic */ Set val$validTags;
    final /* synthetic */ ParserContext$Key val$key;

    TagLikeParser$Provider$3() {
        this.val$validTags = var1_1;
        this.val$key = var2_2;
    }

    @Override
    public boolean isValidTag(String string, TagLikeParser$Context tagLikeParser$Context) {
        return this.val$validTags.contains(string);
    }

    @Override
    public void handleTag(String string, String string2, TagLikeParser$Context tagLikeParser$Context) {
        tagLikeParser$Context.addNode(new DynamicTextNode(string, this.val$key));
    }
}

