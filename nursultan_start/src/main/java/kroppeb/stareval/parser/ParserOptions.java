/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.chars.Char2ObjectMap
 */
package kroppeb.stareval.parser;

import it.unimi.dsi.fastutil.chars.Char2ObjectMap;
import kroppeb.stareval.parser.BinaryOp;
import kroppeb.stareval.parser.OpResolver;
import kroppeb.stareval.parser.ParserOptions$TokenRules;
import kroppeb.stareval.parser.UnaryOp;

public final class ParserOptions {
    private final Char2ObjectMap<? extends OpResolver<? extends UnaryOp>> unaryOpResolvers;
    private final Char2ObjectMap<? extends OpResolver<? extends BinaryOp>> binaryOpResolvers;
    private final ParserOptions$TokenRules tokenRules;

    ParserOptions(Char2ObjectMap<? extends OpResolver<? extends UnaryOp>> char2ObjectMap, Char2ObjectMap<? extends OpResolver<? extends BinaryOp>> char2ObjectMap2, ParserOptions$TokenRules parserOptions$TokenRules) {
        this.unaryOpResolvers = char2ObjectMap;
        this.binaryOpResolvers = char2ObjectMap2;
        this.tokenRules = parserOptions$TokenRules;
    }

    OpResolver<? extends BinaryOp> getBinaryOpResolver(char c) {
        return (OpResolver)this.binaryOpResolvers.get(c);
    }

    OpResolver<? extends UnaryOp> getUnaryOpResolver(char c) {
        return (OpResolver)this.unaryOpResolvers.get(c);
    }

    ParserOptions$TokenRules getTokenRules() {
        return this.tokenRules;
    }
}

