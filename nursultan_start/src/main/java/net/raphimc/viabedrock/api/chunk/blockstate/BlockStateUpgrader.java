/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.util.GsonUtil
 *  net.raphimc.viabedrock.ViaBedrock
 *  net.raphimc.viabedrock.api.chunk.blockstate.BlockStateUpgradeSchema
 */
package net.raphimc.viabedrock.api.chunk.blockstate;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.util.GsonUtil;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import net.raphimc.viabedrock.ViaBedrock;
import net.raphimc.viabedrock.api.chunk.blockstate.BlockStateUpgradeSchema;
import net.raphimc.viabedrock.api.chunk.blockstate.JsonBlockStateUpgradeSchema;
import net.raphimc.viabedrock.api.chunk.blockstate.ValTagBlockStateUpgradeSchema;
import net.raphimc.viabedrock.api.model.BedrockBlockState;
import net.raphimc.viabedrock.api.util.FileSystemUtil;

public class BlockStateUpgrader {
    private final List<BlockStateUpgradeSchema> schemas = new ArrayList<BlockStateUpgradeSchema>();

    public BlockStateUpgrader() {
        this.schemas.add(new ValTagBlockStateUpgradeSchema());
        try {
            for (byte[] data : FileSystemUtil.getFilesInDirectory("assets/viabedrock/block_state_upgrade_schema").values()) {
                JsonObject json = (JsonObject)GsonUtil.getGson().fromJson(new String(data, StandardCharsets.UTF_8), JsonObject.class);
                this.schemas.add(new JsonBlockStateUpgradeSchema(json));
            }
        }
        catch (Throwable e) {
            ViaBedrock.getPlatform().getLogger().log(Level.SEVERE, "Failed to load block state upgrade schema", e);
            this.schemas.clear();
        }
    }

    public void upgradeToLatest(CompoundTag tag) {
        BedrockBlockState.sanitizeName(tag);
        for (BlockStateUpgradeSchema schema : this.schemas) {
            schema.upgrade(tag);
        }
    }
}

