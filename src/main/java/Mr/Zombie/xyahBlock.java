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

public class xyahBlock extends Block {
	@SideOnly(Side.CLIENT)
    private IIcon TopIcon;
 
    @SideOnly(Side.CLIENT)
    private IIcon SideIcon;
 
    public xyahBlock() {
        super(Material.rock);
        setBlockName("blockxyah");/*�V�X�e�����̐ݒ�*/
        setBlockTextureName("textcraft:xyah");/*�u���b�N�̃e�N�X�`���̎w��(�����w��̏ꍇ�͏����Ă��������B)*/
        /*�ȉ��̂��̂͏����Ă����\�ł�*/
        setHardness(1.5F);/*�d��*/
        setResistance(1.0F);/*���j�ϐ�*/
        setStepSound(Block.soundTypeStone);/*�u���b�N�̏����������̉�*/
	/*setBlockUnbreakable();*//*�u���b�N��j��s�ɐݒ�*/
	/*setTickRandomly(true);*//*�u���b�N��tick�����������_���ɁB�f�t�H���gfalse*/
	/*disableStats();*//*�u���b�N�̓��v����ۑ����Ȃ�*/
        setLightOpacity(1);/*�u���b�N�̓��ߌW���B�f�t�H���g�O�i�s���߁j*/
        //setLightLevel(1.0F);/*���邳 1.0F = 15*/
    }
 
    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float posX, float posY, float posZ){
        //�u���b�N���E�N���b�N�����ۂ̓���
        return true;
    }
 
    @Override
    public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player){
        //�u���b�N�����N���b�N�����ۂ̓���
    }
 
    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block neighborBlock){
        //���͂̃u���b�N���X�V���ꂽ�ۂ̓���
    }
 
    @Override
    public int quantityDropped(int meta, int fortune, Random random){
        //�h���b�v����A�C�e����Ԃ�
        return quantityDroppedWithBonus(fortune, random);
    }
 
    @Override
    public int quantityDropped(Random random){
        //�h���b�v������ʂ�Ԃ�
        return 1;
    }

}
