public class ATM {

    public int countBanknotes(int sum) {
      
      int[] atm = new int[]{500, 200, 100, 50, 20, 10, 5, 2, 1};

        int result = 0;
        int counter = 0;

        int[] valuables = new int[atm.length];

        while (sum >= 1) {
            valuables[counter] = sum / atm[counter];
            result += valuables[counter];
            sum -= valuables[counter] * atm[counter];
            counter++;
            if (sum < atm[counter]) {
                if(sum == 1) {
                    result++;
                    valuables[8] = 1;
                    break;
                }
                counter++;
            }
        }   
    return result;
    }

}
