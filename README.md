# Minecraft-mod-FishCraft
A Repository for the mod I am working on. - uploaded is the core code, this does NOT contain any forge workspace or eclipse owned matterial to avoid copyright so if downloaded some of the imports for forge code may not work.

10/12/2018
So today I decided to attempt creating a Minecraft mod. I grew up playing Minecraft (modded especially) and I always dreamt of one day someone downloading something that I coded and using it in their pack with their friends and enjoying it as much as I enjoyed other people’s mods. As Minecraft Used Java I thought this would also be an excellent way to not only practice coding what I already know but also give me a chance to mess about with different code and put it into practice with tasks that I set myself. As I am very new to java but also coding as a whole and creating a mod for an already existing game (as opposed to the coding very basic games consisting of texted based outputs and sometimes less than 100 lines of code on NetBeans.) I decided to look for a tutorial to aid me whilst I may rely on this heavily to start off with, my aim is to be able to fabricate my own items, entities, blocks, etcetera by the end of this tutorial if not part way though. I found this tutorial online: https://www.youtube.com/playlist?list=PLDhiRTZ_vnoX4bx_BJccGV7MjpXUfVJSn
Written by:
https://www.youtube.com/channel/UC3n-lKS-MYlunVtErgzSFZg
I followed the first two videos in this guide and got set up with my basic workspace and core mod code. In this tutorial the author also used eclipse which was a coding engine I have never used before and in the past I have found that using different programs can often have a positive effect on my work as they often do different things in a way which I prefer.

17/12/2018
Today I followed the first part of video tutorial 3 and made my first item a Gold Coin, it doesn’t have a crafting recipe yet or any means of obtaining it other than through spawning either by give commands or my finding it under the miscellaneous tab in the creative menu in Minecraft. I used Piskel to create my sprite, (link to Piskel home page: https://www.piskelapp.com/ ) I like to use Piskel as not only is it free but it has some great features as well as tools such as: A powerful and well-designed desktop app and online editor so you can create and edit spites if you’re not on your home computer, a wide variety of tools such as Darkening and dithering, a nicely layout and probably my favorite feature a tone of keyboard shortcuts. (I really like to keep my mouse in the same place and edit what tool I’m using or the color that I’m using to draw.) If you’re not the biggest fan of Piskel then another free program I would recommend is Gimp 2. I am pleased with the sprite I have created at the moment as it looks clean however it might be difficult to keep the coherent design throughout my different coins as the numbers will be different and might not fit so a texture rework might be in order later. I decided to use my own color scheme for the coin instead of lifting colors from already existing textures (for example a gold ingot) and whilst it might make my coin stand out from the Vanilla textures I prefer this as it gives my mod a unique and original feel. I ran my code this week and found that whilst my item was generated perfectly fine it name is currently “gold_coin” which doesn’t look very nice so I will have to fix that at some point.

Change log:
-	Added Gold Coin.

14/01/2019
First of all a happy new year to everyone reading this, I know there has been a large gap in the blog and it has simply been down to the Christmas period and a busy first week back at college. This week I set out to firstly tidy up my first item (Gold Coin) I found the error which was causing my coin to read “gold_coin” in game and the simple fix was to go into my LANG file and change the line of 
item.gold_coin.name=gold_coin
to
item.gold_coin.name=Gold Coin
The next thing I wanted to accomplish this week was take a break from the video tutorials and get back into the swing of things by adding two more coins of a lower tier. This was surprisingly easy as I already had most of the mother code created it was just a simple case of adding a couple extra lines for the new items, creating Jason files and most importantly the sprites. I came into an error at first where I hadn’t added my new items to my LANG file (at the moment the file that has been causing me grief.) but that was a very quick and easy fix and I called them the right thing straight away this time. I spent a good 40minutes on the sprites as working with single digit numbers is surprisingly harder than 2 digit numbers and the sizing I was originally using for the digits was too small for the 5 so I decided to do my first (but probably not my last) texture rework on my gold coin and moved the numbers from the left and right hand side of the middle hole to two of the corners. This to me gave a very unique feel to my currency as you don’t see a lot of diagonal detail in textures and it also gave me more room to make my numbers look better. Once again I used an original color scheme for my coins. The one texture that is slightly different is my coal coin as it isn’t as coherent in the gradient but this is simply because as anyone who has ever tried digital artwork a black-gray gradient is very difficult as lightening it makes the texture go very white/grey quick. So the gradient on that coin isn’t as smooth however it gives the coin a lower status which is good as it is supposed to be the bottom tier of coins. Next week I’m going to aim to work on blocks for my mod.

Change log:
-	Added Coal Coin
-	Added Iron Coin
-	Reworked Gold Coin texture
-	Fixed Gold Coin name error.

21/01/2019
Today I followed tutorial 4 and made my first block: “Gold Coin Block”. I found the code straight forward this week and didn’t make any errors and was even writing the odd bit before it came up in the tutorial. My one tip to anyone following this method of mod making is check your .json files carefully especially with bocks as each block requires 3 separate json files, all of which can cause an error if you add one wrong letter. Once again I used Piskel for my sprite and this time I followed the design of a Manyullyn block (from tinkers’ construct) as I have always liked the texture and thought it would complement my coins well.  I used colors from my original gold coin and as I did so I noticed that a couple of pixels were wrong with my gold coin so I fixed those too. The item appeared perfectly it came under the building blocks tab where I put it which was great the only issue was that once again I had forgotten to put it in the lang file and give it a name so I got something along the lines of Tile.Entity… for its name but that was a very quick fix and I knew where I had gone wrong. To help me remember for the future there is now a post-it note on my monitor which reads “remember to add new content to LANG file”

Change log:
-	Added Gold Coin Block
-	Updated Gold Coin texture
-	Updated mother code for easy addition of new items

27/01/2019 + 18/01/2019
This week I added two more blocks (“Coal Coin Block” and “Iron Coin Block”) I did this to add variants for both of the coins that didn’t have blocks yet. Once again I did this by creating the texture in Piskel using my pre-existing block texture as a blueprint and then just changing the colors on it by sourcing them from my coin textures. I then added these textures to their place in the mod folder and then added them to the LANG file first this time so I don’t forget later. It was then a case of just adding them to my ModBlocks class and then creating six new json files for my items- all of this wasn’t difficult and my code worked without errors which is always nice. My coding didn’t stop here though this week I also wanted to add a bit of individuality to my blocks and move away from stock/basic properties. Using the following websites:
https://minecraft.gamepedia.com/Explosion
http://minecraftmodcustomstuff.wikia.com/wiki/Hardness
http://minecraftmodcustomstuff.wikia.com/wiki/HarvestLevel
https://minecraft.gamepedia.com/Light
I created a new class to add custom properties to my blocks such as light and harvest levels. Using inheritance I set this class to extend BlockBase. With this new class originally I set it as GoldCoinBlock but after finishing it I decided that all of my coin blocks were going to have the same properties so I refactored it and changed the name to CoinBlockBase. I didn’t have any real errors or bugs when writing this section on the code I just spent a while working on different properties such as how strong I wanted light to be emitted from my blocks. One thing to note is that whilst the websites listed above are very handy and explain some of the properties I’ve defined in detail they do contain some in-accuracies such as diamond blocks having a resistance level of 30 when in actuality they only have a resistance level of 15 but I would still recommend looking at these websites for anyone following the same steps that I have taken. Once I was happy with my properties I set my blocks to follow the class of CoinBlockBase instead of just block base, tested it was all working smoothly, which it was, and that wrapped up my coding for this week.

Change log:
-	Added new coin blocks (iron and coal)
-	Added new Block properties
-	Updated the properties of “Gold Coin Block”

