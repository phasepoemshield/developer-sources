/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.github.douira.glsl_transformer.GLSLLexer
 *  io.github.douira.glsl_transformer.GLSLParser
 *  io.github.douira.glsl_transformer.parser.EnhancedParser$ParsingStrategy
 */
package io.github.douira.glsl_transformer.parser;

import io.github.douira.glsl_transformer.GLSLLexer;
import io.github.douira.glsl_transformer.GLSLParser;
import io.github.douira.glsl_transformer.parser.EnhancedParser;
import io.github.douira.glsl_transformer.token_filter.TokenFilter;

public interface ParserInterface {
    public void setTokenFilter(TokenFilter<?> var1);

    public GLSLParser getParser();

    public void setThrowParseErrors(boolean var1);

    public void setSLLOnly();

    public void setLLOnly();

    public GLSLLexer getLexer();

    public void setParsingStrategy(EnhancedParser.ParsingStrategy var1);
}

