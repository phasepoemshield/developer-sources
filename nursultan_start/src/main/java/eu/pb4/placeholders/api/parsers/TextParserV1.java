/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  eu.pb4.placeholders.api.node.LiteralNode
 *  eu.pb4.placeholders.api.node.TextNode
 *  eu.pb4.placeholders.api.node.parent.ParentNode
 *  eu.pb4.placeholders.api.node.parent.ParentTextNode
 *  eu.pb4.placeholders.api.parsers.NodeParser
 */
package eu.pb4.placeholders.api.parsers;

import com.google.common.collect.ImmutableList;
import eu.pb4.placeholders.api.node.LiteralNode;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.node.parent.ParentNode;
import eu.pb4.placeholders.api.node.parent.ParentTextNode;
import eu.pb4.placeholders.api.parsers.NodeParser;
import eu.pb4.placeholders.api.parsers.TextParserV1$NodeList;
import eu.pb4.placeholders.api.parsers.TextParserV1$TagNodeBuilder;
import eu.pb4.placeholders.api.parsers.TextParserV1$TagParserGetter;
import eu.pb4.placeholders.api.parsers.TextParserV1$TextTag;
import eu.pb4.placeholders.impl.textparser.TextParserImpl;
import eu.pb4.placeholders.impl.textparser.TextTagsV1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated(forRemoval=true)
public class TextParserV1
implements NodeParser {
    public static final TextParserV1 DEFAULT = new TextParserV1();
    public static final TextParserV1 SAFE = new TextParserV1();
    private boolean allowOverrides = false;
    private final List<TextParserV1$TextTag> tags = new ArrayList<TextParserV1$TextTag>();
    private final Map<String, TextParserV1$TextTag> byName = new HashMap<String, TextParserV1$TextTag>();
    private final Map<String, TextParserV1$TextTag> byNameAlias = new HashMap<String, TextParserV1$TextTag>();

    static {
        TextTagsV1.register();
    }

    public void register(TextParserV1$TextTag textParserV1$TextTag) {
        if (this.byName.containsKey(textParserV1$TextTag.name())) {
            if (this.allowOverrides) {
                this.tags.removeIf(textParserV1$TextTag2 -> textParserV1$TextTag2.name().equals(textParserV1$TextTag.name()));
            } else {
                throw new RuntimeException("Duplicate tag identifier!");
            }
        }
        this.byName.put(textParserV1$TextTag.name(), textParserV1$TextTag);
        this.tags.add(textParserV1$TextTag);
        this.byNameAlias.put(textParserV1$TextTag.name(), textParserV1$TextTag);
        if (textParserV1$TextTag.aliases() != null) {
            for (int i = 0; i < textParserV1$TextTag.aliases().length; ++i) {
                String string = textParserV1$TextTag.aliases()[i];
                TextParserV1$TextTag textParserV1$TextTag3 = this.byNameAlias.get(string);
                if (textParserV1$TextTag3 != null && textParserV1$TextTag3.name().equals(string)) continue;
                this.byNameAlias.put(string, textParserV1$TextTag);
            }
        }
    }

    public TextParserV1 copy() {
        TextParserV1 textParserV1 = new TextParserV1();
        for (TextParserV1$TextTag textParserV1$TextTag : this.tags) {
            textParserV1.register(textParserV1$TextTag);
        }
        return textParserV1;
    }

    public TextParserV1$TextTag getTag(String string) {
        TextParserV1$TextTag textParserV1$TextTag = this.byNameAlias.get(string);
        return textParserV1$TextTag;
    }

    public static TextParserV1 createSafe() {
        return SAFE.copy();
    }

    public TextNode[] parseNodes(TextNode textNode) {
        return TextParserV1.parseNodesWith(textNode, this::getTagParser);
    }

    public List<TextParserV1$TextTag> getTags() {
        return ImmutableList.copyOf(this.tags);
    }

    public static TextNode[] parseNodesWith(TextNode textNode, TextParserV1$TagParserGetter textParserV1$TagParserGetter) {
        if (textNode instanceof LiteralNode) {
            LiteralNode literalNode = (LiteralNode)textNode;
            return TextParserImpl.parse(literalNode.value(), textParserV1$TagParserGetter);
        }
        if (textNode instanceof ParentTextNode) {
            ParentTextNode parentTextNode = (ParentTextNode)textNode;
            ArrayList<ParentNode> arrayList = new ArrayList<ParentNode>();
            for (TextNode textNode2 : parentTextNode.getChildren()) {
                arrayList.add(new ParentNode(TextParserV1.parseNodesWith(textNode2, textParserV1$TagParserGetter)));
            }
            return arrayList.toArray(new TextNode[0]);
        }
        return new TextNode[]{textNode};
    }

    public static TextParserV1$NodeList parseNodesWith(String string, TextParserV1$TagParserGetter textParserV1$TagParserGetter, String string2) {
        return TextParserImpl.recursiveParsing(string, textParserV1$TagParserGetter, string2);
    }

    public TextParserV1$TagNodeBuilder getTagParser(String string) {
        TextParserV1$TextTag textParserV1$TextTag = this.byNameAlias.get(string);
        return textParserV1$TextTag != null ? textParserV1$TextTag.parser() : null;
    }

    public static void registerDefault(TextParserV1$TextTag textParserV1$TextTag) {
        DEFAULT.register(textParserV1$TextTag);
        if (textParserV1$TextTag.userSafe()) {
            SAFE.register(textParserV1$TextTag);
        }
    }

    public static TextParserV1 createDefault() {
        return DEFAULT.copy();
    }
}

