/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.chars.Char2ObjectMap
 *  it.unimi.dsi.fastutil.chars.Char2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.chars.Char2ObjectOpenHashMap
 */
package kroppeb.stareval.parser;

import it.unimi.dsi.fastutil.chars.Char2ObjectMap;
import it.unimi.dsi.fastutil.chars.Char2ObjectOpenHashMap;
import kroppeb.stareval.parser.BinaryOp;
import kroppeb.stareval.parser.OpResolver;
import kroppeb.stareval.parser.OpResolver$Builder;
import kroppeb.stareval.parser.ParserOptions;
import kroppeb.stareval.parser.ParserOptions$TokenRules;
import kroppeb.stareval.parser.UnaryOp;

public class ParserOptions$Builder {
    private final Char2ObjectMap<OpResolver$Builder<UnaryOp>> unaryOpResolvers = new Char2ObjectOpenHashMap();
    private final Char2ObjectMap<OpResolver$Builder<BinaryOp>> binaryOpResolvers = new Char2ObjectOpenHashMap();
    private ParserOptions$TokenRules tokenRules = ParserOptions$TokenRules.DEFAULT;

    public ParserOptions build() {
        return new ParserOptions(ParserOptions$Builder.buildOpResolvers(this.unaryOpResolvers), ParserOptions$Builder.buildOpResolvers(this.binaryOpResolvers), this.tokenRules);
    }

    private static /* synthetic */ void lambda$buildOpResolvers$0(Char2ObjectMap char2ObjectMap, Char2ObjectMap.Entry entry) {
        char2ObjectMap.put(entry.getCharKey(), ((OpResolver$Builder)entry.getValue()).build());
    }

    public void addUnaryOp(String string, UnaryOp unaryOp) {
        char c2 = string.charAt(0);
        String string2 = string.substring(1);
        ((OpResolver$Builder)this.unaryOpResolvers.computeIfAbsent(c2, c -> new OpResolver$Builder())).multiChar(string2, unaryOp);
    }

    public void addBinaryOp(String string, BinaryOp binaryOp) {
        char c2 = string.charAt(0);
        String string2 = string.substring(1);
        ((OpResolver$Builder)this.binaryOpResolvers.computeIfAbsent(c2, c -> new OpResolver$Builder())).multiChar(string2, binaryOp);
    }

    private static <T> Char2ObjectMap<? extends OpResolver<? extends T>> buildOpResolvers(Char2ObjectMap<OpResolver$Builder<T>> char2ObjectMap) {
        Char2ObjectOpenHashMap char2ObjectOpenHashMap = new Char2ObjectOpenHashMap();
        char2ObjectMap.char2ObjectEntrySet().forEach(arg_0 -> ParserOptions$Builder.lambda$buildOpResolvers$0((Char2ObjectMap)char2ObjectOpenHashMap, arg_0));
        return char2ObjectOpenHashMap;
    }

    public void setTokenRules(ParserOptions$TokenRules parserOptions$TokenRules) {
        this.tokenRules = parserOptions$TokenRules;
    }
}

