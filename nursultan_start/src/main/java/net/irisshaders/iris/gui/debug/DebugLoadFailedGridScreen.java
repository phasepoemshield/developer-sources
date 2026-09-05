/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class02060
 *  minecraft.class02072
 *  minecraft.class02077
 *  minecraft.class02102
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05362
 *  minecraft.class06197
 *  minecraft.class06202
 *  minecraft.class06478
 *  net.irisshaders.iris.Iris
 *  org.apache.commons.lang3.exception.ExceptionUtils
 */
package net.irisshaders.iris.gui.debug;

import java.io.IOException;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class02060;
import minecraft.class02072;
import minecraft.class02077;
import minecraft.class02102;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05362;
import minecraft.class06197;
import minecraft.class06202;
import minecraft.class06478;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gui.debug.DebugTextWidget;
import org.apache.commons.lang3.exception.ExceptionUtils;

public class DebugLoadFailedGridScreen
extends class05096 {
    private final Exception exception;
    private final class05096 parent;

    public DebugLoadFailedGridScreen(class05096 class050962, class00392 class003922, Exception exception) {
        super(class003922);
        this.parent = class050962;
        this.exception = exception;
    }

    public void method_25426() {
        super.method_25426();
        class02060 class020602 = new class02060();
        class02072 class020722 = class020602.y().u().y();
        class02072 class020723 = class020602.y().u().L(30).y();
        class02072 class020724 = class020602.y().u().L(30).N();
        class02072 class020725 = class020602.y().u().L(30).L();
        int n = 0;
        Objects.requireNonNull(this.field_22793);
        class020602.N((class02102)new DebugTextWidget(0, 0, this.field_22789 - 80, 9 * 15, this.field_22793, this.exception), ++n, 0, 1, 2, class020722);
        class020602.N((class02102)class05362.method_46430((class00392)class00392.L((String)"menu.returnToGame"), class053622 -> this.field_22787.N(this.parent)).N(100).N(), ++n, 0, 1, 2, class020724);
        class020602.N((class02102)class05362.method_46430((class00392)class00392.y((String)"Reload pack"), class053622 -> {
            class06202.Nq().N(this.parent);
            try {
                Iris.reload();
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        }).N(100).N(), n, 0, 1, 2, class020725);
        class020602.N((class02102)class05362.method_46430((class00392)class00392.y((String)"Copy error"), class053622 -> ((class06197)this.field_22787.L_3).N(ExceptionUtils.getStackTrace((Throwable)this.exception))).N(100).N(), n, 0, 1, 2, class020723);
        class020602.N();
        class02077.N((class02102)class020602, (int)0, (int)0, (int)this.field_22789, (int)this.field_22790);
        class020602.method_48206(class046542 -> {
            class06478 cfr_ignored_0 = (class06478)this.method_37063((class04654)class046542);
        });
    }
}

