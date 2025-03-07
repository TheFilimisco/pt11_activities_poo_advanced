package part2.water.test;

import part2.water.model.Invoice;
import part2.water.model.LargeFamilyOneType;
import part2.water.model.LargeFamilyTwoType;
import part2.water.model.NormalClient;

public class TestWater {

    public static void main(String[] args) {
        Invoice normalClient = new NormalClient(10,20,30);
        Invoice clientLargeFamilyOneType = new LargeFamilyOneType(10f,15f, 22.5f);
        Invoice clientLargeFamilyTwoType = new LargeFamilyTwoType(10f,5f, 15f);

        // Show All Inovices
        normalClient.showInvoice();
        clientLargeFamilyOneType.showInvoice();
        clientLargeFamilyTwoType.showInvoice();

    }
}
