/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.florianreuth.classic4j.model.betacraft.BCServerInfo
 *  de.florianreuth.classic4j.model.betacraft.BCVersionCategory
 *  minecraft.class00392
 *  minecraft.class01202
 *  minecraft.class06202
 */
package com.viaversion.viafabricplus.screen.impl.classic4j;

import com.viaversion.viafabricplus.screen.VFPList;
import com.viaversion.viafabricplus.screen.impl.classic4j.BetaCraftScreen;
import com.viaversion.viafabricplus.screen.impl.classic4j.BetaCraftScreen$ServerSlot;
import com.viaversion.viafabricplus.screen.impl.settings.TitleEntry;
import de.florianreuth.classic4j.model.betacraft.BCServerInfo;
import de.florianreuth.classic4j.model.betacraft.BCVersionCategory;
import java.util.List;
import minecraft.class00392;
import minecraft.class01202;
import minecraft.class06202;

public class BetaCraftScreen$SlotList
extends VFPList {
    private static double scrollAmount;

    public BetaCraftScreen$SlotList(class06202 class062022, int n, int n2, int n3, int n4, int n5) {
        super(class062022, n, n2, n3, n4, n5);
        if (BetaCraftScreen.SERVER_LIST == null) {
            return;
        }
        for (BCVersionCategory bCVersionCategory : BCVersionCategory.values()) {
            List list = BetaCraftScreen.SERVER_LIST.serversOfVersionCategory(bCVersionCategory);
            if (list.isEmpty()) continue;
            this.method_25321((class01202)new TitleEntry(class00392.N((String)bCVersionCategory.name())));
            for (BCServerInfo bCServerInfo : list) {
                this.method_25321((class01202)new BetaCraftScreen$ServerSlot(bCServerInfo));
            }
        }
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

