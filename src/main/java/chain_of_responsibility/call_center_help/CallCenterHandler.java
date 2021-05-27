package chain_of_responsibility.call_center_help;

public class CallCenterHandler extends HelpHandler{

    @Override
    public boolean help(String helpRequest) {
        if(helpRequest.equals("CallCenterHelp")){
            System.out.println("Help from call center arrived");
            return true;
        }
        return checkNext(helpRequest);
    }
}
