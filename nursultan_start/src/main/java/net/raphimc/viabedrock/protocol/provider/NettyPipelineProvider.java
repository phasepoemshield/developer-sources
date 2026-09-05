/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.platform.providers.Provider
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PacketCompressionAlgorithm
 */
package net.raphimc.viabedrock.protocol.provider;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.platform.providers.Provider;
import javax.crypto.SecretKey;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PacketCompressionAlgorithm;

public abstract class NettyPipelineProvider
implements Provider {
    public abstract void enableEncryption(UserConnection var1, SecretKey var2);

    public abstract void enableCompression(UserConnection var1, PacketCompressionAlgorithm var2, int var3);
}

