/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.github.douira.glsl_transformer.ast.node.Identifier
 *  io.github.douira.glsl_transformer.ast.node.abstract_node.ASTNode
 *  io.github.douira.glsl_transformer.ast.node.declaration.DeclarationMember
 *  io.github.douira.glsl_transformer.ast.node.external_declaration.ExternalDeclaration
 *  io.github.douira.glsl_transformer.ast.node.type.qualifier.StorageQualifier
 *  io.github.douira.glsl_transformer.ast.node.type.qualifier.StorageQualifier$StorageType
 *  io.github.douira.glsl_transformer.ast.node.type.qualifier.TypeQualifier
 *  io.github.douira.glsl_transformer.ast.node.type.qualifier.TypeQualifierPart
 *  io.github.douira.glsl_transformer.ast.node.type.specifier.BuiltinNumericTypeSpecifier
 *  io.github.douira.glsl_transformer.ast.query.match.Matcher
 *  io.github.douira.glsl_transformer.parser.ParseShape
 */
package net.irisshaders.iris.pipeline.transform.transformer;

import io.github.douira.glsl_transformer.ast.node.Identifier;
import io.github.douira.glsl_transformer.ast.node.abstract_node.ASTNode;
import io.github.douira.glsl_transformer.ast.node.declaration.DeclarationMember;
import io.github.douira.glsl_transformer.ast.node.external_declaration.ExternalDeclaration;
import io.github.douira.glsl_transformer.ast.node.type.qualifier.StorageQualifier;
import io.github.douira.glsl_transformer.ast.node.type.qualifier.TypeQualifier;
import io.github.douira.glsl_transformer.ast.node.type.qualifier.TypeQualifierPart;
import io.github.douira.glsl_transformer.ast.node.type.specifier.BuiltinNumericTypeSpecifier;
import io.github.douira.glsl_transformer.ast.query.match.Matcher;
import io.github.douira.glsl_transformer.parser.ParseShape;

class CompatibilityTransformer$DeclarationMatcher
extends Matcher<ExternalDeclaration> {
    private final StorageQualifier.StorageType storageType;

    public CompatibilityTransformer$DeclarationMatcher(StorageQualifier.StorageType storageType) {
        super("out float name;", ParseShape.EXTERNAL_DECLARATION);
        this.markClassWildcard("qualifier", ((ExternalDeclaration)this.pattern).getRoot().nodeIndex.getUnique(TypeQualifier.class));
        this.markClassWildcard("type", ((ExternalDeclaration)this.pattern).getRoot().nodeIndex.getUnique(BuiltinNumericTypeSpecifier.class));
        this.markClassWildcard("name*", ((Identifier)((ExternalDeclaration)this.pattern).getRoot().identifierIndex.getUnique("name")).getAncestor(DeclarationMember.class));
        this.storageType = storageType;
    }

    public boolean matchesExtract(ExternalDeclaration externalDeclaration) {
        boolean bl = super.matchesExtract((ASTNode)externalDeclaration);
        if (!bl) {
            return false;
        }
        TypeQualifier typeQualifier = (TypeQualifier)this.getNodeMatch("qualifier", TypeQualifier.class);
        for (TypeQualifierPart typeQualifierPart : typeQualifier.getParts()) {
            if (!(typeQualifierPart instanceof StorageQualifier)) continue;
            StorageQualifier storageQualifier = (StorageQualifier)typeQualifierPart;
            if (storageQualifier.storageType != this.storageType) continue;
            return true;
        }
        return false;
    }
}

