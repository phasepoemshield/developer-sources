/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.shaderpack.loading.ProgramId
 */
package net.irisshaders.iris.shaderpack.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import net.irisshaders.iris.shaderpack.loading.ProgramId;
import net.irisshaders.iris.shaderpack.programs.ProgramSet;
import net.irisshaders.iris.shaderpack.programs.ProgramSource;

public class ProgramFallbackResolver {
    private final ProgramSet programs;
    private final Map<ProgramId, ProgramSource> cache;

    public boolean has(ProgramId programId) {
        return this.programs.get(programId).isPresent();
    }

    public ProgramFallbackResolver(ProgramSet programSet) {
        this.programs = programSet;
        this.cache = new HashMap<ProgramId, ProgramSource>();
    }

    public Optional<ProgramSource> resolve(ProgramId programId) {
        return Optional.ofNullable(this.resolveNullable(programId));
    }

    public ProgramSource resolveNullable(ProgramId programId) {
        ProgramId programId2;
        if (this.cache.containsKey(programId)) {
            return this.cache.get(programId);
        }
        ProgramSource programSource = this.programs.get(programId).orElse(null);
        if (programSource == null && (programId2 = (ProgramId)programId.getFallback().orElse(null)) != null) {
            programSource = this.resolveNullable(programId2);
        }
        this.cache.put(programId, programSource);
        return programSource;
    }
}

