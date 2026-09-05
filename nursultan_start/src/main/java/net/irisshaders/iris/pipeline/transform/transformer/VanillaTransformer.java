/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.github.douira.glsl_transformer.ast.node.TranslationUnit
 *  io.github.douira.glsl_transformer.ast.query.Root
 *  io.github.douira.glsl_transformer.ast.transform.ASTInjectionPoint
 *  io.github.douira.glsl_transformer.ast.transform.ASTParser
 *  net.irisshaders.iris.gl.shader.ShaderType
 */
package net.irisshaders.iris.pipeline.transform.transformer;

import io.github.douira.glsl_transformer.ast.node.TranslationUnit;
import io.github.douira.glsl_transformer.ast.query.Root;
import io.github.douira.glsl_transformer.ast.transform.ASTInjectionPoint;
import io.github.douira.glsl_transformer.ast.transform.ASTParser;
import net.irisshaders.iris.gl.shader.ShaderType;
import net.irisshaders.iris.pipeline.transform.PatchShaderType;
import net.irisshaders.iris.pipeline.transform.parameter.VanillaParameters;
import net.irisshaders.iris.pipeline.transform.transformer.CommonTransformer;
import net.irisshaders.iris.pipeline.transform.transformer.EntityPatcher;

public class VanillaTransformer {
    public static void transform(ASTParser aSTParser, TranslationUnit translationUnit, Root root, VanillaParameters vanillaParameters) {
        if (vanillaParameters.inputs.hasOverlay()) {
            EntityPatcher.patchOverlayColor(aSTParser, translationUnit, root, vanillaParameters);
            EntityPatcher.patchEntityId(aSTParser, translationUnit, root, vanillaParameters);
        } else if (vanillaParameters.inputs.isText()) {
            EntityPatcher.patchEntityId(aSTParser, translationUnit, root, vanillaParameters);
        }
        CommonTransformer.transform(aSTParser, translationUnit, root, vanillaParameters, false);
        translationUnit.parseAndInjectNodes(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, new String[]{"const float mc_chunkFade = -1.0;", "layout(std140) uniform iris_Fog {\n    vec4 FogColor;\n    float FogEnvironmentalStart;\n    float FogEnvironmentalEnd;\n    float FogRenderDistanceStart;\n    float FogRenderDistanceEnd;\n    float FogSkyEnd;\n    float FogCloudsEnd;\n} iris_fogP;\n", "struct iris_FogParameters {vec4 color;float density;float start;float end;float scale;};", "iris_FogParameters irisInt_Fog = iris_FogParameters(iris_fogP.FogColor, 0.0, iris_fogP.FogEnvironmentalStart, iris_fogP.FogEnvironmentalEnd, 1.0 / (iris_fogP.FogEnvironmentalEnd - iris_fogP.FogEnvironmentalStart));"});
        translationUnit.parseAndInjectNodes(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, new String[]{"layout(std140) uniform iris_DynamicTransforms {\n    mat4 ModelViewMat;\n    vec4 ColorModulator;\n    vec3 ModelOffset;\n    mat4 TextureMat;\n} iris_transforms;\n", "layout(std140) uniform iris_Projection {\n    mat4 iris_ProjMat;\n};\n", "layout(std140) uniform iris_Globals {\nivec3 CameraBlockPos;\nvec3 CameraOffset;\nvec2 ScreenSize;\nfloat GlintAlpha;\nfloat GameTime;\nint MenuBlurRadius;\n} iris_globalInfo;\n"});
        if (vanillaParameters.type.glShaderType == ShaderType.VERTEX) {
            root.rename("gl_MultiTexCoord2", "gl_MultiTexCoord1");
            translationUnit.parseAndInjectNode(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, "in float iris_LineWidth;");
            if (vanillaParameters.inputs.hasTex() && !vanillaParameters.isClouds()) {
                root.replaceReferenceExpressions(aSTParser, "gl_MultiTexCoord0", "vec4(iris_UV0, 0.0, 1.0)");
                translationUnit.parseAndInjectNode(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, "in vec2 iris_UV0;");
            } else {
                root.replaceReferenceExpressions(aSTParser, "gl_MultiTexCoord0", "vec4(0.5, 0.5, 0.0, 1.0)");
            }
            if (vanillaParameters.inputs.isIE()) {
                root.replaceReferenceExpressions(aSTParser, "gl_MultiTexCoord1", "vec4(iris_LightUV, 0.0, 1.0)");
                translationUnit.parseAndInjectNode(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, "uniform ivec2 iris_LightUV;");
            } else if (vanillaParameters.inputs.hasLight()) {
                root.replaceReferenceExpressions(aSTParser, "gl_MultiTexCoord1", "vec4(iris_UV2, 0.0, 1.0)");
                translationUnit.parseAndInjectNode(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, "in ivec2 iris_UV2;");
            } else {
                root.replaceReferenceExpressions(aSTParser, "gl_MultiTexCoord1", "vec4(240.0, 240.0, 0.0, 1.0)");
            }
            CommonTransformer.patchMultiTexCoord3(aSTParser, translationUnit, root, vanillaParameters);
            CommonTransformer.replaceGlMultiTexCoordBounded(aSTParser, root, 4, 7);
        }
        if (vanillaParameters.inputs.hasColor() && vanillaParameters.type == PatchShaderType.VERTEX) {
            if (vanillaParameters.alpha.reference() == Float.MAX_VALUE) {
                root.replaceReferenceExpressions(aSTParser, "gl_Color", "vec4((iris_Color * iris_transforms.ColorModulator).rgb, iris_transforms.ColorModulator.a)");
            } else if (vanillaParameters.isClouds()) {
                root.replaceReferenceExpressions(aSTParser, "gl_Color", "iris_cloudCol");
            } else {
                root.replaceReferenceExpressions(aSTParser, "gl_Color", "(iris_Color * iris_transforms.ColorModulator)");
            }
            if (vanillaParameters.type.glShaderType == ShaderType.VERTEX) {
                translationUnit.parseAndInjectNode(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, "in vec4 iris_Color;");
            }
        } else if (vanillaParameters.inputs.isGlint()) {
            root.replaceReferenceExpressions(aSTParser, "gl_Color", "vec4(iris_transforms.ColorModulator.rgb, iris_transforms.ColorModulator.a * iris_globalInfo.GlintAlpha)");
        } else {
            root.replaceReferenceExpressions(aSTParser, "gl_Color", "iris_transforms.ColorModulator");
        }
        if (vanillaParameters.type.glShaderType == ShaderType.VERTEX && !vanillaParameters.isClouds()) {
            if (vanillaParameters.inputs.hasNormal()) {
                if (!vanillaParameters.inputs.isNewLines()) {
                    root.rename("gl_Normal", "iris_Normal");
                } else {
                    root.replaceReferenceExpressions(aSTParser, "gl_Normal", "vec3(0.0, 0.0, 1.0)");
                }
                translationUnit.parseAndInjectNode(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, "in vec3 iris_Normal;");
            } else {
                root.replaceReferenceExpressions(aSTParser, "gl_Normal", "vec3(0.0, 0.0, 1.0)");
            }
        }
        translationUnit.parseAndInjectNodes(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, new String[]{"uniform mat4 iris_LightmapTextureMatrix;"});
        root.replaceExpressionMatches(aSTParser, CommonTransformer.glTextureMatrix0, "iris_transforms.TextureMat");
        root.replaceExpressionMatches(aSTParser, CommonTransformer.glTextureMatrix1, "iris_LightmapTextureMatrix");
        root.replaceReferenceExpressions(aSTParser, "gl_NormalMatrix", "iris_NormalMat");
        root.replaceReferenceExpressions(aSTParser, "gl_ModelViewMatrixInverse", "iris_ModelViewMatInverse");
        root.replaceReferenceExpressions(aSTParser, "gl_ProjectionMatrixInverse", "iris_ProjMatInverse");
        translationUnit.parseAndInjectNode(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, "uniform mat3 iris_NormalMat;");
        translationUnit.parseAndInjectNode(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, "uniform mat4 iris_ProjMatInverse;");
        translationUnit.parseAndInjectNode(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, "uniform mat4 iris_ModelViewMatInverse;");
        if (vanillaParameters.type.glShaderType == ShaderType.VERTEX) {
            translationUnit.parseAndInjectNodes(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, new String[]{"in vec3 iris_Position;"});
            if (root.identifierIndex.has("ftransform")) {
                translationUnit.parseAndInjectNodes(aSTParser, ASTInjectionPoint.BEFORE_FUNCTIONS, new String[]{"vec4 ftransform() { return gl_ModelViewProjectionMatrix * gl_Vertex; }"});
            }
            if (vanillaParameters.inputs.isNewLines()) {
                root.replaceReferenceExpressions(aSTParser, "gl_Vertex", "vec4(iris_Position + iris_vertex_offset, 1.0)");
                root.rename("main", "irisMain");
                translationUnit.parseAndInjectNodes(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, new String[]{"vec3 iris_vertex_offset = vec3(0.0);"});
                translationUnit.parseAndInjectNodes(aSTParser, ASTInjectionPoint.END, new String[]{"void iris_widen_lines(vec4 linePosStart, vec4 linePosEnd) {vec3 ndc1 = linePosStart.xyz / linePosStart.w;vec3 ndc2 = linePosEnd.xyz / linePosEnd.w;vec2 lineScreenDirection = normalize((ndc2.xy - ndc1.xy) * iris_globalInfo.ScreenSize);vec2 lineOffset = vec2(-lineScreenDirection.y, lineScreenDirection.x) * iris_LineWidth / iris_globalInfo.ScreenSize;if (lineOffset.x < 0.0) {    lineOffset *= -1.0;}if (gl_VertexID % 2 == 0) {    gl_Position = vec4((ndc1 + vec3(lineOffset, 0.0)) * linePosStart.w, linePosStart.w);} else {    gl_Position = vec4((ndc1 - vec3(lineOffset, 0.0)) * linePosStart.w, linePosStart.w);}}", "void main() {iris_vertex_offset = iris_Normal;irisMain();vec4 linePosEnd = gl_Position;gl_Position = vec4(0.0);iris_vertex_offset = vec3(0.0);irisMain();vec4 linePosStart = gl_Position;iris_widen_lines(linePosStart, linePosEnd);}"});
            } else if (vanillaParameters.isClouds()) {
                translationUnit.parseAndInjectNodes(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, new String[]{"layout(std140) uniform iris_CloudInfo {\n    vec4 CloudColor;\n    vec3 CloudOffset;\n    vec3 CellSize;\n} iris_Clouds;\n", "const vec3[] iris_cloudVertices = vec3[](\n    // Bottom face\n    vec3(1, 0, 0),\n    vec3(1, 0, 1),\n    vec3(0, 0, 1),\n    vec3(0, 0, 0),\n    // Top face\n    vec3(0, 1, 0),\n    vec3(0, 1, 1),\n    vec3(1, 1, 1),\n    vec3(1, 1, 0),\n    // North face\n    vec3(0, 0, 0),\n    vec3(0, 1, 0),\n    vec3(1, 1, 0),\n    vec3(1, 0, 0),\n    // South face\n    vec3(1, 0, 1),\n    vec3(1, 1, 1),\n    vec3(0, 1, 1),\n    vec3(0, 0, 1),\n    // West face\n    vec3(0, 0, 1),\n    vec3(0, 1, 1),\n    vec3(0, 1, 0),\n    vec3(0, 0, 0),\n    // East face\n    vec3(1, 0, 0),\n    vec3(1, 1, 0),\n    vec3(1, 1, 1),\n    vec3(1, 0, 1)\n);\n", "const vec3[] iris_cloudNormals = vec3[](\n    // Bottom face\n    vec3(0, -1, 0),\n    // Top face\n    vec3(0, 1, 0),\n    // North face\n    vec3(0, 0, -1),\n    // South face\n    vec3(0, 0, 1),\n    // West face\n    vec3(-1, 0, 0),\n    // East face\n    vec3(1, 0, 0)\n);\n", "const vec4[] iris_faceColors = vec4[](\n    // Bottom face\n    vec4(0.7, 0.7, 0.7, 0.8),\n    // Top face\n    vec4(1.0, 1.0, 1.0, 0.8),\n    // North face\n    vec4(0.8, 0.8, 0.8, 0.8),\n    // South face\n    vec4(0.8, 0.8, 0.8, 0.8),\n    // West face\n    vec4(0.9, 0.9, 0.9, 0.8),\n    // East face\n    vec4(0.9, 0.9, 0.9, 0.8)\n);\n", "vec3 iris_cloudPos;", "vec3 iris_cloudNormal;", "vec4 iris_cloudCol;\n", "const int FLAG_MASK_DIR = 7;", "const int FLAG_INSIDE_FACE = 1 << 4;", "const int FLAG_USE_TOP_COLOR = 1 << 5;", "const int FLAG_EXTRA_Z = 1 << 6;", "const int FLAG_EXTRA_X = 1 << 7;", "uniform isamplerBuffer CloudFaces;", "void iris_cloudsMain() {\n    int quadVertex = gl_VertexID % 4;\n    int index = (gl_VertexID / 4) * 3;\n\n    int cellX = texelFetch(CloudFaces, index).r;\n    int cellZ = texelFetch(CloudFaces, index + 1).r;\n    int dirAndFlags = texelFetch(CloudFaces, index + 2).r;\n    int direction = dirAndFlags & FLAG_MASK_DIR;\n    bool isInsideFace = (dirAndFlags & FLAG_INSIDE_FACE) == FLAG_INSIDE_FACE;\n    bool useTopColor = (dirAndFlags & FLAG_USE_TOP_COLOR) == FLAG_USE_TOP_COLOR;\n    cellX = (cellX << 1) | ((dirAndFlags & FLAG_EXTRA_X) >> 7);\n    cellZ = (cellZ << 1) | ((dirAndFlags & FLAG_EXTRA_Z) >> 6);\n    vec3 faceVertex = iris_cloudVertices[(direction * 4) + (isInsideFace ? 3 - quadVertex : quadVertex)];\n    iris_cloudPos = (faceVertex * iris_Clouds.CellSize) + (vec3(cellX, 0, cellZ) * iris_Clouds.CellSize) + iris_Clouds.CloudOffset;\n    iris_cloudNormal = iris_cloudNormals[direction];\n    iris_cloudCol = (useTopColor ? iris_faceColors[1] : iris_faceColors[direction]) * iris_Clouds.CloudColor;\n    }\n"});
                translationUnit.prependMainFunctionBody(aSTParser, "iris_cloudsMain();");
                root.replaceReferenceExpressions(aSTParser, "gl_Vertex", "vec4(iris_cloudPos, 1.0)");
                root.replaceReferenceExpressions(aSTParser, "gl_Normal", "iris_cloudNormal");
            } else {
                root.replaceReferenceExpressions(aSTParser, "gl_Vertex", "vec4(iris_Position, 1.0)");
            }
        }
        root.replaceReferenceExpressions(aSTParser, "gl_ModelViewProjectionMatrix", "(gl_ProjectionMatrix * gl_ModelViewMatrix)");
        if (vanillaParameters.hasChunkOffset) {
            boolean bl = root.replaceReferenceExpressionsReport(aSTParser, "gl_ModelViewMatrix", "(iris_transforms.ModelViewMat * _iris_internal_translate(iris_transforms.ModelOffset))");
            if (bl) {
                translationUnit.parseAndInjectNodes(aSTParser, ASTInjectionPoint.BEFORE_FUNCTIONS, new String[]{"mat4 _iris_internal_translate(vec3 offset) {return mat4(1.0, 0.0, 0.0, 0.0,0.0, 1.0, 0.0, 0.0,0.0, 0.0, 1.0, 0.0,offset.x, offset.y, offset.z, 1.0); }"});
            }
        } else if (vanillaParameters.inputs.isNewLines()) {
            translationUnit.parseAndInjectNodes(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, new String[]{"const float iris_VIEW_SHRINK = 1.0 - (1.0 / 256.0);", "const mat4 iris_VIEW_SCALE = mat4(iris_VIEW_SHRINK, 0.0, 0.0, 0.0,0.0, iris_VIEW_SHRINK, 0.0, 0.0,0.0, 0.0, iris_VIEW_SHRINK, 0.0,0.0, 0.0, 0.0, 1.0);"});
            root.replaceReferenceExpressions(aSTParser, "gl_ModelViewMatrix", "(iris_VIEW_SCALE * iris_transforms.ModelViewMat)");
        } else {
            root.rename("gl_ModelViewMatrix", "iris_transforms.ModelViewMat");
        }
        root.rename("gl_ProjectionMatrix", "iris_ProjMat");
    }
}

