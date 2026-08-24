package kotlin.io

import java.io.File

// $VF: Compiled from Utils.kt
private class TerminateException(file: File) : FileSystemException(file, null, null, 6)
