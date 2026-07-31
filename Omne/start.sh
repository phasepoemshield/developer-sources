#!/bin/bash
# macOS Startup Script for Excellent Client

# Ensure we are in the script's directory
cd "$(dirname "$0")"

# Check if java is installed
if ! command -v java &> /dev/null; then
    echo "Java is not installed. Please install OpenJDK 17 or higher to run this client."
    exit 1
fi

# Launch client with macOS modifications:
# 1. -XstartOnFirstThread for GLFW Cocoa support.
# 2. Prepending patch_classes for the Cocoa icon override.
# 3. Prepending . to class path to load corrected GLSL shaders.
java -XstartOnFirstThread -noverify -cp "patch_classes:.:out.jar:libraries/*" start/Start
