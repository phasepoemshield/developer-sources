/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  eu.pb4.placeholders.impl.textparser.TextParserImpl
 *  minecraft.class00401
 *  minecraft.class00654
 *  minecraft.class06541
 */
package eu.pb4.placeholders.api.parsers;

import com.mojang.brigadier.StringReader;
import eu.pb4.placeholders.api.node.LiteralNode;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.node.TranslatedNode;
import eu.pb4.placeholders.api.node.parent.ClickActionNode;
import eu.pb4.placeholders.api.node.parent.FormattingNode;
import eu.pb4.placeholders.api.node.parent.HoverNode;
import eu.pb4.placeholders.api.node.parent.HoverNode$Action;
import eu.pb4.placeholders.api.node.parent.ParentTextNode;
import eu.pb4.placeholders.api.parsers.MarkdownLiteParserV1$MarkdownFormat;
import eu.pb4.placeholders.api.parsers.MarkdownLiteParserV1$SubNode;
import eu.pb4.placeholders.api.parsers.MarkdownLiteParserV1$SubNodeType;
import eu.pb4.placeholders.api.parsers.NodeParser;
import eu.pb4.placeholders.impl.textparser.TextParserImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.ListIterator;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import minecraft.class00401;
import minecraft.class00654;
import minecraft.class06541;

public final class MarkdownLiteParserV1
implements NodeParser {
    public static NodeParser ALL = new MarkdownLiteParserV1(MarkdownLiteParserV1$MarkdownFormat.values());
    private final EnumSet<MarkdownLiteParserV1$MarkdownFormat> allowedFormatting = EnumSet.noneOf(MarkdownLiteParserV1$MarkdownFormat.class);
    private final Function<TextNode[], TextNode> spoilerFormatting;
    private final Function<TextNode[], TextNode> backtickFormatting;
    private final BiFunction<TextNode[], TextNode, TextNode> urlFormatting;

    public MarkdownLiteParserV1(Function<TextNode[], TextNode> function, Function<TextNode[], TextNode> function2, BiFunction<TextNode[], TextNode, TextNode> biFunction, MarkdownLiteParserV1$MarkdownFormat ... markdownLiteParserV1$MarkdownFormatArray) {
        this.allowedFormatting.addAll(Arrays.asList(markdownLiteParserV1$MarkdownFormatArray));
        this.spoilerFormatting = function;
        this.backtickFormatting = function2;
        this.urlFormatting = biFunction;
    }

    public MarkdownLiteParserV1(Function<TextNode[], TextNode> function, Function<TextNode[], TextNode> function2, MarkdownLiteParserV1$MarkdownFormat ... markdownLiteParserV1$MarkdownFormatArray) {
        this(function, function2, MarkdownLiteParserV1::defaultUrlFormatting, markdownLiteParserV1$MarkdownFormatArray);
    }

    public MarkdownLiteParserV1(MarkdownLiteParserV1$MarkdownFormat ... markdownLiteParserV1$MarkdownFormatArray) {
        this(MarkdownLiteParserV1::defaultSpoilerFormatting, MarkdownLiteParserV1::defaultQuoteFormatting, markdownLiteParserV1$MarkdownFormatArray);
    }

    private TextNode[] parseSubNodes(ListIterator<MarkdownLiteParserV1$SubNode<?>> listIterator, MarkdownLiteParserV1$SubNodeType markdownLiteParserV1$SubNodeType, int n) {
        ArrayList<TextNode> arrayList = new ArrayList<TextNode>();
        int n2 = listIterator.nextIndex();
        StringBuilder stringBuilder = new StringBuilder();
        while (listIterator.hasNext()) {
            int n3;
            MarkdownLiteParserV1$SubNode<?> markdownLiteParserV1$SubNode = listIterator.next();
            if (markdownLiteParserV1$SubNode.type == markdownLiteParserV1$SubNodeType) {
                n3 = 1;
                if (n3 == n) {
                    if (!stringBuilder.isEmpty()) {
                        arrayList.add(new LiteralNode(stringBuilder.toString()));
                    }
                    return arrayList.toArray(TextParserImpl.CASTER);
                }
                int n4 = listIterator.nextIndex();
                while (listIterator.hasNext() && listIterator.next().type == markdownLiteParserV1$SubNodeType) {
                    if (++n3 != n) continue;
                    if (listIterator.hasNext()) {
                        MarkdownLiteParserV1$SubNode<?> markdownLiteParserV1$SubNode2 = listIterator.next();
                        listIterator.previous();
                        if (markdownLiteParserV1$SubNode2.type == MarkdownLiteParserV1$SubNodeType.STRING && !((String)markdownLiteParserV1$SubNode2.value).startsWith(" ")) break;
                    }
                    if (!stringBuilder.isEmpty()) {
                        arrayList.add(new LiteralNode(stringBuilder.toString()));
                    }
                    return arrayList.toArray(TextParserImpl.CASTER);
                }
                while (n4 != listIterator.nextIndex()) {
                    listIterator.previous();
                }
            }
            if (markdownLiteParserV1$SubNode.type == MarkdownLiteParserV1$SubNodeType.TEXT_NODE) {
                if (!stringBuilder.isEmpty()) {
                    arrayList.add(new LiteralNode(stringBuilder.toString()));
                    stringBuilder = new StringBuilder();
                }
                arrayList.add((TextNode)markdownLiteParserV1$SubNode.value);
                continue;
            }
            if (markdownLiteParserV1$SubNode.type == MarkdownLiteParserV1$SubNodeType.STRING) {
                stringBuilder.append((String)markdownLiteParserV1$SubNode.value);
                continue;
            }
            if (markdownLiteParserV1$SubNode.type == MarkdownLiteParserV1$SubNodeType.BACK_TICK && this.allowedFormatting.contains((Object)MarkdownLiteParserV1$MarkdownFormat.QUOTE)) {
                TextNode[] textNodeArray = this.parseSubNodes(listIterator, markdownLiteParserV1$SubNode.type, 1);
                if (textNodeArray != null) {
                    if (!stringBuilder.isEmpty()) {
                        arrayList.add(new LiteralNode(stringBuilder.toString()));
                        stringBuilder = new StringBuilder();
                    }
                    arrayList.add(this.backtickFormatting.apply(textNodeArray));
                    continue;
                }
            } else if (markdownLiteParserV1$SubNode.type == MarkdownLiteParserV1$SubNodeType.SPOILER_LINE && this.allowedFormatting.contains((Object)MarkdownLiteParserV1$MarkdownFormat.SPOILER)) {
                TextNode[] textNodeArray = this.parseSubNodes(listIterator, markdownLiteParserV1$SubNode.type, 1);
                if (textNodeArray != null) {
                    if (!stringBuilder.isEmpty()) {
                        arrayList.add(new LiteralNode(stringBuilder.toString()));
                        stringBuilder = new StringBuilder();
                    }
                    arrayList.add(this.spoilerFormatting.apply(textNodeArray));
                    continue;
                }
            } else if (markdownLiteParserV1$SubNode.type == MarkdownLiteParserV1$SubNodeType.DOUBLE_WAVY_LINE && this.allowedFormatting.contains((Object)MarkdownLiteParserV1$MarkdownFormat.STRIKETHROUGH)) {
                TextNode[] textNodeArray = this.parseSubNodes(listIterator, markdownLiteParserV1$SubNode.type, 1);
                if (textNodeArray != null) {
                    if (!stringBuilder.isEmpty()) {
                        arrayList.add(new LiteralNode(stringBuilder.toString()));
                        stringBuilder = new StringBuilder();
                    }
                    arrayList.add(new FormattingNode(textNodeArray, class06541.field_1055));
                    continue;
                }
            } else if (markdownLiteParserV1$SubNode.type == MarkdownLiteParserV1$SubNodeType.DOUBLE_STAR && this.allowedFormatting.contains((Object)MarkdownLiteParserV1$MarkdownFormat.BOLD)) {
                TextNode[] textNodeArray = this.parseSubNodes(listIterator, markdownLiteParserV1$SubNode.type, 1);
                if (textNodeArray != null) {
                    if (!stringBuilder.isEmpty()) {
                        arrayList.add(new LiteralNode(stringBuilder.toString()));
                        stringBuilder = new StringBuilder();
                    }
                    arrayList.add(new FormattingNode(textNodeArray, class06541.field_1067));
                    continue;
                }
            } else if (markdownLiteParserV1$SubNode.type == MarkdownLiteParserV1$SubNodeType.DOUBLE_FLOOR && this.allowedFormatting.contains((Object)MarkdownLiteParserV1$MarkdownFormat.UNDERLINE)) {
                TextNode[] textNodeArray = this.parseSubNodes(listIterator, markdownLiteParserV1$SubNode.type, 1);
                if (textNodeArray != null) {
                    if (!stringBuilder.isEmpty()) {
                        arrayList.add(new LiteralNode(stringBuilder.toString()));
                        stringBuilder = new StringBuilder();
                    }
                    arrayList.add(new FormattingNode(textNodeArray, class06541.field_1073));
                    continue;
                }
            } else if ((markdownLiteParserV1$SubNode.type == MarkdownLiteParserV1$SubNodeType.STAR || markdownLiteParserV1$SubNode.type == MarkdownLiteParserV1$SubNodeType.FLOOR) && this.allowedFormatting.contains((Object)MarkdownLiteParserV1$MarkdownFormat.ITALIC)) {
                TextNode[] textNodeArray;
                if (listIterator.hasPrevious()) {
                    MarkdownLiteParserV1$SubNode<?> markdownLiteParserV1$SubNode3 = listIterator.previous();
                    n3 = markdownLiteParserV1$SubNode3.type != MarkdownLiteParserV1$SubNodeType.STRING || ((String)markdownLiteParserV1$SubNode3.value).endsWith(" ") ? 1 : 0;
                    listIterator.next();
                } else {
                    n3 = 1;
                }
                if (n3 != 0 && (textNodeArray = this.parseSubNodes(listIterator, markdownLiteParserV1$SubNode.type, 1)) != null) {
                    if (!stringBuilder.isEmpty()) {
                        arrayList.add(new LiteralNode(stringBuilder.toString()));
                        stringBuilder = new StringBuilder();
                    }
                    arrayList.add(new FormattingNode(textNodeArray, class06541.field_1056));
                    continue;
                }
            } else if (markdownLiteParserV1$SubNode.type == MarkdownLiteParserV1$SubNodeType.SQR_BRACKET_OPEN && this.allowedFormatting.contains((Object)MarkdownLiteParserV1$MarkdownFormat.URL) && listIterator.hasNext()) {
                n3 = listIterator.nextIndex();
                TextNode[] textNodeArray = this.parseSubNodes(listIterator, MarkdownLiteParserV1$SubNodeType.SQR_BRACKET_CLOSE, 1);
                if (textNodeArray != null && listIterator.hasNext()) {
                    TextNode[] textNodeArray2;
                    boolean bl;
                    boolean bl2 = bl = listIterator.next().type == MarkdownLiteParserV1$SubNodeType.BRACKET_OPEN;
                    if (bl && (textNodeArray2 = this.parseSubNodes(listIterator, MarkdownLiteParserV1$SubNodeType.BRACKET_CLOSE, 1)) != null) {
                        if (!stringBuilder.isEmpty()) {
                            arrayList.add(new LiteralNode(stringBuilder.toString()));
                            stringBuilder = new StringBuilder();
                        }
                        arrayList.add(this.urlFormatting.apply(textNodeArray, TextNode.asSingle(textNodeArray2)));
                        continue;
                    }
                }
                while (n3 != listIterator.nextIndex()) {
                    listIterator.previous();
                }
            }
            stringBuilder.append((String)markdownLiteParserV1$SubNode.value);
        }
        if (markdownLiteParserV1$SubNodeType == null) {
            if (!stringBuilder.isEmpty()) {
                arrayList.add(new LiteralNode(stringBuilder.toString()));
            }
            return arrayList.toArray(TextParserImpl.CASTER);
        }
        while (n2 != listIterator.nextIndex()) {
            listIterator.previous();
        }
        return null;
    }

    @Override
    public TextNode[] parseNodes(TextNode textNode) {
        if (textNode instanceof LiteralNode) {
            LiteralNode literalNode = (LiteralNode)textNode;
            ArrayList arrayList = new ArrayList();
            this.parseLiteral(literalNode, arrayList::add);
            return this.parseSubNodes(arrayList.listIterator(), null, -1);
        }
        if (textNode instanceof TranslatedNode) {
            TranslatedNode translatedNode = (TranslatedNode)textNode;
            return new TextNode[]{translatedNode.transform(this)};
        }
        if (textNode instanceof ParentTextNode) {
            ParentTextNode parentTextNode = (ParentTextNode)textNode;
            ArrayList<MarkdownLiteParserV1$SubNode<TextNode>> arrayList = new ArrayList<MarkdownLiteParserV1$SubNode<TextNode>>();
            for (TextNode textNode2 : parentTextNode.getChildren()) {
                if (textNode2 instanceof LiteralNode) {
                    LiteralNode literalNode = (LiteralNode)textNode2;
                    this.parseLiteral(literalNode, arrayList::add);
                    continue;
                }
                arrayList.add(new MarkdownLiteParserV1$SubNode<TextNode>(MarkdownLiteParserV1$SubNodeType.TEXT_NODE, TextNode.asSingle(this.parseNodes(textNode2))));
            }
            return new TextNode[]{parentTextNode.copyWith(this.parseSubNodes(arrayList.listIterator(), null, -1), (NodeParser)this)};
        }
        return new TextNode[]{textNode};
    }

    private void parseLiteral(LiteralNode literalNode, Consumer<MarkdownLiteParserV1$SubNode<?>> consumer) {
        StringReader stringReader = new StringReader(literalNode.value());
        StringBuilder stringBuilder = new StringBuilder();
        while (stringReader.canRead()) {
            char c = stringReader.read();
            if (c == '\\' && stringReader.canRead()) {
                char c2 = stringReader.read();
                stringBuilder.append(c);
                stringBuilder.append(c2);
                continue;
            }
            MarkdownLiteParserV1$SubNodeType<String> markdownLiteParserV1$SubNodeType = null;
            if (stringReader.canRead()) {
                char c3 = stringReader.read();
                if (c3 == c) {
                    switch (c) {
                        case '~': {
                            MarkdownLiteParserV1$SubNodeType<String> markdownLiteParserV1$SubNodeType2 = MarkdownLiteParserV1$SubNodeType.DOUBLE_WAVY_LINE;
                            break;
                        }
                        case '|': {
                            MarkdownLiteParserV1$SubNodeType<String> markdownLiteParserV1$SubNodeType2 = MarkdownLiteParserV1$SubNodeType.SPOILER_LINE;
                            break;
                        }
                        case '_': {
                            MarkdownLiteParserV1$SubNodeType<String> markdownLiteParserV1$SubNodeType2 = MarkdownLiteParserV1$SubNodeType.DOUBLE_FLOOR;
                            break;
                        }
                        case '*': {
                            MarkdownLiteParserV1$SubNodeType<String> markdownLiteParserV1$SubNodeType2 = MarkdownLiteParserV1$SubNodeType.DOUBLE_STAR;
                            break;
                        }
                        default: {
                            MarkdownLiteParserV1$SubNodeType<String> markdownLiteParserV1$SubNodeType2 = markdownLiteParserV1$SubNodeType = null;
                        }
                    }
                }
                if (markdownLiteParserV1$SubNodeType == null) {
                    stringReader.setCursor(stringReader.getCursor() - 1);
                }
            }
            if (markdownLiteParserV1$SubNodeType == null) {
                switch (c) {
                    case '`': {
                        MarkdownLiteParserV1$SubNodeType<String> markdownLiteParserV1$SubNodeType3 = MarkdownLiteParserV1$SubNodeType.BACK_TICK;
                        break;
                    }
                    case '*': {
                        MarkdownLiteParserV1$SubNodeType<String> markdownLiteParserV1$SubNodeType3 = MarkdownLiteParserV1$SubNodeType.STAR;
                        break;
                    }
                    case '_': {
                        MarkdownLiteParserV1$SubNodeType<String> markdownLiteParserV1$SubNodeType3;
                        if (stringReader.getCursor() == 1 || !stringReader.canRead() || Character.isWhitespace(stringReader.peek(-2)) || Character.isWhitespace(stringReader.peek())) {
                            markdownLiteParserV1$SubNodeType3 = MarkdownLiteParserV1$SubNodeType.FLOOR;
                            break;
                        }
                        markdownLiteParserV1$SubNodeType3 = null;
                        break;
                    }
                    case '(': {
                        MarkdownLiteParserV1$SubNodeType<String> markdownLiteParserV1$SubNodeType3 = MarkdownLiteParserV1$SubNodeType.BRACKET_OPEN;
                        break;
                    }
                    case ')': {
                        MarkdownLiteParserV1$SubNodeType<String> markdownLiteParserV1$SubNodeType3 = MarkdownLiteParserV1$SubNodeType.BRACKET_CLOSE;
                        break;
                    }
                    case '[': {
                        MarkdownLiteParserV1$SubNodeType<String> markdownLiteParserV1$SubNodeType3 = MarkdownLiteParserV1$SubNodeType.SQR_BRACKET_OPEN;
                        break;
                    }
                    case ']': {
                        MarkdownLiteParserV1$SubNodeType<String> markdownLiteParserV1$SubNodeType3 = MarkdownLiteParserV1$SubNodeType.SQR_BRACKET_CLOSE;
                        break;
                    }
                    default: {
                        MarkdownLiteParserV1$SubNodeType<String> markdownLiteParserV1$SubNodeType3 = markdownLiteParserV1$SubNodeType = null;
                    }
                }
            }
            if (markdownLiteParserV1$SubNodeType != null) {
                if (!stringBuilder.isEmpty()) {
                    consumer.accept(new MarkdownLiteParserV1$SubNode<String>(MarkdownLiteParserV1$SubNodeType.STRING, stringBuilder.toString()));
                    stringBuilder = new StringBuilder();
                }
                consumer.accept(new MarkdownLiteParserV1$SubNode<String>(markdownLiteParserV1$SubNodeType, (String)markdownLiteParserV1$SubNodeType.selfValue));
                continue;
            }
            stringBuilder.append(c);
        }
        if (!stringBuilder.isEmpty()) {
            consumer.accept(new MarkdownLiteParserV1$SubNode<String>(MarkdownLiteParserV1$SubNodeType.STRING, stringBuilder.toString()));
        }
    }

    public static TextNode defaultUrlFormatting(TextNode[] textNodeArray, TextNode textNode) {
        return new ClickActionNode(TextNode.array(new FormattingNode(textNodeArray, class06541.field_1078, class06541.field_1073)), class00654.field_11749, textNode);
    }

    public static TextNode defaultSpoilerFormatting(TextNode[] textNodeArray) {
        return new HoverNode<TextNode, class00401>(TextNode.array(new FormattingNode(TextNode.array(TextNode.of("["), TranslatedNode.of("options.hidden", new Object[0]), TextNode.of("]")), class06541.field_1080, class06541.field_1056)), HoverNode$Action.TEXT_NODE, TextNode.asSingle(textNodeArray));
    }

    public static TextNode defaultQuoteFormatting(TextNode[] textNodeArray) {
        return new FormattingNode(textNodeArray, class06541.field_1080, class06541.field_1056);
    }
}

