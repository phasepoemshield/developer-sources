/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10966
 *  Nursultan.class10997
 *  Nursultan.class11938
 *  minecraft.class03556
 *  minecraft.class07055
 *  minecraft.class07084
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.class10966;
import Nursultan.class10997;
import Nursultan.class11938;
import java.util.HashMap;
import minecraft.class03556;
import minecraft.class07055;
import minecraft.class07084;
import minecraft.class07438;

public class class10749
extends HashMap<class03556<class07084>, class07055> {
    public Object N_0;

    public class10749(class07438 class074382) {
        this.N();
        this.N_0 = class074382;
    }

    @Override
    public class07055 remove(Object object) {
        class07055 class070552 = (class07055)super.remove(object);
        if (class070552 != null) {
            class11938.L().L((Object)class10997.N((class07055)class070552, (class10966)class10966.staticFields_0cabd41f8be773279a9b5245fe31e3239_3));
        }
        return class070552;
    }

    @Override
    public class07055 put(class03556<class07084> class035562, class07055 class070552) {
        class07055 class070553 = super.put(class035562, class070552);
        if (class070553 == null) {
            class11938.L().L((Object)class10997.N((class07055)class070552, (class10966)class10966.staticFields_0cabd41f8be773279a9b5245fe31e3239_0));
        } else {
            class11938.L().L((Object)class10997.N((class07055)class070552, (class10966)class10966.staticFields_0cabd41f8be773279a9b5245fe31e3239_1));
        }
        return class070553;
    }

    private void N() {
    }
}

