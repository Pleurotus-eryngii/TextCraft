package Mr.Zombie;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.SideOnly;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class aBlock extends Block {
	@SideOnly(Side.CLIENT)
    private IIcon TopIcon;
 
    @SideOnly(Side.CLIENT)
    private IIcon SideIcon;
 
    public aBlock() {
        super(Material.rock);
        setBlockName("blocka");/*・ｽV・ｽX・ｽe・ｽ・ｽ・ｽ・ｽ・ｽﾌ設抵ｿｽ*/
        setBlockTextureName("textcraft:a");/*・ｽu・ｽ・ｽ・ｽb・ｽN・ｽﾌテ・ｽN・ｽX・ｽ`・ｽ・ｽ・ｽﾌ指・ｽ・ｽ(・ｽ・ｽ・ｽ・ｽ・ｽw・ｽ・ｽﾌ場合・ｽﾍ擾ｿｽ・ｽ・ｽ・ｽﾄゑｿｽ・ｽ・ｽ・ｽ・ｽ・ｽ・ｽ・ｽB)*/
        /*・ｽﾈ会ｿｽ・ｽﾌゑｿｽ・ｽﾌは擾ｿｽ・ｽ・ｽ・ｽﾄゑｿｽ・ｽ・ｽ・ｽ\・ｽﾅゑｿｽ*/
        setHardness(1.5F);/*・ｽd・ｽ・ｽ*/
        setResistance(1.0F);/*・ｽ・ｽ・ｽj・ｽﾏ撰ｿｽ*/
        setStepSound(Block.soundTypeStone);/*・ｽu・ｽ・ｽ・ｽb・ｽN・ｽﾌ擾ｿｽ・ｽ・ｽ・ｽ・ｽ・ｽ・ｽ・ｽ・ｽ・ｽﾌ会ｿｽ*/
	/*setBlockUnbreakable();*//*・ｽu・ｽ・ｽ・ｽb・ｽN・ｽ・ｽj・ｽ・ｽs・ｽﾂに設抵ｿｽ*/
	/*setTickRandomly(true);*//*・ｽu・ｽ・ｽ・ｽb・ｽN・ｽ・ｽtick・ｽ・ｽ・ｽ・ｽ・ｽ・ｽ・ｽ・ｽ・ｽ・ｽ・ｽ_・ｽ・ｽ・ｽﾉ。・ｽf・ｽt・ｽH・ｽ・ｽ・ｽgfalse*/
	/*disableStats();*//*・ｽu・ｽ・ｽ・ｽb・ｽN・ｽﾌ難ｿｽ・ｽv・ｽ・ｽ・ｽ・ｽﾛ托ｿｽ・ｽ・ｽ・ｽﾈゑｿｽ*/
        setLightOpacity(1);/*・ｽu・ｽ・ｽ・ｽb・ｽN・ｽﾌ難ｿｽ・ｽﾟ係・ｽ・ｽ・ｽB・ｽf・ｽt・ｽH・ｽ・ｽ・ｽg・ｽO・ｽi・ｽs・ｽ・ｽ・ｽﾟ）*/
        //setLightLevel(1.0F);/*・ｽ・ｽ・ｽ驍ｳ 1.0F = 15*/
    }
 
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float posX, float posY, float posZ){
        //・ｽu・ｽ・ｽ・ｽb・ｽN・ｽ・ｽ・ｽE・ｽN・ｽ・ｽ・ｽb・ｽN・ｽ・ｽ・ｽ・ｽ・ｽﾛの難ｿｽ・ｽ・ｽ
        return true;
    }
 
    @Override
    public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player){
        //・ｽu・ｽ・ｽ・ｽb・ｽN・ｽ・ｽ・ｽ・ｽ・ｽN・ｽ・ｽ・ｽb・ｽN・ｽ・ｽ・ｽ・ｽ・ｽﾛの難ｿｽ・ｽ・ｽ
    }
 
    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block neighborBlock){
        //・ｽ・ｽ・ｽﾍのブ・ｽ・ｽ・ｽb・ｽN・ｽ・ｽ・ｽX・ｽV・ｽ・ｽ・ｽ黷ｽ・ｽﾛの難ｿｽ・ｽ・ｽ
    }
 
    @Override
    public int quantityDropped(int meta, int fortune, Random random){
        //・ｽh・ｽ・ｽ・ｽb・ｽv・ｽ・ｽ・ｽ・ｽA・ｽC・ｽe・ｽ・ｽ・ｽ・ｽﾔゑｿｽ
        return quantityDroppedWithBonus(fortune, random);
    }
 
    @Override
    public int quantityDropped(Random random){
        //・ｽh・ｽ・ｽ・ｽb・ｽv・ｽ・ｽ・ｽ・ｽ・ｽ・ｽﾊゑｿｽﾔゑｿｽ
        return 1;
    }

}
