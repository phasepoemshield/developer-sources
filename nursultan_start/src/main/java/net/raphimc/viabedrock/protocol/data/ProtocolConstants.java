/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.libs.mcstructs.text.serializer.TextComponentCodec
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.Protocol1_21_11To26_1
 */
package net.raphimc.viabedrock.protocol.data;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.TextComponentCodec;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.Protocol1_21_11To26_1;

public class ProtocolConstants {
    public static final ProtocolVersion JAVA_VERSION = ProtocolVersion.v26_1;
    public static final Class<? extends Protocol<?, ?, ?, ?>> JAVA_PROTOCOL_CLASS = Protocol1_21_11To26_1.class;
    public static final int JAVA_PACK_VERSION = 84;
    public static final TextComponentCodec JAVA_TEXT_COMPONENT_SERIALIZER = TextComponentCodec.V26_1;
    public static final int JAVA_AIR_ID = 0;
    public static final String BEDROCK_VERSION_NAME = "1.26.10";
    public static final int BEDROCK_PROTOCOL_VERSION = 944;
    public static final int BEDROCK_RAKNET_PROTOCOL_VERSION = 11;
    public static final int BEDROCK_RAKNET_DEFAULT_PORT = 19132;
    public static final int BEDROCK_NETHERNET_DEFAULT_PORT = 7551;
    public static final String BEDROCK_COMMAND_VERSION = "latest";
    public static final byte BEDROCK_REQUEST_CHUNK_RADIUS_MAX_RADIUS = 28;
    public static final int LAST_BLOCK_ITEM_ID = 255;
    public static final float PLAYER_GRAVITY = 0.08f;
    public static final float BLOCK_FRICTION = 0.6f;

    public static StructuredDataContainer createStructuredDataContainer() {
        StructuredDataContainer data = new StructuredDataContainer();
        data.setIdLookup(Via.getManager().getProtocolManager().getProtocol(JAVA_PROTOCOL_CLASS), true);
        return data;
    }
}

