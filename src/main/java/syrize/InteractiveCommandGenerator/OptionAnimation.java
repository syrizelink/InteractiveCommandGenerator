package syrize.InteractiveCommandGenerator;

import java.util.List;

public class OptionAnimation {
    static int num = 0;
    static String CSelected, CNotSelected;
    public void switchingEffect(List<String> op, int Status){
        CSelected = "◈";
        CNotSelected = "◇";
        switch (Status){
            case 0: {
                while (num < op.size()){
                    System.out.println(op.get(num));
                    num++;
                }
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
