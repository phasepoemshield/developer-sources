/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  eu.pb4.placeholders.api.parsers.WrappedText
 *  eu.pb4.placeholders.impl.textparser.MergedParser
 *  minecraft.class00392
 */
package eu.pb4.placeholders.api.parsers;

import com.mojang.serialization.Codec;
import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.node.TextNode;
import eu.pb4.placeholders.api.parsers.ParserBuilder;
import eu.pb4.placeholders.api.parsers.WrappedText;
import eu.pb4.placeholders.impl.textparser.MergedParser;
import java.util.List;
import minecraft.class00392;

public interface NodeParser {
    public static final NodeParser NOOP;

    default public class00392 parseText(String string, ParserContext parserContext) {
        return this.parseText(TextNode.of(string), parserContext);
    }

    default public class00392 parseText(TextNode textNode, ParserContext parserContext) {
        return TextNode.asSingle(this.parseNodes(textNode)).toText(parserContext, true);
    }

    /*
     * Exception decompiling
     */
    static {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * java.lang.UnsupportedOperationException
         *     at org.benf.cfr.reader.bytecode.analysis.parse.expression.NewAnonymousArray.getDimSize(NewAnonymousArray.java:142)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.isNewArrayLambda(LambdaRewriter.java:455)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteDynamicExpression(LambdaRewriter.java:409)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteDynamicExpression(LambdaRewriter.java:167)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewriteExpression(LambdaRewriter.java:105)
         *     at org.benf.cfr.reader.bytecode.analysis.structured.statement.StructuredAssignment.rewriteExpressions(StructuredAssignment.java:146)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.LambdaRewriter.rewrite(LambdaRewriter.java:88)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.rewriteLambdas(Op04StructuredStatement.java:1137)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:912)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static ParserBuilder builder() {
        return new ParserBuilder();
    }

    public static NodeParser merge(List<NodeParser> list) {
        return switch (list.size()) {
            case 0 -> NOOP;
            case 1 -> list.get(0);
            default -> new MergedParser(list.toArray(new NodeParser[0]));
        };
    }

    public static NodeParser merge(NodeParser ... nodeParserArray) {
        return switch (nodeParserArray.length) {
            case 0 -> NOOP;
            case 1 -> nodeParserArray[0];
            default -> new MergedParser(nodeParserArray);
        };
    }

    default public Codec<WrappedText> codec() {
        return Codec.STRING.xmap(string -> WrappedText.from((NodeParser)this, (String)string), WrappedText::input);
    }

    public TextNode[] parseNodes(TextNode var1);

    default public TextNode parseNode(String string) {
        return this.parseNode(TextNode.of(string));
    }

    default public TextNode parseNode(TextNode textNode) {
        return TextNode.asSingle(this.parseNodes(textNode));
    }
}

