/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.impl.placeholder.PlaceholderNode
 */
package eu.pb4.placeholders.api.parsers;

import eu.pb4.placeholders.api.ParserContext$Key;
import eu.pb4.placeholders.api.Placeholders$PlaceholderGetter;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.parsers.TagLikeParser$Context;
import eu.pb4.placeholders.api.parsers.TagLikeParser$Provider;
import eu.pb4.placeholders.impl.placeholder.PlaceholderNode;

class TagLikeParser$Provider$1
implements TagLikeParser$Provider {
    final /* synthetic */ Placeholders$PlaceholderGetter val$placeholders;
    final /* synthetic */ ParserContext$Key val$contextKey;

    TagLikeParser$Provider$1() {
        this.val$placeholders = var1_1;
        this.val$contextKey = var2_2;
    }

    @Override
    public boolean isValidTag(String string, TagLikeParser$Context tagLikeParser$Context) {
        return this.val$placeholders.exists(string);
    }

    @Override
    public void handleTag(String string, String string2, TagLikeParser$Context tagLikeParser$Context) {
        tagLikeParser$Context.addNode((TextNode)new PlaceholderNode(this.val$contextKey, string, this.val$placeholders, this.val$placeholders.isContextOptional(), string2 != null && !string2.isEmpty() ? string2 : null));
    }
}

