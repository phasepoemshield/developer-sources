/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.rewriter.text.NBTComponentRewriter
 *  com.viaversion.viaversion.util.TagUtil
 */
package com.viaversion.viaaprilfools.protocol.s25w14craftminetov1_21_5.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaaprilfools.protocol.s25w14craftminetov1_21_5.Protocol25w14craftmineTo1_21_5;
import com.viaversion.viaaprilfools.protocol.s25w14craftminetov1_21_5.data.MappingData25w14craftmine;
import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.packet.ClientboundPacket25w14craftmine;
import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.rewriter.BlockItemPacketRewriter25w14craftmine;
import com.viaversion.viabackwards.api.rewriters.text.TranslatableRewriter;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.rewriter.text.NBTComponentRewriter;
import com.viaversion.viaversion.util.TagUtil;

public final class ComponentRewriter25w14craftmine
extends NBTComponentRewriter<ClientboundPacket25w14craftmine>
implements TranslatableRewriter {
    private final MappingData25w14craftmine mappingData;

    public ComponentRewriter25w14craftmine(Protocol25w14craftmineTo1_21_5 protocol) {
        super((Protocol)protocol);
        this.mappingData = protocol.getMappingData();
    }

    protected void handleTranslate(UserConnection connection, CompoundTag parentTag, StringTag translateTag) {
        String newTranslate = this.mappedTranslationKey(translateTag.getValue());
        if (newTranslate != null) {
            parentTag.put("translate", (Tag)new StringTag(newTranslate));
        }
    }

    protected void handleTranslate(JsonObject root, String translate) {
        String newTranslate = this.mappedTranslationKey(translate);
        if (newTranslate != null) {
            root.addProperty("translate", newTranslate);
        }
    }

    protected void handleShowItem(UserConnection connection, CompoundTag itemTag, CompoundTag componentsTag) {
        super.handleShowItem(connection, itemTag, componentsTag);
        if (componentsTag == null) {
            return;
        }
        CompoundTag lodestoneTracker = TagUtil.getNamespacedCompoundTag((CompoundTag)componentsTag, (String)"lodestoneTracker");
        if (lodestoneTracker != null) {
            lodestoneTracker.remove("exits");
        }
        this.removeDataComponents(componentsTag, BlockItemPacketRewriter25w14craftmine.NEW_DATA_TO_REMOVE);
    }

    @Override
    public String mappedTranslationKey(String translationKey) {
        return this.mappingData.getTranslation(translationKey);
    }
}

