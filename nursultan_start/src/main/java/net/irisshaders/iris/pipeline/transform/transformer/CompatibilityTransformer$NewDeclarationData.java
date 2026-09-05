/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.github.douira.glsl_transformer.ast.node.declaration.DeclarationMember
 *  io.github.douira.glsl_transformer.ast.node.type.qualifier.TypeQualifier
 *  io.github.douira.glsl_transformer.ast.node.type.specifier.TypeSpecifier
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package net.irisshaders.iris.pipeline.transform.transformer;

import io.github.douira.glsl_transformer.ast.node.declaration.DeclarationMember;
import io.github.douira.glsl_transformer.ast.node.type.qualifier.TypeQualifier;
import io.github.douira.glsl_transformer.ast.node.type.specifier.TypeSpecifier;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class CompatibilityTransformer$NewDeclarationData
extends Record {
    final TypeQualifier qualifier;
    final TypeSpecifier type;
    final DeclarationMember member;
    final int number;

    public DeclarationMember member() {
        return this.member;
    }

    CompatibilityTransformer$NewDeclarationData(TypeQualifier typeQualifier, TypeSpecifier typeSpecifier, DeclarationMember declarationMember, int n) {
        this.qualifier = typeQualifier;
        this.type = typeSpecifier;
        this.member = declarationMember;
        this.number = n;
    }

    public TypeSpecifier type() {
        return this.type;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{CompatibilityTransformer$NewDeclarationData.class, "qualifier;type;member;number", "qualifier", "type", "member", "number"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{CompatibilityTransformer$NewDeclarationData.class, "qualifier;type;member;number", "qualifier", "type", "member", "number"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{CompatibilityTransformer$NewDeclarationData.class, "qualifier;type;member;number", "qualifier", "type", "member", "number"}, this);
    }

    public int number() {
        return this.number;
    }

    public TypeQualifier qualifier() {
        return this.qualifier;
    }
}

