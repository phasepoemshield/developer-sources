/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.github.douira.glsl_transformer.token_filter.ChannelFilter
 *  io.github.douira.glsl_transformer.token_filter.TokenChannel
 *  org.antlr.v4.runtime.Token
 */
package net.irisshaders.iris.pipeline.transform;

import io.github.douira.glsl_transformer.token_filter.ChannelFilter;
import io.github.douira.glsl_transformer.token_filter.TokenChannel;
import net.irisshaders.iris.pipeline.transform.parameter.Parameters;
import org.antlr.v4.runtime.Token;

class TransformPatcher$1
extends ChannelFilter<Parameters> {
    TransformPatcher$1(TokenChannel tokenChannel) {
        super(tokenChannel);
    }

    public boolean isTokenAllowed(Token token) {
        if (!super.isTokenAllowed(token)) {
            throw new IllegalArgumentException("Unparsed preprocessor directives such as '" + token.getText() + "' may not be present at this stage of shader processing!");
        }
        return true;
    }
}

