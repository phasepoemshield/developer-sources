/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class02998
 *  minecraft.class04247
 *  minecraft.class04248
 *  minecraft.class07280
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import minecraft.class00381;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class02998;
import minecraft.class04247;
import minecraft.class04248;
import minecraft.class07280;

public final class class06660
extends Record
implements class00381<class07280> {
    private final int id;
    private final List<class02998<?>> packedItems;
    public static final class02362<class04247, class06660> N = class00381.N(class06660::y, class06660::new);
    public static final int y = 255;

    private class06660(class04247 class042472) {
        this(class042472.E(), class06660.N(class042472));
    }

    public class06660(int n, List<class02998<?>> list) {
        this.id = n;
        this.packedItems = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06660.class, "id;packedItems", "id", "packedItems"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06660.class, "id;packedItems", "id", "packedItems"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06660.class, "id;packedItems", "id", "packedItems"}, this);
    }

    private void y(class04247 class042472) {
        class042472.L(this.id);
        class06660.N(this.packedItems, class042472);
    }

    public List<class02998<?>> y() {
        return this.packedItems;
    }

    private static List<class02998<?>> N(class04247 class042472) {
        short s;
        ArrayList arrayList = new ArrayList();
        while ((s = class042472.readUnsignedByte()) != 255) {
            arrayList.add(class02998.N((class04247)class042472, (int)s));
        }
        return arrayList;
    }

    public int N() {
        return this.id;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    private static void N(List<class02998<?>> list, class04247 class042472) {
        Iterator<class02998<?>> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().N(class042472);
        }
        class042472.writeByte(255);
    }

    public class02897<class06660> method_65080() {
        return class04248.NV;
    }
}

