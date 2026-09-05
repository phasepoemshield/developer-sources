/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class02968
 */
package net.fabricmc.fabric.impl.resource.conditions;

import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import minecraft.class02968;
import net.fabricmc.fabric.impl.resource.conditions.OverlayConditionsMetadata$Entry;

public record OverlayConditionsMetadata(List<OverlayConditionsMetadata$Entry> overlays) {
    public static final Codec<OverlayConditionsMetadata> CODEC = OverlayConditionsMetadata$Entry.CODEC.listOf().fieldOf("entries").xmap(OverlayConditionsMetadata::new, OverlayConditionsMetadata::overlays).codec();
    public static final class02968<OverlayConditionsMetadata> SERIALIZER = new class02968("fabric:overlays", CODEC);

    public List<String> appliedOverlays() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (OverlayConditionsMetadata$Entry overlayConditionsMetadata$Entry : this.overlays()) {
            if (!overlayConditionsMetadata$Entry.condition().test(null)) continue;
            arrayList.add(overlayConditionsMetadata$Entry.directory());
        }
        return arrayList;
    }
}

