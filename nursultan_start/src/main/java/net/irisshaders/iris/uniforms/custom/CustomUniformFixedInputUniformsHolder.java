/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  kroppeb.stareval.function.Type
 */
package net.irisshaders.iris.uniforms.custom;

import com.google.common.collect.ImmutableMap;
import java.util.Collection;
import kroppeb.stareval.function.Type;
import net.irisshaders.iris.uniforms.custom.cached.CachedUniform;

public class CustomUniformFixedInputUniformsHolder {
    private final ImmutableMap<String, CachedUniform> inputVariables;

    public Collection<CachedUniform> getAll() {
        return this.inputVariables.values();
    }

    public CustomUniformFixedInputUniformsHolder(ImmutableMap<String, CachedUniform> immutableMap) {
        this.inputVariables = immutableMap;
    }

    public boolean containsKey(String string) {
        return this.inputVariables.containsKey((Object)string);
    }

    public Type getType(String string) {
        CachedUniform cachedUniform = (CachedUniform)this.inputVariables.get((Object)string);
        if (cachedUniform == null) {
            return null;
        }
        return cachedUniform.getType();
    }

    public void updateAll() {
        for (CachedUniform cachedUniform : this.inputVariables.values()) {
            cachedUniform.update();
        }
    }

    public CachedUniform getUniform(String string) {
        return (CachedUniform)this.inputVariables.get((Object)string);
    }
}

