public class ServerNameGenerator {

    public static void main(String[] args) {

        String[] adjectives = {"hairy", "quiet", "silky", "terse", "short", "bubbly", "round", "mighty", "fierce", "happy"};
        String[] nouns = {"catapult", "saddle", "bucket", "ball", "zebra", "pencil", "sword", "shield", "cup", "duck"};

        System.out.println();
        System.out.println("Here is your server name:");
        System.out.println(returnElement(adjectives) + "-" + returnElement(nouns));

    }

    public static String returnElement (String[] array) {
        int index = (int) (Math.random() * (array.length - 1)) + 1;
        return array[index];
    }

}
