/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 */
package net.raphimc.viabedrock.api.model;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import net.raphimc.viabedrock.api.model.BlockState;

public class BedrockBlockState
extends BlockState {
    public static final BlockState AIR = new BlockState("air", Collections.emptyMap());
    public static final BlockState STONE = new BlockState("stone", Collections.singletonMap("stone_type", "stone"));
    public static final BlockState INFO_UPDATE = new BlockState("info_update", Collections.emptyMap());
    private final CompoundTag blockStateTag;

    private BedrockBlockState(String namespace, String identifier, Map<String, String> properties, CompoundTag blockStateTag) {
        super(namespace, identifier, properties);
        this.blockStateTag = blockStateTag;
    }

    public static BedrockBlockState fromNbt(CompoundTag tag) {
        BedrockBlockState.sanitizeName(tag);
        String[] namespaceAndIdentifier = tag.getStringTag("name").getValue().split(":", 2);
        HashMap<String, String> properties = new HashMap<String, String>();
        if (tag.get("states") instanceof CompoundTag) {
            for (Map.Entry entry : tag.getCompoundTag("states").getValue().entrySet()) {
                properties.put((String)entry.getKey(), ((Tag)entry.getValue()).getValue().toString());
            }
        }
        return new BedrockBlockState(namespaceAndIdentifier[0], namespaceAndIdentifier[1], properties, tag);
    }

    public static void sanitizeName(CompoundTag tag) {
        StringTag name = tag.getStringTag("name");
        String namespace = "minecraft";
        String identifier = name.getValue();
        if (identifier.contains(":")) {
            String[] namespaceAndIdentifier = identifier.split(":", 2);
            namespace = namespaceAndIdentifier[0];
            identifier = namespaceAndIdentifier[1].toLowerCase(Locale.ROOT);
        } else {
            identifier = identifier.toLowerCase(Locale.ROOT);
        }
        name.setValue(namespace + ":" + identifier);
    }

    public CompoundTag blockStateTag() {
        return this.blockStateTag;
    }
}

