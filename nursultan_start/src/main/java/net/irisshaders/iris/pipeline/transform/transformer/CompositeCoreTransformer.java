/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.github.douira.glsl_transformer.ast.node.TranslationUnit
 *  io.github.douira.glsl_transformer.ast.query.Root
 *  io.github.douira.glsl_transformer.ast.transform.ASTParser
 */
package net.irisshaders.iris.pipeline.transform.transformer;

import io.github.douira.glsl_transformer.ast.node.TranslationUnit;
import io.github.douira.glsl_transformer.ast.query.Root;
import io.github.douira.glsl_transformer.ast.transform.ASTParser;
import net.irisshaders.iris.pipeline.transform.PatchShaderType;
import net.irisshaders.iris.pipeline.transform.parameter.Parameters;
import net.irisshaders.iris.pipeline.transform.transformer.CompositeDepthTransformer;

public class CompositeCoreTransformer {
    public static void transform(ASTParser aSTParser, TranslationUnit translationUnit, Root root, Parameters parameters) {
        CompositeDepthTransformer.transform(aSTParser, translationUnit, root);
        if (parameters.type == PatchShaderType.VERTEX) {
            root.rename("vaPosition", "Position");
            root.rename("vaUV0", "UV0");
            root.replaceReferenceExpressions(aSTParser, "modelViewMatrix", "mat4(1.0)");
            root.replaceReferenceExpressions(aSTParser, "projectionMatrix", "mat4(vec4(2.0, 0.0, 0.0, 0.0), vec4(0.0, 2.0, 0.0, 0.0), vec4(0.0), vec4(-1.0, -1.0, 0.0, 1.0))");
            root.replaceReferenceExpressions(aSTParser, "modelViewMatrixInverse", "mat4(1.0)");
            root.replaceReferenceExpressions(aSTParser, "projectionMatrixInverse", "inverse(mat4(vec4(2.0, 0.0, 0.0, 0.0), vec4(0.0, 2.0, 0.0, 0.0), vec4(0.0), vec4(-1.0, -1.0, 0.0, 1.0)))");
            root.replaceReferenceExpressions(aSTParser, "textureMatrix", "mat4(1.0)");
        }
    }
}

