/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class00751
 *  minecraft.class01042
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03556
 *  minecraft.class04116
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class04475
 *  minecraft.class05946
 *  minecraft.class07049
 *  minecraft.class07701
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00392;
import minecraft.class00649;
import minecraft.class00751;
import minecraft.class01042;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03556;
import minecraft.class04116;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class04475;
import minecraft.class05946;
import minecraft.class07049;
import minecraft.class07701;

public final class class00629
extends Record {
    private final class04475 chat;
    private final class04475 narration;
    public static final Codec<class00629> N = RecordCodecBuilder.create(instance -> instance.group((App)((Codec)class04475.u_0).fieldOf("chat").forGetter(class00629::N), (App)((Codec)class04475.u_0).fieldOf("narration").forGetter(class00629::y)).apply(instance, class00629::new));
    public static final class02362<class04247, class00629> y = class02362.N((class02362)class02389.s, class00629::N, (class02362)class02389.s, class00629::y, class00629::new);
    public static final class02362<class04247, class03556<class00629>> L = class02389.N((class05946)class04227.NC, y);
    public static final class04475 u = class04475.L((String)"chat.type.text");
    public static final class05946<class00629> i = class00629.N("chat");
    public static final class05946<class00629> R = class00629.N("say_command");
    public static final class05946<class00629> M = class00629.N("msg_command_incoming");
    public static final class05946<class00629> B = class00629.N("msg_command_outgoing");
    public static final class05946<class00629> Z = class00629.N("team_msg_command_incoming");
    public static final class05946<class00629> z = class00629.N("team_msg_command_outgoing");
    public static final class05946<class00629> U = class00629.N("emote_command");

    public class00629(class04475 class044752, class04475 class044753) {
        this.chat = class044752;
        this.narration = class044753;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00629.class, "chat;narration", "chat", "narration"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00629.class, "chat;narration", "chat", "narration"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00629.class, "chat;narration", "chat", "narration"}, this);
    }

    public class04475 y() {
        return this.narration;
    }

    public class04475 N() {
        return this.chat;
    }

    public static void N(class04116<class00629> class041162) {
        class041162.N(i, (Object)new class00629(u, class04475.y((String)"chat.type.text.narrate")));
        class041162.N(R, (Object)new class00629(class04475.y((String)"chat.type.announcement"), class04475.y((String)"chat.type.text.narrate")));
        class041162.N(M, (Object)new class00629(class04475.N((String)"commands.message.display.incoming"), class04475.y((String)"chat.type.text.narrate")));
        class041162.N(B, (Object)new class00629(class04475.u((String)"commands.message.display.outgoing"), class04475.y((String)"chat.type.text.narrate")));
        class041162.N(Z, (Object)new class00629(class04475.L((String)"chat.type.team.text"), class04475.y((String)"chat.type.text.narrate")));
        class041162.N(z, (Object)new class00629(class04475.L((String)"chat.type.team.sent"), class04475.y((String)"chat.type.text.narrate")));
        class041162.N(U, (Object)new class00629(class04475.y((String)"chat.type.emote"), class04475.y((String)"chat.type.emote")));
    }

    public static class00649 N(class05946<class00629> class059462, class01042 class010422, class00392 class003922) {
        class00751 class007512 = class010422.L(class04227.NC);
        return new class00649((class03556<class00629>)class007512.y(class059462), class003922);
    }

    private static class05946<class00629> N(String string) {
        return class05946.N((class05946)class04227.NC, (class01894)class01894.y((String)string));
    }

    public static class00649 N(class05946<class00629> class059462, class07701 class077012) {
        return class00629.N(class059462, class077012.t(), class077012.L());
    }

    public static class00649 N(class05946<class00629> class059462, class07049 class070492) {
        return class00629.N(class059462, class070492.method_73183().method_30349(), class070492.method_5476());
    }
}

