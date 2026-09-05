/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09904
 *  Nursultan.class10018
 *  Nursultan.class10021
 *  Nursultan.class10049
 */
package Nursultan;

import Nursultan.class09793;
import Nursultan.class09798;
import Nursultan.class09816;
import Nursultan.class09817;
import Nursultan.class09904;
import Nursultan.class10018;
import Nursultan.class10021;
import Nursultan.class10049;
import java.util.Objects;

final class class09812 {
    class09812() {
    }

    class10021 N(class09798 class097982) {
        Objects.requireNonNull(class097982, "spec");
        class10049 class100492 = class097982.y();
        class10021 class100212 = new class10021(class097982.N(), class100492);
        class10018.N((class10021)class100212, (String)class09817.N(class097982));
        class09793<class09904> var4 = class09817.y(class097982);
        if (var4 != null) {
            var4.N((class09904)class100212);
        }
        class100212.N(class097982.R());
        class100212.N(class097982.i());
        for (class09816 object : class097982.u()) {
            class100212.N(object.N(), object.y(), object.L());
        }
        if (class100492 == class10049.TEXT) {
            class100212.N(class097982.M());
        }
        if (class100492 == class10049.INPUT) {
            class100212.N(class097982.M());
            class100212.y(class097982.B());
        }
        if (class100492 == class10049.TEXTURE) {
            class100212.L(class097982.Z());
        }
        if (class100492 == class10049.CANVAS && class097982.z() != null) {
            class100212.N(class097982.z());
        }
        for (class09798 class097983 : class097982.L()) {
            class100212.N(this.N(class097983));
        }
        return class100212;
    }
}

