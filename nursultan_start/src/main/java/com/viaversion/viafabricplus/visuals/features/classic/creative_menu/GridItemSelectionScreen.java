/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.ViaFabricPlus
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class03443
 *  minecraft.class03794
 *  minecraft.class04206
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class05096
 *  minecraft.class05630
 *  minecraft.class06478
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class09033
 */
package com.viaversion.viafabricplus.visuals.features.classic.creative_menu;

import com.viaversion.viafabricplus.ViaFabricPlus;
import java.util.ArrayList;
import java.util.Iterator;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class03443;
import minecraft.class03794;
import minecraft.class04206;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class05096;
import minecraft.class05630;
import minecraft.class06478;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class09033;

public final class GridItemSelectionScreen
extends class05096 {
    public static final GridItemSelectionScreen INSTANCE = new GridItemSelectionScreen();
    private static final int MAX_ROW_DIVIDER = 9;
    private static final int ITEM_XY_BOX_DIMENSION_CLASSIC = 25;
    private static final int SIDE_OFFSET = 15;
    private static final int ITEM_XY_BOX_DIMENSION_MODERN = 16;
    public class06581[][] itemGrid = null;
    public class06584 selectedItem = null;

    public GridItemSelectionScreen() {
        super(class00392.N((String)"Classic item selection"));
    }

    public void method_25426() {
        if (this.itemGrid != null) {
            return;
        }
        ArrayList<class06581> arrayList = new ArrayList<class06581>();
        for (class06581 class065812 : class04206.B) {
            if (class065812 == class06570.N || !class065812.method_45322().y(class03794.N) || !ViaFabricPlus.getImpl().itemExistsInConnection(class065812)) continue;
            arrayList.add(class065812);
        }
        this.itemGrid = new class06581[class04995.L((double)((double)arrayList.size() / 9.0))][9];
        int n = 0;
        int n2 = 0;
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            class06581 class065813;
            this.itemGrid[n2][n] = class065813 = (class06581)iterator.next();
            if (++n != 9) continue;
            n = 0;
            ++n2;
        }
    }

    public boolean method_25404(class06601 class066012) {
        if (((class05630)this.field_22787.i_7).Y.N(class066012)) {
            this.method_25419();
            return true;
        }
        return super.method_25404(class066012);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        int n3 = this.field_22789 / 2;
        int n4 = this.field_22790 / 2;
        int n5 = 255;
        int n6 = 25 * this.itemGrid.length + 30 + 15;
        int n7 = n3 - 127;
        int n8 = n4 - n6 / 2;
        class010542.N(n7, n8, n7 + 255, n8 + n6, Integer.MIN_VALUE);
        class010542.N(this.field_22793, "Select block", n7 + 127, n8 + 15, -1);
        this.selectedItem = null;
        int n9 = 30;
        for (class06581[] class06581Array : this.itemGrid) {
            int n10 = 15;
            for (class06581 class065812 : class06581Array) {
                if (class065812 == null) continue;
                if (n > n7 + n10 && n2 > n8 + n9 && n < n7 + n10 + 25 && n2 < n8 + n9 + 25) {
                    class010542.N(n7 + n10, n8 + n9, n7 + n10 + 25, n8 + n9 + 25, Integer.MAX_VALUE);
                    this.selectedItem = class065812.E();
                }
                class010542.N(class065812.E(), n7 + n10 + 4, n8 + n9 + 4);
                n10 += 25;
            }
            n9 += 25;
        }
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (this.selectedItem != null) {
            ((class03443)this.field_22787.T_2).N(this.selectedItem, ((class04453)this.field_22787.T_4).method_31548().N() + 36);
            ((class04453)this.field_22787.T_4).method_31548().N(this.selectedItem);
            ((class04453)this.field_22787.T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2.u();
            class06478.method_62888((class09033)this.field_22787.Nr());
            this.method_25419();
        }
        return super.method_25402(class066132, bl);
    }
}

