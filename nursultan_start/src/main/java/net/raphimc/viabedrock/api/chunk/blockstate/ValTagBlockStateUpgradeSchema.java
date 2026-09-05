/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.ShortTag
 *  net.raphimc.viabedrock.ViaBedrock
 *  net.raphimc.viabedrock.api.chunk.blockstate.BlockStateUpgradeSchema
 *  net.raphimc.viabedrock.api.chunk.blockstate.BlockStateUpgradeSchema$StopUpgrade
 */
package net.raphimc.viabedrock.api.chunk.blockstate;

import com.viaversion.nbt.tag.ShortTag;
import java.util.logging.Level;
import net.raphimc.viabedrock.ViaBedrock;
import net.raphimc.viabedrock.api.chunk.blockstate.BlockStateUpgradeSchema;
import net.raphimc.viabedrock.api.model.BedrockBlockState;
import net.raphimc.viabedrock.protocol.BedrockProtocol;

public class ValTagBlockStateUpgradeSchema
extends BlockStateUpgradeSchema {
    public ValTagBlockStateUpgradeSchema() {
        super(1);
        this.actions.add(tag -> {
            if (tag.get("val") instanceof ShortTag) {
                String name = tag.getStringTag("name").getValue();
                if (!BedrockProtocol.MAPPINGS.getBedrockLegacyBlocks().containsKey((Object)name)) {
                    ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Missing block " + name + " in val tag block state upgrade schema");
                    return;
                }
                int id = (Integer)BedrockProtocol.MAPPINGS.getBedrockLegacyBlocks().get((Object)name);
                short metadata = ((ShortTag)tag.removeUnchecked("val")).asShort();
                if (metadata < 0 || metadata > 63) {
                    return;
                }
                BedrockBlockState blockState = (BedrockBlockState)BedrockProtocol.MAPPINGS.getBedrockLegacyBlockStates().get(id << 6 | metadata & 0x3F);
                if (blockState == null) {
                    ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Missing block state " + name + ":" + metadata + " in val tag block state upgrade schema");
                    blockState = (BedrockBlockState)BedrockProtocol.MAPPINGS.getBedrockLegacyBlockStates().get(id << 6);
                }
                tag.put("states", blockState.blockStateTag().get("states").copy());
                throw BlockStateUpgradeSchema.StopUpgrade.INSTANCE;
            }
        });
    }
}

