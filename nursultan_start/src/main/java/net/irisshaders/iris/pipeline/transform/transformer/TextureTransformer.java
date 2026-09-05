/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.github.douira.glsl_transformer.ast.node.Identifier
 *  io.github.douira.glsl_transformer.ast.node.TranslationUnit
 *  io.github.douira.glsl_transformer.ast.node.declaration.TypeAndInitDeclaration
 *  io.github.douira.glsl_transformer.ast.node.external_declaration.DeclarationExternalDeclaration
 *  io.github.douira.glsl_transformer.ast.node.type.specifier.BuiltinFixedTypeSpecifier
 *  io.github.douira.glsl_transformer.ast.node.type.specifier.BuiltinFixedTypeSpecifier$BuiltinType
 *  io.github.douira.glsl_transformer.ast.node.type.specifier.TypeSpecifier
 *  io.github.douira.glsl_transformer.ast.query.Root
 *  io.github.douira.glsl_transformer.ast.transform.ASTParser
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  java.lang.MatchException
 *  net.irisshaders.iris.gl.texture.TextureType
 *  net.irisshaders.iris.helpers.Tri
 *  net.irisshaders.iris.shaderpack.texture.TextureStage
 */
package net.irisshaders.iris.pipeline.transform.transformer;

import io.github.douira.glsl_transformer.ast.node.Identifier;
import io.github.douira.glsl_transformer.ast.node.TranslationUnit;
import io.github.douira.glsl_transformer.ast.node.declaration.TypeAndInitDeclaration;
import io.github.douira.glsl_transformer.ast.node.external_declaration.DeclarationExternalDeclaration;
import io.github.douira.glsl_transformer.ast.node.type.specifier.BuiltinFixedTypeSpecifier;
import io.github.douira.glsl_transformer.ast.node.type.specifier.TypeSpecifier;
import io.github.douira.glsl_transformer.ast.query.Root;
import io.github.douira.glsl_transformer.ast.transform.ASTParser;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import net.irisshaders.iris.gl.texture.TextureType;
import net.irisshaders.iris.helpers.Tri;
import net.irisshaders.iris.shaderpack.texture.TextureStage;

public class TextureTransformer {
    public static void transform(ASTParser aSTParser, TranslationUnit translationUnit, Root root, TextureStage textureStage, Object2ObjectMap<Tri<String, TextureType, TextureStage>, String> object2ObjectMap) {
        object2ObjectMap.forEach((tri, string) -> {
            if (tri.third() == textureStage) {
                String string2 = (String)tri.first();
                for (Identifier identifier : root.identifierIndex.get(string2)) {
                    TypeSpecifier typeSpecifier;
                    DeclarationExternalDeclaration declarationExternalDeclaration;
                    TypeAndInitDeclaration typeAndInitDeclaration = (TypeAndInitDeclaration)identifier.getAncestor(2, 0, TypeAndInitDeclaration.class::isInstance);
                    if (typeAndInitDeclaration == null || (declarationExternalDeclaration = (DeclarationExternalDeclaration)typeAndInitDeclaration.getAncestor(1, 0, DeclarationExternalDeclaration.class::isInstance)) == null || !((typeSpecifier = typeAndInitDeclaration.getType().getTypeSpecifier()) instanceof BuiltinFixedTypeSpecifier)) continue;
                    BuiltinFixedTypeSpecifier builtinFixedTypeSpecifier = (BuiltinFixedTypeSpecifier)typeSpecifier;
                    if (!TextureTransformer.isTypeValid((TextureType)tri.second(), builtinFixedTypeSpecifier.type)) continue;
                    root.rename((String)tri.first(), string);
                    break;
                }
            }
        });
    }

    private static boolean isTypeValid(TextureType textureType, BuiltinFixedTypeSpecifier.BuiltinType builtinType) {
        return switch (textureType) {
            default -> throw new MatchException(null, null);
            case TextureType.TEXTURE_1D -> {
                if (builtinType == BuiltinFixedTypeSpecifier.BuiltinType.SAMPLER1D || builtinType == BuiltinFixedTypeSpecifier.BuiltinType.ISAMPLER1D || builtinType == BuiltinFixedTypeSpecifier.BuiltinType.USAMPLER1D) {
                    yield true;
                }
                yield false;
            }
            case TextureType.TEXTURE_RECTANGLE -> {
                if (builtinType == BuiltinFixedTypeSpecifier.BuiltinType.SAMPLER2DRECT || builtinType == BuiltinFixedTypeSpecifier.BuiltinType.ISAMPLER2DRECT || builtinType == BuiltinFixedTypeSpecifier.BuiltinType.USAMPLER2DRECT) {
                    yield true;
                }
                yield false;
            }
            case TextureType.TEXTURE_2D -> {
                if (builtinType == BuiltinFixedTypeSpecifier.BuiltinType.SAMPLER2D || builtinType == BuiltinFixedTypeSpecifier.BuiltinType.ISAMPLER2D || builtinType == BuiltinFixedTypeSpecifier.BuiltinType.USAMPLER2D) {
                    yield true;
                }
                yield false;
            }
            case TextureType.TEXTURE_3D -> builtinType == BuiltinFixedTypeSpecifier.BuiltinType.SAMPLER3D || builtinType == BuiltinFixedTypeSpecifier.BuiltinType.ISAMPLER3D || builtinType == BuiltinFixedTypeSpecifier.BuiltinType.USAMPLER3D;
        };
    }
}

