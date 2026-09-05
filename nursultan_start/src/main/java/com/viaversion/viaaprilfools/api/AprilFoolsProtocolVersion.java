/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.protocol.SpecialProtocolVersion
 */
package com.viaversion.viaaprilfools.api;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.protocol.SpecialProtocolVersion;
import java.util.ArrayList;
import java.util.List;

public class AprilFoolsProtocolVersion {
    public static final List<ProtocolVersion> PROTOCOLS = new ArrayList<ProtocolVersion>();
    public static final List<ProtocolVersion> SNAPSHOTS_PROTOCOLS = new ArrayList<ProtocolVersion>();
    public static final List<ProtocolVersion> APRIL_FOOLS_PROTOCOLS = new ArrayList<ProtocolVersion>();
    public static final ProtocolVersion s3d_shareware = AprilFoolsProtocolVersion.registerAprilFools(1, "3D Shareware", ProtocolVersion.v1_13_2, ProtocolVersion.v1_13_2);
    public static final ProtocolVersion s20w14infinite = AprilFoolsProtocolVersion.registerAprilFools(709, "20w14infinite", ProtocolVersion.v1_15_2, ProtocolVersion.v1_16);
    public static final ProtocolVersion sCombatTest8c = AprilFoolsProtocolVersion.registerSnapshot(803, "Combat Test 8c", ProtocolVersion.v1_16_1);
    public static final ProtocolVersion s25w14craftMine = AprilFoolsProtocolVersion.registerAprilFools(770, 244, "25w14craftmine", ProtocolVersion.v1_21_5);

    private static ProtocolVersion registerSnapshot(int version, String name, ProtocolVersion origin) {
        SpecialProtocolVersion protocolVersion = new SpecialProtocolVersion(version, name, origin);
        ProtocolVersion.register((ProtocolVersion)protocolVersion);
        PROTOCOLS.add((ProtocolVersion)protocolVersion);
        SNAPSHOTS_PROTOCOLS.add((ProtocolVersion)protocolVersion);
        return protocolVersion;
    }

    private static ProtocolVersion registerAprilFools(int version, String name, ProtocolVersion origin, ProtocolVersion baseProtocolVersion) {
        return AprilFoolsProtocolVersion.registerAprilFools(version, -1, name, origin, baseProtocolVersion);
    }

    private static ProtocolVersion registerAprilFools(int version, int snapshotVersion, String name, ProtocolVersion origin) {
        return AprilFoolsProtocolVersion.registerAprilFools(version, snapshotVersion, name, origin, origin);
    }

    private static ProtocolVersion registerAprilFools(int version, int snapshotVersion, String name, ProtocolVersion origin, final ProtocolVersion baseProtocolVersion) {
        SpecialProtocolVersion protocolVersion = new SpecialProtocolVersion(version, snapshotVersion, name, null, origin){

            public ProtocolVersion getBaseProtocolVersion() {
                return baseProtocolVersion;
            }
        };
        ProtocolVersion.register((ProtocolVersion)protocolVersion);
        PROTOCOLS.add((ProtocolVersion)protocolVersion);
        APRIL_FOOLS_PROTOCOLS.add((ProtocolVersion)protocolVersion);
        return protocolVersion;
    }
}

