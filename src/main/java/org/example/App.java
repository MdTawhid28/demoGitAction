package org.example;

public class App 
{
    public static void main( String[] args )
    {
        String env=System.getenv("$ENVIORNMENT");
        String baseUrl="";
        if(env !=null && !(env.equals(""))){
            if(env.equals("dev")){
                System.setProperty("baseUrl",System.getenv("myBaseurl1"));
            }
            else{
                System.setProperty("baseUrl",System.getenv("myBaseurl2"));
            }
            baseUrl=System.getenv("baseUrl");
        }
        else{
            baseUrl="common";
        }

        System.out.println(baseUrl);
    }
}
