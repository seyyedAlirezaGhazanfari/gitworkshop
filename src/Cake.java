import java.util.Arrays;
class Cake{
    public static void main(String[] args) {
        int[] array = {1,2,3};
        int[] gh = Arrays.copyOfRange(array,0,array.length);
        System.out.println(gh[1]);
    }
}