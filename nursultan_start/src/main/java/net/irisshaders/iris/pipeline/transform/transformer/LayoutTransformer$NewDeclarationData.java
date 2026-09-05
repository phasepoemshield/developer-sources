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

final class LayoutTransformer$NewDeclarationData
extends Record {
    final TypeQualifier qualifier;
    final TypeSpecifier type;
    final DeclarationMember member;
    final int location;
    private final String name;

    public DeclarationMember member() {
        return this.member;
    }

    LayoutTransformer$NewDeclarationData(TypeQualifier typeQualifier, TypeSpecifier typeSpecifier, DeclarationMember declarationMember, int n, String string) {
        this.qualifier = typeQualifier;
        this.type = typeSpecifier;
        this.member = declarationMember;
        this.location = n;
        this.name = string;
    }

    public String name() {
        return this.name;
    }

    public TypeSpecifier type() {
        return this.type;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{LayoutTransformer$NewDeclarationData.class, "qualifier;type;member;location;name", "qualifier", "type", "member", "location", "name"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{LayoutTransformer$NewDeclarationData.class, "qualifier;type;member;location;name", "qualifier", "type", "member", "location", "name"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{LayoutTransformer$NewDeclarationData.class, "qualifier;type;member;location;name", "qualifier", "type", "member", "location", "name"}, this);
    }

    public int location() {
        return this.location;
    }

    public TypeQualifier qualifier() {
        return this.qualifier;
    }
}

