/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.github.douira.glsl_transformer.ast.node.Identifier
 *  io.github.douira.glsl_transformer.ast.node.expression.Expression
 *  io.github.douira.glsl_transformer.ast.node.expression.LiteralExpression
 *  io.github.douira.glsl_transformer.ast.node.expression.ReferenceExpression
 *  io.github.douira.glsl_transformer.ast.query.match.AutoHintedMatcher
 *  io.github.douira.glsl_transformer.parser.ParseShape
 */
package net.irisshaders.iris.pipeline.transform.transformer;

import io.github.douira.glsl_transformer.ast.node.Identifier;
import io.github.douira.glsl_transformer.ast.node.expression.Expression;
import io.github.douira.glsl_transformer.ast.node.expression.LiteralExpression;
import io.github.douira.glsl_transformer.ast.node.expression.ReferenceExpression;
import io.github.douira.glsl_transformer.ast.query.match.AutoHintedMatcher;
import io.github.douira.glsl_transformer.parser.ParseShape;

class CommonTransformer$2
extends AutoHintedMatcher<Expression> {
    CommonTransformer$2(String string, ParseShape parseShape) {
        super(string, parseShape);
        this.markClassedPredicateWildcard("index", ((Identifier)((Expression)this.pattern).getRoot().identifierIndex.getUnique("index")).getAncestor(ReferenceExpression.class), LiteralExpression.class, literalExpression -> literalExpression.isInteger() && literalExpression.getInteger() >= 0L);
    }
}

