package data_types;

public class primitive {

    public static void main (String[] args) {
        
        byte byte1 = -12; // -128 to 127

        short short1 = 300; // -32768 to 32767

        int int1 = -100000; // +- 2147483647 [2 billion]

        long long1 = 999999999999L; // +- 92 billion billion or [2^63]-1, Numbers bigger than 2147483647 need an L at the end

        float lingy = byte1+short1/int1-long1;

        System.out.println(long1-lingy);
    }
    
}
