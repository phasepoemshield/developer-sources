/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.yggdrasil.response.KeyPairResponse$KeyPair
 */
package com.viaversion.viafabricplus.features.networking.legacy_chat_signature;

import com.mojang.authlib.yggdrasil.response.KeyPairResponse;
import java.nio.ByteBuffer;

public record KeyPairResponse1_19_0(KeyPairResponse.KeyPair keyPair, ByteBuffer publicKeySignatureV2, ByteBuffer publicKeySignature, String expiresAt, String refreshedAfter) {
}

