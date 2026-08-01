#!/usr/bin/env bash
# macOS launcher for the recovered 1.16.5 client (Windows run-client.ps1 equivalent).
#
# Apple Silicon note:
#   LWJGL 3.2.2 only ships x86_64 macOS natives. Under Rosetta that yields OpenGL 2.1
#   and a hung/unusable window. On arm64 we use native JDK 21 + LWJGL 3.3.3 arm64
#   natives (compatible enough for this runtime JAR).

set -euo pipefail

PROJECT_ROOT="$(cd "$(dirname "$0")" && pwd)"
RUN_DIR="$PROJECT_ROOT/run"
RESOURCES_DIR="$PROJECT_ROOT/src/main/resources"
JAR="$PROJECT_ROOT/libs/1_16_5_decrypted.jar"
RUNTIME_STUBS_JAR="$PROJECT_ROOT/libs/runtime-stubs.jar"
MACOS_HOTFIX_JAR="$PROJECT_ROOT/libs/runtime-macos-hotfix.jar"
VANILLA_PACK_HOTFIX_JAR="$PROJECT_ROOT/libs/runtime-vanilla-pack-hotfix.jar"
VANILLA_ASSETS_DIR="$RUN_DIR/vanilla-assets"

MC_DIR="${MINECRAFT_DIR:-$HOME/Library/Application Support/minecraft}"
LIBRARY_DIR="$MC_DIR/libraries"
ASSETS_DIR="$MC_DIR/assets"

ARCH="$(uname -m)"
if [[ "$ARCH" == "arm64" ]]; then
  LWJGL_VER="3.3.3"
  NATIVE_CLASSIFIER="natives-macos-arm64"
  NATIVES_DIR="$RUN_DIR/natives-macos-arm64"
else
  LWJGL_VER="3.2.2"
  NATIVE_CLASSIFIER="natives-macos"
  NATIVES_DIR="$RUN_DIR/natives-macos"
fi

# Prefer arm64 Corretto 21 on Apple Silicon; x86_64 Temurin only if forced.
if [[ -z "${JAVA_HOME:-}" ]]; then
  if [[ "$ARCH" == "arm64" && -d "$HOME/Library/Java/JavaVirtualMachines/corretto-21.0.10/Contents/Home" ]]; then
    JAVA_HOME="$HOME/Library/Java/JavaVirtualMachines/corretto-21.0.10/Contents/Home"
  elif [[ -d "/Library/Java/JavaVirtualMachines/temurin-21.jdk/Contents/Home" ]]; then
    JAVA_HOME="/Library/Java/JavaVirtualMachines/temurin-21.jdk/Contents/Home"
  elif command -v /usr/libexec/java_home >/dev/null 2>&1; then
    JAVA_HOME="$(/usr/libexec/java_home -v 21 2>/dev/null || true)"
  fi
fi

if [[ -z "${JAVA_HOME:-}" || ! -x "$JAVA_HOME/bin/java" ]]; then
  echo "Java 21 not found. Install JDK 21." >&2
  exit 1
fi

JAVA_BIN="$JAVA_HOME/bin/java"

if [[ ! -f "$JAR" ]]; then
  echo "Runtime jar not found: $JAR" >&2
  exit 1
fi

if [[ ! -d "$LIBRARY_DIR" ]]; then
  echo "Minecraft libraries folder not found: $LIBRARY_DIR" >&2
  exit 1
fi

mkdir -p "$RUN_DIR"/{config,logs,saves,resourcepacks,server-resource-packs,screenshots} \
         "$NATIVES_DIR" "$VANILLA_ASSETS_DIR"

resolve_lib() {
  local rel="$1"
  local path="$LIBRARY_DIR/$rel"
  if [[ -f "$path" ]]; then
    printf '%s' "$path"
    return 0
  fi
  echo "WARNING: library missing: $rel" >&2
  return 1
}

PREFERRED_LIBS=(
  "com/mojang/patchy/1.3.9/patchy-1.3.9.jar"
  "oshi-project/oshi-core/1.1/oshi-core-1.1.jar"
  "net/java/dev/jna/jna/4.4.0/jna-4.4.0.jar"
  "net/java/dev/jna/platform/3.4.0/platform-3.4.0.jar"
  "com/ibm/icu/icu4j/66.1/icu4j-66.1.jar"
  "com/mojang/javabridge/1.0.22/javabridge-1.0.22.jar"
  "net/sf/jopt-simple/jopt-simple/5.0.3/jopt-simple-5.0.3.jar"
  "io/netty/netty-all/4.1.25.Final/netty-all-4.1.25.Final.jar"
  "com/google/guava/guava/21.0/guava-21.0.jar"
  "org/apache/commons/commons-lang3/3.5/commons-lang3-3.5.jar"
  "commons-io/commons-io/2.5/commons-io-2.5.jar"
  "commons-codec/commons-codec/1.10/commons-codec-1.10.jar"
  "com/mojang/brigadier/1.0.17/brigadier-1.0.17.jar"
  "com/mojang/datafixerupper/4.0.26/datafixerupper-4.0.26.jar"
  "com/google/code/gson/gson/2.8.0/gson-2.8.0.jar"
  "com/mojang/authlib/2.1.28/authlib-2.1.28.jar"
  "org/apache/commons/commons-compress/1.8.1/commons-compress-1.8.1.jar"
  "org/apache/httpcomponents/httpclient/4.3.3/httpclient-4.3.3.jar"
  "commons-logging/commons-logging/1.1.3/commons-logging-1.1.3.jar"
  "org/apache/httpcomponents/httpcore/4.3.2/httpcore-4.3.2.jar"
  "it/unimi/dsi/fastutil/8.2.1/fastutil-8.2.1.jar"
  "org/apache/logging/log4j/log4j-api/2.8.1/log4j-api-2.8.1.jar"
  "org/apache/logging/log4j/log4j-core/2.8.1/log4j-core-2.8.1.jar"
  "org/lwjgl/lwjgl/${LWJGL_VER}/lwjgl-${LWJGL_VER}.jar"
  "org/lwjgl/lwjgl-glfw/${LWJGL_VER}/lwjgl-glfw-${LWJGL_VER}.jar"
  "org/lwjgl/lwjgl-jemalloc/${LWJGL_VER}/lwjgl-jemalloc-${LWJGL_VER}.jar"
  "org/lwjgl/lwjgl-openal/${LWJGL_VER}/lwjgl-openal-${LWJGL_VER}.jar"
  "org/lwjgl/lwjgl-opengl/${LWJGL_VER}/lwjgl-opengl-${LWJGL_VER}.jar"
  "org/lwjgl/lwjgl-stb/${LWJGL_VER}/lwjgl-stb-${LWJGL_VER}.jar"
  "org/lwjgl/lwjgl-tinyfd/${LWJGL_VER}/lwjgl-tinyfd-${LWJGL_VER}.jar"
  "org/joml/joml/1.10.5/joml-1.10.5.jar"
  "com/mojang/text2speech/1.11.3/text2speech-1.11.3.jar"
)

NATIVE_LIBS=(
  "org/lwjgl/lwjgl/${LWJGL_VER}/lwjgl-${LWJGL_VER}-${NATIVE_CLASSIFIER}.jar"
  "org/lwjgl/lwjgl-glfw/${LWJGL_VER}/lwjgl-glfw-${LWJGL_VER}-${NATIVE_CLASSIFIER}.jar"
  "org/lwjgl/lwjgl-jemalloc/${LWJGL_VER}/lwjgl-jemalloc-${LWJGL_VER}-${NATIVE_CLASSIFIER}.jar"
  "org/lwjgl/lwjgl-openal/${LWJGL_VER}/lwjgl-openal-${LWJGL_VER}-${NATIVE_CLASSIFIER}.jar"
  "org/lwjgl/lwjgl-opengl/${LWJGL_VER}/lwjgl-opengl-${LWJGL_VER}-${NATIVE_CLASSIFIER}.jar"
  "org/lwjgl/lwjgl-stb/${LWJGL_VER}/lwjgl-stb-${LWJGL_VER}-${NATIVE_CLASSIFIER}.jar"
  "org/lwjgl/lwjgl-tinyfd/${LWJGL_VER}/lwjgl-tinyfd-${LWJGL_VER}-${NATIVE_CLASSIFIER}.jar"
)

NATIVES_MARKER="$NATIVES_DIR/.natives-ready-${LWJGL_VER}-${NATIVE_CLASSIFIER}"
if [[ ! -f "$NATIVES_MARKER" || ! -f "$NATIVES_DIR/liblwjgl.dylib" ]]; then
  echo "Extracting LWJGL ${LWJGL_VER} ${NATIVE_CLASSIFIER} into $NATIVES_DIR ..."
  rm -rf "$NATIVES_DIR"
  mkdir -p "$NATIVES_DIR"
  for rel in "${NATIVE_LIBS[@]}"; do
    njar="$LIBRARY_DIR/$rel"
    if [[ -f "$njar" ]]; then
      unzip -qo "$njar" -d "$NATIVES_DIR"
    else
      echo "WARNING: natives jar missing: $rel" >&2
    fi
  done
  # LWJGL 3.3+ packs dylibs under macos[/arm64]/org/lwjgl/... — flatten for java.library.path
  find "$NATIVES_DIR" -type f \( -name '*.dylib' -o -name '*.jnilib' -o -name '*.so' -o -name '*.dll' \) \
    -exec mv -f {} "$NATIVES_DIR/" \;
  find "$NATIVES_DIR" -mindepth 1 -type d -exec rm -rf {} + 2>/dev/null || true
  touch "$NATIVES_MARKER"
fi

if [[ ! -f "$NATIVES_DIR/liblwjgl.dylib" ]]; then
  echo "FATAL: liblwjgl.dylib not found in $NATIVES_DIR" >&2
  exit 1
fi

LIBRARY_JARS=()
for rel in "${PREFERRED_LIBS[@]}"; do
  if path="$(resolve_lib "$rel")"; then
    LIBRARY_JARS+=("$path")
  fi
done

# Optional vanilla client jar (extra assets). NPE on jar: listing is handled by
# runtime-vanilla-pack-hotfix.jar — keep this jar so log4j/other resources stay available.
VANILLA_CLIENT_JAR=""
for candidate in \
  "$MC_DIR/versions/Fabric 1.16.5/Fabric 1.16.5.jar" \
  "$MC_DIR/versions/Forge 1.16.5/Forge 1.16.5.jar"; do
  if [[ -f "$candidate" ]]; then
    VANILLA_CLIENT_JAR="$candidate"
    break
  fi
done

if [[ ! -d "$ASSETS_DIR" ]]; then
  ASSETS_DIR="$PROJECT_ROOT/src/main/resources/assets"
fi

if [[ ! -f "$VANILLA_ASSETS_DIR/assets/minecraft/lang/en_us.json" ]]; then
  echo "WARNING: en_us.json missing under run/vanilla-assets — UI text may break." >&2
fi

if [[ "${1:-}" == "--prepare-only" ]]; then
  echo "Prepared run directory: $RUN_DIR"
  echo "Natives: $NATIVES_DIR ($(file -b "$NATIVES_DIR/liblwjgl.dylib" 2>/dev/null || true))"
  echo "LWJGL: $LWJGL_VER ($NATIVE_CLASSIFIER)"
  echo "Java: $JAVA_BIN ($("$JAVA_BIN" -version 2>&1 | head -1))"
  exit 0
fi

CP_PARTS=("$VANILLA_ASSETS_DIR" "$RESOURCES_DIR")
# Hotfixes first so they override classes inside 1_16_5_decrypted.jar.
# macOS: skip glfwSetWindowIcon / ignore GLFW 65548 (Cocoa has no window icons).
if [[ -f "$MACOS_HOTFIX_JAR" ]]; then
  CP_PARTS+=("$MACOS_HOTFIX_JAR")
fi
# Vanilla pack: null-safe jar FileSystem listing for datapack load.
if [[ -f "$VANILLA_PACK_HOTFIX_JAR" ]]; then
  CP_PARTS+=("$VANILLA_PACK_HOTFIX_JAR")
fi
if [[ -f "$RUNTIME_STUBS_JAR" ]]; then
  CP_PARTS+=("$RUNTIME_STUBS_JAR")
fi
CP_PARTS+=("$JAR")
if [[ -n "$VANILLA_CLIENT_JAR" ]]; then
  CP_PARTS+=("$VANILLA_CLIENT_JAR")
fi
CP_PARTS+=("${LIBRARY_JARS[@]}")

IFS=':'
CLASSPATH="${CP_PARTS[*]}"
unset IFS

export assetDirectory="$ASSETS_DIR"
LOG_FILE="$RUN_DIR/logs/launcher.log"

echo "Starting client..."
echo "  arch=$ARCH"
echo "  JAVA_HOME=$JAVA_HOME"
echo "  LWJGL=$LWJGL_VER ($NATIVE_CLASSIFIER)"
echo "  natives=$NATIVES_DIR"
echo "  workingDir=$RUN_DIR"
echo "  log=$LOG_FILE"
echo "  main=mcp.client.Start"

cd "$RUN_DIR"
set +e
# -XstartOnFirstThread is required for GLFW on macOS.
"$JAVA_BIN" \
  -Dfile.encoding=UTF-8 \
  -Djava.awt.headless=false \
  -Djava.library.path="$NATIVES_DIR" \
  -Dorg.lwjgl.librarypath="$NATIVES_DIR" \
  -XstartOnFirstThread \
  -noverify \
  -cp "$CLASSPATH" \
  mcp.client.Start \
  "$@" 2>&1 | tee "$LOG_FILE"
EXIT_CODE=${PIPESTATUS[0]}
set -e
echo "Client exited with code $EXIT_CODE (see $LOG_FILE and $RUN_DIR/logs/latest.log)"
exit "$EXIT_CODE"
