/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.florianreuth.classic4j.model.classicube.server.CCServerInfo
 *  minecraft.class01202
 *  minecraft.class06202
 */
package com.viaversion.viafabricplus.screen.impl.classic4j;

import com.viaversion.viafabricplus.screen.VFPList;
import com.viaversion.viafabricplus.screen.impl.classic4j.ClassiCubeServerListScreen;
import com.viaversion.viafabricplus.screen.impl.classic4j.ClassiCubeServerListScreen$ServerSlot;
import de.florianreuth.classic4j.model.classicube.server.CCServerInfo;
import minecraft.class01202;
import minecraft.class06202;

public class ClassiCubeServerListScreen$SlotList
extends VFPList {
    private static double scrollAmount;

    public ClassiCubeServerListScreen$SlotList(class06202 class062022, int n, int n2, int n3, int n4, int n5) {
        super(class062022, n, n2, n3, n4, n5);
        ClassiCubeServerListScreen.SERVER_LIST.forEach(cCServerInfo -> this.method_25321((class01202)new ClassiCubeServerListScreen$ServerSlot((CCServerInfo)cCServerInfo)));
        this.initScrollY(scrollAmount);
    }

    @Override
    public void updateSlotAmount(double d) {
        scrollAmount = d;
    }

    public int method_25322() {
        return super.method_25322() + 140;
    }
}

