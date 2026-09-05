/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.api.Version
 */
import net.fabricmc.loader.api.Version;

final class NurVersion
implements Version {
    private final String raw;

    NurVersion(String string) {
        this.raw = string;
    }

    public String getFriendlyString() {
        return this.raw;
    }

    public int compareTo(Version version) {
        return this.raw.compareTo(version.getFriendlyString());
    }

    public String toString() {
        return this.raw;
    }
}

