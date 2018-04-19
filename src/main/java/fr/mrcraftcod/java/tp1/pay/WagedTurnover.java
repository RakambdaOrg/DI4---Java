package fr.mrcraftcod.java.tp1.pay;

/**
 * Created by Thomas Couchoud (MrCraftCod - zerderr@gmail.com) on 19/04/2018.
 *
 * @author Thomas Couchoud
 * @since 2018-04-19
 */
public interface WagedTurnover extends Waged
{
	@Override
	default double getWage()
	{
		return getTurnoverPercentage() * getTurnover();
	}
	
	double getTurnover();
	
	double getTurnoverPercentage();
}
