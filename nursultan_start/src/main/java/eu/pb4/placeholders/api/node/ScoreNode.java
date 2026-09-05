/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  minecraft.class00392
 *  minecraft.class08262
 */
package eu.pb4.placeholders.api.node;

import com.mojang.datafixers.util.Either;
import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.node.TextNode;
import minecraft.class00392;
import minecraft.class08262;

public record ScoreNode(Either<class08262, String> name, String objective) implements TextNode
{
    public ScoreNode(String string, String string2) {
        this((Either<class08262, String>)class08262.N((String)string).result().map(Either::left).orElse(Either.right((Object)string)), string2);
    }

    @Override
    public class00392 toText(ParserContext parserContext, boolean bl) {
        return (class00392)this.name.map(class082622 -> class00392.N((class08262)class082622, (String)this.objective), string -> class00392.y((String)string, (String)this.objective));
    }
}

