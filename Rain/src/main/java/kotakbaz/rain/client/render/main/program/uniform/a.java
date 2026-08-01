/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.render.main.program.uniform;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import kotakbaz.rain.client.render.main.program.a_0;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.B;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.C;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.E;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.F;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.b_0;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.c_0;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.d_0;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.e_0;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.f_0;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.A;
import org.apache.commons.lang3.function.TriFunction;

public final class a<T extends kotakbaz.rain.client.render.main.program.uniform.a_0>
extends Record {
    private final Class<T> a;
    private final TriFunction<String, Integer, a_0, kotakbaz.rain.client.render.main.program.uniform.a_0> A;
    public static final a<E> b = new a<E>(E.class, (TriFunction<String, Integer, a_0, kotakbaz.rain.client.render.main.program.uniform.a_0>)((TriFunction)E::new));
    public static final a<kotakbaz.rain.client.render.main.program.uniform.uniforms.a_0> B = new a<kotakbaz.rain.client.render.main.program.uniform.uniforms.a_0>(kotakbaz.rain.client.render.main.program.uniform.uniforms.a_0.class, (TriFunction<String, Integer, a_0, kotakbaz.rain.client.render.main.program.uniform.a_0>)((TriFunction)kotakbaz.rain.client.render.main.program.uniform.uniforms.a_0::new));
    public static final a<c_0> c = new a<c_0>(c_0.class, (TriFunction<String, Integer, a_0, kotakbaz.rain.client.render.main.program.uniform.a_0>)((TriFunction)c_0::new));
    public static final a<b_0> C = new a<b_0>(b_0.class, (TriFunction<String, Integer, a_0, kotakbaz.rain.client.render.main.program.uniform.a_0>)((TriFunction)b_0::new));
    public static final a<B> d = new a<B>(B.class, (TriFunction<String, Integer, a_0, kotakbaz.rain.client.render.main.program.uniform.a_0>)((TriFunction)B::new));
    public static final a<e_0> D = new a<e_0>(e_0.class, (TriFunction<String, Integer, a_0, kotakbaz.rain.client.render.main.program.uniform.a_0>)((TriFunction)e_0::new));
    public static final a<F> e = new a<F>(F.class, (TriFunction<String, Integer, a_0, kotakbaz.rain.client.render.main.program.uniform.a_0>)((TriFunction)F::new));
    public static final a<d_0> E = new a<d_0>(d_0.class, (TriFunction<String, Integer, a_0, kotakbaz.rain.client.render.main.program.uniform.a_0>)((TriFunction)d_0::new));
    public static final a<f_0> f = new a<f_0>(f_0.class, (TriFunction<String, Integer, a_0, kotakbaz.rain.client.render.main.program.uniform.a_0>)((TriFunction)f_0::new));
    public static final a<C> F = new a<C>(C.class, (TriFunction<String, Integer, a_0, kotakbaz.rain.client.render.main.program.uniform.a_0>)((TriFunction)C::new));
    public static final a<kotakbaz.rain.client.render.main.program.uniform.uniforms.A> g = new a<kotakbaz.rain.client.render.main.program.uniform.uniforms.A>(kotakbaz.rain.client.render.main.program.uniform.uniforms.A.class, (TriFunction<String, Integer, a_0, kotakbaz.rain.client.render.main.program.uniform.a_0>)((TriFunction)kotakbaz.rain.client.render.main.program.uniform.uniforms.A::new));
    public static final a<kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a> G = new a<kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a>(kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a.class, (TriFunction<String, Integer, a_0, kotakbaz.rain.client.render.main.program.uniform.a_0>)((TriFunction)kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a::new));
    public static final a<A> h = new a<A>(A.class, (TriFunction<String, Integer, a_0, kotakbaz.rain.client.render.main.program.uniform.a_0>)((TriFunction)A::new));

    public a(Class<T> clazz, TriFunction<String, Integer, a_0, kotakbaz.rain.client.render.main.program.uniform.a_0> uniformCreator) {
        this.a = clazz;
        this.A = uniformCreator;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{a.class, "clazz;uniformCreator", "a", "A"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a.class, "clazz;uniformCreator", "a", "A"}, this);
    }

    @Override
    public final boolean equals(Object o2) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a.class, "clazz;uniformCreator", "a", "A"}, this, o2);
    }

    public Class<T> clazz() {
        return this.a;
    }

    public TriFunction<String, Integer, a_0, kotakbaz.rain.client.render.main.program.uniform.a_0> uniformCreator() {
        return this.A;
    }
}

