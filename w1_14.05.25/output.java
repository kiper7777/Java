public class output {
    public static void main(String[] args) {
        // System.out.println("I am in SAE" + x);
        // System.out.println("We are learning Java");
        // System.out.println("We are learning Java");

        // System.out.printf("the value of x is %d", x);
        // System.out.printf("the value of x is %d", x);

        // System.out.print("I am in SAE" + x);

        String name = new String("SAE");
        System.out.println(name);

        String namestr = "harrypoter";
        System.out.println(namestr);

        int len = namestr.length();
        System.out.println(len);

        // concatination
        String fName = "John";
        String lName = "Smith";
        System.out.println(fName.concat(lName));

        // to lower and to upper
        System.out.println(fName.toLowerCase());
        System.out.println(fName.toUpperCase());

        // trim()
        String a = "     java        ";
        System.out.println(a);
        System.out.println(a.trim());
        System.out.println(a);

        // substring()
        String name1 = "SAELondon";
        System.out.println(name1.substring(2));
        System.out.println(name1.substring(1, 4));

        // replace()
        String strname = "harry";
        System.out.println(strname.replace('r', 'p'));

        String n = "SAELondon";
        System.out.println(n.replace("London", "Liverpool"));

        // startsWith()
        String name2 = "SAELondon";
        System.out.println(name2.startsWith("SAE"));

        // endsWith()
        String name3 = "SAELondon";
        System.out.println(name3.endsWith("London"));

        // charAt()
        System.out.println(n.charAt(2));

        // indexOf()
        String nameStr = "Harrypoter";
        System.out.println(nameStr.indexOf("r"));

        String nameStr1 = "Harryarrypoter";
        System.out.println(nameStr1.indexOf("arry"));
        System.out.println(nameStr1.indexOf("arr", 4));

        // trim()
        System.out.println(nameStr.lastIndexOf("a"));

        // equals()
        System.out.println(name.equals("SAE"));

        // isEmpty()
        String Str1 = "Hello";
        System.out.println(Str1.isEmpty());

        String Str2 = "";
        System.out.println(Str2.isEmpty());

    }
}
