/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.api.parsers.format.SingleCharacterFormat
 *  eu.pb4.placeholders.impl.textparser.MultiTagLikeParser
 *  eu.pb4.placeholders.impl.textparser.SingleTagLikeParser
 *  eu.pb4.placeholders.impl.textparser.providers.LenientFormat
 *  minecraft.class00392
 *  org.apache.commons.lang3.tuple.Pair
 */
package eu.pb4.placeholders.api.parsers;

import eu.pb4.placeholders.api.ParserContext$Key;
import eu.pb4.placeholders.api.PlaceholderContext;
import eu.pb4.placeholders.api.Placeholders$PlaceholderGetter;
import eu.pb4.placeholders.api.node.LiteralNode;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.node.TranslatedNode;
import eu.pb4.placeholders.api.node.parent.ParentTextNode;
import eu.pb4.placeholders.api.parsers.NodeParser;
import eu.pb4.placeholders.api.parsers.TagLikeParser$Context;
import eu.pb4.placeholders.api.parsers.TagLikeParser$Format;
import eu.pb4.placeholders.api.parsers.TagLikeParser$Format$Tag;
import eu.pb4.placeholders.api.parsers.TagLikeParser$Provider;
import eu.pb4.placeholders.api.parsers.TagLikeWrapper;
import eu.pb4.placeholders.api.parsers.format.SingleCharacterFormat;
import eu.pb4.placeholders.impl.textparser.MultiTagLikeParser;
import eu.pb4.placeholders.impl.textparser.SingleTagLikeParser;
import eu.pb4.placeholders.impl.textparser.providers.LenientFormat;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import minecraft.class00392;
import org.apache.commons.lang3.tuple.Pair;

public abstract class TagLikeParser
implements NodeParser,
TagLikeWrapper {
    public static final TagLikeParser$Format TAGS = TagLikeParser$Format.of('<', '>', ' ');
    public static final TagLikeParser$Format TAGS_LENIENT = new LenientFormat();
    public static final TagLikeParser$Format TAGS_LEGACY = new SingleCharacterFormat('<', '>', ':', new char[]{'\''});
    public static final TagLikeParser$Format PLACEHOLDER = TagLikeParser$Format.of('%', '%', ' ');
    public static final TagLikeParser$Format PLACEHOLDER_ALTERNATIVE = TagLikeParser$Format.of('{', '}', ' ');
    public static final TagLikeParser$Format PLACEHOLDER_ALTERNATIVE_DOUBLE = TagLikeParser$Format.of("{{", "}}", " ");
    public static final TagLikeParser$Format PLACEHOLDER_USER = TagLikeParser$Format.of("${", "}", "");
    static final TextNode[] EMPTY = new TextNode[0];

    public static TagLikeParser of(Pair<TagLikeParser$Format, TagLikeParser$Provider> ... pairArray) {
        return new MultiTagLikeParser(pairArray);
    }

    public static TagLikeParser of(TagLikeParser$Format tagLikeParser$Format, TagLikeParser$Provider tagLikeParser$Provider) {
        return new SingleTagLikeParser(tagLikeParser$Format, tagLikeParser$Provider);
    }

    public static TagLikeParser of(Map<TagLikeParser$Format, TagLikeParser$Provider> map) {
        ArrayList<Pair> arrayList = new ArrayList<Pair>(map.size());
        for (Map.Entry<TagLikeParser$Format, TagLikeParser$Provider> entry : map.entrySet()) {
            arrayList.add(Pair.of(entry));
        }
        return new MultiTagLikeParser(arrayList.toArray(new Pair[0]));
    }

    private void parse(TextNode textNode, TagLikeParser$Context tagLikeParser$Context) {
        if (textNode instanceof LiteralNode) {
            LiteralNode literalNode = (LiteralNode)textNode;
            tagLikeParser$Context.input = literalNode.value();
            this.handleLiteral(literalNode.value(), tagLikeParser$Context);
        } else if (textNode instanceof TranslatedNode) {
            TranslatedNode translatedNode = (TranslatedNode)textNode;
            tagLikeParser$Context.addNode(translatedNode.transform(this));
        } else if (textNode instanceof ParentTextNode) {
            ParentTextNode parentTextNode = (ParentTextNode)textNode;
            int n = tagLikeParser$Context.size();
            tagLikeParser$Context.pushWithParser(null, parentTextNode::copyWith);
            for (TextNode textNode2 : parentTextNode.getChildren()) {
                this.parse(textNode2, tagLikeParser$Context);
            }
            tagLikeParser$Context.pop(tagLikeParser$Context.size() - n);
        } else {
            tagLikeParser$Context.addNode(textNode);
        }
    }

    public static TagLikeParser placeholder(TagLikeParser$Format tagLikeParser$Format, ParserContext$Key<PlaceholderContext> parserContext$Key, Placeholders$PlaceholderGetter placeholders$PlaceholderGetter) {
        return new SingleTagLikeParser(tagLikeParser$Format, TagLikeParser$Provider.placeholder(parserContext$Key, placeholders$PlaceholderGetter));
    }

    public static TagLikeParser placeholder(TagLikeParser$Format tagLikeParser$Format, Function<String, TextNode> function) {
        return new SingleTagLikeParser(tagLikeParser$Format, TagLikeParser$Provider.placeholder(function));
    }

    @Override
    public TagLikeParser asTagLikeParser() {
        return this;
    }

    public static TagLikeParser placeholderText(TagLikeParser$Format tagLikeParser$Format, ParserContext$Key<Function<String, class00392>> parserContext$Key) {
        return new SingleTagLikeParser(tagLikeParser$Format, TagLikeParser$Provider.placeholder(parserContext$Key));
    }

    public static TagLikeParser placeholderText(TagLikeParser$Format tagLikeParser$Format, Set<String> set, ParserContext$Key<Function<String, class00392>> parserContext$Key) {
        return new SingleTagLikeParser(tagLikeParser$Format, TagLikeParser$Provider.placeholder(set, parserContext$Key));
    }

    public static TagLikeParser placeholderText(TagLikeParser$Format tagLikeParser$Format, Function<String, class00392> function) {
        return new SingleTagLikeParser(tagLikeParser$Format, TagLikeParser$Provider.placeholderText(function));
    }

    @Override
    public TextNode[] parseNodes(TextNode textNode) {
        TagLikeParser$Context tagLikeParser$Context = new TagLikeParser$Context(this, "");
        this.parse(textNode, tagLikeParser$Context);
        return tagLikeParser$Context.toTextNode();
    }

    protected abstract void handleLiteral(String var1, TagLikeParser$Context var2);

    protected final int handleTag(String string, int n, TagLikeParser$Format$Tag tagLikeParser$Format$Tag, TagLikeParser$Provider tagLikeParser$Provider, TagLikeParser$Context tagLikeParser$Context) {
        if ((tagLikeParser$Format$Tag = tagLikeParser$Provider.modifyTag(tagLikeParser$Format$Tag, tagLikeParser$Context)) == null) {
            tagLikeParser$Context.addNode(new LiteralNode(string.substring(n)));
            return -1;
        }
        if (tagLikeParser$Format$Tag.start() != 0 && tagLikeParser$Format$Tag.start() != n) {
            tagLikeParser$Context.addNode(new LiteralNode(string.substring(n, tagLikeParser$Format$Tag.start())));
        }
        n = tagLikeParser$Format$Tag.end();
        tagLikeParser$Context.currentPos = tagLikeParser$Format$Tag.start;
        tagLikeParser$Provider.handleTag(tagLikeParser$Format$Tag.id(), tagLikeParser$Format$Tag.argument(), tagLikeParser$Context);
        return n;
    }
}

