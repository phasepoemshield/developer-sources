FOR ADDING TO AN EXISTING MODEL:
- Delete everything about the vanillaSkin in the script.lua and config.lua as well as "set classic/slim arms based on the player's model type". I recommend using ctrl+F to do it.
- Remember to copy the animations for the root and other 'vanilla' folders (LeftArm, RightArm, RightLeg, LeftLeg, Body) as they are animated in the various flight anims (elytra, hover & creative flight) and will make your avatar look jank if you don't.
- If anything is broken or you don't know how to do something, don't be afraid to come to the discord for help.

Guide for using the skins:
Go into the folder named skins (you'll see it when you download it).
Copy everything in the skin you want (not the folder, the png files).
Go into the textures folder in the main model.
Paste the files in the folder, replacing the old files.

Vanilla skin
Just as a note, this model uses your vanilla skin automatically. No need to bother with replacing the skin file.
If you want to use a skin that's different to your vanilla skin (the one in the the skin.png), go into the action wheel, then settings, then click the green dye saying 'Disable Vanilla Skin'. You need to reload your avatar for the changes to apply. You should also go into BlockBench and manually unhide the type of arms you want (slim or classic).

Guide for making skins
You can use emissive textures by editing the textures with an ___e__ at the end of it. Check the Figura Wiki on Emissive Textures (https://figura-wiki.pages.dev/tutorials/Emissive%20Textures) for how to use them. All alpha (transparency) values will be set to white unless you're using Iris, so make sure to save your file with a black background or your emissives will be broken.

Saving the file will instantly change the texture ingame. I recommend having your art program (or blockbench) open on one window, and Minecraft open on the other. That way you can see your changes in real time. Crouching is a good way to view the inner & outer parts of your textures (or spread wings, but I wouldn't recommend it for membranes since the extension is very far, which causes many membrane pixels that aren't seen in most animations to be visible).

Templates
Templates are very important. If you don't use them, you will most likely spend an embarassing amount of time figuring out where to draw things.
The templates are located in the templates folder. The leftMembrane and rightMembrane template have the exact same UV mappings, so you can just edit one and copy paste them without much hassle (unless you want to make directional membranes).
__wings.png__ is the texture for the wing ribs and both membrane.png's are the texture for the membrane in between the wing ribs.
(North is the direction your player is facing. Look at a player head on and you'll see North pixels.)
Blue = North
Green = East
Red = West
White = Up
Yellow = South
The shadows face your character and then downwards. I recommend taking a look at the layout ingame to see which pixels go where.

Tail
Pixel groups on the right are the tail segments. The two big white & black sheets are the fin at the end of your tail. The pixel groups on the left are the fins going down your tail.

Wings
The pixel groups on the right are the main wing (back arm, forearm, metacarpus). The pixel groups on the left are the ribs.
These directions are not absolute! The animations rotate the wings in many ways. In actuality, East or Up is the direction that you're probably going to see when looking head-on.
The two squares at the bottom are the wing spikes (at the top of the metacarpus).

Membranes
The membrane textures are arranged in pairs of two via multiple 8x8 cubes. Inner textures (the ones you'll see looking from the front or downwards) are the light blue (at the top) and outer textures (the ones you'll see looking from the back or upwards) are the yellow (at the bottom). 
The triangles and squares (aka the guides) correspond to the area of the texture you'll actually see ingame at common wing extensions. Anything beyond that won't be shown in most animations. **However**, you should always texture the non-visible parts, as they will be visible at high wing extensions, and possibly even more depending on what animations I might add.
The guides have 3 (sometimes 4) colours. These correspond to directions. Go into Minecraft and view the template membrane texture, you'll get the gist of it pretty fast.
Some membranes connect to other membranes. These will always be on the green side.
Green is, most of the time* (not in the case of membrane 3), the side facing furthest from the ribs, and the side where most erased pixels will be, since erasing pixels on the middle of the greens makes your wings look pretty.
Square guides are the big 3 membranes on the outermost edge of the wings. Triangle guides are the 3 membranes facing your player character, and the 3 membranes which connect the big membranes to the inner wing.
VERY IMPORTANT: If you're making a unique texture for the north and south, flipping it will reverse the textures (so that the south side is now north and the north is now south). This leads to your wings looking rather awkward. I don't have a fix for this, so you'll have to retexture it yourself while flipping.