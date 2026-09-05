/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.impl.util.version.VersionParser
 */
package net.fabricmc.loader.api;

import java.util.Optional;
import net.fabricmc.loader.api.Version;
import net.fabricmc.loader.api.VersionParsingException;
import net.fabricmc.loader.impl.util.version.VersionParser;

public interface SemanticVersion
extends Version {
    public static final int COMPONENT_WILDCARD = Integer.MIN_VALUE;

    public int getVersionComponentCount();

    public int getVersionComponent(int var1);

    public Optional<String> getPrereleaseKey();

    public Optional<String> getBuildKey();

    public boolean hasWildcard();

    @Override
    @Deprecated
    default public int compareTo(SemanticVersion o) {
        return this.compareTo(o);
    }

    public static SemanticVersion parse(String s) throws VersionParsingException {
        return VersionParser.parseSemantic((String)s);
    }
}

