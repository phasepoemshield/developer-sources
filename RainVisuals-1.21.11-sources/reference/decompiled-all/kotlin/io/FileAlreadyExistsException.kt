package kotlin.io

import java.io.File

// $VF: Compiled from Exceptions.kt
public class FileAlreadyExistsException(file: File, other: File? = null, reason: String? = null) : FileSystemException(file, other, reason)
