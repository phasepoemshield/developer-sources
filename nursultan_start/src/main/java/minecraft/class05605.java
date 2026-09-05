/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.logging.LogUtils
 *  minecraft.class00392
 *  minecraft.class00717
 *  minecraft.class00809
 *  minecraft.class01929
 *  minecraft.class04490
 *  minecraft.class04495
 *  minecraft.class07001
 *  minecraft.class07049
 *  minecraft.class07709
 *  minecraft.class07717
 *  minecraft.class07793
 *  minecraft.class08036
 *  minecraft.class08308
 *  net.caffeinemc.mods.lithium.mixin.block.hopper.EntityAccessor
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.logging.LogUtils;
import java.util.Locale;
import java.util.UUID;
import java.util.function.Function;
import minecraft.class00392;
import minecraft.class00717;
import minecraft.class00809;
import minecraft.class01929;
import minecraft.class04490;
import minecraft.class04495;
import minecraft.class05598;
import minecraft.class05614;
import minecraft.class05622;
import minecraft.class07001;
import minecraft.class07049;
import minecraft.class07709;
import minecraft.class07717;
import minecraft.class07793;
import minecraft.class08036;
import minecraft.class08308;
import net.caffeinemc.mods.lithium.mixin.block.hopper.EntityAccessor;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05605
implements class05598 {
    private static final Logger y = LogUtils.getLogger();
    private static final SimpleCommandExceptionType L = new SimpleCommandExceptionType((Message)class00392.L((String)"commands.data.entity.invalid"));
    public static final Function<String, class05622> N = string -> new class05614((String)string);
    private final class07049 u;

    public class05605(class07049 class070492) {
        this.u = class070492;
    }

    @Override
    public class00392 y() {
        return class00392.N((String)"commands.data.entity.modified", (Object[])new Object[]{this.u.method_5476()});
    }

    private void N(class07001 class070012, CallbackInfo callbackInfo) {
        class07049 class070492 = this.u;
        if (class070492 instanceof class00717) {
            ((EntityAccessor)class070492).getChangeListener().N();
        }
    }

    @Override
    public class00392 N(class07793 class077932, double d, int n) {
        return class00392.N((String)"commands.data.entity.get", (Object[])new Object[]{class077932.N(), this.u.method_5476(), String.format(Locale.ROOT, "%.2f", d), n});
    }

    @Override
    public class00392 N(class07709 class077092) {
        return class00392.N((String)"commands.data.entity.query", (Object[])new Object[]{this.u.method_5476(), class07717.y((class07709)class077092)});
    }

    @Override
    public class07001 N() {
        return class00809.y((class07049)this.u);
    }

    @Override
    public void N(class07001 class070012) throws CommandSyntaxException {
        if (this.u instanceof class08036) {
            throw L.create();
        }
        UUID uUID = this.u.method_5667();
        try (class04495 class044952 = new class04495(this.u.method_71370(), y);){
            this.u.method_5651(class08308.N((class04490)class044952, (class01929)this.u.method_56673(), (class07001)class070012));
            this.u.method_5826(uUID);
            this.N(class070012, null);
        }
    }
}

