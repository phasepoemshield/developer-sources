/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  kroppeb.stareval.element.ExpressionElement
 *  kroppeb.stareval.function.Type
 */
package net.irisshaders.iris.uniforms.custom;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import kroppeb.stareval.element.ExpressionElement;
import kroppeb.stareval.function.Type;

final class CustomUniforms$Builder$Variable
extends Record {
    final Type type;
    final String name;
    final ExpressionElement expression;
    final boolean uniform;

    public ExpressionElement expression() {
        return this.expression;
    }

    CustomUniforms$Builder$Variable(Type type, String string, ExpressionElement expressionElement, boolean bl) {
        this.type = type;
        this.name = string;
        this.expression = expressionElement;
        this.uniform = bl;
    }

    public String name() {
        return this.name;
    }

    public Type type() {
        return this.type;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{CustomUniforms$Builder$Variable.class, "type;name;expression;uniform", "type", "name", "expression", "uniform"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{CustomUniforms$Builder$Variable.class, "type;name;expression;uniform", "type", "name", "expression", "uniform"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{CustomUniforms$Builder$Variable.class, "type;name;expression;uniform", "type", "name", "expression", "uniform"}, this);
    }

    public boolean uniform() {
        return this.uniform;
    }
}

