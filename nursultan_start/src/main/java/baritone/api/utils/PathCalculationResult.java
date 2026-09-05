/*
 * Decompiled with CFR 0.152.
 */
package baritone.api.utils;

import baritone.api.pathing.calc.IPath;
import baritone.api.utils.PathCalculationResult$Type;
import java.util.Objects;
import java.util.Optional;

public class PathCalculationResult {
    private final IPath path;
    private final PathCalculationResult$Type type;

    public PathCalculationResult(PathCalculationResult$Type pathCalculationResult$Type) {
        this(pathCalculationResult$Type, null);
    }

    public PathCalculationResult(PathCalculationResult$Type pathCalculationResult$Type, IPath iPath) {
        Objects.requireNonNull(pathCalculationResult$Type);
        this.path = iPath;
        this.type = pathCalculationResult$Type;
    }

    public final PathCalculationResult$Type getType() {
        return this.type;
    }

    public final Optional<IPath> getPath() {
        return Optional.ofNullable(this.path);
    }
}

