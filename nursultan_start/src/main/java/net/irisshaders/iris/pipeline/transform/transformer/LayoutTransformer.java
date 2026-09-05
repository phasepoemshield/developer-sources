/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.github.douira.glsl_transformer.ast.data.ChildNodeList
 *  io.github.douira.glsl_transformer.ast.node.Identifier
 *  io.github.douira.glsl_transformer.ast.node.TranslationUnit
 *  io.github.douira.glsl_transformer.ast.node.abstract_node.ASTNode
 *  io.github.douira.glsl_transformer.ast.node.declaration.DeclarationMember
 *  io.github.douira.glsl_transformer.ast.node.declaration.TypeAndInitDeclaration
 *  io.github.douira.glsl_transformer.ast.node.expression.Expression
 *  io.github.douira.glsl_transformer.ast.node.expression.LiteralExpression
 *  io.github.douira.glsl_transformer.ast.node.external_declaration.DeclarationExternalDeclaration
 *  io.github.douira.glsl_transformer.ast.node.external_declaration.ExternalDeclaration
 *  io.github.douira.glsl_transformer.ast.node.type.qualifier.LayoutQualifier
 *  io.github.douira.glsl_transformer.ast.node.type.qualifier.NamedLayoutQualifierPart
 *  io.github.douira.glsl_transformer.ast.node.type.qualifier.StorageQualifier
 *  io.github.douira.glsl_transformer.ast.node.type.qualifier.StorageQualifier$StorageType
 *  io.github.douira.glsl_transformer.ast.node.type.qualifier.TypeQualifier
 *  io.github.douira.glsl_transformer.ast.node.type.qualifier.TypeQualifierPart
 *  io.github.douira.glsl_transformer.ast.node.type.specifier.BuiltinNumericTypeSpecifier
 *  io.github.douira.glsl_transformer.ast.node.type.specifier.TypeSpecifier
 *  io.github.douira.glsl_transformer.ast.query.Root
 *  io.github.douira.glsl_transformer.ast.query.match.Matcher
 *  io.github.douira.glsl_transformer.ast.transform.ASTInjectionPoint
 *  io.github.douira.glsl_transformer.ast.transform.ASTParser
 *  io.github.douira.glsl_transformer.ast.transform.Template
 *  io.github.douira.glsl_transformer.parser.ParseShape
 *  io.github.douira.glsl_transformer.util.Type
 *  it.unimi.dsi.fastutil.objects.Object2IntArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.gl.shader.ShaderType
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.irisshaders.iris.pipeline.transform.transformer;

import io.github.douira.glsl_transformer.ast.data.ChildNodeList;
import io.github.douira.glsl_transformer.ast.node.Identifier;
import io.github.douira.glsl_transformer.ast.node.TranslationUnit;
import io.github.douira.glsl_transformer.ast.node.abstract_node.ASTNode;
import io.github.douira.glsl_transformer.ast.node.declaration.DeclarationMember;
import io.github.douira.glsl_transformer.ast.node.declaration.TypeAndInitDeclaration;
import io.github.douira.glsl_transformer.ast.node.expression.Expression;
import io.github.douira.glsl_transformer.ast.node.expression.LiteralExpression;
import io.github.douira.glsl_transformer.ast.node.external_declaration.DeclarationExternalDeclaration;
import io.github.douira.glsl_transformer.ast.node.external_declaration.ExternalDeclaration;
import io.github.douira.glsl_transformer.ast.node.type.qualifier.LayoutQualifier;
import io.github.douira.glsl_transformer.ast.node.type.qualifier.NamedLayoutQualifierPart;
import io.github.douira.glsl_transformer.ast.node.type.qualifier.StorageQualifier;
import io.github.douira.glsl_transformer.ast.node.type.qualifier.TypeQualifier;
import io.github.douira.glsl_transformer.ast.node.type.qualifier.TypeQualifierPart;
import io.github.douira.glsl_transformer.ast.node.type.specifier.BuiltinNumericTypeSpecifier;
import io.github.douira.glsl_transformer.ast.node.type.specifier.TypeSpecifier;
import io.github.douira.glsl_transformer.ast.query.Root;
import io.github.douira.glsl_transformer.ast.query.match.Matcher;
import io.github.douira.glsl_transformer.ast.transform.ASTInjectionPoint;
import io.github.douira.glsl_transformer.ast.transform.ASTParser;
import io.github.douira.glsl_transformer.ast.transform.Template;
import io.github.douira.glsl_transformer.parser.ParseShape;
import io.github.douira.glsl_transformer.util.Type;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Stream;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.shader.ShaderType;
import net.irisshaders.iris.pipeline.transform.PatchShaderType;
import net.irisshaders.iris.pipeline.transform.parameter.Parameters;
import net.irisshaders.iris.pipeline.transform.transformer.LayoutTransformer$1;
import net.irisshaders.iris.pipeline.transform.transformer.LayoutTransformer$2;
import net.irisshaders.iris.pipeline.transform.transformer.LayoutTransformer$DeclarationMatcher;
import net.irisshaders.iris.pipeline.transform.transformer.LayoutTransformer$NewDeclarationData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LayoutTransformer {
    private static final Logger LOGGER = LogManager.getLogger(LayoutTransformer.class);
    private static final ShaderType[] pipeline = new ShaderType[]{ShaderType.VERTEX, ShaderType.TESSELATION_CONTROL, ShaderType.TESSELATION_EVAL, ShaderType.GEOMETRY, ShaderType.FRAGMENT};
    private static final Matcher<ExternalDeclaration> outDeclarationMatcher = new LayoutTransformer$DeclarationMatcher(StorageQualifier.StorageType.OUT);
    private static final Matcher<ExternalDeclaration> inDeclarationMatcher = new LayoutTransformer$DeclarationMatcher(StorageQualifier.StorageType.IN);
    private static final Matcher<ExternalDeclaration> nonLayoutOutDeclarationMatcher = new LayoutTransformer$1("out float name;", ParseShape.EXTERNAL_DECLARATION);
    private static final Matcher<ExternalDeclaration> nonLayoutInDeclarationMatcher = new LayoutTransformer$2("in float name;", ParseShape.EXTERNAL_DECLARATION);
    private static final Template<ExternalDeclaration> layoutedOutDeclarationTemplate = Template.withExternalDeclaration((String)"out __type __name;");
    private static final Template<ExternalDeclaration> layoutedInDeclarationTemplate = Template.withExternalDeclaration((String)"in __type __name;");
    private static final String attachTargetPrefix = "outColor";
    private static final List<String> reservedWords = List.of("texture");

    static {
        layoutedOutDeclarationTemplate.markLocalReplacement(LayoutTransformer.layoutedOutDeclarationTemplate.getSourceRoot().nodeIndex.getOne(TypeQualifier.class));
        layoutedOutDeclarationTemplate.markLocalReplacement("__type", TypeSpecifier.class);
        layoutedOutDeclarationTemplate.markLocalReplacement("__name", DeclarationMember.class);
        layoutedInDeclarationTemplate.markLocalReplacement(LayoutTransformer.layoutedInDeclarationTemplate.getSourceRoot().nodeIndex.getOne(TypeQualifier.class));
        layoutedInDeclarationTemplate.markLocalReplacement("__type", TypeSpecifier.class);
        layoutedInDeclarationTemplate.markLocalReplacement("__name", DeclarationMember.class);
    }

    public static void transformGrouped(ASTParser aSTParser, Map<PatchShaderType, TranslationUnit> map, Parameters parameters) {
        Object var3_3 = null;
        AtomicReference atomicReference = new AtomicReference();
        for (ShaderType shaderType : pipeline) {
            TranslationUnit translationUnit = PatchShaderType.fromGlShaderType(shaderType);
            boolean bl = false;
            TranslationUnit translationUnit2 = translationUnit;
            int n = ((PatchShaderType[])translationUnit2).length;
            for (int i = 0; i < n; ++i) {
                PatchShaderType patchShaderType = translationUnit2[i];
                if (map.get((Object)patchShaderType) == null) continue;
                bl = true;
            }
            if (!bl || (translationUnit2 = map.get((Object)translationUnit[0])) == null) continue;
            Root root2 = translationUnit2.getRoot();
            root2.indexBuildSession(root -> {
                if (root != null) {
                    if (atomicReference.get() != null) {
                        LayoutTransformer.transformIn((Object2IntMap<String>)((Object2IntMap)atomicReference.get()), aSTParser, translationUnit2, root, parameters);
                    }
                    atomicReference.set(LayoutTransformer.transformOut(aSTParser, translationUnit2, root, parameters));
                }
            });
        }
    }

    private static StorageQualifier getConstQualifier(TypeQualifier typeQualifier) {
        if (typeQualifier == null) {
            return null;
        }
        for (TypeQualifierPart typeQualifierPart : typeQualifier.getChildren()) {
            if (!(typeQualifierPart instanceof StorageQualifier)) continue;
            StorageQualifier storageQualifier = (StorageQualifier)typeQualifierPart;
            if (storageQualifier.storageType != StorageQualifier.StorageType.CONST) continue;
            return storageQualifier;
        }
        return null;
    }

    private static TypeQualifier makeQualifierOut(TypeQualifier typeQualifier) {
        for (TypeQualifierPart typeQualifierPart : typeQualifier.getParts()) {
            if (!(typeQualifierPart instanceof StorageQualifier)) continue;
            StorageQualifier storageQualifier = (StorageQualifier)typeQualifierPart;
            if (storageQualifier.storageType != StorageQualifier.StorageType.IN) continue;
            storageQualifier.storageType = StorageQualifier.StorageType.OUT;
        }
        return typeQualifier;
    }

    public static Object2IntMap<String> transformOut(ASTParser aSTParser, TranslationUnit translationUnit, Root root, Parameters parameters) {
        BuiltinNumericTypeSpecifier builtinNumericTypeSpecifier;
        TypeQualifier typeQualifier;
        ArrayList<LayoutTransformer$NewDeclarationData> arrayList = new ArrayList<LayoutTransformer$NewDeclarationData>();
        int n = 0;
        Object2IntArrayMap object2IntArrayMap = new Object2IntArrayMap();
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        for (Object object : root.nodeIndex.get(DeclarationExternalDeclaration.class)) {
            if (!nonLayoutOutDeclarationMatcher.matchesExtract((ASTNode)object)) continue;
            ChildNodeList object2 = ((TypeAndInitDeclaration)((DeclarationMember)nonLayoutOutDeclarationMatcher.getNodeMatch("name*", DeclarationMember.class)).getAncestor(TypeAndInitDeclaration.class)).getMembers();
            typeQualifier = (TypeQualifier)nonLayoutOutDeclarationMatcher.getNodeMatch("qualifier", TypeQualifier.class);
            builtinNumericTypeSpecifier = (BuiltinNumericTypeSpecifier)nonLayoutOutDeclarationMatcher.getNodeMatch("type", BuiltinNumericTypeSpecifier.class);
            int externalDeclaration = 0;
            for (DeclarationMember declarationMember : object2) {
                String string = declarationMember.getName().getName();
                object2IntArrayMap.put((Object)string, n);
                Iris.logger.warn("Found a declaration named " + string);
                arrayList.add(new LayoutTransformer$NewDeclarationData(typeQualifier, (TypeSpecifier)builtinNumericTypeSpecifier, declarationMember, n++, string));
                ++externalDeclaration;
            }
            if (externalDeclaration != object2.size()) continue;
            arrayList2.add(object);
        }
        translationUnit.getChildren().removeAll(arrayList2);
        for (Object object : arrayList2) {
            object.detachParent();
        }
        ArrayList arrayList3 = new ArrayList();
        for (LayoutTransformer$NewDeclarationData layoutTransformer$NewDeclarationData : arrayList) {
            typeQualifier = layoutTransformer$NewDeclarationData.member;
            typeQualifier.detach();
            builtinNumericTypeSpecifier = layoutTransformer$NewDeclarationData.qualifier.cloneInto(root);
            builtinNumericTypeSpecifier.getChildren().add(0, (Object)new LayoutQualifier(Stream.of(new NamedLayoutQualifierPart(new Identifier("location"), (Expression)new LiteralExpression(Type.INT32, (long)layoutTransformer$NewDeclarationData.location)))));
            ExternalDeclaration externalDeclaration = (ExternalDeclaration)layoutedOutDeclarationTemplate.getInstanceFor(root, new ASTNode[]{builtinNumericTypeSpecifier, layoutTransformer$NewDeclarationData.type.cloneInto(root), typeQualifier});
            arrayList3.add(externalDeclaration);
        }
        translationUnit.injectNodes(ASTInjectionPoint.BEFORE_DECLARATIONS, (Collection)arrayList3);
        return object2IntArrayMap;
    }

    public static void transformIn(Object2IntMap<String> object2IntMap, ASTParser aSTParser, TranslationUnit translationUnit, Root root, Parameters parameters) {
        BuiltinNumericTypeSpecifier builtinNumericTypeSpecifier;
        TypeQualifier typeQualifier;
        ArrayList<LayoutTransformer$NewDeclarationData> arrayList = new ArrayList<LayoutTransformer$NewDeclarationData>();
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        for (Object object : root.nodeIndex.get(DeclarationExternalDeclaration.class)) {
            if (!nonLayoutInDeclarationMatcher.matchesExtract((ASTNode)object)) continue;
            ChildNodeList object2 = ((TypeAndInitDeclaration)((DeclarationMember)nonLayoutInDeclarationMatcher.getNodeMatch("name*", DeclarationMember.class)).getAncestor(TypeAndInitDeclaration.class)).getMembers();
            typeQualifier = (TypeQualifier)nonLayoutInDeclarationMatcher.getNodeMatch("qualifier", TypeQualifier.class);
            builtinNumericTypeSpecifier = (BuiltinNumericTypeSpecifier)nonLayoutInDeclarationMatcher.getNodeMatch("type", BuiltinNumericTypeSpecifier.class);
            int externalDeclaration = 0;
            for (DeclarationMember declarationMember : object2) {
                String string = declarationMember.getName().getName();
                Iris.logger.warn("Found a member with name " + string);
                if (!object2IntMap.containsKey((Object)string)) continue;
                arrayList.add(new LayoutTransformer$NewDeclarationData(typeQualifier, (TypeSpecifier)builtinNumericTypeSpecifier, declarationMember, object2IntMap.getInt((Object)string), string));
                ++externalDeclaration;
            }
            if (externalDeclaration != object2.size()) continue;
            arrayList2.add(object);
        }
        translationUnit.getChildren().removeAll(arrayList2);
        for (Object object : arrayList2) {
            object.detachParent();
        }
        ArrayList arrayList3 = new ArrayList();
        for (LayoutTransformer$NewDeclarationData layoutTransformer$NewDeclarationData : arrayList) {
            typeQualifier = layoutTransformer$NewDeclarationData.member;
            typeQualifier.detach();
            builtinNumericTypeSpecifier = layoutTransformer$NewDeclarationData.qualifier.cloneInto(root);
            builtinNumericTypeSpecifier.getChildren().add(0, (Object)new LayoutQualifier(Stream.of(new NamedLayoutQualifierPart(new Identifier("location"), (Expression)new LiteralExpression(Type.INT32, (long)layoutTransformer$NewDeclarationData.location)))));
            ExternalDeclaration externalDeclaration = (ExternalDeclaration)layoutedInDeclarationTemplate.getInstanceFor(root, new ASTNode[]{builtinNumericTypeSpecifier, layoutTransformer$NewDeclarationData.type.cloneInto(root), typeQualifier});
            arrayList3.add(externalDeclaration);
        }
        translationUnit.injectNodes(ASTInjectionPoint.BEFORE_DECLARATIONS, (Collection)arrayList3);
    }
}

