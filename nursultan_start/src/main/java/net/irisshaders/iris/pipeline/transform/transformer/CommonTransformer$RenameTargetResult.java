/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.github.douira.glsl_transformer.ast.node.Identifier
 *  io.github.douira.glsl_transformer.ast.node.declaration.DeclarationMember
 *  io.github.douira.glsl_transformer.ast.node.external_declaration.DeclarationExternalDeclaration
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package net.irisshaders.iris.pipeline.transform.transformer;

import io.github.douira.glsl_transformer.ast.node.Identifier;
import io.github.douira.glsl_transformer.ast.node.declaration.DeclarationMember;
import io.github.douira.glsl_transformer.ast.node.external_declaration.DeclarationExternalDeclaration;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.stream.Stream;

final class CommonTransformer$RenameTargetResult
extends Record {
    final DeclarationExternalDeclaration samplerDeclaration;
    final DeclarationMember samplerDeclarationMember;
    final Stream<Identifier> targets;

    CommonTransformer$RenameTargetResult(DeclarationExternalDeclaration declarationExternalDeclaration, DeclarationMember declarationMember, Stream<Identifier> stream) {
        this.samplerDeclaration = declarationExternalDeclaration;
        this.samplerDeclarationMember = declarationMember;
        this.targets = stream;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{CommonTransformer$RenameTargetResult.class, "samplerDeclaration;samplerDeclarationMember;targets", "samplerDeclaration", "samplerDeclarationMember", "targets"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{CommonTransformer$RenameTargetResult.class, "samplerDeclaration;samplerDeclarationMember;targets", "samplerDeclaration", "samplerDeclarationMember", "targets"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{CommonTransformer$RenameTargetResult.class, "samplerDeclaration;samplerDeclarationMember;targets", "samplerDeclaration", "samplerDeclarationMember", "targets"}, this);
    }

    public Stream<Identifier> targets() {
        return this.targets;
    }

    public DeclarationExternalDeclaration samplerDeclaration() {
        return this.samplerDeclaration;
    }

    public DeclarationMember samplerDeclarationMember() {
        return this.samplerDeclarationMember;
    }
}

