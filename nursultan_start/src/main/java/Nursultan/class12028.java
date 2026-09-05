/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03443
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class07510
 *  minecraft.class08036
 */
package Nursultan;

import Nursultan.class12040;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03443;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class07510;
import minecraft.class08036;

public class class12028
extends Record
implements class12040 {
    public class07510 actionType;
    public int syncId;
    public int slotId;
    public int button;

    public int L() {
        return this.syncId;
    }

    public class12028(int n, int n2, int n3, class07510 class075102) {
        this.syncId = n;
        this.slotId = n2;
        this.button = n3;
        this.actionType = class075102;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class12028.class, "syncId;slotId;button;actionType", "syncId", "slotId", "button", "actionType"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class12028.class, "syncId;slotId;button;actionType", "syncId", "slotId", "button", "actionType"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class12028.class, "syncId;slotId;button;actionType", "syncId", "slotId", "button", "actionType"}, this);
    }

    @Override
    public void accept(class06202 class062022) {
        ((class03443)class062022.T_2).N(this.syncId, this.slotId, this.button, this.actionType, (class08036)((class04453)class062022.T_4));
    }

    public class07510 u() {
        return this.actionType;
    }

    public int y() {
        return this.button;
    }

    public int N() {
        return this.slotId;
    }
}

