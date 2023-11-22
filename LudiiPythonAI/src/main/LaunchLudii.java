package main;

import ai.UCTpyR;
import ai.LudiiPythonAI;
import app.StartDesktopApp;
import manager.ai.AIRegistry;

/**
 * The main method of this launches the Ludii application with its GUI, and registers
 * the example AIs from this project such that they are available inside the GUI.
 *
 * @author Dennis Soemers
 */
public class LaunchLudii
{
	
	/**
	 * The main method
	 * @param args
	 */
	public static void main(final String[] args)
	{
		// Register our example AIs
		if (!AIRegistry.registerAI("UCTpyR", () -> {return new UCTpyR();}, (game) -> {return new LudiiPythonAI().supportsGame(game);}))
			System.err.println("WARNING! Failed to register AI because one with that name already existed!");
                
                if (!AIRegistry.registerAI("UCTpy", () -> {return new LudiiPythonAI();}, (game) -> {return new LudiiPythonAI().supportsGame(game);}))
			System.err.println("WARNING! Failed to register AI because one with that name already existed!");
                
		// Run Ludii
		StartDesktopApp.main(new String[0]);
	}

}
