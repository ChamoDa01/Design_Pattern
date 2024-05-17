package Visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        InsuranceMessagingVisitor insuranceMessaging = new InsuranceMessagingVisitor();
        Client resident = new Resident("Ap1","01/23A, asf rd","0388483");
        Client bank = new Bank("BOC","01/23A, asf rd","06251187");

        List<Client> clients = new ArrayList<>();
        clients.add(bank);
        clients.add(resident);

        insuranceMessaging.sendInsuranceMail(clients);
    }
}
