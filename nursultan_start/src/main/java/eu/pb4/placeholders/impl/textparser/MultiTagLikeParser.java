/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.api.node.LiteralNode
 *  eu.pb4.placeholders.api.node.TextNode
 *  eu.pb4.placeholders.api.parsers.TagLikeParser
 *  eu.pb4.placeholders.api.parsers.TagLikeParser$Context
 *  eu.pb4.placeholders.api.parsers.TagLikeParser$Format
 *  eu.pb4.placeholders.api.parsers.TagLikeParser$Format$Tag
 *  eu.pb4.placeholders.api.parsers.TagLikeParser$Provider
 *  org.apache.commons.lang3.tuple.Pair
 */
package eu.pb4.placeholders.impl.textparser;

import eu.pb4.placeholders.api.node.LiteralNode;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.parsers.TagLikeParser;
import java.util.Arrays;
import java.util.Comparator;
import org.apache.commons.lang3.tuple.Pair;

public class MultiTagLikeParser
extends TagLikeParser {
    private final Pair<TagLikeParser.Format, TagLikeParser.Provider>[] pairs;

    public Pair<TagLikeParser.Format, TagLikeParser.Provider>[] pairs() {
        return this.pairs;
    }

    public MultiTagLikeParser(Pair<TagLikeParser.Format, TagLikeParser.Provider>[] pairArray) {
        Pair<TagLikeParser.Format, TagLikeParser.Provider>[] pairArray2 = Arrays.copyOf(pairArray, pairArray.length);
        Arrays.sort(pairArray2, Comparator.comparingInt(pair -> ((TagLikeParser.Format)pair.getLeft()).index()));
        this.pairs = pairArray2;
    }

    public void handleLiteral(String string, TagLikeParser.Context context) {
        int n = 0;
        while (n != -1) {
            TagLikeParser.Provider provider = null;
            TagLikeParser.Format.Tag tag = null;
            for (int i = n; i < string.length(); ++i) {
                for (Pair<TagLikeParser.Format, TagLikeParser.Provider> pair : this.pairs) {
                    TagLikeParser.Format.Tag tag2 = ((TagLikeParser.Format)pair.getLeft()).findAt(string, i, (TagLikeParser.Provider)pair.getRight(), context);
                    if (tag2 == null || tag != null && tag2.start() >= tag.start()) continue;
                    provider = (TagLikeParser.Provider)pair.getRight();
                    tag = tag2;
                }
                if (tag != null) break;
                if (string.charAt(i) != '\\' || string.length() <= i + 1) continue;
                ++i;
            }
            if (provider != null) {
                n = this.handleTag(string, n, tag, provider, context);
                continue;
            }
            context.addNode((TextNode)new LiteralNode(string.substring(n)));
            n = -1;
        }
    }
}

