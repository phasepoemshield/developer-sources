/*
 * Decompiled with CFR 0.152.
 */
package eu.pb4.placeholders.api.parsers;

import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.parsers.TagLikeParser$Context;
import eu.pb4.placeholders.api.parsers.TagLikeParser$Provider;
import java.util.function.Function;

class TagLikeParser$Provider$2
implements TagLikeParser$Provider {
    final /* synthetic */ Function val$function;

    TagLikeParser$Provider$2(Function function) {
        this.val$function = function;
    }

    @Override
    public boolean isValidTag(String string, TagLikeParser$Context tagLikeParser$Context) {
        return this.val$function.apply(string) != null;
    }

    @Override
    public void handleTag(String string, String string2, TagLikeParser$Context tagLikeParser$Context) {
        TextNode textNode = (TextNode)this.val$function.apply(string);
        if (textNode != null) {
            tagLikeParser$Context.addNode(textNode);
        }
    }
}

