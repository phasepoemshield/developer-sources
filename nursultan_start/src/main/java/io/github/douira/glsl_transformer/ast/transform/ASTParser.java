/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.github.douira.glsl_transformer.GLSLLexer
 *  io.github.douira.glsl_transformer.GLSLParser
 *  io.github.douira.glsl_transformer.GLSLParser$TranslationUnitContext
 *  io.github.douira.glsl_transformer.ast.data.TypedTreeCache
 *  io.github.douira.glsl_transformer.ast.node.TranslationUnit
 *  io.github.douira.glsl_transformer.ast.node.abstract_node.ASTNode
 *  io.github.douira.glsl_transformer.ast.node.expression.Expression
 *  io.github.douira.glsl_transformer.ast.node.external_declaration.ExternalDeclaration
 *  io.github.douira.glsl_transformer.ast.node.statement.Statement
 *  io.github.douira.glsl_transformer.ast.query.Root
 *  io.github.douira.glsl_transformer.ast.query.RootSupplier
 *  io.github.douira.glsl_transformer.ast.transform.ASTBuilder
 *  io.github.douira.glsl_transformer.ast.transform.ASTParser$ASTCacheStrategy
 *  io.github.douira.glsl_transformer.ast.transform.ASTParser$EmptyRoot
 *  io.github.douira.glsl_transformer.ast.transform.ASTParser$ParsingCacheStrategy
 *  io.github.douira.glsl_transformer.parser.CachingParser
 *  io.github.douira.glsl_transformer.parser.EnhancedParser
 *  io.github.douira.glsl_transformer.parser.EnhancedParser$ParsingStrategy
 *  io.github.douira.glsl_transformer.parser.ParseShape
 *  io.github.douira.glsl_transformer.parser.TranslationUnitFilterCachingParser
 *  io.github.douira.glsl_transformer.parser.TwoTierCachingParser
 *  java.lang.MatchException
 *  org.antlr.v4.runtime.BufferedTokenStream
 *  org.antlr.v4.runtime.ParserRuleContext
 *  org.antlr.v4.runtime.tree.ParseTree
 */
package io.github.douira.glsl_transformer.ast.transform;

import io.github.douira.glsl_transformer.GLSLLexer;
import io.github.douira.glsl_transformer.GLSLParser;
import io.github.douira.glsl_transformer.ast.data.TypedTreeCache;
import io.github.douira.glsl_transformer.ast.node.TranslationUnit;
import io.github.douira.glsl_transformer.ast.node.abstract_node.ASTNode;
import io.github.douira.glsl_transformer.ast.node.expression.Expression;
import io.github.douira.glsl_transformer.ast.node.external_declaration.ExternalDeclaration;
import io.github.douira.glsl_transformer.ast.node.statement.Statement;
import io.github.douira.glsl_transformer.ast.query.Root;
import io.github.douira.glsl_transformer.ast.query.RootSupplier;
import io.github.douira.glsl_transformer.ast.transform.ASTBuilder;
import io.github.douira.glsl_transformer.ast.transform.ASTParser;
import io.github.douira.glsl_transformer.parser.CachingParser;
import io.github.douira.glsl_transformer.parser.EnhancedParser;
import io.github.douira.glsl_transformer.parser.ParseShape;
import io.github.douira.glsl_transformer.parser.ParserInterface;
import io.github.douira.glsl_transformer.parser.TranslationUnitFilterCachingParser;
import io.github.douira.glsl_transformer.parser.TwoTierCachingParser;
import io.github.douira.glsl_transformer.token_filter.TokenFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public class ASTParser
implements ParserInterface {
    private static ASTParser INSTANCE;
    private EnhancedParser parser;
    private TypedTreeCache<ASTNode> buildCache;
    private ASTCacheStrategy astCacheStrategy = ASTCacheStrategy.ALL_EXCLUDING_TRANSLATION_UNIT;
    private boolean parseLineDirectives = false;

    public ASTParser() {
        this((EnhancedParser)new CachingParser(), (TypedTreeCache<ASTNode>)new TypedTreeCache());
    }

    public ASTParser(EnhancedParser parser, TypedTreeCache<ASTNode> buildCache) {
        this.parser = parser;
        this.buildCache = buildCache;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public <C extends ParserRuleContext, N extends ASTNode> N parseNode(Root rootInstance, ParseShape<C, N> parseShape, String input) {
        if (this.astCacheStrategy == ASTCacheStrategy.NONE || this.astCacheStrategy == ASTCacheStrategy.ALL_EXCLUDING_TRANSLATION_UNIT && parseShape.ruleType == GLSLParser.TranslationUnitContext.class) {
            try {
                ParserRuleContext parsed = this.parser.parse(input, parseShape);
                this.setBuilderTokenStream();
                ASTNode aSTNode = ASTBuilder.buildSubtree((Root)rootInstance, (ParseTree)parsed, (BiFunction)parseShape.visitMethod);
                return (N)aSTNode;
            }
            finally {
                this.unsetBuilderTokenStream();
            }
        }
        return (N)this.parseNodeCachedUncloned(input, parseShape).cloneInto(rootInstance);
    }

    @Override
    public void setTokenFilter(TokenFilter<?> setTokenFilter) {
        this.parser.setTokenFilter(setTokenFilter);
    }

    @Override
    public GLSLParser getParser() {
        return this.parser.getParser();
    }

    private void setBuilderTokenStream() {
        if (this.parseLineDirectives) {
            ASTBuilder.setTokenStream((BufferedTokenStream)this.parser.getTokenStream());
        }
    }

    private void unsetBuilderTokenStream() {
        if (this.parseLineDirectives) {
            ASTBuilder.unsetTokenStream();
        }
    }

    public void setParsingCacheStrategy(ParsingCacheStrategy parsingCacheStrategy) {
        this.parser = switch (parsingCacheStrategy.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> new CachingParser();
            case 1 -> new TwoTierCachingParser();
            case 2 -> new TranslationUnitFilterCachingParser();
            case 3 -> new EnhancedParser();
        };
    }

    public TranslationUnit parseTranslationUnit(Root rootInstance, String input) {
        return (TranslationUnit)this.parseNode(rootInstance, ParseShape.TRANSLATION_UNIT, input);
    }

    public TranslationUnit parseTranslationUnit(RootSupplier rootSupplier, String input) {
        return this.parseTranslationUnit(rootSupplier.get(), input);
    }

    @Override
    public void setThrowParseErrors(boolean throwParseErrors) {
        this.parser.setThrowParseErrors(throwParseErrors);
    }

    public ExternalDeclaration parseExternalDeclaration(Root rootInstance, String input) {
        return (ExternalDeclaration)this.parseNode(rootInstance, ParseShape.EXTERNAL_DECLARATION, input);
    }

    public ExternalDeclaration parseExternalDeclaration(RootSupplier rootSupplier, String input) {
        return this.parseExternalDeclaration(rootSupplier.get(), input);
    }

    public void setParser(EnhancedParser parser) {
        this.parser = parser;
    }

    @Override
    public void setSLLOnly() {
        this.parser.setSLLOnly();
    }

    @Override
    public void setLLOnly() {
        this.parser.setLLOnly();
    }

    @Override
    public GLSLLexer getLexer() {
        return this.parser.getLexer();
    }

    public List<Statement> parseStatements(Root rootInstance, String ... inputs) {
        ArrayList<Statement> nodes = new ArrayList<Statement>(inputs.length);
        for (String input : inputs) {
            nodes.add(this.parseStatement(rootInstance, input));
        }
        return nodes;
    }

    public void setBuildCache(TypedTreeCache<ASTNode> buildCache) {
        this.buildCache = buildCache;
    }

    @Override
    public void setParsingStrategy(EnhancedParser.ParsingStrategy parsingStrategy) {
        this.parser.setParsingStrategy(parsingStrategy);
    }

    public Statement parseStatement(Root rootInstance, String input) {
        return (Statement)this.parseNode(rootInstance, ParseShape.STATEMENT, input);
    }

    public Statement parseStatement(RootSupplier rootSupplier, String input) {
        return this.parseStatement(rootSupplier.get(), input);
    }

    public <C extends ParserRuleContext, N extends ASTNode> N parseNodeSeparate(RootSupplier rootSupplier, ParseShape<C, N> parseShape, String input) {
        return this.parseNode(rootSupplier.get(), parseShape, input);
    }

    public Expression parseExpression(RootSupplier rootSupplier, String input) {
        return this.parseExpression(rootSupplier.get(), input);
    }

    public List<Expression> parseExpression(Root rootInstance, String ... inputs) {
        ArrayList<Expression> nodes = new ArrayList<Expression>(inputs.length);
        for (String input : inputs) {
            nodes.add(this.parseExpression(rootInstance, input));
        }
        return nodes;
    }

    public Expression parseExpression(Root rootInstance, String input) {
        return (Expression)this.parseNode(rootInstance, ParseShape.EXPRESSION, input);
    }

    private <C extends ParserRuleContext, N extends ASTNode> N parseNodeCachedUncloned(String input, ParseShape<C, N> parseShape) {
        return (N)((ASTNode)this.buildCache.cachedGet(input, parseShape.ruleType, () -> {
            try {
                ParserRuleContext parsed = this.parser.parse(input, parseShape);
                this.setBuilderTokenStream();
                ASTNode aSTNode = ASTBuilder.build((Root)new EmptyRoot(this), (ParseTree)parsed, (BiFunction)parseShape.visitMethod);
                return aSTNode;
            }
            finally {
                this.unsetBuilderTokenStream();
            }
        }));
    }

    public void setASTCacheStrategy(ASTCacheStrategy astCacheStrategy) {
        this.astCacheStrategy = astCacheStrategy;
    }

    public static ASTParser _getInternalInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ASTParser();
        }
        return INSTANCE;
    }

    public List<ExternalDeclaration> parseExternalDeclarations(Root rootInstance, String ... inputs) {
        ArrayList<ExternalDeclaration> nodes = new ArrayList<ExternalDeclaration>(inputs.length);
        for (String input : inputs) {
            nodes.add(this.parseExternalDeclaration(rootInstance, input));
        }
        return nodes;
    }

    public void setParseLineDirectives(boolean parseLineDirectives) {
        this.parseLineDirectives = parseLineDirectives;
    }
}

