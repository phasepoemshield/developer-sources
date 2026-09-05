/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap
 *  org.checkerframework.checker.nullness.qual.NonNull
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.protocol.version;

import com.google.common.base.Preconditions;
import com.viaversion.viaversion.api.protocol.version.SubVersionRange;
import com.viaversion.viaversion.api.protocol.version.VersionType;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

public class ProtocolVersion
implements Comparable<ProtocolVersion> {
    private static final Map<VersionType, Int2ObjectMap<ProtocolVersion>> VERSIONS = new EnumMap<VersionType, Int2ObjectMap<ProtocolVersion>>(VersionType.class);
    private static final List<ProtocolVersion> VERSION_LIST = new ArrayList<ProtocolVersion>();
    public static final ProtocolVersion v1_7_2;
    @Deprecated(forRemoval=true)
    public static final ProtocolVersion v1_7_1;
    public static final ProtocolVersion v1_7_6;
    public static final ProtocolVersion v1_8;
    public static final ProtocolVersion v1_9;
    public static final ProtocolVersion v1_9_1;
    public static final ProtocolVersion v1_9_2;
    public static final ProtocolVersion v1_9_3;
    public static final ProtocolVersion v1_10;
    public static final ProtocolVersion v1_11;
    public static final ProtocolVersion v1_11_1;
    public static final ProtocolVersion v1_12;
    public static final ProtocolVersion v1_12_1;
    public static final ProtocolVersion v1_12_2;
    public static final ProtocolVersion v1_13;
    public static final ProtocolVersion v1_13_1;
    public static final ProtocolVersion v1_13_2;
    public static final ProtocolVersion v1_14;
    public static final ProtocolVersion v1_14_1;
    public static final ProtocolVersion v1_14_2;
    public static final ProtocolVersion v1_14_3;
    public static final ProtocolVersion v1_14_4;
    public static final ProtocolVersion v1_15;
    public static final ProtocolVersion v1_15_1;
    public static final ProtocolVersion v1_15_2;
    public static final ProtocolVersion v1_16;
    public static final ProtocolVersion v1_16_1;
    public static final ProtocolVersion v1_16_2;
    public static final ProtocolVersion v1_16_3;
    public static final ProtocolVersion v1_16_4;
    public static final ProtocolVersion v1_17;
    public static final ProtocolVersion v1_17_1;
    public static final ProtocolVersion v1_18;
    public static final ProtocolVersion v1_18_2;
    public static final ProtocolVersion v1_19;
    public static final ProtocolVersion v1_19_1;
    public static final ProtocolVersion v1_19_3;
    public static final ProtocolVersion v1_19_4;
    public static final ProtocolVersion v1_20;
    public static final ProtocolVersion v1_20_2;
    public static final ProtocolVersion v1_20_3;
    public static final ProtocolVersion v1_20_5;
    public static final ProtocolVersion v1_21;
    public static final ProtocolVersion v1_21_2;
    public static final ProtocolVersion v1_21_4;
    public static final ProtocolVersion v1_21_5;
    public static final ProtocolVersion v1_21_6;
    public static final ProtocolVersion v1_21_7;
    public static final ProtocolVersion v1_21_9;
    public static final ProtocolVersion v1_21_11;
    public static final ProtocolVersion v26_1;
    public static final ProtocolVersion unknown;
    private final VersionType versionType;
    private final int version;
    private final int snapshotVersion;
    private final String name;
    private final Set<String> includedVersions;
    @Deprecated
    private boolean known = true;

    public boolean isKnown() {
        return this.known;
    }

    public int getFullSnapshotVersion() {
        Preconditions.checkArgument((boolean)this.isSnapshot());
        return 0x40000000 | this.snapshotVersion;
    }

    public Set<String> getIncludedVersions() {
        return Collections.unmodifiableSet(this.includedVersions);
    }

    public static List<ProtocolVersion> getReversedProtocols() {
        ArrayList<ProtocolVersion> protocolVersions = new ArrayList<ProtocolVersion>(ProtocolVersion.getProtocols());
        Collections.reverse(protocolVersions);
        return Collections.unmodifiableList(protocolVersions);
    }

    public ProtocolVersion(VersionType versionType, int version, int snapshotVersion, String name, @Nullable SubVersionRange versionRange) {
        this.versionType = versionType;
        this.version = version;
        this.snapshotVersion = snapshotVersion;
        this.name = name;
        Preconditions.checkArgument((!this.isVersionWildcard() || versionRange != null ? 1 : 0) != 0, (Object)"A wildcard name must have a version range");
        if (versionRange != null) {
            this.includedVersions = new LinkedHashSet<String>();
            for (int i = versionRange.rangeFrom(); i <= versionRange.rangeTo(); ++i) {
                if (i == 0) {
                    this.includedVersions.add(versionRange.baseVersion());
                }
                this.includedVersions.add(versionRange.baseVersion() + "." + i);
            }
        } else {
            this.includedVersions = Collections.singleton(name);
        }
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        ProtocolVersion that = (ProtocolVersion)o;
        return this.version == that.version && this.versionType == that.versionType && this.snapshotVersion == that.snapshotVersion;
    }

    public String toString() {
        return String.format("%s (%d)", this.name, this.version);
    }

    public int hashCode() {
        int result = this.versionType.hashCode();
        result = 31 * result + this.version;
        result = 31 * result + this.snapshotVersion;
        return result;
    }

    @Override
    public int compareTo(ProtocolVersion other) {
        if (this.versionType == VersionType.SPECIAL && this.customComparator() != null) {
            return this.customComparator().compare(this, other);
        }
        if (other.versionType == VersionType.SPECIAL && other.customComparator() != null) {
            return other.customComparator().compare(this, other);
        }
        if (this.versionType != other.versionType) {
            return this.versionType.ordinal() < other.versionType.ordinal() ? -1 : 1;
        }
        if (this.version != other.version) {
            return this.version < other.version ? -1 : 1;
        }
        return Integer.compare(this.snapshotVersion, other.snapshotVersion);
    }

    public String getName() {
        return this.name;
    }

    public static boolean isRegistered(int version) {
        return ProtocolVersion.isRegistered(VersionType.RELEASE, version);
    }

    public static boolean isRegistered(VersionType versionType, int version) {
        Int2ObjectMap<ProtocolVersion> versions = VERSIONS.get((Object)versionType);
        return versions != null && versions.containsKey(version);
    }

    public static ProtocolVersion register(int version, String name) {
        return ProtocolVersion.register(version, -1, name);
    }

    public static void register(ProtocolVersion protocolVersion) {
        VERSION_LIST.add(protocolVersion);
        VERSION_LIST.sort(ProtocolVersion::compareTo);
        Int2ObjectMap versions = VERSIONS.computeIfAbsent(protocolVersion.versionType, $ -> new Int2ObjectOpenHashMap());
        versions.put(protocolVersion.version, (Object)protocolVersion);
        if (protocolVersion.isSnapshot()) {
            versions.put(protocolVersion.getFullSnapshotVersion(), (Object)protocolVersion);
        }
    }

    public static ProtocolVersion register(int version, String name, @Nullable SubVersionRange versionRange) {
        ProtocolVersion protocolVersion = new ProtocolVersion(VersionType.RELEASE, version, -1, name, versionRange);
        ProtocolVersion.register(protocolVersion);
        return protocolVersion;
    }

    public static ProtocolVersion register(int version, int snapshotVersion, String name) {
        ProtocolVersion protocolVersion = new ProtocolVersion(VersionType.RELEASE, version, snapshotVersion, name, null);
        ProtocolVersion.register(protocolVersion);
        return protocolVersion;
    }

    @Deprecated(forRemoval=true)
    public static int getIndex(ProtocolVersion version) {
        return VERSION_LIST.indexOf(version);
    }

    public static @NonNull ProtocolVersion getProtocol(VersionType versionType, int version) {
        ProtocolVersion protocolVersion;
        Int2ObjectMap<ProtocolVersion> versions = VERSIONS.get((Object)versionType);
        if (versions != null && (protocolVersion = (ProtocolVersion)versions.get(version)) != null) {
            return protocolVersion;
        }
        ProtocolVersion unknown = new ProtocolVersion(versionType, version, -1, "Unknown (" + version + ")", null);
        unknown.known = false;
        return unknown;
    }

    public static @NonNull ProtocolVersion getProtocol(int version) {
        return ProtocolVersion.getProtocol(VersionType.RELEASE, version);
    }

    public int getVersion() {
        return this.version;
    }

    public VersionType getVersionType() {
        return this.versionType;
    }

    public boolean betweenExclusive(ProtocolVersion min, ProtocolVersion max) {
        return this.newerThan(min) && this.olderThan(max);
    }

    public boolean isVersionWildcard() {
        return this.name.endsWith(".x");
    }

    public int getOriginalVersion() {
        return this.snapshotVersion == -1 ? this.version : 0x40000000 | this.snapshotVersion;
    }

    public int getSnapshotVersion() {
        Preconditions.checkArgument((boolean)this.isSnapshot());
        return this.snapshotVersion;
    }

    protected @Nullable Comparator<ProtocolVersion> customComparator() {
        return null;
    }

    public boolean equalTo(ProtocolVersion other) {
        return this.compareTo(other) == 0;
    }

    public static @Nullable ProtocolVersion getClosest(String protocol) {
        for (ProtocolVersion version : VERSION_LIST) {
            String name = version.getName();
            if (!name.equals(protocol) && (!version.isRange() || !version.getIncludedVersions().contains(protocol))) continue;
            return version;
        }
        return null;
    }

    public boolean isSnapshot() {
        return this.snapshotVersion != -1;
    }

    public boolean isRange() {
        return this.includedVersions.size() != 1;
    }

    public boolean olderThan(ProtocolVersion other) {
        return this.compareTo(other) < 0;
    }

    public boolean newerThan(ProtocolVersion other) {
        return this.compareTo(other) > 0;
    }

    public boolean newerThanOrEqualTo(ProtocolVersion other) {
        return this.compareTo(other) >= 0;
    }

    public boolean olderThanOrEqualTo(ProtocolVersion other) {
        return this.compareTo(other) <= 0;
    }

    public boolean betweenInclusive(ProtocolVersion min, ProtocolVersion max) {
        return this.newerThanOrEqualTo(min) && this.olderThanOrEqualTo(max);
    }

    public static List<ProtocolVersion> getProtocols() {
        return Collections.unmodifiableList(VERSION_LIST);
    }

    static {
        v1_7_1 = v1_7_2 = ProtocolVersion.register(4, "1.7.2-1.7.5", new SubVersionRange("1.7", 2, 5));
        v1_7_6 = ProtocolVersion.register(5, "1.7.6-1.7.10", new SubVersionRange("1.7", 6, 10));
        v1_8 = ProtocolVersion.register(47, "1.8.x", new SubVersionRange("1.8", 0, 9));
        v1_9 = ProtocolVersion.register(107, "1.9");
        v1_9_1 = ProtocolVersion.register(108, "1.9.1");
        v1_9_2 = ProtocolVersion.register(109, "1.9.2");
        v1_9_3 = ProtocolVersion.register(110, "1.9.3-1.9.4", new SubVersionRange("1.9", 3, 4));
        v1_10 = ProtocolVersion.register(210, "1.10.x", new SubVersionRange("1.10", 0, 2));
        v1_11 = ProtocolVersion.register(315, "1.11");
        v1_11_1 = ProtocolVersion.register(316, "1.11.1-1.11.2", new SubVersionRange("1.11", 1, 2));
        v1_12 = ProtocolVersion.register(335, "1.12");
        v1_12_1 = ProtocolVersion.register(338, "1.12.1");
        v1_12_2 = ProtocolVersion.register(340, "1.12.2");
        v1_13 = ProtocolVersion.register(393, "1.13");
        v1_13_1 = ProtocolVersion.register(401, "1.13.1");
        v1_13_2 = ProtocolVersion.register(404, "1.13.2");
        v1_14 = ProtocolVersion.register(477, "1.14");
        v1_14_1 = ProtocolVersion.register(480, "1.14.1");
        v1_14_2 = ProtocolVersion.register(485, "1.14.2");
        v1_14_3 = ProtocolVersion.register(490, "1.14.3");
        v1_14_4 = ProtocolVersion.register(498, "1.14.4");
        v1_15 = ProtocolVersion.register(573, "1.15");
        v1_15_1 = ProtocolVersion.register(575, "1.15.1");
        v1_15_2 = ProtocolVersion.register(578, "1.15.2");
        v1_16 = ProtocolVersion.register(735, "1.16");
        v1_16_1 = ProtocolVersion.register(736, "1.16.1");
        v1_16_2 = ProtocolVersion.register(751, "1.16.2");
        v1_16_3 = ProtocolVersion.register(753, "1.16.3");
        v1_16_4 = ProtocolVersion.register(754, "1.16.4-1.16.5", new SubVersionRange("1.16", 4, 5));
        v1_17 = ProtocolVersion.register(755, "1.17");
        v1_17_1 = ProtocolVersion.register(756, "1.17.1");
        v1_18 = ProtocolVersion.register(757, "1.18-1.18.1", new SubVersionRange("1.18", 0, 1));
        v1_18_2 = ProtocolVersion.register(758, "1.18.2");
        v1_19 = ProtocolVersion.register(759, "1.19");
        v1_19_1 = ProtocolVersion.register(760, "1.19.1-1.19.2", new SubVersionRange("1.19", 1, 2));
        v1_19_3 = ProtocolVersion.register(761, "1.19.3");
        v1_19_4 = ProtocolVersion.register(762, "1.19.4");
        v1_20 = ProtocolVersion.register(763, "1.20-1.20.1", new SubVersionRange("1.20", 0, 1));
        v1_20_2 = ProtocolVersion.register(764, "1.20.2");
        v1_20_3 = ProtocolVersion.register(765, "1.20.3-1.20.4", new SubVersionRange("1.20", 3, 4));
        v1_20_5 = ProtocolVersion.register(766, "1.20.5-1.20.6", new SubVersionRange("1.20", 5, 6));
        v1_21 = ProtocolVersion.register(767, "1.21-1.21.1", new SubVersionRange("1.21", 0, 1));
        v1_21_2 = ProtocolVersion.register(768, "1.21.2-1.21.3", new SubVersionRange("1.21", 2, 3));
        v1_21_4 = ProtocolVersion.register(769, "1.21.4");
        v1_21_5 = ProtocolVersion.register(770, "1.21.5");
        v1_21_6 = ProtocolVersion.register(771, "1.21.6");
        v1_21_7 = ProtocolVersion.register(772, "1.21.7-1.21.8", new SubVersionRange("1.21", 7, 8));
        v1_21_9 = ProtocolVersion.register(773, "1.21.9-1.21.10", new SubVersionRange("1.21", 9, 10));
        v1_21_11 = ProtocolVersion.register(774, "1.21.11");
        v26_1 = ProtocolVersion.register(775, "26.1-26.1.2", new SubVersionRange("26.1", 0, 2));
        unknown = new ProtocolVersion(VersionType.SPECIAL, -1, -1, "UNKNOWN", null);
        ProtocolVersion.unknown.known = false;
    }
}

