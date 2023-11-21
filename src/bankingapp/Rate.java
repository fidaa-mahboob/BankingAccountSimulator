package bankingapp;

public interface Rate {
    default double getBaseRate(){
        return 2.5;
    }



}
