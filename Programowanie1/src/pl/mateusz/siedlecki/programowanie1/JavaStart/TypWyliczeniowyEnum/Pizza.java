package pl.mateusz.siedlecki.programowanie1.JavaStart.TypWyliczeniowyEnum;

public enum Pizza {
    MARGHERITA(new String[]{"tomato sauce", "cheese"}), CAPRICIOSA(new String[]{"tomato sauce", "cheese", "mushrooms"}),
    PROSCIUTTO(new String[]{"tomato sauce", "cheese", "cham"});

    private final String[] ingredients;

    Pizza(String[] ingredients){
        this.ingredients = ingredients;
    }

    public String getIngredients(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.name());
        sb.append(", składniki: ");
        for (String ingredient: ingredients){
            sb.append(ingredient);
            sb.append(", ");
        }

        return String.valueOf(sb);
    }

}
