public class ChatBot {

    public ChatBot(String input)
    {
        if (input.equals("f"))
        {
            fact();
        }
        if (input.equals("w"))
        {
            weather();
        }
        if (input.equals("h"))
        {
            hug();
        }
    }

    public void fact()
    {
        System.out.println("If you yelled for 8 years, 7 months and 6 days, you'd have created enough sound energy to heat up a cup of tea.");
    }
    public void weather()
    {
        System.out.println("The air is at a temperature, and the wind is winding.");
    }
    public void hug()
    {
        System.out.println("Bro? you really tried? smh");
    }


}
