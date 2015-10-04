package Mr.Zombie;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.block.*;

public class TextCrafttab extends CreativeTabs
{

	public TextCrafttab(String label)
	{
		super(label);
	}
 
	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem()
	{
		return TextCraft.textItem;
	}
 

	
	@Override
	@SideOnly(Side.CLIENT)
	public String getTranslatedTabLabel()
	{
		return "TextCraft";
	}
 

	
}
