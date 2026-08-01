$ecDir = '.precompiled\sg\ec'
$javaFile = 'tools\SgEcMap.java'

$files = [System.IO.Directory]::GetFiles($ecDir, '*.class')
$entries = @()
$counter = 0

foreach ($f in $files) {
    $name = [System.IO.Path]::GetFileName($f)
    $className = $name.Substring(0, $name.Length - 6)
    $isAscii = $true
    foreach ($ch in $className.ToCharArray()) {
        if ([int]$ch -gt 127) { $isAscii = $false; break }
    }
    if (-not $isAscii) {
        # Skip if already renamed (starts with N and 4 digits)
        if ($className -match '^N\d{4}$') { continue }
        $newName = 'N' + $counter.ToString('D4')
        $newPath = [System.IO.Path]::Combine($ecDir, $newName + '.class')
        if ([System.IO.File]::Exists($newPath)) {
            # Already renamed, just record map
        } else {
            [System.IO.File]::Move($f, $newPath)
        }
        # Escape for Java string - use Unicode escapes
        $escapedOld = ''
        foreach ($ch in $className.ToCharArray()) {
            $code = [int]$ch
            if ($code -gt 127) {
                $escapedOld += '\u' + $code.ToString('X4').ToLower()
            } else {
                $escapedOld += $ch
            }
        }
        $entries += '        put("' + $escapedOld + '", "' + $newName + '");'
        Write-Output "Mapped: $className -> $newName"
        $counter++
    }
}

$content = @"
import java.util.*;

public final class SgEcMap {
    public static final Map<String, String> MAP = new LinkedHashMap<>();
    static {
$($entries -join "`n")
    }
}
"@

[System.IO.File]::WriteAllText($javaFile, $content, [System.Text.Encoding]::UTF8)
Write-Output "Total: $counter entries"
Write-Output "Written to: $javaFile"
