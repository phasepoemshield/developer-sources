/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class06541
 */
package eu.pb4.placeholders.api.node;

import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.ParserContext$Key;
import eu.pb4.placeholders.api.node.TextNode;
import java.util.function.Function;
import minecraft.class00392;
import minecraft.class06541;

public record DynamicTextNode(String id, ParserContext$Key<Function<String, class00392>> key) implements TextNode
{
    public static DynamicTextNode of(String string, ParserContext$Key<Function<String, class00392>> parserContext$Key) {
        return new DynamicTextNode(string, parserContext$Key);
    }

    public static ParserContext$Key<Function<String, class00392>> key(String string) {
        return new ParserContext$Key<Function<String, class00392>>("dynamic:" + string, null);
    }

    @Override
    public class00392 toText(ParserContext parserContext, boolean bl) {
        Function<String, class00392> function = parserContext.get(this.key);
        if (function != null) {
            class00392 class003922 = function.apply(this.id);
            if (class003922 != null) {
                return class003922;
            }
            return class00392.y((String)("[INVALID KEY " + this.key.key() + " | " + this.id + "]")).N(class06541.field_1056).y(0xFF0000);
        }
        return class00392.y((String)("[MISSING CONTEXT FOR " + this.key.key() + " | " + this.id + "]")).N(class06541.field_1056).y(0xFF0000);
    }

    @Override
    public boolean isDynamic() {
        return true;
    }
}

