/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package eu.pb4.placeholders.api.node;

import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.parsers.NodeParser;
import java.util.ArrayList;
import minecraft.class00392;

public record TranslatedNode(String key, String fallback, Object[] args) implements TextNode
{
    public TranslatedNode(String string) {
        this(string, new Object[0]);
    }

    @Deprecated
    public TranslatedNode(String string, Object[] objectArray) {
        this(string, null, new Object[0]);
    }

    public static TranslatedNode of(String string, Object ... objectArray) {
        return new TranslatedNode(string, null, objectArray);
    }

    public TextNode transform(NodeParser nodeParser) {
        if (this.args.length == 0) {
            return this;
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (Object object : this.args()) {
            if (object instanceof TextNode) {
                TextNode textNode = (TextNode)object;
                arrayList.add(nodeParser.parseNode(textNode));
                continue;
            }
            arrayList.add(object);
        }
        return TranslatedNode.ofFallback(this.key(), this.fallback(), arrayList.toArray());
    }

    @Override
    public class00392 toText(ParserContext parserContext, boolean bl) {
        Object[] objectArray = new Object[this.args.length];
        for (int i = 0; i < this.args.length; ++i) {
            Object object;
            Object object2 = this.args[i];
            if (object2 instanceof TextNode) {
                TextNode textNode = (TextNode)object2;
                object = textNode.toText(parserContext, bl);
            } else {
                object = this.args[i];
            }
            objectArray[i] = object;
        }
        return class00392.N((String)this.key(), (String)this.fallback, (Object[])objectArray);
    }

    @Override
    public boolean isDynamic() {
        for (Object object : this.args) {
            TextNode textNode;
            if (!(object instanceof TextNode) || !(textNode = (TextNode)object).isDynamic()) continue;
            return true;
        }
        return false;
    }

    public static TranslatedNode ofFallback(String string, String string2, Object ... objectArray) {
        return new TranslatedNode(string, string2, objectArray);
    }
}

