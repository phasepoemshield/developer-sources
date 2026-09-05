/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.api.SemanticVersion
 *  net.fabricmc.loader.api.Version
 *  net.fabricmc.loader.api.VersionParsingException
 */
package net.fabricmc.loader.util.version;

import java.util.Optional;
import net.fabricmc.loader.api.SemanticVersion;
import net.fabricmc.loader.api.Version;
import net.fabricmc.loader.api.VersionParsingException;

@Deprecated
public class SemanticVersionImpl
implements SemanticVersion {
    private final SemanticVersion parent;

    protected SemanticVersionImpl() {
        this.parent = null;
    }

    public SemanticVersionImpl(String version, boolean storeX) throws VersionParsingException {
        this.parent = SemanticVersion.parse((String)version);
    }

    public int getVersionComponentCount() {
        return this.parent.getVersionComponentCount();
    }

    public int getVersionComponent(int pos) {
        return this.parent.getVersionComponent(pos);
    }

    public Optional<String> getPrereleaseKey() {
        return this.parent.getPrereleaseKey();
    }

    public Optional<String> getBuildKey() {
        return this.parent.getBuildKey();
    }

    public String getFriendlyString() {
        return this.parent.getFriendlyString();
    }

    public boolean equals(Object o) {
        return this.parent.equals(o);
    }

    public int hashCode() {
        return this.parent.hashCode();
    }

    public String toString() {
        return this.parent.toString();
    }

    public boolean hasWildcard() {
        return this.parent.hasWildcard();
    }

    public boolean equalsComponentsExactly(SemanticVersionImpl other) {
        for (int i = 0; i < Math.max(this.getVersionComponentCount(), other.getVersionComponentCount()); ++i) {
            if (this.getVersionComponent(i) == other.getVersionComponent(i)) continue;
            return false;
        }
        return true;
    }

    public int compareTo(Version o) {
        return this.parent.compareTo((Object)o);
    }
}

