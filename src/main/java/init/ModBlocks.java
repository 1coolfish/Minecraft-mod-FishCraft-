package init;

import java.util.ArrayList;
import java.util.List;

import com.coolfish.fishcraft.blocks.BlockBase;
import com.coolfish.fishcraft.blocks.CoinBlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {
 public static final List<Block> BLOCKS =new ArrayList<Block>();
 
 public static final Block GOLD_COIN_BLOCK = new CoinBlockBase("gold_coin_block", Material.IRON);
 public static final Block IRON_COIN_BLOCK = new CoinBlockBase("iron_coin_block", Material.IRON);
 public static final Block COAl_COIN_BLOCK = new CoinBlockBase("coal_coin_block", Material.IRON);
 
}
