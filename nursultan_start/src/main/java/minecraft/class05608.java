/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class01929
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07709
 *  minecraft.class07717
 *  minecraft.class07793
 *  minecraft.class08308
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.logging.LogUtils;
import java.util.Locale;
import java.util.function.Function;
import minecraft.class00392;
import minecraft.class00394;
import minecraft.class00500;
import minecraft.class01929;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class05598;
import minecraft.class05600;
import minecraft.class05622;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07709;
import minecraft.class07717;
import minecraft.class07793;
import minecraft.class08308;
import org.slf4j.Logger;

public class class05608
implements class05598 {
    private static final Logger L = LogUtils.getLogger();
    static final SimpleCommandExceptionType N = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.data.block.invalid"));
    public static final Function<String, class05622> y = string -> new class05600((String)string);
    private final class00394 u;
    private final class07209 i;

    public class05608(class00394 class003942, class07209 class072092) {
        this.u = class003942;
        this.i = class072092;
    }

    @Override
    public class00392 y() {
        return class00392.N((String)"commands.data.block.modified", (Object[])new Object[]{this.i.method_10263(), this.i.method_10264(), this.i.method_10260()});
    }

    @Override
    public class00392 N(class07793 class077932, double d, int n) {
        return class00392.N((String)"commands.data.block.get", (Object[])new Object[]{class077932.N(), this.i.method_10263(), this.i.method_10264(), this.i.method_10260(), String.format(Locale.ROOT, "%.2f", d), n});
    }

    @Override
    public class00392 N(class07709 class077092) {
        return class00392.N((String)"commands.data.block.query", (Object[])new Object[]{this.i.method_10263(), this.i.method_10264(), this.i.method_10260(), class07717.y((class07709)class077092)});
    }

    @Override
    public void N(class07001 class070012) {
        class00500 class005002 = this.u.G().method_8320(this.i);
        try (class04495 class044952 = new class04495(this.u.J(), L);){
            this.u.y_1(class08308.N((class04490)class044952, (class01929)this.u.G().method_30349(), (class07001)class070012));
            this.u.method_5431();
            this.u.G().method_8413(this.i, class005002, class005002, 3);
        }
    }

    @Override
    public class07001 N() {
        return this.u.y_2((class01929)this.u.G().method_30349());
    }
}

