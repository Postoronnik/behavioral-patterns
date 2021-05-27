package chain_of_responsibility.call_center_help;

public class SpecialistHelpHandler extends HelpHandler {
    @Override
    public boolean help(String helpRequest) {
        if(helpRequest.equals("SpecialistHelp")){
            System.out.println("Help from specialist arrived");
            return true;
        }
        return checkNext(helpRequest);
    }
}
