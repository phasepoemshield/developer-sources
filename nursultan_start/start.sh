#!/usr/bin/env bash
set -e

DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
cd "$DIR"

USERNAME_MC="${1:-soezproject}"

# Locate Java 21+
JAVA_BIN=""
if [ -x "/opt/homebrew/opt/openjdk@21/bin/java" ]; then
    JAVA_BIN="/opt/homebrew/opt/openjdk@21/bin/java"
elif command -v /usr/libexec/java_home >/dev/null 2>&1 && /usr/libexec/java_home -v 21 >/dev/null 2>&1; then
    JAVA_BIN="$(/usr/libexec/java_home -v 21)/bin/java"
elif command -v java >/dev/null 2>&1; then
    JAVA_BIN="$(command -v java)"
else
    echo "Error: Java 21 not found. Please install via: brew install openjdk@21"
    exit 1
fi

mkdir -p game logs

# Curated classpath for macOS
CP="NursultanClient.jar"
CP="$CP:libraries/at/yawk/lz4/lz4-java/1.8.1/lz4-java-1.8.1.jar"
CP="$CP:libraries/com/azure/azure-json/1.4.0/azure-json-1.4.0.jar"
CP="$CP:libraries/com/github/oshi/oshi-core/6.9.0/oshi-core-6.9.0.jar"
CP="$CP:libraries/com/google/code/gson/gson/2.13.2/gson-2.13.2.jar"
CP="$CP:libraries/com/google/guava/failureaccess/1.0.3/failureaccess-1.0.3.jar"
CP="$CP:libraries/com/google/guava/guava/33.5.0-jre/guava-33.5.0-jre.jar"
CP="$CP:libraries/com/ibm/icu/icu4j/77.1/icu4j-77.1.jar"
CP="$CP:libraries/com/microsoft/azure/msal4j/1.23.1/msal4j-1.23.1.jar"
CP="$CP:libraries/com/mojang/authlib/7.0.61/authlib-7.0.61.jar"
CP="$CP:libraries/com/mojang/blocklist/1.0.10/blocklist-1.0.10.jar"
CP="$CP:libraries/com/mojang/brigadier/1.3.10/brigadier-1.3.10.jar"
CP="$CP:libraries/com/mojang/datafixerupper/9.0.19/datafixerupper-9.0.19.jar"
CP="$CP:libraries/com/mojang/jtracy/1.0.37/jtracy-1.0.37.jar"
CP="$CP:libraries/com/mojang/logging/1.6.11/logging-1.6.11.jar"
CP="$CP:libraries/com/mojang/patchy/2.2.10/patchy-2.2.10.jar"
CP="$CP:libraries/com/mojang/text2speech/1.18.11/text2speech-1.18.11.jar"
CP="$CP:libraries/commons-codec/commons-codec/1.19.0/commons-codec-1.19.0.jar"
CP="$CP:libraries/commons-io/commons-io/2.20.0/commons-io-2.20.0.jar"
CP="$CP:libraries/io/netty/netty-buffer/4.2.7.Final/netty-buffer-4.2.7.Final.jar"
CP="$CP:libraries/io/netty/netty-codec-base/4.2.7.Final/netty-codec-base-4.2.7.Final.jar"
CP="$CP:libraries/io/netty/netty-codec-compression/4.2.7.Final/netty-codec-compression-4.2.7.Final.jar"
CP="$CP:libraries/io/netty/netty-codec-http/4.2.7.Final/netty-codec-http-4.2.7.Final.jar"
CP="$CP:libraries/io/netty/netty-common/4.2.7.Final/netty-common-4.2.7.Final.jar"
CP="$CP:libraries/io/netty/netty-handler/4.2.7.Final/netty-handler-4.2.7.Final.jar"
CP="$CP:libraries/io/netty/netty-resolver/4.2.7.Final/netty-resolver-4.2.7.Final.jar"
CP="$CP:libraries/io/netty/netty-transport/4.2.7.Final/netty-transport-4.2.7.Final.jar"
CP="$CP:libraries/io/netty/netty-transport-classes-epoll/4.2.7.Final/netty-transport-classes-epoll-4.2.7.Final.jar"
CP="$CP:libraries/io/netty/netty-transport-classes-kqueue/4.2.7.Final/netty-transport-classes-kqueue-4.2.7.Final.jar"
CP="$CP:libraries/io/netty/netty-transport-native-unix-common/4.2.7.Final/netty-transport-native-unix-common-4.2.7.Final.jar"
CP="$CP:libraries/it/unimi/dsi/fastutil/8.5.18/fastutil-8.5.18.jar"
CP="$CP:libraries/net/fabricmc/fabric-loader/0.19.3/fabric-loader-0.19.3.jar"
CP="$CP:libraries/net/fabricmc/intermediary/1.21.11/intermediary-1.21.11.jar"
CP="$CP:libraries/net/fabricmc/sponge-mixin/0.17.3+mixin.0.8.7/sponge-mixin-0.17.3+mixin.0.8.7.jar"
CP="$CP:libraries/net/java/dev/jna/jna/5.17.0/jna-5.17.0.jar"
CP="$CP:libraries/net/java/dev/jna/jna-platform/5.17.0/jna-platform-5.17.0.jar"
CP="$CP:libraries/net/sf/jopt-simple/jopt-simple/5.0.4/jopt-simple-5.0.4.jar"
CP="$CP:libraries/org/apache/commons/commons-compress/1.28.0/commons-compress-1.28.0.jar"
CP="$CP:libraries/org/apache/commons/commons-lang3/3.19.0/commons-lang3-3.19.0.jar"
CP="$CP:libraries/org/apache/logging/log4j/log4j-api/2.25.2/log4j-api-2.25.2.jar"
CP="$CP:libraries/org/apache/logging/log4j/log4j-core/2.25.2/log4j-core-2.25.2.jar"
CP="$CP:libraries/org/apache/logging/log4j/log4j-slf4j2-impl/2.25.2/log4j-slf4j2-impl-2.25.2.jar"
CP="$CP:libraries/org/jcraft/jorbis/0.0.17/jorbis-0.0.17.jar"
CP="$CP:libraries/org/joml/joml/1.10.8/joml-1.10.8.jar"
CP="$CP:libraries/org/jspecify/jspecify/1.0.0/jspecify-1.0.0.jar"
CP="$CP:libraries/org/lwjgl/lwjgl/3.3.3/lwjgl-3.3.3.jar"
CP="$CP:libraries/org/lwjgl/lwjgl-freetype/3.3.3/lwjgl-freetype-3.3.3.jar"
CP="$CP:libraries/org/lwjgl/lwjgl-glfw/3.3.3/lwjgl-glfw-3.3.3.jar"
CP="$CP:libraries/org/lwjgl/lwjgl-jemalloc/3.3.3/lwjgl-jemalloc-3.3.3.jar"
CP="$CP:libraries/org/lwjgl/lwjgl-openal/3.3.3/lwjgl-openal-3.3.3.jar"
CP="$CP:libraries/org/lwjgl/lwjgl-opengl/3.3.3/lwjgl-opengl-3.3.3.jar"
CP="$CP:libraries/org/lwjgl/lwjgl-stb/3.3.3/lwjgl-stb-3.3.3.jar"
CP="$CP:libraries/org/lwjgl/lwjgl-tinyfd/3.3.3/lwjgl-tinyfd-3.3.3.jar"
CP="$CP:libraries/org/ow2/asm/asm/9.10.1/asm-9.10.1.jar"
CP="$CP:libraries/org/ow2/asm/asm-analysis/9.10.1/asm-analysis-9.10.1.jar"
CP="$CP:libraries/org/ow2/asm/asm-commons/9.10.1/asm-commons-9.10.1.jar"
CP="$CP:libraries/org/ow2/asm/asm-tree/9.10.1/asm-tree-9.10.1.jar"
CP="$CP:libraries/org/ow2/asm/asm-util/9.10.1/asm-util-9.10.1.jar"
CP="$CP:libraries/org/slf4j/slf4j-api/2.0.17/slf4j-api-2.0.17.jar"
CP="$CP:libraries/ru/legacylauncher/fabric-loader-l10n/1.0/fabric-loader-l10n-1.0.jar"
CP="$CP:libraries/via/MinecraftAuth-5.0.1.jar"
CP="$CP:libraries/via/Reflect-1.6.2.jar"
CP="$CP:libraries/via/ViaBedrock-0.0.27-SNAPSHOT.jar"
CP="$CP:libraries/via/ViaLegacy-3.0.16.jar"
CP="$CP:libraries/via/classic4j-2.3.0.jar"
CP="$CP:libraries/via/dialog-5-3.2.2-20251210.004302-1.jar"
CP="$CP:libraries/via/forms-2.0.1.jar"
CP="$CP:libraries/via/httpclient-1.9.2.jar"
CP="$CP:libraries/via/jjwt-api-0.13.0.jar"
CP="$CP:libraries/via/jjwt-gson-0.13.0.jar"
CP="$CP:libraries/via/jjwt-impl-0.13.0.jar"
CP="$CP:libraries/via/mc_biome-1.171.1.jar"
CP="$CP:libraries/via/mc_core-1.210.0.jar"
CP="$CP:libraries/via/netty-transport-nethernet-1.7.0.jar"
CP="$CP:libraries/via/netty-transport-raknet-1.7.0.jar"
CP="$CP:libraries/via/semver4j-3.1.0.jar"
CP="$CP:libraries/via/text-2.0.1.jar"
CP="$CP:libraries/via/viaaprilfools-common-4.2.3-SNAPSHOT.jar"
CP="$CP:libraries/via/viabackwards-common-5.9.1.jar"
CP="$CP:libraries/via/viaversion-common-5.9.2-exact.jar"
CP="$CP:libraries/via/webrtc-java-1.0.3.jar"
CP="$CP:libraries/org/lwjgl/lwjgl-msdfgen/3.4.3/lwjgl-msdfgen-3.4.3.jar"
CP="$CP:libraries/org/locationtech/jts/jts-core/1.20.0/jts-core-1.20.0.jar"
CP="$CP:libraries/quilt/org_quiltmc_parsers_json-0.2.1.jar"
CP="$CP:libraries/quilt/org_quiltmc_parsers_gson-0.2.1.jar"
# macOS additions
CP="$CP:libraries/ca/weblite/java-objc-bridge/1.1/java-objc-bridge-1.1.jar"
CP="$CP:libraries/org/lwjgl/lwjgl/3.3.3/lwjgl-3.3.3-natives-macos-arm64.jar"
CP="$CP:libraries/org/lwjgl/lwjgl-freetype/3.3.3/lwjgl-freetype-3.3.3-natives-macos-arm64.jar"
CP="$CP:libraries/org/lwjgl/lwjgl-glfw/3.3.3/lwjgl-glfw-3.3.3-natives-macos-arm64.jar"
CP="$CP:libraries/org/lwjgl/lwjgl-jemalloc/3.3.3/lwjgl-jemalloc-3.3.3-natives-macos-arm64.jar"
CP="$CP:libraries/org/lwjgl/lwjgl-openal/3.3.3/lwjgl-openal-3.3.3-natives-macos-arm64.jar"
CP="$CP:libraries/org/lwjgl/lwjgl-opengl/3.3.3/lwjgl-opengl-3.3.3-natives-macos-arm64.jar"
CP="$CP:libraries/org/lwjgl/lwjgl-stb/3.3.3/lwjgl-stb-3.3.3-natives-macos-arm64.jar"
CP="$CP:libraries/org/lwjgl/lwjgl-tinyfd/3.3.3/lwjgl-tinyfd-3.3.3-natives-macos-arm64.jar"
CP="$CP:libraries/org/lwjgl/lwjgl-msdfgen/3.4.3/lwjgl-msdfgen-3.4.3-natives-macos-arm64.jar"
CP="$CP:libraries/com/mojang/jtracy/1.0.37/jtracy-1.0.37-natives-macos-arm64.jar"
CP="$CP:libraries/com/github/luben/zstd-jni/1.5.7-7/zstd-jni-1.5.7-7.jar"

exec "$JAVA_BIN" \
  -Xmx4G \
  -Xss2M \
  -XstartOnFirstThread \
  -XX:+UnlockExperimentalVMOptions \
  -XX:+UseG1GC \
  -Djava.library.path=natives_macos \
  -Djna.tmpdir=natives_macos \
  -Dorg.lwjgl.system.SharedLibraryExtractPath=natives_macos \
  -Dio.netty.native.workdir=natives_macos \
  -Dminecraft.launcher.brand=nursultan \
  -Dminecraft.launcher.version=1.0 \
  -DFabricMcEmu=net.minecraft.client.main.Main \
  -Dfabric.development=false \
  -Dmixin.env.remapRefMap=false \
  -Duser.language=en \
  -Dfile.encoding=UTF-8 \
  -cp "$CP" \
  Main \
  --username "$USERNAME_MC" \
  --version 1.21.11 \
  --gameDir game \
  --assetsDir assets \
  --assetIndex 29 \
  --uuid 00000000000030008000000000000000 \
  --accessToken 0 \
  --clientId 0 \
  --xuid 0 \
  --userType legacy \
  --versionType release \
  --width 1280 \
  --height 720 \
  --login "t.me/soezproject" \
  --uid 1 \
  --subscribeTimeLeft 999999999 \
  --role premium \
  --hash 0 \
  --apiToken 0 \
  --boughtProducts premium \
  --avatar none "$@"
