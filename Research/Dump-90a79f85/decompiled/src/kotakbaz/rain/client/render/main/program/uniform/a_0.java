/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.function.TriFunction
 */
package kotakbaz.rain.client.render.main.program.uniform;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
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

/*
 * Renamed from kotakbaz.rain.client.render.main.program.uniform.a
 */
public final class a_0<T extends kotakbaz.rain.client.render.main.program.uniform.A>
extends Record {
    private final Class<T> a;
    private final TriFunction<String, Integer, kotakbaz.rain.client.render.main.program.A, kotakbaz.rain.client.render.main.program.uniform.A> A;
    public static final a_0<E> b = new a_0<E>(E.class, (TriFunction<String, Integer, kotakbaz.rain.client.render.main.program.A, kotakbaz.rain.client.render.main.program.uniform.A>)((TriFunction)E::new));
    public static final a_0<kotakbaz.rain.client.render.main.program.uniform.uniforms.a_0> B = new a_0<kotakbaz.rain.client.render.main.program.uniform.uniforms.a_0>(kotakbaz.rain.client.render.main.program.uniform.uniforms.a_0.class, (TriFunction<String, Integer, kotakbaz.rain.client.render.main.program.A, kotakbaz.rain.client.render.main.program.uniform.A>)((TriFunction)kotakbaz.rain.client.render.main.program.uniform.uniforms.a_0::new));
    public static final a_0<c_0> c = new a_0<c_0>(c_0.class, (TriFunction<String, Integer, kotakbaz.rain.client.render.main.program.A, kotakbaz.rain.client.render.main.program.uniform.A>)((TriFunction)c_0::new));
    public static final a_0<b_0> C = new a_0<b_0>(b_0.class, (TriFunction<String, Integer, kotakbaz.rain.client.render.main.program.A, kotakbaz.rain.client.render.main.program.uniform.A>)((TriFunction)b_0::new));
    public static final a_0<B> d = new a_0<B>(B.class, (TriFunction<String, Integer, kotakbaz.rain.client.render.main.program.A, kotakbaz.rain.client.render.main.program.uniform.A>)((TriFunction)B::new));
    public static final a_0<e_0> D = new a_0<e_0>(e_0.class, (TriFunction<String, Integer, kotakbaz.rain.client.render.main.program.A, kotakbaz.rain.client.render.main.program.uniform.A>)((TriFunction)e_0::new));
    public static final a_0<F> e = new a_0<F>(F.class, (TriFunction<String, Integer, kotakbaz.rain.client.render.main.program.A, kotakbaz.rain.client.render.main.program.uniform.A>)((TriFunction)F::new));
    public static final a_0<d_0> E = new a_0<d_0>(d_0.class, (TriFunction<String, Integer, kotakbaz.rain.client.render.main.program.A, kotakbaz.rain.client.render.main.program.uniform.A>)((TriFunction)d_0::new));
    public static final a_0<f_0> f = new a_0<f_0>(f_0.class, (TriFunction<String, Integer, kotakbaz.rain.client.render.main.program.A, kotakbaz.rain.client.render.main.program.uniform.A>)((TriFunction)f_0::new));
    public static final a_0<C> F = new a_0<C>(C.class, (TriFunction<String, Integer, kotakbaz.rain.client.render.main.program.A, kotakbaz.rain.client.render.main.program.uniform.A>)((TriFunction)C::new));
    public static final a_0<kotakbaz.rain.client.render.main.program.uniform.uniforms.A> g = new a_0<kotakbaz.rain.client.render.main.program.uniform.uniforms.A>(kotakbaz.rain.client.render.main.program.uniform.uniforms.A.class, (TriFunction<String, Integer, kotakbaz.rain.client.render.main.program.A, kotakbaz.rain.client.render.main.program.uniform.A>)((TriFunction)kotakbaz.rain.client.render.main.program.uniform.uniforms.A::new));
    public static final a_0<kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a_0> G = new a_0<kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a_0>(kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a_0.class, (TriFunction<String, Integer, kotakbaz.rain.client.render.main.program.A, kotakbaz.rain.client.render.main.program.uniform.A>)((TriFunction)kotakbaz.rain.client.render.main.program.uniform.uniforms.buffer.a_0::new));
    public static final a_0<A> h = new a_0<A>(A.class, (TriFunction<String, Integer, kotakbaz.rain.client.render.main.program.A, kotakbaz.rain.client.render.main.program.uniform.A>)((TriFunction)A::new));

    public a_0(Class<T> clazz, TriFunction<String, Integer, kotakbaz.rain.client.render.main.program.A, kotakbaz.rain.client.render.main.program.uniform.A> triFunction) {
        super();
        this.a = clazz;
        this.A = triFunction;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{a_0.class, "clazz;uniformCreator", "a", "A"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{a_0.class, "clazz;uniformCreator", "a", "A"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{a_0.class, "clazz;uniformCreator", "a", "A"}, this, object);
    }

    public Class<T> clazz() {
        return this.a;
    }

    public TriFunction<String, Integer, kotakbaz.rain.client.render.main.program.A, kotakbaz.rain.client.render.main.program.uniform.A> uniformCreator() {
        return this.A;
    }
}

