package net.car12man.statussigns;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class StatusSigns extends JavaPlugin
  implements Listener
{
  public void onDisable()
  {
  }

  public void onEnable()
  {
    getServer().getPluginManager().registerEvents(this, this);
  }

  
  @EventHandler
  public void onSignChange(SignChangeEvent e)
  {
    if (e.getLine(0).equalsIgnoreCase("[tf2]")) {
    	  e.setLine(0, "§0§l-TF2 STATS-");
    	  if (e.getLine(1).equalsIgnoreCase("-"))
    		  e.setLine(1, "§2§lOnline");
    	  if (e.getLine(2).equalsIgnoreCase("-"))
    		  e.setLine(2, "§8§l?/?");
    	  if (e.getLine(3).equalsIgnoreCase("-"))
    		  e.setLine(3, "§f§lTF2 Server!");
    }  
    if (e.getLine(0).equalsIgnoreCase("[rpc]")) {
    	  e.setLine(0, "§0§l-RPC STATS-");
    	  if (e.getLine(1).equalsIgnoreCase("-"))
    		  e.setLine(1, "§2§lOnline");
    	  if (e.getLine(2).equalsIgnoreCase("-"))
    		  e.setLine(2, "§8§l?/?");
    	  if (e.getLine(3).equalsIgnoreCase("-"))
    		  e.setLine(3, "§f§lRPC Server!");
    }
    if (e.getLine(0).equalsIgnoreCase("[chb]")) {
    	  e.setLine(0, "§0§l-CHB STATS-");
    	  if (e.getLine(1).equalsIgnoreCase("-"))
    		  e.setLine(1, "§2§lOnline");
    	  if (e.getLine(2).equalsIgnoreCase("-"))
    		  e.setLine(2, "§8§l0/5");
    	  if (e.getLine(3).equalsIgnoreCase("-"))
    		  e.setLine(3, "§f§lCHB Server!");
    }
    if (e.getLine(0).equalsIgnoreCase("[idk]")) {
    	  e.setLine(0, "§0§l-IDK STATS-");
    	  if (e.getLine(1).equalsIgnoreCase("-"))
    		  e.setLine(1, "§4§lOffline");
    	  if (e.getLine(2).equalsIgnoreCase("-"))
    		  e.setLine(2, "§8§l0/0");
    	  if (e.getLine(3).equalsIgnoreCase("-"))
    		  e.setLine(3, "§f§lNothing...!");
    }
    return;
  }
}