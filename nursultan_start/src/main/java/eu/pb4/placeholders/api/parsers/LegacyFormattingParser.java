/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.StringReader
 *  eu.pb4.placeholders.impl.textparser.TextParserImpl
 *  it.unimi.dsi.fastutil.chars.Char2ObjectOpenHashMap
 *  minecraft.class05194
 *  minecraft.class06541
 */
package eu.pb4.placeholders.api.parsers;

import com.mojang.brigadier.StringReader;
import eu.pb4.placeholders.api.node.LiteralNode;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.node.TranslatedNode;
import eu.pb4.placeholders.api.node.parent.ColorNode;
import eu.pb4.placeholders.api.node.parent.FormattingNode;
import eu.pb4.placeholders.api.node.parent.ParentTextNode;
import eu.pb4.placeholders.api.parsers.NodeParser;
import eu.pb4.placeholders.impl.textparser.TextParserImpl;
import it.unimi.dsi.fastutil.chars.Char2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import minecraft.class05194;
import minecraft.class06541;

public class LegacyFormattingParser
implements NodeParser {
    public static NodeParser COLORS = new LegacyFormattingParser(true, (class06541[])Arrays.stream(class06541.values()).filter(class065412 -> !class065412.u()).toArray(class06541[]::new));
    public static NodeParser BASE_COLORS = new LegacyFormattingParser(false, (class06541[])Arrays.stream(class06541.values()).filter(class065412 -> !class065412.u()).toArray(class06541[]::new));
    public static NodeParser ALL = new LegacyFormattingParser(true, class06541.values());
    private final Char2ObjectOpenHashMap<class06541> map = new Char2ObjectOpenHashMap();
    private final boolean allowRgb;

    public LegacyFormattingParser(boolean bl, class06541 ... class06541Array) {
        this.allowRgb = bl;
        for (class06541 class065412 : class06541Array) {
            this.map.put(class065412.N(), (Object)class065412);
        }
    }

    public boolean allowRGB() {
        return this.allowRgb;
    }

    public TextNode[] parseNodes(TextNode textNode, List<TextNode> list) {
        if (textNode instanceof LiteralNode) {
            LiteralNode literalNode = (LiteralNode)textNode;
            return this.parseLiteral(literalNode, list);
        }
        if (textNode instanceof TranslatedNode) {
            TranslatedNode translatedNode = (TranslatedNode)textNode;
            return new TextNode[]{translatedNode.transform(this)};
        }
        if (textNode instanceof ParentTextNode) {
            ParentTextNode parentTextNode = (ParentTextNode)textNode;
            return this.parseParents(parentTextNode);
        }
        return new TextNode[]{textNode};
    }

    @Override
    public TextNode[] parseNodes(TextNode textNode) {
        return this.parseNodes(textNode, new ArrayList<TextNode>());
    }

    private TextNode[] parseLiteral(LiteralNode literalNode, List<TextNode> list) {
        StringBuilder stringBuilder = new StringBuilder();
        StringReader stringReader = new StringReader(literalNode.value());
        while (stringReader.canRead(2)) {
            char c = stringReader.read();
            if (c == '\\') {
                c = stringReader.read();
                stringBuilder.append('\\');
                stringBuilder.append(c);
            } else if (c == '&') {
                class06541 class065412;
                c = stringReader.read();
                if (this.allowRgb && c == '#' && stringReader.canRead(6)) {
                    int n = stringReader.getCursor();
                    try {
                        int n2;
                        StringBuilder stringBuilder2 = new StringBuilder();
                        for (n2 = 0; n2 < 6; ++n2) {
                            stringBuilder2.append(stringReader.read());
                        }
                        n2 = Integer.parseInt(stringBuilder2.toString(), 16);
                        ArrayList<TextNode> arrayList = new ArrayList<TextNode>();
                        arrayList.addAll(list);
                        list.clear();
                        TextNode textNode = TextNode.asSingle(this.parseLiteral(new LiteralNode(stringReader.getRemaining()), arrayList));
                        arrayList.add(0, textNode);
                        return new TextNode[]{new LiteralNode(stringBuilder.toString()), new ColorNode(arrayList.toArray(TextParserImpl.CASTER), class05194.N((int)n2))};
                    }
                    catch (Throwable throwable) {
                        stringReader.setCursor(n);
                    }
                }
                if ((class065412 = (class06541)this.map.get(c)) != null) {
                    ArrayList<TextNode> arrayList = new ArrayList<TextNode>();
                    arrayList.addAll(list);
                    list.clear();
                    TextNode textNode = TextNode.asSingle(this.parseLiteral(new LiteralNode(stringReader.getRemaining()), arrayList));
                    arrayList.add(0, textNode);
                    return new TextNode[]{new LiteralNode(stringBuilder.toString()), new FormattingNode(arrayList.toArray(TextParserImpl.CASTER), class065412)};
                }
                stringBuilder.append('&');
            }
            stringBuilder.append(c);
        }
        return new TextNode[]{literalNode};
    }

    private TextNode[] parseParents(ParentTextNode parentTextNode) {
        ArrayList<TextNode> arrayList = new ArrayList<TextNode>();
        if (parentTextNode.getChildren().length > 0) {
            ArrayList<TextNode> arrayList2 = new ArrayList<TextNode>(List.of(parentTextNode.getChildren()));
            while (!arrayList2.isEmpty()) {
                arrayList.add(TextNode.asSingle(this.parseNodes(arrayList2.remove(0), arrayList2)));
            }
        }
        return new TextNode[]{parentTextNode.copyWith(arrayList.toArray(TextParserImpl.CASTER), (NodeParser)this)};
    }

    public Collection<class06541> formatting() {
        return Collections.unmodifiableCollection(this.map.values());
    }
}

