package syrize.InteractiveCommandGenerator;


import org.jline.reader.LineReader;
import org.jline.reader.LineReaderBuilder;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Console {
    static List<String> optionMain = new ArrayList<>();
    static String prompt, op1, op2, op3;
    public static void main(String[] args) throws IOException {
        Terminal terminal = TerminalBuilder.builder().system(true).build();
        LineReader lineReader = LineReaderBuilder.builder()
                .terminal(terminal)
                .build();
        prompt = ">>>";
        op1 = "TestChoice to A";
        op2 = "TestChoice to B";
        op3 = "TestChoice to C";
        optionMain.add(op1);
        optionMain.add(op2);
        optionMain.add(op3);
        System.out.println(optionMain);
    }
}
