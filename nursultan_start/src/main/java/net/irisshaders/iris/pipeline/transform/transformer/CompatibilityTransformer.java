/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.github.douira.glsl_transformer.ast.data.ChildNodeList
 *  io.github.douira.glsl_transformer.ast.node.Identifier
 *  io.github.douira.glsl_transformer.ast.node.TranslationUnit
 *  io.github.douira.glsl_transformer.ast.node.abstract_node.ASTNode
 *  io.github.douira.glsl_transformer.ast.node.declaration.DeclarationMember
 *  io.github.douira.glsl_transformer.ast.node.declaration.FunctionParameter
 *  io.github.douira.glsl_transformer.ast.node.declaration.TypeAndInitDeclaration
 *  io.github.douira.glsl_transformer.ast.node.expression.Expression
 *  io.github.douira.glsl_transformer.ast.node.expression.LiteralExpression
 *  io.github.douira.glsl_transformer.ast.node.expression.ReferenceExpression
 *  io.github.douira.glsl_transformer.ast.node.expression.unary.FunctionCallExpression
 *  io.github.douira.glsl_transformer.ast.node.external_declaration.DeclarationExternalDeclaration
 *  io.github.douira.glsl_transformer.ast.node.external_declaration.EmptyDeclaration
 *  io.github.douira.glsl_transformer.ast.node.external_declaration.ExternalDeclaration
 *  io.github.douira.glsl_transformer.ast.node.external_declaration.FunctionDefinition
 *  io.github.douira.glsl_transformer.ast.node.statement.Statement
 *  io.github.douira.glsl_transformer.ast.node.type.qualifier.LayoutQualifier
 *  io.github.douira.glsl_transformer.ast.node.type.qualifier.NamedLayoutQualifierPart
 *  io.github.douira.glsl_transformer.ast.node.type.qualifier.StorageQualifier
 *  io.github.douira.glsl_transformer.ast.node.type.qualifier.StorageQualifier$StorageType
 *  io.github.douira.glsl_transformer.ast.node.type.qualifier.TypeQualifier
 *  io.github.douira.glsl_transformer.ast.node.type.qualifier.TypeQualifierPart
 *  io.github.douira.glsl_transformer.ast.node.type.specifier.ArraySpecifier
 *  io.github.douira.glsl_transformer.ast.node.type.specifier.BuiltinNumericTypeSpecifier
 *  io.github.douira.glsl_transformer.ast.node.type.specifier.FunctionPrototype
 *  io.github.douira.glsl_transformer.ast.node.type.specifier.TypeSpecifier
 *  io.github.douira.glsl_transformer.ast.node.type.struct.StructDeclarator
 *  io.github.douira.glsl_transformer.ast.node.type.struct.StructMember
 *  io.github.douira.glsl_transformer.ast.query.Root
 *  io.github.douira.glsl_transformer.ast.query.match.AutoHintedMatcher
 *  io.github.douira.glsl_transformer.ast.query.match.Matcher
 *  io.github.douira.glsl_transformer.ast.transform.ASTInjectionPoint
 *  io.github.douira.glsl_transformer.ast.transform.ASTParser
 *  io.github.douira.glsl_transformer.ast.transform.Template
 *  io.github.douira.glsl_transformer.ast.transform.TransformationException
 *  io.github.douira.glsl_transformer.parser.ParseShape
 *  io.github.douira.glsl_transformer.util.Type
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
import io.github.douira.glsl_transformer.ast.node.declaration.FunctionParameter;
import io.github.douira.glsl_transformer.ast.node.declaration.TypeAndInitDeclaration;
import io.github.douira.glsl_transformer.ast.node.expression.Expression;
import io.github.douira.glsl_transformer.ast.node.expression.LiteralExpression;
import io.github.douira.glsl_transformer.ast.node.expression.ReferenceExpression;
import io.github.douira.glsl_transformer.ast.node.expression.unary.FunctionCallExpression;
import io.github.douira.glsl_transformer.ast.node.external_declaration.DeclarationExternalDeclaration;
import io.github.douira.glsl_transformer.ast.node.external_declaration.EmptyDeclaration;
import io.github.douira.glsl_transformer.ast.node.external_declaration.ExternalDeclaration;
import io.github.douira.glsl_transformer.ast.node.external_declaration.FunctionDefinition;
import io.github.douira.glsl_transformer.ast.node.statement.Statement;
import io.github.douira.glsl_transformer.ast.node.type.qualifier.LayoutQualifier;
import io.github.douira.glsl_transformer.ast.node.type.qualifier.NamedLayoutQualifierPart;
import io.github.douira.glsl_transformer.ast.node.type.qualifier.StorageQualifier;
import io.github.douira.glsl_transformer.ast.node.type.qualifier.TypeQualifier;
import io.github.douira.glsl_transformer.ast.node.type.qualifier.TypeQualifierPart;
import io.github.douira.glsl_transformer.ast.node.type.specifier.ArraySpecifier;
import io.github.douira.glsl_transformer.ast.node.type.specifier.BuiltinNumericTypeSpecifier;
import io.github.douira.glsl_transformer.ast.node.type.specifier.FunctionPrototype;
import io.github.douira.glsl_transformer.ast.node.type.specifier.TypeSpecifier;
import io.github.douira.glsl_transformer.ast.node.type.struct.StructDeclarator;
import io.github.douira.glsl_transformer.ast.node.type.struct.StructMember;
import io.github.douira.glsl_transformer.ast.query.Root;
import io.github.douira.glsl_transformer.ast.query.match.AutoHintedMatcher;
import io.github.douira.glsl_transformer.ast.query.match.Matcher;
import io.github.douira.glsl_transformer.ast.transform.ASTInjectionPoint;
import io.github.douira.glsl_transformer.ast.transform.ASTParser;
import io.github.douira.glsl_transformer.ast.transform.Template;
import io.github.douira.glsl_transformer.ast.transform.TransformationException;
import io.github.douira.glsl_transformer.parser.ParseShape;
import io.github.douira.glsl_transformer.util.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.shader.ShaderType;
import net.irisshaders.iris.pipeline.transform.PatchShaderType;
import net.irisshaders.iris.pipeline.transform.parameter.Parameters;
import net.irisshaders.iris.pipeline.transform.transformer.CompatibilityTransformer$1;
import net.irisshaders.iris.pipeline.transform.transformer.CompatibilityTransformer$DeclarationMatcher;
import net.irisshaders.iris.pipeline.transform.transformer.CompatibilityTransformer$NewDeclarationData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompatibilityTransformer {
    private static final Logger LOGGER = LogManager.getLogger(CompatibilityTransformer.class);
    private static final AutoHintedMatcher<Expression> sildursWaterFract = new AutoHintedMatcher("fract(worldpos.y + 0.001)", ParseShape.EXPRESSION);
    private static final ShaderType[] pipeline = new ShaderType[]{ShaderType.VERTEX, ShaderType.TESSELATION_CONTROL, ShaderType.TESSELATION_EVAL, ShaderType.GEOMETRY, ShaderType.FRAGMENT};
    private static final Matcher<ExternalDeclaration> outDeclarationMatcher = new CompatibilityTransformer$DeclarationMatcher(StorageQualifier.StorageType.OUT);
    private static final Matcher<ExternalDeclaration> inDeclarationMatcher = new CompatibilityTransformer$DeclarationMatcher(StorageQualifier.StorageType.IN);
    private static final String tagPrefix = "iris_template_";
    private static final Template<ExternalDeclaration> declarationTemplate = Template.withExternalDeclaration((String)"out __type __name;");
    private static final Template<Statement> initTemplate = Template.withStatement((String)"__decl = __value;");
    private static final Template<ExternalDeclaration> variableTemplate = Template.withExternalDeclaration((String)"__type __internalDecl;");
    private static final Template<Statement> statementTemplate = Template.withStatement((String)"__oldDecl = vec3(__internalDecl);");
    private static final Template<Statement> statementTemplateVector = Template.withStatement((String)"__oldDecl = vec3(__internalDecl, vec4(0));");
    private static final Matcher<ExternalDeclaration> nonLayoutOutDeclarationMatcher = new CompatibilityTransformer$1("out float name;", ParseShape.EXTERNAL_DECLARATION);
    private static final Template<ExternalDeclaration> layoutedOutDeclarationTemplate = Template.withExternalDeclaration((String)"out __type __name;");
    private static final String attachTargetPrefix = "outColor";
    private static final List<String> reservedWords = List.of("texture", "sample");

    static {
        declarationTemplate.markLocalReplacement(CompatibilityTransformer.declarationTemplate.getSourceRoot().nodeIndex.getUnique(TypeQualifier.class));
        declarationTemplate.markLocalReplacement("__type", TypeSpecifier.class);
        declarationTemplate.markIdentifierReplacement("__name");
        initTemplate.markIdentifierReplacement("__decl");
        initTemplate.markLocalReplacement("__value", ReferenceExpression.class);
        variableTemplate.markLocalReplacement("__type", TypeSpecifier.class);
        variableTemplate.markIdentifierReplacement("__internalDecl");
        statementTemplate.markIdentifierReplacement("__oldDecl");
        statementTemplate.markIdentifierReplacement("__internalDecl");
        statementTemplate.markLocalReplacement((ASTNode)CompatibilityTransformer.statementTemplate.getSourceRoot().nodeIndex.getStream(BuiltinNumericTypeSpecifier.class).filter(builtinNumericTypeSpecifier -> builtinNumericTypeSpecifier.type == Type.F32VEC3).findAny().get());
        statementTemplateVector.markIdentifierReplacement("__oldDecl");
        statementTemplateVector.markIdentifierReplacement("__internalDecl");
        statementTemplateVector.markLocalReplacement((ASTNode)CompatibilityTransformer.statementTemplateVector.getSourceRoot().nodeIndex.getStream(BuiltinNumericTypeSpecifier.class).filter(builtinNumericTypeSpecifier -> builtinNumericTypeSpecifier.type == Type.F32VEC3).findAny().get());
        layoutedOutDeclarationTemplate.markLocalReplacement(CompatibilityTransformer.layoutedOutDeclarationTemplate.getSourceRoot().nodeIndex.getOne(TypeQualifier.class));
        layoutedOutDeclarationTemplate.markLocalReplacement("__type", TypeSpecifier.class);
        layoutedOutDeclarationTemplate.markLocalReplacement("__name", DeclarationMember.class);
    }

    public static void transformGrouped(ASTParser aSTParser, Map<PatchShaderType, TranslationUnit> map, Parameters parameters) {
        ShaderType shaderType = null;
        for (ShaderType shaderType2 : pipeline) {
            Object object;
            TranslationUnit translationUnit;
            Object object22;
            PatchShaderType[] patchShaderTypeArray = PatchShaderType.fromGlShaderType(shaderType2);
            boolean bl = false;
            for (Object object22 : patchShaderTypeArray) {
                if (map.get(object22) == null) continue;
                bl = true;
            }
            if (!bl) continue;
            if (shaderType == null) {
                shaderType = shaderType2;
                continue;
            }
            PatchShaderType patchShaderType = PatchShaderType.fromGlShaderType(shaderType)[0];
            TranslationUnit translationUnit2 = map.get((Object)patchShaderType);
            Root root = translationUnit2.getRoot();
            if (root.getPrefixIdentifierIndex().prefixQueryFlat(tagPrefix).findAny().isPresent()) {
                LOGGER.warn("The prefix tag iris_template_ is used in the shader, bailing compatibility transformation.");
                return;
            }
            object22 = new HashMap();
            for (DeclarationExternalDeclaration declarationExternalDeclaration : root.nodeIndex.get(DeclarationExternalDeclaration.class)) {
                if (!outDeclarationMatcher.matchesExtract((ASTNode)declarationExternalDeclaration)) continue;
                BuiltinNumericTypeSpecifier builtinNumericTypeSpecifier = (BuiltinNumericTypeSpecifier)outDeclarationMatcher.getNodeMatch("type", BuiltinNumericTypeSpecifier.class);
                Object object3 = ((TypeAndInitDeclaration)((DeclarationMember)outDeclarationMatcher.getNodeMatch("name*", DeclarationMember.class)).getAncestor(TypeAndInitDeclaration.class)).getMembers().iterator();
                while (object3.hasNext()) {
                    translationUnit = (DeclarationMember)object3.next();
                    object = translationUnit.getName().getName();
                    if (((String)object).startsWith("gl_")) continue;
                    object22.put(object, builtinNumericTypeSpecifier);
                }
            }
            for (Object object3 : patchShaderTypeArray) {
                translationUnit = map.get(object3);
                if (translationUnit == null) continue;
                object = translationUnit.getRoot();
                for (ExternalDeclaration externalDeclaration : ((Root)object).nodeIndex.get(DeclarationExternalDeclaration.class)) {
                    if (!inDeclarationMatcher.matchesExtract((ASTNode)externalDeclaration)) continue;
                    BuiltinNumericTypeSpecifier builtinNumericTypeSpecifier = (BuiltinNumericTypeSpecifier)inDeclarationMatcher.getNodeMatch("type", BuiltinNumericTypeSpecifier.class);
                    for (DeclarationMember declarationMember : ((TypeAndInitDeclaration)((DeclarationMember)inDeclarationMatcher.getNodeMatch("name*", DeclarationMember.class)).getAncestor(TypeAndInitDeclaration.class)).getMembers()) {
                        Type type;
                        BuiltinNumericTypeSpecifier builtinNumericTypeSpecifier2;
                        String string = declarationMember.getName().getName();
                        if (string.startsWith("gl_")) continue;
                        if (!object22.containsKey(string)) {
                            if (((Root)object).identifierIndex.getAncestors(string, ReferenceExpression.class).findAny().isEmpty()) continue;
                            if (builtinNumericTypeSpecifier == null) {
                                LOGGER.warn("The in declaration '" + string + "' in the " + parameters.name + " " + object3.glShaderType.name() + " shader that has a missing corresponding out declaration in the previous stage " + shaderType.name() + " has a non-numeric type and could not be compatibility-patched. See debugging.md for more information.");
                                continue;
                            }
                            builtinNumericTypeSpecifier2 = builtinNumericTypeSpecifier.type;
                            type = (TypeQualifier)inDeclarationMatcher.getNodeMatch("qualifier").cloneInto(root);
                            CompatibilityTransformer.makeQualifierOut((TypeQualifier)type);
                            translationUnit2.injectNode(ASTInjectionPoint.BEFORE_DECLARATIONS, (ExternalDeclaration)declarationTemplate.getInstanceFor(root, new ASTNode[]{type, builtinNumericTypeSpecifier.cloneInto(root), new Identifier(string)}));
                            translationUnit2.prependMainFunctionBody(CompatibilityTransformer.getInitializer(root, string, (Type)builtinNumericTypeSpecifier2));
                            object22.put(string, null);
                            LOGGER.warn("The in declaration '" + string + "' in the " + parameters.name + " " + object3.glShaderType.name() + " shader is missing a corresponding out declaration in the previous stage " + shaderType.name() + " and has been compatibility-patched. See debugging.md for more information.");
                            continue;
                        }
                        builtinNumericTypeSpecifier2 = (BuiltinNumericTypeSpecifier)object22.get(string);
                        if (builtinNumericTypeSpecifier2 == null) continue;
                        type = builtinNumericTypeSpecifier.type;
                        Type type2 = builtinNumericTypeSpecifier2.type;
                        if (builtinNumericTypeSpecifier2.getArraySpecifier() != null) {
                            LOGGER.warn("The out declaration '" + string + "' in the " + parameters.name + " " + patchShaderType.glShaderType.name() + " shader that has a missing corresponding in declaration in the next stage " + shaderType2.name() + " has an array type and could not be compatibility-patched. See debugging.md for more information.");
                            continue;
                        }
                        if (type == type2) {
                            if (root.identifierIndex.get(string).size() > 1) continue;
                            translationUnit2.prependMainFunctionBody(CompatibilityTransformer.getInitializer(root, string, type));
                            object22.put(string, null);
                            LOGGER.warn("The in declaration '" + string + "' in the " + parameters.name + " " + object3.glShaderType.name() + " shader that is never assigned to in the previous stage " + shaderType.name() + " has been compatibility-patched by adding an initialization for it. See debugging.md for more information.");
                            continue;
                        }
                        if (type2.getDimension() != type.getDimension()) {
                            LOGGER.warn("The in declaration '" + string + "' in the " + parameters.name + " " + object3.glShaderType.name() + " shader has a mismatching dimensionality (scalar/vector/matrix) with the out declaration in the previous stage " + shaderType.name() + " and could not be compatibility-patched. See debugging.md for more information.");
                            continue;
                        }
                        boolean bl2 = type2.isVector();
                        String string2 = tagPrefix + string;
                        root.identifierIndex.rename(string, string2);
                        TypeAndInitDeclaration typeAndInitDeclaration = (TypeAndInitDeclaration)builtinNumericTypeSpecifier2.getAncestor(TypeAndInitDeclaration.class);
                        if (typeAndInitDeclaration == null) continue;
                        ChildNodeList childNodeList = typeAndInitDeclaration.getMembers();
                        DeclarationMember declarationMember2 = null;
                        for (DeclarationMember declarationMember3 : childNodeList) {
                            if (!declarationMember3.getName().getName().equals(string2)) continue;
                            declarationMember2 = declarationMember3;
                        }
                        if (declarationMember2 == null) {
                            throw new TransformationException("The targeted out declaration member is missing!");
                        }
                        declarationMember2.getName().replaceByAndDelete((ASTNode)new Identifier(string));
                        if (childNodeList.size() > 1) {
                            declarationMember2.detach();
                            builtinNumericTypeSpecifier2 = builtinNumericTypeSpecifier2.cloneInto(root);
                            DeclarationExternalDeclaration declarationExternalDeclaration = (DeclarationExternalDeclaration)declarationTemplate.getInstanceFor(root, new ASTNode[]{CompatibilityTransformer.makeQualifierOut(typeAndInitDeclaration.getType().getTypeQualifier().cloneInto(root)), builtinNumericTypeSpecifier2, new Identifier(string)});
                            ((TypeAndInitDeclaration)declarationExternalDeclaration.getDeclaration()).getMembers().set(0, (Object)declarationMember2);
                            translationUnit2.injectNode(ASTInjectionPoint.BEFORE_DECLARATIONS, (ExternalDeclaration)declarationExternalDeclaration);
                        }
                        translationUnit2.injectNode(ASTInjectionPoint.BEFORE_DECLARATIONS, (ExternalDeclaration)variableTemplate.getInstanceFor(root, new ASTNode[]{builtinNumericTypeSpecifier2.cloneInto(root), new Identifier(string2)}));
                        translationUnit2.appendMainFunctionBody((Statement)(bl2 && type2.getDimensions()[0] < type.getDimensions()[0] ? statementTemplateVector : statementTemplate).getInstanceFor(root, new ASTNode[]{new Identifier(string), new Identifier(string2), builtinNumericTypeSpecifier.cloneInto(root)}));
                        builtinNumericTypeSpecifier2.replaceByAndDelete((ASTNode)builtinNumericTypeSpecifier.cloneInto(root));
                        object22.put(string, null);
                        LOGGER.warn("The out declaration '" + string + "' in the " + parameters.name + " " + shaderType.name() + " shader has a different type " + type2.getMostCompactName() + " than the corresponding in declaration of type " + type.getMostCompactName() + " in the following stage " + object3.glShaderType.name() + " and has been compatibility-patched. See debugging.md for more information.");
                    }
                }
            }
            shaderType = shaderType2;
        }
    }

    public static void transformEach(ASTParser aSTParser, TranslationUnit translationUnit, Root root, Parameters parameters) {
        boolean bl;
        Object object;
        String string;
        FunctionParameter functionParameter2;
        Object object2;
        Object object322;
        if (parameters.type == PatchShaderType.VERTEX && root.replaceExpressionMatches(aSTParser, sildursWaterFract, "fract(worldpos.y + 0.01)")) {
            Iris.logger.warn("Patched fract(worldpos.y + 0.001) to fract(worldpos.y + 0.01) to fix waving water disconnecting from other water blocks; See https://github.com/IrisShaders/Iris/issues/509");
        }
        HashMap hashMap = new HashMap();
        HashSet<String> hashSet = new HashSet<String>();
        LinkedList<Object> linkedList = new LinkedList<Object>();
        for (Object object322 : root.nodeIndex.get(FunctionDefinition.class)) {
            object2 = object322.getFunctionPrototype();
            String string2 = object2.getName().getName();
            if (!string2.equals("main") && root.identifierIndex.getStream(string2).count() <= 1L) {
                linkedList.add(object322);
                continue;
            }
            if (object2.getChildren().isEmpty()) continue;
            HashSet<String> object4 = new HashSet<String>(object2.getChildren().size());
            for (FunctionParameter functionParameter2 : object2.getChildren()) {
                if (CompatibilityTransformer.getConstQualifier(functionParameter2.getType().getTypeQualifier()) == null) continue;
                string = functionParameter2.getName().getName();
                object4.add(string);
                hashSet.add(string);
            }
            if (object4.isEmpty()) continue;
            hashMap.put(object322, object4);
        }
        if (!Iris.getIrisConfig().areDebugOptionsEnabled()) {
            for (Object object322 : linkedList) {
                object322.detachAndDelete();
            }
        }
        boolean bl2 = false;
        object322 = new ArrayDeque(hashSet);
        while (!object322.isEmpty()) {
            object2 = (String)object322.poll();
            hashSet.remove(object2);
            for (Identifier identifier2 : root.identifierIndex.get((String)object2)) {
                TypeQualifier typeQualifier;
                StorageQualifier storageQualifier;
                Object object3;
                object = (ReferenceExpression)identifier2.getAncestor(ReferenceExpression.class);
                if (object == null || (functionParameter2 = (TypeAndInitDeclaration)object.getAncestor(TypeAndInitDeclaration.class)) == null || (string = (FunctionDefinition)functionParameter2.getAncestor(FunctionDefinition.class)) == null || (object3 = (Set)hashMap.get(string)) == null || !object3.contains(object2) || (storageQualifier = CompatibilityTransformer.getConstQualifier(typeQualifier = functionParameter2.getType().getTypeQualifier())) == null) continue;
                storageQualifier.detachAndDelete();
                if (typeQualifier.getChildren().isEmpty()) {
                    typeQualifier.detachAndDelete();
                }
                bl2 = true;
                for (DeclarationMember declarationMember : functionParameter2.getMembers()) {
                    String string2 = declarationMember.getName().getName();
                    if (object3.contains(string2)) {
                        throw new TransformationException("Illegal redefinition of const parameter " + (String)object2);
                    }
                    object3.add(string2);
                    if (hashSet.contains(string2)) continue;
                    object322.add(string2);
                    hashSet.add(string2);
                }
            }
        }
        if (bl2) {
            LOGGER.warn("Removed the const keyword from declarations that use const parameters. See debugging.md for more information.");
        }
        if (bl = root.process(root.nodeIndex.getStream(EmptyDeclaration.class), ASTNode::detachAndDelete)) {
            LOGGER.warn("Removed empty external declarations (\";\").");
        }
        for (String string3 : reservedWords) {
            object = "iris_renamed_" + string3;
            if (!root.process(root.identifierIndex.getStream(string3).filter(identifier -> !(identifier.getParent() instanceof FunctionCallExpression) && !(identifier.getParent() instanceof FunctionPrototype)), arg_0 -> CompatibilityTransformer.lambda$transformEach$3((String)object, arg_0))) continue;
            LOGGER.warn("Renamed reserved word \"" + string3 + "\" to \"" + (String)object + "\".");
        }
        for (StructMember structMember : root.nodeIndex.get(StructMember.class)) {
            object = structMember.getType().getTypeSpecifier();
            functionParameter2 = object.getArraySpecifier();
            if (functionParameter2 == null || !functionParameter2.getChildren().isNullEmpty()) continue;
            functionParameter2.detach();
            boolean bl3 = false;
            for (TypeQualifier typeQualifier : structMember.getDeclarators()) {
                if (typeQualifier.getArraySpecifier() != null) {
                    throw new TransformationException("Member already has an array specifier");
                }
                typeQualifier.setArraySpecifier((ArraySpecifier)(bl3 ? functionParameter2.cloneInto(root) : functionParameter2));
                bl3 = true;
            }
            LOGGER.warn("Moved unsized array specifier (of the form []) from the type to each of the the declaration member(s) " + structMember.getDeclarators().stream().map(StructDeclarator::getName).map(Identifier::getName).collect(Collectors.joining(", ")) + ". See debugging.md for more information.");
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

    private static Statement getInitializer(Root root, String string, Type type) {
        return (Statement)initTemplate.getInstanceFor(root, new ASTNode[]{new Identifier(string), type.isScalar() ? LiteralExpression.getDefaultValue((Type)type) : root.indexNodes(() -> new FunctionCallExpression(new Identifier(type.getMostCompactName()), Stream.of(LiteralExpression.getDefaultValue((Type)type))))});
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

    public static void transformFragmentCore(ASTParser aSTParser, TranslationUnit translationUnit, Root root, Parameters parameters) {
        BuiltinNumericTypeSpecifier builtinNumericTypeSpecifier;
        TypeQualifier typeQualifier;
        ArrayList<CompatibilityTransformer$NewDeclarationData> arrayList = new ArrayList<CompatibilityTransformer$NewDeclarationData>();
        ArrayList<Object> arrayList2 = new ArrayList<Object>();
        for (Object object : root.nodeIndex.get(DeclarationExternalDeclaration.class)) {
            if (!nonLayoutOutDeclarationMatcher.matchesExtract((ASTNode)object)) continue;
            ChildNodeList object2 = ((TypeAndInitDeclaration)((DeclarationMember)nonLayoutOutDeclarationMatcher.getNodeMatch("name*", DeclarationMember.class)).getAncestor(TypeAndInitDeclaration.class)).getMembers();
            typeQualifier = (TypeQualifier)nonLayoutOutDeclarationMatcher.getNodeMatch("qualifier", TypeQualifier.class);
            builtinNumericTypeSpecifier = (BuiltinNumericTypeSpecifier)nonLayoutOutDeclarationMatcher.getNodeMatch("type", BuiltinNumericTypeSpecifier.class);
            int externalDeclaration = 0;
            for (DeclarationMember declarationMember : object2) {
                int n;
                String string;
                String string2 = declarationMember.getName().getName();
                if (!string2.startsWith(attachTargetPrefix) || (string = string2.substring(attachTargetPrefix.length())).isEmpty()) continue;
                try {
                    n = Integer.parseInt(string);
                }
                catch (NumberFormatException numberFormatException) {
                    continue;
                }
                if (n < 0 || 7 < n) continue;
                arrayList.add(new CompatibilityTransformer$NewDeclarationData(typeQualifier, (TypeSpecifier)builtinNumericTypeSpecifier, declarationMember, n));
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
        for (CompatibilityTransformer$NewDeclarationData compatibilityTransformer$NewDeclarationData : arrayList) {
            typeQualifier = compatibilityTransformer$NewDeclarationData.member;
            typeQualifier.detach();
            builtinNumericTypeSpecifier = compatibilityTransformer$NewDeclarationData.qualifier.cloneInto(root);
            builtinNumericTypeSpecifier.getChildren().add((Object)new LayoutQualifier(Stream.of(new NamedLayoutQualifierPart(new Identifier("location"), (Expression)new LiteralExpression(Type.INT32, (long)compatibilityTransformer$NewDeclarationData.number)))));
            ExternalDeclaration externalDeclaration = (ExternalDeclaration)layoutedOutDeclarationTemplate.getInstanceFor(root, new ASTNode[]{builtinNumericTypeSpecifier, compatibilityTransformer$NewDeclarationData.type.cloneInto(root), typeQualifier});
            arrayList3.add(externalDeclaration);
        }
        translationUnit.injectNodes(ASTInjectionPoint.BEFORE_DECLARATIONS, (Collection)arrayList3);
    }

    private static /* synthetic */ void lambda$transformEach$3(String string, Identifier identifier) {
        identifier.setName(string);
    }
}

