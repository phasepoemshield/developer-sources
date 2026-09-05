/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.github.douira.glsl_transformer.ast.node.Identifier
 *  io.github.douira.glsl_transformer.ast.node.declaration.DeclarationMember
 *  io.github.douira.glsl_transformer.ast.node.external_declaration.ExternalDeclaration
 *  io.github.douira.glsl_transformer.ast.node.type.specifier.BuiltinFixedTypeSpecifier
 *  io.github.douira.glsl_transformer.ast.node.type.specifier.BuiltinFixedTypeSpecifier$BuiltinType$TypeKind
 *  io.github.douira.glsl_transformer.ast.node.type.specifier.TypeSpecifier
 *  io.github.douira.glsl_transformer.ast.query.match.Matcher
 *  io.github.douira.glsl_transformer.parser.ParseShape
 */
package net.irisshaders.iris.pipeline.transform.transformer;

import io.github.douira.glsl_transformer.ast.node.Identifier;
import io.github.douira.glsl_transformer.ast.node.declaration.DeclarationMember;
import io.github.douira.glsl_transformer.ast.node.external_declaration.ExternalDeclaration;
import io.github.douira.glsl_transformer.ast.node.type.specifier.BuiltinFixedTypeSpecifier;
import io.github.douira.glsl_transformer.ast.node.type.specifier.TypeSpecifier;
import io.github.douira.glsl_transformer.ast.query.match.Matcher;
import io.github.douira.glsl_transformer.parser.ParseShape;

class CommonTransformer$1
extends Matcher<ExternalDeclaration> {
    CommonTransformer$1(String string, ParseShape parseShape) {
        super(string, parseShape);
        this.markClassedPredicateWildcard("type", ((Identifier)((ExternalDeclaration)this.pattern).getRoot().identifierIndex.getUnique("Type")).getAncestor(TypeSpecifier.class), BuiltinFixedTypeSpecifier.class, builtinFixedTypeSpecifier -> builtinFixedTypeSpecifier.type.kind == BuiltinFixedTypeSpecifier.BuiltinType.TypeKind.SAMPLER);
        this.markClassWildcard("name*", ((Identifier)((ExternalDeclaration)this.pattern).getRoot().identifierIndex.getUnique("name")).getAncestor(DeclarationMember.class));
    }
}

