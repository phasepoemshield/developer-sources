/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class07280
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import minecraft.class00381;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class07280;

public class class06658
implements class00381<class07280> {
    public static final class02362<class00667, class06658> N = class00381.N(class06658::N, class06658::new);
    private final IntList y;

    private class06658(class00667 class006672) {
        this.y = class006672.N();
    }

    public class06658(int ... nArray) {
        this.y = new IntArrayList(nArray);
    }

    public class06658(IntList intList) {
        this.y = new IntArrayList(intList);
    }

    public IntList N() {
        return this.y;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    private void N(class00667 class006672) {
        class006672.N(this.y);
    }

    public class02897<class06658> method_65080() {
        return class04248.Nj;
    }
}

