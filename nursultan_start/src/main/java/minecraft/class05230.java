/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01590
 *  minecraft.class02072
 *  minecraft.class02080
 *  minecraft.class02102
 *  minecraft.class03286
 *  minecraft.class03661
 *  minecraft.class03678
 *  minecraft.class03725
 *  minecraft.class04141
 *  minecraft.class04654
 *  minecraft.class04927
 *  minecraft.class05362
 *  minecraft.class06366
 *  minecraft.class06541
 *  minecraft.class07086
 *  minecraft.class07529
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01590;
import minecraft.class02072;
import minecraft.class02080;
import minecraft.class02102;
import minecraft.class03286;
import minecraft.class03661;
import minecraft.class03678;
import minecraft.class03725;
import minecraft.class04141;
import minecraft.class04654;
import minecraft.class04927;
import minecraft.class05213;
import minecraft.class05362;
import minecraft.class06366;
import minecraft.class06541;
import minecraft.class07086;
import minecraft.class07529;

class class05230
extends class03286 {
    private static final class00392 y = class00392.L((String)"createWorld.tab.game.title");
    private static final class00392 L = class00392.L((String)"selectWorld.allowCommands");
    private final class04927 u;
    final /* synthetic */ class05213 N;

    class05230(class05213 class052132) {
        this.N = class052132;
        super(y);
        class02080 class020802 = this.Z.y(8).u(1);
        class02072 class020722 = class020802.y();
        this.u = new class04927(class05213.N(class052132), 208, 20, (class00392)class00392.L((String)"selectWorld.enterName"));
        this.u.method_1852(class052132.R.y());
        this.u.method_1863(arg_0 -> ((class03661)class052132.R).N(arg_0));
        class052132.R.N((T class036612) -> this.u.method_47400(class04141.N((class00392)class00392.N((String)"selectWorld.targetFolder", (Object[])new Object[]{class00392.y((String)class036612.L()).N(class06541.field_1056)}))));
        class05213.N(class052132, (class04654)this.u);
        class020802.N((class02102)class03725.N((class01590)class05213.y(class052132), (class02102)this.u, (class00392)class05213.y), class020802.y().y());
        class06366 class063663 = (class06366)class020802.N((class02102)class06366.N(class036782 -> class036782.field_42224, (Object)class052132.R.u()).N((Object[])new class03678[]{class03678.field_20624, class03678.field_20625, class03678.field_20626}).N(0, 0, 210, 20, class05213.N, (class063662, class036782) -> this.N.R.N(class036782)), class020722);
        class052132.R.N((T class036612) -> {
            class063663.N((Object)class036612.u());
            class063662.field_22763 = !class036612.E();
            class063663.method_47400(class04141.N((class00392)class036612.u().N()));
        });
        class06366 class063664 = (class06366)class020802.N((class02102)class06366.N(class07086::y, (Object)class052132.R.i()).N((Object[])class07086.values()).N(0, 0, 210, 20, (class00392)class00392.L((String)"options.difficulty"), (class063662, class070862) -> this.N.R.N(class070862)), class020722);
        class052132.R.N((T class036612) -> {
            class063664.N((Object)this.N.R.i());
            class063662.field_22763 = !this.N.R.R();
            class063664.method_47400(class04141.N((class00392)this.N.R.i().L()));
        });
        class06366 var6 = (class06366)class020802.N((class02102)class06366.N((boolean)class052132.R.M()).N(bl -> class04141.N((class00392)class05213.u)).N(0, 0, 210, 20, L, (class063662, bl) -> this.N.R.N(bl.booleanValue())));
        class052132.R.N((T class036612) -> {
            var6.N((Object)this.N.R.M());
            class063662.field_22763 = !this.N.R.E() && !this.N.R.R();
        });
        if (!class07529.y().comp_4031()) {
            class020802.N((class02102)class05362.method_46430((class00392)class05213.L, class053622 -> this.N.N(this.N.R.U().B())).N(210).N());
        }
    }
}

