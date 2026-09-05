/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.protocol.SpecialProtocolVersion
 *  net.raphimc.viabedrock.protocol.data.ProtocolConstants
 */
package net.raphimc.viabedrock.api;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.protocol.SpecialProtocolVersion;
import java.util.ArrayList;
import java.util.List;
import net.raphimc.viabedrock.protocol.data.ProtocolConstants;

public class BedrockProtocolVersion {
    public static final List<ProtocolVersion> PROTOCOLS = new ArrayList<ProtocolVersion>();
    public static final ProtocolVersion bedrockLatest = new SpecialProtocolVersion(944, "Bedrock 1.26.10", ProtocolConstants.JAVA_VERSION){

        public ProtocolVersion getBaseProtocolVersion() {
            return null;
        }
    };

    static {
        ProtocolVersion.register((ProtocolVersion)bedrockLatest);
        PROTOCOLS.add(bedrockLatest);
    }
}

