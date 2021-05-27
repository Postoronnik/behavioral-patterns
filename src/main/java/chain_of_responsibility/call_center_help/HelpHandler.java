package chain_of_responsibility.call_center_help;

public abstract class HelpHandler {
    private HelpHandler next;

    public HelpHandler linkWith(HelpHandler next){
        this.next = next;
        return next;
    }

    public boolean checkNext(String helpRequest){
        if(next == null){
            System.out.println("No help with your problem");
            return true;
        }

        return next.help(helpRequest);
    }

    public abstract boolean help(String helpRequest);
}
