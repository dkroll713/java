import javax.swing.JOptionPane;

public class ParallelArraysDiscount {
    public static void main(String[] args) throws Exception{
        int[] discRangeLimits={1,20,50,100,200};
        double[] discountRates={0.00,0.10,0.14,0.18,0.20};
        double customerDiscount;
        String strNumOrdered;
        int numOrdered;
        int sub=discRangeLimits.length-1;

        strNumOrdered=JOptionPane.showInputDialog("How many items are ordered?");
        numOrdered=Integer.parseInt(strNumOrdered);

        while(sub>=0 && numOrdered<discRangeLimits[sub]){
            sub--;
        }

        customerDiscount=discountRates[sub];
        JOptionPane.showMessageDialog(null,"Discount rate for "+numOrdered+" items is "+customerDiscount);
    }
}
