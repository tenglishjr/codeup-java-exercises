public class ServerNameGenerator {

    private static String[] adjectives = {
            "hairy",
            "quiet",
            "silky",
            "terse",
            "short",
            "bubbly",
            "round",
            "mighty",
            "fierce",
            "happy"
    };

    private static String[] nouns = {
            "catapult",
            "saddle",
            "bucket",
            "ball",
            "zebra",
            "pencil",
            "sword",
            "shield",
            "cup",
            "duck"
    };

    public static String returnElement (String[] strings) {
        int index = (int) (Math.random() * (strings.length - 1)) + 1;
        return strings[index];
    }

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Here is your server name:");
        System.out.println(ServerNameGenerator.returnElement(adjectives) + "-" + ServerNameGenerator.returnElement(nouns));

    }


}
