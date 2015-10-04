package Mr.Zombie;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.*;
import Mr.Zombie.*;

@Mod(modid="TextCraft", name="TextCraft", version="1.1")

public class TextCraft {
	
	public static final CreativeTabs TextCraft = new TextCrafttab("TextCraft");
	public static Block blocka;
	public static Block blockb;
	public static Block blockc;
	public static Block blockd;
	public static Block blocke;
	public static Block blockf;
	public static Block blockg;
	public static Block blockh;
	public static Block blocki;
	public static Block blockj;
	public static Block blockk;
	public static Block blockl;
	public static Block blockm;
	public static Block blockn;
	public static Block blocko;
	public static Block blockp;
	public static Block blockq;
	public static Block blockr;
	public static Block blocks;
	public static Block blockt;
	public static Block blocku;
	public static Block blockv;
	public static Block blockw;
	public static Block blockx;
	public static Block blocky;
	public static Block blockz;
	public static Block blockand;
	public static Block blockex;
	public static Block blockque;
	public static Block blockper;
	public static Block blockcom;
	public static Block blockat;
	public static Block blockbrs;//��
	public static Block blockbre;//��
	public static Block blockas;
	public static Block blockpas;//��
	public static Block blockpae;//��
	public static Block blockpes;//�p�[�Z���g
	public static Block blockdol;
	public static Block blockyen;
	public static Block blockpl;
	public static Block blockmin;
	public static Block blockmul;
	public static Block blockdiv;
	public static Block blockeq;
	public static Block block1;
	public static Block block2;
	public static Block block3;
	public static Block block4;
	public static Block block5;
	public static Block block6;
	public static Block block7;
	public static Block block8;
	public static Block block9;
	public static Block block0;
	public static Block blockac;
	public static Block blockbc;
	public static Block blockcc;
	public static Block blockdc;
	public static Block blockec;
	public static Block blockfc;
	public static Block blockgc;
	public static Block blockhc;
	public static Block blockic;
	public static Block blockjc;
	public static Block blockkc;
	public static Block blocklc;
	public static Block blockmc;
	public static Block blocknc;
	public static Block blockoc;
	public static Block blockpc;
	public static Block blockqc;
	public static Block blockrc;
	public static Block blocksc;
	public static Block blocktc;
	public static Block blockuc;
	public static Block blockvc;
	public static Block blockwc;
	public static Block blockxc;
	public static Block blockyc;
	public static Block blockzc;
	public static Block blockah;
	public static Block blockih;
	public static Block blockuh;
	public static Block blockeh;
	public static Block blockoh;
	public static Block blockkah;
	public static Block blockkih;
	public static Block blockkuh;
	public static Block blockkeh;
	public static Block blockkoh;
	public static Block blocksah;
	public static Block blocksih;
	public static Block blocksuh;
	public static Block blockseh;
	public static Block blocksoh;
	public static Block blocktah;
	public static Block blocktih;
	public static Block blocktuh;
	public static Block blockteh;
	public static Block blocktoh;
	public static Block blocknah;
	public static Block blocknih;
	public static Block blocknuh;
	public static Block blockneh;
	public static Block blocknoh;
	public static Block blockhah;
	public static Block blockhih;
	public static Block blockhuh;
	public static Block blockheh;
	public static Block blockhoh;
	public static Block blockmah;
	public static Block blockmih;
	public static Block blockmuh;
	public static Block blockmeh;
	public static Block blockmoh;
	public static Block blockyah;
	public static Block blockyuh;
	public static Block blockyoh;
	public static Block blockrah;
	public static Block blockrih;
	public static Block blockruh;
	public static Block blockreh;
	public static Block blockroh;
	public static Block blockwah;
	public static Block blockwoh;
	public static Block blocknnh;
	
	public static Block blockgah;
	public static Block blockgih;
	public static Block blockguh;
	public static Block blockgeh;
	public static Block blockgoh;
	public static Block blockzah;
	public static Block blockzih;
	public static Block blockzuh;
	public static Block blockzeh;
	public static Block blockzoh;
	public static Block blockdah;
	public static Block blockdih;
	public static Block blockduh;
	public static Block blockdeh;
	public static Block blockdoh;
	public static Block blockbah;
	public static Block blockbih;
	public static Block blockbuh;
	public static Block blockbeh;
	public static Block blockboh;
	public static Block blockpah;
	public static Block blockpih;
	public static Block blockpuh;
	public static Block blockpeh;
	public static Block blockpoh;
	
	public static Block blockxah;
	public static Block blockxih;
	public static Block blockxuh;
	public static Block blockxeh;
	public static Block blockxoh;
	public static Block blockxtuh;
	public static Block blockxyah;
	public static Block blockxyuh;
	public static Block blockxyoh;
	
	public static Block blockak;
	public static Block blockik;
	public static Block blockuk;
	public static Block blockek;
	public static Block blockok;
	public static Block blockkak;
	public static Block blockkik;
	public static Block blockkuk;
	public static Block blockkek;
	public static Block blockkok;
	public static Block blocksak;
	public static Block blocksik;
	public static Block blocksuk;
	public static Block blocksek;
	public static Block blocksok;
	public static Block blocktak;
	public static Block blocktik;
	public static Block blocktuk;
	public static Block blocktek;
	public static Block blocktok;
	public static Block blocknak;
	public static Block blocknik;
	public static Block blocknuk;
	public static Block blocknek;
	public static Block blocknok;
	public static Block blockhak;
	public static Block blockhik;
	public static Block blockhuk;
	public static Block blockhek;
	public static Block blockhok;
	public static Block blockmak;
	public static Block blockmik;
	public static Block blockmuk;
	public static Block blockmek;
	public static Block blockmok;
	public static Block blockyak;
	public static Block blockyuk;
	public static Block blockyok;
	public static Block blockrak;
	public static Block blockrik;
	public static Block blockruk;
	public static Block blockrek;
	public static Block blockrok;
	public static Block blockwak;
	public static Block blockwok;
	public static Block blocknnk;
	
	public static Block blockgak;
	public static Block blockgik;
	public static Block blockguk;
	public static Block blockgek;
	public static Block blockgok;
	public static Block blockzak;
	public static Block blockzik;
	public static Block blockzuk;
	public static Block blockzek;
	public static Block blockzok;
	public static Block blockdak;
	public static Block blockdik;
	public static Block blockduk;
	public static Block blockdek;
	public static Block blockdok;
	public static Block blockbak;
	public static Block blockbik;
	public static Block blockbuk;
	public static Block blockbek;
	public static Block blockbok;
	public static Block blockpak;
	public static Block blockpik;
	public static Block blockpuk;
	public static Block blockpek;
	public static Block blockpok;
	
	public static Block blockxak;
	public static Block blockxik;
	public static Block blockxuk;
	public static Block blockxek;
	public static Block blockxok;
	public static Block blockxtuk;
	public static Block blockxyak;
	public static Block blockxyuk;
	public static Block blockxyok;
	
	
	public static Item textItem;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		//�u���b�N�̃C���X�^���X����
		blocka = new aBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
		GameRegistry.registerBlock(blocka, "a");
		
		//�u���b�N�̃C���X�^���X����
	    blockb = new bBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockb, "b");
		
	  //�u���b�N�̃C���X�^���X����
	    blockc = new cBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockc, "c");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockd = new dBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockd, "d");
	    
	  //�u���b�N�̃C���X�^���X����
	    blocke = new eBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blocke, "e");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockf = new fBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockf, "f");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockg = new gBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockg, "g");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockh = new hBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockh, "h");
	    
	  //�u���b�N�̃C���X�^���X����
	    blocki = new iBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blocki, "i");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockj = new jBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockj, "j");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockk = new kBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockk, "k");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockl = new lBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockl, "l");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockm = new mBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockm, "m");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockn = new nBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockn, "n");
	    
	  //�u���b�N�̃C���X�^���X����
	    blocko = new oBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blocko, "o");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockp = new pBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockp, "p");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockq = new qBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockq, "q");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockr = new rBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockr, "r");
	    
	  //�u���b�N�̃C���X�^���X����
	    blocks = new sBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blocks, "s");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockt = new tBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockt, "t");
	    
	  //�u���b�N�̃C���X�^���X����
	    blocku = new uBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blocku, "u");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockv = new vBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockv, "v");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockw = new wBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockw, "w");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockx = new xBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockx, "x");
	    
	  //�u���b�N�̃C���X�^���X����
	    blocky = new yBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blocky, "y");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockz = new zBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockz, "z");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockand = new andBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockand, "and");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockex = new exBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockex, "ex");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockque = new queBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockque, "que");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockper = new perBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockper, "per");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockcom = new comBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockcom, "com");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockat = new atBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockat, "at");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockbrs = new brsBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockbrs, "brs");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockbre = new breBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockbre, "bre");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockas = new asBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockas, "as");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockpas = new pasBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockpas, "pas");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockpae = new paeBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockpae, "pae");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockpes = new pesBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockpes, "pes");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockdol = new dolBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockdol, "dol");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockyen = new yenBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockyen, "yen");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockpl = new plBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockpl, "pl");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockmin = new minBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockmin, "min");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockmul = new mulBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockmul, "mul");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockdiv = new divBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockdiv, "div");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockeq = new eqBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockeq, "eq");
	    
      //�u���b�N�̃C���X�^���X����
	    block1 = new n1Block().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(block1, "1");
	    
	  //�u���b�N�̃C���X�^���X����
	    block2 = new n2Block().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(block2, "2");
	    
	  //�u���b�N�̃C���X�^���X����
	    block3 = new n3Block().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(block3, "3");
	    
	  //�u���b�N�̃C���X�^���X����
	    block4 = new n4Block().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(block4, "4");
	    
	  //�u���b�N�̃C���X�^���X����
	    block5 = new n5Block().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(block5, "5");
	    
	  //�u���b�N�̃C���X�^���X����
	    block6 = new n6Block().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(block6, "6");
	    
	  //�u���b�N�̃C���X�^���X����
	    block7 = new n7Block().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(block7, "7");
	    
	  //�u���b�N�̃C���X�^���X����
	    block8 = new n8Block().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(block8, "8");
	    
	  //�u���b�N�̃C���X�^���X����
	    block9 = new n9Block().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(block9, "9");
	    
	  //�u���b�N�̃C���X�^���X����
	    block0 = new n0Block().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(block0, "0");
	    
	  //�u���b�N�̃C���X�^���X����
  		blockac = new acBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  		GameRegistry.registerBlock(blockac, "ac");
  		
  		//�u���b�N�̃C���X�^���X����
  	    blockbc = new bcBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockbc, "bc");
  		
  	  //�u���b�N�̃C���X�^���X����
  	    blockcc = new ccBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockcc, "cc");
  	    
  	  //�u���b�N�̃C���X�^���X����
  	    blockdc = new dcBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockdc, "dc");
  	    
  	  //�u���b�N�̃C���X�^���X����
  	    blockec = new ecBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockec, "ec");
  	    
  	  //�u���b�N�̃C���X�^���X����
  	    blockfc = new fcBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockfc, "fc");
  	    
  	  //�u���b�N�̃C���X�^���X����
  	    blockgc = new gcBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockgc, "gc");
  	    
  	  //�u���b�N�̃C���X�^���X����
  	    blockhc = new hcBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockhc, "hc");
  	    
  	  //�u���b�N�̃C���X�^���X����
  	    blockic = new icBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockic, "ic");
  	    
  	  //�u���b�N�̃C���X�^���X����
  	    blockjc = new jcBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockjc, "jc");
  	    
  	  //�u���b�N�̃C���X�^���X����
  	    blockkc = new kcBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockkc, "kc");
  	    
  	  //�u���b�N�̃C���X�^���X����
  	    blocklc = new lcBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blocklc, "lc");
  	    
  	  //�u���b�N�̃C���X�^���X����
  	    blockmc = new mcBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockmc, "mc");
  	    
  	  //�u���b�N�̃C���X�^���X����
  	    blocknc = new ncBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blocknc, "nc");
  	    
  	  //�u���b�N�̃C���X�^���X����
  	    blockoc = new ocBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockoc, "oc");
  	    
  	  //�u���b�N�̃C���X�^���X����
  	    blockpc = new pcBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockpc, "pc");
  	    
  	  //�u���b�N�̃C���X�^���X����
  	    blockqc = new qcBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockqc, "qc");
  	    
  	  //�u���b�N�̃C���X�^���X����
  	    blockrc = new rcBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockrc, "rc");
  	    
  	  //�u���b�N�̃C���X�^���X����
  	    blocksc = new scBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blocksc, "sc");
  	    
  	  //�u���b�N�̃C���X�^���X����
  	    blocktc = new tcBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blocktc, "tc");
  	    
  	  //�u���b�N�̃C���X�^���X����
  	    blockuc = new ucBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockuc, "uc");
  	    
  	  //�u���b�N�̃C���X�^���X����
  	    blockvc = new vcBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockvc, "vc");
  	    
  	  //�u���b�N�̃C���X�^���X����
  	    blockwc = new wcBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockwc, "wc");
  	    
  	  //�u���b�N�̃C���X�^���X����
  	    blockxc = new xcBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockxc, "xc");
  	    
  	  //�u���b�N�̃C���X�^���X����
  	    blockyc = new ycBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockyc, "yc");
  	    
  	  //�u���b�N�̃C���X�^���X����
  	    blockzc = new zcBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockzc, "zc");
  	    
  	  //�u���b�N�̃C���X�^���X����
  	    blockah = new ahBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockah, "ah");
  	    
  	  //�u���b�N�̃C���X�^���X����
  	    blockih = new ihBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockih, "ih");
  	  
  	   //�u���b�N�̃C���X�^���X����
  	    blockuh = new uhBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockuh, "uh");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blockeh = new ehBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockeh, "eh");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blockoh = new ohBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockoh, "oh");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blockkah = new kahBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockkah, "kah");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blockkih = new kihBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockkih, "kih");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blockkuh = new kuhBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockkuh, "kuh");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blockkeh = new kehBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockkeh, "keh");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blockkoh = new kohBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockkoh, "koh");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blocksah = new sahBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blocksah, "sah");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blocksih = new sihBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blocksih, "sih");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blocksuh = new suhBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blocksuh, "suh");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blockseh = new sehBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockseh, "seh");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blocksoh = new sohBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blocksoh, "soh");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blocktah = new tahBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blocktah, "tah");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blocktih = new tihBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blocktih, "tih");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blocktuh = new tuhBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blocktuh, "tuh");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blockteh = new tehBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockteh, "teh");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blocktoh = new tohBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blocktoh, "toh");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blocknah = new nahBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blocknah, "nah");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blocknih = new nihBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blocknih, "nih");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blocknuh = new nuhBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blocknuh, "nuh");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blockneh = new nehBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockneh, "neh");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blocknoh = new nohBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blocknoh, "noh");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blockhah = new hahBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockhah, "hah");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blockhih = new hihBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockhih, "hih");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blockhuh = new huhBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockhuh, "huh");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blockheh = new hehBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockheh, "heh");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blockhoh = new hohBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockhoh, "hoh");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blockmah = new mahBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockmah, "mah");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blockmih = new mihBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockmih, "mih");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blockmuh = new muhBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockmuh, "muh");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blockmeh = new mehBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockmeh, "meh");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blockmoh = new mohBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockmoh, "moh");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blockyah = new yahBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockyah, "yah");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blockyuh = new yuhBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockyuh, "yuh");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blockyoh = new yohBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockyoh, "yoh");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blockrah = new rahBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockrah, "rah");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blockrih = new rihBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockrih, "rih");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blockruh = new ruhBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockruh, "ruh");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blockreh = new rehBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockreh, "reh");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blockroh = new rohBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockroh, "roh");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blockwah = new wahBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockwah, "wah");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blockwoh = new wohBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockwoh, "woh");
	    
  	//�u���b�N�̃C���X�^���X����
  	    blocknnh = new nnhBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blocknnh, "nnh");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockgah = new gahBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockgah, "gah");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockgih = new gihBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockgih, "gih");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockguh = new guhBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockguh, "guh");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockgeh = new gehBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockgeh, "geh");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockgoh = new gohBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockgoh, "goh");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockzah = new zahBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockzah, "zah");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockzih = new zihBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockzih, "zih");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockzuh = new zuhBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockzuh, "zuh");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockzeh = new zehBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockzeh, "zeh");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockzoh = new zohBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockzoh, "zoh");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockdah = new dahBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockdah, "dah");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockdih = new dihBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockdih, "dih");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockduh = new duhBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockduh, "duh");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockdeh = new dehBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockdeh, "deh");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockdoh = new dohBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockdoh, "doh");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockbah = new bahBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockbah, "bah");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockbih = new bihBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockbih, "bih");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockbuh = new buhBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockbuh, "buh");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockbeh = new behBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockbeh, "beh");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockboh = new bohBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockboh, "boh");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockpah = new pahBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockpah, "pah");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockpih = new pihBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockpih, "pih");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockpuh = new puhBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockpuh, "puh");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockpeh = new pehBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockpeh, "peh");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockpoh = new pohBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockpoh, "poh");

  	//�u���b�N�̃C���X�^���X����
  	    blockxah = new xahBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockxah, "xah");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockxih = new xihBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockxih, "xih");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockxuh = new xuhBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockxuh, "xuh");
  	
   //�u���b�N�̃C���X�^���X����
  	    blockxeh = new xehBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockxeh, "xeh");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockxoh = new xohBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockxoh, "xoh");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockxtuh = new xtuhBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockxtuh, "xtuh");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockxyah = new xyahBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockxyah, "xyah");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockxyuh = new xyuhBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockxyuh, "xyuh");
  	    
  	//�u���b�N�̃C���X�^���X����
  	    blockxyoh = new xyohBlock().setCreativeTab(TextCraft);;
  		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
  	    GameRegistry.registerBlock(blockxyoh, "xyoh");
	    

  	  
  	  //�u���b�N�̃C���X�^���X����
	    blockak = new akBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockak, "ak");
	    
	  //�u���b�N�̃C���X�^���X����
	    blockik = new ikBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockik, "ik");
	  
	   //�u���b�N�̃C���X�^���X����
	    blockuk = new ukBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockuk, "uk");
	    
	//�u���b�N�̃C���X�^���X����
	    blockek = new ekBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockek, "ek");
	    
	//�u���b�N�̃C���X�^���X����
	    blockok = new okBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockok, "ok");
	    
	//�u���b�N�̃C���X�^���X����
	    blockkak = new kakBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockkak, "kak");
	    
	//�u���b�N�̃C���X�^���X����
	    blockkik = new kikBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockkik, "kik");
	    
	//�u���b�N�̃C���X�^���X����
	    blockkuk = new kukBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockkuk, "kuk");
	    
	//�u���b�N�̃C���X�^���X����
	    blockkek = new kekBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockkek, "kek");
	    
	//�u���b�N�̃C���X�^���X����
	    blockkok = new kokBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockkok, "kok");
	    
	//�u���b�N�̃C���X�^���X����
	    blocksak = new sakBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blocksak, "sak");
	    
	//�u���b�N�̃C���X�^���X����
	    blocksik = new sikBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blocksik, "sik");
	    
	//�u���b�N�̃C���X�^���X����
	    blocksuk = new sukBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blocksuk, "suk");
	    
	//�u���b�N�̃C���X�^���X����
	    blocksek = new sekBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blocksek, "sek");
	    
	//�u���b�N�̃C���X�^���X����
	    blocksok = new sokBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blocksok, "sok");
	    
	//�u���b�N�̃C���X�^���X����
	    blocktak = new takBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blocktak, "tak");
	    
	//�u���b�N�̃C���X�^���X����
	    blocktik = new tikBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blocktik, "tik");
	    
	//�u���b�N�̃C���X�^���X����
	    blocktuk = new tukBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blocktuk, "tuk");
	    
	//�u���b�N�̃C���X�^���X����
	    blocktek = new tekBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blocktek, "tek");
	    
	//�u���b�N�̃C���X�^���X����
	    blocktok = new tokBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blocktok, "tok");
	    
	//�u���b�N�̃C���X�^���X����
	    blocknak = new nakBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blocknak, "nak");
	    
	//�u���b�N�̃C���X�^���X����
	    blocknik = new nikBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blocknik, "nik");
	    
	//�u���b�N�̃C���X�^���X����
	    blocknuk = new nukBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blocknuk, "nuk");
	    
	//�u���b�N�̃C���X�^���X����
	    blocknek = new nekBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blocknek, "nek");
	    
	//�u���b�N�̃C���X�^���X����
	    blocknok = new nokBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blocknok, "nok");
	    
	//�u���b�N�̃C���X�^���X����
	    blockhak = new hakBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockhak, "hak");
	    
	//�u���b�N�̃C���X�^���X����
	    blockhik = new hikBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockhik, "hik");
	    
	//�u���b�N�̃C���X�^���X����
	    blockhuk = new hukBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockhuk, "huk");
	    
	//�u���b�N�̃C���X�^���X����
	    blockhek = new hekBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockhek, "hek");
	    
	//�u���b�N�̃C���X�^���X����
	    blockhok = new hokBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockhok, "hok");
	    
	//�u���b�N�̃C���X�^���X����
	    blockmak = new makBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockmak, "mak");
	    
	//�u���b�N�̃C���X�^���X����
	    blockmik = new mikBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockmik, "mik");
	    
	//�u���b�N�̃C���X�^���X����
	    blockmuk = new mukBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockmuk, "muk");
	    
	//�u���b�N�̃C���X�^���X����
	    blockmek = new mekBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockmek, "mek");
	    
	//�u���b�N�̃C���X�^���X����
	    blockmok = new mokBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockmok, "mok");
	    
	//�u���b�N�̃C���X�^���X����
	    blockyak = new yakBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockyak, "yak");
	    
	//�u���b�N�̃C���X�^���X����
	    blockyuk = new yukBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockyuk, "yuk");
	    
	//�u���b�N�̃C���X�^���X����
	    blockyok = new yokBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockyok, "yok");
	    
	//�u���b�N�̃C���X�^���X����
	    blockrak = new rakBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockrak, "rak");
	    
	//�u���b�N�̃C���X�^���X����
	    blockrik = new rikBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockrik, "rik");
	    
	//�u���b�N�̃C���X�^���X����
	    blockruk = new rukBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockruk, "ruk");
	    
	//�u���b�N�̃C���X�^���X����
	    blockrek = new rekBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockrek, "rek");
	    
	//�u���b�N�̃C���X�^���X����
	    blockrok = new rokBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockrok, "rok");
	    
	//�u���b�N�̃C���X�^���X����
	    blockwak = new wakBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockwak, "wak");
	    
	//�u���b�N�̃C���X�^���X����
	    blockwok = new wokBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockwok, "wok");
	    
	//�u���b�N�̃C���X�^���X����
	    blocknnk = new nnkBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blocknnk, "nnk");
	    
	//�u���b�N�̃C���X�^���X����
	    blockgak = new gakBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockgak, "gak");
	    
	//�u���b�N�̃C���X�^���X����
	    blockgik = new gikBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockgik, "gik");
	    
	//�u���b�N�̃C���X�^���X����
	    blockguk = new gukBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockguk, "guk");
	    
	//�u���b�N�̃C���X�^���X����
	    blockgek = new gekBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockgek, "gek");
	    
	//�u���b�N�̃C���X�^���X����
	    blockgok = new gokBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockgok, "gok");
	    
	//�u���b�N�̃C���X�^���X����
	    blockzak = new zakBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockzak, "zak");
	    
	//�u���b�N�̃C���X�^���X����
	    blockzik = new zikBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockzik, "zik");
	    
	//�u���b�N�̃C���X�^���X����
	    blockzuk = new zukBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockzuk, "zuk");
	    
	//�u���b�N�̃C���X�^���X����
	    blockzek = new zekBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockzek, "zek");
	    
	//�u���b�N�̃C���X�^���X����
	    blockzok = new zokBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockzok, "zok");
	    
	//�u���b�N�̃C���X�^���X����
	    blockdak = new dakBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockdak, "dak");
	    
	//�u���b�N�̃C���X�^���X����
	    blockdik = new dikBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockdik, "dik");
	    
	//�u���b�N�̃C���X�^���X����
	    blockduk = new dukBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockduk, "duk");
	    
	//�u���b�N�̃C���X�^���X����
	    blockdek = new dekBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockdek, "dek");
	    
	//�u���b�N�̃C���X�^���X����
	    blockdok = new dokBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockdok, "dok");
	    
	//�u���b�N�̃C���X�^���X����
	    blockbak = new bakBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockbak, "bak");
	    
	//�u���b�N�̃C���X�^���X����
	    blockbik = new bikBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockbik, "bik");
	    
	//�u���b�N�̃C���X�^���X����
	    blockbuk = new bukBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockbuk, "buk");
	    
	//�u���b�N�̃C���X�^���X����
	    blockbek = new bekBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockbek, "bek");
	    
	//�u���b�N�̃C���X�^���X����
	    blockbok = new bokBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockbok, "bok");
	    
	//�u���b�N�̃C���X�^���X����
	    blockpak = new pakBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockpak, "pak");
	    
	//�u���b�N�̃C���X�^���X����
	    blockpik = new pikBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockpik, "pik");
	    
	//�u���b�N�̃C���X�^���X����
	    blockpuk = new pukBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockpuk, "puk");
	    
	//�u���b�N�̃C���X�^���X����
	    blockpek = new pekBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockpek, "pek");
	    
	//�u���b�N�̃C���X�^���X����
	    blockpok = new pokBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockpok, "pok");

	//�u���b�N�̃C���X�^���X����
	    blockxak = new xakBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockxak, "xak");
	    
	//�u���b�N�̃C���X�^���X����
	    blockxik = new xikBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockxik, "xik");
	    
	//�u���b�N�̃C���X�^���X����
	    blockxuk = new xukBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockxuk, "xuk");
	
 //�u���b�N�̃C���X�^���X����
	    blockxek = new xekBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockxek, "xek");
	    
	//�u���b�N�̃C���X�^���X����
	    blockxok = new xokBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockxok, "xok");
	    
	//�u���b�N�̃C���X�^���X����
	    blockxtuk = new xtukBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockxtuk, "xtuk");
	    
	//�u���b�N�̃C���X�^���X����
	    blockxyak = new xyakBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockxyak, "xyak");
	    
	//�u���b�N�̃C���X�^���X����
	    blockxyuk = new xyukBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockxyuk, "xyuk");
	    
	//�u���b�N�̃C���X�^���X����
	    blockxyok = new xyokBlock().setCreativeTab(TextCraft);;
		//�u���b�N�̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
	    GameRegistry.registerBlock(blockxyok, "xyok");
	    
	    
  	
	    
	    
	    
	    //�A�C�e���̃C���X�^���X����
		textItem = new Item()
		.setCreativeTab(CreativeTabs.tabMaterials)/*�N���G�C�e�B�u�̃^�u*/
		.setUnlocalizedName("SampleItem")/*�V�X�e�����̓o�^*/
		.setTextureName("textcraft:element")/*�e�N�X�`���̎w��*/
		/*.setHasSubtypes(true)*//*�_���[�W�l���ŕ����̎�ނ̃A�C�e���𕪂��Ă��邩�ǂ����B�f�t�H���gfalse*/
		/*.setMaxDamage(256)*//*�ϋv�l�̐ݒ�B�f�t�H���g0*/
		/*.setFull3D()*//*�RD�\���ŕ`�悳����B�c�[���⍜�A�_���B*/
		/*.setContainerItem(Items.stick)*//*�N���t�g���ɃA�C�e����ԋp�ł���悤�ɂ��Ă���ۂ̕ԋp�A�C�e���̎w��B*/
		/*.setPotionEffect(PotionHelper.ghastTearEffect)*//*�w�蕶����ɑΉ������f�ނƂ��ď�����Ŏg����BPotionHelper�Q�Ƃ̂��ƁB*/
		/*.setNoRepair()*//*�C�����V�s���폜���A�����ł̏C�U���o���Ȃ�����*/
		.setMaxStackSize(64);/*�X�^�b�N�ł���ʁB�f�t�H���g64*/
		//�A�C�e���̓o�^�B�o�^�������MOD���Ŕ��Ȃ���Ή��ł��ǂ��B
		GameRegistry.registerItem(textItem, "Textelemnt");

		
	}
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		GameRegistry.addRecipe(new ItemStack(blocka),
                "#  ",
                "   ",
                "   ",
                '#', Blocks.cobblestone
        );

		GameRegistry.addRecipe(new ItemStack(blockb),
                "#  ",
                "#  ",
                "   ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockc),
                "## ",
                "   ",
                "   ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockd),
                "## ",
                " #  ",
                "   ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blocke),
                "#  ",
                " # ",
                "   ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockf),
                "## ",
                "#  ",
                "   ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockg),
                "## ",
                "## ",
                "   ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockh),
                "#  ",
                "## ",
                "   ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blocki),
                " # ",
                "#  ",
                "   ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockj),
                " # ",
                "## ",
                "   ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockk),
                "#  ",
                "   ",
                "#  ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockl),
                "#  ",
                "#  ",
                "#  ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockm),
                "## ",
                "   ",
                "#  ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockn),
                "## ",
                " # ",
                "#  ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blocko),
                "#  ",
                " # ",
                "#  ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockp),
                "## ",
                "#  ",
                "#  ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockq),
                "## ",
                "## ",
                "#  ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockr),
                "#  ",
                "## ",
                "#  ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blocks),
                " # ",
                "#  ",
                "#  ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockt),
                " # ",
                "## ",
                "#  ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blocku),
                "#  ",
                "   ",
                "## ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockv),
                "#  ",
                "#  ",
                "## ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockw),
                " # ",
                "## ",
                " # ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockx),
                "## ",
                "   ",
                "## ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blocky),
                "## ",
                " # ",
                "## ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockz),
                "#  ",
                " # ",
                "## ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockand),
                " ##",
                "## ",
                "###",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockex),
                "   ",
                "## ",
                "#  ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockque),
                "   ",
                "#  ",
                " # ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockper),
                "   ",
                "## ",
                " # ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockcom),
                "   ",
                " # ",
                " # ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockat),
                "   ",
                "@# ",
                "   ",
                '#', blocka,
                '@', blockt
        );
		GameRegistry.addRecipe(new ItemStack(blockbrs),
                "   ",
                "   ",
                "## ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockbre),
                "   ",
                "   ",
                " ##",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockas),
                " # ",
                "#  ",
                "# #",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockpas),
                "   ",
                "## ",
                "## ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockpae),
                "   ",
                " ##",
                " ##",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockpes),
                " ##",
                "## ",
                "## ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockdol),
                "   ",
                "@#*",
                "   ",
                '@', blockd,
                '#', blocko,
                '*', blockl
        );
		GameRegistry.addRecipe(new ItemStack(blockyen),
                "   ",
                "@#*",
                "   ",
                '@', blocky,
                '#', blocke,
                '*', blockn
        );
		GameRegistry.addRecipe(new ItemStack(blockpl),
                " # ",
                "###",
                " # ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockmin),
                "   ",
                "###",
                "   ",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockmul),
                "# #",
                " # ",
                "# #",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(blockdiv),
                "   ",
                "@#*",
                "   ",
                '@', blockd,
                '#', blocki,
                '*', blockv
        );
		GameRegistry.addRecipe(new ItemStack(blockeq),
                "###",
                "   ",
                "###",
                '#', Blocks.cobblestone
        );
		GameRegistry.addRecipe(new ItemStack(block1),
                "#  ",
                "   ",
                "  @",
                '#', Blocks.cobblestone,
                '@', Blocks.dirt
        );
		GameRegistry.addRecipe(new ItemStack(block2),
                "#  ",
                "#  ",
                "  @",
                '#', Blocks.cobblestone,
                '@', Blocks.dirt
        );
		GameRegistry.addRecipe(new ItemStack(block3),
                "## ",
                "   ",
                "  @",
                '#', Blocks.cobblestone,
                '@', Blocks.dirt
        );
		GameRegistry.addRecipe(new ItemStack(block4),
                "## ",
                " # ",
                "  @",
                '#', Blocks.cobblestone,
                '@', Blocks.dirt
        );
		GameRegistry.addRecipe(new ItemStack(block5),
                "#  ",
                " # ",
                "  @",
                '#', Blocks.cobblestone,
                '@', Blocks.dirt
        );
		GameRegistry.addRecipe(new ItemStack(block6),
                "## ",
                "#  ",
                "  @",
                '#', Blocks.cobblestone,
                '@', Blocks.dirt
        );
		GameRegistry.addRecipe(new ItemStack(block7),
                "## ",
                "## ",
                "  @",
                '#', Blocks.cobblestone,
                '@', Blocks.dirt
        );
		GameRegistry.addRecipe(new ItemStack(block8),
                "#  ",
                "## ",
                "  @",
                '#', Blocks.cobblestone,
                '@', Blocks.dirt
        );
		GameRegistry.addRecipe(new ItemStack(block9),
                " # ",
                "#  ",
                "  @",
                '#', Blocks.cobblestone,
                '@', Blocks.dirt
        );
		GameRegistry.addRecipe(new ItemStack(block0),
                " # ",
                "## ",
                "  @",
                '#', Blocks.cobblestone,
                '@', Blocks.dirt
        );
		GameRegistry.addRecipe(new ItemStack(blockac),
                "#  ",
                "   ",
                "  @",
                '#', Blocks.cobblestone,
                '@', Blocks.sand
        );

		GameRegistry.addRecipe(new ItemStack(blockbc),
                "#  ",
                "#  ",
                "  @",
                '#', Blocks.cobblestone,
                '@', Blocks.sand
        );
		GameRegistry.addRecipe(new ItemStack(blockcc),
                "## ",
                "   ",
                "  @",
                '#', Blocks.cobblestone,
                '@', Blocks.sand
        );
		GameRegistry.addRecipe(new ItemStack(blockdc),
                "## ",
                " # ",
                "  @",
                '#', Blocks.cobblestone,
                '@', Blocks.sand
        );
		GameRegistry.addRecipe(new ItemStack(blockec),
                "#  ",
                " # ",
                "  @",
                '#', Blocks.cobblestone,
                '@', Blocks.sand
        );
		GameRegistry.addRecipe(new ItemStack(blockfc),
                "## ",
                "#  ",
                "  @",
                '#', Blocks.cobblestone,
                '@', Blocks.sand
        );
		GameRegistry.addRecipe(new ItemStack(blockgc),
                "## ",
                "## ",
                "  @",
                '#', Blocks.cobblestone,
                '@', Blocks.sand
        );
		GameRegistry.addRecipe(new ItemStack(blockhc),
                "#  ",
                "## ",
                "  @",
                '#', Blocks.cobblestone,
                '@', Blocks.sand
        );
		GameRegistry.addRecipe(new ItemStack(blockic),
                " # ",
                "#  ",
                "  @",
                '#', Blocks.cobblestone,
                '@', Blocks.sand
        );
		GameRegistry.addRecipe(new ItemStack(blockjc),
                " # ",
                "## ",
                "  @",
                '#', Blocks.cobblestone,
                '@', Blocks.sand
        );
		GameRegistry.addRecipe(new ItemStack(blockkc),
                "#  ",
                "   ",
                "# @",
                '#', Blocks.cobblestone,
                '@', Blocks.sand
        );
		GameRegistry.addRecipe(new ItemStack(blocklc),
                "#  ",
                "#  ",
                "# @",
                '#', Blocks.cobblestone,
                '@', Blocks.sand
        );
		GameRegistry.addRecipe(new ItemStack(blockmc),
                "## ",
                "   ",
                "# @",
                '#', Blocks.cobblestone,
                '@', Blocks.sand
        );
		GameRegistry.addRecipe(new ItemStack(blocknc),
                "## ",
                " # ",
                "# @",
                '#', Blocks.cobblestone,
                '@', Blocks.sand
        );
		GameRegistry.addRecipe(new ItemStack(blockoc),
                "#  ",
                " # ",
                "# @",
                '#', Blocks.cobblestone
                ,
                '@', Blocks.sand
        );
		GameRegistry.addRecipe(new ItemStack(blockpc),
                "## ",
                "#  ",
                "# @",
                '#', Blocks.cobblestone,
                '@', Blocks.sand
        );
		GameRegistry.addRecipe(new ItemStack(blockqc),
                "## ",
                "## ",
                "# @",
                '#', Blocks.cobblestone,
                '@', Blocks.sand
        );
		GameRegistry.addRecipe(new ItemStack(blockrc),
                "#  ",
                "## ",
                "# @",
                '#', Blocks.cobblestone,
                '@', Blocks.sand
        );
		GameRegistry.addRecipe(new ItemStack(blocksc),
                " # ",
                "#  ",
                "# @",
                '#', Blocks.cobblestone,
                '@', Blocks.sand
        );
		GameRegistry.addRecipe(new ItemStack(blocktc),
                " # ",
                "## ",
                "# @",
                '#', Blocks.cobblestone,
                '@', Blocks.sand
        );
		GameRegistry.addRecipe(new ItemStack(blockuc),
                "#  ",
                "   ",
                "##@",
                '#', Blocks.cobblestone,
                '@', Blocks.sand
        );
		GameRegistry.addRecipe(new ItemStack(blockvc),
                "#  ",
                "#  ",
                "##@",
                '#', Blocks.cobblestone,
                '@', Blocks.sand
        );
		GameRegistry.addRecipe(new ItemStack(blockwc),
                " # ",
                "## ",
                " #@",
                '#', Blocks.cobblestone,
                '@', Blocks.sand
        );
		GameRegistry.addRecipe(new ItemStack(blockxc),
                "## ",
                "   ",
                "##@",
                '#', Blocks.cobblestone,
                '@', Blocks.sand
        );
		GameRegistry.addRecipe(new ItemStack(blockyc),
                "## ",
                " # ",
                "##@",
                '#', Blocks.cobblestone,
                '@', Blocks.sand
        );
		GameRegistry.addRecipe(new ItemStack(blockzc),
                "#  ",
                " # ",
                "##@",
                '#', Blocks.cobblestone,
                '@', Blocks.sand
        );

		
		//�\�����̓o�^
		LanguageRegistry.addName(blocka, "a");
		LanguageRegistry.instance().addNameForObject(blocka, "ja_JP", "a");
	
		//�\�����̓o�^
	    LanguageRegistry.addName(blockb, "b");
	    LanguageRegistry.instance().addNameForObject(blockb, "ja_JP", "b");
	    
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockc, "c");
	  	LanguageRegistry.instance().addNameForObject(blockc, "ja_JP", "c");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockd, "d");
	  	LanguageRegistry.instance().addNameForObject(blockd, "ja_JP", "d");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocke, "e");
	  	LanguageRegistry.instance().addNameForObject(blocke, "ja_JP", "e");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockf, "f");
	  	LanguageRegistry.instance().addNameForObject(blockf, "ja_JP", "f");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockg, "g");
	  	LanguageRegistry.instance().addNameForObject(blockg, "ja_JP", "g");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockh, "h");
	  	LanguageRegistry.instance().addNameForObject(blockh, "ja_JP", "h");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocki, "i");
	  	LanguageRegistry.instance().addNameForObject(blocki, "ja_JP", "i");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockj, "j");
	  	LanguageRegistry.instance().addNameForObject(blockj, "ja_JP", "j");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockk, "k");
	  	LanguageRegistry.instance().addNameForObject(blockk, "ja_JP", "k");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockl, "l");
	  	LanguageRegistry.instance().addNameForObject(blockl, "ja_JP", "l");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockm, "m");
	  	LanguageRegistry.instance().addNameForObject(blockm, "ja_JP", "m");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockn, "n");
	  	LanguageRegistry.instance().addNameForObject(blockn, "ja_JP", "n");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocko, "o");
	  	LanguageRegistry.instance().addNameForObject(blocko, "ja_JP", "o");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockp, "p");
	  	LanguageRegistry.instance().addNameForObject(blockp, "ja_JP", "p");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockq, "q");
	  	LanguageRegistry.instance().addNameForObject(blockq, "ja_JP", "q");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockr, "r");
	  	LanguageRegistry.instance().addNameForObject(blockr, "ja_JP", "r");
	    
	  	//�\�����̓o�^
	  	LanguageRegistry.addName(blocks, "s");
	  	LanguageRegistry.instance().addNameForObject(blocks, "ja_JP", "s");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockt, "t");
	  	LanguageRegistry.instance().addNameForObject(blockt, "ja_JP", "t");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocku, "u");
	  	LanguageRegistry.instance().addNameForObject(blocku, "ja_JP", "u");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockv, "v");
	  	LanguageRegistry.instance().addNameForObject(blockv, "ja_JP", "v");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockw, "w");
	  	LanguageRegistry.instance().addNameForObject(blockw, "ja_JP", "w");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockx, "x");
	  	LanguageRegistry.instance().addNameForObject(blockx, "ja_JP", "x");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocky, "y");
	  	LanguageRegistry.instance().addNameForObject(blocky, "ja_JP", "y");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockz, "z");
	  	LanguageRegistry.instance().addNameForObject(blockz, "ja_JP", "z");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockand, "&");
	  	LanguageRegistry.instance().addNameForObject(blockand, "ja_JP", "&");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockex, "!");
	  	LanguageRegistry.instance().addNameForObject(blockex, "ja_JP", "!");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockque, "?");
	  	LanguageRegistry.instance().addNameForObject(blockque, "ja_JP", "?");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockper, ".");
	  	LanguageRegistry.instance().addNameForObject(blockper, "ja_JP", ".");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockcom, ",");
	  	LanguageRegistry.instance().addNameForObject(blockcom, "ja_JP", ",");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockat, "@");
	  	LanguageRegistry.instance().addNameForObject(blockat, "ja_JP", "@");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockbrs, "[");
	  	LanguageRegistry.instance().addNameForObject(blockbrs, "ja_JP", "「");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockbre, "]");
	  	LanguageRegistry.instance().addNameForObject(blockbre, "ja_JP", "」");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockas, "*");
	  	LanguageRegistry.instance().addNameForObject(blockas, "ja_JP", "*");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockpas, "(");
	  	LanguageRegistry.instance().addNameForObject(blockpae, "ja_JP", "(");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockpae, ")");
	  	LanguageRegistry.instance().addNameForObject(blockpae, "ja_JP", ")");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockpes, "%");
	  	LanguageRegistry.instance().addNameForObject(blockpes, "ja_JP", "%");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockdol, "$");
	  	LanguageRegistry.instance().addNameForObject(blockdol, "ja_JP", "$");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockyen, "yen");
	  	LanguageRegistry.instance().addNameForObject(blockyen, "ja_JP", "yen");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockpl, "+");
	  	LanguageRegistry.instance().addNameForObject(blockpl, "ja_JP", "+");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockmin, "-");
	  	LanguageRegistry.instance().addNameForObject(blockmin, "ja_JP", "-");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockmul, "�~");
	  	LanguageRegistry.instance().addNameForObject(blockmul, "ja_JP", "�~");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockdiv, "��");
	  	LanguageRegistry.instance().addNameForObject(blockdiv, "ja_JP", "��");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockeq, "=");
	  	LanguageRegistry.instance().addNameForObject(blockeq, "ja_JP", "=");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(block1, "1");
	  	LanguageRegistry.instance().addNameForObject(block1, "ja_JP", "1");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(block2, "2");
	  	LanguageRegistry.instance().addNameForObject(block2, "ja_JP", "2");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(block3, "3");
	  	LanguageRegistry.instance().addNameForObject(block3, "ja_JP", "3");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(block3, "3");
	  	LanguageRegistry.instance().addNameForObject(block3, "ja_JP", "3");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(block4, "4");
	  	LanguageRegistry.instance().addNameForObject(block4, "ja_JP", "4");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(block5, "5");
	  	LanguageRegistry.instance().addNameForObject(block5, "ja_JP", "5");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(block5, "5");
	  	LanguageRegistry.instance().addNameForObject(block5, "ja_JP", "5");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(block6, "6");
	  	LanguageRegistry.instance().addNameForObject(block6, "ja_JP", "6");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(block7, "7");
	  	LanguageRegistry.instance().addNameForObject(block7, "ja_JP", "7");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(block8, "8");
	  	LanguageRegistry.instance().addNameForObject(block8, "ja_JP", "8");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(block9, "9");
	  	LanguageRegistry.instance().addNameForObject(block9, "ja_JP", "9");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(block0, "0");
	  	LanguageRegistry.instance().addNameForObject(block0, "ja_JP", "0");
	  	
		//�\�����̓o�^
		LanguageRegistry.addName(blockac, "A");
		LanguageRegistry.instance().addNameForObject(blockac, "ja_JP", "A");
	
		//�\�����̓o�^
	    LanguageRegistry.addName(blockbc, "B");
	    LanguageRegistry.instance().addNameForObject(blockbc, "ja_JP", "B");
	    
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockcc, "C");
	  	LanguageRegistry.instance().addNameForObject(blockcc, "ja_JP", "C");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockdc, "D");
	  	LanguageRegistry.instance().addNameForObject(blockdc, "ja_JP", "D");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockec, "E");
	  	LanguageRegistry.instance().addNameForObject(blockec, "ja_JP", "E");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockfc, "F");
	  	LanguageRegistry.instance().addNameForObject(blockfc, "ja_JP", "F");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockgc, "G");
	  	LanguageRegistry.instance().addNameForObject(blockgc, "ja_JP", "G");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockhc, "H");
	  	LanguageRegistry.instance().addNameForObject(blockhc, "ja_JP", "H");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockic, "I");
	  	LanguageRegistry.instance().addNameForObject(blockic, "ja_JP", "I");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockjc, "J");
	  	LanguageRegistry.instance().addNameForObject(blockjc, "ja_JP", "J");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockkc, "K");
	  	LanguageRegistry.instance().addNameForObject(blockkc, "ja_JP", "K");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocklc, "L");
	  	LanguageRegistry.instance().addNameForObject(blocklc, "ja_JP", "L");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockmc, "M");
	  	LanguageRegistry.instance().addNameForObject(blockmc, "ja_JP", "M");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocknc, "N");
	  	LanguageRegistry.instance().addNameForObject(blocknc, "ja_JP", "N");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockoc, "O");
	  	LanguageRegistry.instance().addNameForObject(blockoc, "ja_JP", "O");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockpc, "P");
	  	LanguageRegistry.instance().addNameForObject(blockpc, "ja_JP", "P");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockqc, "Q");
	  	LanguageRegistry.instance().addNameForObject(blockqc, "ja_JP", "Q");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockrc, "R");
	  	LanguageRegistry.instance().addNameForObject(blockrc, "ja_JP", "R");
	    
	  	//�\�����̓o�^
	  	LanguageRegistry.addName(blocksc, "S");
	  	LanguageRegistry.instance().addNameForObject(blocksc, "ja_JP", "S");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocktc, "T");
	  	LanguageRegistry.instance().addNameForObject(blocktc, "ja_JP", "T");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockuc, "U");
	  	LanguageRegistry.instance().addNameForObject(blockuc, "ja_JP", "U");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockvc, "V");
	  	LanguageRegistry.instance().addNameForObject(blockvc, "ja_JP", "V");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockwc, "W");
	  	LanguageRegistry.instance().addNameForObject(blockwc, "ja_JP", "W");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockxc, "X");
	  	LanguageRegistry.instance().addNameForObject(blockxc, "ja_JP", "X");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockyc, "Y");
	  	LanguageRegistry.instance().addNameForObject(blockyc, "ja_JP", "Y");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockzc, "Z");
	  	LanguageRegistry.instance().addNameForObject(blockzc, "ja_JP", "Z");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockah, "a_jp");
	  	LanguageRegistry.instance().addNameForObject(blockah, "ja_JP", "あ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockih, "i_jp");
	  	LanguageRegistry.instance().addNameForObject(blockih, "ja_JP", "い");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockuh, "u_jp");
	  	LanguageRegistry.instance().addNameForObject(blockuh, "ja_JP", "う");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockeh, "e_jp");
	  	LanguageRegistry.instance().addNameForObject(blockeh, "ja_JP", "え");
	    
	  	//�\�����̓o�^
	  	LanguageRegistry.addName(blockoh, "o_jp");
	  	LanguageRegistry.instance().addNameForObject(blockoh, "ja_JP", "お");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockkah, "ka_jp");
	  	LanguageRegistry.instance().addNameForObject(blockkah, "ja_JP", "か");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockkih, "ki_jp");
	  	LanguageRegistry.instance().addNameForObject(blockkih, "ja_JP", "き");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockkuh, "ku_jp");
	  	LanguageRegistry.instance().addNameForObject(blockkuh, "ja_JP", "く");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockkeh, "ke_jp");
	  	LanguageRegistry.instance().addNameForObject(blockkeh, "ja_JP", "け");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockkoh, "ko_jp");
	  	LanguageRegistry.instance().addNameForObject(blockkoh, "ja_JP", "こ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocksah, "sa_jp");
	  	LanguageRegistry.instance().addNameForObject(blocksah, "ja_JP", "さ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocksih, "si_jp");
	  	LanguageRegistry.instance().addNameForObject(blocksih, "ja_JP", "し");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocksuh, "su_jp");
	  	LanguageRegistry.instance().addNameForObject(blocksuh, "ja_JP", "す");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockseh, "se_jp");
	  	LanguageRegistry.instance().addNameForObject(blockseh, "ja_JP", "せ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocksoh, "so_jp");
	  	LanguageRegistry.instance().addNameForObject(blocksoh, "ja_JP", "そ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocktah, "ta_jp");
	  	LanguageRegistry.instance().addNameForObject(blocktah, "ja_JP", "た");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocktih, "ti_jp");
	  	LanguageRegistry.instance().addNameForObject(blocktih, "ja_JP", "ち");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocktuh, "tu_jp");
	  	LanguageRegistry.instance().addNameForObject(blocktuh, "ja_JP", "つ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockteh, "te_jp");
	  	LanguageRegistry.instance().addNameForObject(blockteh, "ja_JP", "て");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocktoh, "to_jp");
	  	LanguageRegistry.instance().addNameForObject(blocktoh, "ja_JP", "と");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocknah, "na_jp");
	  	LanguageRegistry.instance().addNameForObject(blocknah, "ja_JP", "な");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocknih, "ni_jp");
	  	LanguageRegistry.instance().addNameForObject(blocknih, "ja_JP", "に");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocknuh, "nu_jp");
	  	LanguageRegistry.instance().addNameForObject(blocknuh, "ja_JP", "ぬ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockneh, "ne_jp");
	  	LanguageRegistry.instance().addNameForObject(blockneh, "ja_JP", "ね");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocknoh, "no_jp");
	  	LanguageRegistry.instance().addNameForObject(blocknoh, "ja_JP", "の");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockhah, "ha_jp");
	  	LanguageRegistry.instance().addNameForObject(blockhah, "ja_JP", "は");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockhih, "hi_jp");
	  	LanguageRegistry.instance().addNameForObject(blockhih, "ja_JP", "ひ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockhuh, "hu_jp");
	  	LanguageRegistry.instance().addNameForObject(blockhuh, "ja_JP", "ふ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockheh, "he_jp");
	  	LanguageRegistry.instance().addNameForObject(blockheh, "ja_JP", "へ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockhoh, "ho_jp");
	  	LanguageRegistry.instance().addNameForObject(blockhoh, "ja_JP", "ほ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockmah, "ma_jp");
	  	LanguageRegistry.instance().addNameForObject(blockmah, "ja_JP", "ま");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockmih, "mi_jp");
	  	LanguageRegistry.instance().addNameForObject(blockmih, "ja_JP", "み");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockmuh, "mu_jp");
	  	LanguageRegistry.instance().addNameForObject(blockmuh, "ja_JP", "む");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockmeh, "me_jp");
	  	LanguageRegistry.instance().addNameForObject(blockmeh, "ja_JP", "め");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockmoh, "mo_jp");
	  	LanguageRegistry.instance().addNameForObject(blockmoh, "ja_JP", "も");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockyah, "ya_jp");
	  	LanguageRegistry.instance().addNameForObject(blockyah, "ja_JP", "や");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockyuh, "yu_jp");
	  	LanguageRegistry.instance().addNameForObject(blockyuh, "ja_JP", "ゆ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockyoh, "yo_jp");
	  	LanguageRegistry.instance().addNameForObject(blockyoh, "ja_JP", "よ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockrah, "ra_jp");
	  	LanguageRegistry.instance().addNameForObject(blockrah, "ja_JP", "ら");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockrih, "ri_jp");
	  	LanguageRegistry.instance().addNameForObject(blockrih, "ja_JP", "り");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockruh, "ru_jp");
	  	LanguageRegistry.instance().addNameForObject(blockruh, "ja_JP", "る");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockreh, "re_jp");
	  	LanguageRegistry.instance().addNameForObject(blockreh, "ja_JP", "れ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockroh, "ro_jp");
	  	LanguageRegistry.instance().addNameForObject(blockroh, "ja_JP", "ろ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockwah, "wa_jp");
	  	LanguageRegistry.instance().addNameForObject(blockwah, "ja_JP", "わ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockwoh, "wo_jp");
	  	LanguageRegistry.instance().addNameForObject(blockwoh, "ja_JP", "を");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocknnh, "n_jp");
	  	LanguageRegistry.instance().addNameForObject(blocknnh, "ja_JP", "ん");
	  	
	  	//�\�����̓o�^
	  	LanguageRegistry.addName(blockgah, "ga_jp");
	  	LanguageRegistry.instance().addNameForObject(blockgah, "ja_JP", "が");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockgih, "gi_jp");
	  	LanguageRegistry.instance().addNameForObject(blockgih, "ja_JP", "ぎ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockguh, "gu_jp");
	  	LanguageRegistry.instance().addNameForObject(blockguh, "ja_JP", "ぐ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockgeh, "ge_jp");
	  	LanguageRegistry.instance().addNameForObject(blockgeh, "ja_JP", "げ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockgoh, "go_jp");
	  	LanguageRegistry.instance().addNameForObject(blockgoh, "ja_JP", "ご");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockzah, "za_jp");
	  	LanguageRegistry.instance().addNameForObject(blockzah, "ja_JP", "ざ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockzih, "zi_jp");
	  	LanguageRegistry.instance().addNameForObject(blockzih, "ja_JP", "じ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockzuh, "zu_jp");
	  	LanguageRegistry.instance().addNameForObject(blockzuh, "ja_JP", "ず");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockzeh, "ze_jp");
	  	LanguageRegistry.instance().addNameForObject(blockzeh, "ja_JP", "ぜ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockzoh, "zo_jp");
	  	LanguageRegistry.instance().addNameForObject(blockzoh, "ja_JP", "ぞ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockdah, "da_jp");
	  	LanguageRegistry.instance().addNameForObject(blockdah, "ja_JP", "だ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockdih, "di_jp");
	  	LanguageRegistry.instance().addNameForObject(blockdih, "ja_JP", "ぢ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockduh, "du_jp");
	  	LanguageRegistry.instance().addNameForObject(blockduh, "ja_JP", "づ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockdeh, "de_jp");
	  	LanguageRegistry.instance().addNameForObject(blockdeh, "ja_JP", "で");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockdoh, "do_jp");
	  	LanguageRegistry.instance().addNameForObject(blockdoh, "ja_JP", "ど");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockbah, "ba_jp");
	  	LanguageRegistry.instance().addNameForObject(blockbah, "ja_JP", "ば");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockbih, "bi_jp");
	  	LanguageRegistry.instance().addNameForObject(blockbih, "ja_JP", "び");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockbuh, "bu_jp");
	  	LanguageRegistry.instance().addNameForObject(blockbuh, "ja_JP", "ぶ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockbeh, "be_jp");
	  	LanguageRegistry.instance().addNameForObject(blockbeh, "ja_JP", "べ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockboh, "bo_jp");
	  	LanguageRegistry.instance().addNameForObject(blockboh, "ja_JP", "ぼ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockpah, "pa_jp");
	  	LanguageRegistry.instance().addNameForObject(blockpah, "ja_JP", "ぱ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockpih, "pi_jp");
	  	LanguageRegistry.instance().addNameForObject(blockpih, "ja_JP", "ぴ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockpuh, "pu_jp");
	  	LanguageRegistry.instance().addNameForObject(blockpuh, "ja_JP", "ぷ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockpeh, "pe_jp");
	  	LanguageRegistry.instance().addNameForObject(blockpeh, "ja_JP", "ぺ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockpoh, "po_jp");
	  	LanguageRegistry.instance().addNameForObject(blockpoh, "ja_JP", "ぽ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockxah, "xa_jp");
	  	LanguageRegistry.instance().addNameForObject(blockxah, "ja_JP", "ぁ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockxih, "xi_jp");
	  	LanguageRegistry.instance().addNameForObject(blockxih, "ja_JP", "ぃ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockxuh, "xu_jp");
	  	LanguageRegistry.instance().addNameForObject(blockxuh, "ja_JP", "ぅ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockxeh, "xe_jp");
	  	LanguageRegistry.instance().addNameForObject(blockxeh, "ja_JP", "ぇ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockxoh, "xo_jp");
	  	LanguageRegistry.instance().addNameForObject(blockxoh, "ja_JP", "ぉ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockxtuh, "xtu_jp");
	  	LanguageRegistry.instance().addNameForObject(blockxtuh, "ja_JP", "っ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockxyah, "xya_jp");
	  	LanguageRegistry.instance().addNameForObject(blockxyah, "ja_JP", "ゃ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockxyuh, "xyu_jp");
	  	LanguageRegistry.instance().addNameForObject(blockxyuh, "ja_JP", "ゅ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockxyoh, "xyo_jp");
	  	LanguageRegistry.instance().addNameForObject(blockxyoh, "ja_JP", "ょ");
	  	
	  //�\�����̓o�^
	  	LanguageRegistry.addName(blockak, "a_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockak, "ja_JP", "ア");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockik, "i_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockik, "ja_JP", "イ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockuk, "u_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockuk, "ja_JP", "ウ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockek, "e_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockek, "ja_JP", "エ");
	    
	  	//�\�����̓o�^
	  	LanguageRegistry.addName(blockok, "o_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockok, "ja_JP", "オ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockkak, "kak_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockkak, "ja_JP", "カ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockkik, "ki_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockkik, "ja_JP", "キ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockkuk, "ku_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockkuk, "ja_JP", "ク");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockkek, "ke_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockkek, "ja_JP", "ケ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockkok, "ko_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockkok, "ja_JP", "コ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocksak, "sa_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blocksak, "ja_JP", "サ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocksik, "si_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blocksik, "ja_JP", "シ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocksuk, "su_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blocksuk, "ja_JP", "ス");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocksek, "se_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blocksek, "ja_JP", "セ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocksok, "so_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blocksok, "ja_JP", "ソ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocktak, "ta_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blocktak, "ja_JP", "タ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocktik, "ti_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blocktik, "ja_JP", "チ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocktuk, "tu_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blocktuk, "ja_JP", "ツ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocktek, "te_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blocktek, "ja_JP", "テ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocktok, "to_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blocktok, "ja_JP", "ト");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocknak, "na_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blocknak, "ja_JP", "ナ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocknik, "ni_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blocknik, "ja_JP", "ニ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocknuk, "nu_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blocknuk, "ja_JP", "ヌ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocknek, "ne_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blocknek, "ja_JP", "ネ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocknok, "no_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blocknok, "ja_JP", "ノ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockhak, "ha_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockhak, "ja_JP", "ハ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockhik, "hi_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockhik, "ja_JP", "ヒ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockhuk, "hu_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockhuk, "ja_JP", "フ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockhek, "he_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockhek, "ja_JP", "ヘ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockhok, "ho_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockhok, "ja_JP", "ホ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockmak, "ma_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockmak, "ja_JP", "マ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockmik, "mi_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockmik, "ja_JP", "ミ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockmuk, "mu_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockmuk, "ja_JP", "ム");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockmek, "me_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockmek, "ja_JP", "メ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockmok, "mo_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockmok, "ja_JP", "モ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockyak, "ya_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockyak, "ja_JP", "ヤ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockyuk, "yu_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockyuk, "ja_JP", "ユ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockyok, "yo_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockyok, "ja_JP", "ヨ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockrak, "ra_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockrak, "ja_JP", "ラ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockrik, "ri_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockrik, "ja_JP", "リ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockruk, "ru_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockruk, "ja_JP", "ル");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockrek, "re_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockrek, "ja_JP", "レ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockrok, "ro_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockrok, "ja_JP", "ロ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockwak, "wa_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockwak, "ja_JP", "ワ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockwok, "wo_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockwok, "ja_JP", "ヲ");

	    //�\�����̓o�^
	  	LanguageRegistry.addName(blocknnk, "n_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blocknnk, "ja_JP", "ン");
	  	
	  	//�\�����̓o�^
	  	LanguageRegistry.addName(blockgak, "ga_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockgak, "ja_JP", "ガ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockgik, "gi_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockgik, "ja_JP", "ギ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockguk, "gu_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockguk, "ja_JP", "グ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockgek, "ge_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockgek, "ja_JP", "ゲ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockgok, "go_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockgok, "ja_JP", "ゴ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockzak, "za_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockzak, "ja_JP", "ザ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockzik, "zi_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockzik, "ja_JP", "ジ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockzuk, "zu_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockzuk, "ja_JP", "ズ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockzek, "ze_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockzek, "ja_JP", "ゼ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockzok, "zo_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockzok, "ja_JP", "ゾ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockdak, "da_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockdak, "ja_JP", "ダ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockdik, "di_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockdik, "ja_JP", "ヂ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockduk, "du_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockduk, "ja_JP", "ヅ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockdek, "de_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockdek, "ja_JP", "デ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockdok, "do_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockdok, "ja_JP", "ド");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockbak, "ba_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockbak, "ja_JP", "バ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockbik, "bi_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockbik, "ja_JP", "ビ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockbuk, "bu_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockbuk, "ja_JP", "ブ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockbek, "be_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockbek, "ja_JP", "ベ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockbok, "bo_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockbok, "ja_JP", "ボ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockpak, "pa_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockpak, "ja_JP", "パ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockpik, "pi_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockpik, "ja_JP", "ピ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockpuk, "pu_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockpuk, "ja_JP", "プ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockpek, "pe_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockpek, "ja_JP", "ペ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockpok, "po_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockpok, "ja_JP", "ポ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockxak, "xa_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockxak, "ja_JP", "ァ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockxik, "xi_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockxik, "ja_JP", "ィ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockxuk, "xu_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockxuk, "ja_JP", "ゥ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockxek, "xe_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockxek, "ja_JP", "ェ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockxok, "xo_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockxok, "ja_JP", "ォ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockxtuk, "xtu_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockxtuk, "ja_JP", "ッ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockxyak, "xya_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockxyak, "ja_JP", "ャ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockxyuk, "xyu_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockxyuk, "ja_JP", "ュ");
	  	
	    //�\�����̓o�^
	  	LanguageRegistry.addName(blockxyok, "xyo_jp_k");
	  	LanguageRegistry.instance().addNameForObject(blockxyok, "ja_JP", "ョ");
	  	
	    
	  	
	  	
	}
	
	
 


	
	
}
