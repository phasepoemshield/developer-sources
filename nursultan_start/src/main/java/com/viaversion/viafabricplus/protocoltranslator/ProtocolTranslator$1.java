/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.protocol.version.SubVersionRange
 *  com.viaversion.viaversion.api.protocol.version.VersionType
 */
package com.viaversion.viafabricplus.protocoltranslator;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.protocol.version.SubVersionRange;
import com.viaversion.viaversion.api.protocol.version.VersionType;
import java.util.Comparator;

class ProtocolTranslator$1
extends ProtocolVersion {
    public boolean isKnown() {
        return false;
    }

    ProtocolTranslator$1(VersionType versionType, int n, int n2, String string, SubVersionRange subVersionRange) {
        super(versionType, n, n2, string, subVersionRange);
    }

    protected Comparator<ProtocolVersion> customComparator() {
        return (protocolVersion, protocolVersion2) -> {
            if (protocolVersion == ProtocolTranslator.AUTO_DETECT_PROTOCOL) {
                return 1;
            }
            if (protocolVersion2 == ProtocolTranslator.AUTO_DETECT_PROTOCOL) {
                return -1;
            }
            return 0;
        };
    }
}

