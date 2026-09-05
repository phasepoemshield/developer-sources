/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  eu.pb4.placeholders.api.ParserContext
 *  eu.pb4.placeholders.api.ParserContext$Key
 *  eu.pb4.placeholders.api.PlaceholderContext
 *  eu.pb4.placeholders.api.PlaceholderHandler
 *  eu.pb4.placeholders.api.Placeholders$PlaceholderGetter
 *  eu.pb4.placeholders.api.node.TextNode
 *  minecraft.class00392
 */
package eu.pb4.placeholders.impl.placeholder;

import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.PlaceholderContext;
import eu.pb4.placeholders.api.PlaceholderHandler;
import eu.pb4.placeholders.api.Placeholders;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.impl.GeneralUtils;
import minecraft.class00392;

public record PlaceholderNode(ParserContext.Key<PlaceholderContext> contextKey, String placeholder, Placeholders.PlaceholderGetter getter, boolean optionalContext, String argument) implements TextNode
{
    public class00392 toText(ParserContext parserContext, boolean bl) {
        PlaceholderContext placeholderContext = (PlaceholderContext)parserContext.get(this.contextKey);
        PlaceholderHandler placeholderHandler = this.getter.getPlaceholder(this.placeholder, parserContext);
        if ((placeholderContext != null || this.optionalContext) && placeholderHandler != null) {
            try {
                return placeholderHandler.onPlaceholderRequest(placeholderContext, this.argument).text();
            }
            catch (Throwable throwable) {
                GeneralUtils.LOGGER.error("Error occurred while parsing placeholder " + this.placeholder + " / " + this.contextKey.key() + "!", throwable);
                return class00392.i();
            }
        }
        if (GeneralUtils.IS_DEV) {
            GeneralUtils.LOGGER.error("Missing context for placeholders requiring them (" + this.placeholder + " / " + this.contextKey.key() + ")!", (Throwable)new NullPointerException());
        }
        return class00392.i();
    }

    public boolean isDynamic() {
        return true;
    }
}

