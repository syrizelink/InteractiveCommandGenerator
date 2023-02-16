package syrize.InteractiveCommandGenerator;

import java.util.List;

/**
 * @author Syrize
 */
public class OptionAnimation {
    static int num = 0;
    static String CSelected, CNotSelected;
    public void switchingEffect(List<String> op, int status){
        CSelected = "◈";
        CNotSelected = "◇";
        switch (status){
            default: {
                while (num < op.size()){
                    System.out.println(op.get(num));
                    num++;
                }
                break;
            }

            case 1: {
                while (num < op.size()){
                    System.out.println(op.get(num));
                    num++;
                }

            }
        }
    }
}
