/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.github.douira.glsl_transformer.ast.node.Identifier
 *  io.github.douira.glsl_transformer.ast.node.abstract_node.ASTNode
 *  io.github.douira.glsl_transformer.ast.node.declaration.DeclarationMember
 *  io.github.douira.glsl_transformer.ast.node.external_declaration.ExternalDeclaration
 *  io.github.douira.glsl_transformer.ast.node.type.qualifier.LayoutQualifier
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
import io.github.douira.glsl_transformer.ast.node.type.qualifier.LayoutQualifier;
import io.github.douira.glsl_transformer.ast.node.type.qualifier.StorageQualifier;
import io.github.douira.glsl_transformer.ast.node.type.qualifier.TypeQualifier;
import io.github.douira.glsl_transformer.ast.node.type.qualifier.TypeQualifierPart;
import io.github.douira.glsl_transformer.ast.node.type.specifier.BuiltinNumericTypeSpecifier;
import io.github.douira.glsl_transformer.ast.query.match.Matcher;
import io.github.douira.glsl_transformer.parser.ParseShape;

class LayoutTransformer$2
extends Matcher<ExternalDeclaration> {
    LayoutTransformer$2(String string, ParseShape parseShape) {
        super(string, parseShape);
        this.markClassWildcard("qualifier", ((ExternalDeclaration)this.pattern).getRoot().nodeIndex.getUnique(TypeQualifier.class));
        this.markClassWildcard("type", ((ExternalDeclaration)this.pattern).getRoot().nodeIndex.getUnique(BuiltinNumericTypeSpecifier.class));
        this.markClassWildcard("name*", ((Identifier)((ExternalDeclaration)this.pattern).getRoot().identifierIndex.getUnique("name")).getAncestor(DeclarationMember.class));
    }

    public boolean matchesExtract(ExternalDeclaration externalDeclaration) {
        boolean bl = super.matchesExtract((ASTNode)externalDeclaration);
        if (!bl) {
            return false;
        }
        TypeQualifier typeQualifier = (TypeQualifier)this.getNodeMatch("qualifier", TypeQualifier.class);
        boolean bl2 = false;
        for (TypeQualifierPart typeQualifierPart : typeQualifier.getParts()) {
            if (typeQualifierPart instanceof StorageQualifier) {
                StorageQualifier storageQualifier = (StorageQualifier)typeQualifierPart;
                if (storageQualifier.storageType != StorageQualifier.StorageType.IN) continue;
                bl2 = true;
                continue;
            }
            if (!(typeQualifierPart instanceof LayoutQualifier)) continue;
            return false;
        }
        return bl2;
    }
}

