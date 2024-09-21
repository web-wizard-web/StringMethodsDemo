public class stringmethods {
    public static void main(String[]args)
    {
        String name=new String("Shreeya");
        String l= name.toLowerCase();
        System.out.println(l);
        String u=name.toUpperCase();
        System.out.println(u);
        int value=name.length();
        System.out.println(value);
        System.out.println(name.substring(2,6));
        System.out.println(name.indexOf('e'));
        System.out.println(name.charAt(5));
        System.out.println(name.replace('e','i'));
        System.out.println(name.startsWith("Sh"));
        System.out.println(name.endsWith("ya"));
        String modifiedname="gayatri";
        System.out.println(modifiedname.equals("Shreeya"));
        System.out.println(name.equalsIgnoreCase("shreeya"));

    

    }
    
}
