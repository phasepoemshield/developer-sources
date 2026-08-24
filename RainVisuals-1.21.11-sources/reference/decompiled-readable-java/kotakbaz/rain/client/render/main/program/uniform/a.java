/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.function.TriFunction
 */
package kotakbaz.rain.client.render.main.program.uniform;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import kotakbaz.rain.client.render.main.program.GlProgram;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.SamplerUniform;
import org.apache.commons.lang3.function.TriFunction;
import oxxxde.\u0627\u063a;
import oxxxde.\u062f\u0637;
import oxxxde.\u062f\u0642;
import oxxxde.\u0630\u0621;
import oxxxde.\u0631\u0647;
import oxxxde.\u0635\u0622;
import oxxxde.\u0635\u0625;
import oxxxde.\u0635\u064d;
import oxxxde.\u0636\u0626;
import oxxxde.\u0636\u0637;
import oxxxde.\u0636\u0645;
import oxxxde.\u0637\u064a;
import oxxxde.\u0637\u064e;

public final class a<T extends \u0637\u064a>
extends Record {
    public static final a<\u0636\u0645> INT_ARRAY;
    public static final a<\u0637\u064e> IVEC4;
    public static final a<SamplerUniform> SAMPLER;
    public static final a<\u0631\u0647> VEC4;
    public static final a<\u062f\u0637> VEC2;
    private final TriFunction<String, Integer, GlProgram, \u0637\u064a> uniformCreator;
    public static final a<\u0627\u063a> VEC3;
    public static final a<\u0636\u0637> INT;
    public static final a<\u0635\u0622> FLOAT_ARRAY;
    public static final a<\u0636\u0626> MATRIX;
    private final Class<T> clazz;
    public static final a<\u062f\u0642> BUFFER;
    public static final a<\u0635\u064d> IVEC3;
    public static final a<\u0630\u0621> FLOAT;
    public static final a<\u0635\u0625> IVEC2;

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "clazz;uniformCreator", "clazz", "uniformCreator"}, this);
    }

    public TriFunction<String, Integer, GlProgram, \u0637\u064a> uniformCreator() {
        return this.uniformCreator;
    }

    @Override
    public final boolean equals(Object o) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "clazz;uniformCreator", "clazz", "uniformCreator"}, this, o);
    }

    public a(Class<T> clazz, TriFunction<String, Integer, GlProgram, \u0637\u064a> uniformCreator) {
        this.clazz = clazz;
        this.uniformCreator = uniformCreator;
    }

    static {
        INT = new a<\u0636\u0637>(\u0636\u0637.class, (TriFunction<String, Integer, GlProgram, \u0637\u064a>)((TriFunction)\u0636\u0637::new));
        FLOAT = new a<\u0630\u0621>(\u0630\u0621.class, (TriFunction<String, Integer, GlProgram, \u0637\u064a>)((TriFunction)\u0630\u0621::new));
        INT_ARRAY = new a<\u0636\u0645>(\u0636\u0645.class, (TriFunction<String, Integer, GlProgram, \u0637\u064a>)((TriFunction)\u0636\u0645::new));
        FLOAT_ARRAY = new a<\u0635\u0622>(\u0635\u0622.class, (TriFunction<String, Integer, GlProgram, \u0637\u064a>)((TriFunction)\u0635\u0622::new));
        VEC2 = new a<\u062f\u0637>(\u062f\u0637.class, (TriFunction<String, Integer, GlProgram, \u0637\u064a>)((TriFunction)\u062f\u0637::new));
        VEC3 = new a<\u0627\u063a>(\u0627\u063a.class, (TriFunction<String, Integer, GlProgram, \u0637\u064a>)((TriFunction)\u0627\u063a::new));
        VEC4 = new a<\u0631\u0647>(\u0631\u0647.class, (TriFunction<String, Integer, GlProgram, \u0637\u064a>)((TriFunction)\u0631\u0647::new));
        IVEC2 = new a<\u0635\u0625>(\u0635\u0625.class, (TriFunction<String, Integer, GlProgram, \u0637\u064a>)((TriFunction)\u0635\u0625::new));
        IVEC3 = new a<\u0635\u064d>(\u0635\u064d.class, (TriFunction<String, Integer, GlProgram, \u0637\u064a>)((TriFunction)\u0635\u064d::new));
        IVEC4 = new a<\u0637\u064e>(\u0637\u064e.class, (TriFunction<String, Integer, GlProgram, \u0637\u064a>)((TriFunction)\u0637\u064e::new));
        MATRIX = new a<\u0636\u0626>(\u0636\u0626.class, (TriFunction<String, Integer, GlProgram, \u0637\u064a>)((TriFunction)\u0636\u0626::new));
        BUFFER = new a<\u062f\u0642>(\u062f\u0642.class, (TriFunction<String, Integer, GlProgram, \u0637\u064a>)((TriFunction)\u062f\u0642::new));
        SAMPLER = new a<SamplerUniform>(SamplerUniform.class, (TriFunction<String, Integer, GlProgram, \u0637\u064a>)((TriFunction)SamplerUniform::new));
    }

    public Class<T> clazz() {
        return this.clazz;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "clazz;uniformCreator", "clazz", "uniformCreator"}, this);
    }
}

