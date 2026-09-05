/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package eu.pb4.placeholders.api.node;

import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.node.TextNode;
import minecraft.class00392;

public record LiteralNode(String value) implements TextNode
{
    public LiteralNode(StringBuilder stringBuilder) {
        this(stringBuilder.toString());
    }

    @Override
    public class00392 toText(ParserContext parserContext, boolean bl) {
        if (this.value.isEmpty()) {
            return class00392.i();
        }
        if (bl) {
            StringBuilder stringBuilder = new StringBuilder();
            int n = this.value.length();
            for (int i = 0; i < n; ++i) {
                char c = this.value.charAt(i);
                if (c == '\\' && i + 1 < n) {
                    char c2 = this.value.charAt(i + 1);
                    if (Character.isWhitespace(c2) || Character.isLetterOrDigit(c2)) {
                        stringBuilder.append(c);
                        continue;
                    }
                    stringBuilder.append(c2);
                    ++i;
                    continue;
                }
                stringBuilder.append(c);
            }
            return class00392.y((String)stringBuilder.toString());
        }
        return class00392.y((String)this.value());
    }
}

