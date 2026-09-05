/*
 * Decompiled with CFR 0.152.
 */
package net.raphimc.viabedrock.protocol.data;

import net.raphimc.viabedrock.api.resourcepack.ResourcePack;
import net.raphimc.viabedrock.protocol.BedrockProtocol;

public class DataValues {
    public static final ResourcePack.Key VANILLA_RESOURCE_PACK_KEY = ResourcePack.Key.fromString("0575c61f-a5da-4b7f-9961-ffda2908861e_0.0.1");
    public static final ResourcePack.Key VANILLA_SKIN_PACK_KEY = ResourcePack.Key.fromString("c18e65aa-7b21-4637-9b63-8ad63622ef01_1.0.0");

    public static void validate() {
        assert (BedrockProtocol.MAPPINGS.getBedrockResourcePacks().containsKey((Object)VANILLA_RESOURCE_PACK_KEY));
        assert (BedrockProtocol.MAPPINGS.getBedrockSkinPacks().containsKey((Object)VANILLA_SKIN_PACK_KEY));
    }
}

