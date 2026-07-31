import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static jdk.internal.org.objectweb.asm.Opcodes.ACC_FINAL;
import static jdk.internal.org.objectweb.asm.Opcodes.ACC_PRIVATE;
import static jdk.internal.org.objectweb.asm.Opcodes.ACC_PUBLIC;
import static jdk.internal.org.objectweb.asm.Opcodes.ACC_STATIC;
import static jdk.internal.org.objectweb.asm.Opcodes.ACC_SUPER;
import static jdk.internal.org.objectweb.asm.Opcodes.ACONST_NULL;
import static jdk.internal.org.objectweb.asm.Opcodes.ALOAD;
import static jdk.internal.org.objectweb.asm.Opcodes.ARETURN;
import static jdk.internal.org.objectweb.asm.Opcodes.ASTORE;
import static jdk.internal.org.objectweb.asm.Opcodes.DUP;
import static jdk.internal.org.objectweb.asm.Opcodes.GETSTATIC;
import static jdk.internal.org.objectweb.asm.Opcodes.H_INVOKESTATIC;
import static jdk.internal.org.objectweb.asm.Opcodes.ICONST_0;
import static jdk.internal.org.objectweb.asm.Opcodes.ICONST_1;
import static jdk.internal.org.objectweb.asm.Opcodes.IFNONNULL;
import static jdk.internal.org.objectweb.asm.Opcodes.IFNULL;
import static jdk.internal.org.objectweb.asm.Opcodes.ILOAD;
import static jdk.internal.org.objectweb.asm.Opcodes.INVOKEINTERFACE;
import static jdk.internal.org.objectweb.asm.Opcodes.INVOKESPECIAL;
import static jdk.internal.org.objectweb.asm.Opcodes.INVOKESTATIC;
import static jdk.internal.org.objectweb.asm.Opcodes.INVOKEVIRTUAL;
import static jdk.internal.org.objectweb.asm.Opcodes.IRETURN;
import static jdk.internal.org.objectweb.asm.Opcodes.NEW;
import static jdk.internal.org.objectweb.asm.Opcodes.PUTFIELD;
import static jdk.internal.org.objectweb.asm.Opcodes.PUTSTATIC;
import static jdk.internal.org.objectweb.asm.Opcodes.RETURN;
import static jdk.internal.org.objectweb.asm.Opcodes.V21;
import jdk.internal.org.objectweb.asm.ClassWriter;
import jdk.internal.org.objectweb.asm.Handle;
import jdk.internal.org.objectweb.asm.Label;
import jdk.internal.org.objectweb.asm.MethodVisitor;

public final class GenerateSocialBytecodeStubs {
    private static final String SOCIAL_AUTH_INTERNAL = "ru/destra/social/SocialAuthClient";
    private static final String OAUTH_INTERNAL = "ru/destra/social/OAuthTokenClient";
    private static final String SOCIAL_DISABLED = "ERROR:Social disabled";
    private static final String EMPTY_FRIENDS = "OK:FRIENDS:";
    private static final String EMPTY_REQUESTS = "OK:REQUESTS:";
    private static final String EMPTY_PARTY = "OK:PARTY:none";
    private static final String EMPTY_FRIEND_METADATA = "OK:FRIEND_METADATA:online=false;serverIp=Server;mcNick=Unknown";
    private static final String EMPTY_PARTY_METADATA = "OK:PARTY_MEMBER_METADATA:online=false;serverIp=Server;mcNick=Unknown";
    private static final String REDIRECT_URI = "http://127.0.0.1/";
    private static final Handle STRING_CONCAT = new Handle(
        H_INVOKESTATIC,
        "java/lang/invoke/StringConcatFactory",
        "makeConcatWithConstants",
        "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;",
        false
    );

    public static void main(String[] args) throws Exception {
        Path outputRoot = args.length == 0 ? Paths.get(".precompiled") : Paths.get(args[0]);
        writeClass(outputRoot, SOCIAL_AUTH_INTERNAL, buildSocialAuthClient());
        writeClass(outputRoot, OAUTH_INTERNAL, buildOAuthTokenClient());
    }

    private static byte[] buildSocialAuthClient() {
        ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
        writer.visit(
            V21,
            ACC_PUBLIC | ACC_SUPER,
            SOCIAL_AUTH_INTERNAL,
            null,
            "java/lang/Object",
            new String[]{"java/util/concurrent/ThreadFactory"}
        );
        writer.visitField(ACC_PUBLIC, "username", "Ljava/lang/String;", null, null).visitEnd();
        writer.visitField(ACC_PUBLIC, "currentServerIp", "Ljava/lang/String;", null, null).visitEnd();
        writer.visitField(ACC_PRIVATE, "eventListener", "Ljava/util/function/Consumer;", null, null).visitEnd();

        MethodVisitor mv = writer.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;I)V", null, null);
        mv.visitCode();
        mv.visitVarInsn(ALOAD, 0);
        mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitLdcInsn("");
        mv.visitFieldInsn(PUTFIELD, SOCIAL_AUTH_INTERNAL, "username", "Ljava/lang/String;");
        mv.visitVarInsn(ALOAD, 0);
        mv.visitLdcInsn("singleplayer");
        mv.visitFieldInsn(PUTFIELD, SOCIAL_AUTH_INTERNAL, "currentServerIp", "Ljava/lang/String;");
        mv.visitInsn(RETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();

        mv = writer.visitMethod(ACC_PUBLIC, "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;", null, null);
        mv.visitCode();
        mv.visitTypeInsn(NEW, "java/lang/Thread");
        mv.visitInsn(DUP);
        mv.visitVarInsn(ALOAD, 1);
        mv.visitLdcInsn("Destra-SocialAuthStub");
        mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Thread", "<init>", "(Ljava/lang/Runnable;Ljava/lang/String;)V", false);
        mv.visitVarInsn(ASTORE, 2);
        mv.visitVarInsn(ALOAD, 2);
        mv.visitInsn(ICONST_1);
        mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "setDaemon", "(Z)V", false);
        mv.visitVarInsn(ALOAD, 2);
        mv.visitInsn(ARETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();

        addInstanceStringMethod(writer, "acceptFriendRequest", "(Ljava/lang/String;)Ljava/lang/String;", SOCIAL_DISABLED);
        addInstanceVoidMethod(writer, "disconnect", "()V");
        addInstanceVoidMethod(writer, "pollEvents", "()V");
        addInstanceStringMethod(writer, "getFriendRequests", "()Ljava/lang/String;", EMPTY_REQUESTS);
        addInstanceStringMethod(writer, "declineFriendRequest", "(Ljava/lang/String;)Ljava/lang/String;", SOCIAL_DISABLED);
        addInstanceStringMethod(writer, "transferPartyLeader", "(Ljava/lang/String;)Ljava/lang/String;", SOCIAL_DISABLED);
        addInstanceStringMethod(writer, "\u041c", "(I)Ljava/lang/String;", SOCIAL_DISABLED);
        addInstanceStringMethod(writer, "disbandParty", "()Ljava/lang/String;", SOCIAL_DISABLED);
        addInstanceConsumerMethod(writer, "disbandPartyAsync", "(Ljava/util/function/Consumer;)V", 1, SOCIAL_DISABLED);
        addInstanceConsumerMethod(writer, "transferPartyLeaderAsync", "(Ljava/lang/String;Ljava/util/function/Consumer;)V", 2, SOCIAL_DISABLED);
        addChangeServerMethod(writer, "changeServerIp", "(Ljava/lang/String;)Ljava/lang/String;");
        addChangeServerAsyncMethod(writer);
        addInstanceStringMethod(writer, "leaveParty", "()Ljava/lang/String;", SOCIAL_DISABLED);
        addInstanceStringMethod(writer, "createParty", "()Ljava/lang/String;", SOCIAL_DISABLED);
        addInstanceStringMethod(writer, "getFriendList", "()Ljava/lang/String;", EMPTY_FRIENDS);
        addInstanceStringMethod(writer, "getFriendMetadata", "(Ljava/lang/String;)Ljava/lang/String;", EMPTY_FRIEND_METADATA);
        addConnectVoidMethod(writer, "\u0425", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V");
        addConnectBooleanMethod(writer, "\u0425", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Z");
        addInstanceVoidMethod(writer, "\u0425", "(IIIILjava/lang/String;)V");
        addInstanceStringMethod(writer, "\u0425", "(IIIILjava/lang/String;)Ljava/lang/String;", SOCIAL_DISABLED);
        addInstanceStringMethod(writer, "\u0425", "(IIILjava/lang/String;I)Ljava/lang/String;", SOCIAL_DISABLED);
        addInstanceVoidMethod(writer, "\u0425", "(IIILjava/lang/String;I)V");

        mv = writer.visitMethod(ACC_PUBLIC, "setEventListener", "(Ljava/util/function/Consumer;)V", null, null);
        mv.visitCode();
        mv.visitVarInsn(ALOAD, 0);
        mv.visitVarInsn(ALOAD, 1);
        mv.visitFieldInsn(PUTFIELD, SOCIAL_AUTH_INTERNAL, "eventListener", "Ljava/util/function/Consumer;");
        mv.visitInsn(RETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();

        addInstanceConsumerMethod(writer, "sendFriendRequestAsync", "(Ljava/lang/String;Ljava/util/function/Consumer;)V", 2, SOCIAL_DISABLED);
        addInstanceConsumerMethod(writer, "joinPartyAsync", "(ILjava/util/function/Consumer;)V", 2, SOCIAL_DISABLED);
        addInstanceStringMethod(writer, "removeFriend", "(Ljava/lang/String;)Ljava/lang/String;", SOCIAL_DISABLED);
        addInstanceConsumerMethod(writer, "inviteToPartyAsync", "(Ljava/lang/String;Ljava/util/function/Consumer;)V", 2, SOCIAL_DISABLED);
        addInstanceStringMethod(writer, "\u0439", "(I)Ljava/lang/String;", SOCIAL_DISABLED);
        addInstanceConsumerMethod(writer, "getPartyMemberMetadataAsync", "(Ljava/lang/String;Ljava/util/function/Consumer;)V", 2, EMPTY_PARTY_METADATA);
        addInstanceConsumerMethod(writer, "createPartyAsync", "(Ljava/util/function/Consumer;)V", 1, SOCIAL_DISABLED);
        addInstanceConsumerMethod(writer, "declinePartyInviteAsync", "(ILjava/util/function/Consumer;)V", 2, SOCIAL_DISABLED);
        addInstanceConsumerMethod(writer, "leavePartyAsync", "(Ljava/util/function/Consumer;)V", 1, SOCIAL_DISABLED);
        addInstanceConsumerMethod(writer, "removeFriendAsync", "(Ljava/lang/String;Ljava/util/function/Consumer;)V", 2, SOCIAL_DISABLED);
        addInstanceStringMethod(writer, "getPartyInfo", "()Ljava/lang/String;", EMPTY_PARTY);
        addInstanceConsumerMethod(writer, "transferPartyLeaderAsync2", "(Ljava/lang/String;Ljava/util/function/Consumer;)V", 2, SOCIAL_DISABLED);
        addInstanceStringMethod(writer, "sendFriendRequest", "(Ljava/lang/String;)Ljava/lang/String;", SOCIAL_DISABLED);
        addInstanceEmptyListMethod(writer, "drainEvents", "()Ljava/util/List;");
        addInstanceStringMethod(writer, "inviteToParty", "(Ljava/lang/String;)Ljava/lang/String;", SOCIAL_DISABLED);
        addInstanceStringMethod(writer, "kickFromParty", "(Ljava/lang/String;)Ljava/lang/String;", SOCIAL_DISABLED);
        addInstanceConsumerMethod(writer, "kickFromPartyAsync", "(Ljava/lang/String;Ljava/util/function/Consumer;)V", 2, SOCIAL_DISABLED);
        addInstanceBooleanMethod(writer, "isConnected", "()Z", false);
        addInstanceStringMethod(writer, "getPartyMemberMetadata", "(Ljava/lang/String;)Ljava/lang/String;", EMPTY_PARTY_METADATA);

        writer.visitEnd();
        return writer.toByteArray();
    }

    private static byte[] buildOAuthTokenClient() {
        ClassWriter writer = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
        writer.visit(V21, ACC_PUBLIC | ACC_SUPER, OAUTH_INTERNAL, null, "java/lang/Object", new String[]{"java/util/function/Predicate"});
        writer.visitField(ACC_PUBLIC | ACC_STATIC | ACC_FINAL, "sslContext", "Ljavax/net/ssl/SSLContext;", null, null).visitEnd();

        MethodVisitor mv = writer.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
        mv.visitCode();
        mv.visitInsn(ACONST_NULL);
        mv.visitFieldInsn(PUTSTATIC, OAUTH_INTERNAL, "sslContext", "Ljavax/net/ssl/SSLContext;");
        mv.visitInsn(RETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();

        mv = writer.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
        mv.visitCode();
        mv.visitVarInsn(ALOAD, 0);
        mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
        mv.visitInsn(RETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();

        addInstanceBooleanMethod(writer, "test", "(Ljava/lang/Object;)Z", false);
        addStaticStringMethod(writer, "\u0437", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "");
        addStaticStringMethod(writer, "\u0437", "(Ljava/lang/String;)Ljava/lang/String;", "");
        addStaticEntryMethod(writer, "\u0437", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map$Entry;");
        addStaticEntryMethod(writer, "\u0437", "(Ljava/lang/String;)Ljava/util/Map$Entry;");
        addOfflineUuidMethod(writer, "\u0437", "(Ljava/lang/String;)Ljava/util/UUID;");
        addStaticEntryMethod(writer, "\u0439", "(Ljava/lang/String;)Ljava/util/Map$Entry;");
        addStaticEntryMethod(writer, "\u0439", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map$Entry;");
        addStaticVoidMethod(writer, "initSslContext", "()V");
        addProfileMethod(writer);
        addStaticStringMethod(writer, "getRedirectUri", "()Ljava/lang/String;", REDIRECT_URI);
        addStaticEntryMethod(writer, "authXsts", "(Ljava/lang/String;)Ljava/util/Map$Entry;");

        writer.visitEnd();
        return writer.toByteArray();
    }

    private static void addConnectVoidMethod(ClassWriter writer, String name, String descriptor) {
        MethodVisitor mv = writer.visitMethod(ACC_PUBLIC, name, descriptor, null, null);
        mv.visitCode();
        mv.visitVarInsn(ALOAD, 0);
        mv.visitVarInsn(ALOAD, 1);
        mv.visitFieldInsn(PUTFIELD, SOCIAL_AUTH_INTERNAL, "username", "Ljava/lang/String;");
        mv.visitVarInsn(ALOAD, 0);
        mv.visitVarInsn(ALOAD, 4);
        Label serverDefined = new Label();
        mv.visitJumpInsn(IFNONNULL, serverDefined);
        mv.visitLdcInsn("singleplayer");
        mv.visitVarInsn(ASTORE, 4);
        mv.visitLabel(serverDefined);
        mv.visitVarInsn(ALOAD, 4);
        mv.visitFieldInsn(PUTFIELD, SOCIAL_AUTH_INTERNAL, "currentServerIp", "Ljava/lang/String;");
        mv.visitInsn(RETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    private static void addConnectBooleanMethod(ClassWriter writer, String name, String descriptor) {
        MethodVisitor mv = writer.visitMethod(ACC_PUBLIC, name, descriptor, null, null);
        mv.visitCode();
        mv.visitVarInsn(ALOAD, 0);
        mv.visitVarInsn(ALOAD, 1);
        mv.visitFieldInsn(PUTFIELD, SOCIAL_AUTH_INTERNAL, "username", "Ljava/lang/String;");
        mv.visitVarInsn(ALOAD, 0);
        mv.visitVarInsn(ALOAD, 4);
        Label serverDefined = new Label();
        mv.visitJumpInsn(IFNONNULL, serverDefined);
        mv.visitLdcInsn("singleplayer");
        mv.visitVarInsn(ASTORE, 4);
        mv.visitLabel(serverDefined);
        mv.visitVarInsn(ALOAD, 4);
        mv.visitFieldInsn(PUTFIELD, SOCIAL_AUTH_INTERNAL, "currentServerIp", "Ljava/lang/String;");
        mv.visitInsn(ICONST_0);
        mv.visitInsn(IRETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    private static void addChangeServerMethod(ClassWriter writer, String name, String descriptor) {
        MethodVisitor mv = writer.visitMethod(ACC_PUBLIC, name, descriptor, null, null);
        mv.visitCode();
        mv.visitVarInsn(ALOAD, 0);
        mv.visitVarInsn(ALOAD, 1);
        Label serverDefined = new Label();
        mv.visitJumpInsn(IFNONNULL, serverDefined);
        mv.visitLdcInsn("singleplayer");
        mv.visitVarInsn(ASTORE, 1);
        mv.visitLabel(serverDefined);
        mv.visitVarInsn(ALOAD, 1);
        mv.visitFieldInsn(PUTFIELD, SOCIAL_AUTH_INTERNAL, "currentServerIp", "Ljava/lang/String;");
        mv.visitLdcInsn(SOCIAL_DISABLED);
        mv.visitInsn(ARETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    private static void addChangeServerAsyncMethod(ClassWriter writer) {
        MethodVisitor mv = writer.visitMethod(ACC_PUBLIC, "changeServerIpAsync", "(Ljava/lang/String;)V", null, null);
        mv.visitCode();
        mv.visitVarInsn(ALOAD, 0);
        mv.visitVarInsn(ALOAD, 1);
        Label serverDefined = new Label();
        mv.visitJumpInsn(IFNONNULL, serverDefined);
        mv.visitLdcInsn("singleplayer");
        mv.visitVarInsn(ASTORE, 1);
        mv.visitLabel(serverDefined);
        mv.visitVarInsn(ALOAD, 1);
        mv.visitFieldInsn(PUTFIELD, SOCIAL_AUTH_INTERNAL, "currentServerIp", "Ljava/lang/String;");
        mv.visitInsn(RETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    private static void addOfflineUuidMethod(ClassWriter writer, String name, String descriptor) {
        MethodVisitor mv = writer.visitMethod(ACC_PUBLIC | ACC_STATIC, name, descriptor, null, null);
        mv.visitCode();
        mv.visitLdcInsn("OfflinePlayer:");
        mv.visitVarInsn(ALOAD, 0);
        Label valueDefined = new Label();
        mv.visitJumpInsn(IFNONNULL, valueDefined);
        mv.visitLdcInsn("offline");
        mv.visitVarInsn(ASTORE, 0);
        mv.visitLabel(valueDefined);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitInvokeDynamicInsn("makeConcatWithConstants", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", STRING_CONCAT, "\u0001\u0001");
        mv.visitFieldInsn(GETSTATIC, "java/nio/charset/StandardCharsets", "UTF_8", "Ljava/nio/charset/Charset;");
        mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "(Ljava/nio/charset/Charset;)[B", false);
        mv.visitMethodInsn(INVOKESTATIC, "java/util/UUID", "nameUUIDFromBytes", "([B)Ljava/util/UUID;", false);
        mv.visitInsn(ARETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    private static void addProfileMethod(ClassWriter writer) {
        MethodVisitor mv = writer.visitMethod(ACC_PUBLIC | ACC_STATIC, "getProfile", "(Ljava/lang/String;)Ljava/util/Map$Entry;", null, null);
        mv.visitCode();
        mv.visitVarInsn(ALOAD, 0);
        mv.visitMethodInsn(INVOKESTATIC, OAUTH_INTERNAL, "\u0437", "(Ljava/lang/String;)Ljava/util/UUID;", false);
        mv.visitVarInsn(ASTORE, 1);
        mv.visitVarInsn(ALOAD, 0);
        Label tokenDefined = new Label();
        mv.visitJumpInsn(IFNONNULL, tokenDefined);
        mv.visitLdcInsn("Offline");
        mv.visitVarInsn(ASTORE, 0);
        mv.visitLabel(tokenDefined);
        mv.visitVarInsn(ALOAD, 1);
        mv.visitVarInsn(ALOAD, 0);
        mv.visitMethodInsn(INVOKESTATIC, "java/util/Map", "entry", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;", true);
        mv.visitInsn(ARETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    private static void addStaticEntryMethod(ClassWriter writer, String name, String descriptor) {
        MethodVisitor mv = writer.visitMethod(ACC_PUBLIC | ACC_STATIC, name, descriptor, null, null);
        mv.visitCode();
        mv.visitLdcInsn("");
        mv.visitLdcInsn("");
        mv.visitMethodInsn(INVOKESTATIC, "java/util/Map", "entry", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;", true);
        mv.visitInsn(ARETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    private static void addInstanceConsumerMethod(ClassWriter writer, String name, String descriptor, int consumerSlot, String payload) {
        MethodVisitor mv = writer.visitMethod(ACC_PUBLIC, name, descriptor, null, null);
        mv.visitCode();
        mv.visitVarInsn(ALOAD, consumerSlot);
        Label done = new Label();
        mv.visitJumpInsn(IFNULL, done);
        mv.visitVarInsn(ALOAD, consumerSlot);
        mv.visitLdcInsn(payload);
        mv.visitMethodInsn(INVOKEINTERFACE, "java/util/function/Consumer", "accept", "(Ljava/lang/Object;)V", true);
        mv.visitLabel(done);
        mv.visitInsn(RETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    private static void addInstanceEmptyListMethod(ClassWriter writer, String name, String descriptor) {
        MethodVisitor mv = writer.visitMethod(ACC_PUBLIC, name, descriptor, null, null);
        mv.visitCode();
        mv.visitMethodInsn(INVOKESTATIC, "java/util/List", "of", "()Ljava/util/List;", true);
        mv.visitInsn(ARETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    private static void addInstanceBooleanMethod(ClassWriter writer, String name, String descriptor, boolean value) {
        MethodVisitor mv = writer.visitMethod(ACC_PUBLIC, name, descriptor, null, null);
        mv.visitCode();
        mv.visitInsn(value ? ICONST_1 : ICONST_0);
        mv.visitInsn(IRETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    private static void addInstanceVoidMethod(ClassWriter writer, String name, String descriptor) {
        MethodVisitor mv = writer.visitMethod(ACC_PUBLIC, name, descriptor, null, null);
        mv.visitCode();
        mv.visitInsn(RETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    private static void addStaticVoidMethod(ClassWriter writer, String name, String descriptor) {
        MethodVisitor mv = writer.visitMethod(ACC_PUBLIC | ACC_STATIC, name, descriptor, null, null);
        mv.visitCode();
        mv.visitInsn(RETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    private static void addInstanceStringMethod(ClassWriter writer, String name, String descriptor, String value) {
        MethodVisitor mv = writer.visitMethod(ACC_PUBLIC, name, descriptor, null, null);
        mv.visitCode();
        mv.visitLdcInsn(value);
        mv.visitInsn(ARETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    private static void addStaticStringMethod(ClassWriter writer, String name, String descriptor, String value) {
        MethodVisitor mv = writer.visitMethod(ACC_PUBLIC | ACC_STATIC, name, descriptor, null, null);
        mv.visitCode();
        mv.visitLdcInsn(value);
        mv.visitInsn(ARETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    private static void writeClass(Path outputRoot, String internalName, byte[] bytecode) throws IOException {
        Path target = outputRoot.resolve(internalName + ".class");
        Files.createDirectories(target.getParent());
        Files.write(target, bytecode);
    }
}
