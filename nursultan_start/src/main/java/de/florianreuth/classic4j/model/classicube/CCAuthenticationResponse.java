/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.florianreuth.classic4j.ClassiCubeHandler
 *  de.florianreuth.classic4j.model.classicube.CCError
 *  java.lang.MatchException
 *  minecraft.class00392
 */
package de.florianreuth.classic4j.model.classicube;

import de.florianreuth.classic4j.ClassiCubeHandler;
import de.florianreuth.classic4j.model.classicube.CCError;
import java.util.Locale;
import java.util.Set;
import java.util.stream.Collectors;
import minecraft.class00392;

public final class CCAuthenticationResponse {
    public final String token;
    public final String username;
    public final boolean authenticated;
    public final Set<String> errors;

    public CCAuthenticationResponse(String string, String string2, boolean bl, Set<String> set) {
        this.token = string;
        this.username = string2;
        this.authenticated = bl;
        this.errors = set;
    }

    public Set<CCError> errors() {
        return this.errors.stream().map(string -> CCError.valueOf((String)string.toUpperCase(Locale.ROOT))).collect(Collectors.toSet());
    }

    public static CCAuthenticationResponse fromJson(String string) {
        return (CCAuthenticationResponse)ClassiCubeHandler.GSON.fromJson(string, CCAuthenticationResponse.class);
    }

    private String redirect$dbb000$viafabricplus$mapTranslations(CCError cCError) {
        return switch (cCError) {
            default -> throw new MatchException(null, null);
            case CCError.TOKEN -> class00392.L((String)"classic4j_library.viafabricplus.error.token").getString();
            case CCError.USERNAME -> class00392.L((String)"classic4j_library.viafabricplus.error.username").getString();
            case CCError.PASSWORD -> class00392.L((String)"classic4j_library.viafabricplus.error.password").getString();
            case CCError.VERIFICATION -> class00392.L((String)"classic4j_library.viafabricplus.error.verification").getString();
            case CCError.LOGIN_CODE -> class00392.L((String)"classic4j_library.viafabricplus.error.logincode").getString();
        };
    }

    public String getErrorDisplay() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : this.errors) {
            stringBuilder.append(this.redirect$dbb000$viafabricplus$mapTranslations(CCError.valueOf((String)string.toUpperCase()))).append("\n");
        }
        return stringBuilder.toString().trim();
    }

    public boolean mfaRequired() {
        return this.errors().stream().anyMatch(cCError -> cCError == CCError.LOGIN_CODE);
    }

    public boolean shouldError() {
        return !this.errors.isEmpty();
    }
}

