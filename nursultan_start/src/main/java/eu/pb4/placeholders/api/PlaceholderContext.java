/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  minecraft.class00392
 *  minecraft.class02796
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07109
 *  minecraft.class07701
 *  minecraft.class07703
 *  minecraft.class08774
 */
package eu.pb4.placeholders.api;

import com.mojang.authlib.GameProfile;
import eu.pb4.placeholders.api.ParserContext;
import eu.pb4.placeholders.api.ParserContext$Key;
import eu.pb4.placeholders.api.PlaceholderContext$ViewObject;
import java.util.function.Supplier;
import minecraft.class00392;
import minecraft.class02796;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07109;
import minecraft.class07701;
import minecraft.class07703;
import minecraft.class08774;

public record PlaceholderContext(class02796 server, Supplier<class07701> lazySource, class04782 world, class04770 player, class07049 entity, GameProfile gameProfile, PlaceholderContext$ViewObject view) {
    public static ParserContext$Key<PlaceholderContext> KEY = new ParserContext$Key<PlaceholderContext>("placeholder_context", PlaceholderContext.class);

    public boolean hasEntity() {
        return this.entity != null;
    }

    public PlaceholderContext(class02796 class027962, class07701 class077012, class04782 class047822, class04770 class047702, class07049 class070492, GameProfile gameProfile, PlaceholderContext$ViewObject placeholderContext$ViewObject) {
        this(class027962, () -> class077012, class047822, class047702, class070492, gameProfile, placeholderContext$ViewObject);
    }

    public PlaceholderContext(class02796 class027962, class07701 class077012, class04782 class047822, class04770 class047702, class07049 class070492, GameProfile gameProfile) {
        this(class027962, class077012, class047822, class047702, class070492, gameProfile, PlaceholderContext$ViewObject.DEFAULT);
    }

    public static PlaceholderContext of(class04770 class047702, PlaceholderContext$ViewObject placeholderContext$ViewObject) {
        return new PlaceholderContext(class047702.method_51469().method_8503(), () -> ((class04770)class047702).method_64396(), class047702.method_51469(), class047702, (class07049)class047702, class047702.method_7334(), placeholderContext$ViewObject);
    }

    public static PlaceholderContext of(class04770 class047702) {
        return PlaceholderContext.of(class047702, PlaceholderContext$ViewObject.DEFAULT);
    }

    public static PlaceholderContext of(GameProfile gameProfile, class02796 class027962, PlaceholderContext$ViewObject placeholderContext$ViewObject) {
        String string = gameProfile.name() != null ? gameProfile.name() : gameProfile.id().toString();
        return new PlaceholderContext(class027962, () -> new class07701(class07703.j_, class06889.L, class07109.N, class027962.NY(), class027962.method_3835(new class08774(gameProfile)), string, (class00392)class00392.y((String)string), class027962, null), null, null, null, gameProfile, placeholderContext$ViewObject);
    }

    public static PlaceholderContext of(class07701 class077012, PlaceholderContext$ViewObject placeholderContext$ViewObject) {
        return new PlaceholderContext(class077012.W(), class077012, class077012.R(), class077012.z(), class077012.M(), class077012.z() != null ? class077012.z().method_7334() : null, placeholderContext$ViewObject);
    }

    public static PlaceholderContext of(class07049 class070492) {
        return PlaceholderContext.of(class070492, PlaceholderContext$ViewObject.DEFAULT);
    }

    public static PlaceholderContext of(class07701 class077012) {
        return PlaceholderContext.of(class077012, PlaceholderContext$ViewObject.DEFAULT);
    }

    public static PlaceholderContext of(class07049 class070492, PlaceholderContext$ViewObject placeholderContext$ViewObject) {
        if (class070492 instanceof class04770) {
            class04770 class047702 = (class04770)class070492;
            return PlaceholderContext.of(class047702, placeholderContext$ViewObject);
        }
        class04782 class047822 = (class04782)class070492.method_73183();
        return new PlaceholderContext(class047822.method_8503(), () -> class070492.method_5671(class047822), class047822, null, class070492, null, placeholderContext$ViewObject);
    }

    public static PlaceholderContext of(class02796 class027962) {
        return PlaceholderContext.of(class027962, PlaceholderContext$ViewObject.DEFAULT);
    }

    public static PlaceholderContext of(GameProfile gameProfile, class02796 class027962) {
        return PlaceholderContext.of(gameProfile, class027962, PlaceholderContext$ViewObject.DEFAULT);
    }

    public static PlaceholderContext of(class02796 class027962, PlaceholderContext$ViewObject placeholderContext$ViewObject) {
        return new PlaceholderContext(class027962, () -> ((class02796)class027962).yu(), null, null, null, null, placeholderContext$ViewObject);
    }

    public class07701 source() {
        return this.lazySource.get();
    }

    public boolean hasPlayer() {
        return this.player != null;
    }

    public boolean hasWorld() {
        return this.world != null;
    }

    public PlaceholderContext withView(PlaceholderContext$ViewObject placeholderContext$ViewObject) {
        return new PlaceholderContext(this.server, this.lazySource, this.world, this.player, this.entity, this.gameProfile, placeholderContext$ViewObject);
    }

    public void addToContext(ParserContext parserContext) {
        parserContext.with(KEY, this);
        parserContext.with(ParserContext$Key.WRAPPER_LOOKUP, this.server.yt());
    }

    public boolean hasGameProfile() {
        return this.gameProfile != null;
    }

    public ParserContext asParserContext() {
        return ParserContext.of(KEY, this).with(ParserContext$Key.WRAPPER_LOOKUP, this.server.yt());
    }
}

