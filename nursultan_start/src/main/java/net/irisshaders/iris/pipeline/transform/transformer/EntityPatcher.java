/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.github.douira.glsl_transformer.ast.node.TranslationUnit
 *  io.github.douira.glsl_transformer.ast.node.abstract_node.ASTNode
 *  io.github.douira.glsl_transformer.ast.node.external_declaration.ExternalDeclaration
 *  io.github.douira.glsl_transformer.ast.query.Root
 *  io.github.douira.glsl_transformer.ast.query.match.AutoHintedMatcher
 *  io.github.douira.glsl_transformer.ast.transform.ASTInjectionPoint
 *  io.github.douira.glsl_transformer.ast.transform.ASTParser
 *  io.github.douira.glsl_transformer.parser.ParseShape
 *  net.irisshaders.iris.gl.shader.ShaderType
 */
package net.irisshaders.iris.pipeline.transform.transformer;

import io.github.douira.glsl_transformer.ast.node.TranslationUnit;
import io.github.douira.glsl_transformer.ast.node.abstract_node.ASTNode;
import io.github.douira.glsl_transformer.ast.node.external_declaration.ExternalDeclaration;
import io.github.douira.glsl_transformer.ast.query.Root;
import io.github.douira.glsl_transformer.ast.query.match.AutoHintedMatcher;
import io.github.douira.glsl_transformer.ast.transform.ASTInjectionPoint;
import io.github.douira.glsl_transformer.ast.transform.ASTParser;
import io.github.douira.glsl_transformer.parser.ParseShape;
import net.irisshaders.iris.gl.shader.ShaderType;
import net.irisshaders.iris.pipeline.transform.parameter.VanillaParameters;

public class EntityPatcher {
    private static final AutoHintedMatcher<ExternalDeclaration> uniformVec4EntityColor = new AutoHintedMatcher("uniform vec4 entityColor;", ParseShape.EXTERNAL_DECLARATION);
    private static final AutoHintedMatcher<ExternalDeclaration> uniformIntEntityId = new AutoHintedMatcher("uniform int entityId;", ParseShape.EXTERNAL_DECLARATION);
    private static final AutoHintedMatcher<ExternalDeclaration> uniformIntBlockEntityId = new AutoHintedMatcher("uniform int blockEntityId;", ParseShape.EXTERNAL_DECLARATION);
    private static final AutoHintedMatcher<ExternalDeclaration> uniformIntCurrentRenderedItemId = new AutoHintedMatcher("uniform int currentRenderedItemId;", ParseShape.EXTERNAL_DECLARATION);

    public static void patchOverlayColor(ASTParser aSTParser, TranslationUnit translationUnit, Root root, VanillaParameters vanillaParameters) {
        root.processMatches(aSTParser, uniformVec4EntityColor, ASTNode::detachAndDelete);
        if (vanillaParameters.type.glShaderType == ShaderType.VERTEX) {
            translationUnit.parseAndInjectNodes(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, new String[]{"uniform sampler2D iris_overlay;", "out vec4 entityColor;", "out vec4 iris_vertexColor;", vanillaParameters.inputs.isIE() ? "uniform ivec2 iris_OverlayUV;" : "in ivec2 iris_UV1;"});
            translationUnit.prependMainFunctionBody(aSTParser, new String[]{"vec4 overlayColor = texelFetch(iris_overlay, " + (vanillaParameters.inputs.isIE() ? "iris_OverlayUV" : "iris_UV1") + ", 0);", "entityColor = vec4(overlayColor.rgb, 1.0 - overlayColor.a);", "iris_vertexColor = iris_Color;", "entityColor.rgb *= float(entityColor.a != 0.0);"});
        } else if (vanillaParameters.type.glShaderType == ShaderType.TESSELATION_CONTROL) {
            root.replaceReferenceExpressions(aSTParser, "entityColor", "entityColor[gl_InvocationID]");
            translationUnit.parseAndInjectNodes(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, new String[]{"patch out vec4 entityColorTCS;", "in vec4 entityColor[];", "out vec4 iris_vertexColorTCS[];", "in vec4 iris_vertexColor[];"});
            translationUnit.prependMainFunctionBody(aSTParser, new String[]{"entityColorTCS = entityColor[gl_InvocationID];", "iris_vertexColorTCS[gl_InvocationID] = iris_vertexColor[gl_InvocationID];"});
        } else if (vanillaParameters.type.glShaderType == ShaderType.TESSELATION_EVAL) {
            root.replaceReferenceExpressions(aSTParser, "entityColor", "entityColorTCS");
            translationUnit.parseAndInjectNodes(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, new String[]{"out vec4 entityColorTES;", "patch in vec4 entityColorTCS;", "out vec4 iris_vertexColorTES;", "in vec4 iris_vertexColorTCS[];"});
            translationUnit.prependMainFunctionBody(aSTParser, new String[]{"entityColorTES = entityColorTCS;", "iris_vertexColorTES = iris_vertexColorTCS[0];"});
        } else if (vanillaParameters.type.glShaderType == ShaderType.GEOMETRY) {
            root.replaceReferenceExpressions(aSTParser, "entityColor", "entityColor[0]");
            translationUnit.parseAndInjectNodes(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, new String[]{"out vec4 entityColorGS;", "in vec4 entityColor[];", "out vec4 iris_vertexColorGS;", "in vec4 iris_vertexColor[];"});
            translationUnit.prependMainFunctionBody(aSTParser, new String[]{"entityColorGS = entityColor[0];", "iris_vertexColorGS = iris_vertexColor[0];"});
            if (vanillaParameters.hasTesselation) {
                root.rename("iris_vertexColor", "iris_vertexColorTES");
                root.rename("entityColor", "entityColorTES");
            }
        } else if (vanillaParameters.type.glShaderType == ShaderType.FRAGMENT) {
            translationUnit.parseAndInjectNodes(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, new String[]{"in vec4 entityColor;", "in vec4 iris_vertexColor;"});
            translationUnit.prependMainFunctionBody(aSTParser, "float iris_vertexColorAlpha = iris_vertexColor.a;");
            if (vanillaParameters.hasGeometry) {
                root.rename("entityColor", "entityColorGS");
                root.rename("iris_vertexColor", "iris_vertexColorGS");
            } else if (vanillaParameters.hasTesselation) {
                root.rename("entityColor", "entityColorTES");
                root.rename("iris_vertexColor", "iris_vertexColorTES");
            }
        }
    }

    public static void patchEntityId(ASTParser aSTParser, TranslationUnit translationUnit, Root root, VanillaParameters vanillaParameters) {
        root.processMatches(aSTParser, uniformIntEntityId, ASTNode::detachAndDelete);
        root.processMatches(aSTParser, uniformIntBlockEntityId, ASTNode::detachAndDelete);
        root.processMatches(aSTParser, uniformIntCurrentRenderedItemId, ASTNode::detachAndDelete);
        if (vanillaParameters.type.glShaderType == ShaderType.GEOMETRY) {
            root.replaceReferenceExpressions(aSTParser, "entityId", "iris_entityInfo[0].x");
            root.replaceReferenceExpressions(aSTParser, "blockEntityId", "iris_entityInfo[0].y");
            root.replaceReferenceExpressions(aSTParser, "currentRenderedItemId", "iris_entityInfo[0].z");
        } else {
            root.replaceReferenceExpressions(aSTParser, "entityId", "iris_entityInfo.x");
            root.replaceReferenceExpressions(aSTParser, "blockEntityId", "iris_entityInfo.y");
            root.replaceReferenceExpressions(aSTParser, "currentRenderedItemId", "iris_entityInfo.z");
        }
        if (vanillaParameters.type.glShaderType == ShaderType.VERTEX) {
            translationUnit.parseAndInjectNodes(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, new String[]{"flat out ivec3 iris_entityInfo;", "in ivec3 iris_Entity;"});
            translationUnit.prependMainFunctionBody(aSTParser, "iris_entityInfo = iris_Entity;");
        } else if (vanillaParameters.type.glShaderType == ShaderType.TESSELATION_CONTROL) {
            translationUnit.parseAndInjectNodes(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, new String[]{"flat out ivec3 iris_entityInfoTCS[];", "flat in ivec3 iris_entityInfo[];"});
            root.replaceReferenceExpressions(aSTParser, "iris_entityInfo", "iris_EntityInfo[gl_InvocationID]");
            translationUnit.prependMainFunctionBody(aSTParser, "iris_entityInfoTCS[gl_InvocationID] = iris_entityInfo[gl_InvocationID];");
        } else if (vanillaParameters.type.glShaderType == ShaderType.TESSELATION_EVAL) {
            translationUnit.parseAndInjectNodes(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, new String[]{"flat out ivec3 iris_entityInfoTES;", "flat in ivec3 iris_entityInfoTCS[];"});
            translationUnit.prependMainFunctionBody(aSTParser, "iris_entityInfoTES = iris_entityInfoTCS[0];");
            root.replaceReferenceExpressions(aSTParser, "iris_entityInfo", "iris_EntityInfoTCS[0]");
        } else if (vanillaParameters.type.glShaderType == ShaderType.GEOMETRY) {
            translationUnit.parseAndInjectNodes(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, new String[]{"flat out ivec3 iris_entityInfoGS;", "flat in ivec3 iris_entityInfo" + (vanillaParameters.hasTesselation ? "TES" : "") + "[];"});
            translationUnit.prependMainFunctionBody(aSTParser, "iris_entityInfoGS = iris_entityInfo" + (vanillaParameters.hasTesselation ? "TES" : "") + "[0];");
        } else if (vanillaParameters.type.glShaderType == ShaderType.FRAGMENT) {
            translationUnit.parseAndInjectNodes(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, new String[]{"flat in ivec3 iris_entityInfo;"});
            if (vanillaParameters.hasGeometry) {
                root.rename("iris_entityInfo", "iris_EntityInfoGS");
            } else if (vanillaParameters.hasTesselation) {
                root.rename("iris_entityInfo", "iris_entityInfoTES");
            }
        }
    }
}

