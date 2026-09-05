/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.github.douira.glsl_transformer.ast.node.TranslationUnit
 *  io.github.douira.glsl_transformer.ast.node.Version
 *  io.github.douira.glsl_transformer.ast.query.Root
 *  io.github.douira.glsl_transformer.ast.query.RootSupplier
 *  io.github.douira.glsl_transformer.ast.transform.ASTParser$ParsingCacheStrategy
 *  io.github.douira.glsl_transformer.ast.transform.EnumASTTransformer
 */
package net.irisshaders.iris.pipeline.transform;

import io.github.douira.glsl_transformer.ast.node.TranslationUnit;
import io.github.douira.glsl_transformer.ast.node.Version;
import io.github.douira.glsl_transformer.ast.query.Root;
import io.github.douira.glsl_transformer.ast.query.RootSupplier;
import io.github.douira.glsl_transformer.ast.transform.ASTParser;
import io.github.douira.glsl_transformer.ast.transform.EnumASTTransformer;
import java.util.regex.Matcher;
import net.irisshaders.iris.pipeline.transform.PatchShaderType;
import net.irisshaders.iris.pipeline.transform.TransformPatcher;
import net.irisshaders.iris.pipeline.transform.parameter.Parameters;

class TransformPatcher$2
extends EnumASTTransformer<Parameters, PatchShaderType> {
    TransformPatcher$2(Class clazz) {
        super(clazz);
        this.setRootSupplier(RootSupplier.PREFIX_UNORDERED_ED_EXACT);
        this.setParsingCacheStrategy(ASTParser.ParsingCacheStrategy.TWO_TIER);
    }

    public TranslationUnit parseTranslationUnit(Root root, String string) {
        Matcher matcher = TransformPatcher.versionPattern.matcher(string);
        if (!matcher.find()) {
            throw new IllegalArgumentException("No #version directive found in source code! See debugging.md for more information.");
        }
        TransformPatcher.transformer.getLexer().version = Version.fromNumber((int)Integer.parseInt(matcher.group(1)));
        return super.parseTranslationUnit(root, string);
    }
}

