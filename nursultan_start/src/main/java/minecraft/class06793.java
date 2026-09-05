/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType
 *  com.mojang.brigadier.exceptions.DynamicCommandExceptionType
 *  com.mojang.serialization.Decoder
 *  minecraft.class00392
 *  minecraft.class00836
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class02168
 *  minecraft.class02192
 *  minecraft.class02477
 *  minecraft.class03529
 *  minecraft.class04348
 *  minecraft.class06244
 *  minecraft.class06584
 *  minecraft.class07536
 *  minecraft.class07701
 *  minecraft.class08520
 */
package minecraft;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.serialization.Decoder;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00392;
import minecraft.class00836;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class02168;
import minecraft.class02192;
import minecraft.class02477;
import minecraft.class03529;
import minecraft.class04348;
import minecraft.class06244;
import minecraft.class06584;
import minecraft.class06764;
import minecraft.class06797;
import minecraft.class06803;
import minecraft.class06805;
import minecraft.class07536;
import minecraft.class07701;
import minecraft.class08520;

public class class06793
extends class08520<class06805> {
    private static final Collection<String> Z = Arrays.asList("stick", "minecraft:stick", "#stick", "#stick{foo:'bar'}");
    static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(object -> class00392.y((String)"argument.item.id.invalid", (Object[])new Object[]{object}));
    static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(object -> class00392.y((String)"arguments.item.tag.unknown", (Object[])new Object[]{object}));
    static final DynamicCommandExceptionType L = new DynamicCommandExceptionType(object -> class00392.y((String)"arguments.item.component.unknown", (Object[])new Object[]{object}));
    static final Dynamic2CommandExceptionType u = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"arguments.item.component.malformed", (Object[])new Object[]{object, object2}));
    static final DynamicCommandExceptionType i = new DynamicCommandExceptionType(object -> class00392.y((String)"arguments.item.predicate.unknown", (Object[])new Object[]{object}));
    static final Dynamic2CommandExceptionType R = new Dynamic2CommandExceptionType((object, object2) -> class00392.y((String)"arguments.item.predicate.malformed", (Object[])new Object[]{object, object2}));
    private static final class01894 z = class01894.y((String)"count");
    static final Map<class01894, class06797> M = Stream.of(new class06797(z, class065842 -> true, (Decoder<? extends Predicate<class06584>>)class00836.u.map(class008362 -> class065842 -> class008362.u(class065842.c())))).collect(Collectors.toUnmodifiableMap(class06797::N, class067972 -> class067972));
    static final Map<class01894, class06764> B = Stream.of(new class06764(z, (Decoder<? extends Predicate<class06584>>)class00836.u.map(class008362 -> class065842 -> class008362.u(class065842.c())))).collect(Collectors.toUnmodifiableMap(class06764::N, class067642 -> class067642));

    public class06793(class04348 class043482) {
        super(class02192.N((class02168)new class06803((class01929)class043482)).N((T list) -> class07536.N((List)list)::test));
    }

    public static class06805 N(CommandContext<class07701> commandContext, String string) {
        return (class06805)commandContext.getArgument(string, class06805.class);
    }

    public static class06793 N(class04348 class043482) {
        return new class06793(class043482);
    }

    public static class06764 N(class03529<class02477<?>> class035292) {
        Predicate<class06584> predicate = class065842 -> class065842.L((class02477)class035292.N());
        return new class06764(class035292.B().N(), (Decoder<? extends Predicate<class06584>>)class06244.field_51563.map(class062442 -> predicate));
    }

    public Collection<String> getExamples() {
        return Z;
    }
}

