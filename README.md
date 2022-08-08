# Delightful

### Remove lighting from dd2vtt files

### Why?
The generated vtt files from DungeonDraft can contain far too many lights when
importing the map into Foundry, which can cause performance hits from all the 
dynamic lighting calculations. Because Foundry doesn't (currently) allow you to
mass select and deleting lights the way you can other elements, this tool 
strips the lighting out before you import.

### Usage
To run the tool, pass it the path to the dd2vtt file you want to convert, and
(optionally), the output filename to write to. If no output file is specified,
then `_delighted` will be added to the input filename before the file extension.

```
Usage: delightful options_list
Options: 
    --inputFile, -i -> Input file (always required) { String }
    --outputFile, -o -> Output file name { String }
    --help, -h -> Usage info 
```