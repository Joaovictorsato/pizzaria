// Interface base Pizza
interface Pizza {
    String getDescription();
    double getCost();
}

// Implementação básica de uma Pizza simples
class SimplePizza implements Pizza {
    @Override
    public String getDescription() {
        return "Massa básica";
    }

    @Override
    public double getCost() {
        return 5.00; // custo básico da massa
    }
}
