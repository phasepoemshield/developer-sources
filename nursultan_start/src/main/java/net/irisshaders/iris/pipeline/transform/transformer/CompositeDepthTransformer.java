/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.github.douira.glsl_transformer.ast.node.TranslationUnit
 *  io.github.douira.glsl_transformer.ast.node.declaration.DeclarationMember
 *  io.github.douira.glsl_transformer.ast.node.declaration.TypeAndInitDeclaration
 *  io.github.douira.glsl_transformer.ast.node.external_declaration.DeclarationExternalDeclaration
 *  io.github.douira.glsl_transformer.ast.node.external_declaration.ExternalDeclaration
 *  io.github.douira.glsl_transformer.ast.query.Root
 *  io.github.douira.glsl_transformer.ast.query.match.HintedMatcher
 *  io.github.douira.glsl_transformer.ast.transform.ASTInjectionPoint
 *  io.github.douira.glsl_transformer.ast.transform.ASTParser
 *  io.github.douira.glsl_transformer.parser.ParseShape
 */
package net.irisshaders.iris.pipeline.transform.transformer;

import io.github.douira.glsl_transformer.ast.node.TranslationUnit;
import io.github.douira.glsl_transformer.ast.node.declaration.DeclarationMember;
import io.github.douira.glsl_transformer.ast.node.declaration.TypeAndInitDeclaration;
import io.github.douira.glsl_transformer.ast.node.external_declaration.DeclarationExternalDeclaration;
import io.github.douira.glsl_transformer.ast.node.external_declaration.ExternalDeclaration;
import io.github.douira.glsl_transformer.ast.query.Root;
import io.github.douira.glsl_transformer.ast.query.match.HintedMatcher;
import io.github.douira.glsl_transformer.ast.transform.ASTInjectionPoint;
import io.github.douira.glsl_transformer.ast.transform.ASTParser;
import io.github.douira.glsl_transformer.parser.ParseShape;
import net.irisshaders.iris.pipeline.transform.transformer.CompositeDepthTransformer$1;

class CompositeDepthTransformer {
    private static final HintedMatcher<ExternalDeclaration> uniformFloatCenterDepthSmooth = new CompositeDepthTransformer$1("uniform float name;", ParseShape.EXTERNAL_DECLARATION, "centerDepthSmooth");

    CompositeDepthTransformer() {
    }

    public static void transform(ASTParser aSTParser, TranslationUnit translationUnit, Root root) {
        if (root.processMatches(aSTParser, uniformFloatCenterDepthSmooth, externalDeclaration -> {
            TypeAndInitDeclaration typeAndInitDeclaration = (TypeAndInitDeclaration)((DeclarationExternalDeclaration)externalDeclaration).getDeclaration();
            DeclarationMember declarationMember = null;
            for (DeclarationMember declarationMember2 : typeAndInitDeclaration.getMembers()) {
                if (!declarationMember2.getName().getName().equals("centerDepthSmooth")) continue;
                declarationMember = declarationMember2;
                break;
            }
            if (declarationMember != null) {
                if (typeAndInitDeclaration.getMembers().size() == 1) {
                    externalDeclaration.detachAndDelete();
                } else {
                    declarationMember.detachAndDelete();
                }
            }
        })) {
            translationUnit.parseAndInjectNode(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, "uniform sampler2D iris_centerDepthSmooth;");
            root.replaceReferenceExpressions(aSTParser, "centerDepthSmooth", "texture(iris_centerDepthSmooth, vec2(0.5)).r");
        }
    }
}

