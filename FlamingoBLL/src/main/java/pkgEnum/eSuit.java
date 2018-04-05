package pkgEnum;

public enum eSuit {
	DIAMONDS(0), CLUBS(1), HEARTS(2), SPADES(3);
	
	private int iSuitNbr;
	
	private eSuit(int iSuitNbr)
	{
		this.iSuitNbr = iSuitNbr;
	}
	
	public int getiSuitNbr()
	{
		return iSuitNbr;
	}
}


