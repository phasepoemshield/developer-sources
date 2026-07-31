$ecDir = '.precompiled\sg\ec'
$mapFile = 'tools_out\sg_ec_rename_map.txt'

$files = [System.IO.Directory]::GetFiles($ecDir, '*.class')
$map = @()
$counter = 0

foreach ($f in $files) {
    $name = [System.IO.Path]::GetFileName($f)
    $className = $name.Substring(0, $name.Length - 6)
    $isAscii = $true
    foreach ($ch in $className.ToCharArray()) {
        if ([int]$ch -gt 127) { $isAscii = $false; break }
    }
    if (-not $isAscii) {
        $newName = 'N' + $counter.ToString('D4')
        $newPath = [System.IO.Path]::Combine($ecDir, $newName + '.class')
        [System.IO.File]::Move($f, $newPath)
        $map += "$className=$newName"
        Write-Output "Renamed: $className -> $newName"
        $counter++
    }
}

[System.IO.File]::WriteAllLines($mapFile, $map, [System.Text.Encoding]::UTF8)
Write-Output "Total renamed: $counter"
Write-Output "Map written to: $mapFile"
