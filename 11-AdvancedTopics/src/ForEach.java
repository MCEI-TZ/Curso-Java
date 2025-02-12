public class ForEach {
    public static void main(String[] args) {
        int[] ages = {1, 2, 3, 4, 5};

        for (var age : ages){
            System.out.print(" Age: "+ age); //prints each number individually
        }
    }
}
