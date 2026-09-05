/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.github.douira.glsl_transformer.ast.node.TranslationUnit
 *  io.github.douira.glsl_transformer.ast.node.type.qualifier.StorageQualifier$StorageType
 *  io.github.douira.glsl_transformer.ast.query.Root
 *  io.github.douira.glsl_transformer.ast.transform.ASTInjectionPoint
 *  io.github.douira.glsl_transformer.ast.transform.ASTParser
 *  io.github.douira.glsl_transformer.util.Type
 */
package net.irisshaders.iris.pipeline.transform.transformer;

import io.github.douira.glsl_transformer.ast.node.TranslationUnit;
import io.github.douira.glsl_transformer.ast.node.type.qualifier.StorageQualifier;
import io.github.douira.glsl_transformer.ast.query.Root;
import io.github.douira.glsl_transformer.ast.transform.ASTInjectionPoint;
import io.github.douira.glsl_transformer.ast.transform.ASTParser;
import io.github.douira.glsl_transformer.util.Type;
import net.irisshaders.iris.pipeline.transform.PatchShaderType;
import net.irisshaders.iris.pipeline.transform.parameter.VanillaParameters;
import net.irisshaders.iris.pipeline.transform.transformer.CommonTransformer;
import net.irisshaders.iris.pipeline.transform.transformer.EntityPatcher;

public class VanillaCoreTransformer {
    public static void transform(ASTParser aSTParser, TranslationUnit translationUnit, Root root, VanillaParameters vanillaParameters) {
        if (vanillaParameters.inputs.hasOverlay()) {
            if (!vanillaParameters.inputs.isText()) {
                EntityPatcher.patchOverlayColor(aSTParser, translationUnit, root, vanillaParameters);
            }
            EntityPatcher.patchEntityId(aSTParser, translationUnit, root, vanillaParameters);
        }
        translationUnit.parseAndInjectNodes(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, new String[]{"const float mc_chunkFade = -1.0;", "layout(std140) uniform iris_Fog {\n    vec4 FogColor;\n    float FogEnvironmentalStart;\n    float FogEnvironmentalEnd;\n    float FogRenderDistanceStart;\n    float FogRenderDistanceEnd;\n    float FogSkyEnd;\n    float FogCloudsEnd;\n} iris_fogP;\n", "struct iris_FogParameters {vec4 color;float density;float start;float end;float scale;};", "iris_FogParameters irisInt_Fog = iris_FogParameters(iris_fogP.FogColor, 0.0, iris_fogP.FogEnvironmentalStart, iris_fogP.FogEnvironmentalEnd, 1.0 / (iris_fogP.FogEnvironmentalEnd - iris_fogP.FogEnvironmentalStart));"});
        translationUnit.parseAndInjectNodes(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, new String[]{"layout(std140) uniform iris_DynamicTransforms {\n    mat4 ModelViewMat;\n    vec4 ColorModulator;\n    vec3 ModelOffset;\n    mat4 TextureMat;\n} iris_transforms;\n", "layout(std140) uniform iris_Projection {\n    mat4 iris_ProjMat;\n};\n", "layout(std140) uniform iris_Globals {\nivec3 CameraBlockPos;\nvec3 CameraOffset;\nvec2 ScreenSize;\nfloat GlintAlpha;\nfloat GameTime;\nint MenuBlurRadius;\n} iris_globalInfo;\n"});
        CommonTransformer.transform(aSTParser, translationUnit, root, vanillaParameters, true);
        root.rename("alphaTestRef", "iris_currentAlphaTest");
        root.replaceReferenceExpressions(aSTParser, "modelViewMatrix", "iris_transforms.ModelViewMat");
        root.replaceReferenceExpressions(aSTParser, "gl_ModelViewMatrix", "iris_transforms.ModelViewMat");
        root.rename("modelViewMatrixInverse", "iris_ModelViewMatInverse");
        root.rename("gl_ModelViewMatrixInverse", "iris_ModelViewMatInverse");
        root.replaceReferenceExpressions(aSTParser, "projectionMatrix", "iris_ProjMat");
        root.replaceReferenceExpressions(aSTParser, "gl_ProjectionMatrix", "iris_ProjMat");
        root.rename("projectionMatrixInverse", "iris_ProjMatInverse");
        root.rename("gl_ProjectionMatrixInverse", "iris_ProjMatInverse");
        root.replaceReferenceExpressions(aSTParser, "textureMatrix", "iris_transforms.TextureMat");
        root.replaceExpressionMatches(aSTParser, CommonTransformer.glTextureMatrix0, "iris_transforms.TextureMat");
        root.replaceExpressionMatches(aSTParser, CommonTransformer.glTextureMatrix1, "mat4(vec4(0.00390625, 0.0, 0.0, 0.0), vec4(0.0, 0.00390625, 0.0, 0.0), vec4(0.0, 0.0, 0.00390625, 0.0), vec4(0.03125, 0.03125, 0.03125, 1.0))");
        root.replaceExpressionMatches(aSTParser, CommonTransformer.glTextureMatrix2, "mat4(vec4(0.00390625, 0.0, 0.0, 0.0), vec4(0.0, 0.00390625, 0.0, 0.0), vec4(0.0, 0.0, 0.00390625, 0.0), vec4(0.03125, 0.03125, 0.03125, 1.0))");
        root.rename("normalMatrix", "iris_NormalMat");
        root.rename("gl_NormalMatrix", "iris_NormalMat");
        CommonTransformer.addIfNotExists(root, aSTParser, translationUnit, "iris_NormalMat", Type.F32MAT3X3, StorageQualifier.StorageType.UNIFORM);
        root.replaceReferenceExpressions(aSTParser, "chunkOffset", "iris_transforms.ModelOffset");
        CommonTransformer.upgradeStorageQualifiers(aSTParser, translationUnit, root, vanillaParameters);
        if (vanillaParameters.type == PatchShaderType.VERTEX) {
            root.replaceReferenceExpressions(aSTParser, "gl_Vertex", "vec4(iris_Position, 1.0)");
            root.rename("vaPosition", "iris_Position");
            if (vanillaParameters.inputs.hasColor()) {
                root.replaceReferenceExpressions(aSTParser, "vaColor", "iris_Color * iris_transforms.ColorModulator");
                root.replaceReferenceExpressions(aSTParser, "gl_Color", "iris_Color * iris_transforms.ColorModulator");
            } else {
                root.replaceReferenceExpressions(aSTParser, "vaColor", "iris_transforms.ColorModulator");
                root.replaceReferenceExpressions(aSTParser, "gl_Color", "iris_transforms.ColorModulator");
            }
            root.rename("vaNormal", "iris_Normal");
            root.rename("gl_Normal", "iris_Normal");
            root.rename("vaUV0", "iris_UV0");
            root.replaceReferenceExpressions(aSTParser, "gl_MultiTexCoord0", "vec4(iris_UV0, 0.0, 1.0)");
            if (vanillaParameters.inputs.hasLight()) {
                root.replaceReferenceExpressions(aSTParser, "gl_MultiTexCoord1", "vec4(iris_UV2, 0.0, 1.0)");
                root.replaceReferenceExpressions(aSTParser, "gl_MultiTexCoord2", "vec4(iris_UV2, 0.0, 1.0)");
                root.rename("vaUV2", "iris_UV2");
            } else {
                root.replaceReferenceExpressions(aSTParser, "gl_MultiTexCoord1", "vec4(240.0, 240.0, 0.0, 1.0)");
                root.replaceReferenceExpressions(aSTParser, "gl_MultiTexCoord2", "vec4(240.0, 240.0, 0.0, 1.0)");
                root.rename("vaUV2", "iris_UV2");
            }
            root.rename("vaUV1", "iris_UV1");
            CommonTransformer.addIfNotExists(root, aSTParser, translationUnit, "iris_Color", Type.F32VEC4, StorageQualifier.StorageType.IN);
            CommonTransformer.addIfNotExists(root, aSTParser, translationUnit, "iris_Position", Type.F32VEC3, StorageQualifier.StorageType.IN);
            CommonTransformer.addIfNotExists(root, aSTParser, translationUnit, "iris_Normal", Type.F32VEC3, StorageQualifier.StorageType.IN);
            CommonTransformer.addIfNotExists(root, aSTParser, translationUnit, "iris_UV0", Type.F32VEC2, StorageQualifier.StorageType.IN);
            CommonTransformer.addIfNotExists(root, aSTParser, translationUnit, "iris_UV1", Type.F32VEC2, StorageQualifier.StorageType.IN);
            CommonTransformer.addIfNotExists(root, aSTParser, translationUnit, "iris_UV2", Type.F32VEC2, StorageQualifier.StorageType.IN);
        }
    }
}

