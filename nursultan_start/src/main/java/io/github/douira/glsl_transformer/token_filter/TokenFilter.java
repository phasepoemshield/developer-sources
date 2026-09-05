/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.github.douira.glsl_transformer.token_filter.MultiFilter
 *  org.antlr.v4.runtime.Token
 */
package io.github.douira.glsl_transformer.token_filter;

import io.github.douira.glsl_transformer.ast.transform.JobParameters;
import io.github.douira.glsl_transformer.token_filter.MultiFilter;
import java.util.function.Supplier;
import org.antlr.v4.runtime.Token;

public abstract class TokenFilter<J extends JobParameters> {
    private Supplier<J> jobParametersSupplier;

    public static <J extends JobParameters> TokenFilter<J> join(TokenFilter<J> a, TokenFilter<J> b) {
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        if (MultiFilter.class.isInstance(b)) {
            if (MultiFilter.class.isInstance(a)) {
                MultiFilter bMulti = (MultiFilter)b;
                MultiFilter aMulti = (MultiFilter)a;
                MultiFilter multi = aMulti.clone();
                multi.addAll(bMulti);
                return multi;
            }
            return TokenFilter.join(b, a);
        }
        if (MultiFilter.class.isInstance(a)) {
            MultiFilter aMulti = (MultiFilter)a;
            MultiFilter multi = aMulti.clone();
            multi.add(b);
            return multi;
        }
        MultiFilter multi = new MultiFilter();
        multi.add(a);
        multi.add(b);
        return multi;
    }

    public void resetState() {
    }

    protected J getJobParameters() {
        return (J)((JobParameters)this.jobParametersSupplier.get());
    }

    public abstract boolean isTokenAllowed(Token var1);

    public void setJobParametersSupplier(Supplier<J> jobParametersSupplier) {
        this.jobParametersSupplier = jobParametersSupplier;
    }
}

