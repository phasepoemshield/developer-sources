/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00570
 *  minecraft.class01285
 *  minecraft.class05834
 *  minecraft.class07299
 *  net.irisshaders.iris.Iris
 */
package net.irisshaders.iris.gui.debug;

import minecraft.class00570;
import minecraft.class01285;
import minecraft.class05834;
import minecraft.class07299;
import net.irisshaders.iris.Iris;

public class IrisTrueDebugEntry
implements class01285 {
    public void method_72751(class05834 class058342, class07299 class072992, class00570 class005702, class00570 class005703) {
        Iris.getPipelineManager().getPipeline().ifPresent(worldRenderingPipeline -> worldRenderingPipeline.addDebugText(class058342));
    }
}

