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
import net.irisshaders.iris.pipeline.transform.parameter.SodiumParameters;
import net.irisshaders.iris.pipeline.transform.transformer.SodiumTransformer;

public class SodiumCoreTransformer {
    public static void transform(ASTParser aSTParser, TranslationUnit translationUnit, Root root, SodiumParameters sodiumParameters) {
        root.rename("alphaTestRef", "iris_currentAlphaTest");
        root.rename("modelViewMatrix", "iris_ModelViewMatrix");
        root.rename("modelViewMatrixInverse", "iris_ModelViewMatrixInverse");
        root.rename("projectionMatrix", "iris_ProjectionMatrix");
        root.rename("projectionMatrixInverse", "iris_ProjectionMatrixInverse");
        root.rename("normalMatrix", "iris_NormalMatrix");
        root.rename("chunkOffset", "u_RegionOffset");
        if (sodiumParameters.type == PatchShaderType.VERTEX) {
            boolean bl = root.identifierIndex.has("vaNormal") || root.identifierIndex.has("at_tangent");
            root.replaceReferenceExpressions(aSTParser, "vaPosition", "_vert_position + _get_draw_translation(_draw_id)");
            root.replaceReferenceExpressions(aSTParser, "vaColor", "_vert_color");
            root.replaceReferenceExpressions(aSTParser, "vaNormal", "irs_Normal");
            root.replaceReferenceExpressions(aSTParser, "at_tangent", "irs_Tangent");
            root.replaceReferenceExpressions(aSTParser, "vaUV0", "_vert_tex_diffuse_coord");
            root.replaceReferenceExpressions(aSTParser, "vaUV1", "ivec2(0, 10)");
            root.replaceReferenceExpressions(aSTParser, "vaUV2", "a_LightAndData.xy");
            root.replaceReferenceExpressions(aSTParser, "textureMatrix", "mat4(1.0)");
            SodiumTransformer.replaceMidTexCoord(aSTParser, translationUnit, root, 3.0517578E-5f);
            SodiumTransformer.replaceMCEntity(aSTParser, translationUnit, root);
            SodiumTransformer.injectVertInit(aSTParser, translationUnit, root, sodiumParameters, bl);
        }
    }
}

