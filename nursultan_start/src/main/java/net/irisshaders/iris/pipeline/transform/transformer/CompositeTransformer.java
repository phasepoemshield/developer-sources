/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.github.douira.glsl_transformer.ast.node.TranslationUnit
 *  io.github.douira.glsl_transformer.ast.node.expression.Expression
 *  io.github.douira.glsl_transformer.ast.query.Root
 *  io.github.douira.glsl_transformer.ast.query.match.AutoHintedMatcher
 *  io.github.douira.glsl_transformer.ast.transform.ASTInjectionPoint
 *  io.github.douira.glsl_transformer.ast.transform.ASTParser
 *  io.github.douira.glsl_transformer.parser.ParseShape
 *  net.irisshaders.iris.gl.shader.ShaderType
 */
package net.irisshaders.iris.pipeline.transform.transformer;

import io.github.douira.glsl_transformer.ast.node.TranslationUnit;
import io.github.douira.glsl_transformer.ast.node.expression.Expression;
import io.github.douira.glsl_transformer.ast.query.Root;
import io.github.douira.glsl_transformer.ast.query.match.AutoHintedMatcher;
import io.github.douira.glsl_transformer.ast.transform.ASTInjectionPoint;
import io.github.douira.glsl_transformer.ast.transform.ASTParser;
import io.github.douira.glsl_transformer.parser.ParseShape;
import net.irisshaders.iris.gl.shader.ShaderType;
import net.irisshaders.iris.pipeline.transform.parameter.Parameters;
import net.irisshaders.iris.pipeline.transform.transformer.CommonTransformer;
import net.irisshaders.iris.pipeline.transform.transformer.CompositeDepthTransformer;
import net.irisshaders.iris.pipeline.transform.transformer.CompositeTransformer$1;

public class CompositeTransformer {
    private static final AutoHintedMatcher<Expression> glTextureMatrix0To7 = new CompositeTransformer$1("gl_TextureMatrix[index]", ParseShape.EXPRESSION);

    public static void transform(ASTParser aSTParser, TranslationUnit translationUnit, Root root, Parameters parameters) {
        CommonTransformer.transform(aSTParser, translationUnit, root, parameters, true);
        CompositeDepthTransformer.transform(aSTParser, translationUnit, root);
        root.replaceExpressionMatches(aSTParser, glTextureMatrix0To7, "mat4(1.0)");
        if (parameters.type.glShaderType == ShaderType.VERTEX) {
            root.replaceReferenceExpressions(aSTParser, "gl_MultiTexCoord0", "vec4(UV0, 0.0, 1.0)");
            translationUnit.parseAndInjectNode(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, "in vec2 UV0;");
            CommonTransformer.replaceGlMultiTexCoordBounded(aSTParser, root, 1, 7);
        }
        root.replaceReferenceExpressions(aSTParser, "gl_Color", "vec4(1.0, 1.0, 1.0, 1.0)");
        if (parameters.type.glShaderType == ShaderType.VERTEX) {
            root.replaceReferenceExpressions(aSTParser, "gl_Normal", "vec3(0.0, 0.0, 1.0)");
        }
        root.replaceReferenceExpressions(aSTParser, "gl_NormalMatrix", "mat3(1.0)");
        if (parameters.type.glShaderType == ShaderType.VERTEX) {
            translationUnit.parseAndInjectNodes(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, new String[]{"in vec3 Position;"});
            if (root.identifierIndex.has("ftransform")) {
                translationUnit.parseAndInjectNodes(aSTParser, ASTInjectionPoint.BEFORE_FUNCTIONS, new String[]{"vec4 ftransform() { return gl_ModelViewProjectionMatrix * gl_Vertex; }"});
            }
            root.replaceReferenceExpressions(aSTParser, "gl_Vertex", "vec4(Position, 1.0)");
        }
        root.replaceReferenceExpressions(aSTParser, "gl_ModelViewProjectionMatrix", "(gl_ProjectionMatrix * gl_ModelViewMatrix)");
        root.replaceReferenceExpressions(aSTParser, "gl_ModelViewMatrix", "mat4(1.0)");
        root.replaceReferenceExpressions(aSTParser, "gl_ProjectionMatrix", "mat4(vec4(2.0, 0.0, 0.0, 0.0), vec4(0.0, 2.0, 0.0, 0.0), vec4(0.0), vec4(-1.0, -1.0, 0.0, 1.0))");
        CommonTransformer.applyIntelHd4000Workaround(root);
    }
}

