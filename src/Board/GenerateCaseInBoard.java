package Board;

public class GenerateCaseInBoard implements Case {
    String cases = "";

    /**
     * Génère les cases dans le tableau
     */
    public String generateCaseInBoard() {
        int ramdom = 1 + (int) (Math.random() * ((5 - 1) + 1));

        switch (ramdom) {
            case 1:
                cases = caseEquipmentOffensive();
                break;
            case 2:
                cases = caseEquipmentDefensive();
                break;
            case 3:
                cases = caseHealth();
                break;
            case 4:
                cases = caseNothing();
                break;
            case 5:
                cases = caseMonster();
                break;
        }
        return cases;

    }

    @Override
    public String caseEquipmentDefensive() {
        return cases = "ED";
    }

    @Override
    public String caseEquipmentOffensive() {
        return cases = "EO";
    }

    @Override
    public String caseHealth() {
        return cases = "H";
    }

    @Override
    public String caseNothing() {
        return cases = "NO";
    }

    @Override
    public String caseMonster() {
        return cases = "M";
    }
}
