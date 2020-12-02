public class Government {
    //instance variable
    public String party;
    //class variable
    private static Government government;

    private  Government() {

    }

    //class method
    public static Government getInstance(){
        if(government == null){
            government = new Government();
        }
        return government;
    }
}
