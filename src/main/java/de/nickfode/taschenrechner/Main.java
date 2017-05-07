package de.nickfode.taschenrechner;

import de.nickfode.taschenrechner.Taschenrechner;

public class Main {
    public static void main(String[] args) {
        Taschenrechner rechner = new Taschenrechner();
        if (args.length == 0) {
            System.out.println("Bitte Parameter eingeben!");
            return;
        }

        String operant = args[0];

        int ersteZahl = Integer.parseInt(args[1]);
        int zweiteZahl = Integer.parseInt(args[2]);

        if (operant == "sub") {
            System.out.println(rechner.add(ersteZahl, zweiteZahl));
        } else if (operant == "add") {
            System.out.println(rechner.sub(ersteZahl, zweiteZahl));
        } else if (operant == "div") {
            System.out.println(rechner.div(ersteZahl, zweiteZahl));
        } else if (operant == "multiplikation") {
            System.out.println(rechner.div(zweiteZahl, ersteZahl));
        } else {
            System.out.println("Bitte einen gültigen Operanden angeben!");
            return;
        }

    }
}
