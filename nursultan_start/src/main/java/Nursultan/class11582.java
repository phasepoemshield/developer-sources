/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.ChatHelper
 *  Nursultan.class09295
 *  Nursultan.class09345
 *  Nursultan.class10963
 *  Nursultan.class11910
 *  Nursultan.class11938
 *  minecraft.class04453
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.ChatHelper;
import Nursultan.class09295;
import Nursultan.class09345;
import Nursultan.class10963;
import Nursultan.class11546;
import Nursultan.class11910;
import Nursultan.class11938;
import minecraft.class04453;
import minecraft.class06202;

public class class11582
extends class11546 {
    private void L(class10963 class109632) {
        String string = class109632.N();
        String[] stringArray = new String[]{" full", " max", " all"};
        String[] stringArray2 = new String[]{"pay ", "clan invest "};
        long l = class11910.y().orElse(10L) - 10L;
        for (String string2 : stringArray) {
            if (!string.endsWith(string2)) continue;
            for (String string3 : stringArray2) {
                if (!string.startsWith(string3)) continue;
                class109632.N(string.replace(string2, " " + l));
                return;
            }
        }
    }

    public class11582(ChatHelper chatHelper, String string, boolean bl) {
        super(chatHelper, string, bl);
    }

    public void y(Object object) {
        if (!(object instanceof class10963)) {
            return;
        }
        class10963 class109632 = (class10963)object;
        if (this.y(class109632)) {
            return;
        }
        if (this.N(class109632)) {
            return;
        }
        this.L(class109632);
    }

    private boolean y(class10963 class109632) {
        if (class109632.N().equals("ah me")) {
            class109632.N("ah " + ((class04453)((class06202)this.y_0).T_4).method_5820());
            return true;
        }
        return false;
    }

    private boolean N(class10963 class109632) {
        String string = class109632.N();
        class09345 class093452 = class11938.N();
        for (String string2 : new String[]{"tpa ", "call "}) {
            if (!string.startsWith(string2)) continue;
            for (class09295 class092952 : class093452.i()) {
                if (!string.equals(string2 + class092952.y())) continue;
                class109632.N(string2 + class092952.N());
                return true;
            }
            return false;
        }
        return false;
    }
}

