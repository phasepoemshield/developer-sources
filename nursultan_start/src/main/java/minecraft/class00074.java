/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class01062
 *  minecraft.class01929
 *  minecraft.class02003
 *  minecraft.class02796
 *  minecraft.class02969
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class04770
 *  minecraft.class06633
 *  minecraft.class07001
 *  minecraft.class07842
 *  minecraft.class08303
 *  minecraft.class08329
 *  minecraft.class08337
 *  minecraft.class08774
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import minecraft.class00392;
import minecraft.class01062;
import minecraft.class01929;
import minecraft.class02003;
import minecraft.class02796;
import minecraft.class02969;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class04770;
import minecraft.class06633;
import minecraft.class07001;
import minecraft.class07842;
import minecraft.class08303;
import minecraft.class08329;
import minecraft.class08337;
import minecraft.class08774;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00074
extends class01062 {
    private static final Logger M = LogUtils.getLogger();
    private @Nullable class07001 B;

    public class00074(class08337 class083372, class02003<class02969> class020032, class07842 class078422) {
        super((class02796)class083372, class020032, class078422, (class06633)class083372.Nt());
        this.N(10);
    }

    public @Nullable class07001 y() {
        return this.B;
    }

    protected void N(class04770 class047702) {
        if (this.L().N(class047702.method_72498())) {
            try (class04495 class044952 = new class04495(class047702.method_71370(), M);){
                class08303 class083032 = class08303.N((class04490)class044952, (class01929)class047702.method_56673());
                class047702.method_5647((class08329)class083032);
                this.B = class083032.y();
            }
        }
        super.N(class047702);
    }

    public class00392 N(SocketAddress socketAddress, class08774 class087742) {
        if (this.L().N(class087742) && this.N(class087742.y()) != null) {
            return class00392.L((String)"multiplayer.disconnect.name_taken");
        }
        return super.N(socketAddress, class087742);
    }
}

