/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.api.node.TextNode
 *  eu.pb4.placeholders.api.parsers.NodeParser
 *  eu.pb4.placeholders.api.parsers.TagLikeParser$Format
 *  eu.pb4.placeholders.api.parsers.TagLikeParser$Provider
 *  eu.pb4.placeholders.api.parsers.TagLikeWrapper
 *  org.apache.commons.lang3.tuple.Pair
 */
package eu.pb4.placeholders.impl.textparser;

import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.parsers.NodeParser;
import eu.pb4.placeholders.api.parsers.TagLikeParser;
import eu.pb4.placeholders.api.parsers.TagLikeWrapper;
import eu.pb4.placeholders.impl.textparser.MultiTagLikeParser;
import eu.pb4.placeholders.impl.textparser.SingleTagLikeParser;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.tuple.Pair;

public record MergedParser(NodeParser[] parsers) implements NodeParser
{
    public MergedParser(NodeParser[] nodeParserArray) {
        ArrayList<Object> arrayList = new ArrayList<Object>(nodeParserArray.length);
        ArrayList<Object> arrayList2 = new ArrayList<Object>(4);
        for (NodeParser nodeParser : nodeParserArray) {
            Object object;
            if (nodeParser instanceof TagLikeWrapper) {
                object = (TagLikeWrapper)nodeParser;
                nodeParser = object.asTagLikeParser();
            }
            if (nodeParser instanceof SingleTagLikeParser) {
                object = (SingleTagLikeParser)nodeParser;
                arrayList2.add(Pair.of((Object)((SingleTagLikeParser)((Object)object)).format(), (Object)((SingleTagLikeParser)((Object)object)).provider()));
                continue;
            }
            if (nodeParser instanceof MultiTagLikeParser) {
                MultiTagLikeParser multiTagLikeParser = (MultiTagLikeParser)nodeParser;
                arrayList2.addAll(List.of(multiTagLikeParser.pairs()));
                continue;
            }
            if (arrayList2.size() == 1) {
                arrayList.add((Object)new SingleTagLikeParser((TagLikeParser.Format)((Pair)arrayList2.get(0)).getLeft(), (TagLikeParser.Provider)((Pair)arrayList2.get(0)).getRight()));
                arrayList2.clear();
            } else if (arrayList2.size() > 1) {
                arrayList.add((Object)new MultiTagLikeParser(arrayList2.toArray(new Pair[0])));
                arrayList2.clear();
            }
            arrayList.add(nodeParser);
        }
        if (arrayList2.size() == 1) {
            arrayList.add((Object)new SingleTagLikeParser((TagLikeParser.Format)((Pair)arrayList2.get(0)).getLeft(), (TagLikeParser.Provider)((Pair)arrayList2.get(0)).getRight()));
        } else if (arrayList2.size() > 1) {
            arrayList.add((Object)new MultiTagLikeParser(arrayList2.toArray(new Pair[0])));
        }
        this.parsers = arrayList.toArray(new NodeParser[0]);
    }

    public TextNode[] parseNodes(TextNode textNode) {
        TextNode[] textNodeArray = new TextNode[]{textNode};
        for (int i = 0; i < this.parsers.length; ++i) {
            textNodeArray = this.parsers[i].parseNodes(TextNode.asSingle((TextNode[])textNodeArray));
        }
        return textNodeArray;
    }
}

