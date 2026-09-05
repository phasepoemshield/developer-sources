/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.github.douira.glsl_transformer.ast.node.Identifier
 *  io.github.douira.glsl_transformer.ast.node.declaration.DeclarationMember
 *  io.github.douira.glsl_transformer.ast.node.external_declaration.ExternalDeclaration
 *  io.github.douira.glsl_transformer.ast.query.match.HintedMatcher
 *  io.github.douira.glsl_transformer.parser.ParseShape
 */
package net.irisshaders.iris.pipeline.transform.transformer;

import io.github.douira.glsl_transformer.ast.node.Identifier;
import io.github.douira.glsl_transformer.ast.node.declaration.DeclarationMember;
import io.github.douira.glsl_transformer.ast.node.external_declaration.ExternalDeclaration;
import io.github.douira.glsl_transformer.ast.query.match.HintedMatcher;
import io.github.douira.glsl_transformer.parser.ParseShape;

class CompositeDepthTransformer$1
extends HintedMatcher<ExternalDeclaration> {
    CompositeDepthTransformer$1(String string, ParseShape parseShape, String string2) {
        super(string, parseShape, string2);
        this.markClassWildcard("name*", ((Identifier)((ExternalDeclaration)this.pattern).getRoot().identifierIndex.getUnique("name")).getAncestor(DeclarationMember.class));
    }
}

