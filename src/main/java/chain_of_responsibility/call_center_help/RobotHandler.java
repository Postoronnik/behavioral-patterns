package chain_of_responsibility.call_center_help;

public class RobotHandler extends HelpHandler{
    @Override
    public boolean help(String helpRequest) {
        if(helpRequest.equals("RobotHelp")){
            System.out.println("Help from robot arrived");
            return true;
        }
        return checkNext(helpRequest);
    }
}
