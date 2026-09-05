/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntTag
 *  com.viaversion.nbt.tag.MixedListTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viafabricplus.protocoltranslator.impl.ViaFabricPlusMappingDataLoader
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 */
package com.viaversion.viafabricplus.features.font;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntTag;
import com.viaversion.nbt.tag.MixedListTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.protocoltranslator.impl.ViaFabricPlusMappingDataLoader;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Map;

public final class RenderableGlyphDiff {
    private static final Int2ObjectMap<ProtocolVersion> RENDERABLE_GLYPH_DIFF_LEGACY = new Int2ObjectOpenHashMap();
    private static final Int2ObjectMap<ProtocolVersion> RENDERABLE_GLYPH_DIFF = new Int2ObjectOpenHashMap();

    public static void init() {
        CompoundTag glyphs = ViaFabricPlusMappingDataLoader.INSTANCE.loadNBT("renderable-glyphs.nbt");
        RenderableGlyphDiff.fill(glyphs.getCompoundTag("legacy"), RENDERABLE_GLYPH_DIFF_LEGACY);
        RenderableGlyphDiff.fill(glyphs.getCompoundTag("unihex"), RENDERABLE_GLYPH_DIFF);
    }

    private static void fill(CompoundTag glyphs, Int2ObjectMap<ProtocolVersion> map) {
        for (Map.Entry entry : glyphs) {
            ProtocolVersion version = ProtocolVersion.getClosest((String)((String)entry.getKey()));
            if (version == null) {
                throw new IllegalStateException("Unknown protocol version: " + (String)entry.getKey());
            }
            MixedListTag list = (MixedListTag)entry.getValue();
            for (Tag i : list) {
                if (i instanceof IntTag) {
                    IntTag intTag = (IntTag)i;
                    map.put(intTag.asInt(), (Object)version);
                    continue;
                }
                if (!(i instanceof CompoundTag)) continue;
                CompoundTag compoundTag = (CompoundTag)i;
                int from = compoundTag.getInt("from");
                int to = compoundTag.getInt("to");
                for (int j = from; j <= to; ++j) {
                    map.put(j, (Object)version);
                }
            }
        }
    }

    public static boolean isGlyphRenderable(int codePoint) {
        ProtocolVersion targetVersion = ProtocolTranslator.getTargetVersion();
        if (targetVersion.newerThanOrEqualTo(ProtocolVersion.v1_20)) {
            return !RENDERABLE_GLYPH_DIFF.containsKey(codePoint) || targetVersion.newerThanOrEqualTo((ProtocolVersion)RENDERABLE_GLYPH_DIFF.get(codePoint));
        }
        return RENDERABLE_GLYPH_DIFF_LEGACY.containsKey(codePoint) && targetVersion.newerThanOrEqualTo((ProtocolVersion)RENDERABLE_GLYPH_DIFF_LEGACY.get(codePoint));
    }
}

