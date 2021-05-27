package chain_of_responsibility.start.point;

import chain_of_responsibility.call_center_help.CallCenterHandler;
import chain_of_responsibility.call_center_help.HelpHandler;
import chain_of_responsibility.call_center_help.RobotHandler;
import chain_of_responsibility.call_center_help.SpecialistHelpHandler;


public class Main {
    public static void main(String[] args) {
        HelpHandler helpHandler = new RobotHandler();
        helpHandler.linkWith(new CallCenterHandler())
                .linkWith(new SpecialistHelpHandler());

        helpHandler.help("RobotHelp");

        helpHandler.help("CallCenterHelp");

        helpHandler.help("SpecialistHelp");

        helpHandler.help("TooHardProblem");
    }
}
