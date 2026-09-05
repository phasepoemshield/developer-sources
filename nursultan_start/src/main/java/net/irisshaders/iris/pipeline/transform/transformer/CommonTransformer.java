/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.github.douira.glsl_transformer.ast.node.Identifier
 *  io.github.douira.glsl_transformer.ast.node.TranslationUnit
 *  io.github.douira.glsl_transformer.ast.node.abstract_node.ASTNode
 *  io.github.douira.glsl_transformer.ast.node.declaration.DeclarationMember
 *  io.github.douira.glsl_transformer.ast.node.declaration.TypeAndInitDeclaration
 *  io.github.douira.glsl_transformer.ast.node.expression.Expression
 *  io.github.douira.glsl_transformer.ast.node.expression.LiteralExpression
 *  io.github.douira.glsl_transformer.ast.node.expression.ReferenceExpression
 *  io.github.douira.glsl_transformer.ast.node.expression.binary.ArrayAccessExpression
 *  io.github.douira.glsl_transformer.ast.node.expression.unary.FunctionCallExpression
 *  io.github.douira.glsl_transformer.ast.node.external_declaration.DeclarationExternalDeclaration
 *  io.github.douira.glsl_transformer.ast.node.external_declaration.ExternalDeclaration
 *  io.github.douira.glsl_transformer.ast.node.type.qualifier.StorageQualifier
 *  io.github.douira.glsl_transformer.ast.node.type.qualifier.StorageQualifier$StorageType
 *  io.github.douira.glsl_transformer.ast.node.type.specifier.BuiltinNumericTypeSpecifier
 *  io.github.douira.glsl_transformer.ast.query.Root
 *  io.github.douira.glsl_transformer.ast.query.match.AutoHintedMatcher
 *  io.github.douira.glsl_transformer.ast.query.match.Matcher
 *  io.github.douira.glsl_transformer.ast.transform.ASTInjectionPoint
 *  io.github.douira.glsl_transformer.ast.transform.ASTParser
 *  io.github.douira.glsl_transformer.ast.transform.Template
 *  io.github.douira.glsl_transformer.parser.ParseShape
 *  io.github.douira.glsl_transformer.util.Type
 *  net.irisshaders.iris.gl.blending.AlphaTest
 *  net.irisshaders.iris.gl.shader.ShaderType
 */
package net.irisshaders.iris.pipeline.transform.transformer;

import io.github.douira.glsl_transformer.ast.node.Identifier;
import io.github.douira.glsl_transformer.ast.node.TranslationUnit;
import io.github.douira.glsl_transformer.ast.node.abstract_node.ASTNode;
import io.github.douira.glsl_transformer.ast.node.declaration.DeclarationMember;
import io.github.douira.glsl_transformer.ast.node.declaration.TypeAndInitDeclaration;
import io.github.douira.glsl_transformer.ast.node.expression.Expression;
import io.github.douira.glsl_transformer.ast.node.expression.LiteralExpression;
import io.github.douira.glsl_transformer.ast.node.expression.ReferenceExpression;
import io.github.douira.glsl_transformer.ast.node.expression.binary.ArrayAccessExpression;
import io.github.douira.glsl_transformer.ast.node.expression.unary.FunctionCallExpression;
import io.github.douira.glsl_transformer.ast.node.external_declaration.DeclarationExternalDeclaration;
import io.github.douira.glsl_transformer.ast.node.external_declaration.ExternalDeclaration;
import io.github.douira.glsl_transformer.ast.node.type.qualifier.StorageQualifier;
import io.github.douira.glsl_transformer.ast.node.type.specifier.BuiltinNumericTypeSpecifier;
import io.github.douira.glsl_transformer.ast.query.Root;
import io.github.douira.glsl_transformer.ast.query.match.AutoHintedMatcher;
import io.github.douira.glsl_transformer.ast.query.match.Matcher;
import io.github.douira.glsl_transformer.ast.transform.ASTInjectionPoint;
import io.github.douira.glsl_transformer.ast.transform.ASTParser;
import io.github.douira.glsl_transformer.ast.transform.Template;
import io.github.douira.glsl_transformer.parser.ParseShape;
import io.github.douira.glsl_transformer.util.Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;
import net.irisshaders.iris.gl.blending.AlphaTest;
import net.irisshaders.iris.gl.shader.ShaderType;
import net.irisshaders.iris.pipeline.transform.parameter.Parameters;
import net.irisshaders.iris.pipeline.transform.parameter.VanillaParameters;
import net.irisshaders.iris.pipeline.transform.transformer.CommonTransformer$1;
import net.irisshaders.iris.pipeline.transform.transformer.CommonTransformer$2;
import net.irisshaders.iris.pipeline.transform.transformer.CommonTransformer$RenameTargetResult;

public class CommonTransformer {
    public static final AutoHintedMatcher<Expression> glTextureMatrix0 = new AutoHintedMatcher("gl_TextureMatrix[0]", ParseShape.EXPRESSION);
    public static final AutoHintedMatcher<Expression> glTextureMatrix1 = new AutoHintedMatcher("gl_TextureMatrix[1]", ParseShape.EXPRESSION);
    public static final AutoHintedMatcher<Expression> glTextureMatrix2 = new AutoHintedMatcher("gl_TextureMatrix[2]", ParseShape.EXPRESSION);
    public static final Matcher<ExternalDeclaration> sampler = new CommonTransformer$1("uniform Type name;", ParseShape.EXTERNAL_DECLARATION);
    private static final AutoHintedMatcher<Expression> glFragDataI = new CommonTransformer$2("gl_FragData[index]", ParseShape.EXPRESSION);
    private static final Template<ExternalDeclaration> fragDataDeclaration = Template.withExternalDeclaration((String)"layout (location = __index) out vec4 __name;");
    private static final List<Expression> replaceExpressions = new ArrayList<Expression>();
    private static final List<Long> replaceIndexes = new ArrayList<Long>();
    private static final Template<ExternalDeclaration> inputDeclarationTemplate = Template.withExternalDeclaration((String)"uniform int __name;");
    private static final Template<ExternalDeclaration> inputDeclarationTemplateLayout = Template.withExternalDeclaration((String)"layout (location = __index) uniform int __name;");

    static {
        fragDataDeclaration.markLocalReplacement("__index", ReferenceExpression.class);
        fragDataDeclaration.markIdentifierReplacement("__name");
        inputDeclarationTemplate.markLocalReplacement(CommonTransformer.inputDeclarationTemplate.getSourceRoot().nodeIndex.getOne(StorageQualifier.class));
        inputDeclarationTemplate.markLocalReplacement(CommonTransformer.inputDeclarationTemplate.getSourceRoot().nodeIndex.getOne(BuiltinNumericTypeSpecifier.class));
        inputDeclarationTemplate.markIdentifierReplacement("__name");
        inputDeclarationTemplateLayout.markLocalReplacement("__index", ReferenceExpression.class);
        inputDeclarationTemplateLayout.markLocalReplacement(CommonTransformer.inputDeclarationTemplateLayout.getSourceRoot().nodeIndex.getOne(StorageQualifier.class));
        inputDeclarationTemplateLayout.markLocalReplacement(CommonTransformer.inputDeclarationTemplateLayout.getSourceRoot().nodeIndex.getOne(BuiltinNumericTypeSpecifier.class));
        inputDeclarationTemplateLayout.markIdentifierReplacement("__name");
    }

    public static void transform(ASTParser aSTParser, TranslationUnit translationUnit, Root root, Parameters parameters, boolean bl) {
        Object object;
        ArrayAccessExpression arrayAccessExpression;
        Object object2;
        root.rename("gl_FogFragCoord", "iris_FogFragCoord");
        if (parameters.type.glShaderType == ShaderType.VERTEX) {
            translationUnit.parseAndInjectNode(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, "out float iris_FogFragCoord;");
            translationUnit.prependMainFunctionBody(aSTParser, "iris_FogFragCoord = 0.0f;");
        } else if (parameters.type.glShaderType == ShaderType.FRAGMENT) {
            translationUnit.parseAndInjectNode(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, "in float iris_FogFragCoord;");
        }
        if (parameters.type.glShaderType == ShaderType.VERTEX) {
            translationUnit.parseAndInjectNode(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, "vec4 iris_FrontColor;");
            root.rename("gl_FrontColor", "iris_FrontColor");
        }
        if (parameters.type.glShaderType == ShaderType.FRAGMENT) {
            if (root.identifierIndex.has("gl_FragColor")) {
                root.replaceReferenceExpressions(aSTParser, "gl_FragColor", "gl_FragData[0]");
            }
            if (root.identifierIndex.has("gl_TexCoord")) {
                root.rename("gl_TexCoord", "irs_texCoords");
                translationUnit.parseAndInjectNode(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, "in vec4 irs_texCoords[3];");
            }
            if (root.identifierIndex.has("gl_Color")) {
                root.rename("gl_Color", "irs_Color");
                translationUnit.parseAndInjectNode(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, "in vec4 irs_Color;");
            }
            replaceExpressions.clear();
            replaceIndexes.clear();
            object2 = new HashSet();
            for (Identifier identifier2 : root.identifierIndex.get("gl_FragData")) {
                arrayAccessExpression = (ArrayAccessExpression)identifier2.getAncestor(ArrayAccessExpression.class);
                if (arrayAccessExpression == null || !glFragDataI.matchesExtract((ASTNode)arrayAccessExpression)) continue;
                replaceExpressions.add((Expression)arrayAccessExpression);
                long l = ((LiteralExpression)glFragDataI.getNodeMatch("index", LiteralExpression.class)).getInteger();
                replaceIndexes.add(l);
                object2.add(l);
            }
            for (int i = 0; i < replaceExpressions.size(); ++i) {
                replaceExpressions.get(i).replaceByAndDelete((ASTNode)new ReferenceExpression(new Identifier("iris_FragData" + String.valueOf(replaceIndexes.get(i)))));
            }
            object = object2.iterator();
            while (object.hasNext()) {
                long l = (Long)object.next();
                translationUnit.injectNode(ASTInjectionPoint.BEFORE_DECLARATIONS, (ExternalDeclaration)fragDataDeclaration.getInstanceFor(root, new ASTNode[]{new LiteralExpression(Type.INT32, l), new Identifier("iris_FragData" + l)}));
            }
            replaceExpressions.clear();
            replaceIndexes.clear();
            if (parameters.getAlphaTest() != AlphaTest.ALWAYS && !bl && object2.contains(0L)) {
                translationUnit.parseAndInjectNode(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, "uniform float iris_currentAlphaTest;");
                translationUnit.appendMainFunctionBody(aSTParser, parameters.getAlphaTest().toExpression("iris_FragData0.a", "iris_currentAlphaTest", "\t"));
            }
        }
        if (parameters.type.glShaderType == ShaderType.VERTEX || parameters.type.glShaderType == ShaderType.FRAGMENT) {
            CommonTransformer.upgradeStorageQualifiers(aSTParser, translationUnit, root, parameters);
        }
        object2 = CommonTransformer.getGtextureRenameTargets("gcolor", root);
        object = CommonTransformer.getGtextureRenameTargets("texture", root);
        DeclarationMember declarationMember = null;
        arrayAccessExpression = Stream.empty();
        if (object2 != null) {
            declarationMember = ((CommonTransformer$RenameTargetResult)((Object)object2)).samplerDeclarationMember;
            arrayAccessExpression = Stream.concat(arrayAccessExpression, ((CommonTransformer$RenameTargetResult)((Object)object2)).targets);
        }
        if (object != null) {
            if (declarationMember == null) {
                declarationMember = ((CommonTransformer$RenameTargetResult)((Object)object)).samplerDeclarationMember;
            } else {
                DeclarationMember declarationMember2 = ((CommonTransformer$RenameTargetResult)((Object)object)).samplerDeclarationMember;
                if (((TypeAndInitDeclaration)declarationMember2.getParent()).getMembers().size() == 1) {
                    ((CommonTransformer$RenameTargetResult)((Object)object)).samplerDeclaration.detachAndDelete();
                } else {
                    declarationMember2.detachAndDelete();
                }
            }
            arrayAccessExpression = Stream.concat(arrayAccessExpression, ((CommonTransformer$RenameTargetResult)((Object)object)).targets);
        }
        if (declarationMember != null) {
            declarationMember.getName().setName("gtexture");
        }
        root.process(arrayAccessExpression.filter(identifier -> !(identifier.getParent() instanceof FunctionCallExpression)), identifier -> identifier.setName("gtexture"));
        root.rename("gl_Fog", "irisInt_Fog");
        if (!(parameters instanceof VanillaParameters)) {
            translationUnit.parseAndInjectNodes(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, new String[]{"uniform float iris_FogDensity;", "uniform float iris_FogStart;", "uniform float iris_FogEnd;", "uniform vec4 iris_FogColor;", "struct iris_FogParameters {vec4 color;float density;float start;float end;float scale;};", "iris_FogParameters irisInt_Fog = iris_FogParameters(iris_FogColor, iris_FogDensity, iris_FogStart, iris_FogEnd, 1.0 / (iris_FogEnd - iris_FogStart));"});
        }
        CommonTransformer.renameFunctionCall(root, "texture2D", "texture");
        CommonTransformer.renameFunctionCall(root, "texture3D", "texture");
        CommonTransformer.renameFunctionCall(root, "texture2DLod", "textureLod");
        CommonTransformer.renameFunctionCall(root, "texture3DLod", "textureLod");
        CommonTransformer.renameFunctionCall(root, "texture2DProj", "textureProj");
        CommonTransformer.renameFunctionCall(root, "texture3DProj", "textureProj");
        CommonTransformer.renameFunctionCall(root, "texture2DGrad", "textureGrad");
        CommonTransformer.renameFunctionCall(root, "texture2DGradARB", "textureGrad");
        CommonTransformer.renameFunctionCall(root, "texture3DGrad", "textureGrad");
        CommonTransformer.renameFunctionCall(root, "texelFetch2D", "texelFetch");
        CommonTransformer.renameFunctionCall(root, "texelFetch3D", "texelFetch");
        CommonTransformer.renameFunctionCall(root, "textureSize2D", "textureSize");
        CommonTransformer.renameAndWrapShadow(aSTParser, root, "shadow2D", "texture");
        CommonTransformer.renameAndWrapShadow(aSTParser, root, "shadow2DLod", "textureLod");
    }

    public static void replaceGlMultiTexCoordBounded(ASTParser aSTParser, Root root, int n, int n2) {
        root.replaceReferenceExpressions(aSTParser, root.getPrefixIdentifierIndex().prefixQueryFlat("gl_MultiTexCoord").filter(identifier -> {
            int n3 = Integer.parseInt(identifier.getName().substring("gl_MultiTexCoord".length()));
            return n3 >= n && n3 <= n2;
        }), "vec4(0.0, 0.0, 0.0, 1.0)");
    }

    public static void addIfNotExists(Root root, ASTParser aSTParser, TranslationUnit translationUnit, String string, Type type, StorageQualifier.StorageType storageType, int n) {
        if (root.externalDeclarationIndex.getStream(string).noneMatch(declarationEntry -> declarationEntry.declaration() instanceof DeclarationExternalDeclaration)) {
            translationUnit.injectNode(ASTInjectionPoint.BEFORE_DECLARATIONS, (ExternalDeclaration)inputDeclarationTemplateLayout.getInstanceFor(root, new ASTNode[]{new LiteralExpression(Type.INT32, (long)n), new StorageQualifier(storageType), new BuiltinNumericTypeSpecifier(type), new Identifier(string)}));
        }
    }

    public static void addIfNotExists(Root root, ASTParser aSTParser, TranslationUnit translationUnit, String string, Type type, StorageQualifier.StorageType storageType) {
        if (root.externalDeclarationIndex.getStream(string).noneMatch(declarationEntry -> declarationEntry.declaration() instanceof DeclarationExternalDeclaration)) {
            translationUnit.injectNode(ASTInjectionPoint.BEFORE_DECLARATIONS, (ExternalDeclaration)inputDeclarationTemplate.getInstanceFor(root, new ASTNode[]{new StorageQualifier(storageType), new BuiltinNumericTypeSpecifier(type), new Identifier(string)}));
        }
    }

    static void renameFunctionCall(Root root, String string, String string2) {
        root.process(root.identifierIndex.getStream(string).filter(identifier -> identifier.getParent() instanceof FunctionCallExpression), identifier -> identifier.setName(string2));
    }

    public static void upgradeStorageQualifiers(ASTParser aSTParser, TranslationUnit translationUnit, Root root, Parameters parameters) {
        for (StorageQualifier storageQualifier : root.nodeIndex.get(StorageQualifier.class)) {
            if (storageQualifier.storageType == StorageQualifier.StorageType.ATTRIBUTE) {
                storageQualifier.storageType = StorageQualifier.StorageType.IN;
                continue;
            }
            if (storageQualifier.storageType != StorageQualifier.StorageType.VARYING) continue;
            storageQualifier.storageType = parameters.type.glShaderType == ShaderType.VERTEX ? StorageQualifier.StorageType.OUT : StorageQualifier.StorageType.IN;
        }
    }

    public static void patchMultiTexCoord3(ASTParser aSTParser, TranslationUnit translationUnit, Root root, Parameters parameters) {
        if (parameters.type.glShaderType == ShaderType.VERTEX && root.identifierIndex.has("gl_MultiTexCoord3") && !root.identifierIndex.has("mc_midTexCoord")) {
            root.rename("gl_MultiTexCoord3", "mc_midTexCoord");
            translationUnit.parseAndInjectNode(aSTParser, ASTInjectionPoint.BEFORE_DECLARATIONS, "attribute vec4 mc_midTexCoord;");
        }
    }

    static void renameAndWrapShadow(ASTParser aSTParser, Root root, String string, String string2) {
        root.process(root.identifierIndex.getStream(string).filter(identifier -> identifier.getParent() instanceof FunctionCallExpression), identifier -> {
            FunctionCallExpression functionCallExpression = (FunctionCallExpression)identifier.getParent();
            functionCallExpression.getFunctionName().setName(string2);
            FunctionCallExpression functionCallExpression2 = (FunctionCallExpression)aSTParser.parseExpression(root, "vec4()");
            functionCallExpression.replaceBy((ASTNode)functionCallExpression2);
            functionCallExpression2.getParameters().add((Object)functionCallExpression);
        });
    }

    private static CommonTransformer$RenameTargetResult getGtextureRenameTargets(String string, Root root) {
        ArrayList arrayList = new ArrayList();
        DeclarationExternalDeclaration declarationExternalDeclaration = null;
        DeclarationMember declarationMember = null;
        for (Identifier identifier : root.identifierIndex.get(string)) {
            DeclarationExternalDeclaration declarationExternalDeclaration2;
            arrayList.add(identifier);
            if (declarationExternalDeclaration != null || (declarationExternalDeclaration2 = (DeclarationExternalDeclaration)identifier.getAncestor(3, 0, DeclarationExternalDeclaration.class::isInstance)) == null) continue;
            if (sampler.matchesExtract((ASTNode)declarationExternalDeclaration2)) {
                boolean bl = false;
                for (DeclarationMember declarationMember2 : ((TypeAndInitDeclaration)((DeclarationMember)sampler.getNodeMatch("name*", DeclarationMember.class)).getAncestor(TypeAndInitDeclaration.class)).getMembers()) {
                    if (!declarationMember2.getName().getName().equals(string)) continue;
                    bl = true;
                }
                if (!bl) {
                    return null;
                }
                declarationExternalDeclaration = declarationExternalDeclaration2;
                declarationMember = (DeclarationMember)identifier.getAncestor(DeclarationMember.class);
                arrayList.removeLast();
                continue;
            }
            return null;
        }
        if (declarationExternalDeclaration == null) {
            return null;
        }
        return new CommonTransformer$RenameTargetResult(declarationExternalDeclaration, declarationMember, arrayList.stream());
    }

    public static void applyIntelHd4000Workaround(Root root) {
        root.rename("ftransform", "iris_ftransform");
    }
}

