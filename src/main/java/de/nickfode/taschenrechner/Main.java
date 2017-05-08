package de.nickfode.taschenrechner;

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

        if (operant.equals("sub")) {
            System.out.println(rechner.sub(ersteZahl, zweiteZahl));
        } else if (operant.equals("add")) {
            System.out.println(rechner.add(ersteZahl, zweiteZahl));
        } else if (operant.equals("div")) {
            System.out.println(rechner.div(ersteZahl, zweiteZahl));
        } else if (operant == "multiplication") {
            System.out.println(rechner.div(ersteZahl, zweiteZahl));
        } else {
            System.out.println("Bitte einen gültigen Operanden angeben!");
            return;
        }
    }
}
