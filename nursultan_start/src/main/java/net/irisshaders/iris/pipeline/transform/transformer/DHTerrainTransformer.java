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
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.gl.shader.ShaderType
 */
package net.irisshaders.iris.pipeline.transform.transformer;

import io.github.douira.glsl_transformer.ast.node.TranslationUnit;
import io.github.douira.glsl_transformer.ast.node.type.qualifier.StorageQualifier;
import io.github.douira.glsl_transformer.ast.query.Root;
import io.github.douira.glsl_transformer.ast.transform.ASTInjectionPoint;
import io.github.douira.glsl_transformer.ast.transform.ASTParser;
import io.github.douira.glsl_transformer.util.Type;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.shader.ShaderType;
import net.irisshaders.iris.pipeline.transform.parameter.Parameters;
import net.irisshaders.iris.pipeline.transform.transformer.CommonTransformer;

public class DHTerrainTransformer {
    public static void transform(ASTParser aSTParser, TranslationUnit translationUnit, Root root, Parameters parameters) {
        CommonTransformer.transform(aSTParser, translationUnit, root, parameters, false);
        root.replaceExpressionMatches(aSTParser, CommonTransformer.glTextureMatrix0, "mat4(1.0)");
        root.replaceExpressionMatches(aSTParser, CommonTransformer.glTextureMatrix1, "mat4(1.0)");
        root.rename("gl_ProjectionMatrix", "iris_ProjectionMatrix");
        if (parameters.type.glShaderType == ShaderType.VERTEX) {
            root.rename("gl_MultiTexCoord2", "gl_MultiTexCoord1");
            root.replaceReferenceExpressions(aSTParser, "gl_MultiTexCoord0", "vec4(0.0, 0.0, 0.0, 1.0)");
            root.replaceReferenceExpressions(aSTParser, "gl_MultiTexCoord1", "vec4(_vert_tex_light_coord, 0.0, 1.0)");
            CommonTransformer.replaceGlMultiTexCoordBounded(aSTParser, root, 4, 7);
        }
        root.rename("gl_Color", "_vert_color");
        if (parameters.type.glShaderType == ShaderType.VERTEX) {
            root.replaceReferenceExpressions(aSTParser, "gl_Normal", "_vert_normal");
        }
        root.replaceReferenceExpressions(aSTParser, "gl_NormalMatrix", "iris_NormalMatrix");
        translationUnit.parseAndInjectNode(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, "uniform mat3 iris_NormalMatrix;");
        translationUnit.parseAndInjectNode(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, "uniform mat4 iris_ModelViewMatrixInverse;");
        translationUnit.parseAndInjectNode(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, "uniform mat4 iris_ProjectionMatrixInverse;");
        Iris.logger.warn("Type is " + String.valueOf((Object)parameters.type));
        root.rename("gl_ModelViewMatrix", "iris_ModelViewMatrix");
        root.rename("gl_ModelViewMatrixInverse", "iris_ModelViewMatrixInverse");
        root.rename("gl_ProjectionMatrixInverse", "iris_ProjectionMatrixInverse");
        if (parameters.type.glShaderType == ShaderType.VERTEX) {
            if (root.identifierIndex.has("ftransform")) {
                translationUnit.parseAndInjectNodes(aSTParser, ASTInjectionPoint.BEFORE_FUNCTIONS, new String[]{"vec4 ftransform() { return gl_ModelViewProjectionMatrix * gl_Vertex; }"});
            }
            translationUnit.parseAndInjectNodes(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, new String[]{"uniform mat4 iris_ProjectionMatrix;", "uniform mat4 iris_ModelViewMatrix;", "vec4 getVertexPosition() { return vec4(modelOffset + _vert_position, 1.0); }"});
            root.replaceReferenceExpressions(aSTParser, "gl_Vertex", "getVertexPosition()");
            DHTerrainTransformer.injectVertInit(aSTParser, translationUnit, root, parameters);
        } else {
            translationUnit.parseAndInjectNodes(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, new String[]{"uniform mat4 iris_ModelViewMatrix;", "uniform mat4 iris_ProjectionMatrix;"});
        }
        root.replaceReferenceExpressions(aSTParser, "gl_ModelViewProjectionMatrix", "(iris_ProjectionMatrix * iris_ModelViewMatrix)");
        CommonTransformer.applyIntelHd4000Workaround(root);
    }

    public static void injectVertInit(ASTParser aSTParser, TranslationUnit translationUnit, Root root, Parameters parameters) {
        translationUnit.parseAndInjectNodes(aSTParser, ASTInjectionPoint.BEFORE_FUNCTIONS, new String[]{"vec3 _vert_position;", "vec2 _vert_tex_light_coord;", "int dhMaterialId;", "vec4 _vert_color;", "vec3 _vert_normal;", "uniform float mircoOffset;", "uniform vec3 modelOffset;", "const vec3 irisNormals[6] = vec3[](vec3(0,-1,0),vec3(0,1,0),vec3(0,0,-1),vec3(0,0,1),vec3(-1,0,0),vec3(1,0,0));", "void _vert_init() {    uint meta = vPosition.a;\nuint mirco = (meta & 0xFF00u) >> 8u; // mirco offset which is a xyz 2bit value\n    // 0b00 = no offset\n    // 0b01 = positive offset\n    // 0b11 = negative offset\n    // format is: 0b00zzyyxx\n    float mx = (mirco & 1u)!=0u ? mircoOffset : 0.0;\n    mx = (mirco & 2u)!=0u ? -mx : mx;\n    float my = (mirco & 4u)!=0u ? mircoOffset : 0.0;\n    my = (mirco & 8u)!=0u ? -my : my;\n    float mz = (mirco & 16u)!=0u ? mircoOffset : 0.0;\n    mz = (mirco & 32u)!=0u ? -mz : mz;\n        uint lights = meta & 0xFFu;\n_vert_position = (vPosition.xyz + vec3(mx, 0, mz));_vert_normal = irisNormals[irisExtra.y];dhMaterialId = int(irisExtra.x);_vert_tex_light_coord = vec2((float(lights/16u)+0.5) / 16.0, (mod(float(lights), 16.0)+0.5) / 16.0);_vert_color = iris_color; }"});
        CommonTransformer.addIfNotExists(root, aSTParser, translationUnit, "iris_color", Type.F32VEC4, StorageQualifier.StorageType.IN);
        CommonTransformer.addIfNotExists(root, aSTParser, translationUnit, "vPosition", Type.U32VEC4, StorageQualifier.StorageType.IN);
        CommonTransformer.addIfNotExists(root, aSTParser, translationUnit, "irisExtra", Type.U32VEC4, StorageQualifier.StorageType.IN);
        translationUnit.prependMainFunctionBody(aSTParser, "_vert_init();");
    }
}

