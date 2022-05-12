package Day_6;

public class PermutationSequence {
    public static String getPermutation(int n, int k) {
        StringBuilder sb=new StringBuilder();
        int [] elements = new int [n];
        int totalNumber = 1, block=0, assigned=0, remindK = k,rest=n;
        for (int i=1;i<=rest;i++) {
            elements[i-1] = i;
        }
        while (rest>0) {
            totalNumber=1;
            for (int i=1;i<=rest;i++) {
                totalNumber*=i;
            }
            if (totalNumber==1) {
                assigned = elements[0];
                sb.append( assigned );
                break;
            }
            block =totalNumber/rest;

            int newID = (int) Math.ceil( (double) remindK/block)-1;
            assigned = elements[newID];
            remindK = remindK - block*newID;
            sb.append( assigned );

            elements[newID]= 0; // replace the used number as 0
            for (int i=newID;i<rest-1;i++) {
                elements[i] = elements[i+1];
            }
            elements[rest-1] = 0;
            rest--;
        }

        String ans = sb.toString();
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(getPermutation(3, 3));
        System.out.println(getPermutation(4, 9));
        System.out.println(getPermutation(3, 1));
    }
}
