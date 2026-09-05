/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ReferenceMap
 *  minecraft.class01296
 *  net.caffeinemc.mods.sodium.client.render.chunk.RenderSection
 *  net.caffeinemc.mods.sodium.client.render.chunk.TaskQueueType
 */
package net.caffeinemc.mods.sodium.client.render.chunk.lists;

import it.unimi.dsi.fastutil.longs.Long2ReferenceMap;
import minecraft.class01296;
import net.caffeinemc.mods.sodium.client.render.chunk.RenderSection;
import net.caffeinemc.mods.sodium.client.render.chunk.TaskQueueType;
import net.caffeinemc.mods.sodium.client.render.chunk.lists.CoordinateSectionVisitor;
import net.caffeinemc.mods.sodium.client.render.chunk.lists.SectionCollector;

public class TreeSectionCollector
extends SectionCollector
implements CoordinateSectionVisitor {
    private final Long2ReferenceMap<RenderSection> sections;

    @Override
    public void visit(int n, int n2, int n3) {
        RenderSection renderSection = (RenderSection)this.sections.get(class01296.y((int)n, (int)n2, (int)n3));
        if (renderSection != null) {
            this.visit(renderSection);
        }
    }

    public TreeSectionCollector(int n, TaskQueueType taskQueueType, TaskQueueType taskQueueType2, Long2ReferenceMap<RenderSection> long2ReferenceMap) {
        super(n, taskQueueType, taskQueueType2);
        this.sections = long2ReferenceMap;
    }

    @Override
    public boolean orderIsSorted() {
        return true;
    }
}

